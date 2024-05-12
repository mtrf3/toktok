package X;

import Y.AfS66S0100000_14;
import Y.IDObjectS387S0100000_12;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQT implements IFetchEffectChannelListener {
    public final /* synthetic */ WQU LIZ;
    public final /* synthetic */ C73849Syb LIZIZ;

    public final void LIZ(EffectChannelResponse effectChannelResponse) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZJ = b1.LIZJ("viki filter, EffectPlatformFilterDataFetcher.requestEffectPlatform -> onSuccess", "effectAsyncOpen=");
        LIZJ.append(C84499XEh.LIZ);
        LIZJ.append(", PerformanceABGroup.enableEffectCallbackOpt=");
        C82894Wg6 c82894Wg6 = C82894Wg6.LIZIZ;
        LIZJ.append(c82894Wg6.LIZ());
        LIZLLL.d(X1D.LIZIZ(LIZJ));
        if (C84499XEh.LIZ || c82894Wg6.LIZ()) {
            AbstractC73638SvC.LJI(new WQV(this, effectChannelResponse)).LJJIIJ(T16.LIZIZ).LJIJJ(C73969T1h.LIZIZ()).LJJIFFI(new AfS66S0100000_14(this, 40));
            return;
        }
        this.LIZ.getClass();
        WQO LJIIIZ = WQU.LJIIIZ(effectChannelResponse);
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, EffectPlatformFilterDataFetcher.requestEffectPlatform -> onSuccess-> filterTable=");
        List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list = LJIIIZ.LJLIL.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst().getName());
        }
        sb.append(arrayList);
        sb.append(", filter.size=");
        sb.append(LJIIIZ.LJLIL.LJLIL.size());
        LIZLLL2.d(sb.toString());
        this.LIZIZ.onNext(LJIIIZ);
        this.LIZIZ.onComplete();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ.LIZJ.get();
        String str = this.LIZ.LIZLLL.get();
        o.LJIIIIZZ(str, "panelSupplier.get()");
        interfaceC84497XEf.LJJIJL(str, new IDObjectS387S0100000_12(this, 2));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        LIZ(effectChannelResponse);
    }

    public WQT(WQU wqu, C73849Syb c73849Syb) {
        this.LIZ = wqu;
        this.LIZIZ = c73849Syb;
    }
}
