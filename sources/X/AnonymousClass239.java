package X;

import kotlin.jvm.internal.o;

/* renamed from: X.239, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass239 extends AbstractC65781Prl implements InterfaceC88472Yns<C1OL, C0XB> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass239(long j) {
        super(1);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C0XB invoke(C1OL c1ol) {
        C1OL drawWithCache = c1ol;
        o.LJIIIZ(drawWithCache, "$this$drawWithCache");
        float LIZLLL = C10430b1.LIZLLL(drawWithCache.LIZIZ()) / 2.0f;
        return drawWithCache.LIZLLL(new AnonymousClass238(LIZLLL, C20120qe.LIZLLL(drawWithCache, LIZLLL), C11860dK.LIZIZ(this.LJLIL)));
    }
}
