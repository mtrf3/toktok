package X;

import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.9vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252569vg {
    public static final void LIZ(C73305Spp view, String sceneName, Throwable th, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Exception exc;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sceneName, "sceneName");
        INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        createINetworkStandardUIServicebyMonsterPlugin.setStatusView(view, sceneName, interfaceC65784Pro, exc);
    }

    public static final void LIZIZ(C73305Spp c73305Spp, MG5 sceneName, Throwable th, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Exception exc;
        o.LJIIIZ(sceneName, "sceneName");
        INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        createINetworkStandardUIServicebyMonsterPlugin.setStatusView(c73305Spp, sceneName, interfaceC65784Pro, exc);
    }
}
