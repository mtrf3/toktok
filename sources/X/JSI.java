package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSI {
    public static JSH LIZIZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return LIZ(parent, new C49309JWv());
    }

    public static JSH LIZ(ViewGroup parent, JSS jss) {
        List<JSR> LIZ;
        o.LJIIIZ(parent, "parent");
        long currentTimeMillis = System.currentTimeMillis();
        Context context = C48966JJq.LIZ(parent);
        if (context == null) {
            context = parent.getContext();
        }
        o.LJIIIIZZ(context, "context");
        JSH jsh = new JSH(new C50107JlX(context));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSP P = jsh.P();
        if (P != null && jss != null && (LIZ = jss.LIZ(P.LJLIL)) != null) {
            for (JSR delegate : LIZ) {
                JSP P2 = jsh.P();
                if (P2 != null) {
                    o.LJIIIZ(delegate, "delegate");
                    ((ArrayList) P2.LJLILLLLZI).add(delegate);
                }
            }
        }
        long j = JSH.LJLZ;
        if (currentTimeMillis2 <= j) {
            currentTimeMillis2 = j;
        }
        JSH.LJLZ = currentTimeMillis2;
        return jsh;
    }
}
