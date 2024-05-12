package X;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class EYO extends AbstractC48183Ivb {
    public static volatile EYO LIZLLL;
    public final AtomicBoolean LIZJ;

    public EYO() {
        super(0);
        this.LIZJ = new AtomicBoolean(false);
    }

    public static EYO LIZJ() {
        if (LIZLLL == null) {
            synchronized (EYO.class) {
                if (LIZLLL == null) {
                    LIZLLL = new EYO();
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.AbstractC48183Ivb
    public final void LIZ() {
        this.LIZJ.set(true);
        Logger.debug();
    }

    @Override // X.AbstractC48183Ivb
    public final void LIZIZ() {
        this.LIZJ.set(false);
        Logger.debug();
    }
}
