package X;

import Y.AfS45S0300000_6;
import com.bytedance.android.live.ai.api.pitaya.GiftGuidePopupNewDescChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32835Cud implements InterfaceC22840v2 {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C36676EaO LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC22840v2
    public final void LJIILIIL(C22830v1 outputData) {
        int i;
        JSONObject optJSONObject;
        o.LJIIIZ(outputData, "outputData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Predict Result --- ");
        LIZ.append(outputData);
        C0NB.LJIIIZ("LiveGiftGuideDialogClientAIAdjuster", X1D.LIZIZ(LIZ));
        int value = LiveGuideDialogDurationSetting.INSTANCE.getValue();
        C76732zl c76732zl = new C76732zl();
        int i2 = 0;
        if (outputData.LIZ()) {
            JSONObject jSONObject = outputData.LIZIZ;
            if (jSONObject != null) {
                value = jSONObject.optInt("duration", value);
            }
            c76732zl.element = value;
            JSONObject jSONObject2 = outputData.LIZIZ;
            if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("features")) != null) {
                C32089Cib.LJLLLL.put(this.LJLJJI, optJSONObject);
            }
            JSONObject jSONObject3 = outputData.LIZIZ;
            if (jSONObject3 != null) {
                i = jSONObject3.optInt("popup_desc_status");
            } else {
                i = 0;
            }
            JSONObject jSONObject4 = outputData.LIZIZ;
            if (jSONObject4 != null) {
                i2 = jSONObject4.optInt("show_delay", 0);
            }
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null) {
                dataChannel.rv0(GiftGuidePopupNewDescChannel.class, Integer.valueOf(i));
            }
            if (i2 > 0) {
                this.LJLJI.LIZIZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(i2, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS45S0300000_6(this.LJLJI, this.LJLILLLLZI, c76732zl, 1));
                return;
            }
        } else {
            c76732zl.element = value;
            C0NB.LIZIZ("LiveGiftGuideDialogClientAIAdjuster", "live_gift_guide_dialog_duration_predict execute timeout");
        }
        this.LJLILLLLZI.invoke(Integer.valueOf(c76732zl.element));
    }

    public C32835Cud(DataChannel dataChannel, C32840Cui c32840Cui, C36676EaO c36676EaO, String str) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = c32840Cui;
        this.LJLJI = c36676EaO;
        this.LJLJJI = str;
    }
}
