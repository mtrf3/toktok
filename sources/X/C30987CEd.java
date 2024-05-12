package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CEd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30987CEd implements InterfaceC62096OYq {
    public final /* synthetic */ SubscriptionSettingFragmentNew LJLIL;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    public C30987CEd(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LJLIL = subscriptionSettingFragmentNew;
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        C0NB.LIZ("share fail");
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        String str3;
        ActivityC45651qj mo49getActivity;
        if (SC5.LIZIZ(str, "platform", str2, "shareType", "chat_merge", str) && o.LJ("link", str2) && (mo49getActivity = this.LJLIL.mo49getActivity()) != null) {
            C30868C9o.LIZIZ(mo49getActivity, C15380j0.LJIILJJIL(R.string.o9k));
        }
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = this.LJLIL;
        if (bundle != null) {
            str3 = bundle.getString("shareIdList", "");
        } else {
            str3 = null;
        }
        subscriptionSettingFragmentNew.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_share");
        subscriptionSettingFragmentNew.Tl(LIZ);
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "show_entrance");
        C06490Nh.LIZLLL(LIZ, str, "share_platform", str3, "to_user_id");
        C0NB.LIZ("share success");
    }
}
