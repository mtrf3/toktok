package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72006SNu extends TBS implements InterfaceC88475Ynv<MusicCollectionViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, C71944SLk> {
    public static final C72006SNu LJLIL = new C72006SNu();

    public C72006SNu() {
        super(5, C71944SLk.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/collection/MusicCollectionViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final C71944SLk invoke(MusicCollectionViewModel musicCollectionViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
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
        return new C71944SLk(p0, p1, p2, p3, p4);
    }
}
