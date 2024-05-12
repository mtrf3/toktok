package X;

import Y.ALAdapterS0S0101000_9;
import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.AfS1S0300100_9;
import Y.IDCListenerS246S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.LCt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53883LCt implements InterfaceC53713L6f {
    public InterfaceC53885LCv LIZ;
    public boolean LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final C53873LCj LJ;
    public final EnumC53876LCm LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public Aweme LJIIL;
    public User LJIILIIL;
    public InterfaceC64592gB<C220938ll> LJIILJJIL;
    public AnimatorSet LJIILL;
    public ValueAnimator LJIILLIIL;
    public ValueAnimator LJIIZILJ;
    public final AUListenerS97S0100000_9 LJIJ;
    public final AUListenerS97S0100000_9 LJIJI;
    public final AUListenerS97S0100000_9 LJIJJ;
    public final AUListenerS97S0100000_9 LJIJJLI;
    public final AUListenerS97S0100000_9 LJIL;
    public final IDCListenerS246S0100000_9 LJJ;

    @Override // X.InterfaceC53713L6f
    public final void LJFF() {
        LJIIIIZZ(0);
        LIZ();
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZ() {
        ValueAnimator LIZ;
        ValueAnimator valueAnimator;
        ValueAnimator LIZ2;
        ValueAnimator valueAnimator2;
        User user;
        long j;
        boolean LJIIIZ = LJIIIZ(this.LJIILIIL);
        this.LIZIZ = LJIIIZ;
        if (!LJIIIZ) {
            LIZLLL();
            InterfaceC64592gB<C220938ll> interfaceC64592gB = this.LJIILJJIL;
            if (interfaceC64592gB != null && (user = this.LJIILIIL) != null) {
                try {
                    String uid = user.getUid();
                    if (uid != null) {
                        j = CastLongProtector.parseLong(uid);
                    } else {
                        j = 0;
                    }
                    interfaceC64592gB.accept(new C220938ll(j, 0L));
                    return;
                } catch (Exception e) {
                    C0NB.LJII(e);
                    return;
                }
            }
            return;
        }
        if (this.LJI) {
            InterfaceC64592gB<C220938ll> interfaceC64592gB2 = this.LJIILJJIL;
            if (interfaceC64592gB2 != null) {
                LJIIJ(this.LJIILIIL, interfaceC64592gB2, "tiktok_video_head");
                return;
            }
            return;
        }
        if (this.LJIIIZ || LiveOuterService.LJJJLL().LJJIZ().LJJJLZIJ() || LD5.LIZIZ.LIZ()) {
            return;
        }
        Object LJIIIZ2 = C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_feed_live_avatar_tap_area");
        o.LJIIIIZZ(LJIIIZ2, "get()\n                .g…_avatar_tap_area\", false)");
        this.LJIIIIZZ = ((Boolean) LJIIIZ2).booleanValue();
        if (this.LJIIZILJ == null) {
            if (C53152KtY.LIZ() == 0) {
                LIZ2 = ValueAnimator.ofInt(0, this.LJIIJ);
            } else {
                LIZ2 = LD9.LIZ(0, this.LJIIJ);
            }
            this.LJIIZILJ = LIZ2;
            if (LIZ2 != null) {
                LIZ2.setRepeatCount(-1);
            }
            ValueAnimator valueAnimator3 = this.LJIIZILJ;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatMode(1);
            }
            int i = C53877LCn.LIZ[this.LJFF.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (valueAnimator2 = this.LJIIZILJ) != null) {
                        valueAnimator2.addUpdateListener(this.LJIJ);
                    }
                } else {
                    ValueAnimator valueAnimator4 = this.LJIIZILJ;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(this.LJIL);
                    }
                }
            } else {
                ValueAnimator valueAnimator5 = this.LJIIZILJ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(this.LJIJJ);
                }
            }
        }
        if (this.LJIILLIIL == null) {
            if (C53152KtY.LIZ() == 0) {
                LIZ = ValueAnimator.ofInt(0, this.LJIIJ);
            } else {
                LIZ = LD9.LIZ(0, this.LJIIJ);
            }
            this.LJIILLIIL = LIZ;
            if (LIZ != null) {
                LIZ.setRepeatCount(-1);
            }
            ValueAnimator valueAnimator6 = this.LJIILLIIL;
            if (valueAnimator6 != null) {
                valueAnimator6.setRepeatMode(1);
            }
            ValueAnimator valueAnimator7 = this.LJIILLIIL;
            if (valueAnimator7 != null) {
                valueAnimator7.setDuration(this.LJIIJ);
            }
            int i2 = C53877LCn.LIZ[this.LJFF.ordinal()];
            if (i2 != 1) {
                if ((i2 == 2 || i2 == 3) && (valueAnimator = this.LJIIZILJ) != null) {
                    valueAnimator.addUpdateListener(this.LJIJI);
                }
            } else {
                ValueAnimator valueAnimator8 = this.LJIIZILJ;
                if (valueAnimator8 != null) {
                    valueAnimator8.addUpdateListener(this.LJIJJLI);
                }
            }
            ValueAnimator valueAnimator9 = this.LJIILLIIL;
            if (valueAnimator9 != null) {
                valueAnimator9.addListener(new ALAdapterS0S0101000_9(this, 3));
            }
        }
        if (this.LJIILL == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJIILL = animatorSet;
            animatorSet.setDuration(this.LJIIJ);
            AnimatorSet animatorSet2 = this.LJIILL;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS7S0100000_9(this, 13));
            }
        }
        AnimatorSet animatorSet3 = this.LJIILL;
        if (animatorSet3 != null) {
            animatorSet3.play(this.LJIIZILJ);
        }
        this.LJI = true;
        AnimatorSet animatorSet4 = this.LJIILL;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        InterfaceC64592gB<C220938ll> interfaceC64592gB3 = this.LJIILJJIL;
        if (interfaceC64592gB3 == null) {
            return;
        }
        LJIIJ(this.LJIILIIL, interfaceC64592gB3, "tiktok_video_head");
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZLLL() {
        LJIIIIZZ(8);
        LJII();
    }

    @Override // X.InterfaceC53713L6f
    public final void LJ() {
        AnimatorSet animatorSet = this.LJIILL;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    @Override // X.InterfaceC53713L6f
    public final void LJI() {
        AnimatorSet animatorSet = this.LJIILL;
        if (animatorSet != null && animatorSet.isPaused()) {
            animatorSet.resume();
        }
    }

    @Override // X.InterfaceC53713L6f
    public final void LJII() {
        AnimatorSet animatorSet = this.LJIILL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJI = false;
            this.LJII = false;
        }
    }

    public C53883LCt() {
        this.LJFF = EnumC53876LCm.NORMAL;
        this.LJIIJ = 800;
        this.LJIIJJI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LJIJ = new AUListenerS97S0100000_9(this, 48);
        this.LJIJI = new AUListenerS97S0100000_9(this, 49);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 50);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 51);
        this.LJIL = new AUListenerS97S0100000_9(this, 47);
        this.LJJ = new IDCListenerS246S0100000_9(this, 7);
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZJ() {
        LJII();
        AnimatorSet animatorSet = this.LJIILL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        View view = this.LIZJ;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.LJJ);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
        }
    }

    public final void LJIIIIZZ(int i) {
        View view;
        View view2;
        if (i == 0) {
            C53873LCj c53873LCj = this.LJ;
            if (c53873LCj != null) {
                c53873LCj.setVisibility(0);
            }
            View view3 = this.LIZJ;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            if (o.LJ(this.LIZJ, this.LIZLLL) || (view2 = this.LIZLLL) == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        C53873LCj c53873LCj2 = this.LJ;
        if (c53873LCj2 != null) {
            c53873LCj2.setVisibility(8);
        }
        if (!o.LJ(this.LIZJ, this.LIZLLL) && (view = this.LIZJ) != null) {
            view.setVisibility(8);
        }
        View view4 = this.LIZLLL;
        if (view4 == null) {
            return;
        }
        view4.setVisibility(0);
    }

    public final boolean LJIIIZ(User user) {
        InterfaceC53885LCv interfaceC53885LCv = this.LIZ;
        if (interfaceC53885LCv != null) {
            return interfaceC53885LCv.LIZ(user);
        }
        if (!C77413UZt.LJIIZILJ()) {
            return false;
        }
        if (user == null) {
            return this.LIZIZ;
        }
        Aweme aweme = this.LJIIL;
        if (aweme != null && C63081OpJ.LLIIIJ(aweme)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((user.isSecret() && !AV1.LJIILL(user)) || !user.isLive() || !UC0.LJJLI() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public C53883LCt(View liveAvatarView, View unliveAvatarView, C53873LCj avatarCircleView) {
        o.LJIIIZ(liveAvatarView, "liveAvatarView");
        o.LJIIIZ(unliveAvatarView, "unliveAvatarView");
        o.LJIIIZ(avatarCircleView, "avatarCircleView");
        this.LJFF = EnumC53876LCm.NORMAL;
        this.LJIIJ = 800;
        this.LJIIJJI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LJIJ = new AUListenerS97S0100000_9(this, 48);
        this.LJIJI = new AUListenerS97S0100000_9(this, 49);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 50);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 51);
        this.LJIL = new AUListenerS97S0100000_9(this, 47);
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 7);
        this.LJJ = iDCListenerS246S0100000_9;
        this.LIZJ = liveAvatarView;
        this.LIZLLL = unliveAvatarView;
        this.LJ = avatarCircleView;
        C77413UZt.LJIIZILJ();
        this.LIZIZ = true;
        avatarCircleView.setVisibility(0);
        liveAvatarView.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
    }

    public final void LJIIJ(User user, InterfaceC64592gB<C220938ll> interfaceC64592gB, String str) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LiveOuterService.LJJJLL().getLiveStateManager().LJIIIIZZ(user, new AfS1S0300100_9(CastLongProtector.parseLong(uid), this, user, interfaceC64592gB, 0), "tiktok_video_head");
    }

    public C53883LCt(EnumC53876LCm animatorType, View liveAvatarView, View unliveAvatarView, C53873LCj avatarCircleView) {
        o.LJIIIZ(animatorType, "animatorType");
        o.LJIIIZ(liveAvatarView, "liveAvatarView");
        o.LJIIIZ(unliveAvatarView, "unliveAvatarView");
        o.LJIIIZ(avatarCircleView, "avatarCircleView");
        this.LJFF = EnumC53876LCm.NORMAL;
        this.LJIIJ = 800;
        this.LJIIJJI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LJIJ = new AUListenerS97S0100000_9(this, 48);
        this.LJIJI = new AUListenerS97S0100000_9(this, 49);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 50);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 51);
        this.LJIL = new AUListenerS97S0100000_9(this, 47);
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 7);
        this.LJJ = iDCListenerS246S0100000_9;
        this.LIZJ = liveAvatarView;
        this.LIZLLL = unliveAvatarView;
        this.LJ = avatarCircleView;
        C77413UZt.LJIIZILJ();
        this.LIZIZ = true;
        avatarCircleView.setVisibility(0);
        liveAvatarView.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
        this.LJFF = animatorType;
        if (animatorType == EnumC53876LCm.SKYLIGHT) {
            this.LJIIJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            this.LJIIJJI = 1750;
        }
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZIZ(User user, Class<Object> cls, InterfaceC64592gB<C220938ll> interfaceC64592gB, Aweme aweme) {
        this.LJIIL = aweme;
        this.LJIILIIL = user;
        this.LJIILJJIL = interfaceC64592gB;
        this.LIZIZ = LJIIIZ(user);
        View view = this.LIZJ;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.LJJ);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            view2.addOnAttachStateChangeListener(this.LJJ);
        }
        if (this.LIZIZ) {
            LJFF();
        } else {
            LIZLLL();
        }
    }

    public C53883LCt(boolean z, C57128MbU c57128MbU, C57127MbT c57127MbT, C53873LCj c53873LCj, EnumC53876LCm animatorType) {
        boolean z2;
        o.LJIIIZ(animatorType, "animatorType");
        this.LJFF = EnumC53876LCm.NORMAL;
        this.LJIIJ = 800;
        this.LJIIJJI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LJIJ = new AUListenerS97S0100000_9(this, 48);
        this.LJIJI = new AUListenerS97S0100000_9(this, 49);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 50);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 51);
        this.LJIL = new AUListenerS97S0100000_9(this, 47);
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 7);
        this.LJJ = iDCListenerS246S0100000_9;
        this.LIZJ = c57128MbU;
        this.LIZLLL = c57127MbT;
        this.LJ = c53873LCj;
        if (z) {
            C77413UZt.LJIIZILJ();
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZIZ = z2;
        this.LJFF = animatorType;
        c57128MbU.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
    }
}
