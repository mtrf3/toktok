package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117054ib extends View {
    public int LJLIL;
    public InterfaceC117064ic LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public TextView LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public Bitmap LJLLILLLL;
    public Bitmap LJLLJ;
    public Bitmap LJLLL;
    public Bitmap LJLLLL;
    public int LJLLLLLL;
    public final Paint LJLZ;
    public final Paint LJZ;
    public final List<String> LJZI;
    public final List<Integer> LJZL;
    public final Rect LL;
    public final Rect LLD;

    private final int getSuggestedMinWidth() {
        Iterator it = ((ArrayList) this.LJZI).iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return (int) (this.LJZ.measureText(str) + 0.5d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (((ArrayList) this.LJZI).size() == 0) {
            return;
        }
        this.LJLJJLL = this.LJLJJI;
        this.LJLLLLLL = 0;
        int size = ((ArrayList) this.LJZI).size();
        for (int i = 0; i < size; i++) {
            if (o.LJ(ListProtector.get(this.LJZI, i), "Recent")) {
                this.LJLLLLLL++;
                Rect rect = this.LL;
                int i2 = this.LJLJLLL;
                rect.set(0, 0, i2, i2);
                if (this.LJLIL == i) {
                    Bitmap bitmap = this.LJLLJ;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, this.LL, this.LJZ);
                    }
                } else {
                    Bitmap bitmap2 = this.LJLLILLLL;
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, (Rect) null, this.LL, this.LJZ);
                    }
                }
            } else if (o.LJ(ListProtector.get(this.LJZI, i), "Friend")) {
                this.LJLLLLLL++;
                Rect rect2 = this.LL;
                int i3 = this.LJLL;
                int i4 = this.LJLJLLL;
                rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                if (this.LJLIL == i) {
                    Bitmap bitmap3 = this.LJLLLL;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, (Rect) null, this.LL, this.LJZ);
                    }
                } else {
                    Bitmap bitmap4 = this.LJLLL;
                    if (bitmap4 != null) {
                        canvas.drawBitmap(bitmap4, (Rect) null, this.LL, this.LJZ);
                    }
                }
            } else {
                this.LJLJL = (this.LJLJJL - (this.LJLL * this.LJLLLLLL)) / (((ArrayList) this.LJZI).size() - this.LJLLLLLL);
                this.LJZ.getTextBounds((String) ListProtector.get(this.LJZI, i), 0, ((String) ListProtector.get(this.LJZI, i)).length(), this.LLD);
                float f = this.LJLJJLL / 2.0f;
                int i5 = this.LJLL;
                int i6 = this.LJLLLLLL;
                float height = ((((i + 1) - i6) * this.LJLJL) + (i5 * i6)) - (this.LLD.height() / 2.0f);
                if (this.LJLIL == i) {
                    canvas.drawText((String) ListProtector.get(this.LJZI, i), f, height, this.LJZ);
                } else {
                    canvas.drawText((String) ListProtector.get(this.LJZI, i), f, height, this.LJLZ);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != 2) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117054ib.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIndexLetterTv$mention_tag_release(TextView textView) {
        this.LJLJLJ = textView;
    }

    public final void setOnLetterTouchListener$mention_tag_release(InterfaceC117064ic listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setRecycleViewPos$mention_tag_release(int i) {
        int size = ((ArrayList) this.LJZL).size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Number) ListProtector.get(this.LJZL, i3)).intValue();
            if (i < i2) {
                if (this.LJLIL != i3) {
                    this.LJLIL = i3;
                    invalidate();
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117054ib(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        Paint paint = new Paint(1);
        this.LJLZ = paint;
        Paint paint2 = new Paint(1);
        this.LJZ = paint2;
        this.LJZI = new ArrayList();
        this.LJZL = new ArrayList();
        this.LL = new Rect(0, 0, this.LJLJLLL, this.LJLL);
        this.LLD = new Rect();
        Resources resources = getContext().getResources();
        Float valueOf = Float.valueOf(11.0f);
        paint2.setTextSize(C32151Nz.LJIIZILJ(valueOf));
        paint2.setTextAlign(Paint.Align.CENTER);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.go, context2);
        if (LJI != null) {
            paint2.setColor(LJI.intValue());
        }
        paint.setTextSize(C32151Nz.LJIIZILJ(valueOf));
        paint.setTextAlign(Paint.Align.CENTER);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.gv, context3);
        if (LJI2 != null) {
            paint.setColor(LJI2.intValue());
        }
        Drawable drawable = resources.getDrawable(R.drawable.bqy);
        o.LJII(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.LJLLILLLL = ((BitmapDrawable) drawable).getBitmap();
        Drawable drawable2 = resources.getDrawable(R.drawable.bqz);
        o.LJII(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.LJLLJ = ((BitmapDrawable) drawable2).getBitmap();
        Drawable drawable3 = resources.getDrawable(R.drawable.br1);
        o.LJII(drawable3, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.LJLLLL = ((BitmapDrawable) drawable3).getBitmap();
        Drawable drawable4 = resources.getDrawable(R.drawable.br0);
        o.LJII(drawable4, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.LJLLL = ((BitmapDrawable) drawable4).getBitmap();
        this.LJLLI = C32151Nz.LJIIZILJ(Float.valueOf(2.0f));
        this.LJLJLLL = C278817o.LIZ(16.0f);
        this.LJLL = (int) (C32151Nz.LJIIZILJ(Float.valueOf(16.0f)) + this.LJLLI);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode != Integer.MIN_VALUE || suggestedMinWidth <= size) {
                size = suggestedMinWidth;
            }
        }
        this.LJLJJI = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.LJZ.getFontMetrics();
            int size3 = (int) (((ArrayList) this.LJZI).size() * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 != Integer.MIN_VALUE || size3 <= size2) {
                size2 = size3;
            }
        }
        this.LJLJJL = size2;
        setMeasuredDimension(size, size2);
    }
}
