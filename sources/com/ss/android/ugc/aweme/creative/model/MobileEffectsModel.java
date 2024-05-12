package com.ss.android.ugc.aweme.creative.model;

import X.C36437ERt;
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
public final class MobileEffectsModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<MobileEffectsModel> CREATOR = new C36437ERt();

    @InterfaceC65349Pkn("exported_effects")
    public List<UploadableMobileEffect> exportedEffects;

    @InterfaceC65349Pkn("used_draft_effects")
    public List<UploadableDraftEffect> usedDraftEffects;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileEffectsModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.exportedEffects, this.usedDraftEffects};
    }

    public MobileEffectsModel(List<UploadableMobileEffect> exportedEffects, List<UploadableDraftEffect> usedDraftEffects) {
        o.LJIIIZ(exportedEffects, "exportedEffects");
        o.LJIIIZ(usedDraftEffects, "usedDraftEffects");
        this.exportedEffects = exportedEffects;
        this.usedDraftEffects = usedDraftEffects;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.exportedEffects, out);
        while (LIZJ.hasNext()) {
            ((UploadableMobileEffect) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.usedDraftEffects, out);
        while (LIZJ2.hasNext()) {
            ((UploadableDraftEffect) LIZJ2.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ MobileEffectsModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
