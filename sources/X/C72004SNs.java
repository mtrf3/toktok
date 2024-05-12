package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72004SNs extends TBS implements InterfaceC88475Ynv<CommentViewModel, Context, LifecycleOwner, PrivacySettingsAdapterConfigs, SKL, SME> {
    public static final C72004SNs LJLIL = new C72004SNs();

    public C72004SNs() {
        super(5, SME.class, "<init>", "<init>(Lcom/ss/android/ugc/tiktok/tpsc/settings/account/adapters/comment/CommentViewModel;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/tiktok/tpsc/settings/account/PrivacySettingsAdapterConfigs;Lcom/ss/android/ugc/tiktok/tpsc/utils/ToastHolder;)V", 0);
    }

    @Override // X.InterfaceC88475Ynv
    public final SME invoke(CommentViewModel commentViewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        CommentViewModel p0 = commentViewModel;
        Context p1 = context;
        LifecycleOwner p2 = lifecycleOwner;
        PrivacySettingsAdapterConfigs p3 = privacySettingsAdapterConfigs;
        SKL p4 = skl;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        return new SME(p0, p1, p2, p3, p4);
    }
}
