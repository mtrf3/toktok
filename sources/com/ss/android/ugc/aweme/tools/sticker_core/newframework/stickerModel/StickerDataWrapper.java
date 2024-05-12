package com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel;

import X.C42308Gj2;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerDataWrapper implements Parcelable {
    public static final Parcelable.Creator<StickerDataWrapper> CREATOR = new C42308Gj2();

    @InterfaceC65349Pkn("commercial_sticker_data")
    public final List<BaseStickerModel> commercialStickerList;

    @InterfaceC65349Pkn("sticker_data")
    public final List<BaseStickerModel> stickerList;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerDataWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StickerDataWrapper(List<BaseStickerModel> stickerList, List<BaseStickerModel> commercialStickerList) {
        o.LJIIIZ(stickerList, "stickerList");
        o.LJIIIZ(commercialStickerList, "commercialStickerList");
        this.stickerList = stickerList;
        this.commercialStickerList = commercialStickerList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.stickerList, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.commercialStickerList, out);
        while (LIZJ2.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ2.next(), i);
        }
    }

    public /* synthetic */ StickerDataWrapper(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
