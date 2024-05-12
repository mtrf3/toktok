package com.ss.android.ugc.aweme.notification.model;

import X.C10I;
import X.C10K;
import X.C47261Igj;
import X.C53010KrG;
import X.C57053MaH;
import X.C76800UCe;
import X.C8BS;
import X.C8BT;
import X.L61;
import X.L6F;
import X.ORZ;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LikeListModel extends C8BS<LikeListResponse> {
    public static final Companion Companion = new Companion();
    public final int diggType;
    public boolean isLoadMore;
    public final boolean isNew;
    public final long lastReadTimestamp;
    public final HashSet<String> mLoadedIds;
    public final String refId;

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public final void loadMore() {
        long j;
        this.isLoadMore = true;
        LikeListResponse data = getData();
        long j2 = 0;
        if (data != null) {
            j = data.maxCursor;
        } else {
            j = 0;
        }
        LikeListResponse data2 = getData();
        if (data2 != null) {
            j2 = data2.minCursor;
        }
        fetchLikeList(j, j2);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchLikeList$default(this, 0L, 0L, 3, null);
    }

    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public void handleData(LikeListResponse likeListResponse) {
        int i;
        String str;
        if (likeListResponse == 0) {
            this.mData = null;
            return;
        }
        List<DiggInfo> list = likeListResponse.diggInfos;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            likeListResponse.hasMore = 0;
        } else {
            List<DiggInfo> list2 = likeListResponse.diggInfos;
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
            likeListResponse.diggInfos = list2;
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
            LikeListResponse likeListResponse2 = (LikeListResponse) this.mData;
            if (likeListResponse2 != null) {
                i2 = likeListResponse2.LJLIL;
            }
            likeListResponse.LJLIL = i2 + i;
        }
        this.mData = likeListResponse;
        L6F.LIZIZ.LIZLLL(L61.STORY, null, likeListResponse.diggInfos, LikeListModel$handleData$3.INSTANCE);
    }

    private final void fetchLikeList(long j, long j2) {
        int i;
        int intValue = ((Number) C53010KrG.LIZ.getValue()).intValue();
        if (2 <= intValue && intValue < 4) {
            i = 1;
        } else {
            i = 0;
        }
        NoticeApiManager.LIZIZ(j, j2, this.isNew, this.diggType, this.refId, i).LJ(new C10I() { // from class: com.ss.android.ugc.aweme.notification.model.LikeListModel$fetchLikeList$1
            /* renamed from: then, reason: collision with other method in class */
            public final void m145then(C10K<LikeListResponse> c10k) {
                C57053MaH.LIZJ(c10k.LJIIJJI());
                if (c10k.LJIILJJIL()) {
                    List<C8BT> list = LikeListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<C8BT> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onFailed(c10k.LJIIJ());
                        }
                        return;
                    }
                    return;
                }
                LikeListModel.this.handleData(c10k.LJIIJJI());
                List<C8BT> list2 = LikeListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<C8BT> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess();
                    }
                }
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                m145then((C10K<LikeListResponse>) c10k);
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public LikeListModel(String refId, boolean z, int i, long j) {
        o.LJIIIZ(refId, "refId");
        this.refId = refId;
        this.isNew = z;
        this.diggType = i;
        this.lastReadTimestamp = j;
        this.mLoadedIds = new HashSet<>();
    }

    public static /* synthetic */ void fetchLikeList$default(LikeListModel likeListModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        likeListModel.fetchLikeList(j, j2);
    }

    public /* synthetic */ LikeListModel(String str, boolean z, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? 0L : j);
    }
}
