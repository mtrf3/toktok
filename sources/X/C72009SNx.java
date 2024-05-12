package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.mention.MentionViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72009SNx extends TBS implements InterfaceC88475Ynv<MentionViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SMC> {
    public static final C72009SNx LJLIL = new C72009SNx();

    public C72009SNx() {
        super(5, SMC.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/tagmention/mention/MentionViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SMC invoke(MentionViewModel mentionViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        MentionViewModel p0 = mentionViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SMC(p0, p1, p2, p3, p4);
    }
}
