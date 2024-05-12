package com.ss.android.ugc.aweme.sticker.model;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffectTemplateInfo implements Serializable {

    @InterfaceC65349Pkn("template_categories")
    public final List<TemplateCategoryInformation> templateCategories;

    @InterfaceC65349Pkn("template_icon")
    public final String templateIcon;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("template_name")
    public final String templateName;

    @InterfaceC65349Pkn("template_resource_id")
    public final String templateResourceId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileEffectTemplateInfo copy$default(MobileEffectTemplateInfo mobileEffectTemplateInfo, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileEffectTemplateInfo.templateName;
        }
        if ((i & 2) != 0) {
            str2 = mobileEffectTemplateInfo.templateIcon;
        }
        if ((i & 4) != 0) {
            str3 = mobileEffectTemplateInfo.templateId;
        }
        if ((i & 8) != 0) {
            list = mobileEffectTemplateInfo.templateCategories;
        }
        if ((i & 16) != 0) {
            str4 = mobileEffectTemplateInfo.templateResourceId;
        }
        return mobileEffectTemplateInfo.copy(str, str2, str3, list, str4);
    }

    public final MobileEffectTemplateInfo copy(String templateName, String templateIcon, String templateId, List<TemplateCategoryInformation> list, String str) {
        o.LJIIIZ(templateName, "templateName");
        o.LJIIIZ(templateIcon, "templateIcon");
        o.LJIIIZ(templateId, "templateId");
        return new MobileEffectTemplateInfo(templateName, templateIcon, templateId, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectTemplateInfo)) {
            return false;
        }
        MobileEffectTemplateInfo mobileEffectTemplateInfo = (MobileEffectTemplateInfo) obj;
        return o.LJ(this.templateName, mobileEffectTemplateInfo.templateName) && o.LJ(this.templateIcon, mobileEffectTemplateInfo.templateIcon) && o.LJ(this.templateId, mobileEffectTemplateInfo.templateId) && o.LJ(this.templateCategories, mobileEffectTemplateInfo.templateCategories) && o.LJ(this.templateResourceId, mobileEffectTemplateInfo.templateResourceId);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.templateId, C79062V1e.LJ(this.templateIcon, this.templateName.hashCode() * 31, 31), 31);
        List<TemplateCategoryInformation> list = this.templateCategories;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.templateResourceId;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobileEffectTemplateInfo(templateName=");
        LIZ.append(this.templateName);
        LIZ.append(", templateIcon=");
        LIZ.append(this.templateIcon);
        LIZ.append(", templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", templateCategories=");
        LIZ.append(this.templateCategories);
        LIZ.append(", templateResourceId=");
        return q.LIZIZ(LIZ, this.templateResourceId, ')', LIZ);
    }

    public final List<TemplateCategoryInformation> getTemplateCategories() {
        return this.templateCategories;
    }

    public final String getTemplateIcon() {
        return this.templateIcon;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final String getTemplateResourceId() {
        return this.templateResourceId;
    }

    public MobileEffectTemplateInfo(String str, String str2, String str3, List<TemplateCategoryInformation> list, String str4) {
        HH1.LIZ(str, "templateName", str2, "templateIcon", str3, "templateId");
        this.templateName = str;
        this.templateIcon = str2;
        this.templateId = str3;
        this.templateCategories = list;
        this.templateResourceId = str4;
    }

    public /* synthetic */ MobileEffectTemplateInfo(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4);
    }
}
