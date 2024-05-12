package X;

import java.util.HashMap;

/* renamed from: X.B0k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28082B0k extends AbstractC28083B0l {
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(super.LIZ());
        hashMap.put("duration", Long.valueOf(this.LIZJ));
        hashMap.put("api_duration", Long.valueOf(this.LIZLLL));
        hashMap.put("retry_count", Integer.valueOf(this.LJ));
        return hashMap;
    }

    public C28082B0k(long j, long j2, int i) {
        super("rd_tiktokec_anchor_order_submit_duration");
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i;
    }
}
