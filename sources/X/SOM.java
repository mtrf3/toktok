package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.following.FollowingVisibilityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SOM extends TBS implements InterfaceC88475Ynv<FollowingVisibilityViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SM5> {
    public static final SOM LJLIL = new SOM();

    public SOM() {
        super(5, SM5.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/following/FollowingVisibilityViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SM5 invoke(FollowingVisibilityViewModel followingVisibilityViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        FollowingVisibilityViewModel p0 = followingVisibilityViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SM5(p0, p1, p2, p3, p4);
    }
}
