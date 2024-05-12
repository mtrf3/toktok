package X;

import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.lynx.tasm.base.LLog;
import defpackage.g0;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VS7 implements InterfaceC41998Ge2 {
    public final /* synthetic */ LynxTextAreaView LIZ;

    @Override // X.InterfaceC41998Ge2
    public final void LIZ() {
        Method declaredMethod;
        int i;
        ClipData newPlainText;
        int selectionStart = Selection.getSelectionStart(LynxTextAreaView.LJJIJIL(this.LIZ).getText());
        int selectionEnd = Selection.getSelectionEnd(LynxTextAreaView.LJJIJIL(this.LIZ).getText());
        try {
            if (Build.VERSION.SDK_INT <= 22) {
                declaredMethod = TextView.class.getDeclaredMethod("stopSelectionActionMode", new Class[0]);
                o.LJFF(declaredMethod, "TextView::class.java.get…stopSelectionActionMode\")");
            } else {
                declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                o.LJFF(declaredMethod, "TextView::class.java.get…hod(\"stopTextActionMode\")");
            }
            if (selectionStart == -1 || selectionEnd == -1) {
                LynxTextAreaView lynxTextAreaView = this.LIZ;
                ClipData newPlainText2 = ClipData.newPlainText(null, "");
                o.LJFF(newPlainText2, "ClipData.newPlainText(null, \"\")");
                lynxTextAreaView.LJJIL(newPlainText2);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(LynxTextAreaView.LJJIJIL(this.LIZ), new Object[0]);
                return;
            }
            if (selectionStart <= selectionEnd) {
                i = selectionStart;
            } else {
                i = selectionEnd;
            }
            if (selectionStart <= selectionEnd) {
                selectionStart = selectionEnd;
            }
            LynxTextAreaView lynxTextAreaView2 = this.LIZ;
            if (LynxTextAreaView.LJJIJIL(lynxTextAreaView2).getText() != null) {
                C41997Ge1 c41997Ge1 = lynxTextAreaView2.LLIIL;
                if (c41997Ge1 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c41997Ge1.getText());
                    for (VSB vsb : (VSB[]) spannableStringBuilder.getSpans(i, selectionStart, VSB.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(vsb);
                        spannableStringBuilder.delete(spanStart, spannableStringBuilder.getSpanEnd(vsb));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(vsb.LIZIZ);
                        LIZ.append(vsb.LIZ);
                        spannableStringBuilder.insert(spanStart, (CharSequence) X1D.LIZIZ(LIZ));
                    }
                    if (g0.LJJIZ()) {
                        for (C6X4 c6x4 : (C6X4[]) spannableStringBuilder.getSpans(i, selectionStart, C6X4.class)) {
                            spannableStringBuilder.removeSpan(c6x4);
                        }
                    }
                    if (i <= spannableStringBuilder.length() && selectionStart <= spannableStringBuilder.length()) {
                        newPlainText = ClipData.newPlainText(null, spannableStringBuilder.subSequence(i, selectionStart));
                        o.LJFF(newPlainText, "ClipData.newPlainText(\n …                        )");
                    } else {
                        newPlainText = ClipData.newPlainText(null, "");
                        o.LJFF(newPlainText, "ClipData.newPlainText(null, \"\")");
                    }
                    this.LIZ.LJJIL(newPlainText);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LynxTextAreaView.LJJIJIL(this.LIZ), new Object[0]);
                    return;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        } catch (NoSuchMethodException unused) {
            LLog.LIZLLL(4, "LynxTextAreaView", "Unable to find stopTextActionMode method");
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("An unexpected error was encountered while getting the stopTextActionMode method. error message: ");
            LIZ2.append(th.getMessage());
            LLog.LIZLLL(4, "LynxTextAreaView", X1D.LIZIZ(LIZ2));
        }
    }

    public VS7(LynxTextAreaView lynxTextAreaView) {
        this.LIZ = lynxTextAreaView;
    }
}
