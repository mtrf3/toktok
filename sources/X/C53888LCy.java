package X;

import Y.ALAdapterS0S0101000_9;
import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.AfS1S0300100_9;
import Y.AfS55S0100000_3;
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

/* renamed from: X.LCy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53888LCy {
    public final int LIZ;
    public final int LIZIZ;
    public final EnumC53889LCz LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public User LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final C53873LCj LJIIIZ;
    public ValueAnimator LJIIJ;
    public ValueAnimator LJIIJJI;
    public AnimatorSet LJIIL;
    public InterfaceC64592gB<C220938ll> LJIILIIL;
    public Aweme LJIILJJIL;
    public boolean LJIILL;
    public final String LJIILLIIL;
    public InterfaceC53885LCv LJIIZILJ;
    public final AUListenerS97S0100000_9 LJIJ;
    public final AUListenerS97S0100000_9 LJIJI;
    public final AUListenerS97S0100000_9 LJIJJ;
    public final AUListenerS97S0100000_9 LJIJJLI;
    public final AUListenerS97S0100000_9 LJIL;
    public boolean LJJ;
    public final IDCListenerS246S0100000_9 LJJI;

    static {
        C16880lQ.LJLLJ(C53888LCy.class);
    }

    public final void LIZIZ() {
        LDD.LIZ(this.LJIILLIIL, new LD3());
    }

    public final void LJ() {
        User user;
        boolean LIZLLL = LIZLLL(this.LJI);
        this.LJFF = LIZLLL;
        if (!LIZLLL) {
            AnimatorSet animatorSet = this.LJIIL;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.LJ = false;
                this.LIZLLL = false;
            }
            LIZJ(8);
            InterfaceC64592gB<C220938ll> interfaceC64592gB = this.LJIILIIL;
            if (interfaceC64592gB != null && (user = this.LJI) != null) {
                try {
                    interfaceC64592gB.accept(new C220938ll(CastLongProtector.parseLong(user.getUid()), 0L));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        if (this.LJ) {
            InterfaceC64592gB<C220938ll> interfaceC64592gB2 = this.LJIILIIL;
            if (interfaceC64592gB2 != null) {
                LJFF(this.LJI, interfaceC64592gB2);
                return;
            }
            return;
        }
        if (this.LJJ || LiveOuterService.LJJJLL().LJJIZ().LJJJLZIJ() || LD5.LIZIZ.LIZ()) {
            return;
        }
        this.LJIILL = ((Boolean) C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_feed_live_avatar_tap_area")).booleanValue();
        if (this.LJIIJ == null) {
            if (C53152KtY.LIZ() == 0) {
                this.LJIIJ = ValueAnimator.ofInt(0, this.LIZ);
            } else {
                this.LJIIJ = LD9.LIZ(0, this.LIZ);
            }
            this.LJIIJ.setRepeatCount(-1);
            this.LJIIJ.setRepeatMode(1);
            int i = LD2.LIZ[this.LIZJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LJIIJ.addUpdateListener(this.LJIJ);
                    }
                } else {
                    this.LJIIJ.addUpdateListener(this.LJIL);
                }
            } else {
                this.LJIIJ.addUpdateListener(this.LJIJJ);
            }
        }
        if (this.LJIIJJI == null) {
            if (C53152KtY.LIZ() == 0) {
                this.LJIIJJI = ValueAnimator.ofInt(0, this.LIZ);
            } else {
                this.LJIIJJI = LD9.LIZ(0, this.LIZ);
            }
            this.LJIIJJI.setRepeatCount(-1);
            this.LJIIJJI.setRepeatMode(1);
            this.LJIIJJI.setDuration(this.LIZ);
            int i2 = LD2.LIZ[this.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    this.LJIIJ.addUpdateListener(this.LJIJI);
                }
            } else {
                this.LJIIJ.addUpdateListener(this.LJIJJLI);
            }
            this.LJIIJJI.addListener(new ALAdapterS0S0101000_9(this, 4));
        }
        if (this.LJIIL == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LJIIL = animatorSet2;
            animatorSet2.setDuration(this.LIZ);
            this.LJIIL.addListener(new ALAdapterS7S0100000_9(this, 19));
        }
        this.LJIIL.play(this.LJIIJ);
        this.LJ = true;
        LDD.LIZIZ(this.LJIILLIIL, this.LJIIL, null);
        InterfaceC64592gB<C220938ll> interfaceC64592gB3 = this.LJIILIIL;
        if (interfaceC64592gB3 == null) {
            return;
        }
        LJFF(this.LJI, interfaceC64592gB3);
    }

    public C53888LCy() {
        this.LIZ = 800;
        this.LIZIZ = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LIZJ = EnumC53889LCz.NORMAL;
        this.LJIILLIIL = "AvatarDegrade";
        this.LJIJ = new AUListenerS97S0100000_9(this, 66);
        this.LJIJI = new AUListenerS97S0100000_9(this, 67);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 68);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 69);
        this.LJIL = new AUListenerS97S0100000_9(this, 70);
        this.LJJ = false;
        this.LJJI = new IDCListenerS246S0100000_9(this, 11);
        LIZIZ();
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            C53873LCj c53873LCj = this.LJIIIZ;
            if (c53873LCj != null) {
                c53873LCj.setVisibility(0);
            }
            View view = this.LJII;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.LJIIIIZZ;
                if (view2 != null && this.LJII != view2) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        C53873LCj c53873LCj2 = this.LJIIIZ;
        if (c53873LCj2 != null) {
            c53873LCj2.setVisibility(8);
        }
        View view3 = this.LJII;
        if (view3 != null && view3 != this.LJIIIIZZ) {
            view3.setVisibility(8);
        }
        View view4 = this.LJIIIIZZ;
        if (view4 == null) {
            return;
        }
        view4.setVisibility(0);
    }

    public final boolean LIZLLL(User user) {
        InterfaceC53885LCv interfaceC53885LCv = this.LJIIZILJ;
        if (interfaceC53885LCv != null) {
            return interfaceC53885LCv.LIZ(user);
        }
        if (!C77413UZt.LJIIZILJ()) {
            return false;
        }
        if (user == null) {
            return this.LJFF;
        }
        if (C63081OpJ.LLIIIJ(this.LJIILJJIL)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((user.isSecret() && !AV1.LJIILL(user)) || !UC0.LJJLI() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public final void LJFF(User user, InterfaceC64592gB interfaceC64592gB) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        LiveOuterService.LJJJLL().getLiveStateManager().LJIIIIZZ(user, new AfS1S0300100_9(CastLongProtector.parseLong(user.getUid()), this, user, interfaceC64592gB, 2), "tiktok_video_head");
    }

    public C53888LCy(View view, View view2, C53873LCj c53873LCj) {
        this.LIZ = 800;
        this.LIZIZ = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LIZJ = EnumC53889LCz.NORMAL;
        this.LJIILLIIL = "AvatarDegrade";
        this.LJIJ = new AUListenerS97S0100000_9(this, 66);
        this.LJIJI = new AUListenerS97S0100000_9(this, 67);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 68);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 69);
        this.LJIL = new AUListenerS97S0100000_9(this, 70);
        this.LJJ = false;
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 11);
        this.LJJI = iDCListenerS246S0100000_9;
        this.LJII = view;
        this.LJIIIIZZ = view2;
        this.LJIIIZ = c53873LCj;
        C77413UZt.LJIIZILJ();
        this.LJFF = true;
        c53873LCj.setVisibility(0);
        view.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
        LIZIZ();
    }

    public C53888LCy(EnumC53889LCz enumC53889LCz, View view, View view2, C53873LCj c53873LCj) {
        this.LIZ = 800;
        this.LIZIZ = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        EnumC53889LCz enumC53889LCz2 = EnumC53889LCz.NORMAL;
        this.LIZJ = enumC53889LCz2;
        this.LJIILLIIL = "AvatarDegrade";
        this.LJIJ = new AUListenerS97S0100000_9(this, 66);
        this.LJIJI = new AUListenerS97S0100000_9(this, 67);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 68);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 69);
        this.LJIL = new AUListenerS97S0100000_9(this, 70);
        this.LJJ = false;
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 11);
        this.LJJI = iDCListenerS246S0100000_9;
        this.LJII = view;
        this.LJIIIIZZ = view2;
        this.LJIIIZ = c53873LCj;
        this.LIZJ = enumC53889LCz != null ? enumC53889LCz : enumC53889LCz2;
        C77413UZt.LJIIZILJ();
        this.LJFF = true;
        c53873LCj.setVisibility(0);
        view.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
        if (enumC53889LCz == EnumC53889LCz.INBOX) {
            this.LIZ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            this.LIZIZ = 1750;
        }
        LIZIZ();
    }

    public final void LIZ(User user, Class cls, AfS55S0100000_3 afS55S0100000_3, Aweme aweme) {
        this.LJIILJJIL = aweme;
        this.LJI = user;
        this.LJIILIIL = afS55S0100000_3;
        this.LJFF = LIZLLL(user);
        this.LJII.removeOnAttachStateChangeListener(this.LJJI);
        this.LJII.addOnAttachStateChangeListener(this.LJJI);
        if (this.LJFF) {
            LIZJ(0);
            LJ();
            return;
        }
        AnimatorSet animatorSet = this.LJIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJ = false;
            this.LIZLLL = false;
        }
        LIZJ(8);
    }

    public C53888LCy(boolean z, C57128MbU c57128MbU, C57127MbT c57127MbT, C53873LCj c53873LCj, EnumC53889LCz enumC53889LCz) {
        this.LIZ = 800;
        this.LIZIZ = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        EnumC53889LCz enumC53889LCz2 = EnumC53889LCz.NORMAL;
        this.LIZJ = enumC53889LCz2;
        this.LJIILLIIL = "AvatarDegrade";
        this.LJIJ = new AUListenerS97S0100000_9(this, 66);
        this.LJIJI = new AUListenerS97S0100000_9(this, 67);
        this.LJIJJ = new AUListenerS97S0100000_9(this, 68);
        this.LJIJJLI = new AUListenerS97S0100000_9(this, 69);
        this.LJIL = new AUListenerS97S0100000_9(this, 70);
        this.LJJ = false;
        IDCListenerS246S0100000_9 iDCListenerS246S0100000_9 = new IDCListenerS246S0100000_9(this, 11);
        this.LJJI = iDCListenerS246S0100000_9;
        this.LJII = c57128MbU;
        this.LJIIIIZZ = c57127MbT;
        this.LJIIIZ = c53873LCj;
        C77413UZt.LJIIZILJ();
        this.LJFF = z;
        this.LIZJ = enumC53889LCz == null ? enumC53889LCz2 : enumC53889LCz;
        c57128MbU.addOnAttachStateChangeListener(iDCListenerS246S0100000_9);
        LIZIZ();
    }
}
