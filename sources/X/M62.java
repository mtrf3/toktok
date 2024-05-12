package X;

import com.ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;

/* loaded from: classes10.dex */
public final class M62 implements IMobLaunchApi {
    public static final M62 LIZIZ = new M62();
    public final /* synthetic */ IMobLaunchApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZIZ(android.net.Uri uri, String str, boolean z) {
        this.LIZ.LIZIZ(uri, str, z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    public M62() {
        IMobLaunchApi mobLaunchImpl;
        Object LIZ = C58096Mr6.LIZ(IMobLaunchApi.class, false);
        if (LIZ != null) {
            mobLaunchImpl = (IMobLaunchApi) LIZ;
        } else {
            mobLaunchImpl = new MobLaunchImpl();
        }
        this.LIZ = mobLaunchImpl;
    }
}
