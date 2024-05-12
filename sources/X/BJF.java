package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BJF extends V1B {
    public final /* synthetic */ long[] LJLJJL;
    public final /* synthetic */ Room LJLJJLL;
    public final /* synthetic */ DrawerSmallLiveViewHolder LJLJL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        this.LJLJJL[0] = SystemClock.currentThreadTimeMillis();
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("live_cover_show_start")) {
            HashMap LIZ = C45243HpH.LIZ("enter_from_merge", "live_merge", "enter_method", "live_cover");
            LIZ.put("anchor_id", String.valueOf(this.LJLJJLL.getOwnerUserId()));
            LIZ.put("request_id", this.LJLJJLL.getRequestId());
            LIZ.put("room_id", String.valueOf(this.LJLJJLL.getId()));
            LIZ.put("event_belong", "live_view");
            LIZ.put("event_page", "live");
            LIZ.put("event_type", "core");
            LIZ.put("event_module", "live_live");
            AnonymousClass172.LIZ("live_cover_show_start", LIZ);
        }
        BJG bjg = this.LJLJL.LJZL;
        bjg.getClass();
        bjg.LIZIZ = SystemClock.uptimeMillis();
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        int i = 0;
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_cover_show_finish", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            HashMap LIZ = C45243HpH.LIZ("enter_from_merge", "live_merge", "enter_method", "live_cover");
            LIZ.put("anchor_id", String.valueOf(this.LJLJJLL.getOwnerUserId()));
            LIZ.put("request_id", this.LJLJJLL.getRequestId());
            LIZ.put("room_id", String.valueOf(this.LJLJJLL.getId()));
            LIZ.put("is_success", CardStruct.IStatusCode.DEFAULT);
            LIZ.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - this.LJLJJL[0]));
            LIZ.put("event_belong", "live_view");
            LIZ.put("event_page", "live");
            LIZ.put("event_type", "core");
            LIZ.put("event_module", "live_live");
            AnonymousClass172.LIZ("live_cover_show_finish", LIZ);
        }
        BJG bjg = this.LJLJL.LJZL;
        if (bjg.LIZIZ > 0) {
            SystemClock.uptimeMillis();
        }
        bjg.LIZIZ = 0L;
        JSONObject jSONObject = new JSONObject();
        if (exc instanceof C276516r) {
            i = ((C276516r) exc).getErrorCode();
        }
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = "";
        }
        C05630Jz.LIZ(i, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", str2);
        C05630Jz.LJI(jSONObject, "url", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_feed_image_load_all", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            C0K2.LJIIJJI(1, "ttlive_feed_image_load_all", jSONObject);
        }
        C0K2.LJIIIIZZ("ttlive_feed_image_load_error", 1, jSONObject);
    }

    public BJF(DrawerSmallLiveViewHolder drawerSmallLiveViewHolder, long[] jArr, Room room) {
        this.LJLJL = drawerSmallLiveViewHolder;
        this.LJLJJL = jArr;
        this.LJLJJLL = room;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        long j;
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_cover_show_finish", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            HashMap LIZ = C45243HpH.LIZ("enter_from_merge", "live_merge", "enter_method", "live_cover");
            LIZ.put("anchor_id", String.valueOf(this.LJLJJLL.getOwnerUserId()));
            LIZ.put("request_id", this.LJLJJLL.getRequestId());
            LIZ.put("room_id", String.valueOf(this.LJLJJLL.getId()));
            LIZ.put("is_success", "1");
            LIZ.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - this.LJLJJL[0]));
            LIZ.put("event_belong", "live_view");
            LIZ.put("event_page", "live");
            LIZ.put("event_type", "core");
            LIZ.put("event_module", "live_live");
            AnonymousClass172.LIZ("live_cover_show_finish", LIZ);
        }
        BJG bjg = this.LJLJL.LJZL;
        if (bjg.LIZIZ > 0) {
            j = SystemClock.uptimeMillis() - bjg.LIZIZ;
        } else {
            j = 0;
        }
        bjg.LIZIZ = 0L;
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_feed_image_load_all", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJI(jSONObject, "url", str);
            C0K2.LJIIJ(0, j, "ttlive_feed_image_load_all", jSONObject);
        }
        String tabType = this.LJLJL.LJLJL;
        o.LJIIIZ(tabType, "tabType");
        if (BJB.LIZLLL <= 0 && !BJB.LJ) {
            long currentTimeMillis = System.currentTimeMillis();
            BJB.LIZLLL = currentTimeMillis;
            long j2 = BJB.LIZJ;
            if (1 <= j2 && j2 < currentTimeMillis) {
                BJB.LIZIZ().put("draw_duration", String.valueOf(BJB.LIZLLL - BJB.LIZJ));
            }
            BJB.LIZIZ().put("draw_over_timestamp", String.valueOf(BJB.LIZLLL));
            if (!TextUtils.isEmpty(tabType)) {
                BJB.LIZIZ().put("drawer_tab", tabType);
            }
        }
        BJB.LJ(false);
    }
}
