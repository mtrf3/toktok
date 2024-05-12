package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GoW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42648GoW implements Parcelable.Creator<MusicBuzModel> {
    @Override // android.os.Parcelable.Creator
    public final MusicBuzModel createFromParcel(Parcel parcel) {
        boolean z;
        MusicObject createFromParcel;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        Boolean valueOf;
        boolean z5;
        Boolean valueOf2;
        boolean z6;
        boolean z7;
        boolean z8;
        ArrayList arrayList2;
        LogPbBean createFromParcel2;
        Float[] fArr;
        boolean z9;
        StickPointMusicAlg createFromParcel3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Boolean valueOf3;
        boolean z16;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = MusicObject.CREATOR.createFromParcel(parcel);
        }
        MusicObject musicObject = createFromParcel;
        String readString = parcel.readString();
        float readFloat = parcel.readFloat();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList3.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList.add(arrayList3);
            }
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf = Boolean.valueOf(z4);
        }
        float readFloat2 = parcel.readFloat();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            valueOf2 = Boolean.valueOf(z5);
        }
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        AVChallenge aVChallenge = (AVChallenge) parcel.readParcelable(MusicBuzModel.class.getClassLoader());
        String readString5 = parcel.readString();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        long readLong = parcel.readLong();
        int readInt5 = parcel.readInt();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt6 = parcel.readInt();
            arrayList2 = new ArrayList(readInt6);
            for (int i3 = 0; i3 != readInt6; i3++) {
                arrayList2.add(parcel.readSerializable());
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = LogPbBean.CREATOR.createFromParcel(parcel);
        }
        LogPbBean logPbBean = createFromParcel2;
        String readString6 = parcel.readString();
        int readInt7 = parcel.readInt();
        int readInt8 = parcel.readInt();
        int readInt9 = parcel.readInt();
        int readInt10 = parcel.readInt();
        if (parcel.readInt() == 0) {
            fArr = null;
        } else {
            int readInt11 = parcel.readInt();
            fArr = new Float[readInt11];
            for (int i4 = 0; i4 != readInt11; i4++) {
                fArr[i4] = Float.valueOf(parcel.readFloat());
            }
        }
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = StickPointMusicAlg.CREATOR.createFromParcel(parcel);
        }
        StickPointMusicAlg stickPointMusicAlg = createFromParcel3;
        String readString9 = parcel.readString();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String readString10 = parcel.readString();
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        String readString11 = parcel.readString();
        int readInt12 = parcel.readInt();
        UrlModel urlModel = (UrlModel) parcel.readSerializable();
        int readInt13 = parcel.readInt();
        int readInt14 = parcel.readInt();
        int readInt15 = parcel.readInt();
        String readString12 = parcel.readString();
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        int readInt16 = parcel.readInt();
        int readInt17 = parcel.readInt();
        int readInt18 = parcel.readInt();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            valueOf3 = Boolean.valueOf(z15);
        }
        int readInt19 = parcel.readInt();
        int readInt20 = parcel.readInt();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        if (parcel.readInt() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        return new MusicBuzModel(z, musicObject, readString, readFloat, z2, readString2, readString3, arrayList, z3, valueOf, readFloat2, readString4, valueOf2, z6, aVChallenge, readString5, readInt3, readInt4, z7, z8, readLong, readInt5, arrayList2, logPbBean, readString6, readInt7, readInt8, readInt9, readInt10, fArr, readString7, readString8, z9, stickPointMusicAlg, readString9, z10, z11, readString10, z12, z13, readString11, readInt12, urlModel, readInt13, readInt14, readInt15, readString12, z14, readInt16, readInt17, readInt18, valueOf3, readInt19, readInt20, readString13, readString14, readString15, z16, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicBuzModel[] newArray(int i) {
        return new MusicBuzModel[i];
    }
}
