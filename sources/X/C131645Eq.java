package X;

import com.bytedance.als.ui.state.LiveState;
import kotlin.jvm.internal.AqS0S0120000_2;
import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS53S0201000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131645Eq extends AbstractC48231ut<C52T, AbstractC131515Ed, C131555Eh, C5EY> implements InterfaceC135635Tz, C52T {
    public final C82622Wbi LJLL;

    @Override // X.C52T
    public LiveState<Long> BR() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.5Eo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C131555Eh) obj).LIZ);
            }
        });
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5EY> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 795);
    }

    @Override // X.C52T
    public LiveState<C08630Vn<C52V>> U30() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.5Er
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C131555Eh) obj).LIZLLL;
            }
        });
    }

    @Override // X.C52T
    public LiveState<Long> Y1() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.5Ep
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C131555Eh) obj).LIZIZ);
            }
        });
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C131555Eh> LJJLIIIJJI() {
        return C131665Es.LJLIL;
    }

    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.C52T
    public void E6(C52X playState) {
        o.LJIIIZ(playState, "playState");
        LJJZZI(new AqS168S0100000_2(playState, 486));
    }

    @Override // X.C52T
    public void LLIZLLLIL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 6));
    }

    @Override // X.C52T
    public void LLLLLLLLL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131645Eq(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }

    @Override // X.C52T
    public void H80(C52V actionType, float f) {
        o.LJIIIZ(actionType, "actionType");
        LJJZZI(new AqS5S0100001_2(actionType, f, 8));
    }

    @Override // X.C52T
    public void zU(C52V actionType, int i) {
        o.LJIIIZ(actionType, "actionType");
        LJJZZI(new AqS53S0201000_2(this, actionType, i, 4));
    }

    @Override // X.C52T
    public void Ua0(C52V actionType, boolean z, boolean z2) {
        o.LJIIIZ(actionType, "actionType");
        LJJZZI(new AqS0S0120000_2(actionType, z, z2, 1));
    }
}
