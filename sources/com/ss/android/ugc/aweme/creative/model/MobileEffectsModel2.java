package com.ss.android.ugc.aweme.creative.model;

import X.C36438ERu;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffectsModel2 extends F9E implements Parcelable {
    public static final Parcelable.Creator<MobileEffectsModel2> CREATOR = new C36438ERu();

    @InterfaceC65349Pkn("exported_effects")
    public List<UploadableMobileEffect2> exportedEffects;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileEffectsModel2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.exportedEffects};
    }

    public MobileEffectsModel2(List<UploadableMobileEffect2> exportedEffects) {
        o.LJIIIZ(exportedEffects, "exportedEffects");
        this.exportedEffects = exportedEffects;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.exportedEffects, out);
        while (LIZJ.hasNext()) {
            ((UploadableMobileEffect2) LIZJ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ MobileEffectsModel2(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
