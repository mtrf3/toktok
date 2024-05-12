package com.ss.android.ugc.aweme.shortvideo.preview;

import X.C84283X5z;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EditPreviewTO extends F9E implements Parcelable {
    public static final Parcelable.Creator<EditPreviewTO> CREATOR = new C84283X5z();
    public final FilterBean filterBean;
    public final String filterIntensityStoreTag;

    public static /* synthetic */ EditPreviewTO copy$default(EditPreviewTO editPreviewTO, FilterBean filterBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            filterBean = editPreviewTO.filterBean;
        }
        if ((i & 2) != 0) {
            str = editPreviewTO.filterIntensityStoreTag;
        }
        return editPreviewTO.copy(filterBean, str);
    }

    public final EditPreviewTO copy(FilterBean filterBean, String filterIntensityStoreTag) {
        o.LJIIIZ(filterIntensityStoreTag, "filterIntensityStoreTag");
        return new EditPreviewTO(filterBean, filterIntensityStoreTag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.filterBean, this.filterIntensityStoreTag};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.filterBean, i);
        parcel.writeString(this.filterIntensityStoreTag);
    }

    public final FilterBean getFilterBean() {
        return this.filterBean;
    }

    public final String getFilterIntensityStoreTag() {
        return this.filterIntensityStoreTag;
    }

    public EditPreviewTO(FilterBean filterBean, String filterIntensityStoreTag) {
        o.LJIIIZ(filterIntensityStoreTag, "filterIntensityStoreTag");
        this.filterBean = filterBean;
        this.filterIntensityStoreTag = filterIntensityStoreTag;
    }
}
