package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.channel.guitar.EffectGuitarHandler$handle$1", f = "EffectGuitarHandler.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.2i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65752i3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ICY LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65752i3(ICY icy, int i, InterfaceC67352kd<? super C65752i3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = icy;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65752i3(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                ICY icy = this.LJLILLLLZI;
                int i2 = this.LJLJI;
                this.LJLIL = 1;
                icy.getClass();
                Object LJI = XKX.LJI(C78613UtF.LIZJ, new C51732KSa(icy, i2, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
        } catch (Exception e) {
            this.LJLILLLLZI.LJFF(this.LJLJI, e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
