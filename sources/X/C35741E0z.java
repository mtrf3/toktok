package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35741E0z extends LinkedHashMap<Object, Object> {
    public final /* synthetic */ E11 LJLIL;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        if (size() > this.LJLIL.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35741E0z(E11 e11, int i) {
        super(i, 0.75f, true);
        this.LJLIL = e11;
    }
}
