package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToMutualConnectionsViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SOS extends TBS implements InterfaceC88475Ynv<SugToMutualConnectionsViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SOT> {
    public static final SOS LJLIL = new SOS();

    public SOS() {
        super(5, SOT.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/suggestaccount/SugToMutualConnectionsViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SOT invoke(SugToMutualConnectionsViewModel sugToMutualConnectionsViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        SugToMutualConnectionsViewModel p0 = sugToMutualConnectionsViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SOT(p0, p1, p2, p3, p4);
    }
}
