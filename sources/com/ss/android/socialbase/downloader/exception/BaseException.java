package com.ss.android.socialbase.downloader.exception;

import X.C77800Ug8;
import X.X1D;
import X.X4Q;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i0;

/* loaded from: classes12.dex */
public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new IDCreatorS54S0000000_11(55);
    public int errorCode;
    public String errorMsg;
    public String extraInfo;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseException() {
        this.extraInfo = "";
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseException{errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg='");
        return C77800Ug8.LIZJ(LIZ, this.errorMsg, '\'', '}', LIZ);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BaseException(Parcel parcel) {
        this.extraInfo = "";
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.extraInfo = parcel.readString();
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public BaseException(int i, String str) {
        super(i0.LJFF("[d-ex]:", str));
        this.extraInfo = "";
        this.errorMsg = i0.LJFF("[d-ex]:", str);
        this.errorCode = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.extraInfo);
    }

    public BaseException(int i, Throwable th) {
        this(i, X4Q.LJIILLIIL(th));
    }

    public BaseException(int i, String str, Throwable th) {
        super(i0.LJFF("[d-ex]:", str), th);
        this.extraInfo = "";
        this.errorMsg = i0.LJFF("[d-ex]:", str);
        this.errorCode = i;
    }
}
