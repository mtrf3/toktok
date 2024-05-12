package com.bytedance.pitaya.api.feature.store;

import X.VF2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PTYFeatureDescription extends PTYMetaFeatureDescription {
    public static final VF2 Companion = new VF2();
    public final int divideTimeType;
    public final boolean dump;
    public final String endSessionEvent;
    public final String eventField;
    public final String eventFilter;
    public final String eventName;
    public final String featureName;
    public final int featureSource;
    public final int maxCacheCount;
    public final String startSessionEvent;
    public final List<PTYMetaFeatureDescription> subFeatures;
    public final int type;

    public final int getDivideTimeType() {
        return this.divideTimeType;
    }

    public final boolean getDump() {
        return this.dump;
    }

    public final String getEndSessionEvent() {
        return this.endSessionEvent;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventField() {
        return this.eventField;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventFilter() {
        return this.eventFilter;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getFeatureName() {
        return this.featureName;
    }

    public final int getFeatureSource() {
        return this.featureSource;
    }

    public final int getMaxCacheCount() {
        return this.maxCacheCount;
    }

    public final String getStartSessionEvent() {
        return this.startSessionEvent;
    }

    public final List<PTYMetaFeatureDescription> getSubFeatures() {
        return this.subFeatures;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public int getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTYFeatureDescription(String featureName, String str, String str2, String str3, int i, int i2, boolean z, int i3, int i4, List<PTYMetaFeatureDescription> subFeatures, String str4, String str5) {
        super(featureName, str, str2, str3, i);
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(subFeatures, "subFeatures");
        this.featureName = featureName;
        this.eventName = str;
        this.eventFilter = str2;
        this.eventField = str3;
        this.type = i;
        this.featureSource = i2;
        this.dump = z;
        this.maxCacheCount = i3;
        this.divideTimeType = i4;
        this.subFeatures = subFeatures;
        this.startSessionEvent = str4;
        this.endSessionEvent = str5;
    }

    public /* synthetic */ PTYFeatureDescription(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, int i4, List list, String str5, String str6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? null : str4, i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 999 : i4, (i5 & 512) != 0 ? new ArrayList() : list, (i5 & 1024) != 0 ? null : str5, (i5 & 2048) == 0 ? str6 : null);
    }
}
