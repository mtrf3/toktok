package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import defpackage.g0;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updateDraftViewInfo$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GNR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DraftViewModel LJLIL;
    public final /* synthetic */ List<DraftViewInfo> LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNR(DraftViewModel draftViewModel, List<DraftViewInfo> list, Context context, InterfaceC67352kd<? super GNR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = draftViewModel;
        this.LJLILLLLZI = list;
        this.LJLJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GNR(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        DraftViewModel draftViewModel = this.LJLIL;
        List<DraftViewInfo> list = this.LJLILLLLZI;
        Context context = this.LJLJI;
        draftViewModel.getClass();
        if (!list.isEmpty()) {
            for (DraftViewInfo draftViewInfo : list) {
                List<C41426GNq> list2 = draftViewModel.LJLJJI;
                int size = ((ArrayList) list2).size() - 2;
                String str = draftViewInfo.creationId;
                DraftShowInfo draftShowInfo = draftViewInfo.draftShowInfo;
                ListProtector.add(list2, size, new C41425GNp(106, 128, draftViewInfo.draftOperationInfo.freeUpSpace, str, draftShowInfo.coverPath, draftShowInfo.musicName, C87277YNd.LJIJ(draftViewInfo, context), draftViewModel.LJZL));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(draftViewModel.LJLIL);
            LIZ.append(" -> dealDraftViewInfosForNewUI: draftList.size = ");
            LIZ.append(((ArrayList) draftViewModel.LJLJJI).size());
            H78.LIZ(X1D.LIZIZ(LIZ));
            g0.LJJIL(draftViewModel.LJLJJL, Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
