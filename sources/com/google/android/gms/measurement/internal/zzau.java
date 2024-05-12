package com.google.android.gms.measurement.internal;

import X.C16880lQ;
import X.C68181QpN;
import X.C68182QpO;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C68181QpN();
    public final Bundle zza;

    public final int LJJJJL() {
        return this.zza.size();
    }

    public final Bundle LJJJJZI() {
        return new Bundle(this.zza);
    }

    public final Double LJJJLIIL() {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final Long LJJL() {
        return Long.valueOf(this.zza.getLong("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C68182QpO(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public zzau(Bundle bundle) {
        this.zza = bundle;
    }

    public final Object LJJLIIIIJ(String str) {
        return C16880lQ.LLJJIII(this.zza, str);
    }

    public final String LJJLIIIJ(String str) {
        return this.zza.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLI(parcel, 2, LJJJJZI());
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
