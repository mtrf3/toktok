package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.VeS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80244VeS {
    public static final int[] LIZ = {R.attr.a4r};
    public static final int[] LIZIZ = {R.attr.a4u};

    public static void LIZJ(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(a1.LJ("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void LIZ(Context context, AttributeSet attributeSet, int i, int i2) {
        if (((Number) C35244DsO.LIZ.getValue()).intValue() > 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textAppearance, R.attr.abo, R.attr.abp}, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.ai_, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                LIZJ(context, LIZIZ, "Theme.MaterialComponents");
            }
        }
        LIZJ(context, LIZ, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5.getResourceId(0, -1) != (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int r10, int r11, int... r12) {
        /*
            X.Ol8 r0 = X.C35244DsO.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6 = 1
            r1 = 0
            if (r0 <= 0) goto L11
        L10:
            return
        L11:
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [16842804, 2130969941, 2130969942} // fill-array
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r8, r0, r10, r11)
            r0 = 2
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 != 0) goto L26
            r5.recycle()
            goto L10
        L26:
            int r0 = r12.length
            r4 = -1
            if (r0 != 0) goto L36
            int r0 = r5.getResourceId(r1, r4)
            if (r0 == r4) goto L49
        L30:
            r5.recycle()
            if (r6 == 0) goto L52
            goto L10
        L36:
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r9, r10, r11)
            int r2 = r12.length
            r1 = 0
        L3c:
            if (r1 >= r2) goto L4e
            r0 = r12[r1]
            int r0 = r3.getResourceId(r0, r4)
            if (r0 != r4) goto L4b
            r3.recycle()
        L49:
            r6 = 0
            goto L30
        L4b:
            int r1 = r1 + 1
            goto L3c
        L4e:
            r3.recycle()
            goto L30
        L52:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80244VeS.LIZIZ(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static TypedArray LIZLLL(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        LIZ(context, attributeSet, i, i2);
        LIZIZ(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
