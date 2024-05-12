package com.google.android.gms.signin.internal;

import X.C67853Qk5;
import X.C79057V0z;
import X.InterfaceC67754QiU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes12.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC67754QiU {
    public static final Parcelable.Creator<zag> CREATOR = new C67853Qk5();
    public final List<String> zaa;
    public final String zab;

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        if (this.zab != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public zag(List<String> list, String str) {
        this.zaa = list;
        this.zab = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLI(parcel, 1, this.zaa);
        C79057V0z.LJJZZIII(parcel, 2, this.zab, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
