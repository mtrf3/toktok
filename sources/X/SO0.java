package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.tag.TagViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SO0 extends TBS implements InterfaceC88475Ynv<TagViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SMA> {
    public static final SO0 LJLIL = new SO0();

    public SO0() {
        super(5, SMA.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/tagmention/tag/TagViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SMA invoke(TagViewModel tagViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        TagViewModel p0 = tagViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SMA(p0, p1, p2, p3, p4);
    }
}
