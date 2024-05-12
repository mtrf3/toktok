package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.model.Gift;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.EVg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36528EVg {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Gift gift) {
        Field[] declaredFields = gift.getClass().getDeclaredFields();
        o.LJIIIIZZ(declaredFields, "this.javaClass.declaredFields");
        int LJJIIZ = C51029K0z.LJJIIZ(declaredFields.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (Field field : declaredFields) {
            String name = field.getName();
            o.LJIIIIZZ(name, "it.name");
            field.setAccessible(true);
            linkedHashMap.put(name, field.get(gift));
        }
        return linkedHashMap;
    }

    public static void LIZIZ(Gift gift, Field field, AqS176S0100000_10 aqS176S0100000_10) {
        Object arrayList;
        try {
            if (field.get(gift) == null) {
                if (field.getType().isAssignableFrom(List.class) || field.getType().isAssignableFrom(List.class) || field.getType().isAssignableFrom(ArrayList.class) || field.getType().isAssignableFrom(ArrayList.class)) {
                    arrayList = new ArrayList();
                } else if (field.getType().isAssignableFrom(java.util.Map.class) || field.getType().isAssignableFrom(java.util.Map.class)) {
                    arrayList = C113554cx.LJJJLIIL();
                } else if (field.getType().isAssignableFrom(Long.class) || field.getType().isAssignableFrom(Long.TYPE)) {
                    arrayList = 0L;
                } else if (field.getType().isAssignableFrom(Double.TYPE) || field.getType().isAssignableFrom(Double.class)) {
                    arrayList = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                } else if (field.getType().isAssignableFrom(String.class)) {
                    arrayList = "";
                } else if (field.getType().isAssignableFrom(Integer.class)) {
                    arrayList = 0;
                } else {
                    arrayList = null;
                }
                field.set(gift, arrayList);
                if (arrayList != null) {
                    String name = field.getName();
                    o.LJIIIIZZ(name, "field.name");
                    aqS176S0100000_10.invoke(name);
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
