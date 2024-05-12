package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchComponentTypeInfo extends F9E {
    public long duration;
    public boolean isReported;
    public ComponentTypeResult result;
    public String startShowTime;

    public static /* synthetic */ MatchComponentTypeInfo copy$default(MatchComponentTypeInfo matchComponentTypeInfo, String str, long j, ComponentTypeResult componentTypeResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchComponentTypeInfo.startShowTime;
        }
        if ((i & 2) != 0) {
            j = matchComponentTypeInfo.duration;
        }
        if ((i & 4) != 0) {
            componentTypeResult = matchComponentTypeInfo.result;
        }
        if ((i & 8) != 0) {
            z = matchComponentTypeInfo.isReported;
        }
        return matchComponentTypeInfo.copy(str, j, componentTypeResult, z);
    }

    public final MatchComponentTypeInfo copy(String startShowTime, long j, ComponentTypeResult result, boolean z) {
        o.LJIIIZ(startShowTime, "startShowTime");
        o.LJIIIZ(result, "result");
        return new MatchComponentTypeInfo(startShowTime, j, result, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.startShowTime, Long.valueOf(this.duration), this.result, Boolean.valueOf(this.isReported)};
    }

    public final long getDuration() {
        return this.duration;
    }

    public final ComponentTypeResult getResult() {
        return this.result;
    }

    public final String getStartShowTime() {
        return this.startShowTime;
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setReported(boolean z) {
        this.isReported = z;
    }

    public final void setResult(ComponentTypeResult componentTypeResult) {
        o.LJIIIZ(componentTypeResult, "<set-?>");
        this.result = componentTypeResult;
    }

    public final void setStartShowTime(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.startShowTime = str;
    }

    public MatchComponentTypeInfo(String startShowTime, long j, ComponentTypeResult result, boolean z) {
        o.LJIIIZ(startShowTime, "startShowTime");
        o.LJIIIZ(result, "result");
        this.startShowTime = startShowTime;
        this.duration = j;
        this.result = result;
        this.isReported = z;
    }
}
