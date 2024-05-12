package X;

import java.util.HashMap;

/* renamed from: X.VLu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79598VLu {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;

    public final java.util.Map<String, Long> LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("open_time", Long.valueOf(this.LIZ));
        hashMap.put("container_init_start", Long.valueOf(this.LIZIZ));
        hashMap.put("container_init_end", Long.valueOf(this.LIZJ));
        hashMap.put("prepare_template_start", Long.valueOf(this.LIZLLL));
        hashMap.put("prepare_template_end", Long.valueOf(this.LJ));
        return hashMap;
    }
}
