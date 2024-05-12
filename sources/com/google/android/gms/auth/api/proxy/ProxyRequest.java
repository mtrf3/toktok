package com.google.android.gms.auth.api.proxy;

import X.C67323QbX;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;
    public final int LJLIL;
    public final Bundle LJLILLLLZI;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C67323QbX();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    public final String toString() {
        return "ProxyRequest[ url: " + this.url + ", method: " + this.httpMethod + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.url, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.httpMethod);
        C79057V0z.LJJLJLI(parcel, 3, this.timeoutMillis);
        C79057V0z.LJJLIIIJ(parcel, 4, this.body, false);
        C79057V0z.LJJLI(parcel, 5, this.LJLILLLLZI);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.LJLIL = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.LJLILLLLZI = bundle;
    }
}
