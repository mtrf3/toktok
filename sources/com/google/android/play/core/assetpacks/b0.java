package com.google.android.play.core.assetpacks;

import X.AbstractC40652FxQ;
import X.C16880lQ;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public final class b0 extends AbstractC40652FxQ {
    public final NavigableMap<Long, File> LJLIL = new TreeMap();

    public b0(File file, File file2) {
        ArrayList arrayList = (ArrayList) b2.LIZ(file, file2);
        if (arrayList.isEmpty()) {
            throw new m0(C16880lQ.LLLZ("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            File file3 = (File) it.next();
            ((TreeMap) this.LJLIL).put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    @Override // X.AbstractC40652FxQ
    public final long LIZ() {
        Map.Entry lastEntry = ((TreeMap) this.LJLIL).lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    @Override // X.AbstractC40652FxQ
    public final InputStream LIZIZ(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new m0(C16880lQ.LLLZ("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 > LIZ()) {
            throw new m0(C16880lQ.LLLZ("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(LIZ()), Long.valueOf(j3)}));
        }
        Long l = (Long) ((TreeMap) this.LJLIL).floorKey(Long.valueOf(j));
        Long l2 = (Long) ((TreeMap) this.LJLIL).floorKey(Long.valueOf(j3));
        if (l.equals(l2)) {
            return new a0(LIZJ(j, l), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZJ(j, l));
        Collection values = ((TreeMap) this.LJLIL).subMap(l, false, l2, false).values();
        if (!values.isEmpty()) {
            arrayList.add(new m1(Collections.enumeration(values)));
        }
        arrayList.add(new a0(new FileInputStream((File) ((TreeMap) this.LJLIL).get(l2)), j2 - (l2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final InputStream LIZJ(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) ((TreeMap) this.LJLIL).get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new m0(C16880lQ.LLLZ("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
