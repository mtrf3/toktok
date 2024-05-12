package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.GreenScreenInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.jvm.internal.o;

/* renamed from: X.ERm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36430ERm implements Parcelable.Creator<UploadableMobileEffect2> {
    @Override // android.os.Parcelable.Creator
    public final UploadableMobileEffect2 createFromParcel(Parcel parcel) {
        TemplateEffectInfo createFromParcel;
        GreenScreenInfo createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        DraftInfo draftInfo = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TemplateEffectInfo.CREATOR.createFromParcel(parcel);
        }
        TemplateEffectInfo templateEffectInfo = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = GreenScreenInfo.CREATOR.createFromParcel(parcel);
        }
        GreenScreenInfo greenScreenInfo = createFromParcel2;
        if (parcel.readInt() != 0) {
            draftInfo = DraftInfo.CREATOR.createFromParcel(parcel);
        }
        return new UploadableMobileEffect2(readString, readString2, readString3, readString4, readString5, templateEffectInfo, greenScreenInfo, draftInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final UploadableMobileEffect2[] newArray(int i) {
        return new UploadableMobileEffect2[i];
    }
}
