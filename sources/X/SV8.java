package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.dsp.common.model.DspActionStruct;
import com.ss.android.ugc.aweme.dsp.common.utils.ReportQueueManager;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import kotlin.jvm.internal.AqS34S1300000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SV8<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ TTMStoreLink LJLIL;
    public final /* synthetic */ String LJLILLLLZI = null;
    public final /* synthetic */ SVG LJLJI;
    public final /* synthetic */ SVA LJLJJI;

    public SV8(TTMStoreLink tTMStoreLink, SVG svg, SVA sva) {
        this.LJLIL = tTMStoreLink;
        this.LJLJI = svg;
        this.LJLJJI = sva;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        AqS34S1300000_12 aqS34S1300000_12 = new AqS34S1300000_12(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 1);
        DspActionStruct dspActionStruct = new DspActionStruct();
        aqS34S1300000_12.invoke(dspActionStruct);
        ReportQueueManager reportQueueManager = ReportQueueManager.INSTANCE;
        String json = GsonProtectorUtils.toJson(SVF.LIZ, dspActionStruct);
        o.LJIIIIZZ(json, "gson.toJson(struct)");
        reportQueueManager.enqueue(json);
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }
}
