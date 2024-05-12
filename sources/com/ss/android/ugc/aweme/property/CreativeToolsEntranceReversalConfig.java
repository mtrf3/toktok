package com.ss.android.ugc.aweme.property;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CreativeToolsEntranceReversalConfig extends F9E {

    @InterfaceC65349Pkn("hide_auto_enhance_on_edit_page")
    public final boolean hideAutoEnhanceOnEditPage;

    @InterfaceC65349Pkn("hide_noise_reduce_on_edit_page")
    public final boolean hideNoiseReduceOnEditPage;

    @InterfaceC65349Pkn("hide_qa_entrance_on_camera_page")
    public final boolean hideQAEntranceOnCameraPage;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeToolsEntranceReversalConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig.<init>():void");
    }

    public static /* synthetic */ CreativeToolsEntranceReversalConfig copy$default(CreativeToolsEntranceReversalConfig creativeToolsEntranceReversalConfig, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = creativeToolsEntranceReversalConfig.hideNoiseReduceOnEditPage;
        }
        if ((i & 2) != 0) {
            z2 = creativeToolsEntranceReversalConfig.hideAutoEnhanceOnEditPage;
        }
        if ((i & 4) != 0) {
            z3 = creativeToolsEntranceReversalConfig.hideQAEntranceOnCameraPage;
        }
        return creativeToolsEntranceReversalConfig.copy(z, z2, z3);
    }

    public final CreativeToolsEntranceReversalConfig copy(boolean z, boolean z2, boolean z3) {
        return new CreativeToolsEntranceReversalConfig(z, z2, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hideNoiseReduceOnEditPage), Boolean.valueOf(this.hideAutoEnhanceOnEditPage), Boolean.valueOf(this.hideQAEntranceOnCameraPage)};
    }

    public final boolean getHideAutoEnhanceOnEditPage() {
        return this.hideAutoEnhanceOnEditPage;
    }

    public final boolean getHideNoiseReduceOnEditPage() {
        return this.hideNoiseReduceOnEditPage;
    }

    public final boolean getHideQAEntranceOnCameraPage() {
        return this.hideQAEntranceOnCameraPage;
    }

    public CreativeToolsEntranceReversalConfig(boolean z, boolean z2, boolean z3) {
        this.hideNoiseReduceOnEditPage = z;
        this.hideAutoEnhanceOnEditPage = z2;
        this.hideQAEntranceOnCameraPage = z3;
    }

    public /* synthetic */ CreativeToolsEntranceReversalConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
