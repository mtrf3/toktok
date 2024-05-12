package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0TS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TS {
    public Object LIZ;

    public List LIZ() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName((String) this.LIZ);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    arrayList.add(inetAddress.getHostAddress());
                }
            }
            return arrayList;
        } catch (UnknownHostException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public /* synthetic */ C0TS() {
        this.LIZ = new ConcurrentHashMap();
    }

    public /* synthetic */ C0TS(int i) {
        if (i != 1) {
            if (i != 3) {
                this.LIZ = new ArrayList();
            } else {
                this.LIZ = new ArrayList();
            }
        }
    }
}
