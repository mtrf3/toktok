package com.google.android.gms.auth.blockstore;

import X.C68427QtL;
import X.C68428QtM;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new C68427QtL();
    public final Bundle zza;
    public final List zzb;
    public final Map zzc;

    public final Map<String, BlockstoreData> LJJJJL() {
        return Collections.unmodifiableMap(this.zzc);
    }

    /* loaded from: classes12.dex */
    public static class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new C68428QtM();
        public final byte[] zza;
        public final String zzb;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza))});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
        }

        public BlockstoreData(byte[] bArr, String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJLIIIJ(parcel, 1, this.zza, false);
            C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.zzb, blockstoreData);
        }
        this.zzc = hashMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLI(parcel, 1, this.zza);
        C79057V0z.LJLIIL(parcel, 2, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
