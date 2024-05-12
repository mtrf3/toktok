package androidx.appcompat.widget;

import X.C012102z;
import X.C03A;
import X.C16880lQ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final C03A mBackgroundTintHelper;
    public boolean mHasLevel;
    public final q mImageHelper;

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C012102z c012102z;
        q qVar = this.mImageHelper;
        if (qVar == null || (c012102z = qVar.LIZIZ) == null) {
            return null;
        }
        return c012102z.LIZ;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C012102z c012102z;
        q qVar = this.mImageHelper;
        if (qVar == null || (c012102z = qVar.LIZIZ) == null) {
            return null;
        }
        return c012102z.LIZIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if ((!(this.mImageHelper.LIZ.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            c03a.LIZ();
        }
        q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.mImageHelper;
        if (qVar != null && drawable != null && !this.mHasLevel) {
            qVar.LIZLLL = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.mImageHelper;
        if (qVar2 != null) {
            qVar2.LIZ();
            if (!this.mHasLevel) {
                q qVar3 = this.mImageHelper;
                if (qVar3.LIZ.getDrawable() != null) {
                    qVar3.LIZ.getDrawable().setLevel(qVar3.LIZLLL);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.LIZJ(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.LIZ();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.mBackgroundTintHelper;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.mImageHelper;
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
        q qVar = this.mImageHelper;
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

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z0.LIZ(context);
        this.mHasLevel = false;
        C16880lQ.LLLLII(getContext());
        C03A c03a = new C03A(this);
        this.mBackgroundTintHelper = c03a;
        c03a.LIZLLL(attributeSet, i);
        q qVar = new q(this);
        this.mImageHelper = qVar;
        qVar.LIZIZ(attributeSet, i);
    }
}
