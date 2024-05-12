package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$restoreWithNet$2", f = "DraftAlgorithmModelRestoreHandler.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.6k4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168926k4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftFileRestoreResult>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C168956k7 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168926k4(C168956k7 c168956k7, InterfaceC67352kd<? super C168926k4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c168956k7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C168926k4 c168926k4 = new C168926k4(this.LJLJI, interfaceC67352kd);
        c168926k4.LJLILLLLZI = obj;
        return c168926k4;
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
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI.LIZIZ);
            LIZ.append(" ; restore start ...");
            C5Z2.LIZ(X1D.LIZIZ(LIZ));
            C60903NvH.LJIIJJI().initDownloadableModel();
            ArrayList arrayList = new ArrayList();
            if (!((ArrayList) this.LJLJI.LJ).isEmpty()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C168936k5(this.LJLJI, null), 3));
            }
            if (!((ArrayList) this.LJLJI.LJFF).isEmpty()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C168946k6(this.LJLJI, null), 3));
            }
            if (!this.LJLJI.LJI.getFirst().isEmpty()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C168916k3(this.LJLJI, null), 3));
            }
            this.LJLIL = 1;
            obj = T1W.LIZ(arrayList, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C168956k7 c168956k7 = this.LJLJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c168956k7.LIZIZ);
        LIZ2.append(" ; restore success ...");
        C5Z2.LIZ(X1D.LIZIZ(LIZ2));
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftFileRestoreResult>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
