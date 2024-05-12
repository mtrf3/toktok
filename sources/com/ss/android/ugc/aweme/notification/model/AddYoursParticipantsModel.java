package com.ss.android.ugc.aweme.notification.model;

import X.C221118m3;
import X.C32I;
import X.C5H3;
import X.C8BS;
import X.FGR;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AddYoursParticipantsModel extends C8BS<AddYoursNoticeVideosResp> {
    public long cursor;
    public boolean hasMore;
    public boolean isLoadMore;
    public List<DiggInfo> newList;
    public final String passThrough;
    public final Long topicId;
    public final C5H3 aySvc$delegate = C221118m3.LIZ(AddYoursParticipantsModel$aySvc$2.INSTANCE);
    public final List<DiggInfo> diggInfos = new ArrayList();

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public final void loadMore() {
        this.isLoadMore = true;
        fetchFavoriteUserListInNotice(this.cursor);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchFavoriteUserListInNotice$default(this, 0L, 1, null);
    }

    public final IAddYoursService getAySvc() {
        return (IAddYoursService) this.aySvc$delegate.getValue();
    }

    private final List<DiggInfo> diggInfo(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(diggInfo(it.next()));
            }
            return arrayList;
        }
        return null;
    }

    private final void fetchFavoriteUserListInNotice(final long j) {
        Long l = this.topicId;
        if (l != null) {
            final long longValue = l.longValue();
            FGR.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: com.ss.android.ugc.aweme.notification.model.AddYoursParticipantsModel$fetchFavoriteUserListInNotice$1$1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    IAddYoursService aySvc = AddYoursParticipantsModel.this.getAySvc();
                    o.LJIIIIZZ(aySvc, "aySvc");
                    return aySvc.LJIILJJIL(20, longValue, j, AddYoursParticipantsModel.this.passThrough);
                }
            }, 0);
        }
    }

    @Override // X.C8BS
    public void handleData(AddYoursNoticeVideosResp addYoursNoticeVideosResp) {
        boolean z;
        super.handleData((AddYoursParticipantsModel) addYoursNoticeVideosResp);
        if (addYoursNoticeVideosResp == null) {
            return;
        }
        this.newList = diggInfo(addYoursNoticeVideosResp.videos);
        Boolean bool = addYoursNoticeVideosResp.hasMore;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.hasMore = z;
        if (addYoursNoticeVideosResp.cursor != null) {
            this.cursor = r0.intValue();
        }
        if (!this.isLoadMore) {
            this.diggInfos.clear();
        }
        List<DiggInfo> list = this.newList;
        if (list != null) {
            this.diggInfos.addAll(list);
        }
    }

    private final DiggInfo diggInfo(Aweme aweme) {
        DiggInfo diggInfo = new DiggInfo();
        diggInfo.user = aweme.getAuthor();
        diggInfo.aweme = aweme;
        return diggInfo;
    }

    public AddYoursParticipantsModel(Long l, String str) {
        this.topicId = l;
        this.passThrough = str;
    }

    public static /* synthetic */ void fetchFavoriteUserListInNotice$default(AddYoursParticipantsModel addYoursParticipantsModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        addYoursParticipantsModel.fetchFavoriteUserListInNotice(j);
    }
}
