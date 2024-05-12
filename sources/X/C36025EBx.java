package X;

import java.util.Map;

/* renamed from: X.EBx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36025EBx implements Map.Entry<Object, Object> {
    public final /* synthetic */ Map.Entry LJLIL;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        Object key = this.LJLIL.getKey();
        if (key == C36017EBp.NULL) {
            return null;
        }
        return key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object value = this.LJLIL.getValue();
        if (value == C36017EBp.NULL) {
            return null;
        }
        return value;
    }

    public C36025EBx(Map.Entry entry) {
        this.LJLIL = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map.Entry entry = this.LJLIL;
        if (obj == null) {
            obj = C36017EBp.NULL;
        }
        return entry.setValue(obj);
    }
}
