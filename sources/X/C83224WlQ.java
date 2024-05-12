package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WlQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83224WlQ extends TDG {
    public static final C83226WlS LLILLL = new C83226WlS();
    public final ImageView LLILLIZIL;
    public C83227WlT LLILLJJLI;

    public final C83227WlT getConfig() {
        return this.LLILLJJLI;
    }

    private final void setIconEnableUi(boolean z) {
        if (z) {
            getImageView().clearColorFilter();
        } else {
            getImageView().setColorFilter(R.color.dz, PorterDuff.Mode.DST_IN);
        }
    }

    @Override // X.TDG
    public final View LJ(Context context) {
        o.LJIIIZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 4.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LIZIZ, LIZIZ);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // X.TDG
    public final View LJII(Context context) {
        o.LJIIIZ(context, "context");
        this.LLILLJJLI.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C83258Wly.LIZIZ(context), -2);
        C8HN c8hn = new C8HN(context);
        c8hn.setLayoutParams(layoutParams);
        c8hn.setGravity(17);
        return c8hn;
    }

    @Override // X.TDG
    public final void LJIIJ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            View dotView = getDotView();
            if (dotView != null) {
                layoutParams = dotView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 81;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            layoutParams2.topMargin = (int) C74275TDb.LIZIZ(context, this.LLILLJJLI.LJIJ);
            View dotView2 = getDotView();
            if (dotView2 != null) {
                dotView2.setLayoutParams(layoutParams2);
            }
        }
        super.LJIIJ(z);
    }

    public final void setConfig(C83227WlT c83227WlT) {
        o.LJIIIZ(c83227WlT, "<set-?>");
        this.LLILLJJLI = c83227WlT;
    }

    @Override // X.TDG
    public void setCustomSelected(boolean z) {
        Resources resources;
        int i;
        super.setCustomSelected(z);
        if (z) {
            resources = getResources();
            i = this.LLILLJJLI.LJIIIZ;
        } else {
            resources = getResources();
            i = this.LLILLJJLI.LJIJJ;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setEnableUI(boolean z) {
        LJIIL(z, false);
    }

    public final void setTextEnableUi(boolean z) {
        Resources resources;
        int i;
        if (z) {
            resources = getResources();
            i = this.LLILLJJLI.LJIJJ;
        } else {
            resources = getResources();
            i = R.color.dz;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83224WlQ(Context context, C83227WlT c83227WlT) {
        super(context, c83227WlT.LIZ, c83227WlT.LIZIZ, c83227WlT.LIZJ, c83227WlT.LIZLLL, 0, 0, c83227WlT.LJ, c83227WlT.LJFF, 0, 0, c83227WlT.LJII, c83227WlT.LJIIIIZZ, 0, 0, c83227WlT.LJIIIZ, c83227WlT.LJIIJ, c83227WlT.LJIIJJI, c83227WlT.LJIIL, c83227WlT.LJIILL, c83227WlT.LJIILLIIL, c83227WlT.LJIIZILJ, c83227WlT.LJIJJLI, false, false, true, c83227WlT.LJIILIIL, c83227WlT.LJI, false, false, false, false, false, false, c83227WlT.LJIILJJIL, -243269632, 3);
        o.LJIIIZ(context, "context");
        this.LLILLJJLI = c83227WlT;
        LIZJ(context);
        View findViewById = findViewById(R.id.f29);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_edit_icon)");
        this.LLILLIZIL = (ImageView) findViewById;
    }

    public final void LJIIL(boolean z, boolean z2) {
        int color;
        if (this.LLILLJJLI.LJIL) {
            setIconEnableUi(z);
        }
        if (z2) {
            if (z) {
                color = getResources().getColor(this.LLILLJJLI.LJIJI);
            }
            color = getResources().getColor(R.color.dz);
        } else {
            if (z) {
                color = getResources().getColor(this.LLILLJJLI.LJIILLIIL);
            }
            color = getResources().getColor(R.color.dz);
        }
        View dotView = getDotView();
        if (dotView != null) {
            TDY tdy = new TDY();
            tdy.LIZLLL(1);
            tdy.LIZIZ(color);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            tdy.LJ(color, (int) C74275TDb.LIZIZ(context, this.LLILLJJLI.LJIIZILJ));
            dotView.setBackground(tdy.LIZ());
        }
    }
}
