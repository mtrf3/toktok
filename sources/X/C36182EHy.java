package X;

import com.ss.android.ugc.aweme.sync.ByteSyncInitProviderImpl;
import com.ss.android.ugc.aweme.sync.IByteSyncInitProvider;

/* renamed from: X.EHy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36182EHy implements IByteSyncInitProvider {
    public static final C36182EHy LIZIZ = new C36182EHy();
    public final /* synthetic */ IByteSyncInitProvider LIZ;

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncInitProvider
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    public C36182EHy() {
        IByteSyncInitProvider iByteSyncInitProvider;
        Object LIZ = C58096Mr6.LIZ(IByteSyncInitProvider.class, false);
        if (LIZ != null) {
            iByteSyncInitProvider = (IByteSyncInitProvider) LIZ;
        } else {
            if (C58096Mr6.t7 == null) {
                synchronized (IByteSyncInitProvider.class) {
                    if (C58096Mr6.t7 == null) {
                        C58096Mr6.t7 = new ByteSyncInitProviderImpl();
                    }
                }
            }
            iByteSyncInitProvider = C58096Mr6.t7;
        }
        this.LIZ = iByteSyncInitProvider;
    }
}
