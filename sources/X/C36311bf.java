package X;

import com.google.gson.j;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36311bf implements Map.Entry<String, Object>, InterfaceC90533gv {
    public final /* synthetic */ Map.Entry<String, j> LJLIL;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        String key = this.LJLIL.getKey();
        o.LJIIIIZZ(key, "it.key");
        return key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        j value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "it.value");
        return C05600Jw.LIZIZ(value);
    }

    public C36311bf(Map.Entry<String, j> entry) {
        this.LJLIL = entry;
    }
}
