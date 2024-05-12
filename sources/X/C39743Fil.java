package X;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Fil, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39743Fil {
    public final LinkedBlockingQueue<Integer> LIZ = new LinkedBlockingQueue<>(120000);
    public final LinkedBlockingQueue<Short> LIZIZ = new LinkedBlockingQueue<>(120000);
    public final boolean LIZJ;

    public C39743Fil() {
        boolean z;
        if (new Random().nextInt(10000) <= 10) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
    }
}
