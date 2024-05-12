package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C116024gw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TemplateData implements Serializable {
    public static final C116024gw Companion = new Object() { // from class: X.4gw
    };

    @InterfaceC65349Pkn("actions")
    public final List<SkylightActionData> actionData;

    @InterfaceC65349Pkn("badge_url")
    public final UrlModel badgeUrl;

    @InterfaceC65349Pkn("extra_data")
    public final String extraData;

    @InterfaceC65349Pkn("icon_url")
    public final UrlModel iconUrl;

    @InterfaceC65349Pkn("image_url")
    public final UrlModel imageUrl;
    public final Object localBadgeUrl;
    public final Object localImageUrl;
    public final Object localTitle;

    @InterfaceC65349Pkn("out_line")
    public final String outLine;

    @InterfaceC65349Pkn("scheme_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("ui_type")
    public final int uiType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateData copy$default(TemplateData templateData, int i, String str, UrlModel urlModel, Object obj, String str2, Object obj2, UrlModel urlModel2, Object obj3, UrlModel urlModel3, String str3, String str4, List list, int i2, Object obj4) {
        if ((i2 & 1) != 0) {
            i = templateData.uiType;
        }
        if ((i2 & 2) != 0) {
            str = templateData.schemaUrl;
        }
        if ((i2 & 4) != 0) {
            urlModel = templateData.imageUrl;
        }
        if ((i2 & 8) != 0) {
            obj = templateData.localImageUrl;
        }
        if ((i2 & 16) != 0) {
            str2 = templateData.title;
        }
        if ((i2 & 32) != 0) {
            obj2 = templateData.localTitle;
        }
        if ((i2 & 64) != 0) {
            urlModel2 = templateData.badgeUrl;
        }
        if ((i2 & 128) != 0) {
            obj3 = templateData.localBadgeUrl;
        }
        if ((i2 & 256) != 0) {
            urlModel3 = templateData.iconUrl;
        }
        if ((i2 & 512) != 0) {
            str3 = templateData.extraData;
        }
        if ((i2 & 1024) != 0) {
            str4 = templateData.outLine;
        }
        if ((i2 & 2048) != 0) {
            list = templateData.actionData;
        }
        return templateData.copy(i, str, urlModel, obj, str2, obj2, urlModel2, obj3, urlModel3, str3, str4, list);
    }

    public final TemplateData copy(int i, String str, UrlModel urlModel, Object obj, String str2, Object obj2, UrlModel urlModel2, Object obj3, UrlModel urlModel3, String str3, String str4, List<SkylightActionData> list) {
        return new TemplateData(i, str, urlModel, obj, str2, obj2, urlModel2, obj3, urlModel3, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateData)) {
            return false;
        }
        TemplateData templateData = (TemplateData) obj;
        return this.uiType == templateData.uiType && o.LJ(this.schemaUrl, templateData.schemaUrl) && o.LJ(this.imageUrl, templateData.imageUrl) && o.LJ(this.localImageUrl, templateData.localImageUrl) && o.LJ(this.title, templateData.title) && o.LJ(this.localTitle, templateData.localTitle) && o.LJ(this.badgeUrl, templateData.badgeUrl) && o.LJ(this.localBadgeUrl, templateData.localBadgeUrl) && o.LJ(this.iconUrl, templateData.iconUrl) && o.LJ(this.extraData, templateData.extraData) && o.LJ(this.outLine, templateData.outLine) && o.LJ(this.actionData, templateData.actionData);
    }

    public int hashCode() {
        int i = this.uiType * 31;
        String str = this.schemaUrl;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.imageUrl;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Object obj = this.localImageUrl;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.localTitle;
        int hashCode5 = (hashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        UrlModel urlModel2 = this.badgeUrl;
        int hashCode6 = (hashCode5 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        Object obj3 = this.localBadgeUrl;
        int hashCode7 = (hashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        UrlModel urlModel3 = this.iconUrl;
        int hashCode8 = (hashCode7 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        String str3 = this.extraData;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.outLine;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SkylightActionData> list = this.actionData;
        return hashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TemplateData(uiType=" + this.uiType + ", schemaUrl=" + this.schemaUrl + ", imageUrl=" + this.imageUrl + ", localImageUrl=" + this.localImageUrl + ", title=" + this.title + ", localTitle=" + this.localTitle + ", badgeUrl=" + this.badgeUrl + ", localBadgeUrl=" + this.localBadgeUrl + ", iconUrl=" + this.iconUrl + ", extraData=" + this.extraData + ", outLine=" + this.outLine + ", actionData=" + this.actionData + ')';
    }

    public final List<SkylightActionData> getActionData() {
        return this.actionData;
    }

    public final UrlModel getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getExtraData() {
        return this.extraData;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final Object getLocalBadgeUrl() {
        return this.localBadgeUrl;
    }

    public final Object getLocalImageUrl() {
        return this.localImageUrl;
    }

    public final Object getLocalTitle() {
        return this.localTitle;
    }

    public final String getOutLine() {
        return this.outLine;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUiType() {
        return this.uiType;
    }

    public TemplateData(int i, String str, UrlModel urlModel, Object obj, String str2, Object obj2, UrlModel urlModel2, Object obj3, UrlModel urlModel3, String str3, String str4, List<SkylightActionData> list) {
        this.uiType = i;
        this.schemaUrl = str;
        this.imageUrl = urlModel;
        this.localImageUrl = obj;
        this.title = str2;
        this.localTitle = obj2;
        this.badgeUrl = urlModel2;
        this.localBadgeUrl = obj3;
        this.iconUrl = urlModel3;
        this.extraData = str3;
        this.outLine = str4;
        this.actionData = list;
    }

    public /* synthetic */ TemplateData(int i, String str, UrlModel urlModel, Object obj, String str2, Object obj2, UrlModel urlModel2, Object obj3, UrlModel urlModel3, String str3, String str4, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : urlModel, (i2 & 8) != 0 ? null : obj, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : obj2, (i2 & 64) != 0 ? null : urlModel2, (i2 & 128) != 0 ? null : obj3, (i2 & 256) != 0 ? null : urlModel3, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) == 0 ? list : null);
    }
}
