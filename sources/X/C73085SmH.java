package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.SmH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73085SmH extends AbstractC73086SmI {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        String str;
        InterfaceC73087SmJ interfaceC73087SmJ = (InterfaceC73087SmJ) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String roomId = interfaceC73087SmJ.getRoomId();
        if (o.LJ(interfaceC73087SmJ.getAction(), 1)) {
            C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
            java.util.Map<String, String> LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_REPLAY_SCHEDULED_DOWNLOAD_VIDEO_LIST.value");
            LIZJ.put(roomId, "");
            c48459J0d.LIZ(c48459J0d.LIZJ());
        } else if (o.LJ(interfaceC73087SmJ.getAction(), 2)) {
            C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.f64J;
            c48459J0d2.LIZJ().remove(roomId);
            c48459J0d2.LIZ(c48459J0d2.LIZJ());
        } else if (o.LJ(interfaceC73087SmJ.getAction(), 3)) {
            C48459J0d<java.util.Map<String, String>> c48459J0d3 = InterfaceC30442Bx8.f64J;
            c48459J0d3.LIZJ().remove(roomId);
            c48459J0d3.LIZ(c48459J0d3.LIZJ());
            C0ER LIZJ2 = C0ER.LIZJ();
            String roomId2 = interfaceC73087SmJ.getRoomId();
            LIZJ2.getClass();
            C0EP.LJFF().getClass();
            DownloadInfo LIZLLL = C0EP.LIZLLL(roomId2);
            C0ER LIZJ3 = C0ER.LIZJ();
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                activity = interfaceC38263Ezz.LIZLLL();
            } else {
                activity = null;
            }
            if (LIZLLL != null) {
                str = LIZLLL.getUrl();
            } else {
                str = null;
            }
            String roomId3 = interfaceC73087SmJ.getRoomId();
            LIZJ3.getClass();
            C0ER.LJI(activity, 1, str, roomId3, null);
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC73088SmK.class, null), "");
    }
}
