package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.1Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34501Xa extends F9E {
    public final XmlPullParser LJLIL;
    public int LJLILLLLZI = 0;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C34501Xa(XmlPullParser xmlPullParser) {
        this.LJLIL = xmlPullParser;
    }

    public final void Q(int i) {
        this.LJLILLLLZI = i | this.LJLILLLLZI;
    }

    public final String O(TypedArray typedArray, int i) {
        String LLLZLZ = C16880lQ.LLLZLZ(typedArray, i);
        Q(typedArray.getChangingConfigurations());
        return LLLZLZ;
    }

    public final C0OQ L(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        C0OQ LIZIZ = C06720Oe.LIZIZ(typedArray, this.LJLIL, theme, str, i);
        Q(typedArray.getChangingConfigurations());
        return LIZIZ;
    }

    public final float M(TypedArray typedArray, String str, int i, float f) {
        float LIZJ = C06720Oe.LIZJ(typedArray, this.LJLIL, str, i, f);
        Q(typedArray.getChangingConfigurations());
        return LIZJ;
    }

    public final int N(TypedArray typedArray, String str, int i, int i2) {
        int LIZLLL = C06720Oe.LIZLLL(typedArray, this.LJLIL, str, i, i2);
        Q(typedArray.getChangingConfigurations());
        return LIZLLL;
    }

    public final TypedArray P(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray LJI = C06720Oe.LJI(resources, theme, attributeSet, iArr);
        o.LJIIIIZZ(LJI, "obtainAttributes(\n      …          attrs\n        )");
        Q(LJI.getChangingConfigurations());
        return LJI;
    }
}
