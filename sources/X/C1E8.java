package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.1E8, reason: invalid class name */
/* loaded from: classes.dex */
public class C1E8 extends C0FC {
    public final TextView LIZ;
    public final C0F9 LIZIZ;
    public boolean LIZJ = true;

    @Override // X.C0FC
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0F9] */
    public C1E8(final TextView textView) {
        this.LIZ = textView;
        this.LIZIZ = new InputFilter(textView) { // from class: X.0F9
            public final TextView LJLIL;
            public C1E7 LJLILLLLZI;

            {
                this.LJLIL = textView;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [X.1E7] */
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (this.LJLIL.isInEditMode()) {
                    return charSequence;
                }
                int LIZIZ = f.LIZ().LIZIZ();
                if (LIZIZ != 0) {
                    if (LIZIZ != 1) {
                        if (LIZIZ != 3) {
                            return charSequence;
                        }
                    } else {
                        if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.LJLIL.getText()) || charSequence == null) {
                            return charSequence;
                        }
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return f.LIZ().LJI(0, charSequence.length(), charSequence);
                    }
                }
                f LIZ = f.LIZ();
                if (this.LJLILLLLZI == null) {
                    final TextView textView2 = this.LJLIL;
                    this.LJLILLLLZI = new AnonymousClass089(textView2, this) { // from class: X.1E7
                        public final Reference<TextView> LIZ;
                        public final Reference<C0F9> LIZIZ;

                        @Override // X.AnonymousClass089
                        public final void LIZIZ() {
                            InputFilter[] filters;
                            int length;
                            TextView textView3 = this.LIZ.get();
                            C0F9 c0f9 = this.LIZIZ.get();
                            if (c0f9 == null || textView3 == null || (filters = textView3.getFilters()) == null) {
                                return;
                            }
                            for (InputFilter inputFilter : filters) {
                                if (inputFilter == c0f9) {
                                    if (textView3.isAttachedToWindow()) {
                                        f LIZ2 = f.LIZ();
                                        CharSequence text = textView3.getText();
                                        if (text == null) {
                                            length = 0;
                                        } else {
                                            LIZ2.getClass();
                                            length = text.length();
                                        }
                                        CharSequence LJI = LIZ2.LJI(0, length, text);
                                        int selectionStart = Selection.getSelectionStart(LJI);
                                        int selectionEnd = Selection.getSelectionEnd(LJI);
                                        textView3.setText(LJI);
                                        if (LJI instanceof Spannable) {
                                            Spannable spannable = (Spannable) LJI;
                                            if (selectionStart >= 0) {
                                                if (selectionEnd >= 0) {
                                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                                    return;
                                                } else {
                                                    Selection.setSelection(spannable, selectionStart);
                                                    return;
                                                }
                                            }
                                            if (selectionEnd < 0) {
                                                return;
                                            }
                                            Selection.setSelection(spannable, selectionEnd);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        }

                        {
                            this.LIZ = new WeakReference(textView2);
                            this.LIZIZ = new WeakReference(this);
                        }
                    };
                }
                LIZ.LJII(this.LJLILLLLZI);
                return charSequence;
            }
        };
    }

    @Override // X.C0FC
    public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
        if (!this.LIZJ) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0F9) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        for (InputFilter inputFilter2 : inputFilterArr) {
            if (inputFilter2 == this.LIZIZ) {
                return inputFilterArr;
            }
        }
        InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
        System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
        inputFilterArr3[length2] = this.LIZIZ;
        return inputFilterArr3;
    }

    @Override // X.C0FC
    public final void LIZJ(boolean z) {
        if (z) {
            this.LIZ.setTransformationMethod(LJ(this.LIZ.getTransformationMethod()));
        }
    }

    @Override // X.C0FC
    public final void LIZLLL(boolean z) {
        this.LIZJ = z;
        this.LIZ.setTransformationMethod(LJ(this.LIZ.getTransformationMethod()));
        this.LIZ.setFilters(LIZ(this.LIZ.getFilters()));
    }

    @Override // X.C0FC
    public final TransformationMethod LJ(TransformationMethod transformationMethod) {
        if (this.LIZJ) {
            if ((transformationMethod instanceof C0FF) || (transformationMethod instanceof PasswordTransformationMethod)) {
                return transformationMethod;
            }
            return new C0FF(transformationMethod);
        }
        if (transformationMethod instanceof C0FF) {
            return ((C0FF) transformationMethod).LJLIL;
        }
        return transformationMethod;
    }
}
