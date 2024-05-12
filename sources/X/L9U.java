package X;

import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9U {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final ActivityC45651qj LIZ(View view) {
        Object obj;
        o.LJIIIZ(view, "<this>");
        Iterator it = OJ6.LJJIZ(view.getContext(), L9V.LJLIL).iterator();
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

    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS45S0100000_9((InterfaceC65784Pro) interfaceC65784Pro, 131));
        }
    }
}
