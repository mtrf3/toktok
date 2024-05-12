package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Lfm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54846Lfm implements IAVPublishService.PublishProgressController, C0K7, InterfaceC39147FXz, InterfaceC48038ItG, InterfaceC54209LPh {
    public static final C54846Lfm LJLIL = new C54846Lfm();
    public static final C54846Lfm LJLILLLLZI = new C54846Lfm();
    public static final C54846Lfm LJLJI = new C54846Lfm();
    public static final int[] LJLJJI = {360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT};

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressController
    public boolean initHide() {
        return false;
    }

    public static int LIZIZ() {
        return C00F.LIZ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "extract_frame_upload_interval", true);
    }

    @Override // X.InterfaceC39147FXz
    public String getScene() {
        String LIZIZ = C06140Ly.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getInjectScene()");
        return LIZIZ;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        int i;
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        Integer LIZJ = output.LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC54209LPh
    public void LIZ(float f, float f2, float f3, float f4, long j, long j2) {
        try {
            if (LPX.LJFF == null) {
                LPX.LJFF = new JSONObject();
            }
            JSONObject jSONObject = LPX.LJFF;
            if (jSONObject != null) {
                jSONObject.put("downX", f);
                jSONObject.put("downY", f2);
                jSONObject.put("upX", f3);
                jSONObject.put("upY", f4);
                jSONObject.put("downTimeMs", j);
                jSONObject.put("upTimeMs", j2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
