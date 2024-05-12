package com.facebook.share.model;

import X.C66490Q7q;
import X.ORZ;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public final String attributionLink;
    public final ShareMedia<?, ?> backgroundAsset;
    public final List<String> backgroundColorList;
    public final SharePhoto stickerAsset;
    public static final C66490Q7q Companion = new C66490Q7q();
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new IDCreatorS54S0000000_11(44);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> LIZ() {
        List<String> list = this.backgroundColorList;
        if (list == null) {
            return null;
        }
        return ORZ.LLJI(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        List<String> LLJI;
        o.LJIIIZ(parcel, "parcel");
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            LLJI = null;
        } else {
            LLJI = ORZ.LLJI(arrayList);
        }
        this.backgroundColorList = LLJI;
        this.attributionLink = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.backgroundAsset, 0);
        out.writeParcelable(this.stickerAsset, 0);
        out.writeStringList(LIZ());
        out.writeString(this.attributionLink);
    }
}
