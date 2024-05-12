package com.ss.android.ugc.aweme.dsp.playerservice.entity;

import X.InterfaceC65349Pkn;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes22.dex */
public final class DspExpiredPlayableRecord {

    @InterfaceC65349Pkn("limited_notification_pushed")
    public boolean limitedNotificationPushed;

    @InterfaceC65349Pkn("shuffle_toast_count")
    public int shuffleToastCount;

    @InterfaceC65349Pkn("expired_playable")
    public CopyOnWriteArraySet<String> expiredPlayable = new CopyOnWriteArraySet<>();

    @InterfaceC65349Pkn("expired_full_clip_ids")
    public CopyOnWriteArraySet<String> expiredFullClipIds = new CopyOnWriteArraySet<>();

    @InterfaceC65349Pkn("expired_preview_clip_ids")
    public CopyOnWriteArraySet<String> expiredPreviewClipIds = new CopyOnWriteArraySet<>();

    @InterfaceC65349Pkn("current_date")
    public final long currentDate = System.currentTimeMillis();

    @InterfaceC65349Pkn("last_expired_playable_id")
    public String lastExpiredPlayableId = "";
}
