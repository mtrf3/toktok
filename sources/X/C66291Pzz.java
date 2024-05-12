package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pzz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66291Pzz implements J1T {
    public final Q03 LJLIL = new Q03(this);
    public volatile boolean LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.J1T
    public final boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        if (!this.LJLILLLLZI) {
            C64403PPj.LJ(this.LJLIL);
            this.LJLILLLLZI = true;
        }
        if (this.LJLJI) {
            store.clear(storeKey);
            this.LJLJI = false;
            return true;
        }
        if (!store.LIZ(storeKey)) {
            return true;
        }
        return !C64403PPj.LIZLLL(0L);
    }
}
