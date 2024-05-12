package X;

import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152645yu extends AbstractC48231ut<InterfaceC134365Pc, C152615yr, C152625ys, C152655yv> implements InterfaceC135635Tz, InterfaceC134365Pc {
    public final C82622Wbi LJLL;
    public InterfaceC152665yw LJLLI;

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C152655yv> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 1084);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C152625ys> LJJLIIIJJI() {
        return C152635yt.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC134365Pc
    public void B50(InterfaceC152665yw listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLI = listener;
    }

    @Override // X.InterfaceC134365Pc
    public void LJLJLLL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 61));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152645yu(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }
}
