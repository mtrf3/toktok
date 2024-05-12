package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6DL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DL {
    public final Context LIZ;
    public final List<C6DM> LIZIZ;

    public C6DL(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = new ArrayList();
    }

    public final void LIZ(C6DQ arrowAction) {
        o.LJIIIZ(arrowAction, "arrowAction");
        ((ArrayList) this.LIZIZ).add(arrowAction);
    }
}
