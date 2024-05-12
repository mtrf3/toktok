package X;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06140Ly {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static String LIZIZ = "";
    public static boolean LIZJ = true;

    public static String LIZIZ() {
        String sb;
        if (LIZJ) {
            try {
                HashSet<String> hashSet = LIZ;
                if (hashSet == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = hashSet.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        String next = it.next();
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(",");
                        }
                        sb2.append(next.toString());
                    }
                    sb = sb2.toString();
                }
                LIZIZ = sb;
                LIZJ = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return LIZIZ;
    }

    public static void LIZ(String str) {
        LIZJ = true;
        LIZ.add(str);
    }

    public static void LIZJ(String str) {
        LIZJ = true;
        LIZ.remove(str);
    }
}
