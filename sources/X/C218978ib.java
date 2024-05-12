package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C218978ib implements InterfaceC218828iM {
    public java.util.Map<String, ? extends Object> LJLIL;

    public final java.util.Map<String, Object> LIZ() {
        java.util.Map<String, ? extends Object> map = this.LJLIL;
        if (map != null) {
            return map;
        }
        o.LJIJI("extra");
        throw null;
    }

    @Override // X.InterfaceC218828iM
    public void mobEnter() {
        C218998id.LIZIZ("enter_add_yours_invite_panel", new AqS169S0100000_3(this, 924));
    }

    @Override // X.InterfaceC218828iM
    public void initExtra(java.util.Map<String, ? extends Object> extras) {
        o.LJIIIZ(extras, "extras");
        this.LJLIL = extras;
    }

    @Override // X.InterfaceC218828iM
    public void mobInviteButtonClicked(boolean z, List<UserInvitee> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "invitee");
        ArrayList arrayList = new ArrayList();
        for (UserInvitee userInvitee : list) {
            LJ.add(Integer.valueOf(C44729Hgz.LJIJ(userInvitee.getFollowStatus(), userInvitee.getFollowerStatus())));
            arrayList.add(userInvitee.getUid());
        }
        C218998id.LIZIZ("send_add_yours_invitation", new C218988ic(z, this, list, LJ, arrayList));
    }

    @Override // X.InterfaceC218828iM
    public void onSelectionChange(List<UserInvitee> userInvitee, View inviteBtn) {
        SY4 sy4;
        o.LJIIIZ(userInvitee, "userInvitee");
        o.LJIIIZ(inviteBtn, "inviteBtn");
        CharSequence charSequence = null;
        if (!(inviteBtn instanceof SY4) || (sy4 = (SY4) inviteBtn) == null) {
            return;
        }
        Resources resources = sy4.getResources();
        if (resources != null) {
            charSequence = resources.getText(R.string.q8j);
        }
        sy4.setText(charSequence);
        sy4.setEnabled(true);
    }

    @Override // X.InterfaceC218828iM
    public void mobSelectChange(boolean z, UserInvitee user, String str, boolean z2) {
        o.LJIIIZ(user, "user");
        C218998id.LIZIZ("select_add_yours_invitee", new C218968ia(z, this, user, z2, str));
    }

    @Override // X.InterfaceC218828iM
    public Object onSelected(Fragment fragment, List<UserInvitee> list, List<UserInvitee> list2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return C76800UCe.LIZ;
    }
}
