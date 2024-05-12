package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.65A, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C65A extends C19K {
    public abstract void LJI(float f, int i);

    public abstract int getDefaultTextSize();

    public abstract int getEditFontSize();

    public abstract void setDefaultTextSize(int i);

    public abstract void setEditFontSize(int i);

    public abstract void setFontTypeChangedListener(InterfaceC159496Nt interfaceC159496Nt);

    public final void setFontSize(int i) {
        LJI(getLineSpacingExtra() / (i / getDefaultTextSize()), i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C65A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
