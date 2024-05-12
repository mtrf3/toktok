package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116934iP {
    public final String LIZ;
    public volatile long LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();

    public C116934iP(String str) {
        this.LIZ = str;
    }

    public final void LIZ(boolean z) {
        String str;
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ(this.LIZ);
        c63323OtD.LIZ(Long.valueOf(this.LIZJ - this.LIZIZ), "network_time_cost");
        c63323OtD.LIZ(Long.valueOf(this.LIZLLL - this.LIZJ), "post_process_time_cost");
        c63323OtD.LIZ(Long.valueOf(this.LIZLLL - this.LIZIZ), "process_time_cost");
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c63323OtD.LIZ(str, "is_success");
        for (Map.Entry<String, String> entry : this.LJ.entrySet()) {
            c63323OtD.LIZ(entry.getValue(), entry.getKey());
        }
        c63323OtD.LJFF();
    }
}
