package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class U0Z {
    public final View LIZ;
    public final DataChannel LIZIZ;
    public final java.util.Set<C76485U0b> LIZJ = new HashSet();

    public final void LIZIZ() {
        java.util.Set<C76485U0b> set = this.LIZJ;
        if (set != null) {
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                C76485U0b c76485U0b = (C76485U0b) it.next();
                DataChannel dataChannel = c76485U0b.LIZ;
                dataChannel.getClass();
                dataChannel.jv0(c76485U0b);
                ((HashMap) c76485U0b.LIZJ).clear();
            }
            ((HashSet) this.LIZJ).clear();
        }
    }

    public final <V extends View> C76484U0a<V> LIZ(int i) {
        View view = this.LIZ;
        if (view != null) {
            return new C76484U0a<>(this.LIZIZ, view.findViewById(i), this);
        }
        throw new IllegalStateException("Unable to find view by id due to null root view.");
    }

    public U0Z(View view, DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
        this.LIZ = view;
    }
}
