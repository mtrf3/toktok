package X;

import java.util.Map;

/* renamed from: X.Pni, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65530Pni extends AbstractC65505PnJ<Object, AbstractC65583PoZ<Object>> {
    public final /* synthetic */ Map.Entry LJLIL;

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final Object getKey() {
        return this.LJLIL.getKey();
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final Object getValue() {
        return AbstractC65583PoZ.of(this.LJLIL.getValue());
    }

    public C65530Pni(Map.Entry entry) {
        this.LJLIL = entry;
    }
}
