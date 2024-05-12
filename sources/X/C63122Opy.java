package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Opy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63122Opy {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String[] checkedIdArray) {
        o.LJIIIZ(checkedIdArray, "checkedIdArray");
        StringBuilder sb = new StringBuilder();
        int length = checkedIdArray.length;
        int i = 0;
        while (i < length) {
            i = C0EH.LIZIZ(sb, checkedIdArray[i], "_", i, 1);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "keySb.toString()");
        return ujb.o.LJJJJZ(sb2, "__", "_", false);
    }

    public static String LIZIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size() - 1;
        int i = 0;
        while (i < size) {
            i = C0EH.LIZIZ(sb, (String) ListProtector.get(list, i), ", ", i, 1);
        }
        return C0EH.LIZJ(sb, (String) ORZ.LLFF(list), "specificationSb.toString()");
    }
}
