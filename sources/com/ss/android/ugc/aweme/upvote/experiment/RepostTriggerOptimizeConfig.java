package com.ss.android.ugc.aweme.upvote.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RepostTriggerOptimizeConfig extends F9E {

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("guide_repost_limits")
    public final int shareOrCommentLimits;

    @InterfaceC65349Pkn("guide_repost_when_looped_limits")
    public final int videoLoopLimits;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RepostTriggerOptimizeConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.experiment.RepostTriggerOptimizeConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.videoLoopLimits), Integer.valueOf(this.shareOrCommentLimits)};
    }

    public RepostTriggerOptimizeConfig(int i, int i2, int i3) {
        this.group = i;
        this.videoLoopLimits = i2;
        this.shareOrCommentLimits = i3;
    }

    public /* synthetic */ RepostTriggerOptimizeConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
