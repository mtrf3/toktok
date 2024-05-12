package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.z0;
import com.zhiliaoapp.musically.R;

/* renamed from: X.02Y, reason: invalid class name */
/* loaded from: classes.dex */
public class C02Y extends CheckBox {
    public final C03P LJLIL;
    public final C03A LJLILLLLZI;
    public final a0 LJLJI;
    public C012203a LJLJJI;

    private C012203a getEmojiTextViewHelper() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C012203a(this);
        }
        return this.LJLJJI;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            return c03p.LIZIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            return c03p.LIZJ;
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LIZ();
        }
        a0 a0Var = this.LJLJI;
        if (a0Var != null) {
            a0Var.LIZIZ();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            c03p.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            if (c03p.LJFF) {
                c03p.LJFF = false;
            } else {
                c03p.LJFF = true;
                c03p.LIZ();
            }
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            c03p.LIZIZ = colorStateList;
            c03p.LIZLLL = true;
            c03p.LIZ();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C03P c03p = this.LJLIL;
        if (c03p != null) {
            c03p.LIZJ = mode;
            c03p.LJ = true;
            c03p.LIZ();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C20110qd.LIZ(getContext(), i));
    }

    public C02Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a1v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C02Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z0.LIZ(context);
        C16880lQ.LLLLII(getContext());
        C03P c03p = new C03P(this);
        this.LJLIL = c03p;
        c03p.LIZIZ(attributeSet, i);
        C03A c03a = new C03A(this);
        this.LJLILLLLZI = c03a;
        c03a.LIZLLL(attributeSet, i);
        a0 a0Var = new a0(this);
        this.LJLJI = a0Var;
        a0Var.LIZLLL(attributeSet, i);
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
    }
}
