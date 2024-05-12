package X;

import com.ss.android.ugc.aweme.sync.ByteSyncApiImpl;
import com.ss.android.ugc.aweme.sync.IByteSyncApi;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LHU implements IByteSyncApi {
    public static final LHU LIZIZ = new LHU();
    public final /* synthetic */ IByteSyncApi LIZ;

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZ(C3GR bizId, InterfaceC67072QUa listener) {
        o.LJIIIZ(bizId, "bizId");
        o.LJIIIZ(listener, "listener");
        this.LIZ.LIZ(bizId, listener);
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final boolean LIZIZ(C3GR bizId) {
        o.LJIIIZ(bizId, "bizId");
        return this.LIZ.LIZIZ(bizId);
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    public LHU() {
        IByteSyncApi iByteSyncApi;
        Object LIZ = C58096Mr6.LIZ(IByteSyncApi.class, false);
        if (LIZ != null) {
            iByteSyncApi = (IByteSyncApi) LIZ;
        } else {
            if (C58096Mr6.s7 == null) {
                synchronized (IByteSyncApi.class) {
                    if (C58096Mr6.s7 == null) {
                        C58096Mr6.s7 = new ByteSyncApiImpl();
                    }
                }
            }
            iByteSyncApi = C58096Mr6.s7;
        }
        this.LIZ = iByteSyncApi;
    }
}
