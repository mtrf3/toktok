package X;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.VoiceBroadcastActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OBk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61492OBk implements C2M {
    public final /* synthetic */ VoiceBroadcastActivity LIZ;

    @Override // X.C2M
    public final void LIZIZ() {
    }

    public C61492OBk(VoiceBroadcastActivity voiceBroadcastActivity) {
        this.LIZ = voiceBroadcastActivity;
    }

    @Override // X.C2M
    public final void LIZ(Bundle bundle) {
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
        Fragment fragment = (Fragment) Live.getService().createLiveBroadcastEndFragment(bundle);
        fragment.getClass();
        LIZ.LJIIJ(fragment, null, R.id.dm7);
        LIZ.LJII();
        voiceBroadcastActivity.LJLIL = null;
    }

    @Override // X.C2M
    public final void LIZLLL(C30656C1k c30656C1k) {
        VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
        ReceiverRegisterLancet.loge(c30656C1k, false);
        voiceBroadcastActivity.unregisterReceiver(c30656C1k);
    }

    @Override // X.C2M
    public final void LIZJ(C30656C1k c30656C1k, IntentFilter intentFilter) {
        VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                voiceBroadcastActivity.registerReceiver(c30656C1k, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            } else {
                voiceBroadcastActivity.registerReceiver(c30656C1k, intentFilter);
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
