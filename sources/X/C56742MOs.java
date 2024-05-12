package X;

import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MOs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56742MOs extends C8BR<C56741MOr, InterfaceC56753MPd> {
    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((C56741MOr) t).LJLIL) {
                ((InterfaceC56753MPd) this.LJLILLLLZI).Er0(true);
            } else {
                ((InterfaceC56753MPd) this.LJLILLLLZI).Er0(false);
            }
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        boolean z;
        boolean z2;
        FollowRequestResponse followRequestResponse;
        FollowRequestResponse followRequestResponse2;
        T t = this.LJLIL;
        boolean z3 = false;
        if (t != 0 && this.LJLILLLLZI != 0) {
            List<User> list = ((FollowRequestResponse) t.getData()).userRequestList;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C56741MOr c56741MOr = (C56741MOr) this.LJLIL;
            if (c56741MOr.LJLIL) {
                InterfaceC56753MPd interfaceC56753MPd = (InterfaceC56753MPd) this.LJLILLLLZI;
                o.LJIIIIZZ(list, "list");
                T t2 = this.LJLIL;
                if (t2 != 0 && (followRequestResponse2 = (FollowRequestResponse) t2.getData()) != null && followRequestResponse2.hasMore && !z) {
                    z3 = true;
                }
                interfaceC56753MPd.mA(list, true, z3);
                return;
            }
            if (z) {
                ((InterfaceC56753MPd) this.LJLILLLLZI).f4();
                return;
            }
            if (c56741MOr.LJLILLLLZI) {
                InterfaceC56753MPd interfaceC56753MPd2 = (InterfaceC56753MPd) this.LJLILLLLZI;
                o.LJIIIIZZ(list, "list");
                interfaceC56753MPd2.zg0(((FollowRequestResponse) this.LJLIL.getData()).total, list);
                return;
            }
            InterfaceC56753MPd interfaceC56753MPd3 = (InterfaceC56753MPd) this.LJLILLLLZI;
            o.LJIIIIZZ(list, "list");
            T t3 = this.LJLIL;
            if (t3 != 0 && (followRequestResponse = (FollowRequestResponse) t3.getData()) != null) {
                z2 = followRequestResponse.hasMore;
            } else {
                z2 = false;
            }
            interfaceC56753MPd3.mA(list, false, z2);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        T t = this.LJLIL;
        if (t != 0 && this.LJLILLLLZI != 0) {
            if (((C56741MOr) t).LJLIL) {
                ((InterfaceC56753MPd) this.LJLILLLLZI).xB(exc, true);
            } else {
                ((InterfaceC56753MPd) this.LJLILLLLZI).xB(exc, false);
            }
        }
    }
}
