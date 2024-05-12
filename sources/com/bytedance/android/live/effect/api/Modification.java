package com.bytedance.android.live.effect.api;

import X.C16880lQ;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.WM7;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class Modification {

    @InterfaceC65349Pkn("effect_id")
    public long effectId;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("mode")
    public Long isDefaultValue;

    @InterfaceC65349Pkn("from")
    public Long isLiveTakeDefault;

    @InterfaceC65349Pkn("modification_type")
    public long modificationType;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("resource_id")
    public String resourceId;

    @InterfaceC65349Pkn("role")
    public long role;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("sub_effect_id")
    public Long subEffectId;

    @InterfaceC65349Pkn("sub_type")
    public long subType;

    @InterfaceC65349Pkn("tab")
    public String tab;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("value")
    public Float value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Modification)) {
            return false;
        }
        Modification modification = (Modification) obj;
        return this.effectId == modification.effectId && o.LJ(this.name, modification.name) && o.LJ(this.resourceId, modification.resourceId) && this.modificationType == modification.modificationType && o.LJ(this.startTime, modification.startTime) && o.LJ(this.endTime, modification.endTime) && this.role == modification.role && o.LJ(this.tab, modification.tab) && o.LJ(this.isDefaultValue, modification.isDefaultValue) && o.LJ(this.isLiveTakeDefault, modification.isLiveTakeDefault) && o.LJ(this.value, modification.value) && o.LJ(this.url, modification.url) && o.LJ(this.scene, modification.scene) && o.LJ(this.subEffectId, modification.subEffectId) && o.LJ(this.extra, modification.extra) && this.subType == modification.subType;
    }

    public final String toString() {
        return "Modification(effectId=" + this.effectId + ", name=" + this.name + ", resourceId=" + this.resourceId + ", modificationType=" + this.modificationType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", role=" + this.role + ", tab=" + this.tab + ", isDefaultValue=" + this.isDefaultValue + ", isLiveTakeDefault=" + this.isLiveTakeDefault + ", value=" + this.value + ", url=" + this.url + ", scene=" + this.scene + ", subEffectId=" + this.subEffectId + ", extra=" + this.extra + ", subType=" + this.subType + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LIZJ = JBR.LIZJ(this.modificationType, C79062V1e.LJ(this.resourceId, C79062V1e.LJ(this.name, C16880lQ.LLJIJIL(this.effectId) * 31, 31), 31), 31);
        Long l = this.startTime;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Long l2 = this.endTime;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.role, (i2 + hashCode2) * 31, 31);
        String str = this.tab;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = (LIZJ2 + hashCode3) * 31;
        Long l3 = this.isDefaultValue;
        if (l3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Long l4 = this.isLiveTakeDefault;
        if (l4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l4.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Float f = this.value;
        if (f == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str2 = this.url;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str3 = this.scene;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Long l5 = this.subEffectId;
        if (l5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l5.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str4 = this.extra;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return C16880lQ.LLJIJIL(this.subType) + ((i9 + i) * 31);
    }

    public static Modification LIZ(Modification modification) {
        long j = modification.effectId;
        String name = modification.name;
        String resourceId = modification.resourceId;
        long j2 = modification.modificationType;
        Long l = modification.startTime;
        Long l2 = modification.endTime;
        long j3 = modification.role;
        String str = modification.tab;
        Long l3 = modification.isDefaultValue;
        Long l4 = modification.isLiveTakeDefault;
        Float f = modification.value;
        String str2 = modification.url;
        String str3 = modification.scene;
        Long l5 = modification.subEffectId;
        String str4 = modification.extra;
        long j4 = modification.subType;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(resourceId, "resourceId");
        return new Modification(j, name, resourceId, j2, l, l2, j3, str, l3, l4, f, str2, str3, l5, str4, j4);
    }

    public Modification(long j, String name, String resourceId, long j2, Long l, Long l2, long j3, String str, Long l3, Long l4, Float f, String str2, String str3, Long l5, String str4, long j4) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(resourceId, "resourceId");
        this.effectId = j;
        this.name = name;
        this.resourceId = resourceId;
        this.modificationType = j2;
        this.startTime = l;
        this.endTime = l2;
        this.role = j3;
        this.tab = str;
        this.isDefaultValue = l3;
        this.isLiveTakeDefault = l4;
        this.value = f;
        this.url = str2;
        this.scene = str3;
        this.subEffectId = l5;
        this.extra = str4;
        this.subType = j4;
    }

    public /* synthetic */ Modification(long j, String str, String str2, long j2, Long l, Long l2, long j3, String str3, Long l3, Long l4, Float f, String str4, String str5, Long l5, String str6, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? 0L : j3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : l3, (i & 512) != 0 ? null : l4, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & FileUtils.BUFFER_SIZE) != 0 ? null : l5, (i & 16384) == 0 ? str6 : null, (i & 32768) != 0 ? 0L : j4);
    }
}
