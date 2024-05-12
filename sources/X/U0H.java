package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U0H {
    public final U0G LIZ;
    public final U05 LIZIZ;
    public final WeakReference<View> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public U0H() {
        this((U0G) null, (U05) (0 == true ? 1 : 0), 7);
    }

    public U0H(U0G eventType, U05 state, WeakReference<View> weakReference) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(state, "state");
        this.LIZ = eventType;
        this.LIZIZ = state;
        this.LIZJ = weakReference;
    }

    public /* synthetic */ U0H(U0G u0g, U05 u05, int i) {
        this((i & 1) != 0 ? U0G.NONE : u0g, (i & 2) != 0 ? U05.NORMAL : u05, (WeakReference<View>) null);
    }
}
