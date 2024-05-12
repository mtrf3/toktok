package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06720Oe {
    public static boolean LJFF(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static ColorStateList LIZ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!LJFF(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                return C0OP.LIZ(resources, resources.getXml(typedArray.getResourceId(1, 0)), theme);
            } catch (Exception unused) {
                return null;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed to resolve attribute at index ");
        LIZ.append(1);
        LIZ.append(": ");
        LIZ.append(typedValue);
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }

    public static String LJ(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!LJFF(xmlPullParser, str)) {
            return null;
        }
        return C16880lQ.LLLZLZ(typedArray, i);
    }

    public static TypedArray LJI(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static C0OQ LIZIZ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (LJFF(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0OQ(null, null, typedValue.data);
            }
            try {
                C0OQ LIZ = C0OQ.LIZ(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                if (LIZ != null) {
                    return LIZ;
                }
            } catch (Exception unused) {
            }
        }
        return new C0OQ(null, null, 0);
    }

    public static float LIZJ(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!LJFF(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int LIZLLL(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!LJFF(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }
}
