package com.google.android.gms.wallet.callback;

import X.C67301QbB;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackInput> CREATOR = new C67301QbB();
    public final byte[] LJLIL;
    public int zza;

    public CallbackInput() {
    }

    public CallbackInput(int i, byte[] bArr) {
        this.zza = i;
        this.LJLIL = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zza);
        C79057V0z.LJJLIIIJ(parcel, 2, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
