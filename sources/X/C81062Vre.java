package X;

import Y.ACListenerS48S0200000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.math.BigDecimal;
import kotlin.jvm.internal.o;

/* renamed from: X.Vre, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81062Vre extends LinearLayout {
    public final Context LJLIL;
    public LinearLayout LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public InterfaceC25634A4g LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public Drawable LJLJLLL;
    public Drawable LJLL;
    public Drawable LJLLI;
    public Drawable LJLLILLLL;
    public EnumC81063Vrf LJLLJ;

    public final void setUnClickableClickListener(InterfaceC81065Vrh interfaceC81065Vrh) {
    }

    private final ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.LJLJJLL), Math.round(this.LJLJJLL));
        layoutParams.setMargins(0, 0, Math.round(this.LJLJL), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.LJLJLLL);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.LJLIL == null) {
            return;
        }
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.LJLIL);
        this.LJLILLLLZI = linearLayout;
        linearLayout.setGravity(17);
        int i = this.LJLJJI;
        for (int i2 = 0; i2 < i; i2++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.LJLJLLL);
            C16880lQ.LJIILLIIL(starImageView, new ACListenerS48S0200000_14(this, starImageView, 21));
            LinearLayout linearLayout2 = this.LJLILLLLZI;
            o.LJI(linearLayout2);
            linearLayout2.addView(starImageView);
        }
        setStar(this.LJLJLJ);
        addView(this.LJLILLLLZI, new LinearLayout.LayoutParams(-1, -2));
    }

    public final float getStarStep() {
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.LJLJI = z;
    }

    public final void setOnRatingChangeListener(InterfaceC25634A4g interfaceC25634A4g) {
        this.LJLJJL = interfaceC25634A4g;
    }

    public final void setStar(float f) {
        boolean z;
        if (f < 0.0f) {
            f = 0.0f;
        }
        int i = this.LJLJJI;
        if (f > i) {
            f = i;
        }
        InterfaceC25634A4g interfaceC25634A4g = this.LJLJJL;
        if (interfaceC25634A4g != null) {
            o.LJI(interfaceC25634A4g);
            interfaceC25634A4g.LIZ(f);
        }
        int i2 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = this.LJLJJI;
            while (i2 < i3) {
                LinearLayout linearLayout = this.LJLILLLLZI;
                o.LJI(linearLayout);
                View childAt = linearLayout.getChildAt(i2);
                o.LJII(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) childAt).setImageDrawable(this.LJLLILLLL);
                i2++;
            }
            return;
        }
        this.LJLJLJ = f;
        int i4 = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i4))).floatValue();
        while (i2 < i4) {
            LinearLayout linearLayout2 = this.LJLILLLLZI;
            o.LJI(linearLayout2);
            View childAt2 = linearLayout2.getChildAt(i2);
            o.LJII(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) childAt2).setImageDrawable(this.LJLL);
            i2++;
        }
        int i5 = this.LJLJJI;
        for (int i6 = i4; i6 < i5; i6++) {
            LinearLayout linearLayout3 = this.LJLILLLLZI;
            o.LJI(linearLayout3);
            View childAt3 = linearLayout3.getChildAt(i6);
            o.LJII(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) childAt3).setImageDrawable(this.LJLJLLL);
        }
        if (floatValue > 0.0f) {
            LinearLayout linearLayout4 = this.LJLILLLLZI;
            o.LJI(linearLayout4);
            View childAt4 = linearLayout4.getChildAt(i4);
            o.LJII(childAt4, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) childAt4).setImageDrawable(this.LJLLI);
        }
    }

    public final void setStarCount(int i) {
        this.LJLJJI = i;
    }

    public final void setStarEmptyDrawable(Drawable drawable) {
        this.LJLJLLL = drawable;
    }

    public final void setStarFillDrawable(Drawable drawable) {
        this.LJLL = drawable;
    }

    public final void setStarHalfDrawable(Drawable drawable) {
        this.LJLLI = drawable;
    }

    public final void setStarIdleDrawable(Drawable drawable) {
        this.LJLLILLLL = drawable;
    }

    public final void setStarImageSize(float f) {
        this.LJLJJLL = f;
    }

    public final void setStarPadding(float f) {
        this.LJLJL = f;
    }

    public final void setStarStep(float f) {
        this.LJLJLJ = f;
    }

    public final void setStepSize(int i) {
        EnumC81063Vrf.Companion.getClass();
        for (EnumC81063Vrf enumC81063Vrf : EnumC81063Vrf.values()) {
            if (enumC81063Vrf.getMStep() == i) {
                this.LJLLJ = enumC81063Vrf;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81062Vre(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJI = true;
        this.LJLJJI = 5;
        this.LJLJJLL = 20.0f;
        this.LJLJL = 10.0f;
        this.LJLIL = context;
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3o, R.attr.be5, R.attr.be6, R.attr.be7, R.attr.be8, R.attr.be9, R.attr.be_, R.attr.bea, R.attr.beb, R.attr.bec});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…able.shoutouts_ratingbar)");
            this.LJLJJLL = obtainStyledAttributes.getDimension(5, 20.0f);
            this.LJLJL = obtainStyledAttributes.getDimension(6, 10.0f);
            this.LJLJLJ = obtainStyledAttributes.getFloat(7, 0.0f);
            this.LJLJJI = obtainStyledAttributes.getInteger(1, 5);
            this.LJLJLLL = obtainStyledAttributes.getDrawable(2);
            this.LJLL = obtainStyledAttributes.getDrawable(3);
            this.LJLLI = obtainStyledAttributes.getDrawable(4);
            this.LJLLILLLL = obtainStyledAttributes.getDrawable(9);
            this.LJLJI = obtainStyledAttributes.getBoolean(0, true);
            C81064Vrg c81064Vrg = EnumC81063Vrf.Companion;
            int i = obtainStyledAttributes.getInt(8, 1);
            c81064Vrg.getClass();
            for (EnumC81063Vrf enumC81063Vrf : EnumC81063Vrf.values()) {
                if (enumC81063Vrf.getMStep() == i) {
                    this.LJLLJ = enumC81063Vrf;
                    if (this.LJLLILLLL == null) {
                        this.LJLLILLLL = getResources().getDrawable(R.drawable.c5o);
                    }
                    if (this.LJLJLLL == null) {
                        this.LJLJLLL = getResources().getDrawable(R.drawable.c5l);
                    }
                    if (this.LJLL == null) {
                        this.LJLL = getResources().getDrawable(R.drawable.c5m);
                    }
                    if (this.LJLLI == null) {
                        this.LJLLI = getResources().getDrawable(R.drawable.c5n);
                    }
                    obtainStyledAttributes.recycle();
                    return;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
