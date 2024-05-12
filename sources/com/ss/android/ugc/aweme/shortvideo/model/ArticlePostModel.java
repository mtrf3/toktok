package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ArticlePostModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<ArticlePostModel> CREATOR = new Creator();

    @InterfaceC65349Pkn("rss_guid")
    public final String rssGuid;

    @InterfaceC65349Pkn("rss_url")
    public final String rssUrl;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ArticlePostModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticlePostModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ArticlePostModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticlePostModel[] newArray(int i) {
            return new ArticlePostModel[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticlePostModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArticlePostModel copy$default(ArticlePostModel articlePostModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articlePostModel.rssGuid;
        }
        if ((i & 2) != 0) {
            str2 = articlePostModel.rssUrl;
        }
        return articlePostModel.copy(str, str2);
    }

    public final ArticlePostModel copy(String rssGuid, String rssUrl) {
        o.LJIIIZ(rssGuid, "rssGuid");
        o.LJIIIZ(rssUrl, "rssUrl");
        return new ArticlePostModel(rssGuid, rssUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.rssGuid, this.rssUrl};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.rssGuid);
        out.writeString(this.rssUrl);
    }

    public ArticlePostModel(String rssGuid, String rssUrl) {
        o.LJIIIZ(rssGuid, "rssGuid");
        o.LJIIIZ(rssUrl, "rssUrl");
        this.rssGuid = rssGuid;
        this.rssUrl = rssUrl;
    }

    public /* synthetic */ ArticlePostModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
