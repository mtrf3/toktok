package com.bytedance.android.livesdk.livesetting.comment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class InputDialogFixSettingModel {

    @InterfaceC65349Pkn("delayTime")
    public long delayTime;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    public InputDialogFixSettingModel() {
        this(false, 0L, 3, null);
    }

    public InputDialogFixSettingModel(boolean z, long j) {
        this.enable = z;
        this.delayTime = j;
    }

    public /* synthetic */ InputDialogFixSettingModel(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
