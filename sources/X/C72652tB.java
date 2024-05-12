package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72652tB extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC72642tA<C50420Jqa> LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72652tB(InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Aweme aweme, String str, String str2, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = interfaceC72642tA;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LJLIL;
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(2, this.LJLILLLLZI));
        }
        C227738wj.LJ(true, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, false, 96);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }
}
