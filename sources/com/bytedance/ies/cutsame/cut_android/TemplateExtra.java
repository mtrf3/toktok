package com.bytedance.ies.cutsame.cut_android;

import X.C47959Irz;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TemplateExtra {

    @InterfaceC65349Pkn("alignmode")
    public final String alignMode;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("featurebits")
    public final List<Long> featureBits;

    @InterfaceC65349Pkn("features")
    public final String featureList;

    @InterfaceC65349Pkn("ratio")
    public final float ratio;

    @InterfaceC65349Pkn("slots")
    public final String slots;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateExtra)) {
            return false;
        }
        TemplateExtra templateExtra = (TemplateExtra) obj;
        return o.LJ(this.alignMode, templateExtra.alignMode) && this.duration == templateExtra.duration && o.LJ(this.featureBits, templateExtra.featureBits) && o.LJ(this.featureList, templateExtra.featureList) && o.LJ(Float.valueOf(this.ratio), Float.valueOf(templateExtra.ratio)) && o.LJ(this.slots, templateExtra.slots);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.duration, this.alignMode.hashCode() * 31, 31);
        List<Long> list = this.featureBits;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.slots.hashCode() + C47959Irz.LIZIZ(this.ratio, C79062V1e.LJ(this.featureList, (LIZJ + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateExtra(alignMode=");
        LIZ.append(this.alignMode);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", featureBits=");
        LIZ.append(this.featureBits);
        LIZ.append(", featureList=");
        LIZ.append(this.featureList);
        LIZ.append(", ratio=");
        LIZ.append(this.ratio);
        LIZ.append(", slots=");
        return q.LIZIZ(LIZ, this.slots, ')', LIZ);
    }

    public TemplateExtra(String str, long j, List<Long> list, String str2, float f, String str3) {
        HH1.LIZ(str, "alignMode", str2, "featureList", str3, "slots");
        this.alignMode = str;
        this.duration = j;
        this.featureBits = list;
        this.featureList = str2;
        this.ratio = f;
        this.slots = str3;
    }

    public /* synthetic */ TemplateExtra(String str, long j, List list, String str2, float f, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "align_canvas" : str, (i & 2) != 0 ? 0L : j, list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0.0f : f, (i & 32) == 0 ? str3 : "");
    }
}
