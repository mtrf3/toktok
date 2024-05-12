package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64912gh {
    public static boolean LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C64932gj.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C64922gi.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C64002fE.LJLIL);

    public static C63972fB LIZIZ() {
        return (C63972fB) LIZLLL.getValue();
    }

    public static User LIZ(String uid) {
        Object obj;
        o.LJIIIZ(uid, "uid");
        Iterator it = ((List) LIZJ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((User) obj).getUid(), uid)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (User) obj;
    }

    public static File LIZJ(String str) {
        if (!LIZ) {
            LIZ = true;
            File LLIIIL = C16880lQ.LLIIIL(EF7.LIZIZ());
            if (LLIIIL != null && LLIIIL.exists()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LLIIIL.getPath());
                String str2 = File.separator;
                File[] listFiles = new File(JBR.LJFF(LIZ2, str2, "aweme_publish", LIZ2)).listFiles();
                if (listFiles != null) {
                    AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                    XKX.LIZLLL(C48841JEv.LIZ(abstractC78621UtN), null, null, new C64902gg(listFiles, null), 3);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LLIIIL.getPath());
                    LIZ3.append(str2);
                    LIZ3.append("aweme_popular");
                    File[] listFiles2 = new File(X1D.LIZIZ(LIZ3)).listFiles();
                    if (listFiles2 != null) {
                        XKX.LIZLLL(C48841JEv.LIZ(abstractC78621UtN), null, null, new C64892gf(listFiles2, null), 3);
                    }
                }
            }
        }
        C63972fB LIZIZ2 = LIZIZ();
        if (str == null) {
            LIZIZ2.getClass();
            return null;
        }
        String str3 = LIZIZ2.LIZIZ().get(str);
        if (str3 == null) {
            return null;
        }
        LIZIZ2.LIZIZ().remove(str);
        LIZIZ2.LIZIZ().put(str, str3);
        return new File(str3);
    }
}
