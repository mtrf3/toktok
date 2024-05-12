package X;

import com.bytedance.android.live.effect.navi.service.NaviAvatarApi;
import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* renamed from: X.24U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24U extends AbstractC65781Prl implements InterfaceC65784Pro<NaviAvatarApi> {
    public static final C24U LJLIL = new C24U();

    public C24U() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.effect.navi.service.NaviAvatarApi] */
    @Override // X.InterfaceC65784Pro
    public final NaviAvatarApi invoke() {
        C65019PfT hostRetrofit = ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getHostRetrofit();
        if (hostRetrofit != null) {
            return hostRetrofit.LIZ(NaviAvatarApi.class);
        }
        return null;
    }
}
