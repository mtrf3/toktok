package com.ss.android.ugc.aweme.creative.model;

import X.C43560H7s;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FilterModel implements Parcelable {
    public static final Parcelable.Creator<FilterModel> CREATOR = new C43560H7s();

    @InterfaceC65349Pkn("is_use_composer_filter_in_edit_page")
    public boolean isUseComposerFilterInEditPage;

    public FilterModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isUseComposerFilterInEditPage ? 1 : 0);
    }

    public FilterModel(boolean z) {
        this.isUseComposerFilterInEditPage = z;
    }

    public /* synthetic */ FilterModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
