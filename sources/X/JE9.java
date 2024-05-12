package X;

import Y.AObserverS72S0200000_8;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JE9 extends JEA {
    public ViewGroup LJLJJLL;
    public TuxIconView LJLJL;
    public TuxTextView LJLJLJ;
    public C223338pd LJLJLLL;
    public View LJLL;
    public final JEV LJLLI;
    public final JEV LJLLILLLL;
    public final JEV LJLLJ;

    public final void LJIILL() {
        MutableLiveData<E4Y> mutableLiveData = ((ControlOverlayViewModel) this.LJLLJ.getValue()).LJLJI;
        E4Y e4y = E4Y.GONE;
        mutableLiveData.setValue(e4y);
        ((ControlOverlayViewModel) this.LJLLJ.getValue()).LJLJJI.setValue(e4y);
        ((ControlOverlayViewModel) this.LJLLJ.getValue()).LJLJJL.setValue(e4y);
    }

    public final void LJIILLIIL() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            C223338pd c223338pd = this.LJLJLLL;
            if (c223338pd != null) {
                c223338pd.setVisibility(8);
                View view3 = this.LJLL;
                if (view3 != null) {
                    view3.setVisibility(4);
                    return;
                } else {
                    o.LJIJI("transitionLayer");
                    throw null;
                }
            }
            o.LJIJI("dualBallView");
            throw null;
        }
        o.LJIJI("commonStatusView");
        throw null;
    }

    public JE9() {
        super(R.id.hqd);
        this.LJLLI = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipStatusViewViewModel.class));
        this.LJLLILLLL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipFeedWindowVM.class));
        this.LJLLJ = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(ControlOverlayViewModel.class));
    }

    @Override // X.JEA
    public final void LJIILJJIL(View view) {
        View findViewById = view.findViewById(R.id.kfi);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.status_view_icon)");
        this.LJLJL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.kfm);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.status_view_prompt)");
        this.LJLJLJ = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.kfd);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.status_view_dual_ball)");
        this.LJLJLLL = (C223338pd) findViewById3;
        ((PipStatusViewViewModel) this.LJLLI.getValue()).LJLIL.observe(LJIIIIZZ(), new AObserverS72S0200000_8(this, view, 8));
        PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) this.LJLLILLLL.getValue();
        IDqS433S0100000_8 iDqS433S0100000_8 = new IDqS433S0100000_8(this, 6);
        pipFeedWindowVM.getClass();
        ((ArrayList) pipFeedWindowVM.LJLJJLL).add(iDqS433S0100000_8);
    }

    @Override // X.JEA
    public final View LJI(Context context, JEE jee) {
        ColorDrawable colorDrawable;
        FrameLayout frameLayout = new FrameLayout(context);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bzh, C16880lQ.LLZIL(context), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LJLJJLL = viewGroup;
        viewGroup.setVisibility(8);
        frameLayout.addView(LLLZIIL);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Integer LJI = C79045V0n.LJI(R.attr.d4, context);
        if (LJI != null) {
            colorDrawable = new ColorDrawable(LJI.intValue());
        } else {
            colorDrawable = null;
        }
        view.setBackground(colorDrawable);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        this.LJLL = view;
        frameLayout.addView(view);
        frameLayout.setVisibility(0);
        frameLayout.setBackground(null);
        frameLayout.setClickable(false);
        return frameLayout;
    }
}
