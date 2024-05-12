package com.ss.android.ugc.aweme.viewModel;

import X.InterfaceC61312at;
import X.InterfaceC72575Se3;
import X.X1D;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviAutoCreationState implements InterfaceC61312at {
    public boolean autoCreationComplete;
    public boolean isBackPressed;
    public boolean isCreateProfileImage;
    public ProfileNaviDataModel profileNaviDataModel;
    public final InterfaceC72575Se3 selectedSkintone;
    public Bitmap selfieBitmap;
    public boolean shouldShowSkintoneSelectFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviAutoCreationState() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r2
            r9 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState.<init>():void");
    }

    public static /* synthetic */ ProfileNaviAutoCreationState copy$default(ProfileNaviAutoCreationState profileNaviAutoCreationState, boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC72575Se3 interfaceC72575Se3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileNaviAutoCreationState.isCreateProfileImage;
        }
        if ((i & 2) != 0) {
            bitmap = profileNaviAutoCreationState.selfieBitmap;
        }
        if ((i & 4) != 0) {
            z2 = profileNaviAutoCreationState.shouldShowSkintoneSelectFragment;
        }
        if ((i & 8) != 0) {
            z3 = profileNaviAutoCreationState.isBackPressed;
        }
        if ((i & 16) != 0) {
            z4 = profileNaviAutoCreationState.autoCreationComplete;
        }
        if ((i & 32) != 0) {
            profileNaviDataModel = profileNaviAutoCreationState.profileNaviDataModel;
        }
        if ((i & 64) != 0) {
            interfaceC72575Se3 = profileNaviAutoCreationState.selectedSkintone;
        }
        return profileNaviAutoCreationState.copy(z, bitmap, z2, z3, z4, profileNaviDataModel, interfaceC72575Se3);
    }

    public final ProfileNaviAutoCreationState copy(boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC72575Se3 interfaceC72575Se3) {
        return new ProfileNaviAutoCreationState(z, bitmap, z2, z3, z4, profileNaviDataModel, interfaceC72575Se3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviAutoCreationState)) {
            return false;
        }
        ProfileNaviAutoCreationState profileNaviAutoCreationState = (ProfileNaviAutoCreationState) obj;
        return this.isCreateProfileImage == profileNaviAutoCreationState.isCreateProfileImage && o.LJ(this.selfieBitmap, profileNaviAutoCreationState.selfieBitmap) && this.shouldShowSkintoneSelectFragment == profileNaviAutoCreationState.shouldShowSkintoneSelectFragment && this.isBackPressed == profileNaviAutoCreationState.isBackPressed && this.autoCreationComplete == profileNaviAutoCreationState.autoCreationComplete && o.LJ(this.profileNaviDataModel, profileNaviAutoCreationState.profileNaviDataModel) && o.LJ(this.selectedSkintone, profileNaviAutoCreationState.selectedSkintone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public int hashCode() {
        boolean z = this.isCreateProfileImage;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Bitmap bitmap = this.selfieBitmap;
        int hashCode = (i + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        ?? r02 = this.shouldShowSkintoneSelectFragment;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        ?? r03 = this.isBackPressed;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (((i3 + i4) * 31) + (this.autoCreationComplete ? 1 : 0)) * 31;
        ProfileNaviDataModel profileNaviDataModel = this.profileNaviDataModel;
        int hashCode2 = (i5 + (profileNaviDataModel == null ? 0 : profileNaviDataModel.hashCode())) * 31;
        InterfaceC72575Se3 interfaceC72575Se3 = this.selectedSkintone;
        return hashCode2 + (interfaceC72575Se3 != null ? interfaceC72575Se3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviAutoCreationState(isCreateProfileImage=");
        LIZ.append(this.isCreateProfileImage);
        LIZ.append(", selfieBitmap=");
        LIZ.append(this.selfieBitmap);
        LIZ.append(", shouldShowSkintoneSelectFragment=");
        LIZ.append(this.shouldShowSkintoneSelectFragment);
        LIZ.append(", isBackPressed=");
        LIZ.append(this.isBackPressed);
        LIZ.append(", autoCreationComplete=");
        LIZ.append(this.autoCreationComplete);
        LIZ.append(", profileNaviDataModel=");
        LIZ.append(this.profileNaviDataModel);
        LIZ.append(", selectedSkintone=");
        LIZ.append(this.selectedSkintone);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getAutoCreationComplete() {
        return this.autoCreationComplete;
    }

    public final ProfileNaviDataModel getProfileNaviDataModel() {
        return this.profileNaviDataModel;
    }

    public final InterfaceC72575Se3 getSelectedSkintone() {
        return this.selectedSkintone;
    }

    public final Bitmap getSelfieBitmap() {
        return this.selfieBitmap;
    }

    public final boolean getShouldShowSkintoneSelectFragment() {
        return this.shouldShowSkintoneSelectFragment;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isCreateProfileImage() {
        return this.isCreateProfileImage;
    }

    public final void setAutoCreationComplete(boolean z) {
        this.autoCreationComplete = z;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setCreateProfileImage(boolean z) {
        this.isCreateProfileImage = z;
    }

    public final void setProfileNaviDataModel(ProfileNaviDataModel profileNaviDataModel) {
        this.profileNaviDataModel = profileNaviDataModel;
    }

    public final void setSelfieBitmap(Bitmap bitmap) {
        this.selfieBitmap = bitmap;
    }

    public final void setShouldShowSkintoneSelectFragment(boolean z) {
        this.shouldShowSkintoneSelectFragment = z;
    }

    public ProfileNaviAutoCreationState(boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC72575Se3 interfaceC72575Se3) {
        this.isCreateProfileImage = z;
        this.selfieBitmap = bitmap;
        this.shouldShowSkintoneSelectFragment = z2;
        this.isBackPressed = z3;
        this.autoCreationComplete = z4;
        this.profileNaviDataModel = profileNaviDataModel;
        this.selectedSkintone = interfaceC72575Se3;
    }

    public /* synthetic */ ProfileNaviAutoCreationState(boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC72575Se3 interfaceC72575Se3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? null : profileNaviDataModel, (i & 64) == 0 ? interfaceC72575Se3 : null);
    }
}
