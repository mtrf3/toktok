package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pys, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66222Pys implements InterfaceC66048Pw4 {
    public final InterfaceC66223Pyt LIZ;

    @Override // X.InterfaceC66048Pw4
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC66048Pw4
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // X.InterfaceC66048Pw4
    public final java.util.Map<String, ?> getAll() {
        return this.LIZ.getAll();
    }

    public C66222Pys(InterfaceC66223Pyt storeRepo) {
        o.LJIIIZ(storeRepo, "storeRepo");
        this.LIZ = storeRepo;
    }

    @Override // X.InterfaceC66048Pw4
    public final void LIZ(int i) {
        this.LIZ.LIZ(i);
    }

    @Override // X.InterfaceC66048Pw4
    public final long getLong(String str) {
        return this.LIZ.getLong(str);
    }

    @Override // X.InterfaceC66048Pw4
    public final void remove(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.remove(key);
    }

    @Override // X.InterfaceC66048Pw4
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // X.InterfaceC66048Pw4
    public final void putLong(String str, long j) {
        this.LIZ.putLong(str, j);
    }

    @Override // X.InterfaceC66048Pw4
    public final void putString(String str, String value) {
        o.LJIIIZ(value, "value");
        this.LIZ.putString(str, value);
    }
}
