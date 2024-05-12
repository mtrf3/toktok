package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LiveScrollConfig {

    @InterfaceC65349Pkn("min_distance_for_fling")
    public float minDistanceForFling;

    @InterfaceC65349Pkn("min_fling_velocity")
    public int minFlingVelocity;

    @InterfaceC65349Pkn("turn_page_value")
    public float turnPageValue;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveScrollConfig() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.live.model.LiveScrollConfig.<init>():void");
    }

    public final float getMinDistanceForFling() {
        return this.minDistanceForFling;
    }

    public final int getMinFlingVelocity() {
        return this.minFlingVelocity;
    }

    public final float getTurnPageValue() {
        return this.turnPageValue;
    }

    public final void setMinDistanceForFling(float f) {
        this.minDistanceForFling = f;
    }

    public final void setMinFlingVelocity(int i) {
        this.minFlingVelocity = i;
    }

    public final void setTurnPageValue(float f) {
        this.turnPageValue = f;
    }

    public LiveScrollConfig(float f, int i, float f2) {
        this.minDistanceForFling = f;
        this.minFlingVelocity = i;
        this.turnPageValue = f2;
    }

    public /* synthetic */ LiveScrollConfig(float f, int i, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 25.0f : f, (i2 & 2) != 0 ? LiveChatShowDelayForHotLiveSetting.DEFAULT : i, (i2 & 4) != 0 ? 0.4f : f2);
    }
}
