package X;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ItK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48042ItK {
    public C47164IfA LIZ;
    public SparseArray<C47160If6> LIZIZ = new SparseArray<>();
    public List<C47160If6> LIZJ = new ArrayList();
    public int LIZLLL;

    public static EnumC47176IfM LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return EnumC47176IfM.Standard;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) C48041ItJ.LIZ).entrySet()) {
            if (entry != null && str.equals(entry.getValue())) {
                return (EnumC47176IfM) entry.getKey();
            }
        }
        return EnumC47176IfM.Standard;
    }
}
