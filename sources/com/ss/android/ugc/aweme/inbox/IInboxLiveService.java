package com.ss.android.ugc.aweme.inbox;

import X.AbstractC54715Ldf;
import X.C53882LCs;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import java.util.List;

/* loaded from: classes10.dex */
public interface IInboxLiveService {
    void callPauseAnimation(RecyclerView.ViewHolder viewHolder);

    void callResumeAnimation(RecyclerView.ViewHolder viewHolder);

    void endSyncController();

    Class<? extends PowerCell<? extends AbstractC54715Ldf>>[] getLiveCells();

    C53882LCs getSyncController();

    void initSyncController();

    AbstractC54715Ldf mapLiveItem(InboxLiveNotice inboxLiveNotice, boolean z, int i);

    List<AbstractC54715Ldf> mapLiveItems(List<InboxLiveNotice> list, boolean z, boolean z2);

    void pauseSyncController();

    void recordRoomInfoList(List<InboxLiveNotice> list);

    void resumeSyncController();

    void setInboxSkyLightUseBiggerAvatar(boolean z);

    void watchLive(Context context, InboxLiveNotice inboxLiveNotice, int i, String str);
}
