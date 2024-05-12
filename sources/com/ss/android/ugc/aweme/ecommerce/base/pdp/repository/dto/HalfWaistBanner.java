package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RV3;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HalfWaistBanner implements Parcelable {
    public static final Parcelable.Creator<HalfWaistBanner> CREATOR = new RV3();

    @InterfaceC65349Pkn("background_image")
    public final GImage backgroundImage;

    @InterfaceC65349Pkn("left_image")
    public final GImage leftImage;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfWaistBanner)) {
            return false;
        }
        HalfWaistBanner halfWaistBanner = (HalfWaistBanner) obj;
        return o.LJ(this.backgroundImage, halfWaistBanner.backgroundImage) && o.LJ(this.leftImage, halfWaistBanner.leftImage) && o.LJ(this.text, halfWaistBanner.text) && o.LJ(this.textColor, halfWaistBanner.textColor);
    }

    public final int hashCode() {
        GImage gImage = this.backgroundImage;
        int hashCode = (gImage == null ? 0 : gImage.hashCode()) * 31;
        GImage gImage2 = this.leftImage;
        int hashCode2 = (hashCode + (gImage2 == null ? 0 : gImage2.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.backgroundImage, i);
        out.writeParcelable(this.leftImage, i);
        out.writeString(this.text);
        out.writeString(this.textColor);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HalfWaistBanner(backgroundImage=");
        LIZ.append(this.backgroundImage);
        LIZ.append(", leftImage=");
        LIZ.append(this.leftImage);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", textColor=");
        return q.LIZIZ(LIZ, this.textColor, ')', LIZ);
    }

    public HalfWaistBanner(GImage gImage, GImage gImage2, String str, String str2) {
        this.backgroundImage = gImage;
        this.leftImage = gImage2;
        this.text = str;
        this.textColor = str2;
    }
}
