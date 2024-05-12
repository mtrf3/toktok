package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C6D extends AbstractC60811Ntn {
    public final /* synthetic */ LiveGoalsWidget LJLILLLLZI;
    public final /* synthetic */ SparkContext LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        int i;
        String str;
        o.LJIIIZ(view, "view");
        C6F.LIZIZ().LJIIJ = System.currentTimeMillis();
        HashMap<String, Object> LJLZ = this.LJLILLLLZI.LJLZ(this.LJLJI.containerId, this.LJLJJI);
        C6K LIZIZ = C6F.LIZIZ();
        long LIZ = C6F.LIZ(LIZIZ.LJIIIZ, LIZIZ.LJIIJ);
        HashMap hashMap = new HashMap(LIZIZ.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ));
        hashMap.put("action_completed_status", 1);
        C6F.LIZJ("container_load", hashMap);
        BZI LIZ2 = C28787BRn.LIZ("goal_indicator_render_success");
        for (Map.Entry<String, Object> entry : LJLZ.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                str = value.toString();
            } else {
                str = null;
            }
            LIZ2.LJIJJ(str, key);
        }
        LIZ2.LJIJJ(Long.valueOf(C6F.LIZ(LIZIZ.LJII, LIZIZ.LJIIJ)), "duration");
        LIZ2.LJJIIJZLJL();
        LiveGoalsWidget liveGoalsWidget = this.LJLILLLLZI;
        String str2 = this.LJLJJI;
        liveGoalsWidget.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str2);
        jSONObject.put("type", "init");
        view.LJIIIZ("H5_roomStatusChange", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        DataChannel dataChannel = liveGoalsWidget.dataChannel;
        if (dataChannel != null) {
            i = o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE);
        } else {
            i = 0;
        }
        jSONObject2.put("orientation", i ^ 1);
        C1JD.LJJIJL("goal_indicator_orientation_changed", jSONObject2, 4);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C6K LIZIZ = C6F.LIZIZ();
        LIZIZ.LJIIIZ = System.currentTimeMillis();
        LIZIZ.LIZJ = url;
    }

    public C6D(LiveGoalsWidget liveGoalsWidget, SparkContext sparkContext, String str) {
        this.LJLILLLLZI = liveGoalsWidget;
        this.LJLJI = sparkContext;
        this.LJLJJI = str;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        C6F.LIZIZ().LJIIJ = System.currentTimeMillis();
        HashMap<String, Object> LJLZ = this.LJLILLLLZI.LJLZ(this.LJLJI.containerId, url);
        C6K LIZIZ = C6F.LIZIZ();
        long LIZ = C6F.LIZ(LIZIZ.LJIIIZ, LIZIZ.LJIIJ);
        HashMap hashMap = new HashMap(LIZIZ.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        hashMap.put("error_message", str2);
        hashMap.put("action_completed_status", 0);
        C6F.LIZJ("container_load", hashMap);
        BZI LIZ2 = C28787BRn.LIZ("goal_indicator_render_fail");
        for (Map.Entry<String, Object> entry : LJLZ.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                str3 = value.toString();
            } else {
                str3 = null;
            }
            LIZ2.LJIJJ(str3, key);
        }
        if (str == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "error_message");
        LIZ2.LJIJJ(Long.valueOf(C6F.LIZ(LIZIZ.LJII, LIZIZ.LJIIJ)), "duration");
        LIZ2.LJJIIJZLJL();
    }
}
