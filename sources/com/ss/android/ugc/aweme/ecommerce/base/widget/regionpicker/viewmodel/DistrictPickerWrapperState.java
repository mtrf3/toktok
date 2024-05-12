package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictPickerWrapperState extends F9E implements InterfaceC61312at {
    public final boolean close;
    public final boolean done;
    public final boolean physicalBack;
    public final List<Region> selectedRegions;
    public final boolean titleBarBack;

    public DistrictPickerWrapperState() {
        this(false, false, false, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerWrapperState copy$default(DistrictPickerWrapperState districtPickerWrapperState, boolean z, boolean z2, boolean z3, boolean z4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = districtPickerWrapperState.done;
        }
        if ((i & 2) != 0) {
            z2 = districtPickerWrapperState.close;
        }
        if ((i & 4) != 0) {
            z3 = districtPickerWrapperState.titleBarBack;
        }
        if ((i & 8) != 0) {
            z4 = districtPickerWrapperState.physicalBack;
        }
        if ((i & 16) != 0) {
            list = districtPickerWrapperState.selectedRegions;
        }
        return districtPickerWrapperState.copy(z, z2, z3, z4, list);
    }

    public final DistrictPickerWrapperState copy(boolean z, boolean z2, boolean z3, boolean z4, List<Region> selectedRegions) {
        o.LJIIIZ(selectedRegions, "selectedRegions");
        return new DistrictPickerWrapperState(z, z2, z3, z4, selectedRegions);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.done), Boolean.valueOf(this.close), Boolean.valueOf(this.titleBarBack), Boolean.valueOf(this.physicalBack), this.selectedRegions};
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final boolean getPhysicalBack() {
        return this.physicalBack;
    }

    public final List<Region> getSelectedRegions() {
        return this.selectedRegions;
    }

    public final boolean getTitleBarBack() {
        return this.titleBarBack;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List<Region> selectedRegions) {
        o.LJIIIZ(selectedRegions, "selectedRegions");
        this.done = z;
        this.close = z2;
        this.titleBarBack = z3;
        this.physicalBack = z4;
        this.selectedRegions = selectedRegions;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? C61878OQg.INSTANCE : list);
    }
}
