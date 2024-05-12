package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.SqK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73336SqK extends AppCompatImageView {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C73336SqK(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setLayerType(1, null);
        super.setImageDrawable(drawable);
    }
}
