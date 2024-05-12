package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.nearby.NearbyVisibilityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SOK extends TBS implements InterfaceC88475Ynv<NearbyVisibilityViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, C71946SLm> {
    public static final SOK LJLIL = new SOK();

    public SOK() {
        super(5, C71946SLm.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/nearby/NearbyVisibilityViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final C71946SLm invoke(NearbyVisibilityViewModel nearbyVisibilityViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        NearbyVisibilityViewModel p0 = nearbyVisibilityViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new C71946SLm(p0, p1, p2, p3, p4);
    }
}
