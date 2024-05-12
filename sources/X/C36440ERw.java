package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.ERw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36440ERw implements Parcelable.Creator<CKEDraftInfoWrapper> {
    @Override // android.os.Parcelable.Creator
    public final CKEDraftInfoWrapper createFromParcel(Parcel parcel) {
        EffectHintWrapper createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = EffectHintWrapper.CREATOR.createFromParcel(parcel);
        }
        return new CKEDraftInfoWrapper(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, createFromParcel, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final CKEDraftInfoWrapper[] newArray(int i) {
        return new CKEDraftInfoWrapper[i];
    }
}
