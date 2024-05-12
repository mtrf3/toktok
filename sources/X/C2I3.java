package X;

import android.animation.Animator;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicGiftSwitcherSetting;

/* renamed from: X.2I3, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I3 extends TBS implements InterfaceC88472Yns<Long, C76800UCe> {
    public C2I3(C14520hc c14520hc) {
        super(1, c14520hc, C14520hc.class, "handleStopFlyMicGiftEvent", "handleStopFlyMicGiftEvent(J)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        long longValue = l.longValue();
        C14520hc c14520hc = (C14520hc) this.receiver;
        c14520hc.getClass();
        if (MultiGuestFlyMicGiftSwitcherSetting.INSTANCE.isEnable() && (longValue == -1 || longValue == c14520hc.LJIIIIZZ)) {
            Animator animator = c14520hc.LJII;
            if (animator != null) {
                animator.cancel();
            }
            c14520hc.LJII = null;
        }
        return C76800UCe.LIZ;
    }
}
