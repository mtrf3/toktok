package com.google.android.gms.auth.api.proxy;

import X.C67632QgW;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C67632QgW();
    public final int LJLIL;
    public final Bundle LJLILLLLZI;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.googlePlayServicesStatusCode);
        C79057V0z.LJJZZI(parcel, 2, this.recoveryAction, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.statusCode);
        C79057V0z.LJJLI(parcel, 4, this.LJLILLLLZI);
        C79057V0z.LJJLIIIJ(parcel, 5, this.body, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.LJLIL = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.LJLILLLLZI = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }
}
