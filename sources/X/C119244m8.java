package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4m8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119244m8 extends TuxTextView {
    public SY9 LJLLLL;
    public SY9 LJLLLLLL;
    public SY9 LJLZ;
    public SY9 LJZ;
    public final java.util.Map<Integer, View> LJZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119244m8(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119244m8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZI;
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

    public final void LJJJJ() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(this.LJLLLL, this.LJLZ, this.LJLLLLLL, this.LJZ);
    }

    public final void setBottomIcon(C2068389v c2068389v) {
        SY9 sy9;
        if (c2068389v != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        this.LJZ = sy9;
        LJJJJ();
    }

    public final void setEndIcon(C2068389v c2068389v) {
        SY9 sy9;
        if (c2068389v != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        this.LJLLLLLL = sy9;
        LJJJJ();
    }

    public final void setStartIcon(C2068389v c2068389v) {
        SY9 sy9;
        if (c2068389v != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        this.LJLLLL = sy9;
        LJJJJ();
    }

    public final void setTopIcon(C2068389v c2068389v) {
        SY9 sy9;
        if (c2068389v != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        this.LJLZ = sy9;
        LJJJJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C119244m8(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r2 = r18
            r0 = r19 & 2
            if (r0 == 0) goto L7
            r2 = 0
        L7:
            r0 = r19 & 4
            r11 = 0
            if (r0 == 0) goto L77
            r1 = 2130968911(0x7f04014f, float:1.754649E38)
        Lf:
            java.lang.String r0 = "context"
            r3 = r17
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r4 = r16
            r4.LJZI = r0
            r4.<init>(r3, r2, r1)
            r0 = 21
            int[] r0 = new int[r0]
            r0 = {x007a: FILL_ARRAY_DATA , data: [2130971900, 2130971901, 2130971903, 2130971904, 2130971905, 2130971906, 2130971907, 2130971909, 2130971910, 2130971911, 2130971912, 2130971913, 2130971914, 2130971916, 2130971917, 2130971918, 2130971919, 2130972003, 2130972004, 2130972005, 2130972006} // fill-array
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r2, r0, r1, r11)
            java.lang.String r0 = "context.obtainStyledAttr…defStyleAttr, 0\n        )"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r6 = 11
            r7 = 19
            r8 = 15
            r9 = 4
            r10 = 9
            X.SY9 r0 = r4.LJJJIL(r5, r6, r7, r8, r9, r10)
            r4.LJLLLL = r0
            r6 = 1
            r7 = 18
            r8 = 14
            r9 = 3
            r10 = 8
            X.SY9 r0 = r4.LJJJIL(r5, r6, r7, r8, r9, r10)
            r4.LJLLLLLL = r0
            r6 = 12
            r7 = 20
            r8 = 16
            r9 = 5
            r10 = 10
            X.SY9 r0 = r4.LJJJIL(r5, r6, r7, r8, r9, r10)
            r4.LJLZ = r0
            r12 = 17
            r13 = 13
            r14 = 2
            r15 = 7
            r9 = r4
            r10 = r5
            X.SY9 r0 = r9.LJJJIL(r10, r11, r12, r13, r14, r15)
            r4.LJZ = r0
            r0 = 6
            int r0 = r5.getDimensionPixelSize(r0, r11)
            r4.setCompoundDrawablePadding(r0)
            r5.recycle()
            r4.LJJJJ()
            return
        L77:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119244m8.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final SY9 LJJJIL(TypedArray typedArray, int i, int i2, int i3, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i, 0);
        Integer num = null;
        if (resourceId == 0) {
            return null;
        }
        if (typedArray.hasValue(i2)) {
            num = Integer.valueOf(typedArray.getColor(i2, 0));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(i4, -1);
        boolean z = typedArray.getBoolean(i5, false);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = resourceId;
        c2068389v.LIZLLL = num;
        c2068389v.LIZIZ = dimensionPixelSize;
        c2068389v.LIZJ = dimensionPixelSize2;
        c2068389v.LJFF = z;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return c2068389v.LIZ(context);
    }
}
