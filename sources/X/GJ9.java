package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes8.dex */
public final class GJ9 implements InterfaceC36621EYv<InfoModel> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ AwemeRawAd LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<InfoModel> interfaceC37276Ek4, Throwable th) {
        GJB.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, 1, null).show();
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<InfoModel> interfaceC37276Ek4, C64797Pbt<InfoModel> c64797Pbt) {
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            GJB.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, 2, c64797Pbt.LIZIZ).show();
        } else {
            GJB.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, 1, null).show();
        }
    }

    public GJ9(ActivityC45651qj activityC45651qj, AwemeRawAd awemeRawAd, String str) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = awemeRawAd;
        this.LJLJI = str;
    }
}
