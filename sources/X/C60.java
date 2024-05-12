package X;

import androidx.lifecycle.Observer;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes6.dex */
public final class C60 {
    public final Object LIZ;

    public final void LIZIZ() {
        Observer observer = (Observer) ((Queue) this.LIZ).poll();
        if (observer != null) {
            observer.onChanged(1);
        }
    }

    public C60(int i) {
        if (i != 1) {
            this.LIZ = new LinkedList();
        } else {
            this.LIZ = new LinkedHashMap();
        }
    }

    public final YMJ LIZ(long j) {
        return (YMJ) ((LinkedHashMap) this.LIZ).get(Long.valueOf(j));
    }
}
