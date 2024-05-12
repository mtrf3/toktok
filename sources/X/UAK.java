package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAK implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public UAK(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, OSZ<Long, String> osz, String str, long j3) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = osz;
        this.LJLJL = str;
    }

    public final void LIZ() {
        String str;
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            OSZ<Long, String> osz = this.LJLJJLL;
            String str2 = this.LJLJL;
            C77119UOl.LJIJJ(c76762UAs.LIZJ, LIZ, jSONObject, "change_max_position", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str2), this.LJLJI, this.LJLJJI);
        }
        U66 u66 = this.LJLILLLLZI;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        JSONObject jSONObject2 = this.LJLJJL;
        LiveSdkMultiGuestMonitorConfigSetting liveSdkMultiGuestMonitorConfigSetting = LiveSdkMultiGuestMonitorConfigSetting.INSTANCE;
        if (liveSdkMultiGuestMonitorConfigSetting.getValue().enable) {
            str = "change_max_position";
        } else {
            str = "change_position";
        }
        UC0.LJJJJIZL(u66, j, j2, jSONObject2, str, UC0.LJIILLIIL(this.LJLJJLL.getFirst(), this.LJLJJLL.getSecond(), this.LJLJL), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        if (liveSdkMultiGuestMonitorConfigSetting.getValue().enable) {
            String str3 = this.LJLJL;
            long longValue = this.LJLJJLL.getFirst().longValue();
            long j3 = this.LJLJJI - this.LJLJI;
            U66 u662 = this.LJLILLLLZI;
            UC0.LJJJJL("change_max_position", str3, longValue, j3, u662, this.LJLIL.LIZIZ.LIZLLL(u662));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
