package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72007SNv extends TBS implements InterfaceC88475Ynv<MusicCollectionViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, C71957SLx> {
    public static final C72007SNv LJLIL = new C72007SNv();

    public C72007SNv() {
        super(5, C71957SLx.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/collection/MusicCollectionViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final C71957SLx invoke(MusicCollectionViewModel musicCollectionViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        MusicCollectionViewModel p0 = musicCollectionViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new C71957SLx(p0, p1, p2, p3, p4);
    }
}
