package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;

/* renamed from: X.Sge, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72736Sge implements InterfaceC72741Sgj {
    public final /* synthetic */ EditProfileBadgeDialog LIZ;

    @Override // X.InterfaceC72741Sgj
    public final void onFail() {
        String str;
        AccountService.LJIJ().LJFF().updateCurProfileBadge(this.LIZ.LJLJL);
        EditProfileBadgeDialog editProfileBadgeDialog = this.LIZ;
        ProfileBadgeStruct profileBadgeStruct = editProfileBadgeDialog.LJLJL;
        Boolean bool = null;
        if (profileBadgeStruct != null) {
            str = profileBadgeStruct.getUrl();
        } else {
            str = null;
        }
        ProfileBadgeStruct profileBadgeStruct2 = this.LIZ.LJLJL;
        if (profileBadgeStruct2 != null) {
            bool = Boolean.valueOf(profileBadgeStruct2.getShouldShow());
        }
        editProfileBadgeDialog.Al(bool, str);
    }

    public C72736Sge(EditProfileBadgeDialog editProfileBadgeDialog) {
        this.LIZ = editProfileBadgeDialog;
    }

    @Override // X.InterfaceC72741Sgj
    public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
        if (profileBadgeStruct == null || profileBadgeStruct.getId() == null) {
            return;
        }
        EditProfileBadgeDialog editProfileBadgeDialog = this.LIZ;
        editProfileBadgeDialog.LJLJL = editProfileBadgeDialog.LJLJJLL;
        editProfileBadgeDialog.xl();
    }
}
