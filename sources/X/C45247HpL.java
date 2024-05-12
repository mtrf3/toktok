package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HpL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45247HpL implements Parcelable.Creator<TemplateSourceConfig> {
    @Override // android.os.Parcelable.Creator
    public final TemplateSourceConfig createFromParcel(Parcel parcel) {
        boolean z;
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
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new TemplateSourceConfig(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateSourceConfig[] newArray(int i) {
        return new TemplateSourceConfig[i];
    }
}
