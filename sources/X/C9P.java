package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C9P implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C9N LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C9P(int i, int i2, long j, C9N c9n, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = j;
        this.LJLJJI = c9n;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        boolean z;
        int i;
        int i2;
        Long l;
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("test result: code1: ");
        LIZ.append(this.LJLIL);
        LIZ.append(" code2: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" code3: ");
        LIZ.append(this.LJLJI);
        LIZ.append(" isTimeout=");
        LIZ.append(this.LJLJJI.LJIIIIZZ);
        LIZ.append(" msg: ");
        C31811Ce7.LJ(LIZ, this.LJLJJL, LIZ, "VideoPreScheduleHelper");
        if (!this.LJLJJI.LJ) {
            return;
        }
        int i3 = 1;
        if (this.LJLIL == 1) {
            z = true;
        } else {
            z = false;
        }
        try {
            C0NB.LIZIZ("VideoPreScheduleHelper", "parsing");
            JSONObject jSONObject = new JSONObject(this.LJLJJL);
            int i4 = JSONObjectProtectorUtils.getInt(jSONObject, "level");
            if (jSONObject.has("reason")) {
                i = JSONObjectProtectorUtils.getInt(jSONObject, "reason");
            } else {
                i = -1;
            }
            C30865C9l LIZ2 = this.LJLJJI.LIZ();
            if (z) {
                i2 = 0;
            } else {
                i2 = i;
            }
            LIZ2.LIZIZ(jSONObject, i2, Integer.valueOf(this.LJLILLLLZI), C29184Bcq.LIZIZ(this.LJLJJI.LJI, Integer.valueOf(i4)));
            if (!z || this.LJLILLLLZI <= LivePreviewNetworkSpeedThresholdSetting.INSTANCE.getValue()) {
                this.LJLJJI.LIZIZ();
            } else {
                DataChannel dataChannel = this.LJLJJI.LJI;
                if (dataChannel != null) {
                    dataChannel.rv0(PreScheduleResultChannel.class, new OSZ(Integer.valueOf(i4), Integer.valueOf(this.LJLILLLLZI)));
                }
                this.LJLJJI.LJ(C9T.GOOD_CONNECTION);
            }
            this.LJLJJI.LJI();
            if (this.LJLIL != 3 || this.LJLJJI.LJIIIIZZ) {
                C9N c9n = this.LJLJJI;
                if (c9n.LJIIJ == C9T.GOOD_CONNECTION) {
                    i3 = 0;
                } else if (!z) {
                    if (c9n.LJIIIIZZ) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                }
                int i5 = JSONObjectProtectorUtils.getInt(jSONObject, "useProbeResult");
                BZI LIZ3 = C28787BRn.LIZ("livesdk_golive_speedtest");
                LIZ3.LJIILLIIL(this.LJLJJI.LJI);
                String str = null;
                if (z) {
                    l = Long.valueOf(SystemClock.elapsedRealtime() - this.LJLJJI.LIZLLL);
                } else {
                    l = null;
                }
                LIZ3.LJIJJ(l, "speedtest_duration");
                if (z) {
                    num = Integer.valueOf(this.LJLILLLLZI);
                } else {
                    num = null;
                }
                LIZ3.LJIJJ(num, "speedtest_result");
                if (z) {
                    str = C29184Bcq.LIZIZ(this.LJLJJI.LJI, Integer.valueOf(i4));
                }
                LIZ3.LJIJJ(str, "definition_recommend");
                LIZ3.LJIJJ(Integer.valueOf(i3), "error_code");
                LIZ3.LJIJJ(Integer.valueOf(i), "live_core_error_code");
                LIZ3.LJIJJ(Integer.valueOf(i5), "use_probe_result");
                LIZ3.LJIJJ(Long.valueOf(this.LJLJJI.LJIIIZ), "call_livecore_speedtest_timestamp");
                LIZ3.LJJIIJZLJL();
            }
            this.LJLJJI.LJIIIIZZ = false;
        } catch (Exception unused) {
            C0NB.LIZIZ("VideoPreScheduleHelper", "parse fail");
            this.LJLJJI.LJ(C9T.BAD_CONNECTION);
            C9N c9n2 = this.LJLJJI;
            c9n2.LJIIIIZZ = false;
            c9n2.LJI();
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
