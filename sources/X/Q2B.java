package X;

import java.util.Collection;

/* loaded from: classes12.dex */
public final class Q2B extends Q23 {
    public Q2B(Collection<String> collection) {
        super(collection);
    }

    @Override // X.Q23
    public final boolean LJI(String str, String str2) {
        if (str != null && str2 != null) {
            return str.startsWith(str2);
        }
        return false;
    }
}
