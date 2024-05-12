package X;

import kotlin.jvm.internal.o;

/* renamed from: X.247, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass247 extends AbstractC65781Prl implements InterfaceC88472Yns<C1OL, C0XB> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ EnumC22040tk LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass247(long j, boolean z, EnumC22040tk enumC22040tk, boolean z2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = enumC22040tk;
        this.LJLJJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C0XB invoke(C1OL c1ol) {
        C1OL drawWithCache = c1ol;
        o.LJIIIZ(drawWithCache, "$this$drawWithCache");
        return drawWithCache.LIZLLL(new AnonymousClass246(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, C20120qe.LIZLLL(drawWithCache, C10430b1.LIZLLL(drawWithCache.LIZIZ()) / 2.0f), C11860dK.LIZIZ(this.LJLIL)));
    }
}
