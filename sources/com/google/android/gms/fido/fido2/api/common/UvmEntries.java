package com.google.android.gms.fido.fido2.api.common;

import X.C67552QfE;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes12.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new C67552QfE();
    public final List zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.zza)});
    }

    public UvmEntries(List list) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list = this.zza;
        if (list == null) {
            if (uvmEntries.zza != null) {
                return false;
            }
        } else {
            List list2 = uvmEntries.zza;
            if (list2 == null || !list.containsAll(list2) || !uvmEntries.zza.containsAll(this.zza)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIL(parcel, 1, this.zza, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
