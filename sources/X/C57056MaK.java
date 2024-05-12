package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.model.AddYoursParticipantsModel;
import java.util.List;

/* renamed from: X.MaK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57056MaK extends C8BR<AddYoursParticipantsModel, InterfaceC223218pR<DiggInfo>> implements InterfaceC57085Man {
    @Override // X.InterfaceC57085Man
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((AddYoursParticipantsModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).showLoadMoreLoading();
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).LJII();
            }
        }
    }

    @Override // X.InterfaceC57085Man
    public final void LJIIJJI() {
        AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) this.LJLIL;
        if (addYoursParticipantsModel != null) {
            addYoursParticipantsModel.loadMore();
        }
        LJII();
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        List<DiggInfo> list;
        T t = this.LJLIL;
        boolean z = false;
        if (t != 0 && this.LJLILLLLZI != 0) {
            AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) t;
            if (addYoursParticipantsModel.isLoadMore) {
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI;
                List<DiggInfo> list2 = addYoursParticipantsModel.newList;
                if (((AddYoursParticipantsModel) t).hasMore && (list = ((AddYoursParticipantsModel) t).diggInfos) != null && !list.isEmpty()) {
                    z = true;
                }
                interfaceC223218pR.j0(list2, z);
                return;
            }
            List<DiggInfo> list3 = addYoursParticipantsModel.diggInfos;
            if (list3 == null || list3.isEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                return;
            }
            InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
            T t2 = this.LJLIL;
            interfaceC223218pR2.J5(((AddYoursParticipantsModel) t2).diggInfos, ((AddYoursParticipantsModel) t2).hasMore);
        }
    }

    @Override // X.InterfaceC57085Man
    public final void refresh() {
        AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) this.LJLIL;
        if (addYoursParticipantsModel != null) {
            addYoursParticipantsModel.refresh();
        }
        LJII();
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((AddYoursParticipantsModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).nc(exc);
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).cb0(exc);
            }
        }
    }
}
