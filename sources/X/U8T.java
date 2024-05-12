package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8T<T> implements InterfaceC64592gB {
    public static final U8T<T> LJLIL = new U8T<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int i = U8K.LJII;
        int i2 = U8K.LJIIIIZZ;
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isFirstSeiLoseReportEnable()) {
            return;
        }
        if (!o.LJ(U8K.LIZ, "audience")) {
            JSONObject LIZ = U8K.LIZ(null);
            LIZ.put("sub_event", "first_sei_lose");
            LIZ.put("player_w", i);
            LIZ.put("player_h", i2);
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
                LIZ2.LJJ(LIZ);
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                    LIZ2.LJJIIJZLJL();
                } else {
                    LIZ2.LJJIJ();
                    LIZ2.LJJIIZI();
                }
            }
            C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
            String jSONObject = LIZ.toString();
            o.LJIIIIZZ(jSONObject, "this.toString()");
            c76175Tv1.LIZ(40001, jSONObject, null);
        }
        C73411SrX c73411SrX = U8K.LJIIIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        U8K.LJIIIZ = null;
    }
}
