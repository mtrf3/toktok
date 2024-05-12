package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.helper.SocialFriendsHelper$getContactModel$1$1", f = "SocialFriendsHelper.kt", l = {535}, m = "invokeSuspend")
/* renamed from: X.9Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237499Tt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC58085Mqv LJLILLLLZI;
    public final /* synthetic */ InterfaceC73573Su9<List<Integer>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237499Tt(EnumC58085Mqv enumC58085Mqv, InterfaceC73573Su9<List<Integer>> interfaceC73573Su9, InterfaceC67352kd<? super C237499Tt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC58085Mqv;
        this.LJLJI = interfaceC73573Su9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237499Tt(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
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
                    obj = LIZJ.LIZ(enumC58085Mqv, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    this.LJLJI.onNext(C47261Igj.LJJIJ(new Integer(1)));
                } else {
                    this.LJLJI.onNext(C47261Igj.LJJIJ(new Integer(0)));
                }
            } catch (Exception e) {
                this.LJLJI.onError(e);
            }
            this.LJLJI.onComplete();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLJI.onComplete();
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
