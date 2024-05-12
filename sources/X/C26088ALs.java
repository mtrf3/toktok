package X;

import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import com.ss.android.ugc.aweme.live.notification.repository.NotificationLiveApi;
import kotlin.jvm.internal.o;

/* renamed from: X.ALs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26088ALs extends R30<String, NotificationLiveStatus, ALT, NotificationLiveStatus> {
    public final NotificationLiveApi LIZJ;

    public C26088ALs() {
        NotificationLiveApi.LIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        LIZ.append(Live.getLiveDomain());
        this.LIZJ = (NotificationLiveApi) C40084FoG.LIZIZ(X1D.LIZIZ(LIZ)).LIZ.LIZ(NotificationLiveApi.class);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object obj) {
        ALT req = (ALT) obj;
        o.LJIIIZ(req, "req");
        return req.LJLIL;
    }

    @Override // X.R30
    public final AbstractC73672Svk<NotificationLiveStatus> LJII(ALT alt) {
        ALT req = alt;
        o.LJIIIZ(req, "req");
        return this.LIZJ.changeOptions(req.LJLILLLLZI, req.LJLIL);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
