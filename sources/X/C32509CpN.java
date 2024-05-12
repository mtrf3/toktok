package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CpN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32509CpN extends AbstractC60811Ntn {
    public final /* synthetic */ InterfaceC88472Yns<Long, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C32510CpO LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC88473Ynt<Long, Integer, String, C76800UCe> LJLJJLL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI.invoke(Long.valueOf(this.LJLJI));
        this.LJLJJI.setShowingUrl(this.LJLJJL);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        this.LJLJJLL.invoke(Long.valueOf(this.LJLJI), c60704Ns4.LIZ, c60704Ns4.LIZIZ);
        this.LJLJJI.setShowingUrl(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32509CpN(InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns, long j, C32510CpO c32510CpO, String str, InterfaceC88473Ynt<? super Long, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt) {
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = j;
        this.LJLJJI = c32510CpO;
        this.LJLJJL = str;
        this.LJLJJLL = interfaceC88473Ynt;
    }
}
