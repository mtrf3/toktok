package com.ss.android.ugc.aweme.viewModel;

import X.F9E;
import X.InterfaceC61312at;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class ProfileNaviSpinnerState extends F9E implements InterfaceC61312at {
    public boolean shouldShowSpinner;

    public ProfileNaviSpinnerState() {
        this(false, 1, null);
    }

    public static /* synthetic */ ProfileNaviSpinnerState copy$default(ProfileNaviSpinnerState profileNaviSpinnerState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileNaviSpinnerState.shouldShowSpinner;
        }
        return profileNaviSpinnerState.copy(z);
    }

    public final ProfileNaviSpinnerState copy(boolean z) {
        return new ProfileNaviSpinnerState(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.shouldShowSpinner)};
    }

    public final boolean getShouldShowSpinner() {
        return this.shouldShowSpinner;
    }

    public ProfileNaviSpinnerState(boolean z) {
        this.shouldShowSpinner = z;
    }

    public final void setShouldShowSpinner(boolean z) {
        this.shouldShowSpinner = z;
    }

    public /* synthetic */ ProfileNaviSpinnerState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
