package X;

import java.util.HashMap;
import java.util.Observable;

/* loaded from: classes12.dex */
public final class PNJ extends Observable {
    public static volatile PNJ LIZ;

    public static PNJ LIZ() {
        if (LIZ == null) {
            synchronized (PNJ.class) {
                if (LIZ == null) {
                    LIZ = new PNJ();
                }
            }
        }
        return LIZ;
    }

    public final void LIZIZ(String str, long j, long j2, boolean z) {
        HashMap LIZJ = C03660Ck.LIZJ("url", str);
        LIZJ.put("sent_bytes", Long.valueOf(j));
        LIZJ.put("received_bytes", Long.valueOf(j2));
        LIZJ.put("is_heartbeat_frame", Boolean.valueOf(z));
        setChanged();
        notifyObservers(LIZJ);
    }
}
