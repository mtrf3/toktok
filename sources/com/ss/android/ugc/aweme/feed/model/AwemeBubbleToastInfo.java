package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AwemeBubbleToastInfo extends F9E {

    @InterfaceC65349Pkn("toast_count")
    public final int toastCount;

    @InterfaceC65349Pkn("toast_type")
    public final String toastType;

    public static /* synthetic */ AwemeBubbleToastInfo copy$default(AwemeBubbleToastInfo awemeBubbleToastInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeBubbleToastInfo.toastType;
        }
        if ((i2 & 2) != 0) {
            i = awemeBubbleToastInfo.toastCount;
        }
        return awemeBubbleToastInfo.copy(str, i);
    }

    public final AwemeBubbleToastInfo copy(String toastType, int i) {
        o.LJIIIZ(toastType, "toastType");
        return new AwemeBubbleToastInfo(toastType, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.toastType, Integer.valueOf(this.toastCount)};
    }

    public AwemeBubbleToastInfo(String toastType, int i) {
        o.LJIIIZ(toastType, "toastType");
        this.toastType = toastType;
        this.toastCount = i;
    }
}
