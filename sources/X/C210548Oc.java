package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210548Oc extends AbstractC65781Prl implements InterfaceC88472Yns<C210538Ob, C210538Ob> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210548Oc(boolean z, long j) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C210538Ob invoke(C210538Ob setStateImmediate) {
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return new C210538Ob(this.LJLIL, this.LJLILLLLZI);
    }
}
