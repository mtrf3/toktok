package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77790Ufy extends AbstractC77792Ug0 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        IHostSubscription iHostSubscription;
        Activity activity;
        int i;
        InterfaceC77791Ufz interfaceC77791Ufz = (InterfaceC77791Ufz) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
        } catch (Exception e) {
            C0NB.LJI("openVideoFullScreenMethod", e);
        }
        if (iHostSubscription == null) {
            c37356ElM.onFailure(0, "hostSubscription == null)", null);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        String roomId = interfaceC77791Ufz.getRoomId();
        String m3u8Url = interfaceC77791Ufz.getM3u8Url();
        String downloadUrl = interfaceC77791Ufz.getDownloadUrl();
        Integer valueOf = Integer.valueOf(interfaceC77791Ufz.getStatus().intValue());
        String enterFromPage = interfaceC77791Ufz.getEnterFromPage();
        String enterFrom = interfaceC77791Ufz.getEnterFrom();
        Number videoLength = interfaceC77791Ufz.getVideoLength();
        if (videoLength != null) {
            i = videoLength.intValue();
        } else {
            i = 0;
        }
        iHostSubscription.ZV(activity, roomId, m3u8Url, downloadUrl, valueOf, enterFromPage, enterFrom, i, new C73030SlO());
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77794Ug2.class, null), "");
    }
}
