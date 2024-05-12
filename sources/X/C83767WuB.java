package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.livephoto.BaseLivePhotoComponent$realTakeLivePhoto$2", f = "BaseLivePhotoComponent.kt", l = {286}, m = "invokeSuspend")
/* renamed from: X.WuB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83767WuB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AbstractC83766WuA LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83767WuB(AbstractC83766WuA abstractC83766WuA, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC83766WuA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C83767WuB c83767WuB = new C83767WuB(this.LJLJI, completion);
        c83767WuB.LJLIL = obj;
        return c83767WuB;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, C78613UtF.LIZJ, null, new C83768WuC(this, null), 2);
            this.LJLILLLLZI = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Number) obj).intValue() < 0) {
            AbstractC83766WuA abstractC83766WuA = this.LJLJI;
            if (abstractC83766WuA.LJLL == 0) {
                abstractC83766WuA.LJLL = 3;
            }
            abstractC83766WuA.LJJLIIIIJ().setOpen(false);
        }
        long segmentFrameTimeUS = this.LJLJI.LJLJI.LIZIZ.getSegmentFrameTimeUS();
        if (segmentFrameTimeUS < 500000) {
            AbstractC83766WuA abstractC83766WuA2 = this.LJLJI;
            if (abstractC83766WuA2.LJLL == 0) {
                abstractC83766WuA2.LJLL = 5;
            }
            abstractC83766WuA2.LJJLIIIIJ().setOpen(false);
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livephoto: duration ");
        LIZ.append(segmentFrameTimeUS);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJLJI.getClass();
        throw null;
    }
}
