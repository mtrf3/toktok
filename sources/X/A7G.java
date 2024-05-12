package X;

import Y.AfS20S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A7G<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "cold_start";

    public A7G(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        String str;
        o.LJIIIZ(it, "it");
        String str2 = "";
        if (this.LJLIL) {
            str = "";
        } else {
            str = "guide";
            str2 = "did";
        }
        UQ4.LIZLLL(this.LJLILLLLZI, str, "contact", "", str2, "auto", null, null, 448);
        return UPT.LIZJ(EnumC58085Mqv.UNKNOWN).LJIJJLI(new AfS20S1000000_4(this.LJLILLLLZI, 0)).LJIJJ(new AfS20S1000000_4(this.LJLILLLLZI, 1));
    }
}
