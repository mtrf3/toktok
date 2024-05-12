package com.facebook.share.model;

import X.C61878OQg;
import X.C66488Q7o;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public final List<ShareMedia<?, ?>> media;
    public static final C66488Q7o Companion = new C66488Q7o();
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new IDCreatorS54S0000000_11(37);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.facebook.share.model.ShareMedia<?, ?>>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.OQg] */
    public ShareMediaContent(Parcel source) {
        super(source);
        ?? arrayList;
        o.LJIIIZ(source, "source");
        Parcelable[] readParcelableArray = source.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable != null) {
                    arrayList.add(parcelable);
                }
            }
        }
        this.media = arrayList;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        Object[] array = this.media.toArray(new ShareMedia[0]);
        if (array != null) {
            out.writeParcelableArray((Parcelable[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
