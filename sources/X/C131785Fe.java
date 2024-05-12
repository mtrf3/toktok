package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131785Fe extends FrameLayout {
    public final C62822Ol8 LJLIL;

    private final Paint getInnerPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, getInnerPaint());
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131785Fe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        SFS.LJI(31.0d);
        int LJI = SFS.LJI(28.0d);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.LJLIL = C221108m2.LIZIZ(C131795Ff.LJLIL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJI, LJI);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setImageResource(R.drawable.bts);
        addView(appCompatImageView);
    }
}
