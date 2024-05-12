package X;

import com.bytedance.android.live.liveinteract.matchx.models.XPanelData;
import com.bytedance.android.live.liveinteract.matchx.models.XPanelError;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchXSetting;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.google.android.play.core.appupdate.u;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UH4 implements InterfaceC72822Si2 {
    public final /* synthetic */ UH3 LJLIL;

    public UH4(UH3 uh3) {
        this.LJLIL = uh3;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2;
        long j;
        String str3;
        String str4 = c199097rd.LJLIL;
        String str5 = "";
        String str6 = null;
        if (o.LJ(str4, "Lynx_XPanelReadyMessage")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str6 = u.LJJIJIL(interfaceC78280Uns, "xid", "");
            }
            UH8 uh8 = this.LJLIL.LIZ;
            if (uh8 != null) {
                if (str6 == null) {
                    str3 = "-1";
                } else {
                    str3 = str6;
                }
                UH7 LJIIZILJ = uh8.LJIIZILJ(str3);
                if (LJIIZILJ != null) {
                    LJIIZILJ.LIZJ = true;
                    Iterator it = ((HashSet) LJIIZILJ.LIZIZ).iterator();
                    while (it.hasNext()) {
                        C72818Shy.LIZ((C76052yf) it.next());
                    }
                }
            }
            InterfaceC92693kP interfaceC92693kP = this.LJLIL.LJI.get(str6);
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            C65777Prh.LIZJ(this.LJLIL.LJI).remove(str6);
            Long l = this.LJLIL.LJ.get(str6);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            String str7 = this.LJLIL.LJFF.get(str6);
            JSONObject LIZLLL = C770830u.LIZLLL("stage", 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - j);
            lynxViewMonitor.reportCustom(null, "match_x_show_duration", str7, LIZLLL, jSONObject, null, null, 0);
            return;
        }
        if (o.LJ(str4, "Lynx_XPanelEventMessage")) {
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                str = u.LJJIJIL(interfaceC78280Uns2, "data", "");
            } else {
                str = null;
            }
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 != null) {
                str6 = u.LJJIJIL(interfaceC78280Uns3, "xid", "");
            }
            try {
                XPanelData xPanelData = (XPanelData) C09650Zl.LIZIZ.LJI(str, XPanelData.class);
                if (xPanelData != null && xPanelData.error != null) {
                    LiveMatchXSetting.INSTANCE.setSparkLoadSuccess(false);
                    XPanelError xPanelError = xPanelData.error;
                    if (xPanelError != null && (str2 = xPanelError.description) != null) {
                        str5 = str2;
                    }
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportCustom(null, "match_x_show_result", this.LJLIL.LJFF.get(str6), C770830u.LIZLLL("stage", 3), null, C65232Piu.LIZJ("message", str5), null, 0);
                }
            } catch (Exception unused) {
                JSONObject jSONObject2 = new JSONObject();
                if (str == null) {
                    str = "";
                }
                C05630Jz.LJI(jSONObject2, "error_str", str);
                if (str6 != null) {
                    str5 = str6;
                }
                C05630Jz.LJI(jSONObject2, "xid", str5);
                C0K2.LJIIIIZZ("ttlive_live_match_x_json_parse_error", 1, jSONObject2);
            }
        }
    }
}
