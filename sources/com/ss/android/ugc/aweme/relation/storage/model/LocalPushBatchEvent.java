package com.ss.android.ugc.aweme.relation.storage.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocalPushBatchEvent {

    @InterfaceC65349Pkn("events")
    public final List<LocalPushRawEvent> events;

    public LocalPushBatchEvent(List<LocalPushRawEvent> list) {
        this.events = list;
    }
}
