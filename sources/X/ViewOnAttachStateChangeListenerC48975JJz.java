package X;

import Y.AfS60S0100000_8;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JJz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC48975JJz extends AbstractC48958JJi implements View.OnAttachStateChangeListener, InterfaceC49148JQq {
    public static final /* synthetic */ int LLIIIL = 0;
    public final View LJLJLJ;
    public final JGK LJLJLLL;
    public Aweme LJLL;
    public JK3 LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public final C48887JGp LJLLL;
    public final C164086cG LJLLLL;
    public final ConstraintLayout LJLLLLLL;
    public final C59948Nfs LJLZ;
    public final TuxTextView LJZ;
    public final TuxTextView LJZI;
    public final ConstraintLayout LJZL;
    public final RelativeLayout LL;
    public final TuxTextView LLD;
    public final RelativeLayout LLF;
    public final FrameLayout LLFF;
    public JQA LLFFF;
    public View.OnClickListener LLFII;
    public C49448Jau LLFZ;
    public final JHE LLI;
    public final int LLIFFJFJJ;
    public final int LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public JPL LLIIIJ;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC48958JJi, X.InterfaceC48908JHk
    public final void LLLLLJLJLL() {
        JGI core = this.LJLLL.getCore();
        if (core != null) {
            C48905JHh.LIZIZ(core);
        }
    }

    public final void T() {
        C48881JGj v;
        JGL jgl;
        if (v() == null || this.LJLLL == null || (v = v()) == null || v.LIZJ == null) {
            return;
        }
        C48881JGj v2 = v();
        o.LJI(v2);
        JHI.LIZ().LJIIJJI = true;
        C48892JGu.LIZ(v2, false);
        View.OnClickListener onClickListener = this.LLFII;
        if (onClickListener != null) {
            onClickListener.onClick(this.LJLLL);
        }
        JK3 jk3 = this.LJLLI;
        if (jk3 != null) {
            jk3.G5();
        }
        JPL jpl = this.LLIIIJ;
        if (jpl != null) {
            jpl.G5();
        }
        JGI core = this.LJLLL.getCore();
        if (core != null && (jgl = core.LLIIIILZ) != null) {
            jgl.LLLJL();
        }
        JPL jpl2 = this.LLIIIJ;
        if (jpl2 == null) {
            return;
        }
        jpl2.LIZJ();
    }

    @Override // X.AbstractC48958JJi
    public final /* bridge */ /* synthetic */ ImageView N() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC48958JJi
    public final C48887JGp Q() {
        return this.LJLLL;
    }

    @Override // X.AbstractC48958JJi, X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        JGI core = this.LJLLL.getCore();
        if (core != null) {
            JIC.LIZ(core);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        o.LJIIIZ(p0, "p0");
        JK3 jk3 = this.LJLLI;
        if (jk3 != null) {
            jk3.LJIIIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnAttachStateChangeListenerC48975JJz(View itemView, JIB jib, C49153JQv c49153JQv, JGU mPlayVideoObserver, View parent, JGK jgk) {
        super(itemView, jib, c49153JQv, mPlayVideoObserver);
        JGI core;
        InterfaceC47247IgV surfaceHolder;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(mPlayVideoObserver, "mPlayVideoObserver");
        o.LJIIIZ(parent, "parent");
        this.LJLJLJ = parent;
        this.LJLJLLL = jgk;
        C48887JGp c48887JGp = (C48887JGp) itemView.findViewById(R.id.n9f);
        o.LJIIIIZZ(c48887JGp, "itemView.video_view");
        this.LJLLL = c48887JGp;
        C164086cG c164086cG = (C164086cG) itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(c164086cG, "itemView.cover");
        this.LJLLLL = c164086cG;
        this.LJLLLLLL = (ConstraintLayout) itemView.findViewById(R.id.i0r);
        this.LJLZ = (C59948Nfs) itemView.findViewById(R.id.ub);
        this.LJZ = (TuxTextView) itemView.findViewById(R.id.fr4);
        this.LJZI = (TuxTextView) itemView.findViewById(R.id.hes);
        this.LJZL = (ConstraintLayout) itemView.findViewById(R.id.heq);
        this.LL = (RelativeLayout) itemView.findViewById(R.id.her);
        this.LLD = (TuxTextView) itemView.findViewById(R.id.ep9);
        this.LLF = (RelativeLayout) itemView.findViewById(R.id.ep8);
        this.LLFF = (FrameLayout) itemView.findViewById(R.id.i0t);
        this.LLI = new JHE(this);
        this.LLIFFJFJJ = KL2.LJIIJJI(itemView.getContext());
        this.LLII = KL2.LJIIIZ(itemView.getContext());
        this.LLIIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 568));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 567));
        itemView.addOnAttachStateChangeListener(this);
        if (jib.LIZJ() != null && (core = c48887JGp.getCore()) != null && (surfaceHolder = core.getSurfaceHolder()) != null) {
            surfaceHolder.N7(jib.LIZJ());
        }
        C84763XOl.LIZLLL().LJJJJZI(new AfS60S0100000_8(this, 18));
    }
}
