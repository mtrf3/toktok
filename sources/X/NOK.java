package X;

import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;

/* loaded from: classes11.dex */
public final class NOK extends AbstractC65781Prl implements InterfaceC65784Pro<Object> {
    public final /* synthetic */ NWF LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ AdPopUpWebPageHelper LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLLI = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOK(NWF nwf, ActivityC45651qj activityC45651qj, AdPopUpWebPageHelper adPopUpWebPageHelper, String str, String str2, String str3, boolean z, String str4, int i, boolean z2) {
        super(0);
        this.LJLIL = nwf;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = adPopUpWebPageHelper;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = z;
        this.LJLJLJ = str4;
        this.LJLJLLL = i;
        this.LJLL = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        return Boolean.valueOf(this.LJLIL.post(new NOI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI)));
    }
}
