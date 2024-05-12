package X;

import android.app.Activity;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Crr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32663Crr {
    public static final ActivityC45651qj LIZ(View view) {
        Object obj;
        o.LJIIIZ(view, "<this>");
        Iterator it = OJ6.LJJIZ(view.getContext(), C32662Crq.LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ActivityC45651qj) obj;
    }
}
