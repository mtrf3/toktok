package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.Qjm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67834Qjm {
    public final java.util.Map<BasePendingResult<?>, Boolean> LIZ = Collections.synchronizedMap(new WeakHashMap());
    public final java.util.Map<C67649Qgn<?>, Boolean> LIZIZ = Collections.synchronizedMap(new WeakHashMap());

    public final void LIZ(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.LIZ) {
            hashMap = new HashMap(this.LIZ);
        }
        synchronized (this.LIZIZ) {
            hashMap2 = new HashMap(this.LIZIZ);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).LJFF(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C67649Qgn) entry2.getKey()).LIZJ(new ETK(status));
            }
        }
    }
}
