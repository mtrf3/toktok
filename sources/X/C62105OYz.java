package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS14S0400000_10;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS29S0200000_10;
import Y.IDLListenerS58S0200000_4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OYz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62105OYz implements InterfaceC62102OYw {
    public final ShareInviteContentVM LIZ;
    public C113914dX LIZIZ;
    public SmartAvatarImageView LIZJ;
    public TuxIconView LIZLLL;
    public TuxIconView LJ;
    public TuxIconView LJFF;

    @Override // X.InterfaceC62102OYw
    public final C113914dX LIZJ() {
        C113914dX c113914dX = this.LIZIZ;
        if (c113914dX != null) {
            return c113914dX;
        }
        o.LJIJI("shareChannelBar");
        throw null;
    }

    public C62105OYz(ShareInviteContentVM shareInviteContentVM) {
        this.LIZ = shareInviteContentVM;
    }

    public static void LIZLLL(TuxIconView tuxIconView) {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(14);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
        Context context = tuxIconView.getContext();
        o.LJIIIIZZ(context, "iconView.context");
        tuxIconView.setBackground(c110614Vt.LIZ(context));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_tick_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.eb);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        tuxIconView.setTuxIcon(c2068389v);
    }

    public static void LJ(TuxIconView tuxIconView) {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(14);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        Context context = tuxIconView.getContext();
        o.LJIIIIZZ(context, "iconView.context");
        tuxIconView.setBackground(c110614Vt.LIZ(context));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_plus_small;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LJ = Integer.valueOf(R.attr.cl);
        tuxIconView.setTuxIcon(c2068389v);
    }

    @Override // X.InterfaceC62102OYw
    public final void LIZIZ(View view) {
        User curUser;
        UrlModel avatarThumb;
        this.LIZIZ = (C113914dX) C7MY.LIZLLL(view, "view", R.id.jsw, "view.findViewById(R.id.share_channel_bar)");
        View findViewById = view.findViewById(R.id.gvq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.myself_avatar)");
        this.LIZJ = (SmartAvatarImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.gvr);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.myself_follow_icon)");
        this.LIZLLL = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.he3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.other_follow_icon)");
        this.LJ = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gjc);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.middle_icon)");
        this.LJFF = (TuxIconView) findViewById4;
        LinearLayout bottomContainer = (LinearLayout) view.findViewById(R.id.ap_);
        TuxIconView tuxIconView = this.LIZLLL;
        if (tuxIconView != null) {
            LJ(tuxIconView);
            TuxIconView tuxIconView2 = this.LJ;
            if (tuxIconView2 != null) {
                LJ(tuxIconView2);
                SmartAvatarImageView smartAvatarImageView = this.LIZJ;
                if (smartAvatarImageView != null) {
                    IAccountUserService LJIILL = HG3.LJIILL();
                    if (LJIILL != null && (curUser = ((RBX) LJIILL).getCurUser()) != null && (avatarThumb = curUser.getAvatarThumb()) != null) {
                        W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
                        LJII.LJJIIJ = smartAvatarImageView;
                        LJII.LIZIZ("ShareInviteSheet");
                        C16880lQ.LLJJJ(LJII);
                    }
                    o.LJIIIIZZ(bottomContainer, "bottomContainer");
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                    c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                    c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
                    Context context = bottomContainer.getContext();
                    o.LJIIIIZZ(context, "container.context");
                    bottomContainer.setBackground(c110614Vt.LIZ(context));
                    C16880lQ.LJIIZILJ(bottomContainer, new ACListenerS30S0100000_10(this, 161));
                    if (C53282Kve.LIZJ) {
                        C53282Kve.LIZJ = false;
                        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 207);
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(view, aqS176S0100000_10, 5));
                            return;
                        }
                        return;
                    }
                    TuxIconView tuxIconView3 = this.LIZLLL;
                    if (tuxIconView3 != null) {
                        LIZLLL(tuxIconView3);
                        TuxIconView tuxIconView4 = this.LJ;
                        if (tuxIconView4 != null) {
                            LIZLLL(tuxIconView4);
                            TuxIconView tuxIconView5 = this.LJFF;
                            if (tuxIconView5 != null) {
                                tuxIconView5.setAlpha(1.0f);
                                return;
                            } else {
                                o.LJIJI("middleIcon");
                                throw null;
                            }
                        }
                        o.LJIJI("otherFollowIcon");
                        throw null;
                    }
                    o.LJIJI("myFollowIcon");
                    throw null;
                }
                o.LJIJI("myAvatar");
                throw null;
            }
            o.LJIJI("otherFollowIcon");
            throw null;
        }
        o.LJIJI("myFollowIcon");
        throw null;
    }

    public final void LJFF(TuxIconView tuxIconView) {
        Interpolator LIZ = C55953Lxd.LIZ();
        new ARunnableS21S0300000_10(tuxIconView, LIZ, new ARunnableS21S0300000_10(tuxIconView, LIZ, new ARunnableS14S0400000_10(this, LIZ, new ARunnableS29S0200000_10(tuxIconView, LIZ, 57), tuxIconView, 10), 24), 23).run();
    }

    @Override // X.InterfaceC62102OYw
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ayi, viewGroup, false, "inflater.inflate(R.layou…agment, container, false)");
    }
}
