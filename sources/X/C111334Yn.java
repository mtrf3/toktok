package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.4Yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111334Yn implements InterfaceC87283bg {
    public final Long LJLIL;
    public final GroupInfo LJLILLLLZI;
    public final String LJLJI;
    public final GroupInviteViewModel LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111334Yn)) {
            return false;
        }
        C111334Yn c111334Yn = (C111334Yn) obj;
        return o.LJ(this.LJLIL, c111334Yn.LJLIL) && o.LJ(this.LJLILLLLZI, c111334Yn.LJLILLLLZI) && o.LJ(this.LJLJI, c111334Yn.LJLJI) && o.LJ(this.LJLJJI, c111334Yn.LJLJJI);
    }

    public final int hashCode() {
        Long l = this.LJLIL;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        GroupInfo groupInfo = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (groupInfo == null ? 0 : groupInfo.hashCode())) * 31;
        String str = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupInviteArg(inviteSenderId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", defaultGroup=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", inviteId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", viewModel=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C111334Yn(Long l, GroupInfo groupInfo, String str, GroupInviteViewModel groupInviteViewModel) {
        this.LJLIL = l;
        this.LJLILLLLZI = groupInfo;
        this.LJLJI = str;
        this.LJLJJI = groupInviteViewModel;
    }
}
