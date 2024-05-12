package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EHN implements Map.Entry<String, Object>, EHP {
    public final String LJLIL;
    public Object LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.LJLIL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object newValue) {
        o.LJIIJ(newValue, "newValue");
        Object obj = this.LJLILLLLZI;
        this.LJLILLLLZI = newValue;
        return obj;
    }

    public EHN(String str, Object value) {
        o.LJIIJ(value, "value");
        this.LJLIL = str;
        this.LJLILLLLZI = value;
    }
}
