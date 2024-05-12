package X;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OBl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61493OBl implements C2M {
    public final /* synthetic */ LiveBroadcastActivity LIZ;

    @Override // X.C2M
    public final void LIZIZ() {
        Bundle bundle = new Bundle();
        if (this.LIZ.getIntent() != null) {
            this.LIZ.getIntent().putExtra("is_try_mode", false);
            this.LIZ.getIntent().putExtra("is_from_try_mode", true);
            bundle = C16880lQ.LLJJIJI(this.LIZ.getIntent());
        }
        this.LIZ.LLII(bundle);
    }

    public C61493OBl(LiveBroadcastActivity liveBroadcastActivity) {
        this.LIZ = liveBroadcastActivity;
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
        LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
        liveBroadcastActivity.LJLIL = null;
        liveBroadcastActivity.LJLJI = false;
    }

    @Override // X.C2M
    public final void LIZLLL(C30656C1k c30656C1k) {
        LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
        ReceiverRegisterLancet.loge(c30656C1k, false);
        liveBroadcastActivity.unregisterReceiver(c30656C1k);
    }

    @Override // X.C2M
    public final void LIZJ(C30656C1k c30656C1k, IntentFilter intentFilter) {
        LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                liveBroadcastActivity.registerReceiver(c30656C1k, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            } else {
                liveBroadcastActivity.registerReceiver(c30656C1k, intentFilter);
            }
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.registerReceiver(c30656C1k, intentFilter);
                return;
            }
            throw e;
        }
    }
}
