package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$2$run$1", f = "RecordConditionCheck.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.EFf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36111EFf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36111EFf(Activity activity, long j, long j2, long j3, InterfaceC67352kd<? super C36111EFf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activity;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36111EFf c36111EFf = new C36111EFf(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c36111EFf.LJLILLLLZI = obj;
        return c36111EFf;
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
            obj = C37284EkC.LIZ(interfaceC70422pa, activity, false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSZ osz = (OSZ) obj;
        C37284EkC.LIZJ(EnumC36113EFh.CLEAN_STORAGE_SILENCE, this.LJLJJI, this.LJLJJL, this.LJLJJLL, ((Number) osz.getFirst()).longValue(), ((Number) osz.getSecond()).longValue(), true, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
