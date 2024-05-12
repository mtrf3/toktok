package X;

import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: X.LGq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC53984LGq<V> implements Callable {
    public static final CallableC53984LGq<V> LJLIL = new CallableC53984LGq<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C73040SlY.LJII(EF7.LIZIZ(), "discovery", "click");
        C116484hg.LIZ("network_status", String.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "discover_page_click");
        return null;
    }
}
