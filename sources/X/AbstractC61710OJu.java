package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: X.OJu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61710OJu {
    public abstract long LIZIZ();

    public static C61711OJv LIZ(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new C61711OJv(Long.parseLong(jsonReader.nextString()));
                    }
                    return new C61711OJv(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
