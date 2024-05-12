package X;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC91694Zyk("activity")
/* renamed from: X.a5g, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92124a5g extends AbstractC91695Zyl<C92123a5f> {
    public final Activity LIZJ;

    @Override // X.AbstractC91695Zyl
    public final C92123a5f LIZ() {
        return new C92123a5f(this);
    }

    @Override // X.AbstractC91695Zyl
    public final boolean LJFF() {
        Activity activity = this.LIZJ;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    public C92124a5g(Context context) {
        Object obj;
        o.LJIIIZ(context, "context");
        Iterator it = OJ6.LJJIZ(context, C92395aA3.LJLIL).iterator();
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
        this.LIZJ = (Activity) obj;
    }

    @Override // X.AbstractC91695Zyl
    public final C91720ZzA LIZJ(C91720ZzA c91720ZzA) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Destination ");
        LIZ.append(c91720ZzA.LJLJJLL);
        LIZ.append(" does not have an Intent set.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }
}
