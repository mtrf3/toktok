package X;

import Y.AfS55S0100000_3;
import android.animation.AnimatorSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.feed.LiveAvatarAnimationOptimizeV3Setting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.LCx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C53887LCx implements InterfaceC53713L6f {
    public final C53888LCy LIZ;
    public final C53883LCt LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC53713L6f
    public final void LIZ() {
        if (this.LIZJ == 0) {
            this.LIZ.LJ();
        } else {
            this.LIZIZ.LIZ();
        }
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZJ() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            AnimatorSet animatorSet = c53888LCy.LJIIL;
            if (animatorSet != null) {
                animatorSet.cancel();
                c53888LCy.LJ = false;
                c53888LCy.LIZLLL = false;
            }
            AnimatorSet animatorSet2 = c53888LCy.LJIIL;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            View view = c53888LCy.LJII;
            if (view != null) {
                view.removeOnAttachStateChangeListener(c53888LCy.LJJI);
                c53888LCy.LJII.setScaleX(1.0f);
                c53888LCy.LJII.setScaleY(1.0f);
                return;
            }
            return;
        }
        this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZLLL() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            AnimatorSet animatorSet = c53888LCy.LJIIL;
            if (animatorSet != null) {
                animatorSet.cancel();
                c53888LCy.LJ = false;
                c53888LCy.LIZLLL = false;
            }
            c53888LCy.LIZJ(8);
            return;
        }
        this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC53713L6f
    public final void LJ() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            AnimatorSet animatorSet = c53888LCy.LJIIL;
            if (animatorSet != null && animatorSet.isRunning()) {
                c53888LCy.LJIIL.pause();
                return;
            }
            return;
        }
        this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC53713L6f
    public void LJFF() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            c53888LCy.LIZJ(0);
            c53888LCy.LJ();
            return;
        }
        this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC53713L6f
    public final void LJI() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            AnimatorSet animatorSet = c53888LCy.LJIIL;
            if (animatorSet != null && animatorSet.isPaused()) {
                c53888LCy.LJIIL.resume();
                return;
            }
            return;
        }
        this.LIZIZ.LJI();
    }

    @Override // X.InterfaceC53713L6f
    public final void LJII() {
        if (this.LIZJ == 0) {
            C53888LCy c53888LCy = this.LIZ;
            AnimatorSet animatorSet = c53888LCy.LJIIL;
            if (animatorSet != null) {
                animatorSet.cancel();
                c53888LCy.LJ = false;
                c53888LCy.LIZLLL = false;
                return;
            }
            return;
        }
        this.LIZIZ.LJII();
    }

    public final boolean LJIIIZ() {
        if (this.LIZJ == 0) {
            return this.LIZ.LJFF;
        }
        return this.LIZIZ.LIZIZ;
    }

    public C53887LCx() {
        int value = LiveAvatarAnimationOptimizeV3Setting.INSTANCE.getValue();
        this.LIZJ = value;
        if (value == 0) {
            this.LIZ = new C53888LCy();
        } else {
            this.LIZIZ = new C53883LCt();
        }
    }

    public final void LJIIJ(boolean z) {
        if (this.LIZJ == 0) {
            this.LIZ.LJJ = z;
        } else {
            this.LIZIZ.LJIIIZ = z;
        }
    }

    public final void LJIIIIZZ(User user, Class cls) {
        if (this.LIZJ == 0) {
            this.LIZ.LIZ(user, cls, null, null);
        } else {
            this.LIZIZ.LIZIZ(user, cls, null, null);
        }
    }

    public C53887LCx(View view, View view2, C53873LCj c53873LCj) {
        int value = LiveAvatarAnimationOptimizeV3Setting.INSTANCE.getValue();
        this.LIZJ = value;
        if (value == 0) {
            this.LIZ = new C53888LCy(view, view2, c53873LCj);
        } else {
            this.LIZIZ = new C53883LCt(view, view2, c53873LCj);
        }
    }

    public C53887LCx(EnumC53720L6m enumC53720L6m, View view, View view2, C53873LCj c53873LCj) {
        int value = LiveAvatarAnimationOptimizeV3Setting.INSTANCE.getValue();
        this.LIZJ = value;
        if (value == 0) {
            int i = C53721L6n.LIZ[enumC53720L6m.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LIZ = new C53888LCy(EnumC53889LCz.FEED, view, view2, c53873LCj);
                    return;
                }
                this.LIZ = new C53888LCy(EnumC53889LCz.INBOX, view, view2, c53873LCj);
                return;
            }
            this.LIZ = new C53888LCy(EnumC53889LCz.NORMAL, view, view2, c53873LCj);
            return;
        }
        int i2 = C53721L6n.LIZ[enumC53720L6m.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.LIZIZ = new C53883LCt(EnumC53876LCm.FEED, view, view2, c53873LCj);
                return;
            }
            this.LIZIZ = new C53883LCt(EnumC53876LCm.SKYLIGHT, view, view2, c53873LCj);
            return;
        }
        this.LIZIZ = new C53883LCt(EnumC53876LCm.NORMAL, view, view2, c53873LCj);
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZIZ(User user, Class<Object> cls, InterfaceC64592gB<C220938ll> interfaceC64592gB, Aweme aweme) {
        if (this.LIZJ == 0) {
            this.LIZ.LIZ(user, cls, (AfS55S0100000_3) interfaceC64592gB, aweme);
        } else {
            this.LIZIZ.LIZIZ(user, cls, interfaceC64592gB, aweme);
        }
    }

    public C53887LCx(boolean z, C57128MbU c57128MbU, C57127MbT c57127MbT, C53873LCj c53873LCj, EnumC53720L6m enumC53720L6m) {
        int value = LiveAvatarAnimationOptimizeV3Setting.INSTANCE.getValue();
        this.LIZJ = value;
        if (value == 0) {
            int i = C53721L6n.LIZ[enumC53720L6m.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LIZ = new C53888LCy(z, c57128MbU, c57127MbT, c53873LCj, EnumC53889LCz.FEED);
                    return;
                }
                this.LIZ = new C53888LCy(z, c57128MbU, c57127MbT, c53873LCj, EnumC53889LCz.INBOX);
                return;
            }
            this.LIZ = new C53888LCy(z, c57128MbU, c57127MbT, c53873LCj, EnumC53889LCz.NORMAL);
            return;
        }
        int i2 = C53721L6n.LIZ[enumC53720L6m.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.LIZIZ = new C53883LCt(z, c57128MbU, c57127MbT, c53873LCj, EnumC53876LCm.FEED);
                return;
            }
            this.LIZIZ = new C53883LCt(z, c57128MbU, c57127MbT, c53873LCj, EnumC53876LCm.SKYLIGHT);
            return;
        }
        this.LIZIZ = new C53883LCt(z, c57128MbU, c57127MbT, c53873LCj, EnumC53876LCm.NORMAL);
    }
}
