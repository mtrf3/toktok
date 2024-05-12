package com.ss.ugc.aweme.creation.base;

import X.C36476ETg;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class StickerConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StickerConfigModel> CREATOR = new C36476ETg();

    @InterfaceC65349Pkn("infoStickerConfigModel")
    public List<InfoStickerConfigModel> infostickerconfigmodel;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<InfoStickerConfigModel> list = this.infostickerconfigmodel;
        parcel.writeInt(list.size());
        Iterator<InfoStickerConfigModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public final List<InfoStickerConfigModel> getInfostickerconfigmodel() {
        return this.infostickerconfigmodel;
    }

    public StickerConfigModel(List<InfoStickerConfigModel> infostickerconfigmodel) {
        o.LJIIIZ(infostickerconfigmodel, "infostickerconfigmodel");
        this.infostickerconfigmodel = infostickerconfigmodel;
    }

    public final void setInfostickerconfigmodel(List<InfoStickerConfigModel> list) {
        o.LJIIIZ(list, "<set-?>");
        this.infostickerconfigmodel = list;
    }

    public /* synthetic */ StickerConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
