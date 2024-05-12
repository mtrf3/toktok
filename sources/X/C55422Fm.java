package X;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55422Fm extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, Float, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ InterfaceC70422pa LJLIL;
    public /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ C21470sp<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55422Fm(C21470sp<Object> c21470sp, InterfaceC67352kd<? super C55422Fm> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = c21470sp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL(this.LJLIL, null, null, new C55412Fl(this.LJLILLLLZI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, Float f, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        float floatValue = f.floatValue();
        C55422Fm c55422Fm = new C55422Fm(this.LJLJI, interfaceC67352kd);
        c55422Fm.LJLIL = interfaceC70422pa;
        c55422Fm.LJLILLLLZI = floatValue;
        return c55422Fm.invokeSuspend(C76800UCe.LIZ);
    }
}
