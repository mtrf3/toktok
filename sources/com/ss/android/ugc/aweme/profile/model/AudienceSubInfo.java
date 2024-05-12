package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AudienceSubInfo implements Serializable {
    public static final SubStatus SubStatus = new SubStatus();

    @InterfaceC65349Pkn("sub_status")
    public final int subStatus;

    /* loaded from: classes8.dex */
    public static final class SubStatus {
        public /* synthetic */ SubStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public SubStatus() {
        }
    }

    public final int getSubStatus() {
        return this.subStatus;
    }

    public AudienceSubInfo(int i) {
        this.subStatus = i;
    }
}
