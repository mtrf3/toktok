package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISocPubDistributeService;
import com.ss.android.ugc.aweme.service.SocPubDistributeServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6F implements ISocPubDistributeService {
    public static final L6F LIZIZ = new L6F();
    public final /* synthetic */ ISocPubDistributeService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final C26308AUe LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final InterfaceC100393wp LIZIZ(C212068Ty c212068Ty) {
        return this.LIZ.LIZIZ(c212068Ty);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LIZJ(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        return this.LIZ.LIZJ(scene);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZLLL(L61 bizTag, EnumC53719L6l enumC53719L6l, List list, InterfaceC88472Yns mapUser) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(mapUser, "mapUser");
        this.LIZ.LIZLLL(bizTag, enumC53719L6l, list, mapUser);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LJ(User user) {
        return this.LIZ.LJ(user);
    }

    public L6F() {
        ISocPubDistributeService iSocPubDistributeService;
        Object LIZ = C58096Mr6.LIZ(ISocPubDistributeService.class, false);
        if (LIZ != null) {
            iSocPubDistributeService = (ISocPubDistributeService) LIZ;
        } else {
            if (C58096Mr6.k5 == null) {
                synchronized (ISocPubDistributeService.class) {
                    if (C58096Mr6.k5 == null) {
                        C58096Mr6.k5 = new SocPubDistributeServiceImpl();
                    }
                }
            }
            iSocPubDistributeService = C58096Mr6.k5;
        }
        this.LIZ = iSocPubDistributeService;
    }
}
