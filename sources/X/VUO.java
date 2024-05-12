package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VUO extends C49615Jdb {
    public final void LIZLLL(JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < javaOnlyArray.size(); i++) {
            JavaOnlyMap map = javaOnlyArray.getMap(i);
            if (map != null && !map.isEmpty()) {
                arrayList.add(map);
            }
        }
        LIZJ(arrayList, "attachedCells");
    }

    public VUO(int i, String str) {
        super(i, str);
    }

    public final void LJ(int i, int i2, int i3, JavaOnlyArray javaOnlyArray) {
        if (DisplayMetricsHolder.LIZIZ() == null) {
            return;
        }
        float f = DisplayMetricsHolder.LIZIZ().density;
        LIZJ(Float.valueOf(0 / f), "scrollLeft");
        LIZJ(Float.valueOf(i / f), "scrollTop");
        LIZJ(Float.valueOf(i2 / f), "deltaX");
        LIZJ(Float.valueOf(i3 / f), "deltaY");
        LIZLLL(javaOnlyArray);
    }
}
