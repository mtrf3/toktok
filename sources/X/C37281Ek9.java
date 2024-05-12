package X;

import android.content.Context;
import com.aweme.storage.StorageCleanServiceImpl;
import com.ss.android.ugc.aweme.base.storage.IStorageCleanService;
import fjb.a;
import java.util.concurrent.atomic.AtomicLong;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$cleanCacheForRecord$cleanCacheTime$1$job1$1", f = "RecordConditionCheck.kt", l = {277}, m = "invokeSuspend")
/* renamed from: X.Ek9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37281Ek9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Long>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C68322mC<AtomicLong> LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37281Ek9(C68322mC<AtomicLong> c68322mC, Context context, InterfaceC67352kd<? super C37281Ek9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c68322mC;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37281Ek9(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Context context = this.LJLJJI;
            this.LJLIL = context;
            this.LJLILLLLZI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            IStorageCleanService LIZJ = StorageCleanServiceImpl.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZIZ(context, new C37282EkA(c84654XKg));
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return new Long(this.LJLJI.element.addAndGet(((Number) obj).longValue()));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Long> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
