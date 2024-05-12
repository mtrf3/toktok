package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EEO extends ThreadLocal<List<String>> {
    @Override // java.lang.ThreadLocal
    public final List<String> initialValue() {
        return new ArrayList();
    }
}
