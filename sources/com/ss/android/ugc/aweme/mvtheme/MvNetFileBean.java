package com.ss.android.ugc.aweme.mvtheme;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MvNetFileBean extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MvNetFileBean> CREATOR = new Parcelable.Creator<MvNetFileBean>() { // from class: X.5mD
        @Override // android.os.Parcelable.Creator
        public final MvNetFileBean createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new MvNetFileBean(in.readString(), in.readString(), in.readString(), in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MvNetFileBean[] newArray(int i) {
            return new MvNetFileBean[i];
        }
    };

    @InterfaceC65349Pkn("algorithm")
    public final String algorithm;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("filePath")
    public final String filePath;

    @InterfaceC65349Pkn("jsonParams")
    public final String jsonParams;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("photo_path")
    public final String photonPath;

    public static /* synthetic */ MvNetFileBean copy$default(MvNetFileBean mvNetFileBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mvNetFileBean.photonPath;
        }
        if ((i & 2) != 0) {
            str2 = mvNetFileBean.algorithm;
        }
        if ((i & 4) != 0) {
            str3 = mvNetFileBean.filePath;
        }
        if ((i & 8) != 0) {
            str4 = mvNetFileBean.jsonParams;
        }
        return mvNetFileBean.copy(str, str2, str3, str4);
    }

    public final MvNetFileBean copy(String photonPath, String algorithm, String filePath, String jsonParams) {
        o.LJIIIZ(photonPath, "photonPath");
        o.LJIIIZ(algorithm, "algorithm");
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(jsonParams, "jsonParams");
        return new MvNetFileBean(photonPath, algorithm, filePath, jsonParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.photonPath, this.algorithm, this.filePath, this.jsonParams};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.photonPath);
        parcel.writeString(this.algorithm);
        parcel.writeString(this.filePath);
        parcel.writeString(this.jsonParams);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getJsonParams() {
        return this.jsonParams;
    }

    public final String getPhotonPath() {
        return this.photonPath;
    }

    public MvNetFileBean(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "photonPath", str2, "algorithm", str3, "filePath", str4, "jsonParams");
        this.photonPath = str;
        this.algorithm = str2;
        this.filePath = str3;
        this.jsonParams = str4;
    }
}
