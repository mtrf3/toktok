package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.VnU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80804VnU extends ViewGroup.LayoutParams {
    public boolean LIZ;
    public final int LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public int LJ;

    public C80804VnU() {
        super(-1, -1);
    }

    public C80804VnU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C80794VnK.LLIZ);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…utes(attrs, LAYOUT_ATTRS)");
        this.LIZIZ = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
