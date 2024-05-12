package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1EM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EM implements InterfaceC04380Fe<C271914x> {
    public static final C1EM LIZ = new C1EM();

    @Override // X.InterfaceC04380Fe
    public final C271914x LIZ(JsonReader jsonReader, float f) {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 111) {
                        if (hashCode == 118 && nextName.equals("v")) {
                            list = C0FZ.LIZJ(jsonReader, f);
                        }
                    } else if (nextName.equals("o")) {
                        list3 = C0FZ.LIZJ(jsonReader, f);
                    }
                } else if (nextName.equals("i")) {
                    list2 = C0FZ.LIZJ(jsonReader, f);
                }
            } else if (nextName.equals("c")) {
                z = jsonReader.nextBoolean();
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new C271914x(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = (PointF) ListProtector.get(list, 0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) ListProtector.get(list, i);
                int i2 = i - 1;
                arrayList.add(new C263311p(C06260Mk.LIZ((PointF) ListProtector.get(list, i2), (PointF) ListProtector.get(list3, i2)), C06260Mk.LIZ(pointF2, (PointF) ListProtector.get(list2, i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) ListProtector.get(list, 0);
                int i3 = size - 1;
                arrayList.add(new C263311p(C06260Mk.LIZ((PointF) ListProtector.get(list, i3), (PointF) ListProtector.get(list3, i3)), C06260Mk.LIZ(pointF3, (PointF) ListProtector.get(list2, 0)), pointF3));
            }
            return new C271914x(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
