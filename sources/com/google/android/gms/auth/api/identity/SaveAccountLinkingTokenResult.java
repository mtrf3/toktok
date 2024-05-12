package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C68752Qya;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new C68752Qya();
    public final PendingIntent zba;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba});
    }

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.zba = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenResult)) {
            return false;
        }
        return C64363PNv.LIZ(this.zba, ((SaveAccountLinkingTokenResult) obj).zba);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zba, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
