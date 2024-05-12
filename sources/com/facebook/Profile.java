package com.facebook;

import X.C16880lQ;
import X.Q4J;
import X.Q5M;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Profile implements Parcelable {
    public final String firstName;
    public final String id;
    public final String lastName;
    public final Uri linkUri;
    public final String middleName;
    public final String name;
    public final Uri pictureUri;
    public static final Q5M Companion = new Q5M();
    public static final String TAG = C16880lQ.LJLLJ(Profile.class);
    public static final Parcelable.Creator<Profile> CREATOR = new IDCreatorS54S0000000_11(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        String str = this.id;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = 527 + i;
        String str2 = this.firstName;
        if (str2 != null) {
            i2 = (i2 * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            i2 = (i2 * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            i2 = (i2 * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            i2 = (i2 * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            i2 = (i2 * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        if (uri2 != null) {
            return (i2 * 31) + uri2.hashCode();
        }
        return i2;
    }

    public Profile(JSONObject jSONObject) {
        Uri parse;
        this.id = jSONObject.optString("id", null);
        this.firstName = jSONObject.optString("first_name", null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString("last_name", null);
        this.name = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString == null) {
            parse = null;
        } else {
            parse = Uri.parse(optString);
        }
        this.linkUri = parse;
        String optString2 = jSONObject.optString("picture_uri", null);
        this.pictureUri = optString2 != null ? Uri.parse(optString2) : null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        if (((str5 == null && ((Profile) obj).id == null) || o.LJ(str5, ((Profile) obj).id)) && ((((str = this.firstName) == null && ((Profile) obj).firstName == null) || o.LJ(str, ((Profile) obj).firstName)) && ((((str2 = this.middleName) == null && ((Profile) obj).middleName == null) || o.LJ(str2, ((Profile) obj).middleName)) && ((((str3 = this.lastName) == null && ((Profile) obj).lastName == null) || o.LJ(str3, ((Profile) obj).lastName)) && ((((str4 = this.name) == null && ((Profile) obj).name == null) || o.LJ(str4, ((Profile) obj).name)) && ((((uri = this.linkUri) == null && ((Profile) obj).linkUri == null) || o.LJ(uri, ((Profile) obj).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) obj).pictureUri == null) || o.LJ(uri2, ((Profile) obj).pictureUri)))))))) {
            return true;
        }
        return false;
    }

    public Profile(Parcel parcel) {
        Uri parse;
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            parse = null;
        } else {
            parse = Uri.parse(readString);
        }
        this.linkUri = parse;
        String readString2 = parcel.readString();
        this.pictureUri = readString2 != null ? Uri.parse(readString2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        String uri;
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        Uri uri2 = this.linkUri;
        String str = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        dest.writeString(uri);
        Uri uri3 = this.pictureUri;
        if (uri3 != null) {
            str = uri3.toString();
        }
        dest.writeString(str);
    }

    public Profile(Uri uri, Uri uri2, String str, String str2, String str3, String str4, String str5) {
        Q4J.LJFF(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }
}
