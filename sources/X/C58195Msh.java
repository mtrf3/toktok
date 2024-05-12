package X;

import com.ss.android.ugc.localnotify.NonLoginNotifyService;
import com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi;

/* renamed from: X.Msh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58195Msh implements INonLoginNotifyApi {
    public static final C58195Msh LIZIZ = new C58195Msh();
    public final /* synthetic */ INonLoginNotifyApi LIZ;

    @Override // com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public C58195Msh() {
        INonLoginNotifyApi iNonLoginNotifyApi;
        Object LIZ = C58096Mr6.LIZ(INonLoginNotifyApi.class, false);
        if (LIZ != null) {
            iNonLoginNotifyApi = (INonLoginNotifyApi) LIZ;
        } else {
            if (C58096Mr6.I8 == null) {
                synchronized (INonLoginNotifyApi.class) {
                    if (C58096Mr6.I8 == null) {
                        C58096Mr6.I8 = new NonLoginNotifyService();
                    }
                }
            }
            iNonLoginNotifyApi = C58096Mr6.I8;
        }
        this.LIZ = iNonLoginNotifyApi;
    }
}
