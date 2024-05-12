package X;

import java.util.HashMap;

/* renamed from: X.Ipn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47823Ipn {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final java.util.Map LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("avg_pow", Integer.valueOf(this.LIZIZ));
        hashMap.put("max_pow", Integer.valueOf(this.LIZ));
        int i = this.LIZJ;
        if (i > 0) {
            hashMap.put("over_pow", Integer.valueOf(i));
        }
        return hashMap;
    }
}
