package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Voq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80888Voq extends C80889Vor {
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80888Voq(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJJLL = 45;
        LIZLLL(0);
    }

    @Override // X.C80889Vor
    public final void LIZLLL(int i) {
        int i2;
        int i3;
        int i4;
        View view = this.LJLIL;
        int i5 = 0;
        if (view != null) {
            if (i == 0) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        View view2 = this.LJLILLLLZI;
        o.LJI(view2);
        int i6 = 8;
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = this.LJLJJI;
        o.LJI(view3);
        if (i == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        View view4 = this.LJLJI;
        o.LJI(view4);
        if (i == 3) {
            i6 = 0;
        }
        view4.setVisibility(i6);
        if (i != 0) {
            i5 = 45;
        }
        this.LJLJJLL = i5;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) KL2.LIZJ(getContext(), this.LJLJJLL), 1073741824));
    }

    @Override // X.C80889Vor
    public final View LIZ(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.hvf);
        C16880lQ.LJIJI(appCompatTextView, new ACListenerS34S0100000_14(this, 91));
        return appCompatTextView;
    }

    @Override // X.C80889Vor
    public final View LIZIZ(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.hvg);
        C16880lQ.LJIJI(appCompatTextView, new ACListenerS34S0100000_14(this, 92));
        return appCompatTextView;
    }

    @Override // X.C80889Vor
    public final View LIZJ(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.hvh);
        ProgressBar progressBar = new ProgressBar(context, attributeSet, i);
        progressBar.setId(R.id.g8u);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.bqb));
        int LIZJ = (int) KL2.LIZJ(context, 15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LIZJ, LIZJ);
        layoutParams.setMargins(0, 0, (int) KL2.LIZJ(context, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        return linearLayout;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, int i2) {
        int i3;
        o.LJIIIZ(child, "child");
        super.addView(child, i, i2);
        View view = this.LJLIL;
        if (view == child) {
            o.LJI(view);
            if (this.LJLJJL == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view.setVisibility(i3);
        }
    }
}
