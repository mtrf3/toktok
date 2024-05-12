package com.google.android.gms.common.server.converter;

import X.C67310QbK;
import X.C79057V0z;
import X.InterfaceC67309QbJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements InterfaceC67309QbJ<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C67310QbK();
    public final int LJLIL;
    public final HashMap<String, Integer> zab;
    public final SparseArray<String> zac;

    public StringToIntConverter() {
        this.LJLIL = 1;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
    }

    public final /* bridge */ /* synthetic */ Object LJJJJL(Object obj) {
        String str = this.zac.get(((Integer) obj).intValue());
        if (str == null && this.zab.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    public StringToIntConverter(int i, ArrayList<zac> arrayList) {
        this.LJLIL = i;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) ListProtector.get(arrayList, i2);
            String str = zacVar.LJLILLLLZI;
            int i3 = zacVar.LJLJI;
            this.zab.put(str, Integer.valueOf(i3));
            this.zac.put(i3, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, this.zab.get(str).intValue()));
        }
        C79057V0z.LJLIIL(parcel, 2, arrayList, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
