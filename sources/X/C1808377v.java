package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1808377v {
    public static volatile C1808377v LIZIZ;
    public final List<C1808477w> LIZ = new ArrayList();

    public static final C1808377v LIZ() {
        if (LIZIZ == null) {
            synchronized (C1808377v.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C1808377v();
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1808477w c1808477w = (C1808477w) it.next();
                if (c1808477w != null && TextUtils.equals(c1808477w.LIZ, str)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }
}
