package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$restoreWithNet$2$1", f = "DraftAlgorithmModelRestoreHandler.kt", l = {87}, m = "invokeSuspend")
/* renamed from: X.6k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168936k5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftFileRestoreResult>, Object> {
    public int LJLIL;
    public final /* synthetic */ C168956k7 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168936k5(C168956k7 c168956k7, InterfaceC67352kd<? super C168936k5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c168956k7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168936k5(this.LJLILLLLZI, interfaceC67352kd);
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
            final C168956k7 c168956k7 = this.LJLILLLLZI;
            this.LJLIL = 1;
            c168956k7.getClass();
            final XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c168956k7.LIZIZ);
            LIZ.append(" ; restore model start ...");
            C5Z2.LIZ(X1D.LIZIZ(LIZ));
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, (String[]) ((ArrayList) c168956k7.LJ).toArray(new String[0]), new FetchResourcesListener() { // from class: X.6k0
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    if (!xks.isActive()) {
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(c168956k7.LIZIZ);
                    LIZ2.append(" ; restore model success ...");
                    C5Z2.LIZ(X1D.LIZIZ(LIZ2));
                    XJL<DraftFileRestoreResult> xjl = xks;
                    DraftFileRestoreResult LIZIZ = C168716jj.LIZIZ(c168956k7, null, null, 7);
                    C3C5.m7constructorimpl(LIZIZ);
                    xjl.resumeWith(LIZIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    if (!xks.isActive()) {
                        return;
                    }
                    ((AwemeDraft) c168956k7.LIZ.LIZLLL).LJJJJI.autoEnhanceOn = false;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(c168956k7.LIZIZ);
                    LIZ2.append(" ; restore model failed ..., exception : ");
                    LIZ2.append(android.util.Log.getStackTraceString(exc));
                    C5Z2.LIZ(X1D.LIZIZ(LIZ2));
                    XJL<DraftFileRestoreResult> xjl = xks;
                    DraftFileRestoreResult LIZIZ = C168716jj.LIZIZ(c168956k7, Integer.valueOf(R.string.eyo), new DraftFileRestoreException(-3001, exc), 2);
                    C3C5.m7constructorimpl(LIZIZ);
                    xjl.resumeWith(LIZIZ);
                }
            });
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftFileRestoreResult> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}