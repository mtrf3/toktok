package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LRy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54278LRy extends AbstractC54272LRs {
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public abstract void LIZJ();

    public abstract void LIZLLL();

    @Override // X.AbstractC54272LRs
    public final void LIZIZ() {
        if (this.LIZLLL.get()) {
            return;
        }
        LIZLLL();
    }
}
