package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.B28;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RedirectContent implements Parcelable {
    public static final Parcelable.Creator<RedirectContent> CREATOR = new B28();

    @InterfaceC65349Pkn("close_page")
    public final Boolean closePage;

    @InterfaceC65349Pkn("jump_schema")
    public final String jumpSchema;

    public static /* synthetic */ RedirectContent copy$default(RedirectContent redirectContent, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redirectContent.jumpSchema;
        }
        if ((i & 2) != 0) {
            bool = redirectContent.closePage;
        }
        return redirectContent.copy(str, bool);
    }

    public final RedirectContent copy(String str, Boolean bool) {
        return new RedirectContent(str, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectContent)) {
            return false;
        }
        RedirectContent redirectContent = (RedirectContent) obj;
        return o.LJ(this.jumpSchema, redirectContent.jumpSchema) && o.LJ(this.closePage, redirectContent.closePage);
    }

    public int hashCode() {
        String str = this.jumpSchema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.closePage;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.jumpSchema);
        Boolean bool = this.closePage;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RedirectContent(jumpSchema=");
        LIZ.append(this.jumpSchema);
        LIZ.append(", closePage=");
        return C78920UyC.LIZIZ(LIZ, this.closePage, ')', LIZ);
    }

    public final Boolean getClosePage() {
        return this.closePage;
    }

    public final String getJumpSchema() {
        return this.jumpSchema;
    }

    public RedirectContent(String str, Boolean bool) {
        this.jumpSchema = str;
        this.closePage = bool;
    }
}
