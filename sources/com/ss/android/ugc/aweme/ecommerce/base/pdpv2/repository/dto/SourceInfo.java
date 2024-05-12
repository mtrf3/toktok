package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto;

import X.C43588H8u;
import X.C70319Ril;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SourceInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<SourceInfo> CREATOR = new C70319Ril();

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("first_source_page")
    public final String firstSourcePage;

    @InterfaceC65349Pkn("source_content_id")
    public final String sourceContentId;

    @InterfaceC65349Pkn("source_page")
    public final String sourcePage;

    public static /* synthetic */ SourceInfo copy$default(SourceInfo sourceInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sourceInfo.sourcePage;
        }
        if ((i & 2) != 0) {
            str2 = sourceInfo.firstSourcePage;
        }
        if ((i & 4) != 0) {
            str3 = sourceInfo.authorId;
        }
        if ((i & 8) != 0) {
            str4 = sourceInfo.sourceContentId;
        }
        return sourceInfo.copy(str, str2, str3, str4);
    }

    public final SourceInfo copy(String sourcePage, String firstSourcePage, String authorId, String sourceContentId) {
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(firstSourcePage, "firstSourcePage");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(sourceContentId, "sourceContentId");
        return new SourceInfo(sourcePage, firstSourcePage, authorId, sourceContentId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.sourcePage, this.firstSourcePage, this.authorId, this.sourceContentId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sourcePage);
        out.writeString(this.firstSourcePage);
        out.writeString(this.authorId);
        out.writeString(this.sourceContentId);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getFirstSourcePage() {
        return this.firstSourcePage;
    }

    public final String getSourceContentId() {
        return this.sourceContentId;
    }

    public final String getSourcePage() {
        return this.sourcePage;
    }

    public SourceInfo(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "sourcePage", str2, "firstSourcePage", str3, "authorId", str4, "sourceContentId");
        this.sourcePage = str;
        this.firstSourcePage = str2;
        this.authorId = str3;
        this.sourceContentId = str4;
    }
}
