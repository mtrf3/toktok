package com.ss.android.ugc.aweme.viewModel;

import X.C48339Iy7;
import X.C72626Ses;
import X.InterfaceC61312at;
import X.RTR;
import X.X1D;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviOnboardingState implements InterfaceC61312at {
    public boolean allowCameraFeature;
    public C72626Ses onboardingStepState;
    public boolean shouldShowAutoCreation;
    public boolean shouldStartAutoCreation;
    public Integer starterAvatarId;
    public List<RTR> starterAvatarList;
    public ProfileNaviDataModel starterAvatarSelected;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviOnboardingState() {
        /*
            r10 = this;
            r1 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r5
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviOnboardingState copy$default(ProfileNaviOnboardingState profileNaviOnboardingState, C72626Ses c72626Ses, List list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            c72626Ses = profileNaviOnboardingState.onboardingStepState;
        }
        if ((i & 2) != 0) {
            list = profileNaviOnboardingState.starterAvatarList;
        }
        if ((i & 4) != 0) {
            num = profileNaviOnboardingState.starterAvatarId;
        }
        if ((i & 8) != 0) {
            profileNaviDataModel = profileNaviOnboardingState.starterAvatarSelected;
        }
        if ((i & 16) != 0) {
            z = profileNaviOnboardingState.shouldStartAutoCreation;
        }
        if ((i & 32) != 0) {
            z2 = profileNaviOnboardingState.shouldShowAutoCreation;
        }
        if ((i & 64) != 0) {
            z3 = profileNaviOnboardingState.allowCameraFeature;
        }
        return profileNaviOnboardingState.copy(c72626Ses, list, num, profileNaviDataModel, z, z2, z3);
    }

    public final ProfileNaviOnboardingState copy(C72626Ses onboardingStepState, List<RTR> list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(onboardingStepState, "onboardingStepState");
        return new ProfileNaviOnboardingState(onboardingStepState, list, num, profileNaviDataModel, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviOnboardingState)) {
            return false;
        }
        ProfileNaviOnboardingState profileNaviOnboardingState = (ProfileNaviOnboardingState) obj;
        return o.LJ(this.onboardingStepState, profileNaviOnboardingState.onboardingStepState) && o.LJ(this.starterAvatarList, profileNaviOnboardingState.starterAvatarList) && o.LJ(this.starterAvatarId, profileNaviOnboardingState.starterAvatarId) && o.LJ(this.starterAvatarSelected, profileNaviOnboardingState.starterAvatarSelected) && this.shouldStartAutoCreation == profileNaviOnboardingState.shouldStartAutoCreation && this.shouldShowAutoCreation == profileNaviOnboardingState.shouldShowAutoCreation && this.allowCameraFeature == profileNaviOnboardingState.allowCameraFeature;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.onboardingStepState.hashCode() * 31;
        List<RTR> list = this.starterAvatarList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.starterAvatarId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ProfileNaviDataModel profileNaviDataModel = this.starterAvatarSelected;
        int hashCode4 = (hashCode3 + (profileNaviDataModel != null ? profileNaviDataModel.hashCode() : 0)) * 31;
        boolean z = this.shouldStartAutoCreation;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.shouldShowAutoCreation;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.allowCameraFeature ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviOnboardingState(onboardingStepState=");
        LIZ.append(this.onboardingStepState);
        LIZ.append(", starterAvatarList=");
        LIZ.append(this.starterAvatarList);
        LIZ.append(", starterAvatarId=");
        LIZ.append(this.starterAvatarId);
        LIZ.append(", starterAvatarSelected=");
        LIZ.append(this.starterAvatarSelected);
        LIZ.append(", shouldStartAutoCreation=");
        LIZ.append(this.shouldStartAutoCreation);
        LIZ.append(", shouldShowAutoCreation=");
        LIZ.append(this.shouldShowAutoCreation);
        LIZ.append(", allowCameraFeature=");
        return C48339Iy7.LIZJ(LIZ, this.allowCameraFeature, ')', LIZ);
    }

    public final boolean getAllowCameraFeature() {
        return this.allowCameraFeature;
    }

    public final C72626Ses getOnboardingStepState() {
        return this.onboardingStepState;
    }

    public final boolean getShouldShowAutoCreation() {
        return this.shouldShowAutoCreation;
    }

    public final boolean getShouldStartAutoCreation() {
        return this.shouldStartAutoCreation;
    }

    public final Integer getStarterAvatarId() {
        return this.starterAvatarId;
    }

    public final List<RTR> getStarterAvatarList() {
        return this.starterAvatarList;
    }

    public final ProfileNaviDataModel getStarterAvatarSelected() {
        return this.starterAvatarSelected;
    }

    public final void setAllowCameraFeature(boolean z) {
        this.allowCameraFeature = z;
    }

    public final void setOnboardingStepState(C72626Ses c72626Ses) {
        o.LJIIIZ(c72626Ses, "<set-?>");
        this.onboardingStepState = c72626Ses;
    }

    public final void setShouldShowAutoCreation(boolean z) {
        this.shouldShowAutoCreation = z;
    }

    public final void setShouldStartAutoCreation(boolean z) {
        this.shouldStartAutoCreation = z;
    }

    public final void setStarterAvatarId(Integer num) {
        this.starterAvatarId = num;
    }

    public final void setStarterAvatarList(List<RTR> list) {
        this.starterAvatarList = list;
    }

    public final void setStarterAvatarSelected(ProfileNaviDataModel profileNaviDataModel) {
        this.starterAvatarSelected = profileNaviDataModel;
    }

    public ProfileNaviOnboardingState(C72626Ses onboardingStepState, List<RTR> list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(onboardingStepState, "onboardingStepState");
        this.onboardingStepState = onboardingStepState;
        this.starterAvatarList = list;
        this.starterAvatarId = num;
        this.starterAvatarSelected = profileNaviDataModel;
        this.shouldStartAutoCreation = z;
        this.shouldShowAutoCreation = z2;
        this.allowCameraFeature = z3;
    }

    public /* synthetic */ ProfileNaviOnboardingState(C72626Ses c72626Ses, List list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C72626Ses(null, 3) : c72626Ses, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) == 0 ? profileNaviDataModel : null, (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? true : z3);
    }
}
