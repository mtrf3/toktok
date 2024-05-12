package com.linecorp.linesdk;

import X.AnonymousClass073;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new IDCreatorS54S0000000_11(48);
    public static final LineApiError DEFAULT = new LineApiError(-1, "");
    public final int httpResponseCode;
    public final String message;

    public LineApiError() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        int i2 = this.httpResponseCode * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineApiError{httpResponseCode=");
        sb.append(this.httpResponseCode);
        sb.append(", message='");
        return AnonymousClass073.LIZIZ(sb, this.message, "'}");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LineApiError(java.lang.Exception r3) {
        /*
            r2 = this;
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r1)
            r3.printStackTrace(r0)
            java.lang.String r1 = r1.toString()
            r0 = -1
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.LineApiError.<init>(java.lang.Exception):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineApiError lineApiError = (LineApiError) obj;
            if (this.httpResponseCode != lineApiError.httpResponseCode) {
                return false;
            }
            String str = this.message;
            String str2 = lineApiError.message;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public LineApiError(Parcel parcel) {
        this.httpResponseCode = parcel.readInt();
        this.message = parcel.readString();
    }

    public LineApiError(int i, String str) {
        this.httpResponseCode = i;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.httpResponseCode);
        parcel.writeString(this.message);
    }
}
