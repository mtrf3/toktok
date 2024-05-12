package com.ss.android.ugc.aweme.creative.model.magic;

import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MagicCombineEffectModel implements Parcelable {
    public static final Parcelable.Creator<MagicCombineEffectModel> CREATOR = new Parcelable.Creator<MagicCombineEffectModel>() { // from class: X.5SO
        @Override // android.os.Parcelable.Creator
        public final MagicCombineEffectModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(MagicCombineEffectModel.class, parcel, arrayList, i, 1);
            }
            return new MagicCombineEffectModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MagicCombineEffectModel[] newArray(int i) {
            return new MagicCombineEffectModel[i];
        }
    };

    @InterfaceC65349Pkn("magic_combine_effect_models")
    public List<CombineEffectPointModel> magicCombineEffectModelList;

    /* JADX WARN: Multi-variable type inference failed */
    public MagicCombineEffectModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MagicCombineEffectModel(List<CombineEffectPointModel> magicCombineEffectModelList) {
        o.LJIIIZ(magicCombineEffectModelList, "magicCombineEffectModelList");
        this.magicCombineEffectModelList = magicCombineEffectModelList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.magicCombineEffectModelList, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
    }

    public /* synthetic */ MagicCombineEffectModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
