package com.bytedance.android.live.moderator;

import X.InterfaceC06390Mx;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;

/* loaded from: classes6.dex */
public interface IModeratorService extends InterfaceC06390Mx {
    AddModeratorFragment FF(String str);

    ModeratorHostIModeratorListFragment MT();

    ModeratorHostIModerateDialog Tp0();

    ModeratorPermissionEditFragment Z50();

    ModeratorListFragment jZ(String str);

    ModeratorListFragmentSheet rA();

    ModeratorPermissionEditFragmentSheet tn();
}
