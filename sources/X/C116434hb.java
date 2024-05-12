package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.4hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116434hb extends AppCompatImageView {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }

    public C116434hb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116434hb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        o.LJIIJ(context, "context");
        Drawable drawable2 = getDrawable();
        Drawable background = getBackground();
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = getForeground();
        } else {
            drawable = null;
        }
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
        }
        if (background != null) {
            background.setAutoMirrored(true);
        }
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }
}
