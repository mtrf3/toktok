package X;

import Y.ARunnableS42S0100000_6;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class EIV extends EIW {
    public final LinkedList<EIX> LIZJ;
    public final AtomicBoolean LIZLLL;
    public final AtomicBoolean LJ;

    public EIV(String str, boolean z) {
        super(str, z);
        this.LIZJ = new LinkedList<>();
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new AtomicBoolean(false);
    }

    @Override // X.EIW
    public final void LIZJ(long j, String str) {
        if (this.LJ.get()) {
            super.LIZJ(j, str);
            return;
        }
        if (this.LIZLLL.compareAndSet(false, true)) {
            C38995FSd.LJ().schedule(new ARunnableS42S0100000_6(this, 62), LivePlayEnforceIntervalSetting.DEFAULT, TimeUnit.MILLISECONDS);
        }
        synchronized (this.LIZJ) {
            if (this.LJ.get()) {
                super.LIZJ(j, str);
            } else {
                this.LIZJ.add(new EIX(str, j));
            }
        }
    }
}
