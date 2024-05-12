package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGN implements INetworkStandardUIService {
    public static final MGN LJLILLLLZI = new MGN();
    public final /* synthetic */ INetworkStandardUIService LJLIL = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final InterfaceC84463Te getNetworkStateForSharePanel() {
        return this.LJLIL.getNetworkStateForSharePanel();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final boolean isStandardUIEnable() {
        return this.LJLIL.isStandardUIEnable();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void registerForNetworkChangeToasts() {
        this.LJLIL.registerForNetworkChangeToasts();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void removeLazyToast(MG5 sceneName) {
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.removeLazyToast(sceneName);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void resetTipsBarrier(C73305Spp tuxStatusView) {
        o.LJIIIZ(tuxStatusView, "tuxStatusView");
        this.LJLIL.resetTipsBarrier(tuxStatusView);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void setStatusView(C73305Spp c73305Spp, MG5 sceneName, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Exception exc) {
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.setStatusView(c73305Spp, sceneName, interfaceC65784Pro, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void setStatusView(C73305Spp tuxStatusView, String sceneName, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Exception exc) {
        o.LJIIIZ(tuxStatusView, "tuxStatusView");
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.setStatusView(tuxStatusView, sceneName, interfaceC65784Pro, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void showNetworkToast(Activity activity, InterfaceC84463Te state, String sceneName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.showNetworkToast(activity, state, sceneName);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void startLazyToast(MG5 sceneName, Activity activity) {
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.startLazyToast(sceneName, activity);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void triggerNetworkTips(Activity activity, MG5 sceneName, Exception exc, C73305Spp c73305Spp) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.triggerNetworkTips(activity, sceneName, exc, c73305Spp);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void triggerNetworkTips(Activity activity, String sceneName, Exception exc, C73305Spp c73305Spp) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL.triggerNetworkTips(activity, sceneName, exc, c73305Spp);
    }
}
