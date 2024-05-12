package X;

import Y.AUListenerS93S0100000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.LKx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54095LKx implements LM4, InterfaceC54084LKm {
    public final ActivityC45651qj LJLIL;
    public final LNP LJLILLLLZI;
    public final String LJLJI;
    public int LJLJJI;
    public View.OnClickListener LJLJJL;
    public View LJLJJLL;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388627;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.InterfaceC54084LKm
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean enabled() {
        return true;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    @Override // X.InterfaceC54084LKm
    public final void LIZLLL() {
        LJFF(this.LJLJJLL);
    }

    @Override // X.LM4
    public final View LJII() {
        Activity LJIILL = C78949Uyf.LJIILL(this.LJLIL);
        if (LJIILL != null) {
            this.LJLJJL = C55888Lwa.LIZIZ.LJIJI(LJIILL);
        }
        View buildInboxIcon = HomePageUIFrameServiceImpl.LIZ().buildInboxIcon(this.LJLILLLLZI.getActivity());
        this.LJLJJLL = buildInboxIcon;
        return buildInboxIcon;
    }

    @Override // X.InterfaceC54084LKm
    public final void LJIIIZ() {
        C55888Lwa.LIZIZ.LJJIJIIJIL();
    }

    @Override // X.InterfaceC54084LKm
    public final void LJIILL() {
        C55888Lwa.LIZIZ.LJJJI();
    }

    @Override // X.InterfaceC54084LKm
    public final C53516KzQ LJIILLIIL() {
        int LJJIIZ;
        int LJJIIZ2;
        String str;
        Resources resources;
        if (this.LJLJJI == 5) {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        }
        View view = this.LJLJJLL;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null && (resources = activityC45651qj.getResources()) != null) {
            str = resources.getString(R.string.ry9);
        } else {
            str = null;
        }
        return new C53516KzQ(view, str, this.LJLJJI, LJJIIZ, LJJIIZ2);
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        if (C40471FuV.LIZ() && C53297Kvt.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJI;
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        Bundle bundle;
        Boolean LJ = C27740Aue.LJ(view);
        o.LJIIIIZZ(LJ, "isDoubleClick(v)");
        if (LJ.booleanValue()) {
            return;
        }
        C221018lt.LJFF("InboxTopIconGenerator", "onIconClick");
        View.OnClickListener onClickListener = this.LJLJJL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            Intent intent = activityC45651qj.getIntent();
            if (intent == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
                bundle = new Bundle();
            }
            bundle.putString("fromStart", "RootNode");
            bundle.putBoolean("isSmoothScroll", true);
            bundle.putString("enter_from", "click_top_icon");
            com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Cv0(bundle, "NOTIFICATION");
        }
    }

    @Override // X.InterfaceC54084LKm
    public final ImageView LJI(Context context) {
        o.LJIIIZ(context, "context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZ = R.raw.icon_inbox;
        c2068389v.LJ = Integer.valueOf(R.attr.do);
        c2068389v.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C7FC.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c2068389v);
        tuxIconView.setClickable(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
        layoutParams.gravity = 17;
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }

    @Override // X.InterfaceC54084LKm
    public final Animator LJIIIIZZ(TuxIconView view) {
        o.LJIIIZ(view, "view");
        Context LIZIZ = EF7.LIZIZ();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(b.LIZIZ(R.attr.d4, LIZIZ), b.LIZIZ(R.attr.dj, LIZIZ));
        ofArgb.setInterpolator(new LinearInterpolator());
        ofArgb.setDuration(100L);
        ofArgb.addUpdateListener(new AUListenerS93S0100000_4(view, 65));
        return ofArgb;
    }

    public C54095LKx(ActivityC45651qj activityC45651qj, LNP environmentConfig) {
        o.LJIIIZ(environmentConfig, "environmentConfig");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = environmentConfig;
        this.LJLJI = LMF.INBOX.getTag();
        this.LJLJJI = 8388611;
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
        if (lmx != null) {
            lmx.LIZIZ("NOTIFICATION", this);
        }
        if (i != 8388611) {
            if (i != 8388613) {
                return;
            }
            this.LJLJJI = 5;
            return;
        }
        this.LJLJJI = 3;
    }
}
