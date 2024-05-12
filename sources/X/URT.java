package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URT extends URR {
    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return "authorize_finish";
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        String str;
        C77211URz c77211URz = this.LIZIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", c77211URz.LJLIL.LJ.LIZ);
        c188727au.LJIIIZ("enter_method", c77211URz.LJLIL.LJ.LIZIZ);
        c188727au.LJIIIZ("previous_page", c77211URz.LJLIL.LJ.LIZJ);
        c188727au.LJIIIZ("platform", c77211URz.LJLIL.LIZLLL.LIZ.getStr());
        int i = C77187URb.LIZ[this.LIZIZ.LJLIL.LIZLLL.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                C77211URz c77211URz2 = this.LIZIZ;
                C77217USf c77217USf = c77211URz2.LJLILLLLZI.LJLIL;
                if (!c77217USf.LJLIL) {
                    OHI ohi = OHI.LIZ;
                    ActivityC45651qj LIZJ = URH.LIZJ(c77211URz2.LJLIL);
                    ohi.getClass();
                    if (OHI.LJI(LIZJ, "android.permission.READ_CONTACTS")) {
                        str = "guide";
                    } else {
                        str = "system";
                    }
                    c188727au.LJIIIZ("pop_up_type", str);
                    c188727au.LJIIIZ("auth_type", LJFF());
                    c188727au.LJIIIIZZ(LJ());
                    c188727au.LJIIIIZZ(LJI());
                    c188727au.LJIIIIZZ(LJII());
                    java.util.Map<String, String> map = c188727au.LIZ;
                    o.LJIIIIZZ(map, "authContext.run {\n      …     .builder()\n        }");
                    return map;
                }
                if (c77217USf.LJLILLLLZI) {
                    "wrong initStatus for auth pipeline".toString();
                    throw new IllegalStateException("wrong initStatus for auth pipeline");
                }
            } else {
                "wrong relationAuthPlatform".toString();
                throw new IllegalStateException("wrong relationAuthPlatform");
            }
        }
        str = "user";
        c188727au.LJIIIZ("pop_up_type", str);
        c188727au.LJIIIZ("auth_type", LJFF());
        c188727au.LJIIIIZZ(LJ());
        c188727au.LJIIIIZZ(LJI());
        c188727au.LJIIIIZZ(LJII());
        java.util.Map<String, String> map2 = c188727au.LIZ;
        o.LJIIIIZZ(map2, "authContext.run {\n      …     .builder()\n        }");
        return map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URT(C77211URz authContext) {
        super(authContext, null);
        o.LJIIIZ(authContext, "authContext");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URT(C77211URz authContext, Integer num) {
        super(authContext, num);
        o.LJIIIZ(authContext, "authContext");
    }
}
