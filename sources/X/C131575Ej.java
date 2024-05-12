package X;

import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131575Ej extends AbstractC48231ut<InterfaceC134345Pa, C5EZ, C131555Eh, C5EY> implements InterfaceC135635Tz, InterfaceC134345Pa {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;

    static {
        TBT tbt = new TBT(C131575Ej.class, "nleApi", "getNleApi()Lcom/ss/android/ugc/gamora/editorpro/crop/nle/NLECropApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5EY> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 589);
    }

    public final C5JU LJLZ() {
        return (C5JU) this.LJLLI.LIZ(this, LJLLILLLL[0]);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C131555Eh> LJJLIIIJJI() {
        return C131565Ei.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC134345Pa
    public void E6(C52X playState) {
        o.LJIIIZ(playState, "playState");
        LJJZZI(new AqS168S0100000_2(playState, 339));
    }

    @Override // X.InterfaceC134345Pa
    public void LLIZLLLIL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 1));
    }

    @Override // X.InterfaceC134345Pa
    public void LLLLLLLLL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131575Ej(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJII(getDiContainer(), C5JU.class, null);
    }
}
