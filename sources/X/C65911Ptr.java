package X;

import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SceneConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.StackConfig;
import com.bytedance.helios.network.NetworkComponent;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ptr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65911Ptr implements InterfaceC65943PuN {
    public static final C65911Ptr LIZ = new C65911Ptr();

    @Override // X.InterfaceC65943PuN
    public final int LIZ() {
        return 8;
    }

    @Override // X.InterfaceC65943PuN
    public final int priority() {
        return -100;
    }

    @Override // X.InterfaceC65943PuN
    public final void LIZIZ(PYQ event) {
        StackConfig stackConfig;
        NetworkConfig networkConfig;
        o.LJIIIZ(event, "event");
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null) {
            stackConfig = networkConfig.stackConfig;
        } else {
            stackConfig = null;
        }
        if (!(event instanceof C65896Ptc) || stackConfig == null) {
            return;
        }
        C65922Pu2 c65922Pu2 = event.LJJJJL().LJLIL;
        for (SceneConfig sceneConfig : stackConfig.sceneConfigs) {
            if (sceneConfig.targets.contains(Integer.valueOf(c65922Pu2.LIZ)) && C65905Ptl.LIZ(sceneConfig.sampleRate)) {
                if (!sceneConfig.blockList.isEmpty()) {
                    C65896Ptc c65896Ptc = (C65896Ptc) event;
                    for (android.net.Uri uri : c65896Ptc.LJLILLLLZI) {
                        String uri2 = uri.toString();
                        o.LJIIIIZZ(uri2, "uri.toString()");
                        if (!ujb.o.LJJJJJL(uri2)) {
                            java.util.Set<String> set = sceneConfig.blockList;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator<String> it = set.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (s.LJJJLZIJ(uri2, it.next(), false)) {
                                            LIZJ(c65896Ptc, sceneConfig, uri);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (!sceneConfig.allowList.isEmpty()) {
                    C65896Ptc c65896Ptc2 = (C65896Ptc) event;
                    for (android.net.Uri uri3 : c65896Ptc2.LJLILLLLZI) {
                        String uri4 = uri3.toString();
                        o.LJIIIIZZ(uri4, "uri.toString()");
                        if (!ujb.o.LJJJJJL(uri4)) {
                            java.util.Set<String> set2 = sceneConfig.allowList;
                            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                Iterator<String> it2 = set2.iterator();
                                while (it2.hasNext()) {
                                    if (s.LJJJLZIJ(uri4, it2.next(), false)) {
                                        break;
                                    }
                                }
                            }
                            LIZJ(c65896Ptc2, sceneConfig, uri3);
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(C65896Ptc c65896Ptc, SceneConfig sceneConfig, android.net.Uri uri) {
        java.util.Map<android.net.Uri, java.util.Set<String>> map = c65896Ptc.LJLJI;
        java.util.Set<String> set = map.get(uri);
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        set.add(sceneConfig.name);
        map.put(uri, set);
        if (sceneConfig.isCollectStack) {
            c65896Ptc.LJLJJLL = true;
        } else {
            c65896Ptc.LJLJJL = true;
        }
        c65896Ptc.LJLIL.LJZI.LJLILLLLZI = true;
    }
}
