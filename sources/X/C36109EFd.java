package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$cleanCacheJob$1", f = "RecordConditionCheck.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.EFd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36109EFd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Long, ? extends Long>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36109EFd(Activity activity, InterfaceC67352kd<? super C36109EFd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36109EFd c36109EFd = new C36109EFd(this.LJLJI, interfaceC67352kd);
        c36109EFd.LJLILLLLZI = obj;
        return c36109EFd;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            Activity activity = this.LJLJI;
            this.LJLIL = 1;
            obj = C37284EkC.LIZ(interfaceC70422pa, activity, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Long, ? extends Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
