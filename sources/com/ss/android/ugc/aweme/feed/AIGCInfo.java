package com.ss.android.ugc.aweme.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AIGCInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("aigc_label_type")
    public int AIGCLabelType;

    public AIGCInfo() {
        this(0, 1, null);
    }

    public static /* synthetic */ AIGCInfo copy$default(AIGCInfo aIGCInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aIGCInfo.AIGCLabelType;
        }
        return aIGCInfo.copy(i);
    }

    public final AIGCInfo copy(int i) {
        return new AIGCInfo(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.AIGCLabelType)};
    }

    public final int getAIGCLabelType() {
        return this.AIGCLabelType;
    }

    public AIGCInfo(int i) {
        this.AIGCLabelType = i;
    }

    public final void setAIGCLabelType(int i) {
        this.AIGCLabelType = i;
    }

    public /* synthetic */ AIGCInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
