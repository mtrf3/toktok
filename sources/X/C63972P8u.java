package X;

import android.util.Pair;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import java.util.LinkedList;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P8u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63972P8u implements NativeCallbacks.IGetFrameCallback {
    public final /* synthetic */ C84098WzW LIZ;
    public final /* synthetic */ C84092WzQ LIZIZ;

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
    public final /* synthetic */ void onResult(VEFrame vEFrame, boolean z) {
        C63971P8t.LIZ(this, vEFrame, z);
    }

    public C63972P8u(C84092WzQ c84092WzQ, C84098WzW c84098WzW) {
        this.LIZIZ = c84092WzQ;
        this.LIZ = c84098WzW;
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
    public final void onResult(int[] iArr, int i, int i2, long j, boolean z) {
        int i3;
        if (!this.LIZIZ.LJL.isEmpty()) {
            Pair pair = (Pair) ((LinkedList) this.LIZIZ.LJL).poll();
            long currentTimeMillis = System.currentTimeMillis() - ((Long) pair.second).longValue();
            StringBuilder LIZJ = V10.LIZJ("renderFrame cost ", currentTimeMillis, "ms, facing = ");
            LIZJ.append(pair.first);
            C63922P6w.LIZLLL("TERecorder", X1D.LIZIZ(LIZJ));
            try {
                JSONObject jSONObject = new JSONObject();
                if (iArr != null) {
                    i3 = 0;
                } else {
                    i3 = -1;
                }
                jSONObject.put("resultCode", i3);
                jSONObject.put("cost", currentTimeMillis);
                jSONObject.put("cameraFacing", pair.first);
                c.LIZ("vesdk_event_recorder_render_frame", "business", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LIZ.LJII.onResult(iArr, i, i2);
    }
}
