package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C114194dz extends View {
    public int LJLIL;
    public InterfaceC114204e0 LJLILLLLZI;
    public final List<String> LJLJI;
    public final List<Integer> LJLJJI;
    public Resources LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public TextView LJLLI;
    public Paint LJLLILLLL;
    public Paint LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public Rect LJLZ;

    private int getSuggestedMinWidth() {
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return (int) (this.LJLLJ.measureText(str) + 0.5d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<String> list = this.LJLJI;
        if (list == null || ((ArrayList) list).size() == 0) {
            return;
        }
        this.LJLJLLL = this.LJLJL;
        int i = 0;
        while (i < ((ArrayList) this.LJLJI).size()) {
            this.LJLL = (this.LJLJLJ - 0) / ((ArrayList) this.LJLJI).size();
            this.LJLLJ.getTextBounds((String) ListProtector.get(this.LJLJI, i), 0, ((String) ListProtector.get(this.LJLJI, i)).length(), this.LJLZ);
            float f = this.LJLJLLL / 2.0f;
            int i2 = i + 1;
            float height = ((this.LJLL * i2) + 0) - (this.LJLZ.height() / 2.0f);
            if (this.LJLIL == i) {
                canvas.drawText((String) ListProtector.get(this.LJLJI, i), f, height, this.LJLLJ);
            } else {
                canvas.drawText((String) ListProtector.get(this.LJLJI, i), f, height, this.LJLLILLLL);
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r2 != 2) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r2 = r8.getAction()
            r1 = -1
            r5 = 8
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            r0 = 2
            if (r2 == r0) goto L1b
        Lf:
            r7.invalidate()
            return r3
        L13:
            android.widget.TextView r0 = r7.LJLLI
            r0.setVisibility(r5)
            r7.LJLJJLL = r1
            goto Lf
        L1b:
            float r6 = r8.getY()
            int r0 = r7.LJLJLJ
            int r2 = r7.LJLL
            int r0 = r0 + r2
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L31
            android.widget.TextView r0 = r7.LJLLI
            r0.setVisibility(r5)
            r7.LJLJJLL = r1
            return r3
        L31:
            int r0 = r7.LJLLLL
            float r0 = (float) r0
            float r0 = r6 / r0
            int r0 = (int) r0
            r7.LJLIL = r0
            r4 = 0
            if (r0 < 0) goto L44
            float r0 = (float) r4
            float r1 = r6 - r0
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (int) r1
            r7.LJLIL = r0
        L44:
            int r1 = r7.LJLIL
            int r0 = r7.LJLJJLL
            if (r1 == r0) goto L80
            X.4e0 r0 = r7.LJLILLLLZI
            if (r0 == 0) goto L80
            if (r1 < 0) goto L80
            java.util.List<java.lang.String> r0 = r7.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L80
            java.util.List<java.lang.String> r1 = r7.LJLJI
            int r0 = r7.LJLIL
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            X.4e0 r1 = r7.LJLILLLLZI
            int r0 = r7.LJLIL
            r1.LIZ(r0)
            java.lang.String r0 = "Recent"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "Friend"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laf
        L7b:
            android.widget.TextView r0 = r7.LJLLI
            r0.setVisibility(r5)
        L80:
            android.widget.TextView r0 = r7.LJLLI
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r6 = r6 + r0
            android.widget.TextView r0 = r7.LJLLI
            int r0 = r0.getHeight()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r2 = r2 + r6
            int r0 = r7.getTop()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r7.LJLJLJ
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r7.LJLL
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r2
            int r0 = (int) r0
            android.widget.TextView r1 = r7.LJLLI
            float r0 = (float) r0
            r1.setTranslationY(r0)
            int r0 = r7.LJLIL
            r7.LJLJJLL = r0
            goto Lf
        Laf:
            android.widget.TextView r0 = r7.LJLLI
            r0.setText(r2)
            android.widget.TextView r0 = r7.LJLLI
            r0.setVisibility(r4)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114194dz.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) this.LJLJI).size()) {
                break;
            }
            if (TextUtils.equals(str, (CharSequence) ListProtector.get(this.LJLJI, i))) {
                this.LJLIL = i;
                break;
            }
            i++;
        }
        invalidate();
    }

    public void setIndexLetterTv(TextView textView) {
        this.LJLLI = textView;
    }

    public void setOnLetterTouchListener(InterfaceC114204e0 interfaceC114204e0) {
        this.LJLILLLLZI = interfaceC114204e0;
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < ((ArrayList) this.LJLJJI).size(); i3++) {
            i2 += ((Integer) ListProtector.get(this.LJLJJI, i3)).intValue();
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

    public C114194dz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = -1;
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = context.getResources();
        Paint paint = new Paint(1);
        this.LJLLJ = paint;
        paint.setTextSize(KL2.LIZJ(context, 11.0f));
        this.LJLLJ.setTextAlign(Paint.Align.CENTER);
        this.LJLLJ.setColor(this.LJLJJL.getColor(R.color.ck));
        Paint paint2 = new Paint(1);
        this.LJLLILLLL = paint2;
        paint2.setTextSize(KL2.LIZJ(context, 11.0f));
        this.LJLLILLLL.setTextAlign(Paint.Align.CENTER);
        this.LJLLILLLL.setColor(this.LJLJJL.getColor(R.color.cv));
        this.LJLLLLLL = KL2.LIZJ(context, 2.0f);
        this.LJLLL = (int) KL2.LIZJ(context, 16.0f);
        this.LJLLLL = (int) (KL2.LIZJ(context, 16.0f) + this.LJLLLLLL);
        new Rect(0, 0, this.LJLLL, this.LJLLLL);
        this.LJLZ = new Rect();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.LJLJL = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.LJLLJ.getFontMetrics();
            int size3 = (int) (((ArrayList) this.LJLJI).size() * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.LJLJLJ = size2;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
