package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideShowTimes;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2$onGuideSend$1$1", f = "LiveGiftGuideWidgetV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cun, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32845Cun extends AbstractC65782Prm implements InterfaceC88471Ynr<UV5, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ LiveGiftGuideWidgetV2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32845Cun(LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, InterfaceC67352kd<? super C32845Cun> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveGiftGuideWidgetV2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C32845Cun c32845Cun = new C32845Cun(this.LJLILLLLZI, interfaceC67352kd);
        c32845Cun.LJLIL = obj;
        return c32845Cun;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        UV5 uv5 = (UV5) this.LJLIL;
        if (LiveRechargeGiftGuideSetting.INSTANCE.getValue()) {
            if ((uv5 instanceof UV6) && (((UV6) uv5).LIZJ instanceof C88561YpJ)) {
                this.LJLILLLLZI.LJLJJLL.LIZ(C73943T0h.LIZ().LIZJ(this.LJLILLLLZI, C77446UaQ.class).LIZIZ(new AfS65S0100000_13(this.LJLILLLLZI, 168)));
            }
            if (uv5 instanceof UV3) {
                this.LJLILLLLZI.LJZ().LJLJLJ.LJLILLLLZI = LiveRechargeGiftGuideShowTimes.INSTANCE.getValue();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(UV5 uv5, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(uv5, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
