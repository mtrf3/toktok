package X;

import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;

/* renamed from: X.OMp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61783OMp extends LinearLayout implements InterfaceC61792OMy {
    public final Context LJLIL;
    public LinearLayout LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public InterfaceC61791OMx LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public Drawable LJLJLLL;
    public Drawable LJLL;
    public Drawable LJLLI;
    public EnumC61786OMs LJLLILLLL;
    public TuxTextView LJLLJ;
    public ON0 LJLLL;

    public void setUnClickableClickListener(InterfaceC61793OMz interfaceC61793OMz) {
    }

    private ImageView getStarImageView() {
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

    public final void LIZ() {
        if (this.LJLIL == null) {
            return;
        }
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.LJLIL);
        this.LJLILLLLZI = linearLayout;
        linearLayout.setGravity(17);
        for (int i = 0; i < this.LJLJJI; i++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.LJLJLLL);
            C16880lQ.LJIILLIIL(starImageView, new ACListenerS45S0200000_10(this, starImageView, 42));
            this.LJLILLLLZI.addView(starImageView);
        }
        setStar(this.LJLJLJ);
        addView(this.LJLILLLLZI, new LinearLayout.LayoutParams(-1, -2));
        if (this.LJLIL != null) {
            TuxTextView tuxTextView = new TuxTextView(this.LJLIL);
            this.LJLLJ = tuxTextView;
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, this.LJLIL));
            this.LJLLJ.setTuxFont(61);
            this.LJLLJ.setGravity(17);
            this.LJLLJ.setPadding(0, (int) KL2.LIZJ(this.LJLIL, 4.0f), 0, 0);
            addView(this.LJLLJ, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LIZ();
    }

    public ON0 getOptionClickListener() {
        return this.LJLLL;
    }

    public C61783OMp(Context context) {
        super(context, null);
        this.LJLIL = context;
        setOrientation(0);
        this.LJLIL = context;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.LJLJI = z;
    }

    public void setOnRatingChangeListener(InterfaceC61791OMx interfaceC61791OMx) {
        this.LJLJJL = interfaceC61791OMx;
    }

    public void setOption(String str) {
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    @Override // X.InterfaceC61792OMy
    public void setOptionListener(ON0 on0) {
        this.LJLLL = on0;
    }

    public void setStar(float f) {
        LinearLayout linearLayout;
        if (f < 0.0f) {
            f = 0.0f;
        }
        int i = this.LJLJJI;
        if (f > i) {
            f = i;
        }
        InterfaceC61791OMx interfaceC61791OMx = this.LJLJJL;
        if (interfaceC61791OMx != null) {
            interfaceC61791OMx.LIZ(f);
        }
        this.LJLJLJ = f;
        int i2 = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i2))).floatValue();
        for (int i3 = 0; i3 < i2; i3++) {
            LinearLayout linearLayout2 = this.LJLILLLLZI;
            if (linearLayout2 != null) {
                ((ImageView) linearLayout2.getChildAt(i3)).setImageDrawable(this.LJLL);
            }
        }
        for (int i4 = i2; i4 < this.LJLJJI; i4++) {
            ((ImageView) this.LJLILLLLZI.getChildAt(i4)).setImageDrawable(this.LJLJLLL);
        }
        if (floatValue > 0.0f && (linearLayout = this.LJLILLLLZI) != null) {
            ((ImageView) linearLayout.getChildAt(i2)).setImageDrawable(this.LJLLI);
        }
    }

    public void setStarCount(int i) {
        this.LJLJJI = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.LJLJLLL = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.LJLL = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.LJLLI = drawable;
    }

    public void setStarImageSize(float f) {
        this.LJLJJLL = f;
    }

    public void setStarPadding(float f) {
        this.LJLJL = f;
    }

    public void setStarStep(float f) {
        this.LJLJLJ = f;
    }

    public void setStepSize(int i) {
        this.LJLLILLLL = EnumC61786OMs.fromStep(i);
    }
}
