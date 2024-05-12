package X;

import com.bef.effectsdk.ResourceFinder;
import com.ss.android.vesdk.runtime.VERuntime;
import kotlin.jvm.internal.o;

/* renamed from: X.aUU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC93662aUU<P> {
    public static final C93661aUT Companion = new C93661aUT();
    public P epInstance;

    public abstract P createEpInstance();

    public abstract ResourceFinder createVEResourceFinder();

    public final synchronized P getEpInstance() {
        P p = this.epInstance;
        if (p != null) {
            return p;
        }
        this.epInstance = createEpInstance();
        VERuntime.getInstance().setEffectResourceFinder(createVEResourceFinder());
        C94034aaU.LIZ("EpResourceProvider", "epInstance from create");
        P p2 = this.epInstance;
        o.LJI(p2);
        return p2;
    }

    public abstract void removeAllListeners();
}
