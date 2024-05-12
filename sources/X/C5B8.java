package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5B8, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5B8 extends View {
    public InterfaceC130955Bz LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final float getDrawLeftBounds() {
        return this.LJLILLLLZI;
    }

    public final float getDrawRightBounds() {
        return this.LJLJI;
    }

    public final InterfaceC130955Bz getNullTrackPainter$editor_trackpanel_release() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float f = this.LJLILLLLZI;
            float f2 = this.LJLJI;
            float x = motionEvent.getX();
            if (f <= x && x <= f2) {
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                performClick();
                return true;
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDrawLeftBounds(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setDrawRightBounds(float f) {
        this.LJLJI = f;
    }

    public final void setNullTrackPainter$editor_trackpanel_release(InterfaceC130955Bz interfaceC130955Bz) {
        o.LJIIIZ(interfaceC130955Bz, "<set-?>");
        this.LJLIL = interfaceC130955Bz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5B8(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new InterfaceC130955Bz(context) { // from class: X.5B7
            public final Context LIZ;
            public final Paint LIZIZ;
            public final TextPaint LIZJ;
            public final float LIZLLL;
            public final Drawable LJ;
            public final int LJFF;
            public final int LJI;
            public final int LJII;
            public final int LJIIIIZZ;
            public final int LJIIIZ;

            {
                o.LJIIIZ(context, "context");
                this.LIZ = context;
                Paint paint = new Paint();
                this.LIZIZ = paint;
                TextPaint textPaint = new TextPaint();
                this.LIZJ = textPaint;
                this.LIZLLL = C134845Qy.LIZ(1.0f);
                this.LJ = C04270Et.LIZIZ(context, R.drawable.b20);
                this.LJFF = C134845Qy.LIZ(4.0f);
                this.LJI = C134845Qy.LIZ(8.0f);
                this.LJII = C134845Qy.LIZ(2.0f);
                this.LJIIIIZZ = C134845Qy.LIZ(10.0f);
                this.LJIIIZ = C134845Qy.LIZ(16.0f);
                paint.setAntiAlias(true);
                paint.setColor(ColorProtector.parseColor("#202020"));
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(C134845Qy.LIZ(10.0f));
                textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setColor(ColorProtector.parseColor("#80FFFFFF"));
            }

            @Override // X.InterfaceC130955Bz
            public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
                o.LJIIIZ(canvas, "canvas");
                float f5 = this.LIZLLL;
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.LIZIZ);
                Drawable drawable = this.LJ;
                if (drawable != null) {
                    int i2 = ((int) f) + this.LJFF;
                    int i3 = ((int) f2) + this.LJI;
                    int i4 = this.LJIIIZ;
                    drawable.setBounds(i2, i3, i2 + i4, i4 + i3);
                    drawable.draw(canvas);
                    String string = this.LIZ.getString(R.string.fmx);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ditor_pro_menu_sound_add)");
                    canvas.drawText(string, f + this.LJFF + this.LJIIIZ + this.LJII, this.LIZJ.getTextSize() + f2 + this.LJIIIIZZ, this.LIZJ);
                }
            }
        };
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(context, 886));
    }

    public void LIZ(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        o.LJIIIZ(canvas, "canvas");
        if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            int measuredWidth = getMeasuredWidth();
            int i2 = C1303859u.LLJJI;
            this.LJLILLLLZI = (measuredWidth - i2) + f;
            this.LJLJI = (getMeasuredWidth() - i2) + f3;
        } else {
            float f5 = i;
            this.LJLILLLLZI = f - f5;
            this.LJLJI = f3 - f5;
        }
        this.LJLIL.LIZ(canvas, f, f2, f3, f4);
    }
}
