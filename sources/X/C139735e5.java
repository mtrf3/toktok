package X;

import Y.ACallableS105S0100000_2;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139735e5 {
    public final InterfaceC139745e6<InterfaceC84497XEf> LIZ;
    public final InterfaceC139745e6<String> LIZIZ;

    public C139735e5(InterfaceC139745e6<InterfaceC84497XEf> interfaceC139745e6, InterfaceC139745e6<String> interfaceC139745e62) {
        this.LIZ = interfaceC139745e6;
        this.LIZIZ = interfaceC139745e62;
    }

    public final void LIZ(final InterfaceC88472Yns<? super List<? extends Effect>, C76800UCe> interfaceC88472Yns, final InterfaceC88472Yns<? super ExceptionResult, C76800UCe> onFailCallback) {
        o.LJIIIZ(onFailCallback, "onFailCallback");
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ.get();
        String str = this.LIZIZ.get();
        o.LJIIIIZZ(str, "panelSupplier.get()");
        interfaceC84497XEf.LJJJJLI(str, true, false, new IFetchEffectChannelListener() { // from class: X.5ZM
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C82891Wg3.LIZLLL().d("viki filter, EPFilterCacheDataFetcher.requestFromCache -> onFail");
                onFailCallback.invoke(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C82891Wg3.LIZLLL().d("viki filter, EPFilterCacheDataFetcher.requestFromCache -> onSuccess");
                AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(effectChannelResponse, (EffectChannelResponse) interfaceC88472Yns, (InterfaceC88472Yns<? super List<? extends Effect>, C76800UCe>) 11);
                if (C52510KjC.LIZ()) {
                    C10K.LIZJ(new ACallableS105S0100000_2(aqS149S0200000_2, 38));
                } else {
                    aqS149S0200000_2.invoke();
                }
            }
        });
    }
}
