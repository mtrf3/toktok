package X;

import java.util.HashMap;
import java.util.Observable;

/* loaded from: classes12.dex */
public final class PNI extends Observable {
    public static volatile PNI LIZ;

    public static PNI LIZ() {
        if (LIZ == null) {
            synchronized (PNI.class) {
                if (LIZ == null) {
                    LIZ = new PNI();
                }
            }
        }
        return LIZ;
    }

    public final void LIZIZ(long j, long j2, String str, String str2, String str3) {
        HashMap LIZJ = C03660Ck.LIZJ("url", str);
        LIZJ.put("sent_bytes", Long.valueOf(j));
        LIZJ.put("received_bytes", Long.valueOf(j2));
        LIZJ.put("content_type", str2);
        LIZJ.put("request_log", str3);
        setChanged();
        notifyObservers(LIZJ);
    }
}
