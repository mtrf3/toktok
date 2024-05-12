package X;

import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final /* synthetic */ class DIX {
    public static Paint LIZ(DIJ dij, Path.FillType fillType) {
        dij.LJIIZILJ(fillType);
        return new Paint();
    }

    public static Object LIZJ(List list, int i, List list2) {
        return ListProtector.get(list2, list.size() - i);
    }

    public static Integer LIZIZ(HashMap hashMap, Integer num, String str, int i, String str2) {
        hashMap.put(num, str);
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(valueOf, str2);
        return valueOf;
    }

    public static String LIZLLL(StringBuilder sb, int i, int i2, String str, char c) {
        sb.replace(i, i2, str);
        sb.append(c);
        return sb.toString();
    }
}
