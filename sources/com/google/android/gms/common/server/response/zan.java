package com.google.android.gms.common.server.response;

import X.C1DI;
import X.C67313QbN;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C67313QbN();
    public final int LJLIL;
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zab;
    public final String zac;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zab.get(str);
            for (String str2 : map.keySet()) {
                C1DI.LIZIZ(sb, "  ", str2, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> LJJJJL(String str) {
        return this.zab.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zal(str, this.zab.get(str)));
        }
        C79057V0z.LJLIIL(parcel, 2, arrayList, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zac, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zan(int i, String str, ArrayList arrayList) {
        this.LJLIL = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) ListProtector.get(arrayList, i2);
            String str2 = zalVar.LJLILLLLZI;
            HashMap hashMap2 = new HashMap();
            ArrayList<zam> arrayList2 = zalVar.LJLJI;
            QH7.LJIIIIZZ(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) ListProtector.get(zalVar.LJLJI, i3);
                hashMap2.put(zamVar.LJLILLLLZI, zamVar.LJLJI);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        QH7.LJIIIIZZ(str);
        this.zac = str;
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zab.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).zaj = this;
            }
        }
    }
}
