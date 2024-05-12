package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCF implements Parcelable.Creator<RecordPageOptionalConfig> {
    @Override // android.os.Parcelable.Creator
    public final RecordPageOptionalConfig createFromParcel(Parcel parcel) {
        UploadConfig createFromParcel;
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        OptionalComponents createFromParcel2 = OptionalComponents.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        RecordBottomTabConfig createFromParcel3 = RecordBottomTabConfig.CREATOR.createFromParcel(parcel);
        CompressConfig compressConfig = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = UploadConfig.CREATOR.createFromParcel(parcel);
        }
        UploadConfig uploadConfig = createFromParcel;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            compressConfig = CompressConfig.CREATOR.createFromParcel(parcel);
        }
        CompressConfig compressConfig2 = compressConfig;
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new RecordPageOptionalConfig(readInt, createStringArrayList, createFromParcel2, readString, createFromParcel3, uploadConfig, z, compressConfig2, readString2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordPageOptionalConfig[] newArray(int i) {
        return new RecordPageOptionalConfig[i];
    }
}
