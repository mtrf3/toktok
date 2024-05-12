package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Skw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73002Skw extends AbstractC72998Sks {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        IHostSubscription iHostSubscription;
        Activity activity;
        InterfaceC73001Skv interfaceC73001Skv = (InterfaceC73001Skv) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                activity = interfaceC38263Ezz.LIZLLL();
            } else {
                activity = null;
            }
        } catch (Exception e) {
            C0NB.LJI("OpenVideoClipPageMethod", e);
        }
        if (iHostSubscription != null && activity != null) {
            String roomid = interfaceC73001Skv.getRoomid();
            String clipId = interfaceC73001Skv.getClipId();
            if (clipId.length() == 0) {
                clipId = interfaceC73001Skv.getUrl();
            }
            if (roomid.length() == 0) {
                roomid = interfaceC73001Skv.getUrl();
            }
            String url = interfaceC73001Skv.getUrl();
            String suffix = interfaceC73001Skv.getSuffix();
            int intValue = interfaceC73001Skv.getRedirect().intValue();
            String shootWay = interfaceC73001Skv.getShootWay();
            interfaceC73001Skv.getEnterFrom();
            interfaceC73001Skv.getEnterFromPage();
            iHostSubscription.WX(activity, roomid, clipId, url, suffix, intValue, shootWay);
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC72999Skt.class, null), "");
            return;
        }
        c37356ElM.onFailure(0, "hostSubscription == null)", null);
    }
}
