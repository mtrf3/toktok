package X;

import android.system.Os;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64882ge {
    public static List LIZ(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return C61878OQg.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file3 = (File) it.next();
                if (file3.exists()) {
                    try {
                        String link = Os.readlink(file3.getPath());
                        o.LJFF(link, "link");
                        linkedHashSet.add(link);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        return ORZ.LLJI(linkedHashSet);
    }
}
