package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IJt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46421IJt {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;

    public final String LIZ() {
        List<String> list = this.LIZLLL;
        if (list == null) {
            return null;
        }
        o.LJI(list);
        if (list.isEmpty() || TextUtils.isEmpty(this.LIZ)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        List<String> list2 = this.LIZLLL;
        o.LJI(list2);
        LIZ.append((String) ListProtector.get(list2, 0));
        String str = this.LIZ;
        o.LJI(str);
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZIZ() {
        boolean z;
        List<String> list = this.LIZLLL;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || TextUtils.isEmpty(this.LIZIZ)) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        List<String> list2 = this.LIZLLL;
        o.LJI(list2);
        LIZ.append((String) ListProtector.get(list2, 0));
        String str = this.LIZIZ;
        o.LJI(str);
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }
}
