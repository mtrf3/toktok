package com.bytedance.tux.tag;

import X.C110614Vt;
import X.C32151Nz;
import X.C61328O5c;
import X.C78897Uxp;
import X.C79045V0n;
import X.C7MY;
import X.O6R;
import X.SY3;
import X.SY6;
import X.SY9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TuxTag extends TuxTextView {
    public final boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public final int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public final RectF LLF;
    public boolean LLFF;
    public final SY3 LLFFF;
    public final Map<Integer, View> LLFII;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxTag(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        Map<Integer, View> map = this.LLFII;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJIL() {
        int i;
        if (!this.LJLLLL || !this.LLD) {
            return;
        }
        if (TextUtils.isEmpty(getText())) {
            i = 0;
        } else {
            i = this.LL;
        }
        SY3 sy3 = this.LLFFF;
        boolean z = this.LLFF;
        SY9 sy9 = sy3.LJI;
        if (sy9 != null) {
            sy9.LJIIJ = z;
            sy9.invalidateSelf();
        }
        SY9 sy92 = sy3.LJII;
        if (sy92 != null) {
            sy92.LJIIJ = z;
            sy92.invalidateSelf();
        }
        this.LLFFF.LIZJ(i);
    }

    private final void setTagSize$___ob_twin___(int i) {
        this.LJZL = i;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.LLF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayer(this.LLF, null);
        super.draw(canvas);
        canvas.restore();
    }

    public final void setHollow(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        this.LLFF = z;
        TextPaint paint = getPaint();
        if (z) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        } else {
            porterDuffXfermode = null;
        }
        paint.setXfermode(porterDuffXfermode);
        LJJJIL();
    }

    public void setIconHeight(int i) {
        this.LLFFF.LIZIZ = i;
        LJJJIL();
    }

    public void setIconTintColor(int i) {
        this.LLFFF.LIZLLL = Integer.valueOf(i);
        LJJJIL();
    }

    public void setIconTintColorRes(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            setIconTintColor(LJI.intValue());
        }
    }

    public void setIconWidth(int i) {
        this.LLFFF.LIZJ = i;
        LJJJIL();
    }

    public final void setTagBackgroundColor(int i) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    public final void setTagIcon(Integer num) {
        SY3 sy3 = this.LLFFF;
        sy3.LJI = sy3.LIZIZ(num);
        LJJJIL();
    }

    public final void setTagIconBitmap(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        SY3 sy3 = this.LLFFF;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        sy3.getClass();
        SY9 sy9 = new SY9(context, -1);
        sy9.LIZ = new BitmapDrawable(context.getResources(), bitmap);
        sy3.LJI = sy9;
        LJJJIL();
    }

    public final void setTagSize(int i) {
        SY6 sy6;
        setTagSize$___ob_twin___(i);
        setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(160)));
        setTextColorRes(R.attr.dj);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        Context context = getContext();
        o.LJIIIIZZ(context, "tag.context");
        setBackground(c110614Vt.LIZ(context));
        C78897Uxp.LJJJJJL(this, C32151Nz.LJIIZILJ(2));
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        sy6 = new SY6(19, 5, 2, 62, 16);
                    }
                } else {
                    sy6 = new SY6(17, 5, 2, 72, 12);
                }
            } else {
                sy6 = new SY6(15, 5, 2, 72, 12);
            }
        } else {
            sy6 = new SY6(13, 4, 0, 92, 0);
        }
        setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy6.LJLIL))));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy6.LJLILLLLZI)));
        setPadding(LJJIIZ, 0, LJJIIZ, 0);
        int LIZIZ = C7MY.LIZIZ(sy6.LJLJI);
        this.LL = LIZIZ;
        if (LIZIZ <= 0) {
            z = false;
        }
        this.LLD = z;
        LJJJIL();
        setTuxFont(sy6.LJLJJI);
        int i2 = sy6.LJLJJL;
        if (i2 > 0) {
            int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2)));
            setIconTintColorRes(R.attr.dj);
            setIconHeight(LJJIIZ2);
            setIconWidth(LJJIIZ2);
        }
    }

    public final void setTagTextColor(int i) {
        this.LJZI = i;
        setTextColor(i);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        LJJJIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxTag(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            r3 = 4
            r0 = r10 & 4
            r6 = 0
            if (r0 == 0) goto Lbe
            r5 = 2130968908(0x7f04014c, float:1.7546483E38)
        Le:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r8, r0)
            r7.LLFII = r0
            r7.<init>(r8, r9, r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r7.LJLZ = r1
            r4 = -1
            r7.LJZ = r4
            r7.LJZI = r4
            r2 = 1
            r7.LLD = r2
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.LLF = r0
            r7.LJLLLL = r2
            X.SY3 r2 = new X.SY3
            r2.<init>(r7)
            r7.LLFFF = r2
            r2.LIZ(r9, r5)
            if (r9 == 0) goto L77
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x00c2: FILL_ARRAY_DATA , data: [2130971837, 2130971902, 2130971913, 2130971915, 2130971988, 2130971989, 2130971990, 2130971991} // fill-array
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r0, r5, r6)
            java.lang.String r0 = "context.obtainStyledAttr….TuxTag, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r0 = 6
            int r0 = r5.getInt(r0, r4)
            r7.LJZL = r0
            r0 = -7829368(0xffffffffff888888, float:NaN)
            int r0 = r5.getColor(r6, r0)
            r7.LJZ = r0
            r0 = 5
            boolean r0 = r5.getBoolean(r0, r6)
            r7.setHollow(r0)
            r0 = 7
            int r0 = r5.getColor(r0, r4)
            r7.LJZI = r0
            int r0 = r5.getColor(r3, r4)
            r5.recycle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZLLL = r0
        L77:
            int r0 = r7.LJZL
            r7.setTagSize(r0)
            int r0 = r7.getMinWidth()
            r7.LJLLLLLL = r0
            int r0 = r7.getMaxWidth()
            r7.LJLZ = r0
            r0 = 19
            r7.setGravity(r0)
            r7.setSingleLine()
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r0)
            int r0 = r7.LL
            if (r0 <= 0) goto Lb8
        L99:
            r7.setCompoundDrawablePadding(r0)
            int r0 = r7.LJZI
            r7.setTextColor(r0)
            int r0 = r7.LJZ
            r7.setTagBackgroundColor(r0)
            r7.LJJJIL()
            int r0 = r7.LJLZ
            if (r0 >= r1) goto Lb0
            r7.setMaxWidth(r0)
        Lb0:
            int r0 = r7.LJLLLLLL
            if (r0 <= 0) goto Lb7
            r7.setMinWidth(r0)
        Lb7:
            return
        Lb8:
            r0 = 2
            int r0 = X.C7MY.LIZIZ(r0)
            goto L99
        Lbe:
            r5 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.tag.TuxTag.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJJIL();
    }
}
