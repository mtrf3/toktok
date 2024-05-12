package X;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;

/* loaded from: classes5.dex */
public final class A71 extends A73 {
    public final /* synthetic */ C25705A6z LJ;

    public A71(C25705A6z c25705A6z) {
        this.LJ = c25705A6z;
    }

    @Override // X.A73
    public final void LIZIZ(String str) {
        ActivityC45651qj context;
        ActivityC45651qj LJJIFFI;
        long j;
        C25705A6z c25705A6z = this.LJ;
        A72 a72 = c25705A6z.LJLJJI;
        if (a72 != null && (context = a72.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            LiveOuterService.LJJJLL().LJIJJ();
            C71272Ry8.LIZ(LJJIFFI).LJLIL.setValue(A9Z.STREAM_ON);
            ASL asl = new ASL();
            asl.LJI(1);
            asl.LIZ.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(LJJIFFI) * 0.73d);
            Room room = c25705A6z.LJLJJL;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("room_id", j);
            bundle.putBoolean("is_before_live", false);
            PaidSeriesAddedListFragment paidSeriesAddedListFragment = new PaidSeriesAddedListFragment();
            paidSeriesAddedListFragment.setArguments(bundle);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = paidSeriesAddedListFragment;
            tuxSheet.LJZI = false;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJZL = true;
            tuxSheet.showNow(LJJIFFI.getSupportFragmentManager(), null);
        }
    }
}
