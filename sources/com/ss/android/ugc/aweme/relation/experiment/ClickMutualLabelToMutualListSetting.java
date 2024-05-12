package com.ss.android.ugc.aweme.relation.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ClickMutualLabelToMutualListSetting extends F9E {

    @InterfaceC65349Pkn("enable_profile_others")
    public final boolean enableProfileOthers;

    @InterfaceC65349Pkn("enable_video_feed")
    public final boolean enableVideoFeed;

    @InterfaceC65349Pkn("fold_mutual_number")
    public final int foldMutualNumber;

    @InterfaceC65349Pkn("is_mutual_sheet_style")
    public final boolean isMutualSheetStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickMutualLabelToMutualListSetting() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableVideoFeed), Boolean.valueOf(this.enableProfileOthers), Boolean.valueOf(this.isMutualSheetStyle), Integer.valueOf(this.foldMutualNumber)};
    }

    public ClickMutualLabelToMutualListSetting(boolean z, boolean z2, boolean z3, int i) {
        this.enableVideoFeed = z;
        this.enableProfileOthers = z2;
        this.isMutualSheetStyle = z3;
        this.foldMutualNumber = i;
    }

    public /* synthetic */ ClickMutualLabelToMutualListSetting(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 3 : i);
    }
}
