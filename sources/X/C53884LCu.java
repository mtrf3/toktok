package X;

import Y.AfS1S0300100_9;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.LCu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53884LCu implements InterfaceC53713L6f {
    public final C53882LCs LIZ;
    public boolean LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final C53873LCj LJ;
    public boolean LJFF;
    public boolean LJI;
    public Aweme LJII;
    public User LJIIIIZZ;
    public InterfaceC64592gB<C220938ll> LJIIIZ;

    @Override // X.InterfaceC53713L6f
    public final void LJFF() {
        LJIIIIZZ(0);
        LIZ();
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZ() {
        User user;
        long j;
        boolean LJIIIZ = LJIIIZ(this.LJIIIIZZ);
        this.LIZIZ = LJIIIZ;
        String str = this.LIZ.LJI;
        if (!LJIIIZ) {
            LIZLLL();
            InterfaceC64592gB<C220938ll> interfaceC64592gB = this.LJIIIZ;
            if (interfaceC64592gB != null && (user = this.LJIIIIZZ) != null) {
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
            InterfaceC64592gB<C220938ll> interfaceC64592gB2 = this.LJIIIZ;
            if (interfaceC64592gB2 != null) {
                LJIIJ(this.LJIIIIZZ, interfaceC64592gB2, str);
                return;
            }
            return;
        }
        if (this.LJFF || LiveOuterService.LJJJLL().LJJIZ().LJJJLZIJ() || LD5.LIZIZ.LIZ()) {
            return;
        }
        this.LIZ.LIZIZ(this);
        this.LJI = this.LIZ.LJII;
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZLLL() {
        LJIIIIZZ(8);
        LJII();
    }

    @Override // X.InterfaceC53713L6f
    public final void LJ() {
        this.LIZ.LJ(this);
        this.LJI = false;
    }

    @Override // X.InterfaceC53713L6f
    public final void LJI() {
        this.LIZ.LIZIZ(this);
        this.LJI = this.LIZ.LJII;
    }

    @Override // X.InterfaceC53713L6f
    public final void LJII() {
        this.LIZ.LJ(this);
        this.LJI = false;
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZJ() {
        LJII();
        View view = this.LIZJ;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
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
        if (!C77413UZt.LJIIZILJ()) {
            return false;
        }
        if (user == null) {
            return this.LIZIZ;
        }
        Aweme aweme = this.LJII;
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

    public final void LJIIJ(User user, InterfaceC64592gB<C220938ll> interfaceC64592gB, String str) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LiveOuterService.LJJJLL().getLiveStateManager().LJIIIIZZ(user, new AfS1S0300100_9(CastLongProtector.parseLong(uid), this, user, interfaceC64592gB, 1), str);
    }

    public C53884LCu(C53882LCs c53882LCs, View view, View view2, C53873LCj avatarCircleView) {
        o.LJIIIZ(avatarCircleView, "avatarCircleView");
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = avatarCircleView;
        C77413UZt.LJIIZILJ();
        this.LIZIZ = true;
        avatarCircleView.setVisibility(0);
        this.LIZ = c53882LCs;
    }

    @Override // X.InterfaceC53713L6f
    public final void LIZIZ(User user, Class<Object> cls, InterfaceC64592gB<C220938ll> interfaceC64592gB, Aweme aweme) {
        this.LJII = aweme;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        boolean LJIIIZ = LJIIIZ(null);
        this.LIZIZ = LJIIIZ;
        if (LJIIIZ) {
            LJFF();
        } else {
            LIZLLL();
        }
    }
}
