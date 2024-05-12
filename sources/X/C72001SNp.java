package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.ativitystatus.ActivityStatusPrivacyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72001SNp extends TBS implements InterfaceC88475Ynv<ActivityStatusPrivacyViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, C71953SLt> {
    public static final C72001SNp LJLIL = new C72001SNp();

    public C72001SNp() {
        super(5, C71953SLt.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/ativitystatus/ActivityStatusPrivacyViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final C71953SLt invoke(ActivityStatusPrivacyViewModel activityStatusPrivacyViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        ActivityStatusPrivacyViewModel p0 = activityStatusPrivacyViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new C71953SLt(p0, p1, p2, p3, p4);
    }
}
