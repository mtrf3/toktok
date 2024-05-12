package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C116104h4;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightData implements Serializable {
    public static final C116104h4 Companion = new Object() { // from class: X.4h4
    };

    @InterfaceC65349Pkn("biz_type")
    public final int bizType;

    @InterfaceC65349Pkn("biz_data")
    public final CustomBizData customBizData;

    @InterfaceC65349Pkn("priority")
    public final int priority;
    public final int subPriority;

    @InterfaceC65349Pkn("template")
    public final TemplateData templateData;

    @InterfaceC65349Pkn("user_id")
    public final Long uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SkylightData() {
        /*
            r9 = this;
            r1 = 0
            r4 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r8 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData.<init>():void");
    }

    public static /* synthetic */ SkylightData copy$default(SkylightData skylightData, int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = skylightData.bizType;
        }
        if ((i4 & 2) != 0) {
            i2 = skylightData.priority;
        }
        if ((i4 & 4) != 0) {
            i3 = skylightData.subPriority;
        }
        if ((i4 & 8) != 0) {
            templateData = skylightData.templateData;
        }
        if ((i4 & 16) != 0) {
            customBizData = skylightData.customBizData;
        }
        if ((i4 & 32) != 0) {
            l = skylightData.uid;
        }
        return skylightData.copy(i, i2, i3, templateData, customBizData, l);
    }

    public final SkylightData copy(int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l) {
        return new SkylightData(i, i2, i3, templateData, customBizData, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightData)) {
            return false;
        }
        SkylightData skylightData = (SkylightData) obj;
        return this.bizType == skylightData.bizType && this.priority == skylightData.priority && this.subPriority == skylightData.subPriority && o.LJ(this.templateData, skylightData.templateData) && o.LJ(this.customBizData, skylightData.customBizData) && o.LJ(this.uid, skylightData.uid);
    }

    public int hashCode() {
        int i = ((((this.bizType * 31) + this.priority) * 31) + this.subPriority) * 31;
        TemplateData templateData = this.templateData;
        int hashCode = (i + (templateData == null ? 0 : templateData.hashCode())) * 31;
        CustomBizData customBizData = this.customBizData;
        int hashCode2 = (hashCode + (customBizData == null ? 0 : customBizData.hashCode())) * 31;
        Long l = this.uid;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightData(bizType=");
        LIZ.append(this.bizType);
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append(", subPriority=");
        LIZ.append(this.subPriority);
        LIZ.append(", templateData=");
        LIZ.append(this.templateData);
        LIZ.append(", customBizData=");
        LIZ.append(this.customBizData);
        LIZ.append(", uid=");
        return JBR.LJ(LIZ, this.uid, ')', LIZ);
    }

    public final int getBizType() {
        return this.bizType;
    }

    public final CustomBizData getCustomBizData() {
        return this.customBizData;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getSubPriority() {
        return this.subPriority;
    }

    public final TemplateData getTemplateData() {
        return this.templateData;
    }

    public final Long getUid() {
        return this.uid;
    }

    public SkylightData(int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l) {
        this.bizType = i;
        this.priority = i2;
        this.subPriority = i3;
        this.templateData = templateData;
        this.customBizData = customBizData;
        this.uid = l;
    }

    public /* synthetic */ SkylightData(int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) == 0 ? i3 : -1, (i4 & 8) != 0 ? null : templateData, (i4 & 16) != 0 ? null : customBizData, (i4 & 32) == 0 ? l : null);
    }
}
