package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.jvm.internal.o;

/* renamed from: X.FlK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39902FlK implements InterfaceC61488OBg {
    public final Forest LIZ;
    public String LIZIZ;

    @Override // X.InterfaceC61488OBg
    public final void onUnRegister() {
    }

    @Override // X.InterfaceC61488OBg
    public final void onRegister(String bid) {
        o.LJIIJ(bid, "bid");
        this.LIZIZ = bid;
    }

    public C39902FlK(Context context, C39917FlZ c39917FlZ) {
        o.LJIIJ(context, "context");
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LLLLL != null) {
            this.LIZ = new Forest((Application) LLLLL, c39917FlZ.LIZ);
            this.LIZIZ = "hybridkit_default_bid";
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.Application");
    }

    public final C38515F9r LIZJ(String url, RequestParams params) {
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        return this.LIZ.createSyncRequest(url, params);
    }

    public final C38515F9r LIZLLL(String url, RequestParams params, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns) {
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        return this.LIZ.fetchResourceAsync(url, params, interfaceC88472Yns);
    }

    public final void LJ(String url, RequestParams requestParams, C60737Nsb c60737Nsb) {
        String str;
        o.LJIIJ(url, "url");
        Forest forest = this.LIZ;
        if (c60737Nsb != null) {
            str = c60737Nsb.containerId;
        } else {
            str = null;
        }
        Forest.preload$default(forest, url, requestParams, false, str, null, 20, null);
    }
}
