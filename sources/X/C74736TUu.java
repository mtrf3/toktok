package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TUu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74736TUu extends C75192TfA {
    public static final C74736TUu LIZ = new C74736TUu();
    public static final long LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        System.currentTimeMillis();
        LIZIZ = System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        LIZJ = C221108m2.LIZIZ(C74737TUv.LJLIL);
    }

    public static final void LJIIZILJ(int i) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "type", String.valueOf(i));
        LIZ.LJIL(0, "disconnect_popup_click", jSONObject, true);
    }

    public static final void LJIJ(int i) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "type", String.valueOf(i));
        LIZ.LJIL(0, "leave_popup_click", jSONObject, false);
    }

    public static final void LJIJI(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C74736TUu c74736TUu = LIZ;
        c74736TUu.LJIIL(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LIZIZ);
        c74736TUu.LJIL(1, "list_failed", jSONObject, true);
    }

    public static final void LJIJJ(List<? extends LinkPlayerInfo> response) {
        o.LJIIIZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "response", response.toString());
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LIZIZ);
        LIZ.LJIL(0, "list_succeed", jSONObject, true);
    }

    public static final void LJIILLIIL(Throwable th, boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "anchor_check_permission_status", jSONObject);
        C74736TUu c74736TUu = LIZ;
        if (th != null) {
            c74736TUu.LJIIL(th, jSONObject);
        }
        c74736TUu.LJIL(0, "anchor_check_permission", jSONObject, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
    
        if (r18.equals("guest_pause") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJJLI(java.lang.String r18, X.EnumC74778TWk r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74736TUu.LJIJJLI(java.lang.String, X.TWk, boolean):void");
    }

    public final void LJIL(int i, String str, JSONObject jSONObject, boolean z) {
        String str2;
        Object value;
        C05630Jz.LJI(jSONObject, "event_id", str);
        if (!z) {
            C05630Jz.LJI(jSONObject, "join_channel_removed", CardStruct.IStatusCode.DEFAULT);
        }
        for (Map.Entry<String, Object> entry : C75192TfA.LJIILL(z).entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                C75192TfA.LJIIIIZZ(jSONObject, entry.getKey(), value);
            }
        }
        C75192TfA.LJIILIIL(jSONObject);
        C05630Jz.LJI(jSONObject, "report_id", String.valueOf(C74838TYs.LJ().LJIJJLI));
        C74838TYs.LJ().LJIJJLI++;
        if (z) {
            str2 = "ttlive_client_guest_link_anchor_monitor";
        } else {
            str2 = "ttlive_client_guest_link_audience_monitor";
        }
        if (!o.LJ("ttlive_client_guest_link_anchor_monitor", str2) || LiveMonitorSampleSetting.INSTANCE.isReportDolphin(str2, 0.2d)) {
            if (o.LJ("ttlive_client_multi_live_audience_monitor", str2) && !LiveMonitorSampleSetting.INSTANCE.isReportDolphin(str2, 0.2d)) {
                return;
            }
            C0K2.LJIIIIZZ(str2, i, jSONObject);
        }
    }
}
