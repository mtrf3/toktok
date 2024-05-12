package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCrossDeviceBroadcastOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCrossDeviceSetting;
import java.util.HashMap;

/* renamed from: X.0bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11000bw implements Handler.Callback {
    public boolean LJLILLLLZI;
    public final InterfaceC10980bu LJLJJI;
    public boolean LJLJJLL;
    public int LJLJJL = 1;
    public final Handler LJLIL = new Handler(this);
    public final long LJLJI = 5000;

    public final void LJ() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJJL = 2;
        LIZJ(0, 0);
        this.LJLILLLLZI = true;
    }

    public C11000bw(InterfaceC10980bu interfaceC10980bu) {
        this.LJLJJI = interfaceC10980bu;
    }

    public final void LIZ(int i) {
        if (this.LJLILLLLZI && this.LJLJJL != 1) {
            LIZLLL(3, 0, i);
        }
    }

    public final void LIZIZ(int i) {
        if (MultiGuestCrossDeviceBroadcastOptSetting.INSTANCE.isOpt()) {
            if (!this.LJLILLLLZI && !this.LJLJJLL) {
                return;
            }
        } else if (!this.LJLILLLLZI && (i != 3 || !MultiGuestCrossDeviceSetting.INSTANCE.isEnable())) {
            return;
        }
        LIZLLL(2, 0, i);
    }

    public final void LJFF(int i) {
        this.LJLIL.removeMessages(102);
        this.LJLILLLLZI = false;
        LIZLLL(4, i, 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (102 == message.what) {
            LIZJ(0, 0);
            return true;
        }
        return true;
    }

    public final void LIZJ(int i, int i2) {
        this.LJLIL.removeMessages(102);
        this.LJLJJI.LIZIZ(this.LJLJJL, i, i2, 0L, 0L);
        int i3 = this.LJLJJL;
        if (i3 == 2 || (i3 == 3 && i2 != 2)) {
            this.LJLIL.sendEmptyMessageDelayed(102, this.LJLJI);
        }
    }

    public final void LIZLLL(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_status", Integer.valueOf(i));
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put("pingSource", Integer.valueOf(i3));
        C0K2.LJII(0, "ttlive_broadcast_action_all", hashMap);
        this.LJLJJL = i;
        LIZJ(i2, i3);
    }
}
