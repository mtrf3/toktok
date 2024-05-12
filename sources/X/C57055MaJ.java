package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.notification.model.LikeListModel;
import java.util.List;

/* renamed from: X.MaJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57055MaJ extends C8BR<LikeListModel, InterfaceC223218pR<DiggInfo>> implements InterfaceC57085Man {
    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((LikeListModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).showLoadMoreLoading();
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).LJII();
            }
        }
    }

    @Override // X.InterfaceC57085Man
    public final void LJIIJJI() {
        LikeListModel likeListModel = (LikeListModel) this.LJLIL;
        if (likeListModel != null) {
            likeListModel.loadMore();
        }
        LJII();
    }

    @Override // X.InterfaceC57085Man
    public final int LJIIZILJ() {
        LikeListResponse likeListResponse;
        T t = this.LJLIL;
        if (t != 0 && (likeListResponse = (LikeListResponse) t.getData()) != null) {
            return likeListResponse.LJLIL;
        }
        return 0;
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        LikeListResponse likeListResponse;
        LikeListResponse likeListResponse2;
        List<DiggInfo> list;
        T t = this.LJLIL;
        boolean z = false;
        if (t != 0 && this.LJLILLLLZI != 0) {
            LikeListModel likeListModel = (LikeListModel) t;
            if (likeListModel.isLoadMore) {
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI;
                List<DiggInfo> list2 = likeListModel.getData().diggInfos;
                T t2 = this.LJLIL;
                if (t2 != 0 && (likeListResponse2 = (LikeListResponse) t2.getData()) != null && likeListResponse2.hasMore == 1 && (list = ((LikeListResponse) this.LJLIL.getData()).diggInfos) != null && !list.isEmpty()) {
                    z = true;
                }
                interfaceC223218pR.j0(list2, z);
                return;
            }
            List<DiggInfo> list3 = likeListModel.getData().diggInfos;
            if (list3 == null || list3.isEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                return;
            }
            InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
            List<DiggInfo> list4 = ((LikeListResponse) this.LJLIL.getData()).diggInfos;
            T t3 = this.LJLIL;
            if (t3 != 0 && (likeListResponse = (LikeListResponse) t3.getData()) != null && likeListResponse.hasMore == 1) {
                z = true;
            }
            interfaceC223218pR2.J5(list4, z);
        }
    }

    @Override // X.InterfaceC57085Man
    public final void refresh() {
        LikeListModel likeListModel = (LikeListModel) this.LJLIL;
        if (likeListModel != null) {
            likeListModel.refresh();
        }
        LJII();
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((LikeListModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).nc(exc);
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).cb0(exc);
            }
        }
    }
}
