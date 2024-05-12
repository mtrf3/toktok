package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.S6B;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UploadConfigData extends F9E implements Parcelable {
    public static final Parcelable.Creator<UploadConfigData> CREATOR = new S6B();

    @InterfaceC65349Pkn("access_key_id")
    public final String accessKey;

    @InterfaceC65349Pkn("imagex_host")
    public final String imagexHost;

    @InterfaceC65349Pkn("secret_access_key")
    public final String secretKey;

    @InterfaceC65349Pkn("service_id")
    public final String serviceId;

    @InterfaceC65349Pkn("session_token")
    public final String sessionToken;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.accessKey, this.secretKey, this.sessionToken, this.imagexHost, this.serviceId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.accessKey);
        out.writeString(this.secretKey);
        out.writeString(this.sessionToken);
        out.writeString(this.imagexHost);
        out.writeString(this.serviceId);
    }

    public UploadConfigData(String accessKey, String secretKey, String sessionToken, String imagexHost, String serviceId) {
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(secretKey, "secretKey");
        o.LJIIIZ(sessionToken, "sessionToken");
        o.LJIIIZ(imagexHost, "imagexHost");
        o.LJIIIZ(serviceId, "serviceId");
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.sessionToken = sessionToken;
        this.imagexHost = imagexHost;
        this.serviceId = serviceId;
    }
}
