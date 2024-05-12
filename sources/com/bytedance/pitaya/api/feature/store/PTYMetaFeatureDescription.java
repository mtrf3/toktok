package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class PTYMetaFeatureDescription implements ReflectionCall {
    public final String eventField;
    public final String eventFilter;
    public final String eventName;
    public final String featureName;
    public final int type;

    public String getEventField() {
        return this.eventField;
    }

    public String getEventFilter() {
        return this.eventFilter;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public int getType() {
        return this.type;
    }

    public PTYMetaFeatureDescription(String featureName, String str, String str2, String str3, int i) {
        o.LJIIJ(featureName, "featureName");
        this.featureName = featureName;
        this.eventName = str;
        this.eventFilter = str2;
        this.eventField = str3;
        this.type = i;
    }

    public /* synthetic */ PTYMetaFeatureDescription(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) == 0 ? str4 : null, i);
    }
}
