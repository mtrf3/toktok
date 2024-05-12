package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27238AmY;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Rule implements Parcelable {
    public static final Parcelable.Creator<Rule> CREATOR = new C27238AmY();

    @InterfaceC65349Pkn("error")
    public final String error;

    @InterfaceC65349Pkn("match_type")
    public final String matchType;

    @InterfaceC65349Pkn("regex")
    public final String regex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return o.LJ(this.error, rule.error) && o.LJ(this.regex, rule.regex) && o.LJ(this.matchType, rule.matchType);
    }

    public final int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regex;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchType;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.error);
        out.writeString(this.regex);
        out.writeString(this.matchType);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rule(error=");
        LIZ.append(this.error);
        LIZ.append(", regex=");
        LIZ.append(this.regex);
        LIZ.append(", matchType=");
        return q.LIZIZ(LIZ, this.matchType, ')', LIZ);
    }

    public Rule(String str, String str2, String str3) {
        this.error = str;
        this.regex = str2;
        this.matchType = str3;
    }
}
