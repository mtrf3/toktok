package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdButtonReshowStrategyModel implements Serializable {

    @InterfaceC65349Pkn("animation_type")
    public int animationType;

    @InterfaceC65349Pkn("show_button_color_seconds")
    public int showColorSeconds;

    @InterfaceC65349Pkn("show_button_seconds")
    public int showSeconds;

    @InterfaceC65349Pkn("trigger_condition")
    public int triggerCondition;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdButtonReshowStrategyModel() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdButtonReshowStrategyModel.<init>():void");
    }

    public final int getAnimationType() {
        return this.animationType;
    }

    public final int getShowColorSeconds() {
        return this.showColorSeconds;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getTriggerCondition() {
        return this.triggerCondition;
    }

    public final void setAnimationType(int i) {
        this.animationType = i;
    }

    public final void setShowColorSeconds(int i) {
        this.showColorSeconds = i;
    }

    public final void setShowSeconds(int i) {
        this.showSeconds = i;
    }

    public final void setTriggerCondition(int i) {
        this.triggerCondition = i;
    }

    public AdButtonReshowStrategyModel(int i, int i2, int i3, int i4) {
        this.triggerCondition = i;
        this.animationType = i2;
        this.showSeconds = i3;
        this.showColorSeconds = i4;
    }

    public /* synthetic */ AdButtonReshowStrategyModel(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
