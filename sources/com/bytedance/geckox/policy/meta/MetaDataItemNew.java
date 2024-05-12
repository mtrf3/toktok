package com.bytedance.geckox.policy.meta;

import X.C61514OCg;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class MetaDataItemNew implements Serializable {
    public static final C61514OCg Companion = new C61514OCg();
    public static final long serialVersionUID = 2;
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

    public MetaDataItemNew(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }

    public /* synthetic */ MetaDataItemNew(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? true : z);
    }
}
