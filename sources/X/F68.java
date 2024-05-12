package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class F68 implements InterfaceC40004Fmy {
    public final List<BroadcastReceiver> LIZ = new ArrayList();
    public C40011Fn5 LIZIZ = null;

    @Override // X.InterfaceC40004Fmy
    public final synchronized void LIZ(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ear_phone_unplug_experiment", true)) {
            C40011Fn5 c40011Fn5 = new C40011Fn5();
            this.LIZIZ = c40011Fn5;
            IntentFilter intentFilter = new IntentFilter();
            for (String str : new String[]{"android.media.AUDIO_BECOMING_NOISY"}) {
                intentFilter.addAction(str);
            }
            C16880lQ.LJJLIIIJILLIZJL(c40011Fn5, context, intentFilter);
        }
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NetWorkStateReceiver netWorkStateReceiver = new NetWorkStateReceiver();
        ((ArrayList) this.LIZ).add(netWorkStateReceiver);
        IntentFilter intentFilter2 = new IntentFilter();
        for (String str2 : new String[]{"android.net.conn.CONNECTIVITY_CHANGE"}) {
            intentFilter2.addAction(str2);
        }
        C16880lQ.LJJLIIIJILLIZJL(netWorkStateReceiver, context, intentFilter2);
    }

    @Override // X.InterfaceC40004Fmy
    public final synchronized void LIZIZ(Context context) {
        if (this.LIZIZ != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ear_phone_unplug_experiment", true)) {
                C16880lQ.LJJLIIIJL(context, this.LIZIZ);
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) it.next();
            if (broadcastReceiver != null) {
                C16880lQ.LJJLIIIJL(context, broadcastReceiver);
            }
        }
        ((ArrayList) this.LIZ).clear();
    }
}
