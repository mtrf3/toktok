package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;

/* renamed from: X.FyY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLayoutChangeListenerC40722FyY implements View.OnLayoutChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ NewUserJourneyActivity LJLILLLLZI;

    public ViewOnLayoutChangeListenerC40722FyY(View view, NewUserJourneyActivity newUserJourneyActivity) {
        this.LJLIL = view;
        this.LJLILLLLZI = newUserJourneyActivity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MainLooperOptService LJIIJ;
        if (C38862FNa.LIZ() && (LJIIJ = MainLooperOptService.LJIIJ(null)) != null) {
            LJIIJ.LJIJJ(view);
            LJIIJ.LJIJJLI(FAB.WATCH_WINDOW_FOCUS_CHANGE);
        }
        this.LJLIL.removeOnLayoutChangeListener(this);
        if (C61653OHp.LIZ() != 0) {
            this.LJLILLLLZI.LLFZ();
        } else {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS42S0100000_6(this.LJLILLLLZI, 119), 1000L);
        }
    }
}
