package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109044Ps implements InterfaceC108974Pl {
    public final Context LIZ;
    public SharePanelViewModel LIZIZ;
    public final boolean LIZJ;
    public ViewGroup LIZLLL;
    public C119354mJ LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public View LJII;
    public View LJIIIIZZ;
    public IMContact LJIIIZ;
    public C108914Pf LJIIJ;

    @Override // X.InterfaceC108974Pl
    public final void LIZ() {
        View view = this.LJIIIIZZ;
        if (view != null) {
            C17N.LJJLIIIJJI(view);
        }
        C119354mJ c119354mJ = this.LJ;
        if (c119354mJ != null) {
            C17N.LJJIIJZLJL(c119354mJ);
        }
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            C17N.LJJIIJZLJL(tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LJI;
        if (tuxTextView2 != null) {
            C17N.LJJLIIIJJI(tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(R.string.tdh);
        }
        View view2 = this.LJII;
        if (view2 != null) {
            C17N.LJJIIJZLJL(view2);
        }
    }

    @Override // X.InterfaceC108974Pl
    public final void LIZIZ() {
        IMContact iMContact = this.LJIIIZ;
        if (iMContact != null) {
            iMContact.setShareSuccess(true);
        }
        View view = this.LJIIIIZZ;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
        }
        LJ();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.LIZ, R.anim.cu);
        View view2 = this.LJII;
        if (view2 != null) {
            view2.startAnimation(loadAnimation);
        }
        View view3 = this.LJII;
        if (view3 != null) {
            C17N.LJJLIIIJJI(view3);
        }
    }

    @Override // X.InterfaceC108974Pl
    public final void LIZJ() {
        View view = this.LJIIIIZZ;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
        }
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            C17N.LJJLIIIJJI(tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LJI;
        if (tuxTextView2 != null) {
            C17N.LJJIIJZLJL(tuxTextView2);
        }
        LJFF();
        Fragment fragment = this.LIZIZ.LLII;
        if (fragment == null) {
            return;
        }
        C31811Ce7.LIZJ(fragment, R.string.a2c);
    }

    public final void LJ() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.eb, this.LIZ);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C29822Bn8.LIZ(this.LIZ, R.string.cp9, "context.resources.getStr…chat_share_panel_send_to)"));
        spannableStringBuilder.append((CharSequence) "*");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(c2068389v.LIZIZ(2, this.LIZ), length - 1, length, 17);
        TuxTextView tuxTextView = this.LJI;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(spannableStringBuilder);
    }

    public final void LJFF() {
        IMUser iMUser;
        IMContact iMContact = this.LJIIIZ;
        if ((iMContact instanceof IMUser) && (iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null && iMUser.isOnline() && this.LIZJ) {
            C119354mJ c119354mJ = this.LJ;
            if (c119354mJ != null) {
                c119354mJ.setActive(true);
            }
            C119354mJ c119354mJ2 = this.LJ;
            if (c119354mJ2 == null) {
                return;
            }
            c119354mJ2.setVisibility(0);
            return;
        }
        C119354mJ c119354mJ3 = this.LJ;
        if (c119354mJ3 == null) {
            return;
        }
        c119354mJ3.setVisibility(8);
    }

    public final void LIZLLL(ViewGroup viewGroup) {
        this.LIZLLL = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.abt);
        View findViewById2 = findViewById.findViewById(R.id.efw);
        this.LJIIIIZZ = findViewById2;
        if (findViewById2 != null) {
            C17N.LJJIIJZLJL(findViewById2);
        }
        View findViewById3 = findViewById.findViewById(R.id.efv);
        this.LJII = findViewById3;
        if (findViewById3 != null) {
            C17N.LJJIIJZLJL(findViewById3);
        }
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.efu);
        this.LJI = tuxTextView;
        if (tuxTextView != null) {
            C17N.LJJIIJZLJL(tuxTextView);
        }
        this.LJFF = (TuxTextView) viewGroup.findViewById(R.id.gw7);
        this.LJ = (C119354mJ) viewGroup.findViewById(R.id.pq);
        if (C90193gN.LIZ()) {
            View view = this.LJII;
            if (view != null) {
                view.setTranslationX(C32151Nz.LJIIZILJ(-3));
            }
            C119354mJ c119354mJ = this.LJ;
            if (c119354mJ != null) {
                c119354mJ.setTranslationX(C32151Nz.LJIIZILJ(-3));
            }
        }
        Integer LJI = C79045V0n.LJI(R.attr.c9, this.LIZ);
        if (LJI != null) {
            int intValue = LJI.intValue();
            C119354mJ c119354mJ2 = this.LJ;
            if (c119354mJ2 != null) {
                c119354mJ2.setStrokeColor(intValue);
            }
        }
        View findViewById4 = viewGroup.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.avatar_iv)");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 244), findViewById4);
        TuxTextView tuxTextView2 = this.LJFF;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS21S0100000_1(this, 245));
        }
        TuxTextView tuxTextView3 = this.LJI;
        if (tuxTextView3 != null) {
            C16880lQ.LJJJJI(tuxTextView3, new ACListenerS21S0100000_1(this, 246));
        }
    }

    public C109044Ps(Context context, SharePanelViewModel sharePanelViewModel) {
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        this.LIZ = context;
        this.LIZIZ = sharePanelViewModel;
        this.LIZJ = true;
        this.LJIIJ = new C108914Pf(context, sharePanelViewModel, this);
    }
}
