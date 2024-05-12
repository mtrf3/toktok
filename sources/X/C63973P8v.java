package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.utils.TEFrameUtils;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P8v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63973P8v implements PZA {
    public final /* synthetic */ InterfaceC63974P8w LIZ;
    public final /* synthetic */ long LIZIZ;

    public final void LIZ(P6E p6e) {
        int i;
        InterfaceC63974P8w interfaceC63974P8w = this.LIZ;
        if (interfaceC63974P8w != null) {
            VEFrame TEImageFrame2VEFrame = TEFrameUtils.TEImageFrame2VEFrame(p6e);
            X07 x07 = (X07) interfaceC63974P8w;
            TEImageFrame2VEFrame.getClass();
            x07.LIZ.getClass();
            C84092WzQ c84092WzQ = x07.LIZ;
            c84092WzQ.getClass();
            int width = TEImageFrame2VEFrame.getWidth();
            int height = TEImageFrame2VEFrame.getHeight();
            VESize vESize = new VESize(height, width);
            VESize renderSize = c84092WzQ.LJJJJJL.getRenderSize();
            VESize LIZLLL = C84092WzQ.LIZLLL(vESize, renderSize);
            if (LIZLLL.width == 0 || LIZLLL.height == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("originPicSize: ");
                LIZ.append(vESize);
                LIZ.append(", renderSize: ");
                LIZ.append(renderSize);
                LIZ.append(", pictureSize: ");
                LIZ.append(LIZLLL);
                LIZ.append(", surfaceSize: ");
                LIZ.append(c84092WzQ.LJJLIIIJJI);
                LIZ.append(", ratio: ");
                LIZ.append(c84092WzQ.LJJLIIIJILLIZJL);
                LIZ.append(", mRenderSize: ");
                LIZ.append(c84092WzQ.LJJLIIIJLJLI);
                P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ));
                if (c84092WzQ.mRenderView != null) {
                    VESize vESize2 = new VESize(width, height);
                    if (c84092WzQ.LJJLIIIJILLIZJL != EnumC63976P8y.RADIO_1_1.ordinal() && c84092WzQ.LJJLIIIJILLIZJL != EnumC63976P8y.RADIO_ROUND.ordinal()) {
                        c84092WzQ.mRenderView.getClass();
                        c84092WzQ.mRenderView.getClass();
                        VESize vESize3 = new VESize(0, 0);
                        int i2 = vESize3.width;
                        if (i2 != 0 && (i = vESize3.height) != 0) {
                            int i3 = vESize2.width * i2;
                            int i4 = vESize2.height * i;
                            if (i3 >= i4) {
                                if (i3 > i4) {
                                    vESize2.width = (int) ((i4 * 1.0f) / i2);
                                }
                            } else {
                                vESize2.height = (int) ((i3 * 1.0f) / i);
                            }
                        }
                    } else {
                        vESize2.width = vESize2.height;
                    }
                    LIZLLL.width = vESize2.height;
                    LIZLLL.height = vESize2.width;
                }
            }
            throw null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            jSONObject.put("cost", System.currentTimeMillis() - this.LIZIZ);
            jSONObject.put("duration", System.currentTimeMillis() - this.LIZIZ);
            jSONObject.put("cameraFacing", p6e.LJII.LJ);
            c.LIZ("vesdk_event_recorder_take_picture", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZIZ(Exception exc) {
        String[] split;
        InterfaceC63974P8w interfaceC63974P8w = this.LIZ;
        if (interfaceC63974P8w != null) {
            interfaceC63974P8w.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("capture failed, exception: ");
            LIZ.append(exc.getMessage());
            P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ));
            String message = exc.getMessage();
            if (message != null && (split = message.split("errorCode=")) != null) {
                try {
                    if (split.length > 0) {
                        CastIntegerProtector.parseInt(split[split.length - 1]);
                    }
                } catch (NumberFormatException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            throw null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", -1);
            jSONObject.put("duration", System.currentTimeMillis() - this.LIZIZ);
            c.LIZ("vesdk_event_recorder_take_picture", "business", jSONObject);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public C63973P8v(X07 x07, long j) {
        this.LIZ = x07;
        this.LIZIZ = j;
    }
}
