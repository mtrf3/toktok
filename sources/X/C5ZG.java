package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* renamed from: X.5ZG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZG {
    public static final OSZ<Float, Float> LIZ = new OSZ<>(Float.valueOf(0.25f), Float.valueOf(0.35f));
    public static final OSZ<Float, Float> LIZIZ = new OSZ<>(Float.valueOf(0.75f), Float.valueOf(0.65f));

    public static Object LIZ(final InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        TN4.LIZ().LJJJJLI("profilephoto", false, false, new IFetchEffectChannelListener() { // from class: X.5ZH
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<List<? extends OSZ<C121514pn, ? extends Effect>>> interfaceC67352kd2 = c84654XKg;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                C3C5.m7constructorimpl(c61878OQg);
                interfaceC67352kd2.resumeWith(c61878OQg);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                XKX.LIZLLL(InterfaceC70422pa.this, null, null, new C5ZI(effectChannelResponse, c84654XKg, null), 3);
            }
        });
        return c84654XKg.LIZ();
    }
}
