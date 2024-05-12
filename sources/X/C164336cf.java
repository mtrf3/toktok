package X;

import com.ss.android.ugc.aweme.effect.CallbackAPI;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.6cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164336cf {
    public static final void LIZ(ProviderEffect providerEffect) {
        o.LJIIIZ(providerEffect, "<this>");
        String clickUrl = providerEffect.getClickUrl();
        if (clickUrl != null) {
            ((CallbackAPI) C60903NvH.LJIIJJI().getNetworkService().retrofitCreate(clickUrl, CallbackAPI.class)).sendCallback(clickUrl).LJJL(T16.LIZ()).LJJJLL(new InterfaceC64592gB() { // from class: X.6cg
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.6cd
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    H78.LIZLLL("ProviderEffect", th);
                    C6BK c6bk = new C6BK();
                    c6bk.LIZ.put("errorMsg", android.util.Log.getStackTraceString(th));
                    C43882HKc.LIZLLL(1, "effect_provider_notify_dealer_error_rate", c6bk.LJ(), true);
                }
            }, new InterfaceC29937Boz() { // from class: X.6ce
                @Override // X.InterfaceC29937Boz
                public final void run() {
                    C43882HKc.LIZLLL(0, "effect_provider_notify_dealer_error_rate", null, true);
                }
            });
        }
    }
}
