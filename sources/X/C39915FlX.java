package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.FlX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39915FlX extends AbstractC60811Ntn {
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC88471Ynr<InterfaceC60761Nsz, String, C76800UCe> LJLJI;
    public final InterfaceC88472Yns<InterfaceC60761Nsz, C76800UCe> LJLJJI;
    public final InterfaceC88473Ynt<InterfaceC60761Nsz, String, C60704Ns4, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<SparkContext, C76800UCe> LJLJJLL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        this.LJLILLLLZI.invoke();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLJJI.invoke(view);
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        InterfaceC88472Yns<SparkContext, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(sparkContext);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLJI.invoke(view, url);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        this.LJLJJL.invoke(view, url, c60704Ns4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39915FlX(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC60761Nsz, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super InterfaceC60761Nsz, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super InterfaceC60761Nsz, ? super String, ? super C60704Ns4, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns2) {
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = interfaceC88472Yns2;
    }
}
