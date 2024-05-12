package X;

import X.IYN;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.ITd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46665ITd<T extends IYN> {
    public final List<T> LIZ;
    public final List<T> LIZIZ;
    public final String LIZJ = null;

    public static String LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(((IYN) ListProtector.get(list, 0)).getQualityType());
            for (int i = 1; i < list.size(); i++) {
                sb.append(",");
                sb.append(((IYN) ListProtector.get(list, i)).getQualityType());
            }
        }
        return sb.toString();
    }

    public C46665ITd(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
