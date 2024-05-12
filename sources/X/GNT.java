package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftOperationInfo;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryDraftMemorySize$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GNT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Long>, Object> {
    public final /* synthetic */ DraftViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNT(DraftViewModel draftViewModel, InterfaceC67352kd<? super GNT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = draftViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GNT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC41422GNm enumC41422GNm;
        C141335gf.LIZJ(obj);
        if (GNP.LIZ()) {
            enumC41422GNm = EnumC41422GNm.FIRST_SAVE_TIME;
        } else {
            enumC41422GNm = EnumC41422GNm.LAST_SAVE_TIME;
        }
        Iterator it = ((ArrayList) GPD.LJ(new GPG(enumC41422GNm, null, null, true, this.LJLIL.jv0(), null, 38), null)).iterator();
        long j = 0;
        while (it.hasNext()) {
            DraftOperationInfo draftOperationInfo = C87277YNd.LIZJ((AwemeDraft) it.next()).draftOperationInfo;
            if (draftOperationInfo.isNeedShow) {
                j += draftOperationInfo.freeUpSpace;
            }
        }
        return new Long(j);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Long> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
