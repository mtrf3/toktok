package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URS extends URR {
    public final boolean LJ;
    public final Boolean LJFF;

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return "authorize_fail_after_allow";
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
        C77217USf c77217USf = this.LIZIZ.LJLILLLLZI.LJLIL;
        if (!c77217USf.LJLIL) {
            str = "system";
        } else if (!c77217USf.LJLILLLLZI) {
            str = "user";
        } else {
            "wrong initStatus for auth pipeline".toString();
            throw new IllegalStateException("wrong initStatus for auth pipeline");
        }
        c188727au.LJIIIZ("pop_up_type", str);
        c188727au.LJIIIZ("auth_type", LJFF());
        c188727au.LJFF(Boolean.valueOf(this.LJ), "has_uid_errorcode");
        c188727au.LJIIIIZZ(LJ());
        c188727au.LJIIIIZZ(LJI());
        c188727au.LJIIIIZZ(LJII());
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "authContext.run {\n      …     .builder()\n        }");
        return map;
    }

    @Override // X.URR
    public final java.util.Map<String, String> LJ() {
        String LIZJ;
        String str;
        String str2 = null;
        if (this.LIZIZ.LJLIL.LIZLLL.LIZ != EnumC77147UPn.FACEBOOK) {
            return null;
        }
        C188727au c188727au = new C188727au();
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        if (c77266UUc.LJIIJ().LJI(((RBX) HG3.LJIILL()).getCurUserId()).length() == 0) {
            LIZJ = AbstractC238349Xa.LIZJ(false);
        } else {
            LIZJ = AbstractC238349Xa.LIZJ(true);
        }
        c188727au.LJIIIZ("has_token", LIZJ);
        Boolean LJIIL = c77266UUc.LJIIJ().LJIIL(((RBX) HG3.LJIILL()).getCurUserId());
        if (LJIIL != null) {
            str = AbstractC238349Xa.LIZJ(LJIIL.booleanValue());
        } else {
            str = null;
        }
        c188727au.LJIIIZ("fb_token_expired", str);
        c188727au.LJFF(this.LIZJ, "server_fb_token");
        Boolean bool = this.LJFF;
        if (bool != null) {
            str2 = AbstractC238349Xa.LIZJ(bool.booleanValue());
        }
        c188727au.LJIIIZ("has_fbsdk_errorcode", str2);
        return c188727au.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ URS(X.C77211URz r3, java.lang.Integer r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto Lf
            r0 = 0
        Lb:
            r2.<init>(r3, r4, r0, r1)
            return
        Lf:
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.URS.<init>(X.URz, java.lang.Integer, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URS(C77211URz authContext, Integer num, boolean z, Boolean bool) {
        super(authContext, num);
        o.LJIIIZ(authContext, "authContext");
        this.LJ = z;
        this.LJFF = bool;
    }
}
