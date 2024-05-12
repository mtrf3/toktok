package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecReasonsStruct implements Serializable {

    @InterfaceC65349Pkn("biz_type")
    public String bizType;

    @InterfaceC65349Pkn("body")
    public String body;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("rec_reasons")
    public List<RecReasonEntry> reasons;

    @InterfaceC65349Pkn("sub_body")
    public String subBody;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("url_text")
    public String urlText;

    public RecReasonsStruct() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecReasonsStruct copy$default(RecReasonsStruct recReasonsStruct, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recReasonsStruct.reasons;
        }
        if ((i & 2) != 0) {
            str = recReasonsStruct.title;
        }
        if ((i & 4) != 0) {
            str2 = recReasonsStruct.body;
        }
        if ((i & 8) != 0) {
            str3 = recReasonsStruct.subBody;
        }
        if ((i & 16) != 0) {
            str4 = recReasonsStruct.urlText;
        }
        if ((i & 32) != 0) {
            str5 = recReasonsStruct.url;
        }
        if ((i & 64) != 0) {
            str6 = recReasonsStruct.buttonText;
        }
        if ((i & 128) != 0) {
            str7 = recReasonsStruct.bizType;
        }
        return recReasonsStruct.copy(list, str, str2, str3, str4, str5, str6, str7);
    }

    public final RecReasonsStruct copy(List<RecReasonEntry> reasons, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.LJIIIZ(reasons, "reasons");
        return new RecReasonsStruct(reasons, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecReasonsStruct)) {
            return false;
        }
        RecReasonsStruct recReasonsStruct = (RecReasonsStruct) obj;
        return o.LJ(this.reasons, recReasonsStruct.reasons) && o.LJ(this.title, recReasonsStruct.title) && o.LJ(this.body, recReasonsStruct.body) && o.LJ(this.subBody, recReasonsStruct.subBody) && o.LJ(this.urlText, recReasonsStruct.urlText) && o.LJ(this.url, recReasonsStruct.url) && o.LJ(this.buttonText, recReasonsStruct.buttonText) && o.LJ(this.bizType, recReasonsStruct.bizType);
    }

    public int hashCode() {
        int hashCode = this.reasons.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subBody;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.urlText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonText;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bizType;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecReasonsStruct(reasons=");
        LIZ.append(this.reasons);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", body=");
        LIZ.append(this.body);
        LIZ.append(", subBody=");
        LIZ.append(this.subBody);
        LIZ.append(", urlText=");
        LIZ.append(this.urlText);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", bizType=");
        return q.LIZIZ(LIZ, this.bizType, ')', LIZ);
    }

    public final String getBizType() {
        return this.bizType;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<RecReasonEntry> getReasons() {
        return this.reasons;
    }

    public final String getSubBody() {
        return this.subBody;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlText() {
        return this.urlText;
    }

    public final void setBizType(String str) {
        this.bizType = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setReasons(List<RecReasonEntry> list) {
        o.LJIIIZ(list, "<set-?>");
        this.reasons = list;
    }

    public final void setSubBody(String str) {
        this.subBody = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUrlText(String str) {
        this.urlText = str;
    }

    public RecReasonsStruct(List<RecReasonEntry> reasons, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.LJIIIZ(reasons, "reasons");
        this.reasons = reasons;
        this.title = str;
        this.body = str2;
        this.subBody = str3;
        this.urlText = str4;
        this.url = str5;
        this.buttonText = str6;
        this.bizType = str7;
    }

    public /* synthetic */ RecReasonsStruct(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
