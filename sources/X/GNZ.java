package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updatePostedDraftEntrance$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GNZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C26336AVg LJLIL;
    public final /* synthetic */ DraftViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNZ(C26336AVg c26336AVg, DraftViewModel draftViewModel, InterfaceC67352kd<? super GNZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c26336AVg;
        this.LJLILLLLZI = draftViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GNZ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C26336AVg c26336AVg = this.LJLIL;
        int i = c26336AVg.LIZ;
        AwemeDraft awemeDraft = c26336AVg.LIZIZ;
        if (awemeDraft == null) {
            if (ListProtector.get(this.LJLILLLLZI.LJLJJI, 1) instanceof C41413GNd) {
                ORS.LJJLIL(C41411GNb.LJLIL, this.LJLILLLLZI.LJLJJI);
                if (this.LJLILLLLZI.kv0()) {
                    ((ArrayList) this.LJLILLLLZI.LJLJJI).clear();
                }
                DraftViewModel draftViewModel = this.LJLILLLLZI;
                draftViewModel.LLFII.LJII(draftViewModel.LJLJJI);
            }
            return C76800UCe.LIZ;
        }
        String LIZ = awemeDraft.LIZ();
        String str = awemeDraft.LJJJJI.videoCoverPath;
        if (str == null) {
            str = "";
        }
        C41413GNd c41413GNd = new C41413GNd(i, LIZ, str);
        if (!(ListProtector.get(this.LJLILLLLZI.LJLJJI, 1) instanceof C41413GNd)) {
            ListProtector.add(this.LJLILLLLZI.LJLJJI, 1, c41413GNd);
        } else {
            ListProtector.set(this.LJLILLLLZI.LJLJJI, 1, c41413GNd);
        }
        DraftViewModel draftViewModel2 = this.LJLILLLLZI;
        draftViewModel2.LLFII.LJII(draftViewModel2.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
