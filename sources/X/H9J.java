package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9J implements Parcelable.Creator<RecordEffectModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordEffectModel createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(RecordEffectModel.class, parcel, arrayList, i, 1);
            }
        }
        StickerInfo stickerInfo = (StickerInfo) parcel.readSerializable();
        SimpleEffect simpleEffect = (SimpleEffect) parcel.readParcelable(RecordEffectModel.class.getClassLoader());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new RecordEffectModel(arrayList, stickerInfo, simpleEffect, readString, readString2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordEffectModel[] newArray(int i) {
        return new RecordEffectModel[i];
    }
}
