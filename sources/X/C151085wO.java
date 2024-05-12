package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5wO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151085wO extends View {
    public int LJLIL;
    public final Paint LJLILLLLZI;
    public Rect LJLJI;
    public Rect LJLJJI;
    public RectF LJLJJL;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Rect getCropRect() {
        return this.LJLJJI;
    }

    public final Rect getEditRect() {
        return this.LJLJI;
    }

    public final List<RectF> LIZ(RectF rectF) {
        return C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.0f, getMeasuredWidth(), rectF.top), new RectF(0.0f, rectF.top, rectF.left, rectF.bottom), new RectF(rectF.right, rectF.top, getMeasuredWidth(), rectF.bottom), new RectF(0.0f, rectF.bottom, getMeasuredWidth(), getMeasuredHeight()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            int i = this.LJLIL;
            if (i != -1) {
                if (i != 0) {
                    return;
                }
                Iterator<RectF> it = LIZ(this.LJLJJL).iterator();
                while (it.hasNext()) {
                    canvas.drawRect(it.next(), this.LJLILLLLZI);
                }
                return;
            }
            Rect rect = this.LJLJI;
            Iterator<RectF> it2 = LIZ(new RectF(rect.left, rect.top, rect.right, rect.bottom)).iterator();
            while (it2.hasNext()) {
                canvas.drawRect(it2.next(), this.LJLILLLLZI);
            }
        }
    }

    public final void setCropRect(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLJJI = rect;
    }

    public final void setEditRect(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLJI = rect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151085wO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.LJLILLLLZI = paint;
        this.LJLJI = new Rect();
        this.LJLJJI = new Rect();
        this.LJLJJL = new RectF();
    }
}
