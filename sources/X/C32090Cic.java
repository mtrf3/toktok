package X;

import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSEIDelayTimeCorrectSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import org.json.JSONObject;

/* renamed from: X.Cic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32090Cic implements InterfaceC31995Ch5 {
    public final /* synthetic */ C32105Cir LIZ;

    @Override // X.InterfaceC31995Ch5
    public final void LJIIIZ() {
        LiveCore liveCore;
        C0NB.LJIIIZ("STICK", "start to show first frame");
        C32105Cir c32105Cir = this.LIZ;
        if (c32105Cir != null) {
            c32105Cir.LIZJ = C30725C4b.LIZ();
        }
        C32217Ckf c32217Ckf = C32217Ckf.LIZ;
        C32105Cir c32105Cir2 = this.LIZ;
        c32217Ckf.getClass();
        if (c32105Cir2 == null) {
            return;
        }
        if (!FacialGiftTrackingSettings.INSTANCE.isEnabled()) {
            C32444CoK.LIZ("StickerGiftTracker", "Facial gift event tracking disabled");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_id", c32105Cir2.LIZ);
        jSONObject.put("anchor_latency", c32105Cir2.LIZJ - c32105Cir2.LIZIZ);
        jSONObject.put("anchor_render_timestamp", c32105Cir2.LIZJ);
        jSONObject.put("anchor_receive_timestamp", c32105Cir2.LIZIZ);
        C22950vD.LIZ(jSONObject);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("log_id", c32105Cir2.LIZ), new OSZ("anchor_latency", String.valueOf(c32105Cir2.LIZJ - c32105Cir2.LIZIZ)), new OSZ("anchor_render_timestamp", String.valueOf(c32105Cir2.LIZJ)), new OSZ("anchor_receive_timestamp", String.valueOf(c32105Cir2.LIZIZ)));
        Integer num = null;
        try {
            if (LiveSEIDelayTimeCorrectSetting.INSTANCE.enableSEITimeCorrect()) {
                java.util.Map<? extends String, ? extends String> LJJL = C113554cx.LJJL(new OSZ("ts", String.valueOf(C31012CFc.LIZIZ())), new OSZ("tt_ntp", "1"));
                if (LJJL != null) {
                    LJJLIIIIJ.putAll(LJJL);
                }
            }
        } catch (Exception e) {
            C0NB.LIZLLL(e.getMessage());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Writing SEI data: ");
        LIZ.append(jSONObject);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ));
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (liveCore = interfaceC21020s6.getLiveCore()) != null) {
            num = Integer.valueOf(liveCore.addSeiField("live_sticker_gift_sei", jSONObject, 1, false, false));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LiveCore.addSeiField result: ");
        LIZ2.append(num);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ2));
        C31120CJg.LIZ.rd("live_sticker_gift_sei", LJJLIIIIJ);
    }

    @Override // X.InterfaceC31995Ch5
    public final void LJIIJ() {
        C0NB.LJIIIZ("STICK", "start to download resource");
        C32105Cir c32105Cir = this.LIZ;
        if (c32105Cir != null) {
            C30725C4b.LIZ();
            c32105Cir.getClass();
        }
    }

    @Override // X.InterfaceC31995Ch5
    public final void LJIIJJI() {
        C0NB.LJIIIZ("STICK", "end to download resource");
        if (this.LIZ != null) {
            C30725C4b.LIZ();
        }
    }

    public C32090Cic(C32105Cir c32105Cir) {
        this.LIZ = c32105Cir;
    }
}
