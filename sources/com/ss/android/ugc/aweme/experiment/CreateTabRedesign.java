package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CreateTabRedesign extends F9E {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("studio_create_tab_add_effect_name")
    public final boolean createPanelAddEffectName;

    @InterfaceC65349Pkn("studio_create_tab_span_count")
    public final int createPanelGridSpanCount;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateTabRedesign() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ CreateTabRedesign copy$default(CreateTabRedesign createTabRedesign, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createTabRedesign.createPanelGridSpanCount;
        }
        if ((i2 & 2) != 0) {
            z = createTabRedesign.createPanelAddEffectName;
        }
        return createTabRedesign.copy(i, z);
    }

    public final CreateTabRedesign copy(int i, boolean z) {
        return new CreateTabRedesign(i, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.createPanelGridSpanCount), Boolean.valueOf(this.createPanelAddEffectName)};
    }

    public final boolean getCreatePanelAddEffectName() {
        return this.createPanelAddEffectName;
    }

    public final int getCreatePanelGridSpanCount() {
        return this.createPanelGridSpanCount;
    }

    public CreateTabRedesign(int i, boolean z) {
        this.createPanelGridSpanCount = i;
        this.createPanelAddEffectName = z;
    }

    public /* synthetic */ CreateTabRedesign(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z);
    }
}
