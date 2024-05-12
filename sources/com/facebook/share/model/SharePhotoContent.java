package com.facebook.share.model;

import X.C61878OQg;
import X.C66482Q7i;
import X.C66489Q7p;
import X.ORZ;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, C66482Q7i> {
    public final List<SharePhoto> photos;
    public static final C66489Q7p Companion = new C66489Q7p();
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new IDCreatorS54S0000000_11(43);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OQg] */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        ?? arrayList;
        o.LJIIIZ(parcel, "parcel");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof SharePhoto) {
                arrayList2.add(obj);
            }
        }
        this.photos = ORZ.LLJI(arrayList2);
    }

    public SharePhotoContent(C66482Q7i c66482Q7i) {
        super(c66482Q7i);
        this.photos = ORZ.LLJI(c66482Q7i.LJI);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        List<SharePhoto> photos = this.photos;
        o.LJIIIZ(photos, "photos");
        Object[] array = photos.toArray(new SharePhoto[0]);
        if (array != null) {
            out.writeParcelableArray((SharePhoto[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
