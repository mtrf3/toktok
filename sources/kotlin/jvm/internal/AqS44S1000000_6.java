package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0MT;
import X.C16880lQ;
import X.C221018lt;
import X.C36642EZq;
import X.C36645EZt;
import X.C76800UCe;
import X.EF7;
import X.EZW;
import X.FO5;
import X.FRT;
import X.HG3;
import X.InterfaceC65784Pro;
import X.RBX;
import X.X1D;
import android.util.Pair;
import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;
import com.bytedance.keva.Keva;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.actionai.net.ActionAINetworkClient;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.lego.ReportColdStartConfig;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public class AqS44S1000000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        String str;
        String LLLZ = C16880lQ.LLLZ("report_cold_start_repo_%s", Arrays.copyOf(new Object[]{this.s0}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(\n               …serId),\n                )");
        long LJI = EF7.LJI();
        g gVar = new g();
        long currentTimeMillis = System.currentTimeMillis();
        for (ReportColdStartConfig reportColdStartConfig : (ReportColdStartConfig[]) FRT.LIZIZ.getValue()) {
            if (LJI >= reportColdStartConfig.version) {
                long j = repo.getLong(reportColdStartConfig.name, 0L);
                if (currentTimeMillis - j < reportColdStartConfig.interval * 1000) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("filter by frequency name = ");
                    LIZ.append(reportColdStartConfig.name);
                    LIZ.append(", interval = ");
                    LIZ.append(reportColdStartConfig.interval);
                    C0MT.LIZLLL(LIZ, ", currentTime = ", currentTimeMillis, ", lastTime = ");
                    LIZ.append(j);
                    C221018lt.LJFF("ReportColdStartFrequency", X1D.LIZIZ(LIZ));
                } else {
                    repo.storeLong(reportColdStartConfig.name, currentTimeMillis);
                    m mVar = new m();
                    mVar.LJJIIZ("key", reportColdStartConfig.name);
                    gVar.LJJII(mVar);
                }
            }
        }
        if (gVar.size() > 0) {
            str = gVar.toString();
            o.LJIIIIZZ(str, "{ // 有需要上报的\n            …List.toString()\n        }");
        } else {
            str = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("report list: ");
        LIZ2.append(str);
        C221018lt.LJFF("ReportColdStartRequest", X1D.LIZIZ(LIZ2));
        if (!ujb.o.LJJJJJL(str)) {
            C221018lt.LJFF("ReportColdStartRequest", "report to server");
            MusNotificationApiManager.LJIIIZ(str);
        }
    }

    public static final Object invoke$0(AqS44S1000000_6 aqS44S1000000_6) {
        C36645EZt c36645EZt = new C36645EZt(aqS44S1000000_6.s0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(FO5.LIZ());
        LIZ.append("/tiktok/action-ai/api/user_management/user_event_count");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        linkedHashMap.put("user_id", curUserId);
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        o.LJIIIIZZ(curSecUserId, "userService().curSecUserId");
        linkedHashMap.put("sec_uid", curSecUserId);
        Pair LIZ2 = EZW.LIZ(LIZIZ, linkedHashMap);
        String baseUrl = (String) LIZ2.first;
        String str = (String) LIZ2.second;
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        ActionAINetworkClient actionAINetworkClient = ActionAINetworkClient.LIZ;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        actionAINetworkClient.LIZIZ(LIZIZ, baseUrl, true, str, linkedHashMap, unorderedMapStrStr, new C36642EZq(c36645EZt));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS44S1000000_6 aqS44S1000000_6) {
        aqS44S1000000_6.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1000000_6(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
