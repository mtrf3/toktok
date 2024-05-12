package X;

import Y.ARunnableS37S0100000_1;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ixk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48316Ixk implements Runnable {
    public final /* synthetic */ C48317Ixl LJLIL;

    public RunnableC48316Ixk(C48317Ixl c48317Ixl) {
        this.LJLIL = c48317Ixl;
    }

    public final void LIZ() {
        long j;
        C48317Ixl c48317Ixl = this.LJLIL;
        long j2 = c48317Ixl.LIZIZ;
        HashSet hashSet = new HashSet();
        c48317Ixl.LJII.lock();
        try {
            Iterator<Map.Entry<String, C48321Ixp>> it = c48317Ixl.LJ.entrySet().iterator();
            j = 0;
            while (it.hasNext()) {
                j += it.next().getValue().LIZ.length();
            }
        } catch (Throwable unused) {
        }
        if (j <= j2) {
            c48317Ixl.LJII.unlock();
            return;
        }
        long j3 = ((float) j2) * c48317Ixl.LJIIIIZZ;
        HashSet hashSet2 = new HashSet();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDiskLruCache whiteMusicFilePathList: ");
        LIZ.append(c48317Ixl.LIZJ);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        for (Map.Entry<String, C48321Ixp> entry : c48317Ixl.LJ.entrySet()) {
            String key = entry.getKey();
            C48321Ixp value = entry.getValue();
            if (value.LIZ.exists()) {
                if (!c48317Ixl.LIZJ.contains(value.LIZ.getPath())) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("MusicDiskLruCache music cache file: ");
                    LIZ2.append(value.LIZ.getName());
                    LIZ2.append(" add -tmp");
                    H7B.LIZ(X1D.LIZIZ(LIZ2));
                    long length = value.LIZ.length();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(value.LIZ.getAbsolutePath());
                    LIZ3.append("-tmp");
                    File file = new File(X1D.LIZIZ(LIZ3));
                    if (value.LIZ.renameTo(file)) {
                        hashSet.add(file);
                        j -= length;
                        hashSet2.add(key);
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("MusicDiskLruCache music cache file: ");
                    LIZ4.append(value.LIZ.getName());
                    LIZ4.append(" in  whiteMusicFilePathList");
                    H7B.LIZ(X1D.LIZIZ(LIZ4));
                }
            }
            if (j <= j3) {
                break;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c48317Ixl.LJ.remove((String) it2.next());
        }
        c48317Ixl.LJII.unlock();
        c48317Ixl.LIZLLL.execute(new ARunnableS37S0100000_1(hashSet, 106));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
