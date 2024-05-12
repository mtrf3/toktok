package com.ss.android.ugc.aweme.viewModel;

import X.F9E;
import X.InterfaceC61312at;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class ProfileNaviHubState extends F9E implements InterfaceC61312at {
    public boolean isContinueEditing;
    public boolean isDoneNaviExperience;
    public boolean isNaviDeleted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviHubState() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState.<init>():void");
    }

    public static /* synthetic */ ProfileNaviHubState copy$default(ProfileNaviHubState profileNaviHubState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileNaviHubState.isContinueEditing;
        }
        if ((i & 2) != 0) {
            z2 = profileNaviHubState.isDoneNaviExperience;
        }
        if ((i & 4) != 0) {
            z3 = profileNaviHubState.isNaviDeleted;
        }
        return profileNaviHubState.copy(z, z2, z3);
    }

    public final ProfileNaviHubState copy(boolean z, boolean z2, boolean z3) {
        return new ProfileNaviHubState(z, z2, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isContinueEditing), Boolean.valueOf(this.isDoneNaviExperience), Boolean.valueOf(this.isNaviDeleted)};
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneNaviExperience() {
        return this.isDoneNaviExperience;
    }

    public final boolean isNaviDeleted() {
        return this.isNaviDeleted;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneNaviExperience(boolean z) {
        this.isDoneNaviExperience = z;
    }

    public final void setNaviDeleted(boolean z) {
        this.isNaviDeleted = z;
    }

    public ProfileNaviHubState(boolean z, boolean z2, boolean z3) {
        this.isContinueEditing = z;
        this.isDoneNaviExperience = z2;
        this.isNaviDeleted = z3;
    }

    public /* synthetic */ ProfileNaviHubState(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
