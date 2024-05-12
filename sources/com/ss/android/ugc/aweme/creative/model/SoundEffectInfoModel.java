package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundEffectInfoModel implements Parcelable {
    public static final Parcelable.Creator<SoundEffectInfoModel> CREATOR = new Parcelable.Creator<SoundEffectInfoModel>() { // from class: X.5ge
        @Override // android.os.Parcelable.Creator
        public final SoundEffectInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z2 = false;
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SoundEffect.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new SoundEffectInfoModel(arrayList, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final SoundEffectInfoModel[] newArray(int i) {
            return new SoundEffectInfoModel[i];
        }
    };

    @GPV
    public boolean enableStatus;

    @GPV
    public boolean shouldShowRemoveToast;

    @InterfaceC65349Pkn("sound_effect_list")
    public List<SoundEffect> soundEffectList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SoundEffectInfoModel() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.soundEffectList, out);
        while (LIZJ.hasNext()) {
            ((SoundEffect) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeInt(this.shouldShowRemoveToast ? 1 : 0);
        out.writeInt(this.enableStatus ? 1 : 0);
    }

    public SoundEffectInfoModel(List<SoundEffect> soundEffectList, boolean z, boolean z2) {
        o.LJIIIZ(soundEffectList, "soundEffectList");
        this.soundEffectList = soundEffectList;
        this.shouldShowRemoveToast = z;
        this.enableStatus = z2;
    }

    public /* synthetic */ SoundEffectInfoModel(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
