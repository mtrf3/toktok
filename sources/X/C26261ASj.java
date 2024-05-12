package X;

import Y.ACListenerS39S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ASj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26261ASj implements InterfaceC62549Ogj {
    public final C26275ASx LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1150));

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        AS9 as9;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZ;
        }
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx != null && (as9 = c26275ASx.LIZ) != null) {
            return as9.LJLIL;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        AS9 as9;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZIZ;
        }
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx != null && (as9 = c26275ASx.LIZ) != null) {
            return as9.LJLIL;
        }
        return -1;
    }

    @Override // X.InterfaceC62549Ogj
    public final boolean LJIJJ() {
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx != null && c26275ASx.LIZJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        AS9 as9;
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx != null && (as9 = c26275ASx.LIZ) != null) {
            return as9.LJLILLLLZI;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        AS9 as9;
        String str;
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx == null || (as9 = c26275ASx.LIZ) == null || (str = as9.LJLJI) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL) {
            return R.attr.gp;
        }
        return R.attr.gu;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.LongPress;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public C26261ASj(C26275ASx c26275ASx) {
        this.LJLIL = c26275ASx;
    }

    @Override // X.InterfaceC62549Ogj
    public final void LJIIIIZZ(View view) {
        String str;
        int i;
        FragmentManager supportFragmentManager;
        AS9 as9;
        ASB asb;
        o.LJIIIZ(view, "view");
        C26275ASx c26275ASx = this.LJLIL;
        if (c26275ASx != null && (asb = c26275ASx.LIZJ) != null) {
            str = asb.LIZLLL();
        } else {
            str = null;
        }
        if (o.LJ(str, "secondary_dislike")) {
            ASB asb2 = this.LJLIL.LIZJ;
            o.LJII(asb2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.ToSecondaryAction");
            AS0 as0 = (AS0) asb2;
            as0.LJ();
            List<AS4> actions = as0.LJLJJI.LIZLLL(null);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            ASE ase = new ASE(context);
            o.LJIIIZ(actions, "actions");
            ase.LJLIL = actions;
            ASC asc = ase.LJLILLLLZI;
            asc.getClass();
            asc.LJLILLLLZI = actions;
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZLLL = false;
            C9KF c9kf = new C9KF();
            Context context2 = view.getContext();
            C26275ASx c26275ASx2 = this.LJLIL;
            if (c26275ASx2 != null && (as9 = c26275ASx2.LIZ) != null) {
                i = as9.LJLILLLLZI;
            } else {
                i = -1;
            }
            String string = context2.getString(i);
            o.LJIIIIZZ(string, "view.context.getString(item?.vo?.textResId ?: -1)");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS154S0100000_4(ase, 1151));
            c235119Kp.LIZIZ(LIZJ);
            ase.getNavBar().setNavActions(c235119Kp);
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJZL = true;
            tuxSheet.LJZI = true;
            tuxSheet.LJLILLLLZI = DialogInterfaceOnDismissListenerC26262ASk.LJLIL;
            tuxSheet.LJLLI = ase;
            Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.c9);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLJL = LIZIZ;
            ase.LJLJI = new ASF(tuxSheet2, view);
            ActivityC45651qj LJ = C1DG.LJ(view, "view.context");
            if (LJ == null || (supportFragmentManager = LJ.getSupportFragmentManager()) == null) {
                return;
            }
            tuxSheet2.show(supportFragmentManager, "");
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        o.LJIIIZ(textView, "textView");
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        ASB asb;
        ASB asb2;
        ASB asb3;
        View findViewById;
        ASB asb4;
        o.LJIIIZ(view, "view");
        C26275ASx c26275ASx = this.LJLIL;
        ASB asb5 = null;
        if (c26275ASx != null) {
            asb5 = c26275ASx.LIZIZ;
        }
        if (asb5 instanceof C62436Oeu) {
            String string = ((C62436Oeu) asb5).LJLJJI.LJLJLJ.extras.getString("enter_method");
            if (string == null) {
                string = "share_panel";
            }
            if (TextUtils.equals(string, "long_press") && C62483Off.LIZJ() != EnumC62492Ofo.VERTICAL && LJIJJ()) {
                C26275ASx c26275ASx2 = this.LJLIL;
                if (c26275ASx2 != null) {
                    if (c26275ASx2.LIZJ != null) {
                        ASB asb6 = c26275ASx2.LIZIZ;
                        o.LJII(asb6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.NotInterestedAction");
                        C62436Oeu c62436Oeu = (C62436Oeu) asb6;
                        c62436Oeu.LJLJJI.LJLJLJ.extras.putBoolean("enable_secondary_actions", true);
                        C2U8.LIZ(new C55045Liz(c62436Oeu.LJLJJI.LJLIL, this.LJLIL.LIZIZ.LJLJI));
                        C26275ASx c26275ASx3 = this.LJLIL;
                        if (c26275ASx3 != null && (asb4 = c26275ASx3.LIZIZ) != null) {
                            asb4.LIZIZ(view);
                        }
                        if (o.LJ("homepage_explore", this.LJLIL.LIZIZ.LJLJI)) {
                            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                            if (LJIIIIZZ != null) {
                                C5S1 c5s1 = new C5S1(LJIIIIZZ);
                                c5s1.LIZJ(R.string.te_);
                                c5s1.LJ();
                                return;
                            }
                            return;
                        }
                        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ2 == null || (findViewById = LJIIIIZZ2.getWindow().getDecorView().findViewById(R.id.ncx)) == null) {
                            return;
                        }
                        View decorView = LJIIIIZZ2.getWindow().getDecorView();
                        o.LJIIIIZZ(decorView, "it.window.decorView");
                        int LIZJ = C47959Irz.LIZJ(12, C47959Irz.LIZJ(60, C73098SmU.LIZJ(decorView).bottom - C73098SmU.LIZJ(findViewById).bottom));
                        AKT akt = new AKT(LJIIIIZZ2);
                        akt.LJ(R.style.ux);
                        akt.LIZ.LJLILLLLZI = 0;
                        akt.LJFF(R.string.te_);
                        akt.LIZ.LJLJJI = 2;
                        akt.LIZLLL(R.string.hn1);
                        C208158Ex c208158Ex = akt.LIZ;
                        c208158Ex.LJLJL = LIZJ;
                        c208158Ex.LJLJLJ = new ACListenerS39S0200000_4(this, view, 84);
                        akt.LJII();
                        return;
                    }
                    if (c26275ASx2 == null || (asb3 = c26275ASx2.LIZIZ) == null) {
                        return;
                    }
                    asb3.LIZIZ(view);
                    return;
                }
                return;
            }
            C26275ASx c26275ASx4 = this.LJLIL;
            if (c26275ASx4 == null || (asb2 = c26275ASx4.LIZIZ) == null) {
                return;
            }
            asb2.LIZIZ(view);
            return;
        }
        if (c26275ASx == null || (asb = c26275ASx.LIZIZ) == null) {
            return;
        }
        asb.LIZIZ(view);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ view, BaseSharePackage sharePackage) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sharePackage, "sharePackage");
        C62485Ofh.LIZ(this, view, sharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        C62485Ofh.LIZJ(context, sharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        C62485Ofh.LIZLLL(iconView, view);
    }
}
