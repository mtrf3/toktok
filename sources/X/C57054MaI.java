package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.notification.model.FavoriteUserListModel;
import java.util.List;

/* renamed from: X.MaI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57054MaI extends C8BR<FavoriteUserListModel, InterfaceC223218pR<DiggInfo>> implements InterfaceC57085Man {
    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((FavoriteUserListModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).showLoadMoreLoading();
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).LJII();
            }
        }
    }

    @Override // X.InterfaceC57085Man
    public final void LJIIJJI() {
        FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) this.LJLIL;
        if (favoriteUserListModel != null) {
            favoriteUserListModel.loadMore();
        }
        LJII();
    }

    @Override // X.InterfaceC57085Man
    public final int LJIIZILJ() {
        FavoriteListResponse favoriteListResponse;
        T t = this.LJLIL;
        if (t != 0 && (favoriteListResponse = (FavoriteListResponse) t.getData()) != null) {
            return favoriteListResponse.LJLIL;
        }
        return 0;
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        FavoriteListResponse favoriteListResponse;
        FavoriteListResponse favoriteListResponse2;
        List<DiggInfo> list;
        T t = this.LJLIL;
        boolean z = false;
        if (t != 0 && this.LJLILLLLZI != 0) {
            FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) t;
            if (favoriteUserListModel.isLoadMore) {
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI;
                List<DiggInfo> list2 = favoriteUserListModel.getData().diggInfos;
                T t2 = this.LJLIL;
                if (t2 != 0 && (favoriteListResponse2 = (FavoriteListResponse) t2.getData()) != null && favoriteListResponse2.hasMore == 1 && (list = ((FavoriteListResponse) this.LJLIL.getData()).diggInfos) != null && !list.isEmpty()) {
                    z = true;
                }
                interfaceC223218pR.j0(list2, z);
                return;
            }
            List<DiggInfo> list3 = favoriteUserListModel.getData().diggInfos;
            if (list3 == null || list3.isEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                return;
            }
            InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
            List<DiggInfo> list4 = ((FavoriteListResponse) this.LJLIL.getData()).diggInfos;
            T t3 = this.LJLIL;
            if (t3 != 0 && (favoriteListResponse = (FavoriteListResponse) t3.getData()) != null && favoriteListResponse.hasMore == 1) {
                z = true;
            }
            interfaceC223218pR2.J5(list4, z);
        }
    }

    @Override // X.InterfaceC57085Man
    public final void refresh() {
        FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) this.LJLIL;
        if (favoriteUserListModel != null) {
            favoriteUserListModel.refresh();
        }
        LJII();
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((FavoriteUserListModel) t).isLoadMore) {
                ((InterfaceC223218pR) this.LJLILLLLZI).nc(exc);
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).cb0(exc);
            }
        }
    }
}
