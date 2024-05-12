package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpt, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91145Zpt extends ViewGroup.LayoutParams {
    public boolean LIZ;
    public final int LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public int LJ;

    public C91145Zpt() {
        super(-1, -1);
    }

    public C91145Zpt(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C91145Zpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C91362ZtO.LLILZ);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…utes(attrs, LAYOUT_ATTRS)");
        this.LIZIZ = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
