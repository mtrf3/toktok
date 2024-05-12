package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* loaded from: classes14.dex */
public enum ComponentTypeResult {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    SUCCESS("success"),
    SEI("sei"),
    SHOW("show");

    public final String value;

    public static ComponentTypeResult valueOf(String str) {
        return (ComponentTypeResult) V0N.LJJJ(ComponentTypeResult.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    ComponentTypeResult(String str) {
        this.value = str;
    }
}
