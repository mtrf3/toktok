package X;

import fjb.a;
import kotlin.jvm.internal.IDqS172S0200000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {459}, m = "invokeSuspend")
/* renamed from: X.2Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54692Cr extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C0UL LJLIL;
    public C72242sW LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C0UL LJLJJLL;
    public final /* synthetic */ C72242sW LJLJL;
    public final /* synthetic */ long LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54692Cr(C0UL c0ul, C72242sW c72242sW, long j, InterfaceC67352kd<? super C54692Cr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = c0ul;
        this.LJLJL = c72242sW;
        this.LJLJLJ = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54692Cr c54692Cr = new C54692Cr(this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c54692Cr.LJLJJL = obj;
        return c54692Cr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.1Mu] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        final C0UL c0ul;
        C72242sW c72242sW;
        long j;
        float LIZJ;
        C0UL c0ul2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                j = this.LJLJI;
                c72242sW = this.LJLILLLLZI;
                c0ul = this.LJLIL;
                c0ul2 = (C0UL) this.LJLJJL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(this.LJLJJLL, (C0UY) this.LJLJJL, 38);
            c0ul = this.LJLJJLL;
            ?? r12 = new C0UY() { // from class: X.1Mu
                @Override // X.C0UY
                public final float LIZ(float f) {
                    C0UL c0ul3 = C0UL.this;
                    return c0ul3.LJ(iDqS172S0200000.invoke(new C10370av(c0ul3.LJFF(f))).LIZ);
                }
            };
            c72242sW = this.LJLJL;
            long j2 = this.LJLJLJ;
            C0UP c0up = c0ul.LJ;
            j = c72242sW.element;
            if (c0ul.LIZ == C0UT.Horizontal) {
                LIZJ = C23560wC.LIZIZ(j2);
            } else {
                LIZJ = C23560wC.LIZJ(j2);
            }
            if (c0ul.LIZIZ) {
                LIZJ *= -1;
            }
            this.LJLJJL = c0ul;
            this.LJLIL = c0ul;
            this.LJLILLLLZI = c72242sW;
            this.LJLJI = j;
            this.LJLJJI = 1;
            obj = c0up.LIZ(r12, LIZJ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
            c0ul2 = c0ul;
        }
        float floatValue = ((Number) obj).floatValue();
        if (c0ul2.LIZIZ) {
            floatValue *= -1;
        }
        float f = 0.0f;
        if (c0ul.LIZ == C0UT.Horizontal) {
            i2 = 2;
        } else {
            f = floatValue;
            floatValue = 0.0f;
        }
        c72242sW.element = C23560wC.LIZ(j, floatValue, f, i2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UY c0uy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uy, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
