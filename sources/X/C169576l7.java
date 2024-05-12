package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.6l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169576l7 implements Serializable {
    public List<UserInvitee> LJLIL;
    public int LJLILLLLZI;
    public InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> LJLJI;
    public java.util.Map<String, ? extends Object> LJLJJI;

    public C169576l7() {
        this(null, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C169576l7 copy$default(C169576l7 c169576l7, List list, int i, InterfaceC88473Ynt interfaceC88473Ynt, java.util.Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c169576l7.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = c169576l7.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            interfaceC88473Ynt = c169576l7.LJLJI;
        }
        if ((i2 & 8) != 0) {
            map = c169576l7.LJLJJI;
        }
        return c169576l7.copy(list, i, interfaceC88473Ynt, map);
    }

    public final C169576l7 copy(List<UserInvitee> preSelectedUser, int i, InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, java.util.Map<String, ? extends Object> extras) {
        o.LJIIIZ(preSelectedUser, "preSelectedUser");
        o.LJIIIZ(extras, "extras");
        return new C169576l7(preSelectedUser, i, interfaceC88473Ynt, extras);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C169576l7)) {
            return false;
        }
        C169576l7 c169576l7 = (C169576l7) obj;
        return o.LJ(this.LJLIL, c169576l7.LJLIL) && this.LJLILLLLZI == c169576l7.LJLILLLLZI && o.LJ(this.LJLJI, c169576l7.LJLJI) && o.LJ(this.LJLJJI, c169576l7.LJLJJI);
    }

    public int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode + (interfaceC88473Ynt == null ? 0 : interfaceC88473Ynt.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteConfig(preSelectedUser=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pendingCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onSelected=");
        LIZ.append(this.LJLJI);
        LIZ.append(", extras=");
        return C15890jp.LIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final java.util.Map<String, Object> getExtras() {
        return this.LJLJJI;
    }

    public final InterfaceC88473Ynt<List<UserInvitee>, List<UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> getOnSelected() {
        return this.LJLJI;
    }

    public final int getPendingCount() {
        return this.LJLILLLLZI;
    }

    public final List<UserInvitee> getPreSelectedUser() {
        return this.LJLIL;
    }

    public final void setExtras(java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(map, "<set-?>");
        this.LJLJJI = map;
    }

    public final void setOnSelected(InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt) {
        this.LJLJI = interfaceC88473Ynt;
    }

    public final void setPendingCount(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setPreSelectedUser(List<UserInvitee> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLIL = list;
    }

    public C169576l7(List<UserInvitee> preSelectedUser, int i, InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, java.util.Map<String, ? extends Object> extras) {
        o.LJIIIZ(preSelectedUser, "preSelectedUser");
        o.LJIIIZ(extras, "extras");
        this.LJLIL = preSelectedUser;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = extras;
    }

    public C169576l7(List list, int i, InterfaceC88473Ynt interfaceC88473Ynt, java.util.Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C61878OQg.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : interfaceC88473Ynt, (i2 & 8) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}
