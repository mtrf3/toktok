package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SO4 extends TBS implements InterfaceC88475Ynv<ChatViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SMJ> {
    public static final SO4 LJLIL = new SO4();

    public SO4() {
        super(5, SMJ.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/chat/chat/ChatViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SMJ invoke(ChatViewModel chatViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        ChatViewModel p0 = chatViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SMJ(p0, p1, p2, p3, p4);
    }
}