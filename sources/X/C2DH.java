package X;

import fjb.a;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* renamed from: X.2DH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DH extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ C0Q2<Float> LJLJJI;
    public final /* synthetic */ C56K LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DH(float f, C0Q2<Float> c0q2, C56K c56k, InterfaceC67352kd<? super C2DH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = f;
        this.LJLJJI = c0q2;
        this.LJLJJL = c56k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DH c2dh = new C2DH(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c2dh.LJLILLLLZI = obj;
        return c2dh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C0UY c0uy = (C0UY) this.LJLILLLLZI;
            float f = this.LJLJI;
            C0Q2<Float> c0q2 = this.LJLJJI;
            IDqS189S0200000 iDqS189S0200000 = new IDqS189S0200000(this.LJLJJL, c0uy, 2);
            this.LJLIL = 1;
            C1JR c1jr = C0QD.LIZ;
            Float f2 = new Float(0.0f);
            Float f3 = new Float(f);
            C0Q9 c0q9 = (C0Q9) c1jr.LIZ.invoke(new Float(0.0f));
            if (c0q9 == null) {
                C0Q9 c0q92 = (C0Q9) c1jr.LIZ.invoke(f2);
                o.LJIIIZ(c0q92, "<this>");
                c0q9 = c0q92.LIZJ();
            }
            Object LIZ = C07090Pp.LIZ(new C1JK(c1jr, f2, c0q9, 56), new C1J8(c0q2, c1jr, f2, f3, c0q9), Long.MIN_VALUE, new IDqS172S0200000(iDqS189S0200000, c1jr, 27), this);
            if (LIZ != obj2) {
                LIZ = C76800UCe.LIZ;
            }
            if (LIZ != obj2) {
                LIZ = C76800UCe.LIZ;
            }
            if (LIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UY c0uy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uy, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
