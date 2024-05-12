package X;

import Y.ACListenerS21S0100000_1;
import Y.ALAdapterS0S0100000_1;
import Y.ALAdapterS0S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4S3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S3 extends PopupWindow {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final CardView LJII;
    public final Animation LJIIIIZZ;
    public final Animation LJIIIZ;
    public final Animation LJIIJ;
    public final Animation LJIIJJI;
    public final long LJIIL = 150;
    public C1030342p LJIILIIL;
    public final RecyclerView LJIILJJIL;
    public final View LJIILL;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.LIZLLL.animate().alpha(0.0f).setDuration(this.LJIIL).setListener(new ALAdapterS0S0200000_1(this, new ALAdapterS0S0100000_1(this, 11), 5)).start();
        C1030342p c1030342p = this.LJIILIIL;
        if (c1030342p != null) {
            c1030342p.LIZIZ();
        }
    }

    public final void LIZ() {
        super.dismiss();
        C1030342p c1030342p = this.LJIILIIL;
        if (c1030342p != null) {
            c1030342p.onDismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        o.LJIIIZ(parent, "parent");
        super.showAtLocation(parent, i, i2, i3);
        parent.post(new ARunnableS37S0100000_1(this, 121));
    }

    public C4S3(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        Animation loadAnimation;
        Animation loadAnimation2;
        this.LIZ = i3;
        this.LIZIZ = z;
        this.LIZJ = z2;
        setContentView(C16880lQ.LLLZIIL(R.layout.b9d, C16880lQ.LLZIL(context), null));
        setWidth(-1);
        setHeight(-1);
        setFocusable(true);
        if (C26338AVi.LIZJ(context)) {
            this.LIZIZ = !z;
        }
        View findViewById = getContentView().findViewById(R.id.gf1);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.mask_view_container)");
        this.LIZLLL = findViewById;
        View findViewById2 = getContentView().findViewById(R.id.gf2);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.mask_view_title_bar)");
        this.LJ = findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.gez);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById….mask_view_above_message)");
        this.LJFF = findViewById3;
        View findViewById4 = getContentView().findViewById(R.id.gf0);
        o.LJIIIIZZ(findViewById4, "contentView.findViewById….mask_view_below_message)");
        this.LJI = findViewById4;
        View findViewById5 = getContentView().findViewById(R.id.cup);
        o.LJIIIIZZ(findViewById5, "contentView.findViewById…id.emoji_selection_panel)");
        this.LJII = (CardView) findViewById5;
        if (this.LIZIZ) {
            loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cv);
            o.LJIIIIZZ(loadAnimation, "{\n            AnimationU…nter_from_left)\n        }");
        } else {
            loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cw);
            o.LJIIIIZZ(loadAnimation, "{\n            AnimationU…ter_from_right)\n        }");
        }
        this.LJIIIIZZ = loadAnimation;
        if (this.LIZIZ) {
            loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cx);
            o.LJIIIIZZ(loadAnimation2, "{\n            AnimationU…l_exit_to_left)\n        }");
        } else {
            loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cy);
            o.LJIIIIZZ(loadAnimation2, "{\n            AnimationU…_exit_to_right)\n        }");
        }
        this.LJIIIZ = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.cr);
        loadAnimation3.setDuration(150L);
        loadAnimation3.setInterpolator(new C30911Jf());
        this.LJIIJ = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.ct);
        loadAnimation4.setDuration(150L);
        loadAnimation4.setInterpolator(new AccelerateInterpolator());
        loadAnimation4.setFillAfter(true);
        this.LJIIJJI = loadAnimation4;
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 221), findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            findViewById3.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = findViewById4.getLayoutParams();
            if (layoutParams2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.topMargin = i2;
                findViewById4.setLayoutParams(layoutParams3);
                new AlphaAnimation(0.0f, 1.0f);
                LayoutInflater LLZIL = C16880lQ.LLZIL(context);
                View contentView = getContentView();
                o.LJII(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LLLZIIL(R.layout.b6q, LLZIL, (ViewGroup) contentView);
                View findViewById6 = getContentView().findViewById(R.id.ol);
                o.LJIIIIZZ(findViewById6, "contentView.findViewById(R.id.action_panel_root)");
                this.LJIILL = findViewById6;
                View findViewById7 = getContentView().findViewById(R.id.om);
                o.LJIIIIZZ(findViewById7, "contentView.findViewById(R.id.action_rv)");
                RecyclerView recyclerView = (RecyclerView) findViewById7;
                this.LJIILJJIL = recyclerView;
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                C49T LIZ = C49R.LIZ();
                Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, context);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    findViewById6.setBackgroundColor(intValue);
                    findViewById3.setBackgroundColor(intValue);
                    findViewById4.setBackgroundColor(intValue);
                    findViewById3.setAlpha(0.9f);
                    findViewById4.setAlpha(0.9f);
                }
                View findViewById8 = getContentView().findViewById(R.id.le1);
                o.LJIIIIZZ(findViewById8, "contentView.findViewById…ew>(R.id.top_action_line)");
                findViewById8.setVisibility(LIZ.LJLJI ? 0 : 8);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
