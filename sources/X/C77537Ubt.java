package X;

import Y.IDhS106S0100000_13;
import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFallbackSetting;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ubt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77537Ubt implements InterfaceC77540Ubw {
    public C77536Ubs LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final AbstractC73672Svk<C77536Ubs> LIZ() {
        if (LiveWalletFallbackSetting.INSTANCE.getExchangeKycFallback()) {
            return AbstractC73672Svk.LJJIJIL(new C77536Ubs());
        }
        C77536Ubs c77536Ubs = this.LIZ;
        if (c77536Ubs != null) {
            return AbstractC73672Svk.LJJIJIL(c77536Ubs);
        }
        return new C73615Sup(((IExchangeApi) Q7L.LIZIZ(IExchangeApi.class)).checkExchangeKyc(this.LIZIZ).LJJLIIIJJI(15L, TimeUnit.SECONDS).LJJIJL(new IDhS106S0100000_13(this, 16)), new IDhS106S0100000_13(this, 17), false);
    }
}
