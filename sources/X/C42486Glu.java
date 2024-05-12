package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Glu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42486Glu extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CommerceIBEService LJLIL;
    public final /* synthetic */ IBEInfo LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Aweme LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ EnumC59048NFk LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42486Glu(CommerceIBEService commerceIBEService, IBEInfo iBEInfo, Activity activity, int i, Aweme aweme, Integer num, EnumC59048NFk enumC59048NFk) {
        super(0);
        this.LJLIL = commerceIBEService;
        this.LJLILLLLZI = iBEInfo;
        this.LJLJI = activity;
        this.LJLJJI = i;
        this.LJLJJL = aweme;
        this.LJLJJLL = num;
        this.LJLJL = enumC59048NFk;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL(this.LJLILLLLZI, this.LJLJI, new C58628Mzg(this.LJLILLLLZI, new ETC(this.LJLJJI, this.LJLJJL.getAid(), this.LJLJJLL, this.LJLJL.getValue(), false, 16)), C58989NDd.LJLIL, C58990NDe.LJLIL);
        return C76800UCe.LIZ;
    }
}
