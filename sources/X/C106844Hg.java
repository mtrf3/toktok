package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106844Hg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("action ");
            LIZ2.append(str);
            C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ2));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZIZ(String str, List list, Throwable th) {
        C76800UCe c76800UCe;
        int i;
        try {
            if (th == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("query response ");
                LIZ2.append(str);
                LIZ2.append(" size ");
                if (list == null) {
                    i = 0;
                } else {
                    i = list.size();
                }
                LIZ2.append(i);
                C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ2));
                if (list != null) {
                    for (List list2 : ORZ.LJLILLLLZI(list, 15)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("query response ");
                        LIZ3.append(str);
                        LIZ3.append(' ');
                        LIZ3.append(list2);
                        C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ3));
                    }
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("query response ");
                LIZ4.append(str);
                LIZ4.append(' ');
                LIZ4.append(th.getMessage());
                LIZ4.append(' ');
                LIZ4.append(th.getCause());
                C34B.LIZJ("ActivityStatusLogUtils", X1D.LIZIZ(LIZ4));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    public static void LIZJ(String scene, String str, Throwable th, boolean z) {
        o.LJIIIZ(scene, "scene");
        String str2 = "active";
        try {
            if (th == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("report ");
                LIZ2.append(scene);
                LIZ2.append(' ');
                LIZ2.append(str);
                LIZ2.append(' ');
                if (!z) {
                    str2 = "inactive";
                }
                LIZ2.append(str2);
                C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ2));
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("report ");
                LIZ3.append(scene);
                LIZ3.append(' ');
                LIZ3.append(str);
                LIZ3.append(' ');
                if (!z) {
                    str2 = "inactive";
                }
                LIZ3.append(str2);
                LIZ3.append(' ');
                LIZ3.append(th.getMessage());
                LIZ3.append(' ');
                LIZ3.append(th.getCause());
                C34B.LIZJ("ActivityStatusLogUtils", X1D.LIZIZ(LIZ3));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }
}
