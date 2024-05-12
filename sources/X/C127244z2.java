package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.4z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127244z2 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C126844yO LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C127244z2(C126844yO c126844yO, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, String str2, int i) {
        super(0);
        this.LJLIL = c126844yO;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = str2;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        A90 LJII = this.LJLIL.LJII();
        if (LJII != null) {
            LJII.dismiss();
        }
        String str = this.LJLILLLLZI;
        if (str != null) {
            int i = this.LJLJJL;
            C126844yO c126844yO = this.LJLIL;
            if (i == C172446pk.LJII.LIZ) {
                C26045AKb c26045AKb = new C26045AKb(c126844yO.LIZLLL);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
            } else {
                C26045AKb c26045AKb2 = new C26045AKb(c126844yO.LIZLLL);
                c26045AKb2.LJIIIIZZ(R.string.flv);
                c26045AKb2.LIZLLL(3000L);
                c26045AKb2.LJIIJ();
            }
        }
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
