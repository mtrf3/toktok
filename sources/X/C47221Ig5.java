package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ig5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47221Ig5 extends LinkedHashMap<String, List<InterfaceC46811IYt>> {
    public C47221Ig5() {
        super(8);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<InterfaceC46811IYt>> entry) {
        if (size() > 8) {
            return true;
        }
        return false;
    }
}
