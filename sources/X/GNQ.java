package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$updateDraft$1", f = "DraftFragment.kt", l = {553}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GNQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DraftFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNQ(DraftFragment draftFragment, InterfaceC67352kd<? super GNQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = draftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GNQ(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<C41426GNq> list;
        C41425GNp c41425GNp;
        String str;
        String str2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj2, "DraftFragment -> updateDraft: operatedDraftCreationId = ");
            LIZIZ.append(this.LJLJI.LLD);
            H78.LIZ(X1D.LIZIZ(LIZIZ));
            C13I c13i = this.LJLJI.Dl().LJLJLLL;
            String creationId = this.LJLJI.LLD;
            c13i.getClass();
            o.LJIIIZ(creationId, "creationId");
            ((java.util.Map) c13i.LIZ).remove(creationId);
            list = this.LJLJI.Dl().LJLJJI;
            String str3 = this.LJLJI.LLD;
            this.LJLIL = list;
            this.LJLILLLLZI = 1;
            obj2 = XKX.LJI(C78613UtF.LIZJ, new GP5(str3, null), this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        DraftViewInfo draftViewInfo = (DraftViewInfo) obj2;
        if (draftViewInfo != null) {
            Context context = this.LJLJI.getContext();
            String str4 = draftViewInfo.creationId;
            DraftShowInfo draftShowInfo = draftViewInfo.draftShowInfo;
            String str5 = draftShowInfo.coverPath;
            long j = draftViewInfo.draftOperationInfo.freeUpSpace;
            if (draftShowInfo.musicName.length() == 0) {
                str2 = "";
            } else {
                str2 = draftViewInfo.draftShowInfo.musicName;
            }
            c41425GNp = new C41425GNp(106, 192, j, str4, str5, str2, C87277YNd.LJIJ(draftViewInfo, context), false);
        } else {
            c41425GNp = null;
        }
        Iterator<C41426GNq> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C41426GNq next = it.next();
            if (next instanceof C41425GNp) {
                String str6 = ((C41425GNp) next).LJ;
                if (c41425GNp != null) {
                    str = c41425GNp.LJ;
                } else {
                    str = null;
                }
                if (o.LJ(str6, str)) {
                    ListProtector.set(list, list.indexOf(next), c41425GNp);
                    C41428GNs c41428GNs = this.LJLJI.LJLLLLLL;
                    if (c41428GNs != null) {
                        c41428GNs.setData(list);
                        this.LJLJI.LLD = "";
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
