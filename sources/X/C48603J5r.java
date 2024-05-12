package X;

import Y.ARunnableS3S2100000_8;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.J5r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48603J5r implements J63 {
    public static final /* synthetic */ int LIZJ = 0;
    public Keva LIZ;
    public boolean LIZIZ;

    public final Keva LIZIZ() {
        Keva keva = this.LIZ;
        if (keva != null || this.LIZIZ) {
            return keva;
        }
        if (C48602J5q.LIZ) {
            System.currentTimeMillis();
        }
        synchronized ("client_portraits_saver_kv_fp") {
            if (this.LIZ == null) {
                this.LIZ = KevaImpl.getRepoSync("client_portraits_saver_kv_fp", 0);
            }
        }
        this.LIZIZ = true;
        return this.LIZ;
    }

    @Override // X.J63
    public final String LIZ(String str) {
        Keva LIZIZ;
        if (str == null || (LIZIZ = LIZIZ()) == null) {
            return null;
        }
        return LIZIZ.getString(str, null);
    }

    @Override // X.J63
    public final void save(String str, String str2) {
        ScheduledExecutorService LIZ;
        if (str != null && (LIZ = C48602J5q.LIZ()) != null) {
            LIZ.execute(new ARunnableS3S2100000_8(str2, this, str, 1));
        }
    }
}
