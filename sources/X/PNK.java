package X;

import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PNK extends Observable {
    public static volatile PNK LIZJ;
    public volatile boolean LIZ;
    public final CopyOnWriteArrayList<Integer> LIZIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(boolean z, List<Integer> list) {
        this.LIZ = z;
        this.LIZIZ.clear();
        this.LIZIZ.addAll(list);
        HashMap hashMap = new HashMap();
        hashMap.put("user_blocked_state", Boolean.valueOf(this.LIZ));
        hashMap.put("drop_reason_list", this.LIZIZ);
        setChanged();
        notifyObservers(hashMap);
    }
}
