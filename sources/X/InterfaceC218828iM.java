package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.8iM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC218828iM extends Serializable {
    void initExtra(java.util.Map<String, ? extends Object> map);

    void mobEnter();

    void mobInviteButtonClicked(boolean z, List<UserInvitee> list);

    void mobSelectChange(boolean z, UserInvitee userInvitee, String str, boolean z2);

    Object onSelected(Fragment fragment, List<UserInvitee> list, List<UserInvitee> list2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    void onSelectionChange(List<UserInvitee> list, View view);
}
