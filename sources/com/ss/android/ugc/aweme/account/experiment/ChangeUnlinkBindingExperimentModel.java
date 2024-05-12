package com.ss.android.ugc.aweme.account.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ChangeUnlinkBindingExperimentModel extends F9E {

    @InterfaceC65349Pkn("allow_change_bindings_v2")
    public final boolean allowChangeBindings;

    @InterfaceC65349Pkn("allow_unlink_bindings_v2")
    public final boolean allowUnlinkBindings;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChangeUnlinkBindingExperimentModel() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.experiment.ChangeUnlinkBindingExperimentModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.allowChangeBindings), Boolean.valueOf(this.allowUnlinkBindings)};
    }

    public ChangeUnlinkBindingExperimentModel(boolean z, boolean z2) {
        this.allowChangeBindings = z;
        this.allowUnlinkBindings = z2;
    }

    public /* synthetic */ ChangeUnlinkBindingExperimentModel(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
