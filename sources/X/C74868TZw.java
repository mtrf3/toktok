package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TZw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74868TZw<T> implements InterfaceC64592gB {
    public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C74868TZw(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, long j, int i) {
        this.LJLIL = multiGuestV3GuestBeInvitedDialog;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        C2A7 c2a7;
        Long l = (Long) obj;
        this.LJLIL.LLD = l.longValue() * 1000;
        String str = null;
        if (l.longValue() > this.LJLILLLLZI) {
            String Al = this.LJLIL.Al(424);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("maxCountDownValue:");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(", current countdownValue:");
            LIZ.append(l);
            LIZ.append(", it > max, just return");
            C32014ChO.LIZJ(Al, X1D.LIZIZ(LIZ), null);
            this.LJLIL.Jl();
            return;
        }
        int i = this.LJLJI;
        if (2 == i) {
            MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = this.LJLIL;
            C2A7 c2a72 = multiGuestV3GuestBeInvitedDialog2.LJLJI;
            if (c2a72 != null) {
                Context context = multiGuestV3GuestBeInvitedDialog2.getContext();
                if (context != null) {
                    str = context.getString(R.string.n_3, C0EM.LIZIZ(l, this.LJLILLLLZI));
                }
                c2a72.setText(str);
            }
        } else if (1 == i && (c2a7 = (multiGuestV3GuestBeInvitedDialog = this.LJLIL).LJLJJI) != null) {
            Context context2 = multiGuestV3GuestBeInvitedDialog.getContext();
            if (context2 != null) {
                str = context2.getString(R.string.n_7, C0EM.LIZIZ(l, this.LJLILLLLZI));
            }
            c2a7.setText(str);
        }
        if (l.longValue() != this.LJLILLLLZI) {
            return;
        }
        C0NB.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "dismissCountDown finish, dismiss dialog");
        this.LJLIL.Jl();
    }
}
