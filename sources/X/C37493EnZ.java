package X;

import java.util.Map;

/* renamed from: X.EnZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37493EnZ implements Map.Entry<String, Long> {
    public Map.Entry<String, ?> LJLIL;

    @Override // java.util.Map.Entry
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Long getValue() {
        Map.Entry<String, ?> entry = this.LJLIL;
        if (entry == null || !(entry.getValue() instanceof Long)) {
            return -1L;
        }
        return (Long) this.LJLIL.getValue();
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        Map.Entry<String, ?> entry = this.LJLIL;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Long setValue(Long l) {
        return null;
    }
}
