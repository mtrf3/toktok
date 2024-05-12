package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.7W6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7W6 {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZ(Context context, int i, ViewGroup viewGroup) {
        View result;
        o.LJIIIZ(context, "context");
        boolean z = true;
        if (C16970lZ.LIZ(i, context)) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                if (viewGroup == null) {
                    z = false;
                }
                result = C16970lZ.LIZJ(i, LJJIFFI, viewGroup, z);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (C16880lQ.LLLLIIIILLL() != C16880lQ.LLJJJJ().getThread()) {
            result = C16950lX.LIZ(context, i, viewGroup, true, -1);
        } else {
            result = View.inflate(context, i, viewGroup);
        }
        o.LJIIIIZZ(result, "result");
        return result;
    }
}
