package com.bytedance.android.livesdk.moderator;

import android.os.Bundle;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;

/* loaded from: classes6.dex */
public class ModeratorService implements IModeratorService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorHostIModeratorListFragment MT() {
        return new ModeratorHostIModeratorListFragment();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorHostIModerateDialog Tp0() {
        return new ModeratorHostIModerateDialog();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorPermissionEditFragment Z50() {
        return new ModeratorPermissionEditFragment();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorListFragmentSheet rA() {
        ModeratorListFragmentSheet moderatorListFragmentSheet = new ModeratorListFragmentSheet();
        Bundle bundle = new Bundle();
        bundle.putSerializable("entrance", "");
        moderatorListFragmentSheet.setArguments(bundle);
        return moderatorListFragmentSheet;
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorPermissionEditFragmentSheet tn() {
        return new ModeratorPermissionEditFragmentSheet();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final AddModeratorFragment FF(String str) {
        AddModeratorFragment addModeratorFragment = new AddModeratorFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putSerializable("entrance", str);
        }
        addModeratorFragment.setArguments(bundle);
        return addModeratorFragment;
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorListFragment jZ(String str) {
        ModeratorListFragment moderatorListFragment = new ModeratorListFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putSerializable("entrance", str);
        }
        moderatorListFragment.setArguments(bundle);
        return moderatorListFragment;
    }
}
