package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.f;

/* renamed from: X.0FD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FD {
    public final C0FC LIZ;

    public C0FD(final TextView textView) {
        TMC.LJIIIZ(textView, "textView cannot be null");
        this.LIZ = new C0FC(textView) { // from class: X.1E9
            public final C1E8 LIZ;

            @Override // X.C0FC
            public final boolean LIZIZ() {
                return this.LIZ.LIZJ;
            }

            {
                this.LIZ = new C1E8(textView);
            }

            @Override // X.C0FC
            public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
                if (!f.LIZJ()) {
                    return inputFilterArr;
                }
                return this.LIZ.LIZ(inputFilterArr);
            }

            @Override // X.C0FC
            public final void LIZJ(boolean z) {
                if (!f.LIZJ()) {
                    return;
                }
                this.LIZ.LIZJ(z);
            }

            @Override // X.C0FC
            public final void LIZLLL(boolean z) {
                if (!f.LIZJ()) {
                    this.LIZ.LIZJ = z;
                } else {
                    this.LIZ.LIZLLL(z);
                }
            }

            @Override // X.C0FC
            public final TransformationMethod LJ(TransformationMethod transformationMethod) {
                if (!f.LIZJ()) {
                    return transformationMethod;
                }
                return this.LIZ.LJ(transformationMethod);
            }
        };
    }
}
