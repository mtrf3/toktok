package com.linecorp.linesdk.auth;

import X.C08880Wm;
import X.Q9Y;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class LineAuthenticationConfig implements Parcelable {
    public final String channelId;
    public final Uri endPointBaseUrl;
    public final boolean isEncryptorPreparationDisabled;
    public final boolean isLineAppAuthenticationDisabled;
    public final Uri webLoginPageUrl;
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new IDCreatorS54S0000000_11(51);
    public static int FLAGS_LINE_APP_AUTHENTICATION_DISABLED = 1;
    public static int FLAGS_ENCRYPTOR_PREPARATION_DISABLED = 2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return ((((this.webLoginPageUrl.hashCode() + ((this.endPointBaseUrl.hashCode() + (this.channelId.hashCode() * 31)) * 31)) * 31) + (this.isLineAppAuthenticationDisabled ? 1 : 0)) * 31) + (this.isEncryptorPreparationDisabled ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineAuthenticationConfig{channelId=");
        sb.append(this.channelId);
        sb.append(", endPointBaseUrl=");
        sb.append(this.endPointBaseUrl);
        sb.append(", webLoginPageUrl=");
        sb.append(this.webLoginPageUrl);
        sb.append(", isLineAppAuthenticationDisabled=");
        sb.append(this.isLineAppAuthenticationDisabled);
        sb.append(", isEncryptorPreparationDisabled=");
        return C08880Wm.LIZJ(sb, this.isEncryptorPreparationDisabled, '}');
    }

    public LineAuthenticationConfig(Parcel parcel) {
        boolean z;
        this.channelId = parcel.readString();
        this.endPointBaseUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webLoginPageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        if ((FLAGS_LINE_APP_AUTHENTICATION_DISABLED & readInt) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.isLineAppAuthenticationDisabled = z;
        this.isEncryptorPreparationDisabled = (readInt & FLAGS_ENCRYPTOR_PREPARATION_DISABLED) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.isLineAppAuthenticationDisabled != lineAuthenticationConfig.isLineAppAuthenticationDisabled || this.isEncryptorPreparationDisabled != lineAuthenticationConfig.isEncryptorPreparationDisabled || !this.channelId.equals(lineAuthenticationConfig.channelId) || !this.endPointBaseUrl.equals(lineAuthenticationConfig.endPointBaseUrl)) {
            return false;
        }
        return this.webLoginPageUrl.equals(lineAuthenticationConfig.webLoginPageUrl);
    }

    public LineAuthenticationConfig(Q9Y q9y) {
        this.channelId = q9y.LIZ;
        this.endPointBaseUrl = q9y.LIZIZ;
        this.webLoginPageUrl = q9y.LIZJ;
        this.isLineAppAuthenticationDisabled = false;
        this.isEncryptorPreparationDisabled = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.channelId);
        parcel.writeParcelable(this.endPointBaseUrl, i);
        parcel.writeParcelable(this.webLoginPageUrl, i);
        int i3 = 0;
        if (this.isLineAppAuthenticationDisabled) {
            i2 = FLAGS_LINE_APP_AUTHENTICATION_DISABLED;
        } else {
            i2 = 0;
        }
        if (this.isEncryptorPreparationDisabled) {
            i3 = FLAGS_ENCRYPTOR_PREPARATION_DISABLED;
        }
        parcel.writeInt(i2 | i3);
    }
}
