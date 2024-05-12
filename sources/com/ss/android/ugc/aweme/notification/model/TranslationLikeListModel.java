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
import com.ss.android.ugc.aweme.notification.bean.TranslationLikeListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TranslationLikeListModel extends C8BS<TranslationLikeListResponse> {
    public boolean isLoadMore;
    public final String itemId;
    public final long lastReadTimestamp;
    public final String subtitleId;

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public final void loadMore() {
        long j;
        this.isLoadMore = true;
        TranslationLikeListResponse data = getData();
        long j2 = 0;
        if (data != null) {
            j = data.nextOffset;
        } else {
            j = 0;
        }
        TranslationLikeListResponse data2 = getData();
        if (data2 != null) {
            j2 = data2.maxCursor;
        }
        fetchTranslationLikeList(j, j2);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchTranslationLikeList$default(this, 0L, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public void handleData(TranslationLikeListResponse translationLikeListResponse) {
        int i;
        if (translationLikeListResponse == 0) {
            this.mData = null;
            return;
        }
        List<User> list = translationLikeListResponse.users;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            translationLikeListResponse.hasMore = 0;
        } else {
            List<User> list2 = translationLikeListResponse.users;
            if (list2 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (User user : list2) {
                    if (hashSet.add(user.getUid())) {
                        arrayList.add(user);
                    }
                }
                list2 = ORZ.LLJILJILJ(arrayList);
            }
            translationLikeListResponse.users = list2;
            if (this.lastReadTimestamp <= 0 || list2 == null || list2.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (User user2 : list2) {
                    List<User> list3 = ((TranslationLikeListResponse) this.mData).users;
                    if (list3 != null) {
                        Iterator<User> it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            User next = it.next();
                            if (o.LJ(user2.getUid(), next.getUid())) {
                                if (next != null) {
                                    continue;
                                }
                            }
                        }
                    }
                    i++;
                    if (i < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            TranslationLikeListResponse translationLikeListResponse2 = (TranslationLikeListResponse) this.mData;
            if (translationLikeListResponse2 != null) {
                i2 = translationLikeListResponse2.LJLIL;
            }
            translationLikeListResponse.LJLIL = i2 + i;
        }
        this.mData = translationLikeListResponse;
    }

    private final void fetchTranslationLikeList(long j, long j2) {
        NoticeApiManager.LIZJ(this.subtitleId, this.itemId, j, j2).LJ(new C10I() { // from class: com.ss.android.ugc.aweme.notification.model.TranslationLikeListModel$fetchTranslationLikeList$1
            /* renamed from: then, reason: collision with other method in class */
            public final void m147then(C10K<TranslationLikeListResponse> c10k) {
                C57053MaH.LIZJ(c10k.LJIIJJI());
                if (c10k.LJIILJJIL()) {
                    List<C8BT> list = TranslationLikeListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<C8BT> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onFailed(c10k.LJIIJ());
                        }
                        return;
                    }
                    return;
                }
                TranslationLikeListModel.this.handleData(c10k.LJIIJJI());
                List<C8BT> list2 = TranslationLikeListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<C8BT> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess();
                    }
                }
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                m147then((C10K<TranslationLikeListResponse>) c10k);
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public TranslationLikeListModel(String subtitleId, String itemId, long j) {
        o.LJIIIZ(subtitleId, "subtitleId");
        o.LJIIIZ(itemId, "itemId");
        this.subtitleId = subtitleId;
        this.itemId = itemId;
        this.lastReadTimestamp = j;
    }

    public /* synthetic */ TranslationLikeListModel(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j);
    }

    public static /* synthetic */ void fetchTranslationLikeList$default(TranslationLikeListModel translationLikeListModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        translationLikeListModel.fetchTranslationLikeList(j, j2);
    }
}
