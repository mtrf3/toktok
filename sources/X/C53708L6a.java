package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.service.SocPubStatusRepoServiceImpl;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.L6a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53708L6a implements ISocPubStatusRepoService {
    public static final C53708L6a LIZIZ = new C53708L6a();
    public final /* synthetic */ ISocPubStatusRepoService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final int LIZ(L61 bizTag, String str) {
        o.LJIIIZ(bizTag, "bizTag");
        return this.LIZ.LIZ(bizTag, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, L61 bizTag, String str, String str2, InterfaceC53712L6e observer) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(observer, "observer");
        this.LIZ.LIZIZ(lifecycleOwner, bizTag, str, str2, observer);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZJ(L61 bizTag, String str, AqS167S0100000_1 aqS167S0100000_1) {
        o.LJIIIZ(bizTag, "bizTag");
        this.LIZ.LIZJ(bizTag, str, aqS167S0100000_1);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZLLL(L61 bizTag, C53710L6c c53710L6c) {
        o.LJIIIZ(bizTag, "bizTag");
        this.LIZ.LIZLLL(bizTag, c53710L6c);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJ(L61 bizTag, String uid) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(uid, "uid");
        this.LIZ.LJ(bizTag, uid);
    }

    public C53708L6a() {
        ISocPubStatusRepoService iSocPubStatusRepoService;
        Object LIZ = C58096Mr6.LIZ(ISocPubStatusRepoService.class, false);
        if (LIZ != null) {
            iSocPubStatusRepoService = (ISocPubStatusRepoService) LIZ;
        } else {
            if (C58096Mr6.l5 == null) {
                synchronized (ISocPubStatusRepoService.class) {
                    if (C58096Mr6.l5 == null) {
                        C58096Mr6.l5 = new SocPubStatusRepoServiceImpl();
                    }
                }
            }
            iSocPubStatusRepoService = C58096Mr6.l5;
        }
        this.LIZ = iSocPubStatusRepoService;
    }
}
