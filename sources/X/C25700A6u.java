package X;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.paidseries.consumer.fragment.PaidSeriesShopPanelFragment;

/* renamed from: X.A6u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25700A6u extends A73 {
    public final /* synthetic */ C25699A6t LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25700A6u(C25699A6t c25699A6t) {
        super(300L);
        this.LJ = c25699A6t;
    }

    @Override // X.A73
    public final void LIZIZ(String str) {
        long j;
        ActivityC45651qj context;
        ActivityC45651qj LJJIFFI;
        C25699A6t c25699A6t = this.LJ;
        c25699A6t.getClass();
        Room room = c25699A6t.LJLJJL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("room_id", j);
        PaidSeriesShopPanelFragment paidSeriesShopPanelFragment = new PaidSeriesShopPanelFragment();
        paidSeriesShopPanelFragment.setArguments(bundle);
        c25699A6t.LJLJL = paidSeriesShopPanelFragment;
        A72 a72 = c25699A6t.LJLJI;
        if (a72 != null && (context = a72.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            TuxSheet tuxSheet = C249109q6.LIZ(1).LIZ;
            tuxSheet.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(LJJIFFI) * 0.73d);
            tuxSheet.LJLLILLLL = paidSeriesShopPanelFragment;
            tuxSheet.LJZI = false;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJZL = true;
            tuxSheet.showNow(LJJIFFI.getSupportFragmentManager(), null);
            c25699A6t.LJLJJLL = tuxSheet;
        }
    }
}
