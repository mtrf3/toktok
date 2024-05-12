package X;

import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS38S0100100_9;
import kotlin.jvm.internal.o;

/* renamed from: X.M2k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56162M2k extends AbstractC60811Ntn {
    public boolean LJLILLLLZI;
    public final /* synthetic */ C199617sT LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLJI.LIZ;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJI(true);
        }
        this.LJLJI.LIZ = null;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLJI.LIZ = view;
        if (!this.LJLILLLLZI) {
            this.LJLJJL.invoke();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        this.LJLILLLLZI = true;
        this.LJLJJLL.invoke();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLILLLLZI = false;
        this.LJLJJI.invoke();
    }

    public C56162M2k(C199617sT c199617sT, AqS159S0100000_9 aqS159S0100000_9, AqS38S0100100_9 aqS38S0100100_9, AqS159S0100000_9 aqS159S0100000_92) {
        this.LJLJI = c199617sT;
        this.LJLJJI = aqS159S0100000_9;
        this.LJLJJL = aqS38S0100100_9;
        this.LJLJJLL = aqS159S0100000_92;
    }
}
