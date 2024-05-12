package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EffectPanelRedesignConfig extends F9E {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("studio_add_effect_name")
    public final boolean addEffectName;

    @InterfaceC65349Pkn("studio_4_grid_layout")
    public final boolean effectPanel4GridLayout;

    @InterfaceC65349Pkn("studio_enter_new_effect_page")
    public final boolean enterNewEffectPanel;

    @InterfaceC65349Pkn("studio_new_effect_name_display")
    public final boolean newEffectNameDisplay;

    @InterfaceC65349Pkn("studio_strengthen_effect_name_display")
    public final boolean strengthenEffectNameDisplay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EffectPanelRedesignConfig() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.EffectPanelRedesignConfig.<init>():void");
    }

    public static /* synthetic */ EffectPanelRedesignConfig copy$default(EffectPanelRedesignConfig effectPanelRedesignConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = effectPanelRedesignConfig.effectPanel4GridLayout;
        }
        if ((i & 2) != 0) {
            z2 = effectPanelRedesignConfig.strengthenEffectNameDisplay;
        }
        if ((i & 4) != 0) {
            z3 = effectPanelRedesignConfig.newEffectNameDisplay;
        }
        if ((i & 8) != 0) {
            z4 = effectPanelRedesignConfig.enterNewEffectPanel;
        }
        if ((i & 16) != 0) {
            z5 = effectPanelRedesignConfig.addEffectName;
        }
        return effectPanelRedesignConfig.copy(z, z2, z3, z4, z5);
    }

    public final EffectPanelRedesignConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new EffectPanelRedesignConfig(z, z2, z3, z4, z5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.effectPanel4GridLayout), Boolean.valueOf(this.strengthenEffectNameDisplay), Boolean.valueOf(this.newEffectNameDisplay), Boolean.valueOf(this.enterNewEffectPanel), Boolean.valueOf(this.addEffectName)};
    }

    public final boolean getAddEffectName() {
        return this.addEffectName;
    }

    public final boolean getEffectPanel4GridLayout() {
        return this.effectPanel4GridLayout;
    }

    public final boolean getEnterNewEffectPanel() {
        return this.enterNewEffectPanel;
    }

    public final boolean getNewEffectNameDisplay() {
        return this.newEffectNameDisplay;
    }

    public final boolean getStrengthenEffectNameDisplay() {
        return this.strengthenEffectNameDisplay;
    }

    public EffectPanelRedesignConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.effectPanel4GridLayout = z;
        this.strengthenEffectNameDisplay = z2;
        this.newEffectNameDisplay = z3;
        this.enterNewEffectPanel = z4;
        this.addEffectName = z5;
    }

    public /* synthetic */ EffectPanelRedesignConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
