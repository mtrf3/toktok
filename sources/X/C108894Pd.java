package X;

import Y.IDDListenerS141S0100000_1;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteFragment;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;

/* renamed from: X.4Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108894Pd {
    public static final void LIZ(Activity activity, GroupInviteCardContent groupInviteCardContent, long j, GroupInfo groupInfo) {
        if (!(activity instanceof ActivityC45651qj)) {
            return;
        }
        C84683Ua.LJFF.LIZIZ(new C4PJ(), true);
        GroupInviteFragment groupInviteFragment = new GroupInviteFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_invite_id", groupInviteCardContent.getInviteId());
        bundle.putSerializable("arg_default_group", groupInfo);
        bundle.putLong("arg_invite_sender", j);
        groupInviteFragment.setArguments(bundle);
        TuxSheet tuxSheet = new ASL().LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLLILLLL = groupInviteFragment;
        tuxSheet.LJLILLLLZI = new IDDListenerS141S0100000_1(groupInviteFragment, 13);
        C1DG.LJII((ActivityC45651qj) activity, "activity.supportFragmentManager", tuxSheet, "GroupInviteCardSheet");
    }
}
