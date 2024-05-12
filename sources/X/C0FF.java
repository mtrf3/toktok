package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.f;

/* renamed from: X.0FF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FF implements TransformationMethod {
    public final TransformationMethod LJLIL;

    public C0FF(TransformationMethod transformationMethod) {
        this.LJLIL = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.LJLIL;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || f.LIZ().LIZIZ() != 1) {
            return charSequence;
        }
        f LIZ = f.LIZ();
        LIZ.getClass();
        return LIZ.LJI(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.LJLIL;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
