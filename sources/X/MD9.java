package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;

/* loaded from: classes10.dex */
public final class MD9 extends AbstractC65781Prl implements InterfaceC65784Pro<NotificationApi.Api> {
    public static final MD9 LJLIL = new MD9();

    public MD9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.notification.api.NotificationApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final NotificationApi.Api invoke() {
        return RetrofitFactory.LIZLLL().create(M57.LIZ).create(NotificationApi.Api.class);
    }
}
