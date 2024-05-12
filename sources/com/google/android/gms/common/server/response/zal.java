package com.google.android.gms.common.server.response;

import X.C67314QbO;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes12.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C67314QbO();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final ArrayList<zam> LJLJI;

    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.LJLIL = 1;
        this.LJLILLLLZI = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.LJLJI = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLILLLLZI, false);
        C79057V0z.LJLIIL(parcel, 3, this.LJLJI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zal(int i, String str, ArrayList<zam> arrayList) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = arrayList;
    }
}
