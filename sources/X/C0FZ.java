package X;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0FZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FZ {
    public static int LIZ(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    public static float LIZLLL(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i = C0FY.LIZ[peek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unknown value for token of type ");
            LIZ.append(peek);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        return (float) jsonReader.nextDouble();
    }

    public static PointF LIZIZ(JsonReader jsonReader, float f) {
        int i = C0FY.LIZ[jsonReader.peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    jsonReader.beginObject();
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        if (!nextName.equals("x")) {
                            if (!nextName.equals("y")) {
                                jsonReader.skipValue();
                            } else {
                                f3 = LIZLLL(jsonReader);
                            }
                        } else {
                            f2 = LIZLLL(jsonReader);
                        }
                    }
                    jsonReader.endObject();
                    return new PointF(f2 * f, f3 * f);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown point starts with ");
                LIZ.append(jsonReader.peek());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            float nextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new PointF(nextDouble * f, nextDouble2 * f);
        }
        float nextDouble3 = (float) jsonReader.nextDouble();
        float nextDouble4 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble3 * f, nextDouble4 * f);
    }

    public static List<PointF> LIZJ(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(LIZIZ(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
