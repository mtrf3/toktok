package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.acZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94163acZ extends AppCompatImageView {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final Path LJLJJL;
    public final Paint LJLJJLL;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLJJL.reset();
        this.LJLJJL.moveTo(getWidth() - this.LJLJJI, 0.0f);
        this.LJLJJL.arcTo(getWidth() - (this.LJLJJI * 2.0f), 0.0f, getWidth(), this.LJLJJI * 2.0f, 270.0f, 90.0f, false);
        this.LJLJJL.lineTo(getWidth(), getHeight() - this.LJLJI);
        float f = 2;
        this.LJLJJL.arcTo(getWidth() - (this.LJLJI * 2.0f), getHeight() - (this.LJLJI * f), getWidth(), getHeight(), 0.0f, 90.0f, false);
        this.LJLJJL.lineTo(this.LJLIL, getHeight());
        Path path = this.LJLJJL;
        float height = getHeight();
        float f2 = this.LJLIL;
        path.arcTo(0.0f, height - (f2 * 2.0f), f * f2, getHeight(), 90.0f, 90.0f, false);
        this.LJLJJL.lineTo(0.0f, this.LJLILLLLZI);
        Path path2 = this.LJLJJL;
        float f3 = this.LJLILLLLZI;
        path2.arcTo(0.0f, 0.0f, f3 * 2.0f, f3 * 2.0f, 180.0f, 90.0f, false);
        this.LJLJJL.close();
        canvas.clipPath(this.LJLJJL);
        canvas.drawPath(this.LJLJJL, this.LJLJJLL);
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        this.LJLILLLLZI = f;
        this.LJLJJI = f;
        this.LJLIL = f;
        this.LJLJI = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C94163acZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94163acZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLJJL = new Path();
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(0);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.byl, R.attr.z9, R.attr.zc, R.attr.bke, R.attr.bki});
            this.LJLIL = typedArray.getDimension(1, getResources().getDimension(R.dimen.ak5));
            this.LJLILLLLZI = typedArray.getDimension(3, getResources().getDimension(R.dimen.ak5));
            this.LJLJI = typedArray.getDimension(2, getResources().getDimension(R.dimen.ak5));
            this.LJLJJI = typedArray.getDimension(4, getResources().getDimension(R.dimen.ak5));
            paint.setColor(typedArray.getColor(0, 0));
        } catch (Exception unused) {
            if (typedArray == null) {
                return;
            }
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
        typedArray.recycle();
    }
}
