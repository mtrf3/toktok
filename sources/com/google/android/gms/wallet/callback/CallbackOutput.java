package com.google.android.gms.wallet.callback;

import X.C47523Ikx;
import X.C67302QbC;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackOutput> CREATOR = new C67302QbC();
    public int LJLIL;
    public int LJLILLLLZI;
    public final byte[] LJLJI;
    public String LJLJJI;

    public static C47523Ikx LJJJJL() {
        return new C47523Ikx(new CallbackOutput());
    }

    public CallbackOutput() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.LJLILLLLZI);
        C79057V0z.LJJLIIIJ(parcel, 3, this.LJLJI, false);
        C79057V0z.LJJZZIII(parcel, 4, this.LJLJJI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CallbackOutput(String str, int i, int i2, byte[] bArr) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = bArr;
        this.LJLJJI = str;
    }
}
