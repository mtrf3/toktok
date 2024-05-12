package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sow, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73250Sow {
    public static final C73249Sov LJ = new C73249Sov();
    public C73247Sot LIZ;
    public C73243Sop LIZIZ;
    public final CopyOnWriteArraySet<AMK> LIZJ;
    public final Lifecycle LIZLLL;

    public final void LIZ(JediViewHolderProxy jediViewHolderProxy) {
        this.LIZLLL.removeObserver(jediViewHolderProxy);
        int i = C212588Vy.LIZ[this.LIZLLL.getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        jediViewHolderProxy.onStop();
                        jediViewHolderProxy.onDestroy();
                    }
                } else {
                    jediViewHolderProxy.onStop();
                    jediViewHolderProxy.onDestroy();
                }
            } else {
                jediViewHolderProxy.onDestroy();
            }
        } else if (!jediViewHolderProxy.LJLJJL) {
            jediViewHolderProxy.onDestroy();
        }
        this.LIZJ.remove(jediViewHolderProxy);
    }

    public C73250Sow(Lifecycle parentLifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
        o.LJIIJ(parentLifecycle, "parentLifecycle");
        this.LIZLLL = parentLifecycle;
        jediViewHolderProxyHost.LJLJI.add(new AqS162S0100000_12(this, 1112));
        this.LIZJ = new CopyOnWriteArraySet<>();
    }
}
