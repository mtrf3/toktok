package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.V1s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79076V1s {
    public static V8L LIZIZ(C79077V1t c79077V1t) {
        if (c79077V1t.LJIILL == null) {
            c79077V1t.LJIILL = new V8L();
        }
        return c79077V1t.LJIILL;
    }

    public static AbstractC78707Uul LIZJ(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return InterfaceC78716Uuu.LJJJLZIJ;
            case 1:
                return InterfaceC78716Uuu.LJJJZ;
            case 2:
                return InterfaceC78716Uuu.LJJL;
            case 3:
                return InterfaceC78716Uuu.LJJLI;
            case 4:
                return InterfaceC78716Uuu.LJJLIIIIJ;
            case 5:
                return InterfaceC78716Uuu.LJJLIIIJ;
            case 6:
                return InterfaceC78716Uuu.LJJLIIIJILLIZJL;
            case 7:
                return InterfaceC78716Uuu.LJJLIIIJJI;
            case 8:
                return InterfaceC78716Uuu.LJJLIIIJJIZ;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static Drawable LIZ(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ColorDrawable(typedValue.data);
            }
            return null;
        }
        return C04270Et.LIZIZ(context, resourceId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fc, code lost:
    
        if (r4 != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01fe, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0243, code lost:
    
        if (r3 != false) goto L119;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C79077V1t r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79076V1s.LIZLLL(X.V1t, android.content.Context, android.util.AttributeSet):void");
    }
}
