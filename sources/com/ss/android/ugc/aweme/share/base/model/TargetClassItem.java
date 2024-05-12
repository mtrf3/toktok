package com.ss.android.ugc.aweme.share.base.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TargetClassItem extends F9E {

    @InterfaceC65349Pkn("share_mode")
    public final int shareMode;

    @InterfaceC65349Pkn("target_class_name")
    public final String targetClassName;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.targetClassName, Integer.valueOf(this.shareMode)};
    }

    public TargetClassItem(String targetClassName, int i) {
        o.LJIIIZ(targetClassName, "targetClassName");
        this.targetClassName = targetClassName;
        this.shareMode = i;
    }

    public /* synthetic */ TargetClassItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i);
    }
}
