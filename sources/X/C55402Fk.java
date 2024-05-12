package X;

import fjb.a;
import kotlin.jvm.internal.IDqS40S0300000;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
/* renamed from: X.2Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55402Fk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C21470sp<Object> LJLILLLLZI;
    public final /* synthetic */ java.util.Map<Float, Object> LJLJI;
    public final /* synthetic */ C21670t9 LJLJJI;
    public final /* synthetic */ InterfaceC23370vt LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<Object, Object, InterfaceC21480sq> LJLJJLL;
    public final /* synthetic */ float LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C55402Fk(C21470sp<Object> c21470sp, java.util.Map<Float, Object> map, C21670t9 c21670t9, InterfaceC23370vt interfaceC23370vt, InterfaceC88471Ynr<Object, Object, ? extends InterfaceC21480sq> interfaceC88471Ynr, float f, InterfaceC67352kd<? super C55402Fk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c21470sp;
        this.LJLJI = map;
        this.LJLJJI = c21670t9;
        this.LJLJJL = interfaceC23370vt;
        this.LJLJJLL = interfaceC88471Ynr;
        this.LJLJL = f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55402Fk(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            java.util.Map<Float, ? extends Object> LIZJ = this.LJLILLLLZI.LIZJ();
            C21470sp<Object> c21470sp = this.LJLILLLLZI;
            java.util.Map<Float, Object> map = this.LJLJI;
            c21470sp.getClass();
            o.LJIIIZ(map, "<set-?>");
            c21470sp.LJIIIIZZ.setValue(map);
            C21470sp<Object> c21470sp2 = this.LJLILLLLZI;
            c21470sp2.LJIILJJIL.setValue(this.LJLJJI);
            C21470sp<Object> c21470sp3 = this.LJLILLLLZI;
            IDqS40S0300000 iDqS40S0300000 = new IDqS40S0300000((java.util.Map) this.LJLJI, (java.util.Map<Float, Object>) this.LJLJJLL, (InterfaceC88471Ynr<Object, Object, ? extends InterfaceC21480sq>) this.LJLJJL, (InterfaceC23370vt) 3);
            c21470sp3.getClass();
            c21470sp3.LJIIL.setValue(iDqS40S0300000);
            InterfaceC23370vt interfaceC23370vt = this.LJLJJL;
            this.LJLILLLLZI.LJIILIIL.setValue(Float.valueOf(interfaceC23370vt.LJJJJIZL(this.LJLJL)));
            C21470sp<Object> c21470sp4 = this.LJLILLLLZI;
            java.util.Map<Float, ? extends Object> map2 = this.LJLJI;
            this.LJLIL = 1;
            if (c21470sp4.LJII(LIZJ, map2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
