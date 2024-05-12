package android.support.v4.media;

import X.C01J;
import X.C01K;
import X.C01L;
import Y.IDCreatorS45S0000000;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        public final String mAction;
        public final C01J mCallback;
        public final Bundle mExtras;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new IDCreatorS45S0000000(0);
        public final MediaDescriptionCompat mDescription;
        public final int mFlags;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {
        public final C01K mCallback;
        public final String mMediaId;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.LIZ(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("media_item")) {
                        Parcelable parcelable = bundle.getParcelable("media_item");
                        if (parcelable != null) {
                            if (parcelable instanceof MediaItem) {
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        public final C01L mCallback;
        public final Bundle mExtras;
        public final String mQuery;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.LIZ(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("search_results")) {
                        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                        parcelableArray.getClass();
                        ArrayList arrayList = new ArrayList(parcelableArray.length);
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add(parcelable);
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}
