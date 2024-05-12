package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C31461Li;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PromoteNotice {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("image_url")
    public final UrlModel imageUrl;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteNotice() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoteNotice)) {
            return false;
        }
        PromoteNotice promoteNotice = (PromoteNotice) obj;
        return o.LJ(this.title, promoteNotice.title) && o.LJ(this.content, promoteNotice.content) && o.LJ(this.schemaUrl, promoteNotice.schemaUrl) && o.LJ(this.imageUrl, promoteNotice.imageUrl);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.schemaUrl, C79062V1e.LJ(this.content, this.title.hashCode() * 31, 31), 31);
        UrlModel urlModel = this.imageUrl;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromoteNotice(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", imageUrl=");
        return C31461Li.LIZLLL(LIZ, this.imageUrl, ')', LIZ);
    }

    public PromoteNotice(String str, String str2, String str3, UrlModel urlModel) {
        HH1.LIZ(str, "title", str2, "content", str3, "schemaUrl");
        this.title = str;
        this.content = str2;
        this.schemaUrl = str3;
        this.imageUrl = urlModel;
    }

    public /* synthetic */ PromoteNotice(String str, String str2, String str3, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : urlModel);
    }
}
