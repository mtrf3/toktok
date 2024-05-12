package com.ss.android.ugc.aweme.sticker.panel.info;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EffectInfoPanelState extends UiState {
    public final String creatorName;
    public final Effect effect;
    public final boolean isDiscoverVisible;
    public final boolean isFavorite;
    public final boolean isFavoriteVisible;
    public final boolean isPreviouslyVisible;
    public final boolean isReportAndBlockVisible;
    public final AbstractC81666W3i ui;
    public final String userId;
    public final boolean wasVisible;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EffectInfoPanelState() {
        /*
            r13 = this;
            r1 = 0
            r4 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState.<init>():void");
    }

    public static /* synthetic */ EffectInfoPanelState copy$default(EffectInfoPanelState effectInfoPanelState, Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            effect = effectInfoPanelState.effect;
        }
        if ((i & 2) != 0) {
            str = effectInfoPanelState.creatorName;
        }
        if ((i & 4) != 0) {
            str2 = effectInfoPanelState.userId;
        }
        if ((i & 8) != 0) {
            z = effectInfoPanelState.isFavorite;
        }
        if ((i & 16) != 0) {
            z2 = effectInfoPanelState.isFavoriteVisible;
        }
        if ((i & 32) != 0) {
            z3 = effectInfoPanelState.isReportAndBlockVisible;
        }
        if ((i & 64) != 0) {
            z4 = effectInfoPanelState.isDiscoverVisible;
        }
        if ((i & 128) != 0) {
            z5 = effectInfoPanelState.isPreviouslyVisible;
        }
        if ((i & 256) != 0) {
            z6 = effectInfoPanelState.wasVisible;
        }
        if ((i & 512) != 0) {
            abstractC81666W3i = effectInfoPanelState.getUi();
        }
        return effectInfoPanelState.copy(effect, str, str2, z, z2, z3, z4, z5, z6, abstractC81666W3i);
    }

    public final AbstractC81666W3i component10() {
        return getUi();
    }

    public final EffectInfoPanelState copy(Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new EffectInfoPanelState(effect, str, str2, z, z2, z3, z4, z5, z6, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectInfoPanelState)) {
            return false;
        }
        EffectInfoPanelState effectInfoPanelState = (EffectInfoPanelState) obj;
        return o.LJ(this.effect, effectInfoPanelState.effect) && o.LJ(this.creatorName, effectInfoPanelState.creatorName) && o.LJ(this.userId, effectInfoPanelState.userId) && this.isFavorite == effectInfoPanelState.isFavorite && this.isFavoriteVisible == effectInfoPanelState.isFavoriteVisible && this.isReportAndBlockVisible == effectInfoPanelState.isReportAndBlockVisible && this.isDiscoverVisible == effectInfoPanelState.isDiscoverVisible && this.isPreviouslyVisible == effectInfoPanelState.isPreviouslyVisible && this.wasVisible == effectInfoPanelState.wasVisible && o.LJ(getUi(), effectInfoPanelState.getUi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Effect effect = this.effect;
        int hashCode = (effect == null ? 0 : effect.hashCode()) * 31;
        String str = this.creatorName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isFavorite;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.isFavoriteVisible;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isReportAndBlockVisible;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isDiscoverVisible;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.isPreviouslyVisible;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        return getUi().hashCode() + ((((i8 + i9) * 31) + (this.wasVisible ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectInfoPanelState(effect=");
        LIZ.append(this.effect);
        LIZ.append(", creatorName=");
        LIZ.append(this.creatorName);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", isFavorite=");
        LIZ.append(this.isFavorite);
        LIZ.append(", isFavoriteVisible=");
        LIZ.append(this.isFavoriteVisible);
        LIZ.append(", isReportAndBlockVisible=");
        LIZ.append(this.isReportAndBlockVisible);
        LIZ.append(", isDiscoverVisible=");
        LIZ.append(this.isDiscoverVisible);
        LIZ.append(", isPreviouslyVisible=");
        LIZ.append(this.isPreviouslyVisible);
        LIZ.append(", wasVisible=");
        LIZ.append(this.wasVisible);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getWasVisible() {
        return this.wasVisible;
    }

    public final boolean isDiscoverVisible() {
        return this.isDiscoverVisible;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFavoriteVisible() {
        return this.isFavoriteVisible;
    }

    public final boolean isPreviouslyVisible() {
        return this.isPreviouslyVisible;
    }

    public final boolean isReportAndBlockVisible() {
        return this.isReportAndBlockVisible;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectInfoPanelState(Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.effect = effect;
        this.creatorName = str;
        this.userId = str2;
        this.isFavorite = z;
        this.isFavoriteVisible = z2;
        this.isReportAndBlockVisible = z3;
        this.isDiscoverVisible = z4;
        this.isPreviouslyVisible = z5;
        this.wasVisible = z6;
        this.ui = ui;
    }

    public /* synthetic */ EffectInfoPanelState(Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect, (i & 2) != 0 ? null : str, (i & 4) == 0 ? str2 : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) == 0 ? z6 : false, (i & 512) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
