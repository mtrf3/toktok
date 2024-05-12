package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl$startRecordTimer$1$1", f = "VopCloneServiceImpl.kt", l = {510}, m = "invokeSuspend")
/* renamed from: X.2kH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67132kH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VopCloneServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67132kH(VopCloneServiceImpl vopCloneServiceImpl, InterfaceC67352kd<? super C67132kH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = vopCloneServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67132kH(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.getClass();
            Integer num = E8I.LIZ().recordMaxDuration;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 30000;
            }
            this.LJLIL = 1;
            if (C1JD.LIZJ(i, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "vop_clone_record_exceed_max"));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
