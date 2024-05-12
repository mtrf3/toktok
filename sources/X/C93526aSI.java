package X;

import com.google.ar.core.AugmentedFace;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.aSI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93526aSI extends LinkedHashMap<Long, AugmentedFace> {
    public C93526aSI() {
        super(1, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
