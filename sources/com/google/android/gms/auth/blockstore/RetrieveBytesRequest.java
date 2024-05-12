package com.google.android.gms.auth.blockstore;

import X.C67593Qft;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new C67593Qft();
    public final List zza;
    public final boolean zzb;

    public RetrieveBytesRequest(List list, boolean z) {
        boolean z2;
        if (z) {
            if (list == null || list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            QH7.LJIIJ("retrieveAll was set to true but other constraint(s) was also provided: keys", z2);
        }
        this.zzb = z;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                QH7.LJFF("Element in keys cannot be null or empty", str);
                this.zza.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLI(parcel, 1, Collections.unmodifiableList(this.zza));
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
