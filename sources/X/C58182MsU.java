package X;

import com.ss.android.ugc.localnotify.CommonLocalNotifyService;
import com.ss.android.ugc.localnotifyapi.ILocalNotifyApi;

/* renamed from: X.MsU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58182MsU implements ILocalNotifyApi {
    public static final C58182MsU LIZIZ = new C58182MsU();
    public final /* synthetic */ ILocalNotifyApi LIZ;

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C58182MsU() {
        ILocalNotifyApi iLocalNotifyApi;
        Object LIZ = C58096Mr6.LIZ(ILocalNotifyApi.class, false);
        if (LIZ != null) {
            iLocalNotifyApi = (ILocalNotifyApi) LIZ;
        } else {
            if (C58096Mr6.H8 == null) {
                synchronized (ILocalNotifyApi.class) {
                    if (C58096Mr6.H8 == null) {
                        C58096Mr6.H8 = new CommonLocalNotifyService();
                    }
                }
            }
            iLocalNotifyApi = C58096Mr6.H8;
        }
        this.LIZ = iLocalNotifyApi;
    }
}
