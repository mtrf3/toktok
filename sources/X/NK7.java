package X;

import Y.ARunnableS46S0100000_10;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem;
import com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility;
import java.util.List;

/* loaded from: classes11.dex */
public final class NK7 implements NK9 {
    public final /* synthetic */ GameLiveBottomBarAssem LIZ;

    public NK7(GameLiveBottomBarAssem gameLiveBottomBarAssem) {
        this.LIZ = gameLiveBottomBarAssem;
    }

    @Override // X.NK9
    public final void LIZ(int i, String str, List list) {
        NK8 nk8;
        ARunnableS46S0100000_10 aRunnableS46S0100000_10;
        if (str == null) {
            return;
        }
        IGameLiveAbility iGameLiveAbility = (IGameLiveAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), IGameLiveAbility.class, null);
        if (iGameLiveAbility != null) {
            nk8 = iGameLiveAbility.N50(str);
        } else {
            nk8 = null;
        }
        View containerView = this.LIZ.getContainerView();
        if (nk8 != null) {
            aRunnableS46S0100000_10 = nk8.LIZJ;
        } else {
            aRunnableS46S0100000_10 = null;
        }
        containerView.removeCallbacks(aRunnableS46S0100000_10);
        if (list == null || list.isEmpty()) {
            i = 0;
        }
        NK8 nk82 = new NK8(list, i);
        IGameLiveAbility iGameLiveAbility2 = (IGameLiveAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), IGameLiveAbility.class, null);
        if (iGameLiveAbility2 != null) {
            iGameLiveAbility2.fw(str, nk82);
        }
        this.LIZ.getContainerView().postDelayed(nk82.LIZJ, ((Number) this.LIZ.LLIIII.getValue()).longValue());
    }
}
