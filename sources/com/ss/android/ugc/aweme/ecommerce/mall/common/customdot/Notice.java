package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Notice {
    public String content;

    @InterfaceC65349Pkn("create_time")
    public String createTime;
    public String id;

    @InterfaceC65349Pkn("middle_image_url")
    public String middleImageUrl;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("template_id")
    public String templateId;
    public String title;
    public final int type;

    public static /* synthetic */ Notice copy$default(Notice notice, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notice.type;
        }
        if ((i2 & 2) != 0) {
            str = notice.id;
        }
        if ((i2 & 4) != 0) {
            str2 = notice.title;
        }
        if ((i2 & 8) != 0) {
            str3 = notice.content;
        }
        if ((i2 & 16) != 0) {
            str4 = notice.schemaUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = notice.middleImageUrl;
        }
        if ((i2 & 64) != 0) {
            str6 = notice.createTime;
        }
        if ((i2 & 128) != 0) {
            str7 = notice.templateId;
        }
        return notice.copy(i, str, str2, str3, str4, str5, str6, str7);
    }

    public final Notice copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new Notice(i, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return this.type == notice.type && o.LJ(this.id, notice.id) && o.LJ(this.title, notice.title) && o.LJ(this.content, notice.content) && o.LJ(this.schemaUrl, notice.schemaUrl) && o.LJ(this.middleImageUrl, notice.middleImageUrl) && o.LJ(this.createTime, notice.createTime) && o.LJ(this.templateId, notice.templateId);
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.id;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schemaUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.middleImageUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateId;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Notice(type=");
        LIZ.append(this.type);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", middleImageUrl=");
        LIZ.append(this.middleImageUrl);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", templateId=");
        return q.LIZIZ(LIZ, this.templateId, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMiddleImageUrl() {
        return this.middleImageUrl;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMiddleImageUrl(String str) {
        this.middleImageUrl = str;
    }

    public final void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public Notice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = i;
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.schemaUrl = str4;
        this.middleImageUrl = str5;
        this.createTime = str6;
        this.templateId = str7;
    }
}
