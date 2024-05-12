package com.facebook.share.model;

import X.AbstractC66483Q7j;
import X.C66485Q7l;
import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends AbstractC66483Q7j<M, B>> implements ShareModel {
    public final Uri contentUrl;
    public final String pageId;
    public final List<String> peopleIds;
    public final String placeId;
    public final String ref;
    public final ShareHashtag shareHashtag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareContent(Parcel parcel) {
        List<String> unmodifiableList;
        o.LJIIIZ(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.peopleIds = unmodifiableList;
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        C66485Q7l c66485Q7l = new C66485Q7l();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            c66485Q7l.LIZ = shareHashtag.hashtag;
        }
        this.shareHashtag = new ShareHashtag(c66485Q7l);
    }

    public ShareContent(AbstractC66483Q7j<M, B> builder) {
        o.LJIIIZ(builder, "builder");
        this.contentUrl = builder.LIZ;
        this.peopleIds = builder.LIZIZ;
        this.placeId = builder.LIZJ;
        this.pageId = builder.LIZLLL;
        this.ref = builder.LJ;
        this.shareHashtag = builder.LJFF;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.contentUrl, 0);
        out.writeStringList(this.peopleIds);
        out.writeString(this.placeId);
        out.writeString(this.pageId);
        out.writeString(this.ref);
        out.writeParcelable(this.shareHashtag, 0);
    }
}
