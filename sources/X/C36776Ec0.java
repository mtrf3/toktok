package X;

import com.bytedance.keva.Keva;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.Ec0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36776Ec0 implements InterfaceC36763Ebn {
    public final /* synthetic */ Keva LIZ;

    @Override // X.InterfaceC36763Ebn
    public final void removeAll() {
    }

    @Override // X.InterfaceC36763Ebn
    public final Collection LIZ() {
        return this.LIZ.getStringSet("__prefetch_cache_key_array", null);
    }

    public C36776Ec0(Keva keva) {
        this.LIZ = keva;
    }

    @Override // X.InterfaceC36763Ebn
    public final void LIZIZ(Collection collection) {
        o.LJIIIZ(collection, "collection");
        this.LIZ.storeStringSet("__prefetch_cache_key_array", (java.util.Set) collection);
    }

    @Override // X.InterfaceC36763Ebn
    public final String getString(String key) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getString(key, null);
    }

    @Override // X.InterfaceC36763Ebn
    public final void remove(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.erase(key);
    }

    @Override // X.InterfaceC36763Ebn
    public final void putString(String key, String str) {
        o.LJIIIZ(key, "key");
        this.LIZ.storeString(key, str);
    }
}
