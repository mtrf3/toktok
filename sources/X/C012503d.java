package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.z0;
import com.zhiliaoapp.musically.R;

/* renamed from: X.03d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012503d extends ImageButton {
    public final C03A LJLIL;
    public final q LJLILLLLZI;
    public boolean LJLJI;

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C012102z c012102z;
        q qVar = this.LJLILLLLZI;
        if (qVar == null || (c012102z = qVar.LIZIZ) == null) {
            return null;
        }
        return c012102z.LIZ;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C012102z c012102z;
        q qVar = this.LJLILLLLZI;
        if (qVar == null || (c012102z = qVar.LIZIZ) == null) {
            return null;
        }
        return c012102z.LIZIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.LJLILLLLZI.LIZ.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LIZ();
        }
        q qVar = this.LJLILLLLZI;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.LJLILLLLZI;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.LJLILLLLZI;
        if (qVar != null && drawable != null && !this.LJLJI) {
            qVar.LIZLLL = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.LJLILLLLZI;
        if (qVar2 != null) {
            qVar2.LIZ();
            if (!this.LJLJI) {
                q qVar3 = this.LJLILLLLZI;
                if (qVar3.LIZ.getDrawable() != null) {
                    qVar3.LIZ.getDrawable().setLevel(qVar3.LIZLLL);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.LJLJI = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.LJLILLLLZI.LIZJ(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        q qVar = this.LJLILLLLZI;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.LJLILLLLZI;
        if (qVar != null) {
            if (qVar.LIZIZ == null) {
                qVar.LIZIZ = new C012102z();
            }
            C012102z c012102z = qVar.LIZIZ;
            c012102z.LIZ = colorStateList;
            c012102z.LIZLLL = true;
            qVar.LIZ();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.LJLILLLLZI;
        if (qVar != null) {
            if (qVar.LIZIZ == null) {
                qVar.LIZIZ = new C012102z();
            }
            C012102z c012102z = qVar.LIZIZ;
            c012102z.LIZIZ = mode;
            c012102z.LIZJ = true;
            qVar.LIZ();
        }
    }

    public C012503d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ahc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C012503d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z0.LIZ(context);
        this.LJLJI = false;
        C16880lQ.LLLLII(getContext());
        C03A c03a = new C03A(this);
        this.LJLIL = c03a;
        c03a.LIZLLL(attributeSet, i);
        q qVar = new q(this);
        this.LJLILLLLZI = qVar;
        qVar.LIZIZ(attributeSet, i);
    }
}
