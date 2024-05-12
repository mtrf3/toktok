package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.CCn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30945CCn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ SubscribeTimeStickerWidget LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C30945CCn(long j, SubscribeTimeStickerWidget subscribeTimeStickerWidget, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = subscribeTimeStickerWidget;
        this.LJLJI = j2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        float f3 = (float) (this.LJLIL - 3);
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        long j = f3 * f;
        U2I u2i = this.LJLILLLLZI.LJLLLL;
        if (u2i != null) {
            u2i.LIZ(this.LJLJI + j, false);
        }
        C8I2 c8i2 = this.LJLILLLLZI.LJLLL;
        if (c8i2 != null) {
            c8i2.setRemainTime(this.LJLJI + j);
        }
    }
}
