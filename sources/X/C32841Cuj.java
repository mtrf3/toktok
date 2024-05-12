package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideShowTimes;
import kotlin.jvm.internal.o;

/* renamed from: X.Cuj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32841Cuj implements InterfaceC32497CpB {
    public final /* synthetic */ LiveGiftGuideWidgetV2 LJLIL;

    public C32841Cuj(LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2) {
        this.LJLIL = liveGiftGuideWidgetV2;
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
        if (t instanceof C53759L7z) {
            this.LJLIL.LJLJJLL.LIZ(C73943T0h.LIZ().LIZJ(this.LJLIL, C77446UaQ.class).LIZIZ(new AfS65S0100000_13(this.LJLIL, 169)));
        }
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        this.LJLIL.LJZ().LJLJLJ.LJLILLLLZI = LiveRechargeGiftGuideShowTimes.INSTANCE.getValue();
    }
}
