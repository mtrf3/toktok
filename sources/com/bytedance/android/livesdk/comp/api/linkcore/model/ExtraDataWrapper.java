package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.model.message.LinkMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ExtraDataWrapper {
    public final Object content;
    public final long expireTime;
    public final Extra extraData;
    public final LinkMessage linkMessage;

    public final Object getContent() {
        return this.content;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final Extra getExtraData() {
        return this.extraData;
    }

    public final LinkMessage getLinkMessage() {
        return this.linkMessage;
    }

    public ExtraDataWrapper(Extra extra, Object obj, long j, LinkMessage linkMessage) {
        o.LJIIIZ(linkMessage, "linkMessage");
        this.extraData = extra;
        this.content = obj;
        this.expireTime = j;
        this.linkMessage = linkMessage;
    }

    public /* synthetic */ ExtraDataWrapper(Extra extra, Object obj, long j, LinkMessage linkMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(extra, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? 0L : j, linkMessage);
    }
}
