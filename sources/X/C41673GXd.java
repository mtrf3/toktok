package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.GXd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41673GXd implements Parcelable.Creator<UgcTemplateData> {
    @Override // android.os.Parcelable.Creator
    public final UgcTemplateData createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Integer valueOf;
        boolean z3;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
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
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            bool = Boolean.valueOf(z3);
        }
        String readString2 = parcel.readString();
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) parcel.readSerializable();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new UgcTemplateData(z, z2, valueOf, readString, bool, readString2, anchorCommonStruct, readString3, readString4, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final UgcTemplateData[] newArray(int i) {
        return new UgcTemplateData[i];
    }
}
