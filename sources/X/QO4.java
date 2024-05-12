package X;

import Y.ARunnableS47S0100000_11;
import Y.IDHandlerS23S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QO4 {
    public static volatile QO4 LJIIJ;
    public boolean LIZ;
    public QLG LIZLLL;
    public IDHandlerS23S0100000_11 LJ;
    public final QLE LJFF;
    public boolean LIZIZ = true;
    public long LIZJ = System.currentTimeMillis();
    public final List<QLG> LJI = new ArrayList();
    public boolean LJII = false;
    public final ARunnableS47S0100000_11 LJIIIIZZ = new ARunnableS47S0100000_11(this, 139);
    public final ARunnableS47S0100000_11 LJIIIZ = new ARunnableS47S0100000_11(this, UserLevelGeckoUpdateSetting.DEFAULT);

    public final Handler LIZ() {
        if (this.LJ == null) {
            synchronized (this) {
                if (this.LJ == null) {
                    this.LJ = new IDHandlerS23S0100000_11(this, HandlerThreadC36423ERf.LIZJ().getLooper(), 3);
                }
            }
        }
        return this.LJ;
    }

    public QO4(Context context) {
        C16880lQ.LLLLL(context);
        this.LJFF = new QLE(context);
    }

    public static QO4 LIZIZ(Context context) {
        if (LJIIJ == null) {
            synchronized (QO4.class) {
                if (LJIIJ == null) {
                    LJIIJ = new QO4(C16880lQ.LLLLL(context));
                }
            }
        }
        return LJIIJ;
    }

    public final void LIZJ(String str) {
        Handler LIZ = LIZ();
        LIZ.removeMessages(1);
        LIZ.sendMessageDelayed(Message.obtain(LIZ, 1, str), 5000L);
    }
}
