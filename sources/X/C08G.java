package X;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;

/* renamed from: X.08G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08G {
    public final C08D LIZ;
    public final C08N LIZIZ;
    public final AnonymousClass088 LIZJ;

    public C08G(C08N c08n, C08D c08d, C28671Ap c28671Ap) {
        this.LIZ = c08d;
        this.LIZIZ = c08n;
        this.LIZJ = c28671Ap;
    }

    public static boolean LIZ(Editable editable, KeyEvent keyEvent, boolean z) {
        C08H[] c08hArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c08hArr = (C08H[]) editable.getSpans(selectionStart, selectionEnd, C08H.class)) != null && c08hArr.length > 0) {
            for (C08H c08h : c08hArr) {
                int spanStart = editable.getSpanStart(c08h);
                int spanEnd = editable.getSpanEnd(c08h);
                if (z) {
                    if (spanStart == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                    if (selectionStart <= spanStart && selectionStart < spanEnd) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                } else {
                    if (spanEnd == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                    if (selectionStart <= spanStart) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r11 >= r6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.CharSequence r14, int r15, int r16, X.C08E r17) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08G.LIZIZ(java.lang.CharSequence, int, int, X.08E):boolean");
    }
}
