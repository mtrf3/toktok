package com.google.android.gms.cloudmessaging;

import X.C67298Qb8;
import X.C79057V0z;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* loaded from: classes12.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C67298Qb8();
    public Intent zza;
    public Map<String, String> zzb;

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zza, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
