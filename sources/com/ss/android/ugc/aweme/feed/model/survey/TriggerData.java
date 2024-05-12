package com.ss.android.ugc.aweme.feed.model.survey;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TriggerData extends F9E {

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("ratio")
    public float ratio;

    public TriggerData() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ TriggerData copy$default(TriggerData triggerData, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = triggerData.action;
        }
        if ((i2 & 2) != 0) {
            f = triggerData.ratio;
        }
        return triggerData.copy(i, f);
    }

    public final TriggerData copy(int i, float f) {
        return new TriggerData(i, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.action), Float.valueOf(this.ratio)};
    }

    public TriggerData(int i, float f) {
        this.action = i;
        this.ratio = f;
    }

    public /* synthetic */ TriggerData(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 1.0f : f);
    }
}
