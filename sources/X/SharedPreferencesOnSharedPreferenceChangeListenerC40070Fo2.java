package X;

import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.HybridMultiMonitor;

/* renamed from: X.Fo2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC40070Fo2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final C40072Fo4 LJLIL = new C40072Fo4();
    public final /* synthetic */ HybridMultiMonitor LJLILLLLZI;

    public SharedPreferencesOnSharedPreferenceChangeListenerC40070Fo2(HybridMultiMonitor hybridMultiMonitor) {
        this.LJLILLLLZI = hybridMultiMonitor;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.getBoolean("monitor_validation_switch", false)) {
            this.LJLILLLLZI.unregisterHybridEventListener(this.LJLIL);
            this.LJLILLLLZI.registerHybridEventListener(this.LJLIL);
            try {
                C09970aH.LIZIZ = true;
                C78248UnM.LJLJI = C09970aH.LJII();
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        } else {
            this.LJLILLLLZI.unregisterHybridEventListener(this.LJLIL);
            try {
                C09970aH.LIZIZ = false;
                C78248UnM.LJLJI = C09970aH.LJII();
            } catch (Throwable th2) {
                C77117UOj.LJIIZILJ(th2);
            }
        }
        C79606VMc.LIZ = sharedPreferences.getBoolean("monitor_immediate_switch", false);
        C77318UWc.LJLIL = sharedPreferences.getBoolean("monitor_hdt_ignore_sample", false);
        C77318UWc.LJLILLLLZI = sharedPreferences.getBoolean("monitor_skip_inject_check", false);
    }
}
