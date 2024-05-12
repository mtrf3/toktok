package X;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import androidx.appcompat.widget.c0;

/* renamed from: X.19D, reason: invalid class name */
/* loaded from: classes.dex */
public class C19D extends AnonymousClass032 {
    @Override // X.AnonymousClass032
    public void LIZ(StaticLayout.Builder builder, TextView textView) {
        Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            obj = c0.LIZLLL("getTextDirectionHeuristic").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) obj);
    }
}
