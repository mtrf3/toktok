package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.likedlist.LikedListViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72003SNr extends TBS implements InterfaceC88475Ynv<LikedListViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SN7> {
    public static final C72003SNr LJLIL = new C72003SNr();

    public C72003SNr() {
        super(5, SN7.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/likedlist/LikedListViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SN7 invoke(LikedListViewModel likedListViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        LikedListViewModel p0 = likedListViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SN7(p0, p1, p2, p3, p4);
    }
}