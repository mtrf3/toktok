package X;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import o3.h0;

/* renamed from: X.03r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013903r {
    public static boolean LIZ(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            h0.LJIILJJIL(textView, new C16160kG(dragEvent.getClipData(), 3).LIZ.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean LIZIZ(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        h0.LJIILJJIL(view, new C16160kG(dragEvent.getClipData(), 3).LIZ.build());
        return true;
    }
}
