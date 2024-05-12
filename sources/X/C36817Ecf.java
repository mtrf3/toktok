package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ecf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36817Ecf implements InterfaceC36763Ebn {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZJ;
    public final C62822Ol8 LIZ;
    public final Context LIZIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36817Ecf.class), "cacheShared", "getCacheShared()Landroid/content/SharedPreferences;");
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt};
    }

    public final SharedPreferences LIZJ() {
        return (SharedPreferences) this.LIZ.getValue();
    }

    @Override // X.InterfaceC36763Ebn
    public final Collection LIZ() {
        return LIZJ().getStringSet("__prefetch_cache_key_array", null);
    }

    @Override // X.InterfaceC36763Ebn
    public final void removeAll() {
        LIZJ().edit().clear().apply();
    }

    @Override // X.InterfaceC36763Ebn
    public final void LIZIZ(Collection collection) {
        o.LJIIJ(collection, "collection");
        if (collection instanceof java.util.Set) {
            LIZJ().edit().putStringSet("__prefetch_cache_key_array", (java.util.Set) collection).apply();
        }
    }

    @Override // X.InterfaceC36763Ebn
    public final String getString(String key) {
        o.LJIIJ(key, "key");
        return LIZJ().getString(key, null);
    }

    @Override // X.InterfaceC36763Ebn
    public final void remove(String key) {
        o.LJIIJ(key, "key");
        LIZJ().edit().remove(key).apply();
    }

    public C36817Ecf(Context context, String str) {
        this.LIZIZ = context;
        this.LIZ = C221108m2.LIZIZ(new AqS73S1100000_6(this, str, 1));
    }

    @Override // X.InterfaceC36763Ebn
    public final void putString(String key, String str) {
        o.LJIIJ(key, "key");
        LIZJ().edit().putString(key, str).apply();
    }
}
