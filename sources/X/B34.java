package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.player.BlackScreenMonitorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B34 {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final java.util.Map<String, Integer> LJIIJ;

    public final void LIZ() {
        BlackScreenMonitorSetting blackScreenMonitorSetting = BlackScreenMonitorSetting.INSTANCE;
        if (blackScreenMonitorSetting.getEnable() == blackScreenMonitorSetting.getDEFAULT()) {
            return;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LIZIZ, LiveEndEvent.class, new AqS171S0100000_5(this, 890));
        }
        this.LJIIIIZZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        LIZIZ(0);
        ((LinkedHashMap) this.LJIIJ).clear();
    }

    public final void LIZIZ(int i) {
        if (this.LJIIIZ == 0) {
            this.LJIIIZ = i;
        }
    }

    public B34(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LJIIJ = new LinkedHashMap();
    }

    public final void LIZJ(String str, HashMap hashMap) {
        if (this.LJIIJ.containsKey(str)) {
            hashMap.put(str, String.valueOf(((LinkedHashMap) this.LJIIJ).get(str)));
        } else {
            hashMap.put(str, String.valueOf(-1));
        }
    }
}
