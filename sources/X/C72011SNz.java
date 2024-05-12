package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.videoviews.VideoViewHistorySettingViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72011SNz extends TBS implements InterfaceC88475Ynv<VideoViewHistorySettingViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SM0> {
    public static final C72011SNz LJLIL = new C72011SNz();

    public C72011SNz() {
        super(5, SM0.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/videoviews/VideoViewHistorySettingViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SM0 invoke(VideoViewHistorySettingViewModel videoViewHistorySettingViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        VideoViewHistorySettingViewModel p0 = videoViewHistorySettingViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SM0(p0, p1, p2, p3, p4);
    }
}
