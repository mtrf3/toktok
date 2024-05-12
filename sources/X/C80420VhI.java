package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VhI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80420VhI extends ConstraintLayout {
    public final RunnableC74062T4w LJLIL;
    public int LJLILLLLZI;
    public C80418VhG LJLJI;

    public final void LJJLJLI() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.bbp && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.LJLILLLLZI;
                AnonymousClass060 anonymousClass060 = anonymousClass064.LJIILL(id).LIZLLL;
                anonymousClass060.LJJ = R.id.bbp;
                anonymousClass060.LJJI = i4;
                anonymousClass060.LJJIFFI = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        anonymousClass064.LIZIZ(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LJJLJLI();
    }

    public int getRadius() {
        return this.LJLILLLLZI;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.LJLIL);
            handler.post(this.LJLIL);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LJLJI.LJIIJJI(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.LJLILLLLZI = i;
        LJJLJLI();
    }

    public C80420VhI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C80420VhI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLZIIL(R.layout.brt, C16880lQ.LLZIL(context), this);
        C80418VhG c80418VhG = new C80418VhG();
        this.LJLJI = c80418VhG;
        C80369VgT c80369VgT = new C80369VgT(0.5f);
        C80416VhE c80416VhE = c80418VhG.LJLIL.LIZ;
        c80416VhE.getClass();
        C80417VhF c80417VhF = new C80417VhF(c80416VhE);
        c80417VhF.LJ = c80369VgT;
        c80417VhF.LJFF = c80369VgT;
        c80417VhF.LJI = c80369VgT;
        c80417VhF.LJII = c80369VgT;
        c80418VhG.setShapeAppearanceModel(new C80416VhE(c80417VhF));
        this.LJLJI.LJIIJJI(ColorStateList.valueOf(-1));
        C16300kU.LJIILLIIL(this, this.LJLJI);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b02}, i, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.LJLIL = new RunnableC74062T4w(this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.LJLIL);
            handler.post(this.LJLIL);
        }
    }
}
