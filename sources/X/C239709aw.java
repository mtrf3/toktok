package X;

import Y.ACallableS107S0100000_4;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.9aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239709aw {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("social_relation_e164_format_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(repoName)");
        return repo;
    }

    public static final void LIZIZ(EnumC58085Mqv scene) {
        o.LJIIIZ(scene, "scene");
        if (((RBX) HG3.LJIILL()).isLogin()) {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ() && UPZ.LIZ.LIZJ()) {
                    C10K.LIZJ(new ACallableS107S0100000_4(scene, 10));
                }
            } catch (Exception unused) {
            }
        }
    }
}
