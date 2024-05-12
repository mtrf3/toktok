package X;

import android.app.Application;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.websocket.api.service.IWsService;
import com.ss.android.ugc.aweme.websocket.bridge.WsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.QWe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67128QWe implements IWsService {
    public static final C67128QWe LIZIZ = new C67128QWe();
    public final /* synthetic */ IWsService LIZ;

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LIZ(enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZJ(int i, int i2, InterfaceC67148QWy listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LIZJ(i, i2, listener);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZLLL(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ.LIZLLL(msg);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJ(byte[] bArr, java.util.Map map) {
        this.LIZ.LJ(bArr, map);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJFF(Application application) {
        this.LIZ.LJFF(application);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final String LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJII(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJII(enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIIIZZ(InterfaceC67145QWv listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJIIIIZZ(listener);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIIZ(String str) {
        this.LIZ.LJIIIZ("KID_MODE");
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIJJI(InterfaceC67148QWy listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJIIJJI(listener);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final EnumC66933QOr getState() {
        return this.LIZ.getState();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final boolean isConnected() {
        return this.LIZ.isConnected();
    }

    public C67128QWe() {
        IWsService iWsService;
        Object LIZ = C58096Mr6.LIZ(IWsService.class, false);
        if (LIZ != null) {
            iWsService = (IWsService) LIZ;
        } else {
            if (C58096Mr6.m8 == null) {
                synchronized (IWsService.class) {
                    if (C58096Mr6.m8 == null) {
                        C58096Mr6.m8 = new WsManager();
                    }
                }
            }
            iWsService = C58096Mr6.m8;
        }
        this.LIZ = iWsService;
    }
}
