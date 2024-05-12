package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ukd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78079Ukd {
    public static final /* synthetic */ int LIZ = 0;

    public static int LJI(int i, int i2) {
        int i3 = (int) (((i * 1.0d) / (LiveChatShowDelayForHotLiveSetting.DEFAULT * 1.0d)) * i2);
        return i3 > 0 ? i3 : i;
    }

    public static ObjectAnimator LIZ(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(260L);
        o.LJIIIIZZ(duration, "ofFloat(targetView, View…   .setDuration(duration)");
        return duration;
    }

    public static AnimatorSet LIZIZ(C47121t6 c47121t6) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, 1.3f, 0.83f).setDuration(100L), ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_Y, 1.3f, 0.83f).setDuration(100L));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, 0.83f, 1.1f).setDuration(100L), ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_Y, 0.83f, 1.1f).setDuration(100L));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet3.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, 1.1f, 1.0f).setDuration(100L), ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_Y, 1.1f, 1.0f).setDuration(100L));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        return animatorSet4;
    }

    public static void LJFF(C47121t6 c47121t6) {
        if (Build.VERSION.SDK_INT >= 28) {
            c47121t6.resetPivot();
            return;
        }
        c47121t6.setPivotX((float) ((c47121t6.getWidth() * 1.0d) / 2.0d));
        c47121t6.setPivotY((float) ((c47121t6.getHeight() * 1.0d) / 2.0d));
    }

    public static AnimatorSet LIZJ(View view, InterfaceC78107Ul5 interfaceC78107Ul5, C78072UkW c78072UkW, DataChannel dataChannel) {
        int i;
        int i2;
        Object valueOf;
        int i3;
        EnumC30098Bra enumC30098Bra;
        if (c78072UkW == null) {
            i2 = 0;
        } else {
            boolean z = c78072UkW.LJJJJJL;
            if (z) {
                i = c78072UkW.LJIILIIL;
            } else {
                i = c78072UkW.LJIIL;
            }
            boolean z2 = c78072UkW.LJJJJL;
            boolean LJFF = C78084Uki.LJFF();
            i2 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
            if (LJFF) {
                List<Integer> list = C78084Uki.LIZJ(z, z2)._trayComboConfig._animationDuration;
                int LIZ2 = C78084Uki.LIZ(i, C78084Uki.LIZIZ.invoke(Boolean.valueOf(z)));
                if (LIZ2 >= 0) {
                    if (LIZ2 <= C47261Igj.LJJI(list)) {
                        valueOf = ListProtector.get(list, LIZ2);
                    } else {
                        valueOf = Integer.valueOf(LiveChatShowDelayForHotLiveSetting.DEFAULT);
                    }
                    i2 = ((Number) valueOf).intValue();
                    if (i2 <= 0) {
                        i2 = 300;
                    }
                }
            }
        }
        int LJI = LJI(200, i2);
        int LJI2 = LJI(100, i2);
        int LJI3 = LJI(100, i2);
        long j = LJI;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(j);
        o.LJIIIIZZ(duration, "ofFloat(\n            vie…meCombAnimScale.toLong())");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(j);
        o.LJIIIIZZ(duration2, "ofFloat(\n            vie…meCombAnimScale.toLong())");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(LJI2);
        o.LJIIIIZZ(duration3, "ofFloat(view, View.ALPHA…meCombAnimAlpha.toLong())");
        long j2 = LJI3;
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 1.2f).setDuration(j2);
        o.LJIIIIZZ(duration4, "ofFloat(\n            vie…mbAnimScaleBack.toLong())");
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.2f).setDuration(j2);
        o.LJIIIIZZ(duration5, "ofFloat(\n            vie…mbAnimScaleBack.toLong())");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.2f, 1.0f).setDuration(j2);
        o.LJIIIIZZ(duration6, "ofFloat(\n            vie…mbAnimScaleBack.toLong())");
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.2f, 1.0f).setDuration(j2);
        o.LJIIIIZZ(duration7, "ofFloat(\n            vie…mbAnimScaleBack.toLong())");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(duration6, duration7);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(400L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (ScalableDowngradeSetting.disableGiftTrayAnim() && dataChannel != null && dataChannel.kv0(LowDevicePerfScalableChannel.class) != null) {
            C30134BsA c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class);
            if (c30134BsA != null && (enumC30098Bra = c30134BsA.LIZIZ) != null) {
                i3 = enumC30098Bra.ordinal();
            } else {
                i3 = 0;
            }
            if (i3 <= EnumC30098Bra.LEVEL_CRITICAL.ordinal()) {
                animatorSet4.playSequentially(ofFloat);
                animatorSet4.addListener(new C78097Ukv(EnumC78092Ukq.COMB, interfaceC78107Ul5));
                return animatorSet4;
            }
        }
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        animatorSet4.addListener(new C78097Ukv(EnumC78092Ukq.COMB, interfaceC78107Ul5));
        return animatorSet4;
    }

    public static AnimatorSet LIZLLL(View view, InterfaceC78107Ul5 interfaceC78107Ul5, C78072UkW message, DataChannel dataChannel) {
        int i;
        int i2;
        Object obj;
        int i3;
        EnumC30098Bra enumC30098Bra;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(message, "message");
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        float x = view.getX();
        if (LJIIZILJ) {
            i = -1;
        } else {
            i = 1;
        }
        boolean z = message.LJJJJJL;
        if (z) {
            i2 = message.LJIILIIL;
        } else {
            i2 = message.LJIIL;
        }
        boolean z2 = message.LJJJJL;
        int i4 = 300;
        if (C78084Uki.LJFF()) {
            List<Integer> list = C78084Uki.LIZJ(z, z2)._trayShowConfig.animationDuration;
            int LIZ2 = C78084Uki.LIZ(i2, C78084Uki.LIZIZ.invoke(Boolean.valueOf(z)));
            if (LIZ2 >= 0) {
                if (LIZ2 <= C47261Igj.LJJI(list)) {
                    obj = ListProtector.get(list, LIZ2);
                } else {
                    obj = 300;
                }
                i4 = ((Number) obj).intValue();
                if (i4 <= 0) {
                    i4 = 200;
                }
            }
        }
        float f = i;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, x * f, f * 0.0f).setDuration(i4);
        o.LJIIIIZZ(duration, "ofFloat(\n            vie…tryAnimDuration.toLong())");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, 0.0f).setDuration(50);
        o.LJIIIIZZ(duration2, "ofFloat(\n            vie…ration(waitTime.toLong())");
        ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i4 + 50);
        ValueAnimator.ofFloat(1.0f, 1.0f).setDuration(1L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (ScalableDowngradeSetting.disableGiftTrayAnim() && dataChannel != null && dataChannel.kv0(LowDevicePerfScalableChannel.class) != null) {
            C30134BsA c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class);
            if (c30134BsA != null && (enumC30098Bra = c30134BsA.LIZIZ) != null) {
                i3 = enumC30098Bra.ordinal();
            } else {
                i3 = 0;
            }
            if (i3 <= EnumC30098Bra.LEVEL_CRITICAL.ordinal()) {
                animatorSet.playSequentially(duration2);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.ENTRY, interfaceC78107Ul5));
                return animatorSet;
            }
        }
        animatorSet.playSequentially(duration, duration2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.ENTRY, interfaceC78107Ul5));
        return animatorSet;
    }

    public static AnimatorSet LJ(View view, InterfaceC78107Ul5 interfaceC78107Ul5, C78072UkW message, DataChannel dataChannel) {
        int i;
        Object valueOf;
        int i2;
        EnumC30098Bra enumC30098Bra;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(message, "message");
        boolean z = message.LJJJJJL;
        if (z) {
            i = message.LJIILIIL;
        } else {
            i = message.LJIIL;
        }
        boolean z2 = message.LJJJJL;
        boolean LJFF = C78084Uki.LJFF();
        int i3 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        if (LJFF) {
            List<Integer> list = C78084Uki.LIZJ(z, z2)._trayDismissConfig._animationDuration;
            int LIZ2 = C78084Uki.LIZ(i, C78084Uki.LIZIZ.invoke(Boolean.valueOf(z)));
            if (LIZ2 >= 0) {
                if (LIZ2 <= C47261Igj.LJJI(list)) {
                    valueOf = ListProtector.get(list, LIZ2);
                } else {
                    valueOf = Integer.valueOf(LiveChatShowDelayForHotLiveSetting.DEFAULT);
                }
                i3 = ((Number) valueOf).intValue();
                if (i3 <= 0) {
                    i3 = 300;
                }
            }
        }
        long j = i3;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(j);
        o.LJIIIIZZ(duration, "ofFloat(view, View.ALPHA…xitAnimDuration.toLong())");
        ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        if (ScalableDowngradeSetting.disableGiftTrayAnim() && dataChannel != null && dataChannel.kv0(LowDevicePerfScalableChannel.class) != null) {
            C30134BsA c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class);
            if (c30134BsA != null && (enumC30098Bra = c30134BsA.LIZIZ) != null) {
                i2 = enumC30098Bra.ordinal();
            } else {
                i2 = 0;
            }
            if (i2 <= EnumC30098Bra.LEVEL_CRITICAL.ordinal()) {
                view.setAlpha(0.0f);
                animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.EXIT, interfaceC78107Ul5));
                return animatorSet;
            }
        }
        animatorSet.playTogether(duration);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.EXIT, interfaceC78107Ul5));
        return animatorSet;
    }
}
