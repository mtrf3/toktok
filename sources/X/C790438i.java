package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.38i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C790438i {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZLLL;
    public final C34C LIZ;
    public final C34C LIZIZ;
    public final C34C LIZJ;

    static {
        TBV tbv = new TBV(C790438i.class, "storageInfoVersion", "getStorageInfoVersion()J", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LIZLLL = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(C790438i.class, "fullUpdateTimestamp", "getFullUpdateTimestamp()J", 0, c65351Pkp), C07250Qf.LIZIZ(C790438i.class, "pushUpdateTimestamp", "getPushUpdateTimestamp()J", 0, c65351Pkp)};
    }

    public final long LIZ() {
        return ((Number) this.LIZIZ.LIZ(LIZLLL[1])).longValue();
    }

    public final long LIZIZ() {
        return ((Number) this.LIZ.LIZ(LIZLLL[0])).longValue();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorageStatus(infoVersion: ");
        LIZ.append(LIZIZ());
        LIZ.append(",fullUpdateTimestamp: ");
        LIZ.append(LIZ());
        LIZ.append(",pushUpdateTimestamp: ");
        LIZ.append(((Number) this.LIZJ.LIZ(LIZLLL[2])).longValue());
        LIZ.append(",)");
        return X1D.LIZIZ(LIZ);
    }

    public C790438i(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("relation_storage_status_");
        LIZ.append(str);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME + \"_\" + uid)");
        this.LIZ = C78949Uyf.LJJIIJZLJL(repo, "storage_info_version", 0L);
        this.LIZIZ = C78949Uyf.LJJIIJZLJL(repo, "full_update_timestamp", -1L);
        this.LIZJ = C78949Uyf.LJJIIJZLJL(repo, "push_update_timestamp", -1L);
    }
}
