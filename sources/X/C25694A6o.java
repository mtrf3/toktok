package X;

import Y.IDDListenerS144S0100000_4;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;

/* renamed from: X.A6o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25694A6o implements InterfaceC31687Cc7 {
    public final /* synthetic */ C25696A6q LIZ;

    public C25694A6o(C25696A6q c25696A6q) {
        this.LIZ = c25696A6q;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        ActivityC45651qj context;
        ActivityC45651qj LJJIFFI;
        long j;
        A72 a72 = this.LIZ.LJLJI;
        if (a72 != null && (context = a72.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C25696A6q c25696A6q = this.LIZ;
            ASL LIZ = C249109q6.LIZ(1);
            LIZ.LIZ.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(LJJIFFI) * 0.73d);
            Room room = c25696A6q.LJLJJL;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("room_id", j);
            bundle.putBoolean("is_before_live", true);
            PaidSeriesAddedListFragment paidSeriesAddedListFragment = new PaidSeriesAddedListFragment();
            paidSeriesAddedListFragment.setArguments(bundle);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLLILLLL = paidSeriesAddedListFragment;
            tuxSheet.LJZI = false;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJZL = true;
            tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(c25696A6q, 12);
            tuxSheet.showNow(LJJIFFI.getSupportFragmentManager(), null);
        }
    }
}
