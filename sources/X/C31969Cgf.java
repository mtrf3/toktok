package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Cgf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31969Cgf extends LynxViewClient {
    public final /* synthetic */ C31968Cge LIZ;
    public final /* synthetic */ String LIZIZ = "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/ug_onboarding_content_language/main/template.js";

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        this.LIZ.LIZJ = Boolean.TRUE;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "new_user_journey");
        c188727au.LJIIIZ("url", this.LIZIZ);
        FMX.LJIIL("lynx_content_language_finished_loading_url", c188727au.LIZ);
    }

    public C31969Cgf(C31968Cge c31968Cge) {
        this.LIZ = c31968Cge;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        this.LIZ.LIZJ = Boolean.FALSE;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "new_user_journey");
        c188727au.LJFF(Integer.valueOf(lynxError.LIZ), "error_code");
        String lynxError2 = lynxError.toString();
        if (lynxError2 == null) {
            lynxError2 = "unknown";
        }
        c188727au.LJIIIZ("error_desc", lynxError2);
        c188727au.LJIIIZ("url", this.LIZIZ);
        FMX.LJIIL("lynx_content_language_failed_loading_url", c188727au.LIZ);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJ(LynxError lynxError) {
        this.LIZ.LIZJ = Boolean.FALSE;
        C31968Cge.LIZ(lynxError);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJLI(LynxError lynxError) {
        this.LIZ.LIZJ = Boolean.FALSE;
        C31968Cge.LIZ(lynxError);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIL(LynxError lynxError) {
        this.LIZ.LIZJ = Boolean.FALSE;
        C31968Cge.LIZ(lynxError);
    }
}
