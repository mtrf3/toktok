package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VQX extends AnimatorListenerAdapter {
    public static final java.util.Map<String, Object> LJLJI;
    public final WeakReference<LynxBaseUI> LJLIL;
    public final int LJLILLLLZI;

    static {
        HashMap hashMap = new HashMap();
        LJLJI = hashMap;
        hashMap.put("animation_type", "transition");
    }

    public final void LIZIZ(String str) {
        String str2;
        LynxBaseUI lynxBaseUI = this.LJLIL.get();
        if (lynxBaseUI == null) {
            return;
        }
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LJLIL;
        }
        if (lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey(str)) {
            java.util.Map<String, Object> map = LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("transition-");
            int i = this.LJLILLLLZI;
            if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 4:
                            str2 = "scaleY";
                            break;
                        case 8:
                            str2 = "scaleXY";
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            str2 = "width";
                            break;
                        case 32:
                            str2 = "height";
                            break;
                        case 64:
                            str2 = "background-color";
                            break;
                        case 128:
                            str2 = "visibility";
                            break;
                        case 256:
                            str2 = "left";
                            break;
                        case 512:
                            str2 = "top";
                            break;
                        case 1024:
                            str2 = "right";
                            break;
                        case 2048:
                            str2 = "bottom";
                            break;
                        case 4096:
                            str2 = "transform";
                            break;
                        default:
                            new IllegalArgumentException(KMP.LJ("Unsupported animated property: ", i));
                            str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
                            break;
                    }
                } else {
                    str2 = "scaleX";
                }
            } else {
                str2 = "opacity";
            }
            LIZ.append(str2);
            ((HashMap) map).put("animation_type", X1D.LIZIZ(LIZ));
            lynxBaseUI.mContext.LJLJJL.LIZIZ(new VNN(lynxBaseUI.getSign(), str, map));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        LIZIZ("transitionend");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        LIZIZ("transitionstart");
    }

    public VQX(LynxBaseUI lynxBaseUI, int i) {
        this.LJLIL = new WeakReference<>(lynxBaseUI);
        this.LJLILLLLZI = i;
    }
}
