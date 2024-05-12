package com.bytedance.android.live_settings;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.gson.j;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSettingModel {

    @InterfaceC65349Pkn("businessScope")
    public ScopeValue businessScope;

    @InterfaceC65349Pkn("cacheLevel")
    public CacheLevel cacheLevel;

    @InterfaceC65349Pkn("cacheNoUpdate")
    public boolean cacheNoUpdate;

    @InterfaceC65349Pkn("className")
    public final String className;
    public Class<?> defaultCustomClass;

    @InterfaceC65349Pkn("defaultValue")
    public final j defaultValue;

    @InterfaceC65349Pkn("fieldTypeName")
    public final String fieldTypeName;

    @InterfaceC65349Pkn("groups")
    public List<Group> groups;

    @InterfaceC65349Pkn("owner")
    public String owner;

    @InterfaceC65349Pkn("preciseExperiment")
    public boolean preciseExperiment;

    @InterfaceC65349Pkn("settingsKey")
    public final String settingsKey;

    public final boolean getDefaultBoolean() {
        try {
            j jVar = this.defaultValue;
            if (jVar != null) {
                return jVar.LJFF();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final float getDefaultFloat() {
        try {
            j jVar = this.defaultValue;
            if (jVar != null) {
                return jVar.LJIIJ();
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final int getDefaultInt() {
        try {
            j jVar = this.defaultValue;
            if (jVar != null) {
                return jVar.LJIILJJIL();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final double getDefaultDouble() {
        try {
            j jVar = this.defaultValue;
            return jVar != null ? jVar.LJIIIZ() : LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } catch (Exception unused) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
    }

    public final long getDefaultLong() {
        try {
            j jVar = this.defaultValue;
            if (jVar != null) {
                return jVar.LJIJJLI();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final String getDefaultString() {
        String str;
        try {
            j jVar = this.defaultValue;
            if (jVar != null) {
                str = jVar.LJJIFFI();
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public int hashCode() {
        return this.settingsKey.hashCode();
    }

    public final ScopeValue getBusinessScope() {
        return this.businessScope;
    }

    public final CacheLevel getCacheLevel() {
        return this.cacheLevel;
    }

    public final boolean getCacheNoUpdate() {
        return this.cacheNoUpdate;
    }

    public final String getClassName() {
        return this.className;
    }

    public final Class<?> getDefaultCustomClass() {
        return this.defaultCustomClass;
    }

    public final j getDefaultValue() {
        return this.defaultValue;
    }

    public final String getFieldTypeName() {
        return this.fieldTypeName;
    }

    public final List<Group> getGroups() {
        return this.groups;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final boolean getPreciseExperiment() {
        return this.preciseExperiment;
    }

    public final String getSettingsKey() {
        return this.settingsKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(LiveSettingModel.class, obj.getClass())) {
            return false;
        }
        return o.LJ(this.settingsKey, ((LiveSettingModel) obj).settingsKey);
    }

    public final void setBusinessScope(ScopeValue scopeValue) {
        o.LJIIIZ(scopeValue, "<set-?>");
        this.businessScope = scopeValue;
    }

    public final void setCacheLevel(CacheLevel cacheLevel) {
        o.LJIIIZ(cacheLevel, "<set-?>");
        this.cacheLevel = cacheLevel;
    }

    public final void setCacheNoUpdate(boolean z) {
        this.cacheNoUpdate = z;
    }

    public final void setDefaultCustomClass(Class<?> cls) {
        this.defaultCustomClass = cls;
    }

    public final void setGroups(List<Group> list) {
        o.LJIIIZ(list, "<set-?>");
        this.groups = list;
    }

    public final void setOwner(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.owner = str;
    }

    public final void setPreciseExperiment(boolean z) {
        this.preciseExperiment = z;
    }

    public LiveSettingModel(String str, String fieldTypeName, String settingsKey, j jVar) {
        o.LJIIIZ(fieldTypeName, "fieldTypeName");
        o.LJIIIZ(settingsKey, "settingsKey");
        this.className = str;
        this.fieldTypeName = fieldTypeName;
        this.settingsKey = settingsKey;
        this.defaultValue = jVar;
        this.businessScope = ScopeValue.OTHER;
        this.owner = "";
        this.groups = C61878OQg.INSTANCE;
        this.cacheLevel = CacheLevel.DID;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveSettingModel(String str, ScopeValue businessScope, String fieldTypeName, String settingsKey, j jVar, String owner, List<Group> groups) {
        this(str, fieldTypeName, settingsKey, jVar);
        o.LJIIIZ(businessScope, "businessScope");
        o.LJIIIZ(fieldTypeName, "fieldTypeName");
        o.LJIIIZ(settingsKey, "settingsKey");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(groups, "groups");
        this.businessScope = businessScope;
        this.owner = owner;
        this.groups = groups;
    }
}
