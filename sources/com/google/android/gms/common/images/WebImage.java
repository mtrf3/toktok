package com.google.android.gms.common.images;

import X.C16880lQ;
import X.C64363PNv;
import X.C67304QbE;
import X.C79057V0z;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C67304QbE();
    public final int LJLIL;
    public final Uri zab;
    public final int zac;
    public final int zad;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad)});
    }

    public final String toString() {
        return C16880lQ.LLLZI(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString()});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WebImage(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r3 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L12
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r5, r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r0 = "width"
            r2 = 0
            int r1 = r5.optInt(r0, r2)
            java.lang.String r0 = "height"
            int r0 = r5.optInt(r0, r2)
            r4.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C64363PNv.LIZ(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.zab, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zac);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zad);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri != null) {
            if (i >= 0 && i2 >= 0) {
                return;
            } else {
                throw new IllegalArgumentException("width and height must not be negative");
            }
        }
        throw new IllegalArgumentException("url cannot be null");
    }

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.LJLIL = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }
}
