package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ufr.contact.ContactUFR$upload$1$1", f = "ContactUFR.kt", l = {431}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UPB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ContactUFR LJLILLLLZI;
    public final /* synthetic */ InterfaceC73573Su9<C77150UPq> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPB(ContactUFR contactUFR, InterfaceC73573Su9<C77150UPq> interfaceC73573Su9, InterfaceC67352kd<? super UPB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = contactUFR;
        this.LJLJI = interfaceC73573Su9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UPB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C38333F2r c38333F2r;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C141335gf.LIZJ(obj);
                } else {
                    C141335gf.LIZJ(obj);
                    InterfaceC237529Tw LIZJ = UTK.LIZIZ.LIZJ();
                    EnumC58085Mqv LIZ = C58084Mqu.LIZ(this.LJLILLLLZI.LIZLLL());
                    this.LJLIL = 1;
                    obj = LIZJ.LIZIZ(LIZ, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                C40883G2t c40883G2t = new C40883G2t();
                ((Bundle) c40883G2t.LIZ).putSerializable("contact_model", (C9U5) obj);
                this.LJLJI.onNext(new C77150UPq(true, 0, 0, (Bundle) c40883G2t.LIZ, 14));
                ContactUFR contactUFR = this.LJLILLLLZI;
                contactUFR.getClass();
                new C243529h6(contactUFR.LIZLLL(), contactUFR.LJ(), true, "contact").LIZLLL(null);
            } catch (Exception e) {
                InterfaceC73573Su9<C77150UPq> interfaceC73573Su9 = this.LJLJI;
                if ((e instanceof C38333F2r) && (c38333F2r = (C38333F2r) e) != null) {
                    i = c38333F2r.getErrorCode();
                } else {
                    i = -1;
                }
                interfaceC73573Su9.onNext(new C77150UPq(false, 0, i, null, 26));
                ContactUFR contactUFR2 = this.LJLILLLLZI;
                contactUFR2.getClass();
                new C243529h6(contactUFR2.LIZLLL(), contactUFR2.LJ(), false, "contact").LIZLLL(null);
            }
            this.LJLILLLLZI.LJIIL();
            this.LJLJI.onComplete();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLILLLLZI.LJIIL();
            this.LJLJI.onComplete();
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
