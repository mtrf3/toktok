package X;

import Y.ALAdapterS0S0101000_9;
import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* renamed from: X.LCs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53882LCs {
    public final java.util.Set<C53884LCu> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final EnumC53722L6o LJFF;
    public final String LJI;
    public boolean LJII;
    public AnimatorSet LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public ValueAnimator LJIIJ;
    public final AUListenerS97S0100000_9 LJIIJJI;
    public final AUListenerS97S0100000_9 LJIIL;
    public final AUListenerS97S0100000_9 LJIILIIL;
    public final AUListenerS97S0100000_9 LJIILJJIL;
    public final AUListenerS97S0100000_9 LJIILL;

    public final void LIZ() {
        AnimatorSet animatorSet = this.LJIIIIZZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    public final void LIZJ() {
        AnimatorSet animatorSet = this.LJIIIIZZ;
        if (animatorSet != null && animatorSet.isPaused()) {
            animatorSet.resume();
        }
    }

    public final void LIZLLL() {
        ValueAnimator LIZ;
        ValueAnimator valueAnimator;
        ValueAnimator LIZ2;
        ValueAnimator valueAnimator2;
        if (LiveOuterService.LJJJLL().LJJIZ().LJJJLZIJ() || LD5.LIZIZ.LIZ()) {
            return;
        }
        Object LJIIIZ = C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_feed_live_avatar_tap_area");
        o.LJIIIIZZ(LJIIIZ, "get()\n            .getSe…_avatar_tap_area\", false)");
        this.LJ = ((Boolean) LJIIIZ).booleanValue();
        if (this.LJIIJ == null) {
            if (C53152KtY.LIZ() == 0) {
                LIZ2 = ValueAnimator.ofInt(0, this.LIZIZ);
            } else {
                LIZ2 = LD9.LIZ(0, this.LIZIZ);
            }
            this.LJIIJ = LIZ2;
            if (LIZ2 != null) {
                LIZ2.setRepeatCount(-1);
            }
            ValueAnimator valueAnimator3 = this.LJIIJ;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatMode(1);
            }
            int i = C53723L6p.LIZ[this.LJFF.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (valueAnimator2 = this.LJIIJ) != null) {
                        valueAnimator2.addUpdateListener(this.LJIIJJI);
                    }
                } else {
                    ValueAnimator valueAnimator4 = this.LJIIJ;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(this.LJIILL);
                    }
                }
            } else {
                ValueAnimator valueAnimator5 = this.LJIIJ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(this.LJIILIIL);
                }
            }
        }
        if (this.LJIIIZ == null) {
            if (C53152KtY.LIZ() == 0) {
                LIZ = ValueAnimator.ofInt(0, this.LIZIZ);
            } else {
                LIZ = LD9.LIZ(0, this.LIZIZ);
            }
            this.LJIIIZ = LIZ;
            if (LIZ != null) {
                LIZ.setRepeatCount(-1);
            }
            ValueAnimator valueAnimator6 = this.LJIIIZ;
            if (valueAnimator6 != null) {
                valueAnimator6.setRepeatMode(1);
            }
            ValueAnimator valueAnimator7 = this.LJIIIZ;
            if (valueAnimator7 != null) {
                valueAnimator7.setDuration(this.LIZIZ);
            }
            int i2 = C53723L6p.LIZ[this.LJFF.ordinal()];
            if (i2 != 1) {
                if ((i2 == 2 || i2 == 3) && (valueAnimator = this.LJIIJ) != null) {
                    valueAnimator.addUpdateListener(this.LJIIL);
                }
            } else {
                ValueAnimator valueAnimator8 = this.LJIIJ;
                if (valueAnimator8 != null) {
                    valueAnimator8.addUpdateListener(this.LJIILJJIL);
                }
            }
            ValueAnimator valueAnimator9 = this.LJIIIZ;
            if (valueAnimator9 != null) {
                valueAnimator9.addListener(new ALAdapterS0S0101000_9(this, 2));
            }
        }
        if (this.LJIIIIZZ == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJIIIIZZ = animatorSet;
            animatorSet.setDuration(this.LIZIZ);
            AnimatorSet animatorSet2 = this.LJIIIIZZ;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS7S0100000_9(this, 12));
            }
        }
        AnimatorSet animatorSet3 = this.LJIIIIZZ;
        if (animatorSet3 != null) {
            animatorSet3.play(this.LJIIJ);
        }
        this.LJII = true;
        AnimatorSet animatorSet4 = this.LJIIIIZZ;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        java.util.Set<C53884LCu> proxies = this.LIZ;
        o.LJIIIIZZ(proxies, "proxies");
        for (C53884LCu c53884LCu : proxies) {
            String scene = this.LJI;
            c53884LCu.getClass();
            o.LJIIIZ(scene, "scene");
            InterfaceC64592gB<C220938ll> interfaceC64592gB = c53884LCu.LJIIIZ;
            if (interfaceC64592gB != null) {
                c53884LCu.LJIIJ(c53884LCu.LJIIIIZZ, interfaceC64592gB, scene);
            }
        }
        if (this.LIZ.isEmpty()) {
            LIZ();
        }
    }

    public C53882LCs(EnumC53722L6o animatorType) {
        o.LJIIIZ(animatorType, "animatorType");
        this.LIZ = Q4K.LIZLLL();
        this.LIZIZ = 800;
        this.LIZJ = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LJFF = EnumC53722L6o.NORMAL;
        this.LJI = "tiktok_video_head";
        this.LJIIJJI = new AUListenerS97S0100000_9(this, 43);
        this.LJIIL = new AUListenerS97S0100000_9(this, 44);
        this.LJIILIIL = new AUListenerS97S0100000_9(this, 45);
        this.LJIILJJIL = new AUListenerS97S0100000_9(this, 46);
        this.LJIILL = new AUListenerS97S0100000_9(this, 42);
        this.LJFF = animatorType;
        if (animatorType == EnumC53722L6o.SKYLIGHT) {
            this.LIZIZ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            this.LIZJ = 1750;
        }
    }

    public final void LIZIZ(C53884LCu proxy) {
        o.LJIIIZ(proxy, "proxy");
        if (this.LIZ.isEmpty()) {
            LIZJ();
        }
        if (!this.LIZ.contains(proxy)) {
            this.LIZ.add(proxy);
        }
    }

    public final void LJ(C53884LCu proxy) {
        o.LJIIIZ(proxy, "proxy");
        if (this.LIZ.contains(proxy)) {
            this.LIZ.remove(proxy);
        }
        if (this.LIZ.isEmpty()) {
            LIZ();
        }
    }
}
