package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.NrW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60670NrW extends AbstractC60800Ntc {
    public final /* synthetic */ AdSparkHybridContext LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJL();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJLL();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public C60670NrW(AdSparkHybridContext adSparkHybridContext) {
        this.LJLIL = adSparkHybridContext;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJ(view);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJLI(interfaceC60761Nsz);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJZ(kitType);
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJZI(sparkContext);
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJLIIL(sparkContext);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJ(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJL(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJI(view, url, str);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        Iterator<AbstractC60800Ntc> it = this.LJLIL.loadCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LJJJJIZL(view, url, c60704Ns4);
        }
    }
}
