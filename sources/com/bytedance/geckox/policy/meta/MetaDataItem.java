package com.bytedance.geckox.policy.meta;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class MetaDataItem implements Serializable {
    public boolean allowUpdate;
    public long lastReadTimeStamp;

    public final boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    public final long getLastReadTimeStamp() {
        return this.lastReadTimeStamp;
    }

    public final void setAllowUpdate(boolean z) {
        this.allowUpdate = z;
    }

    public final void setLastReadTimeStamp(long j) {
        this.lastReadTimeStamp = j;
    }

    public MetaDataItem(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }

    public /* synthetic */ MetaDataItem(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? true : z);
    }
}
