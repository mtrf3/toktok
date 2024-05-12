package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJO extends SmartAvatarImageView {
    public final Path LJLZ;
    public final Matrix LJZ;
    public Bitmap LJZI;
    public final Paint LJZL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJO(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C72434Sbm, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLZ.isEmpty() || this.LJZI == null) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            canvas.clipPath(this.LJLZ, Region.Op.DIFFERENCE);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            save = canvas.save();
            try {
                Bitmap bitmap = this.LJZI;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, this.LJZ, this.LJZL);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } finally {
            }
        } finally {
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        this.LJZI = bitmap;
    }

    public final void setMatrixOfBitmap(InterfaceC88472Yns<? super Matrix, C76800UCe> matrix) {
        o.LJIIIZ(matrix, "matrix");
        matrix.invoke(this.LJZ);
    }

    public final void setPathToClip(InterfaceC88472Yns<? super Path, C76800UCe> path) {
        o.LJIIIZ(path, "path");
        path.invoke(this.LJLZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLZ = new Path();
        this.LJZ = new Matrix();
        this.LJZL = C6D8.LIZIZ(true);
    }

    public /* synthetic */ SJO(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
