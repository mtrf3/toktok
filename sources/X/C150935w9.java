package X;

import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150935w9 extends AbstractC164296cb {
    public final C82622Wbi LJLLLL;
    public final C5H3 LJLLLLLL;

    @Override // X.AbstractC164296cb
    public C164246cW LJJLIIIIJ() {
        return (C164246cW) this.LJLLLLLL.getValue();
    }

    @Override // X.AbstractC164296cb, X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150935w9(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer, parentScene, i);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLLLL = diContainer;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1066));
    }
}
