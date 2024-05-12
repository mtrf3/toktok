package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55442Fo extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ C21470sp<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55442Fo(float f, C21470sp<Object> c21470sp, InterfaceC67352kd<? super C55442Fo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = f;
        this.LJLJI = c21470sp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55442Fo c55442Fo = new C55442Fo(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c55442Fo.LJLIL = obj;
        return c55442Fo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C0UZ) this.LJLIL).LIZIZ(this.LJLILLLLZI - ((Number) this.LJLJI.LJI.getValue()).floatValue());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UZ c0uz, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uz, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
