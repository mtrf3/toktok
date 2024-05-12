package Y;

import X.A8R;
import X.C2318698c;
import X.C25770A9m;
import X.C264612c;
import X.C7MY;
import X.O6R;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardMineComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AUListenerS8S0102000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS8S0102000_4 aUListenerS8S0102000_4, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = ((A8R) aUListenerS8S0102000_4.l0).LIZ(R.id.a44).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * aUListenerS8S0102000_4.i1);
        if (((A8R) aUListenerS8S0102000_4.l0).LIZ(R.id.a22).getMeasuredWidth() < aUListenerS8S0102000_4.i2) {
            layoutParams.width = (int) Math.ceil((CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * (aUListenerS8S0102000_4.i2 - ((A8R) aUListenerS8S0102000_4.l0).LIZ(R.id.a22).getMeasuredWidth())) + ((A8R) aUListenerS8S0102000_4.l0).LIZ(R.id.a22).getMeasuredWidth());
        }
        ((A8R) aUListenerS8S0102000_4.l0).LIZ(R.id.a44).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS8S0102000_4 aUListenerS8S0102000_4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C25770A9m A3 = ((HeaderRecommendUserCardMineComponent) aUListenerS8S0102000_4.l0).A3();
        ViewGroup.LayoutParams layoutParams = A3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) (C7MY.LIZIZ(LiveCoverMinSizeSetting.DEFAULT) * floatValue);
            A3.setLayoutParams(layoutParams);
            if (!C2318698c.LIZIZ()) {
                float f = 1 - floatValue;
                ((HeaderRecommendUserCardMineComponent) aUListenerS8S0102000_4.l0).F3((int) (aUListenerS8S0102000_4.i1 * f));
                ((HeaderRecommendUserCardMineComponent) aUListenerS8S0102000_4.l0).C3((int) (aUListenerS8S0102000_4.i2 * f));
                ((HeaderRecommendUserCardMineComponent) aUListenerS8S0102000_4.l0).E3(f);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public AUListenerS8S0102000_4(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
