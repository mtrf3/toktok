package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.1Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28571Af implements InterfaceC16730lB {
    @Override // X.InterfaceC16730lB
    public final C16190kJ LIZ(View view, C16190kJ c16190kJ) {
        CharSequence coerceToStyledText;
        if (c16190kJ.LIZ.getSource() == 2) {
            return c16190kJ;
        }
        ClipData LIZ = c16190kJ.LIZ.LIZ();
        int LLLLLLLLL = c16190kJ.LIZ.LLLLLLLLL();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < LIZ.getItemCount(); i++) {
            ClipData.Item itemAt = LIZ.getItemAt(i);
            if ((LLLLLLLLL & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
