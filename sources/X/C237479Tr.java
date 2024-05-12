package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.helper.SocialFriendsHelper$syncFacebook$1$1", f = "SocialFriendsHelper.kt", l = {469}, m = "invokeSuspend")
/* renamed from: X.9Tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237479Tr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC73573Su9<List<Integer>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237479Tr(int i, InterfaceC73573Su9<List<Integer>> interfaceC73573Su9, InterfaceC67352kd<? super C237479Tr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC73573Su9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237479Tr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58085Mqv enumC58085Mqv;
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
            InterfaceC237509Tu LJI = UTK.LIZIZ.LJI();
            if (this.LJLILLLLZI == 2) {
                enumC58085Mqv = EnumC58085Mqv.SIGN_UP;
            } else {
                enumC58085Mqv = EnumC58085Mqv.LOGIN;
            }
            this.LJLIL = 1;
            obj = LJI.LIZ(enumC58085Mqv, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        StringBuilder LJI2 = JBR.LJI("sync fb ", booleanValue, ", ");
        LJI2.append(C16880lQ.LLLLIIIILLL().getName());
        X1D.LIZIZ(LJI2);
        if (booleanValue) {
            this.LJLJI.onNext(C47261Igj.LJJIJ(new Integer(2)));
        } else {
            this.LJLJI.onNext(C47261Igj.LJJIJ(new Integer(0)));
        }
        this.LJLJI.onComplete();
        return C76800UCe.LIZ;
    }
}
