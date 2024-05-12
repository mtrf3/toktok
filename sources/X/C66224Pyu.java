package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pyu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66224Pyu implements InterfaceC66337Q1t {
    public final InterfaceC66223Pyt LIZ;

    public C66224Pyu(InterfaceC66223Pyt storeRepo) {
        o.LJIIIZ(storeRepo, "storeRepo");
        this.LIZ = storeRepo;
    }

    public final void LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        try {
            this.LIZ.remove(key);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC66337Q1t
    public final String get(String key) {
        o.LJIIIZ(key, "key");
        try {
            return this.LIZ.getString(key, null);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    @Override // X.InterfaceC66337Q1t
    public final void LIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        try {
            this.LIZ.putString(key, value);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
