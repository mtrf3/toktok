package X;

import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;

/* loaded from: classes9.dex */
public final class IF1 extends AbstractC65781Prl implements InterfaceC65784Pro<ICLAPerfETService> {
    public static final IF1 LJLIL = new IF1();

    public IF1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ICLAPerfETService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ICLAPerfETService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ICLAPerfETService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.t5 == null) {
            synchronized (ICLAPerfETService.class) {
                if (C58096Mr6.t5 == null) {
                    C58096Mr6.t5 = new ICLAPerfETServiceImpl();
                }
            }
        }
        return C58096Mr6.t5;
    }
}
