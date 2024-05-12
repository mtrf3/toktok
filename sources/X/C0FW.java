package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.0FW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FW {
    public static C44471op LIZIZ(JsonReader jsonReader, C0GY c0gy) {
        return new C44471op(C04350Fb.LIZ(1.0f, jsonReader, c0gy, new InterfaceC04380Fe<Integer>() { // from class: X.1EI
            @Override // X.InterfaceC04380Fe
            public final Integer LIZ(JsonReader jsonReader2, float f) {
                return Integer.valueOf(Math.round(C0FZ.LIZLLL(jsonReader2) * f));
            }
        }));
    }

    public static C44481oq LIZJ(JsonReader jsonReader, C0GY c0gy) {
        return new C44481oq(C04350Fb.LIZ(C06310Mp.LIZLLL(), jsonReader, c0gy, new InterfaceC04380Fe<PointF>() { // from class: X.1EK
            @Override // X.InterfaceC04380Fe
            public final PointF LIZ(JsonReader jsonReader2, float f) {
                JsonToken peek = jsonReader2.peek();
                if (peek == JsonToken.BEGIN_ARRAY) {
                    return C0FZ.LIZIZ(jsonReader2, f);
                }
                if (peek == JsonToken.BEGIN_OBJECT) {
                    return C0FZ.LIZIZ(jsonReader2, f);
                }
                if (peek == JsonToken.NUMBER) {
                    PointF pointF = new PointF(((float) jsonReader2.nextDouble()) * f, ((float) jsonReader2.nextDouble()) * f);
                    while (jsonReader2.hasNext()) {
                        jsonReader2.skipValue();
                    }
                    return pointF;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Cannot convert json to point. Next token is ");
                LIZ2.append(peek);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        }));
    }

    public static C44451on LIZ(JsonReader jsonReader, C0GY c0gy, boolean z) {
        float f;
        if (z) {
            f = C06310Mp.LIZLLL();
        } else {
            f = 1.0f;
        }
        return new C44451on(C04350Fb.LIZ(f, jsonReader, c0gy, new InterfaceC04380Fe<Float>() { // from class: X.1EG
            @Override // X.InterfaceC04380Fe
            public final Float LIZ(JsonReader jsonReader2, float f2) {
                return Float.valueOf(C0FZ.LIZLLL(jsonReader2) * f2);
            }
        }));
    }
}
