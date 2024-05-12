package X;

import com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonFragment;

/* loaded from: classes8.dex */
public final class GIK extends GIJ {
    @Override // X.GIJ
    public final String LIZJ() {
        return "general_anti_bullying_page";
    }

    @Override // X.GIJ
    public final void LIZLLL() {
        C188727au c188727au = new C188727au();
        LJI(c188727au);
        LIZIZ(c188727au);
        FMX.LJIIL("comment_general_anti_bullying_protection_page_show", c188727au.LIZ);
    }

    @Override // X.GIJ
    public final void LJ() {
        C188727au c188727au = new C188727au();
        LIZ(c188727au);
        LJI(c188727au);
        c188727au.LIZLLL(this.LIZIZ ? 1 : 0, "is_saved");
        LIZIZ(c188727au);
        FMX.LJIIL("comment_general_anti_bullying_protection_page_back_click", c188727au.LIZ);
    }

    @Override // X.GIJ
    public final void LJFF() {
        C188727au c188727au = new C188727au();
        LIZ(c188727au);
        LJI(c188727au);
        FMX.LJIIL("comment_general_anti_bullying_protection_page_save_click", c188727au.LIZ);
    }

    public GIK(AntiBullyingCommonFragment antiBullyingCommonFragment) {
        super(antiBullyingCommonFragment);
    }
}
