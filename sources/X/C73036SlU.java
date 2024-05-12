package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SlU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73036SlU extends AbstractC73034SlS {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        IHostSubscription iHostSubscription;
        int i;
        Activity activity;
        InterfaceC73037SlV interfaceC73037SlV = (InterfaceC73037SlV) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            i = 0;
        } catch (Exception e) {
            C0NB.LJI("OpenVideoClipPageMethod", e);
        }
        if (iHostSubscription == null) {
            c37356ElM.onFailure(0, "hostSubscription == null)", null);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lastPage: ");
        LIZ.append(interfaceC73037SlV.getLastPage());
        C0NB.LIZIZ("OpenVideoClipPageMethod", X1D.LIZIZ(LIZ));
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        String roomId = interfaceC73037SlV.getRoomId();
        String playUrl = interfaceC73037SlV.getPlayUrl();
        String enterFromPage = interfaceC73037SlV.getEnterFromPage();
        String enterFrom = interfaceC73037SlV.getEnterFrom();
        Number duration = interfaceC73037SlV.getDuration();
        if (duration != null) {
            i = duration.intValue();
        }
        iHostSubscription.Hm(activity, roomId, playUrl, enterFromPage, enterFrom, Integer.valueOf(i), interfaceC73037SlV.getLastPage());
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC73035SlT.class, null), "");
    }
}
