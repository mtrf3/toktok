package X;

import Y.AfS60S0100000_8;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKB extends AbstractC48958JJi implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLFFF = 0;
    public final View LJLJLJ;
    public final JGK LJLJLLL;
    public JJK LJLL;
    public final C48887JGp LJLLI;
    public final C164086cG LJLLILLLL;
    public final TuxTextView LJLLJ;
    public final TuxTextView LJLLL;
    public final C72434Sbm LJLLLL;
    public final TuxTextView LJLLLLLL;
    public final View LJLZ;
    public final C164086cG LJZ;
    public final ConstraintLayout LJZI;
    public final ConstraintLayout LJZL;
    public final JKC LL;
    public final int LLD;
    public final int LLF;
    public View.OnClickListener LLFF;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC48958JJi
    public final /* bridge */ /* synthetic */ ImageView N() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC48958JJi
    public final C48887JGp Q() {
        return this.LJLLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JKB(View itemView, JIB jib, C49153JQv c49153JQv, JGU mPlayVideoObserver, View parent, JGK jgk) {
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
        this.LJLLI = c48887JGp;
        C164086cG c164086cG = (C164086cG) itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(c164086cG, "itemView.cover");
        this.LJLLILLLL = c164086cG;
        this.LJLLJ = (TuxTextView) itemView.findViewById(R.id.ifi);
        this.LJLLL = (TuxTextView) itemView.findViewById(R.id.fr4);
        this.LJLLLL = (C72434Sbm) itemView.findViewById(R.id.a_v);
        this.LJLLLLLL = (TuxTextView) itemView.findViewById(R.id.aa0);
        this.LJLZ = itemView.findViewById(R.id.e7o);
        this.LJZ = (C164086cG) itemView.findViewById(R.id.e7p);
        this.LJZI = (ConstraintLayout) itemView.findViewById(R.id.ap_);
        this.LJZL = (ConstraintLayout) itemView.findViewById(R.id.j73);
        this.LL = new JKC(this);
        this.LLD = KL2.LJIIJJI(itemView.getContext());
        this.LLF = KL2.LJIIIZ(itemView.getContext());
        itemView.addOnAttachStateChangeListener(this);
        if (jib.LIZJ() != null && (core = c48887JGp.getCore()) != null && (surfaceHolder = core.getSurfaceHolder()) != null) {
            surfaceHolder.N7(jib.LIZJ());
        }
        C84763XOl.LIZLLL().LJJJJZI(new AfS60S0100000_8(this, 0));
    }
}
