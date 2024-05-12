package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.util.ArrayList;

/* renamed from: X.0FU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FU {
    public static C38491fB LIZ(JsonReader jsonReader, C0GY c0gy) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C35141Zm(c0gy, C04340Fa.LIZ(jsonReader, c0gy, C06310Mp.LIZLLL(), new InterfaceC04380Fe<PointF>() { // from class: X.1EJ
                    @Override // X.InterfaceC04380Fe
                    public final PointF LIZ(JsonReader jsonReader2, float f) {
                        return C0FZ.LIZIZ(jsonReader2, f);
                    }
                }, z)));
            }
            jsonReader.endArray();
            C04350Fb.LIZIZ(arrayList);
        } else {
            arrayList.add(new C06780Ok(C0FZ.LIZIZ(jsonReader, C06310Mp.LIZLLL())));
        }
        return new C38491fB(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    public static InterfaceC268913t<PointF, PointF> LIZIZ(JsonReader jsonReader, C0GY c0gy) {
        jsonReader.beginObject();
        C38491fB c38491fB = null;
        C44451on c44451on = null;
        C44451on c44451on2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 107:
                    if (!nextName.equals("k")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        c38491fB = LIZ(jsonReader, c0gy);
                        break;
                    }
                case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                    if (!nextName.equals("x")) {
                        jsonReader.skipValue();
                        break;
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                        break;
                    } else {
                        c44451on = C0FW.LIZ(jsonReader, c0gy, true);
                        break;
                    }
                case 121:
                    if (!nextName.equals("y")) {
                        jsonReader.skipValue();
                        break;
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                        break;
                    } else {
                        c44451on2 = C0FW.LIZ(jsonReader, c0gy, true);
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            c0gy.LIZ("Lottie doesn't support expressions.");
        }
        if (c38491fB != null) {
            return c38491fB;
        }
        return new C38501fC(c44451on, c44451on2);
    }
}
