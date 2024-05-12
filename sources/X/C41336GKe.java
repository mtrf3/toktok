package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GKe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41336GKe implements Parcelable.Creator<EditPostModel> {
    @Override // android.os.Parcelable.Creator
    public final EditPostModel createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        EditPostCheckResult createFromParcel;
        EditCapCutReuseModel.MusicInfo createFromParcel2;
        boolean z2;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        VideoUrlModel videoUrlModel = (VideoUrlModel) parcel.readSerializable();
        UrlModel urlModel = (UrlModel) parcel.readSerializable();
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) parcel.readSerializable();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(AVTextExtraStruct.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString3 = parcel.readString();
        UrlModel urlModel2 = (UrlModel) parcel.readSerializable();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = EditPostCheckResult.CREATOR.createFromParcel(parcel);
        }
        EditPostCheckResult editPostCheckResult = createFromParcel;
        long readLong = parcel.readLong();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = EditCapCutReuseModel.MusicInfo.CREATOR.createFromParcel(parcel);
        }
        EditCapCutReuseModel.MusicInfo musicInfo = createFromParcel2;
        UrlModel urlModel3 = (UrlModel) parcel.readSerializable();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        EditPostPermission editPostPermission = (EditPostPermission) parcel.readSerializable();
        PoiData poiData = (PoiData) parcel.readSerializable();
        PoiData poiData2 = (PoiData) parcel.readSerializable();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt5 = parcel.readInt();
            arrayList2 = new ArrayList(readInt5);
            for (int i2 = 0; i2 != readInt5; i2++) {
                arrayList2.add(parcel.readSerializable());
            }
        }
        return new EditPostModel(z, videoUrlModel, urlModel, simVideoUrlModel, readString, readString2, arrayList, readString3, urlModel2, editPostCheckResult, readLong, musicInfo, urlModel3, readInt2, z2, readInt3, readInt4, editPostPermission, poiData, poiData2, valueOf, readString4, arrayList2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EditPostModel[] newArray(int i) {
        return new EditPostModel[i];
    }
}
