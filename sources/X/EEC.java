package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EEC extends ThreadLocal<List<EE1>> {
    @Override // java.lang.ThreadLocal
    public final List<EE1> initialValue() {
        return new ArrayList();
    }
}
