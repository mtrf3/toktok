package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.PtN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65881PtN extends C64634PYg<Boolean> {
    public final Request LJ;

    @Override // X.C64634PYg, X.InterfaceC64633PYf
    public final Object LIZ() {
        if (this.LJ.getUrl().contains("/passport/user/check_email_registered") || this.LJ.getUrl().contains("/passport/email/register/v2/")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", HG3.LJIIIIZZ().getLoginMobEnterMethod());
            c188727au.LJIIIZ("status", "1");
            FMX.LJIIL("slide_verification_response", c188727au.LIZ);
        }
        return Boolean.TRUE;
    }

    @Override // X.C64634PYg, X.InterfaceC64633PYf
    public final Object LIZIZ() {
        if (this.LJ.getUrl().contains("/passport/user/check_email_registered") || this.LJ.getUrl().contains("/passport/email/register/v2/")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", HG3.LJIIIIZZ().getLoginMobEnterMethod());
            c188727au.LJIIIZ("status", "2");
            FMX.LJIIL("slide_verification_response", c188727au.LIZ);
        }
        return Boolean.FALSE;
    }

    public C65881PtN(Request request) {
        this.LJ = request;
    }
}
