package com.ss.android.ugc.aweme.notification.model;

import X.C10I;
import X.C10K;
import X.C47261Igj;
import X.C57053MaH;
import X.C76800UCe;
import X.C8BS;
import X.C8BT;
import X.ORZ;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FavoriteUserListModel extends C8BS<FavoriteListResponse> {
    public static final Companion Companion = new Companion();
    public final String awemeId;
    public boolean isLoadMore;
    public final long lastReadTimestamp;

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public final void loadMore() {
        long j;
        this.isLoadMore = true;
        FavoriteListResponse data = getData();
        if (data != null) {
            j = data.cursor;
        } else {
            j = 0;
        }
        fetchFavoriteUserListInNotice(j);
    }

    public final void refresh() {
        long j;
        this.isLoadMore = false;
        FavoriteListResponse data = getData();
        if (data != null) {
            j = data.cursor;
        } else {
            j = 0;
        }
        fetchFavoriteUserListInNotice(j);
    }

    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    private final void fetchFavoriteUserListInNotice(long j) {
        NoticeApiManager.LIZ(j, this.awemeId).LJ(new C10I() { // from class: com.ss.android.ugc.aweme.notification.model.FavoriteUserListModel$fetchFavoriteUserListInNotice$1
            /* renamed from: then, reason: collision with other method in class */
            public final void m144then(C10K<FavoriteListResponse> c10k) {
                C57053MaH.LIZJ(c10k.LJIIJJI());
                if (c10k.LJIILJJIL()) {
                    List<C8BT> list = FavoriteUserListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<C8BT> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onFailed(c10k.LJIIJ());
                        }
                        return;
                    }
                    return;
                }
                FavoriteUserListModel.this.handleData(c10k.LJIIJJI());
                List<C8BT> list2 = FavoriteUserListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<C8BT> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess();
                    }
                }
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                m144then((C10K<FavoriteListResponse>) c10k);
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public void handleData(FavoriteListResponse favoriteListResponse) {
        int i;
        String str;
        if (favoriteListResponse == 0) {
            this.mData = null;
            return;
        }
        List<DiggInfo> list = favoriteListResponse.diggInfos;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            favoriteListResponse.hasMore = 0;
        } else {
            List<DiggInfo> list2 = favoriteListResponse.diggInfos;
            if (list2 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (DiggInfo diggInfo : list2) {
                    User user = diggInfo.user;
                    if (user != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    if (hashSet.add(str)) {
                        arrayList.add(diggInfo);
                    }
                }
                list2 = ORZ.LLJILJILJ(arrayList);
            }
            favoriteListResponse.diggInfos = list2;
            if (this.lastReadTimestamp <= 0 || list2 == null || list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<DiggInfo> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().timestamp >= this.lastReadTimestamp && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            FavoriteListResponse favoriteListResponse2 = (FavoriteListResponse) this.mData;
            if (favoriteListResponse2 != null) {
                i2 = favoriteListResponse2.LJLIL;
            }
            favoriteListResponse.LJLIL = i2 + i;
        }
        this.mData = favoriteListResponse;
    }

    public FavoriteUserListModel(String awemeId, long j) {
        o.LJIIIZ(awemeId, "awemeId");
        this.awemeId = awemeId;
        this.lastReadTimestamp = j;
    }

    public /* synthetic */ FavoriteUserListModel(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ void fetchFavoriteUserListInNotice$default(FavoriteUserListModel favoriteUserListModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        favoriteUserListModel.fetchFavoriteUserListInNotice(j);
    }
}
