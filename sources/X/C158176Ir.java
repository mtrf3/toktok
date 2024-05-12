package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158176Ir extends C139865eI {
    public C170466mY LJLIL;
    public C158186Is LJLILLLLZI;
    public String LJLJI;
    public Drawable LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    public final C170466mY getAvDmtTextView() {
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            return c170466mY;
        }
        o.LJIJI("avDmtTextView");
        throw null;
    }

    public final void setAvDmtTextView(C170466mY c170466mY) {
        o.LJIIIZ(c170466mY, "<set-?>");
        this.LJLIL = c170466mY;
    }

    public final void setChangeColor(boolean z) {
        C158186Is c158186Is = this.LJLILLLLZI;
        if (c158186Is != null) {
            c158186Is.setChangeColor(z);
        } else {
            o.LJIJI("avDmtImageView");
            throw null;
        }
    }

    public final void setImageRes(int i) {
        C158186Is c158186Is = this.LJLILLLLZI;
        if (c158186Is != null) {
            c158186Is.setImageDrawable(C04270Et.LIZIZ(getContext(), i));
        } else {
            o.LJIJI("avDmtImageView");
            throw null;
        }
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            getAvDmtTextView().setText(str);
        }
    }

    public final void setTextSize(int i) {
        getAvDmtTextView().setTextSize(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158176Ir(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            this.LJLJI = C16880lQ.LLLZLZ(obtainStyledAttributes, 42);
            this.LJLJJI = obtainStyledAttributes.getDrawable(24);
            this.LJLJJL = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.LJLJJLL = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
        if (this.LJLJJLL) {
            this.LJLJL = C82852WfQ.LIZ().LIZ;
        }
        setAvDmtTextView(new C170466mY(context, null, 6));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) C74275TDb.LIZIZ(context, 4.0f);
        layoutParams.gravity = 16;
        getAvDmtTextView().setLayoutParams(layoutParams);
        this.LJLILLLLZI = new C158186Is(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.LJLJL) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "getContext()");
            int LIZIZ = (int) C74275TDb.LIZIZ(context2, 12.0f);
            layoutParams2.rightMargin = LIZIZ;
            layoutParams2.leftMargin = LIZIZ;
        }
        C158186Is c158186Is = this.LJLILLLLZI;
        if (c158186Is != null) {
            c158186Is.setLayoutParams(layoutParams2);
            C158186Is c158186Is2 = this.LJLILLLLZI;
            if (c158186Is2 != null) {
                addView(c158186Is2);
                addView(getAvDmtTextView());
                int i = this.LJLJJL;
                setPadding(i, i, i, i);
                setGravity(17);
                getAvDmtTextView().setTextSize(13.0f);
                getAvDmtTextView().setMaxLines(1);
                getAvDmtTextView().setEllipsize(TextUtils.TruncateAt.END);
                getAvDmtTextView().setVisibility(8);
                C158186Is c158186Is3 = this.LJLILLLLZI;
                if (c158186Is3 != null) {
                    c158186Is3.setChangeColor(false);
                    if (!TextUtils.isEmpty(this.LJLJI)) {
                        getAvDmtTextView().setText(this.LJLJI);
                    }
                    Drawable drawable = this.LJLJJI;
                    if (drawable != null) {
                        C158186Is c158186Is4 = this.LJLILLLLZI;
                        if (c158186Is4 != null) {
                            c158186Is4.setImageDrawable(drawable);
                        } else {
                            o.LJIJI("avDmtImageView");
                            throw null;
                        }
                    }
                    if (this.LJLJL) {
                        getAvDmtTextView().setVisibility(0);
                        return;
                    }
                    return;
                }
                o.LJIJI("avDmtImageView");
                throw null;
            }
            o.LJIJI("avDmtImageView");
            throw null;
        }
        o.LJIJI("avDmtImageView");
        throw null;
    }
}
