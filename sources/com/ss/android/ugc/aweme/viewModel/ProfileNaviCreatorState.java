package com.ss.android.ugc.aweme.viewModel;

import X.C0EH;
import X.C1NQ;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviCreatorState implements InterfaceC61312at {
    public boolean isBackPressed;
    public boolean isContinueEditing;
    public boolean isDoneCreatingProfileImage;
    public C1NQ newWorkRequest;
    public String profileImageBackgroundColor;
    public boolean shouldShowSetProfileView;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviCreatorState() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState.<init>():void");
    }

    public static /* synthetic */ ProfileNaviCreatorState copy$default(ProfileNaviCreatorState profileNaviCreatorState, String str, boolean z, boolean z2, boolean z3, boolean z4, C1NQ c1nq, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviCreatorState.profileImageBackgroundColor;
        }
        if ((i & 2) != 0) {
            z = profileNaviCreatorState.isDoneCreatingProfileImage;
        }
        if ((i & 4) != 0) {
            z2 = profileNaviCreatorState.isBackPressed;
        }
        if ((i & 8) != 0) {
            z3 = profileNaviCreatorState.isContinueEditing;
        }
        if ((i & 16) != 0) {
            z4 = profileNaviCreatorState.shouldShowSetProfileView;
        }
        if ((i & 32) != 0) {
            profileNaviCreatorState.getClass();
            c1nq = null;
        }
        return profileNaviCreatorState.copy(str, z, z2, z3, z4, c1nq);
    }

    public final C1NQ component6() {
        return null;
    }

    public final ProfileNaviCreatorState copy(String str, boolean z, boolean z2, boolean z3, boolean z4, C1NQ c1nq) {
        return new ProfileNaviCreatorState(str, z, z2, z3, z4, c1nq);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCreatorState)) {
            return false;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) obj;
        return o.LJ(this.profileImageBackgroundColor, profileNaviCreatorState.profileImageBackgroundColor) && this.isDoneCreatingProfileImage == profileNaviCreatorState.isDoneCreatingProfileImage && this.isBackPressed == profileNaviCreatorState.isBackPressed && this.isContinueEditing == profileNaviCreatorState.isContinueEditing && this.shouldShowSetProfileView == profileNaviCreatorState.shouldShowSetProfileView && o.LJ(null, null);
    }

    public final C1NQ getNewWorkRequest() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.profileImageBackgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isDoneCreatingProfileImage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isBackPressed;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isContinueEditing;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        return C0EH.LIZ((i4 + i5) * 31, this.shouldShowSetProfileView ? 1 : 0, 31, 0);
    }

    public final void setNewWorkRequest(C1NQ c1nq) {
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviCreatorState(profileImageBackgroundColor=");
        LIZ.append(this.profileImageBackgroundColor);
        LIZ.append(", isDoneCreatingProfileImage=");
        LIZ.append(this.isDoneCreatingProfileImage);
        LIZ.append(", isBackPressed=");
        LIZ.append(this.isBackPressed);
        LIZ.append(", isContinueEditing=");
        LIZ.append(this.isContinueEditing);
        LIZ.append(", shouldShowSetProfileView=");
        LIZ.append(this.shouldShowSetProfileView);
        LIZ.append(", newWorkRequest=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getProfileImageBackgroundColor() {
        return this.profileImageBackgroundColor;
    }

    public final boolean getShouldShowSetProfileView() {
        return this.shouldShowSetProfileView;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneCreatingProfileImage() {
        return this.isDoneCreatingProfileImage;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneCreatingProfileImage(boolean z) {
        this.isDoneCreatingProfileImage = z;
    }

    public final void setProfileImageBackgroundColor(String str) {
        this.profileImageBackgroundColor = str;
    }

    public final void setShouldShowSetProfileView(boolean z) {
        this.shouldShowSetProfileView = z;
    }

    public ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, C1NQ c1nq) {
        this.profileImageBackgroundColor = str;
        this.isDoneCreatingProfileImage = z;
        this.isBackPressed = z2;
        this.isContinueEditing = z3;
        this.shouldShowSetProfileView = z4;
    }

    public /* synthetic */ ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, C1NQ c1nq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) == 0 ? c1nq : null);
    }
}
