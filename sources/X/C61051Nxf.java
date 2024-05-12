package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Nxf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61051Nxf {
    public final List<C61052Nxg> LIZ;

    public C61051Nxf(List<C61052Nxg> list) {
        this.LIZ = list;
    }

    public final C61045NxZ LIZ(String str, JSONObject jSONObject) {
        Iterator<C61052Nxg> it = this.LIZ.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().LJLILLLLZI, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() == -1) {
            z = true;
        }
        if (!z) {
            C61052Nxg c61052Nxg = (C61052Nxg) ListProtector.get(this.LIZ, valueOf.intValue());
            long optLong = jSONObject.optLong(str) - jSONObject.optLong(c61052Nxg.LJLIL);
            if (optLong > 0) {
                return new C61045NxZ(c61052Nxg.LJLJI, optLong);
            }
        }
        return null;
    }
}
