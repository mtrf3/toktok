package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import fjb.a;
import kotlin.jvm.internal.IDqS172S0200000;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
/* renamed from: X.2Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55432Fn extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C21470sp<T> LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ C0Q2<Float> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55432Fn(C21470sp<T> c21470sp, float f, C0Q2<Float> c0q2, InterfaceC67352kd<? super C55432Fn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c21470sp;
        this.LJLJJI = f;
        this.LJLJJL = c0q2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55432Fn c55432Fn = new C55432Fn(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c55432Fn.LJLILLLLZI = obj;
        return c55432Fn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C0UZ c0uz = (C0UZ) this.LJLILLLLZI;
                C56K c56k = new C56K();
                c56k.element = ((Number) this.LJLJI.LJI.getValue()).floatValue();
                this.LJLJI.LJII.setValue(new Float(this.LJLJJI));
                this.LJLJI.LIZLLL.setValue(Boolean.TRUE);
                C07070Pn LIZIZ = C17J.LIZIZ(c56k.element);
                Float f = new Float(this.LJLJJI);
                C0Q2<Float> c0q2 = this.LJLJJL;
                IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(c0uz, c56k, 75);
                this.LJLIL = 1;
                if (C07070Pn.LIZIZ(LIZIZ, f, c0q2, iDqS172S0200000, this, 4) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLJI.LJII.setValue(null);
            parcelableSnapshotMutableState = this.LJLJI.LIZLLL;
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLJI.LJII.setValue(parcelableSnapshotMutableState);
            this.LJLJI.LIZLLL.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UZ c0uz, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uz, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
