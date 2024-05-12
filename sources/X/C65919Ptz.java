package X;

import Y.ARunnableS3S1400000_11;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.UploadBacktraceConfig;
import com.bytedance.helios.network.NetworkComponent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ptz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65919Ptz implements InterfaceC65943PuN {
    public static final C65919Ptz LIZ = new C65919Ptz();

    @Override // X.InterfaceC65943PuN
    public final int LIZ() {
        return 8;
    }

    @Override // X.InterfaceC65943PuN
    public final int priority() {
        return -200;
    }

    @Override // X.InterfaceC65943PuN
    public final void LIZIZ(PYQ event) {
        NetworkConfig networkConfig;
        NetworkConfig networkConfig2;
        UploadBacktraceConfig uploadBacktraceConfig;
        java.util.Set<String> set;
        o.LJIIIZ(event, "event");
        if (!(event instanceof C65896Ptc)) {
            return;
        }
        C65922Pu2 c65922Pu2 = event.LJJJJL().LJLIL;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings == null || (networkConfig = settings.networkConfig) == null || !C65905Ptl.LIZ(networkConfig.networkBacktraceSampleRate)) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<android.net.Uri> it = ((C65896Ptc) event).LJLILLLLZI.iterator();
        while (it.hasNext()) {
            String uri = it.next().toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            SettingsModel settings2 = NetworkComponent.INSTANCE.getSettings();
            if (settings2 != null && (networkConfig2 = settings2.networkConfig) != null && (uploadBacktraceConfig = networkConfig2.uploadBacktraceUrl) != null && (set = uploadBacktraceConfig.webImage) != null && !set.isEmpty()) {
                Iterator<String> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (s.LJJJLZIJ(uri, it2.next(), false)) {
                        linkedHashSet.add(uri);
                        break;
                    }
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            Throwable th = new Throwable();
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String name = LLLLIIIILLL.getName();
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS3S1400000_11(linkedHashSet, c65922Pu2, name, event, th, 1));
        }
    }
}
