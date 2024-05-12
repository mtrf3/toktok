package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CXd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31481CXd extends View {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final Paint getPaint() {
        return (Paint) this.LJLJI.getValue();
    }

    public final int getColor() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setColor(this.LJLIL);
        getPaint().setStyle(Paint.Style.FILL);
        float LIZ = C15380j0.LIZ(2.0f);
        float width = getWidth() / 2;
        if (canvas != null) {
            canvas.drawCircle(width, width, width - LIZ, getPaint());
        }
        if (this.LJLILLLLZI) {
            getPaint().setColor(C15380j0.LIZIZ(R.color.a3g));
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(LIZ);
            if (canvas != null) {
                canvas.drawCircle(width, width, width - (LIZ / 2), getPaint());
            }
        }
    }

    public final void setColor(int i) {
        this.LJLIL = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31481CXd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLIL = -1;
        this.LJLJI = C221108m2.LIZIZ(C31483CXf.LJLIL);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a4a, R.attr.aik}, 0, 0);
        try {
            this.LJLIL = obtainStyledAttributes.getInteger(0, -1);
            this.LJLILLLLZI = obtainStyledAttributes.getBoolean(1, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
