package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04350Fb {
    public static <T> void LIZIZ(List<? extends C06780Ok<T>> list) {
        int i;
        T t;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            if (C03970Dp.LJIIJ) {
                C06780Ok c06780Ok = (C06780Ok) ListProtector.get(list, i2);
                C06780Ok c06780Ok2 = (C06780Ok) ListProtector.get(list, i2 + 1);
                c06780Ok.LJFF = Float.valueOf(c06780Ok2.LJ);
                if (c06780Ok.LIZJ == null && (t = c06780Ok2.LIZIZ) != null) {
                    c06780Ok.LIZJ = t;
                    if (c06780Ok instanceof C35141Zm) {
                        ((C35141Zm) c06780Ok).LIZLLL();
                    }
                }
            } else {
                ((C06780Ok) ListProtector.get(list, i2)).LJFF = Float.valueOf(((C06780Ok) ListProtector.get(list, i2 + 1)).LJ);
            }
            i2++;
        }
        C06780Ok c06780Ok3 = (C06780Ok) ListProtector.get(list, i);
        if (C03970Dp.LJIIJ) {
            if ((c06780Ok3.LIZIZ == null || c06780Ok3.LIZJ == null) && arrayList.size() > 1) {
                arrayList.remove(c06780Ok3);
                return;
            }
            return;
        }
        if (c06780Ok3.LIZIZ != null) {
            return;
        }
        arrayList.remove(c06780Ok3);
    }

    public static List LIZ(float f, JsonReader jsonReader, C0GY c0gy, InterfaceC04380Fe interfaceC04380Fe) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c0gy.LIZ("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C04340Fa.LIZ(jsonReader, c0gy, f, interfaceC04380Fe, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C04340Fa.LIZ(jsonReader, c0gy, f, interfaceC04380Fe, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C04340Fa.LIZ(jsonReader, c0gy, f, interfaceC04380Fe, false));
            }
        }
        jsonReader.endObject();
        LIZIZ(arrayList);
        return arrayList;
    }
}
