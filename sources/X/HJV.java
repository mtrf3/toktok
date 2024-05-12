package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJV implements Parcelable.Creator<AutoCutModel> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutModel createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer valueOf;
        Long valueOf2;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(AutoCutThemeData.CREATOR, parcel, arrayList3, i, 1);
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList4 = new ArrayList(readInt2);
        int i2 = 0;
        while (i2 != readInt2) {
            i2 = C279117r.LIZIZ(AutoCutMediaModel.CREATOR, parcel, arrayList4, i2, 1);
        }
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        String readString2 = parcel.readString();
        AutoCutSoundSyncModel createFromParcel = AutoCutSoundSyncModel.CREATOR.createFromParcel(parcel);
        int readInt5 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        AutoCutAsyncRenderModel createFromParcel2 = AutoCutAsyncRenderModel.CREATOR.createFromParcel(parcel);
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt6 = parcel.readInt();
            arrayList = new ArrayList(readInt6);
            int i3 = 0;
            while (i3 != readInt6) {
                i3 = C279117r.LIZIZ(AutoCutMediaModel.CREATOR, parcel, arrayList, i3, 1);
            }
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt7 = parcel.readInt();
            arrayList2 = new ArrayList(readInt7);
            int i4 = 0;
            while (i4 != readInt7) {
                i4 = C279117r.LIZIZ(AutoCutTitle.CREATOR, parcel, arrayList2, i4, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        return new AutoCutModel(arrayList3, arrayList4, readString, readInt3, readInt4, readString2, createFromParcel, readInt5, z, createFromParcel2, readString3, arrayList, readString4, arrayList2, valueOf, readString5, valueOf2);
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutModel[] newArray(int i) {
        return new AutoCutModel[i];
    }
}
