package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30001Fs extends AppCompatImageView {
    public final Paint LJLIL;
    public final PorterDuffXfermode LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LJLJJI) {
            if (canvas != null) {
                C0EL.LIZ(canvas, getWidth(), getHeight(), this.LJLIL);
                super.draw(canvas);
                this.LJLIL.setXfermode(this.LJLILLLLZI);
                if (C15380j0.LJIIZILJ()) {
                    canvas.drawCircle(0.0f, getHeight(), this.LJLJI, this.LJLIL);
                } else {
                    canvas.drawCircle(getWidth(), getHeight(), this.LJLJI, this.LJLIL);
                }
                this.LJLIL.setXfermode(null);
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    public final void setTrayVisible(boolean z) {
        this.LJLJJI = z;
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30001Fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30001Fs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C6D8.LIZIZ(true);
        this.LJLILLLLZI = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.LJLJI = C15380j0.LIZ(10.0f);
    }
}
