package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ZlK, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90862ZlK extends AbstractC90587Zgt {
    public final View LJLJJL;
    public final ImageView LJLJJLL;
    public final ProgressBar LJLJL;
    public final TextView LJLJLJ;
    public final RelativeLayout LJLJLLL;
    public final CheckBox LJLL;
    public final float LJLLI;
    public final int LJLLILLLL;
    public final View.OnClickListener LJLLJ;
    public final /* synthetic */ C90591Zgx LJLLL;

    public final boolean M(ZY4 zy4) {
        C90092ZXk c90092ZXk;
        if (zy4.LJI()) {
            return true;
        }
        ZY3 LIZ = this.LJLLL.LJLL.LJLJJLL.LIZ(zy4);
        if (LIZ != null && (c90092ZXk = LIZ.LIZ) != null && c90092ZXk.LIZIZ == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90862ZlK(C90591Zgx c90591Zgx, View view) {
        super(c90591Zgx.LJLL, view, (ImageButton) view.findViewById(R.id.ao), (C90572Zge) view.findViewById(R.id.au));
        this.LJLLL = c90591Zgx;
        this.LJLLJ = new IDCListenerS136S0100000_24(this, 7);
        this.LJLJJL = view;
        this.LJLJJLL = (ImageView) view.findViewById(R.id.ap);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.ar);
        this.LJLJL = progressBar;
        this.LJLJLJ = (TextView) view.findViewById(R.id.aq);
        this.LJLJLLL = (RelativeLayout) view.findViewById(R.id.at);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.ab);
        this.LJLL = checkBox;
        Context context = c90591Zgx.LJLL.LJLLI;
        Drawable LJFF = C07840Sm.LJFF(C04270Et.LIZIZ(context, R.drawable.fy));
        if (ZXT.LJIIIIZZ(context)) {
            C07820Sk.LJI(LJFF, C04330Ez.LIZIZ(context, R.color.a9));
        }
        checkBox.setButtonDrawable(LJFF);
        ZXT.LJIIJ(c90591Zgx.LJLL.LJLLI, progressBar);
        this.LJLLI = ZXT.LIZLLL(c90591Zgx.LJLL.LJLLI);
        Resources resources = c90591Zgx.LJLL.LJLLI.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.am, typedValue, true);
        this.LJLLILLLL = (int) typedValue.getDimension(displayMetrics);
    }

    public final void N(boolean z, boolean z2) {
        int i = 0;
        this.LJLL.setEnabled(false);
        this.LJLJJL.setEnabled(false);
        this.LJLL.setChecked(z);
        if (z) {
            this.LJLJJLL.setVisibility(4);
            this.LJLJL.setVisibility(0);
        }
        if (z2) {
            C90591Zgx c90591Zgx = this.LJLLL;
            RelativeLayout relativeLayout = this.LJLJLLL;
            if (z) {
                i = this.LJLLILLLL;
            }
            c90591Zgx.LJLLLLLL(i, relativeLayout);
        }
    }
}
