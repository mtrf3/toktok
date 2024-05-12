package X;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.1EE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EE implements InterfaceC04380Fe<Integer> {
    public static final C1EE LIZ = new C1EE();

    @Override // X.InterfaceC04380Fe
    public final Integer LIZ(JsonReader jsonReader, float f) {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
