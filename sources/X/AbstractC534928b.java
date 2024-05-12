package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.28b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC534928b<T extends View> extends QXX {
    public final T LJLIL;

    public abstract void LLLLZIL(TypedArray typedArray);

    public AbstractC534928b(T t) {
        super((Object) null);
        this.LJLIL = t;
    }

    public final void LLLLZLLIL(int i) {
        Context context = this.LJLIL.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, LLLLLLL());
        LLLLZ(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public final void LLLLZ(Context context, TypedArray typedArray) {
        LLLLZIL(typedArray);
    }

    public void LLLLZLLLI(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = this.LJLIL.getContext().obtainStyledAttributes(attributeSet, LLLLLLL(), i, i2);
        LLLLZIL(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
