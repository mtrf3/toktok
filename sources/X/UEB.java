package X;

import Y.IDAListenerS237S0100000_13;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGuideOnLeftRTLEnableSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UEB {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        if (C15380j0.LJIIZILJ() && LiveGiftGuideOnLeftRTLEnableSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public static void LIZ(View view, InterfaceC88472Yns interfaceC88472Yns) {
        int i;
        Animation animation = view.getAnimation();
        if (animation != null && animation.hasStarted()) {
            return;
        }
        Context context = view.getContext();
        if (LIZIZ()) {
            i = R.anim.h9;
        } else {
            i = R.anim.h7;
        }
        Animation enterAnim = AnimationUtils.loadAnimation(context, i);
        o.LJIIIIZZ(enterAnim, "enterAnim");
        enterAnim.setAnimationListener(new IDAListenerS237S0100000_13(interfaceC88472Yns, 4));
        view.startAnimation(enterAnim);
    }
}
