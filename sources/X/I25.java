package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I25 implements Parcelable.Creator<MusicObject> {
    @Override // android.os.Parcelable.Creator
    public final MusicObject createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList arrayList;
        boolean z8;
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        UrlModel urlModel = (UrlModel) parcel.readSerializable();
        UrlModel urlModel2 = (UrlModel) parcel.readSerializable();
        UrlModel urlModel3 = (UrlModel) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        MusicHighPrecisionDuration musicHighPrecisionDuration = (MusicHighPrecisionDuration) parcel.readParcelable(MusicObject.class.getClassLoader());
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString4 = parcel.readString();
        MusicBeat musicBeat = (MusicBeat) parcel.readParcelable(MusicObject.class.getClassLoader());
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        String readString5 = parcel.readString();
        int readInt8 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        String readString6 = parcel.readString();
        UrlModel urlModel4 = (UrlModel) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        float readFloat = parcel.readFloat();
        UrlModel urlModel5 = (UrlModel) parcel.readSerializable();
        UrlModel urlModel6 = (UrlModel) parcel.readSerializable();
        int readInt9 = parcel.readInt();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt10 = parcel.readInt();
            arrayList = new ArrayList(readInt10);
            for (int i = 0; i != readInt10; i++) {
                arrayList.add(parcel.readSerializable());
            }
        }
        int readInt11 = parcel.readInt();
        int readInt12 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new MusicObject(readLong, readString, readString2, readInt, readInt2, readInt3, urlModel, urlModel2, urlModel3, z, musicHighPrecisionDuration, readString3, z2, z3, z4, readInt4, readInt5, readString4, musicBeat, readInt6, readInt7, readString5, readInt8, z5, z6, readString6, urlModel4, z7, readFloat, urlModel5, urlModel6, readInt9, arrayList, readInt11, readInt12, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final MusicObject[] newArray(int i) {
        return new MusicObject[i];
    }
}
