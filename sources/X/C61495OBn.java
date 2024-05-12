package X;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.live.GoLiveActivity;
import com.ss.android.ugc.aweme.live.GoLiveManager;
import com.ss.android.ugc.aweme.live.Live;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OBn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61495OBn implements C2M {
    public final /* synthetic */ GoLiveActivity LIZ;

    @Override // X.C2M
    public final void LIZIZ() {
    }

    public C61495OBn(GoLiveActivity goLiveActivity) {
        this.LIZ = goLiveActivity;
    }

    @Override // X.C2M
    public final void LIZ(Bundle bundle) {
        Fragment fragment;
        this.LIZ.LLIIIJ(EnumC32529Cph.END);
        this.LIZ.LJLJJLL = Live.getService().createLiveBroadcastEndFragment(bundle);
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        Object obj = this.LIZ.LJLJJLL;
        if (obj == null || (fragment = (Fragment) obj) == null) {
            return;
        }
        LIZ.LJIIJ(fragment, null, R.id.dm7);
        LIZ.LJII();
        GoLiveManager goLiveManager = this.LIZ.LJLIL;
        if (goLiveManager != null) {
            goLiveManager.LIZJ(false);
        }
        this.LIZ.LJLJJL = null;
    }

    @Override // X.C2M
    public final void LIZLLL(C30656C1k c30656C1k) {
        GoLiveActivity goLiveActivity = this.LIZ;
        ReceiverRegisterLancet.loge(c30656C1k, false);
        goLiveActivity.unregisterReceiver(c30656C1k);
    }

    @Override // X.C2M
    public final void LIZJ(C30656C1k c30656C1k, IntentFilter intentFilter) {
        GoLiveActivity goLiveActivity = this.LIZ;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                goLiveActivity.registerReceiver(c30656C1k, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            } else {
                goLiveActivity.registerReceiver(c30656C1k, intentFilter);
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
