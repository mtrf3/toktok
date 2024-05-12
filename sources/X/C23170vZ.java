package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0vZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23170vZ {
    public static int LIZIZ(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static void LIZJ(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
