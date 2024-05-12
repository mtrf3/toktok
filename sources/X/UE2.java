package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicGiftSwitcherSetting;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final /* synthetic */ class UE2 extends TBS implements InterfaceC88472Yns<Long, C76800UCe> {
    public UE2(Object obj) {
        super(1, obj, C76846UDy.class, "handleStopFlyMicGiftEvent", "handleStopFlyMicGiftEvent(J)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        long longValue = l.longValue();
        C76846UDy c76846UDy = (C76846UDy) this.receiver;
        c76846UDy.getClass();
        if (MultiGuestFlyMicGiftSwitcherSetting.INSTANCE.isEnable() && c76846UDy.LIZIZ.LJJIL().compareTo(EnumC75419Tip.StateJoined) >= 0 && o.LJ(C74947TbD.LJJIFFI(Long.valueOf(longValue)), c76846UDy.LIZIZ.LJJ())) {
            AnimatedDrawable2 animatedDrawable2 = c76846UDy.LJIIJ;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
            }
            AnimatedDrawable2 animatedDrawable22 = c76846UDy.LJIIJJI;
            if (animatedDrawable22 != null) {
                animatedDrawable22.stop();
            }
        }
        return C76800UCe.LIZ;
    }
}
