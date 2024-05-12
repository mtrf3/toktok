package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.mention.MentionViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72008SNw extends TBS implements InterfaceC88475Ynv<MentionViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SM7> {
    public static final C72008SNw LJLIL = new C72008SNw();

    public C72008SNw() {
        super(5, SM7.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/tagmention/mention/MentionViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SM7 invoke(MentionViewModel mentionViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
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
        return new SM7(p0, p1, p2, p3, p4);
    }
}
