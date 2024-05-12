package X;

import fjb.a;
import java.util.Collection;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friends.utils.ContactUploadUtil$uploadContacts$1$contactItemList$1", f = "ContactUploadUtil.kt", l = {35}, m = "invokeSuspend")
/* renamed from: X.9Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237519Tv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Collection<? extends EMX>>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC58085Mqv LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237519Tv(EnumC58085Mqv enumC58085Mqv, InterfaceC67352kd<? super C237519Tv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC58085Mqv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237519Tv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC237529Tw LIZJ = UTK.LIZIZ.LIZJ();
                EnumC58085Mqv enumC58085Mqv = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = LIZJ.LIZIZ(enumC58085Mqv, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return ((C9U5) obj).getHashNationalNumberMap().values();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Collection<? extends EMX>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
