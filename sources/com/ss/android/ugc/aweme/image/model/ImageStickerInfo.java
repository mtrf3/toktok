package com.ss.android.ugc.aweme.image.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageStickerInfo extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageStickerInfo> CREATOR = new Parcelable.Creator<ImageStickerInfo>() { // from class: X.5xA
        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(ImageStickerInfo.class, parcel, arrayList, i, 1);
            }
            return new ImageStickerInfo(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfo[] newArray(int i) {
            return new ImageStickerInfo[i];
        }
    };

    @InterfaceC65349Pkn("stickers")
    public final List<StickerItemModel> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageStickerInfo copy$default(ImageStickerInfo imageStickerInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageStickerInfo.stickers;
        }
        return imageStickerInfo.copy(list);
    }

    public final ImageStickerInfo copy(List<? extends StickerItemModel> stickers) {
        o.LJIIIZ(stickers, "stickers");
        return new ImageStickerInfo(stickers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.stickers};
    }

    public final List<StickerItemModel> getStickers() {
        return this.stickers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageStickerInfo(List<? extends StickerItemModel> stickers) {
        o.LJIIIZ(stickers, "stickers");
        this.stickers = stickers;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.stickers, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
    }
}
