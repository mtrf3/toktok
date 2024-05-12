package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C114144du extends View {
    public int LJLIL;
    public InterfaceC93543lm LJLILLLLZI;
    public final List<String> LJLJI;
    public final List<Integer> LJLJJI;
    public Resources LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public TextView LJLLI;
    public final Paint LJLLILLLL;
    public final Paint LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public Bitmap LJLZ;
    public Bitmap LJZ;
    public Bitmap LJZI;
    public Bitmap LJZL;
    public Rect LL;
    public final Rect LLD;
    public int LLF;

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
        this.LLF = 0;
        for (int i = 0; i < ((ArrayList) this.LJLJI).size(); i++) {
            if (((String) ListProtector.get(this.LJLJI, i)).equals("recent")) {
                this.LLF++;
                Rect rect = this.LL;
                if (rect != null) {
                    int i2 = this.LJLLL;
                    rect.set(0, 0, i2, i2);
                }
                if (this.LJLIL == i) {
                    canvas.drawBitmap(this.LJZ, (Rect) null, this.LL, this.LJLLJ);
                } else {
                    canvas.drawBitmap(this.LJLZ, (Rect) null, this.LL, this.LJLLJ);
                }
            } else if (((String) ListProtector.get(this.LJLJI, i)).equals("Friend")) {
                this.LLF++;
                Rect rect2 = this.LL;
                if (rect2 != null) {
                    int i3 = this.LJLLLL;
                    int i4 = this.LJLLL;
                    rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                }
                if (this.LJLIL == i) {
                    canvas.drawBitmap(this.LJZL, (Rect) null, this.LL, this.LJLLJ);
                } else {
                    canvas.drawBitmap(this.LJZI, (Rect) null, this.LL, this.LJLLJ);
                }
            } else {
                this.LJLL = (this.LJLJLJ - (this.LJLLLL * this.LLF)) / (((ArrayList) this.LJLJI).size() - this.LLF);
                this.LJLLJ.getTextBounds((String) ListProtector.get(this.LJLJI, i), 0, ((String) ListProtector.get(this.LJLJI, i)).length(), this.LLD);
                float f = this.LJLJLLL / 2.0f;
                int i5 = this.LJLLLL;
                int i6 = this.LLF;
                float height = ((((i + 1) - i6) * this.LJLL) + (i5 * i6)) - (this.LLD.height() / 2.0f);
                if (this.LJLIL == i) {
                    canvas.drawText((String) ListProtector.get(this.LJLJI, i), f, height, this.LJLLJ);
                } else {
                    canvas.drawText((String) ListProtector.get(this.LJLJI, i), f, height, this.LJLLILLLL);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r5 != 2) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r5 = r9.getAction()
            android.widget.TextView r0 = r8.LJLLI
            r2 = 0
            if (r0 != 0) goto La
            return r2
        La:
            r1 = -1
            r4 = 8
            r3 = 1
            if (r5 == 0) goto L1f
            if (r5 == r3) goto L19
            r0 = 2
            if (r5 == r0) goto L1f
        L15:
            r8.invalidate()
            return r3
        L19:
            r0.setVisibility(r4)
            r8.LJLJJLL = r1
            goto L15
        L1f:
            float r7 = r9.getY()
            int r0 = r8.LJLJLJ
            int r6 = r8.LJLL
            int r0 = r0 + r6
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            android.widget.TextView r0 = r8.LJLLI
            r0.setVisibility(r4)
            r8.LJLJJLL = r1
            return r3
        L35:
            int r1 = r8.LJLLLL
            float r0 = (float) r1
            float r0 = r7 / r0
            int r0 = (int) r0
            r8.LJLIL = r0
            int r5 = r8.LLF
            if (r0 < r5) goto L4b
            int r1 = r1 * r5
            float r0 = (float) r1
            float r1 = r7 - r0
            float r0 = (float) r6
            float r1 = r1 / r0
            int r0 = (int) r1
            int r0 = r0 + r5
            r8.LJLIL = r0
        L4b:
            int r1 = r8.LJLIL
            int r0 = r8.LJLJJLL
            if (r1 == r0) goto L87
            X.3lm r0 = r8.LJLILLLLZI
            if (r0 == 0) goto L87
            if (r1 < 0) goto L87
            java.util.List<java.lang.String> r0 = r8.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L87
            java.util.List<java.lang.String> r1 = r8.LJLJI
            int r0 = r8.LJLIL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "recent"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "Friend"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb6
        L7b:
            android.widget.TextView r0 = r8.LJLLI
            r0.setVisibility(r4)
        L80:
            X.3lm r1 = r8.LJLILLLLZI
            int r0 = r8.LJLIL
            r1.LIZ(r0)
        L87:
            android.widget.TextView r0 = r8.LJLLI
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r7 = r7 + r0
            android.widget.TextView r0 = r8.LJLLI
            int r0 = r0.getHeight()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r2 = r2 + r7
            int r0 = r8.getTop()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r8.LJLJLJ
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r8.LJLL
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r2
            int r0 = (int) r0
            android.widget.TextView r1 = r8.LJLLI
            float r0 = (float) r0
            r1.setTranslationY(r0)
            int r0 = r8.LJLIL
            r8.LJLJJLL = r0
            goto L15
        Lb6:
            android.widget.TextView r0 = r8.LJLLI
            r0.setText(r1)
            android.widget.TextView r0 = r8.LJLLI
            r0.setVisibility(r2)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114144du.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setIndexLetters(List<String> list) {
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(list);
        requestLayout();
    }

    public void setOnLetterTouchListener(InterfaceC93543lm interfaceC93543lm) {
        this.LJLILLLLZI = interfaceC93543lm;
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

    public void setCurrentIndex(int i) {
        this.LJLIL = i;
        invalidate();
    }

    public C114144du(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = -1;
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        Paint paint = new Paint(1);
        this.LJLLILLLL = paint;
        Paint paint2 = new Paint(1);
        this.LJLLJ = paint2;
        this.LLD = new Rect();
        this.LLF = 0;
        this.LJLJJL = context.getResources();
        paint2.setTextSize(KL2.LIZJ(context, 11.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(C79045V0n.LJI(R.attr.go, context).intValue());
        paint2.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        paint.setTextSize(KL2.LIZJ(context, 11.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(C79045V0n.LJI(R.attr.gp, context).intValue());
        paint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        this.LJLZ = ((BitmapDrawable) this.LJLJJL.getDrawable(R.drawable.bj6)).getBitmap();
        this.LJZ = ((BitmapDrawable) this.LJLJJL.getDrawable(R.drawable.bj5)).getBitmap();
        this.LJZI = ((BitmapDrawable) this.LJLJJL.getDrawable(R.drawable.bjk)).getBitmap();
        this.LJZL = ((BitmapDrawable) this.LJLJJL.getDrawable(R.drawable.bjj)).getBitmap();
        this.LJLLLLLL = KL2.LIZJ(context, 2.0f);
        this.LJLLL = (int) KL2.LIZJ(context, 16.0f);
        this.LJLLLL = (int) (KL2.LIZJ(context, 16.0f) + this.LJLLLLLL);
        int i = this.LJLLL;
        this.LL = new Rect(0, 0, i, i);
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
