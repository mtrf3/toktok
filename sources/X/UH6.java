package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UH6 extends AbstractC60811Ntn {
    public final /* synthetic */ UH9 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI.onSuccess();
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "match_x_show_result", this.LJLJI, C770830u.LIZLLL("stage", 0), null, C65232Piu.LIZJ("message", "success"), null, 0);
    }

    public UH6(UH9 uh9, String str) {
        this.LJLILLLLZI = uh9;
        this.LJLJI = str;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        this.LJLILLLLZI.LIZ(url, c60704Ns4);
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "match_x_show_result", this.LJLJI, C770830u.LIZLLL("stage", 1), null, C65232Piu.LIZJ("message", "load failed"), null, 0);
    }
}
