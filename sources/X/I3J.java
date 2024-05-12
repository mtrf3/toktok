package X;

import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import jp3.c;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class I3J implements InterfaceC83886Ww6 {
    public final VERecorder LIZ;

    @Override // X.InterfaceC83886Ww6
    public final void LIZJ() {
        VERecorder vERecorder = this.LIZ;
        vERecorder.LIZIZ.changeRecordMode(VERecordMode.DUET);
    }

    public I3J(VERecorder recoder) {
        o.LJIIIZ(recoder, "recoder");
        this.LIZ = recoder;
    }

    @Override // X.InterfaceC83886Ww6
    public final void LIZIZ(boolean z) {
        this.LIZ.LIZIZ.setEnableDuetV2(z);
    }

    @Override // X.InterfaceC83886Ww6
    public final void LIZLLL(Runnable runnable) {
        this.LIZ.LIZIZ.setDuetVideoCompleteCallback(runnable);
    }

    @Override // X.InterfaceC83886Ww6
    public final void LIZ(String duetVideoPath, String str, boolean z) {
        String str2 = str;
        o.LJIIIZ(duetVideoPath, "duetVideoPath");
        VERecorder vERecorder = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        VEDuetSettings vEDuetSettings = new VEDuetSettings(duetVideoPath, str2, 0.0f, 0.16f, 0.6f, z);
        vERecorder.LIZIZ.initDuet(vEDuetSettings);
        try {
            c.LIZ("vesdk_event_recorder_init_duet", "business", new JSONObject(vEDuetSettings.toString()));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
