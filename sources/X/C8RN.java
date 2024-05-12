package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8RN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RN extends ASB {
    public final C62435Oet LJLJJI;

    @Override // X.ASB
    public final String LIZLLL() {
        return "report";
    }

    public final String LJ() {
        String str;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && aweme.isPhotoMode() && (str = this.LJLJJI.LJLJI) != null && !o.LJ(str, "normal_share")) {
            return this.LJLJJI.LJLJI;
        }
        return "long_press";
    }

    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        Context context = v.getContext();
        o.LJIIIIZZ(context, "v.context");
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1499);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ == null) {
            return;
        }
        INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createINetworkStandardUIServicebyMonsterPlugin, "get().getService(INetwor…ardUIService::class.java)");
        InterfaceC84463Te networkStateForSharePanel = createINetworkStandardUIServicebyMonsterPlugin.getNetworkStateForSharePanel();
        if (networkStateForSharePanel instanceof InterfaceC84473Tf) {
            aqS153S0100000_3.invoke();
        } else {
            createINetworkStandardUIServicebyMonsterPlugin.showNetworkToast(LJJLIIIJ, networkStateForSharePanel, "");
        }
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        this.LJLJJI.LJLJLJ.extras.putString("action_type", "report");
        super.LIZIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8RN(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
    }
}
