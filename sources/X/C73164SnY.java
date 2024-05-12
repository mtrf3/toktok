package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.SnY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73164SnY<T, R> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ LifecycleOwner LJLIL = null;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    public C73164SnY(TBW tbw, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LJLILLLLZI = tbw;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIJ(it, "it");
        return new C73140SnA(this.LJLILLLLZI.get(it));
    }
}
