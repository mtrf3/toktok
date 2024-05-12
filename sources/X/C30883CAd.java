package X;

import Y.IDAListenerS232S0100000_5;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CAd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30883CAd {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(View view, String animation, boolean z) {
        int i;
        o.LJIIIZ(animation, "animation");
        if (view == null) {
            return;
        }
        int hashCode = animation.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != 3387192) {
                if (hashCode != 108511772 || !animation.equals("right")) {
                    return;
                }
                i = R.anim.h7;
                if (!z && CCJ.LIZ(view.getContext())) {
                    i = R.anim.h9;
                }
            } else {
                animation.equals(LiveGiftNewGifterBadgeSetting.DEFAULT);
                return;
            }
        } else if (!animation.equals("bottom")) {
            return;
        } else {
            i = R.anim.h5;
        }
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i));
    }

    public static final void LIZIZ(View view, String animation, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i;
        o.LJIIIZ(animation, "animation");
        if (view == null || view.getAnimation() != null) {
            return;
        }
        int hashCode = animation.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != 3387192) {
                if (hashCode == 108511772 && animation.equals("right")) {
                    if (z || !CCJ.LIZ(view.getContext())) {
                        i = R.anim.hb;
                    } else {
                        i = R.anim.h_;
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), i);
                    loadAnimation.setAnimationListener(new IDAListenerS232S0100000_5(interfaceC65784Pro, 19));
                    view.startAnimation(loadAnimation);
                    return;
                }
            } else {
                animation.equals(LiveGiftNewGifterBadgeSetting.DEFAULT);
            }
            interfaceC65784Pro.invoke();
        }
        if (animation.equals("bottom")) {
            i = R.anim.ha;
            Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), i);
            loadAnimation2.setAnimationListener(new IDAListenerS232S0100000_5(interfaceC65784Pro, 19));
            view.startAnimation(loadAnimation2);
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
