package X;

import com.bytedance.apm.core.ActivityLifeObserver;

/* renamed from: X.1aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35381aA implements InterfaceC23150vX {
    public boolean LIZ;
    public final String LIZIZ = "cpu_active_time";

    @Override // X.InterfaceC23150vX
    public final void LIZLLL() {
        F9U.LIZ.LIZJ(new RunnableC23140vW(this, this.LIZ));
    }

    public AbstractC35381aA() {
        C09970aH.LJIIIIZZ();
        this.LIZ = ActivityLifeObserver.getInstance().isForeground();
    }
}
