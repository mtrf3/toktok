package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C67344Qbs;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C67344Qbs();
    public final PendingIntent zba;
    public final String zbb;
    public final String zbc;
    public final List zbd;
    public final String zbe;
    public final int zbf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.zbd.size() != saveAccountLinkingTokenRequest.zbd.size() || !this.zbd.containsAll(saveAccountLinkingTokenRequest.zbd) || !C64363PNv.LIZ(this.zba, saveAccountLinkingTokenRequest.zba) || !C64363PNv.LIZ(this.zbb, saveAccountLinkingTokenRequest.zbb) || !C64363PNv.LIZ(this.zbc, saveAccountLinkingTokenRequest.zbc) || !C64363PNv.LIZ(this.zbe, saveAccountLinkingTokenRequest.zbe) || this.zbf != saveAccountLinkingTokenRequest.zbf) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zba, i, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
        C79057V0z.LJLI(parcel, 4, this.zbd);
        C79057V0z.LJJZZIII(parcel, 5, this.zbe, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zbf);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.zba = pendingIntent;
        this.zbb = str;
        this.zbc = str2;
        this.zbd = list;
        this.zbe = str3;
        this.zbf = i;
    }
}
