package X;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OBm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61494OBm implements C2M {
    public final /* synthetic */ LiveBgBroadcastActivity LIZ;

    @Override // X.C2M
    public final void LIZIZ() {
    }

    @Override // X.C2M
    public final void LIZJ(C30656C1k c30656C1k, IntentFilter intentFilter) {
    }

    @Override // X.C2M
    public final void LIZLLL(C30656C1k c30656C1k) {
    }

    public C61494OBm(LiveBgBroadcastActivity liveBgBroadcastActivity) {
        this.LIZ = liveBgBroadcastActivity;
    }

    @Override // X.C2M
    public final void LIZ(Bundle bundle) {
        this.LIZ.LJLILLLLZI = Live.getService().createLiveBroadcastEndFragment(bundle);
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        Fragment fragment = (Fragment) this.LIZ.LJLILLLLZI;
        fragment.getClass();
        LIZ.LJIIJ(fragment, null, R.id.dm7);
        LIZ.LJII();
        this.LIZ.LJLIL = null;
    }
}
