package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5EL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EL extends AppCompatImageView {
    public final Paint LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public float LJLJJLL;
    public final Path LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public Bitmap LJLLI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5EL(Context context) {
        this(context, null, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null || this.LJLLI == null) {
            return;
        }
        canvas.save();
        this.LJLJL.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.LJLJLJ, this.LJLJLLL, Path.Direction.CW);
        canvas.clipPath(this.LJLJL);
        super.onDraw(canvas);
        canvas.restore();
        Paint paint = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LJLL);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.LJLJLJ, this.LJLJLLL, this.LJLIL);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.LJLLI = bitmap;
        super.setImageBitmap(bitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5EL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LIZ(long j, long j2) {
        float f = ((float) j2) / ((float) j);
        this.LJLJJLL = f;
        if (f > 0.75d) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            float f2 = this.LJLILLLLZI;
            layoutParams.width = (int) f2;
            layoutParams.height = (int) Math.min(this.LJLJI, this.LJLJJLL * f2);
            setLayoutParams(layoutParams);
            setMaxHeight((int) this.LJLJI);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        float f3 = this.LJLJJI;
        layoutParams2.width = (int) f3;
        layoutParams2.height = (int) Math.max(this.LJLJJLL * f3, this.LJLJJL);
        setLayoutParams(layoutParams2);
        setMinimumHeight((int) this.LJLJJL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5EL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new Paint();
        this.LJLILLLLZI = C17N.LJIJJLI(88);
        float f = UserLevelGeckoUpdateSetting.DEFAULT;
        this.LJLJI = C17N.LJIJJLI(f);
        this.LJLJJI = C17N.LJIJJLI(f);
        this.LJLJJL = C17N.LJIJJLI(78);
        this.LJLJJLL = 1.0f;
        this.LJLJL = new Path();
        this.LJLJLJ = KL2.LIZJ(context, 2.0f);
        this.LJLJLLL = KL2.LIZJ(context, 2.0f);
        this.LJLL = KL2.LIZJ(context, 1.0f);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
