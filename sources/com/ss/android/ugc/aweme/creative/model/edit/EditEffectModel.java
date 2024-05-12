package com.ss.android.ugc.aweme.creative.model.edit;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditEffectModel implements Parcelable {
    public static final Parcelable.Creator<EditEffectModel> CREATOR = new Parcelable.Creator<EditEffectModel>() { // from class: X.5YZ
        @Override // android.os.Parcelable.Creator
        public final EditEffectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(EditEffectModel.class, parcel, arrayList, i, 1);
            }
            EffectPointModel effectPointModel = (EffectPointModel) parcel.readParcelable(EditEffectModel.class.getClassLoader());
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EditEffectModel(arrayList, effectPointModel, readInt2, z, z2, z3, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final EditEffectModel[] newArray(int i) {
            return new EditEffectModel[i];
        }
    };

    @InterfaceC65349Pkn("effect_from_path")
    public List<String> effectFromPaths;

    @InterfaceC65349Pkn("effect_list")
    public ArrayList<EffectPointModel> effectList;

    @InterfaceC65349Pkn("selected_effect_pro")
    public int effectSource;

    @InterfaceC65349Pkn("force_enter_multi_track")
    public boolean forceEnterMultiTrack;

    @InterfaceC65349Pkn("is_edit_effect_duration")
    public boolean hasClippedEffect;

    @InterfaceC65349Pkn("has_multi_track_effect")
    public boolean hasMultiTrackEffect;

    @InterfaceC65349Pkn("time_effect")
    public EffectPointModel timeEffect;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditEffectModel() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r1
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ArrayList<EffectPointModel> arrayList = this.effectList;
        out.writeInt(arrayList.size());
        Iterator<EffectPointModel> it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable(it.next(), i);
        }
        out.writeParcelable(this.timeEffect, i);
        out.writeInt(this.effectSource);
        out.writeInt(this.hasMultiTrackEffect ? 1 : 0);
        out.writeInt(this.forceEnterMultiTrack ? 1 : 0);
        out.writeInt(this.hasClippedEffect ? 1 : 0);
        out.writeStringList(this.effectFromPaths);
    }

    public EditEffectModel(ArrayList<EffectPointModel> effectList, EffectPointModel effectPointModel, int i, boolean z, boolean z2, boolean z3, List<String> effectFromPaths) {
        o.LJIIIZ(effectList, "effectList");
        o.LJIIIZ(effectFromPaths, "effectFromPaths");
        this.effectList = effectList;
        this.timeEffect = effectPointModel;
        this.effectSource = i;
        this.hasMultiTrackEffect = z;
        this.forceEnterMultiTrack = z2;
        this.hasClippedEffect = z3;
        this.effectFromPaths = effectFromPaths;
    }

    public /* synthetic */ EditEffectModel(ArrayList arrayList, EffectPointModel effectPointModel, int i, boolean z, boolean z2, boolean z3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? null : effectPointModel, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? new ArrayList() : list);
    }
}
