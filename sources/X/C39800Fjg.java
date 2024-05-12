package X;

import com.ss.android.ugc.aweme.qrcode.model.RiskUrl;
import kotlin.jvm.internal.o;

/* renamed from: X.Fjg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39800Fjg implements InterfaceC62167OaZ {
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC62167OaZ
    public final void LIZJ(RiskUrl riskUrl) {
        o.LJIIIZ(riskUrl, "riskUrl");
        int i = riskUrl.risk;
        if (i != 0) {
            if (i != 3 && i != 5 && i != 9 && i != 11) {
                String LIZ = C39794Fja.LIZ(this.LJLILLLLZI, riskUrl.riskHostUrl);
                o.LJIIIIZZ(LIZ, "buildSecurityUrl(url, ri…elper.ISceneType.QR_CODE)");
                this.LJLIL.invoke(LIZ, this.LJLJI);
                return;
            } else {
                String LIZ2 = C39794Fja.LIZ(this.LJLILLLLZI, riskUrl.riskHostUrl);
                o.LJIIIIZZ(LIZ2, "buildSecurityUrl(url, ri…elper.ISceneType.QR_CODE)");
                this.LJLIL.invoke(LIZ2, this.LJLJI);
                return;
            }
        }
        this.LJLIL.invoke(this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC62167OaZ
    public final void LJIJI(Exception e) {
        o.LJIIIZ(e, "e");
        C16880lQ.LLLLIIL(e);
        this.LJLIL.invoke(this.LJLILLLLZI, this.LJLJI);
    }

    public C39800Fjg(String str, String str2, C38960FQu c38960FQu) {
        this.LJLIL = c38960FQu;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
