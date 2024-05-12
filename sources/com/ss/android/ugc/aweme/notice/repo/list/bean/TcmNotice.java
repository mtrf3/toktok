package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C31461Li;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TcmNotice {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("source_icon")
    public final UrlModel sourceIcon;

    @InterfaceC65349Pkn("source_name")
    public final String sourceName;

    @InterfaceC65349Pkn("source_type")
    public final int sourceType;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TcmNotice() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TcmNotice)) {
            return false;
        }
        TcmNotice tcmNotice = (TcmNotice) obj;
        return o.LJ(this.title, tcmNotice.title) && o.LJ(this.content, tcmNotice.content) && o.LJ(this.schemaUrl, tcmNotice.schemaUrl) && o.LJ(this.logExtra, tcmNotice.logExtra) && this.sourceType == tcmNotice.sourceType && o.LJ(this.sourceName, tcmNotice.sourceName) && o.LJ(this.sourceIcon, tcmNotice.sourceIcon);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.sourceName, (C79062V1e.LJ(this.logExtra, C79062V1e.LJ(this.schemaUrl, C79062V1e.LJ(this.content, this.title.hashCode() * 31, 31), 31), 31) + this.sourceType) * 31, 31);
        UrlModel urlModel = this.sourceIcon;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TcmNotice(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", logExtra=");
        LIZ.append(this.logExtra);
        LIZ.append(", sourceType=");
        LIZ.append(this.sourceType);
        LIZ.append(", sourceName=");
        LIZ.append(this.sourceName);
        LIZ.append(", sourceIcon=");
        return C31461Li.LIZLLL(LIZ, this.sourceIcon, ')', LIZ);
    }

    public TcmNotice(String title, String content, String schemaUrl, String logExtra, int i, String sourceName, UrlModel urlModel) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(schemaUrl, "schemaUrl");
        o.LJIIIZ(logExtra, "logExtra");
        o.LJIIIZ(sourceName, "sourceName");
        this.title = title;
        this.content = content;
        this.schemaUrl = schemaUrl;
        this.logExtra = logExtra;
        this.sourceType = i;
        this.sourceName = sourceName;
        this.sourceIcon = urlModel;
    }

    public /* synthetic */ TcmNotice(String str, String str2, String str3, String str4, int i, String str5, UrlModel urlModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? null : urlModel);
    }
}
