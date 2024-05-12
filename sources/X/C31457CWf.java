package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;

/* renamed from: X.CWf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31457CWf implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        C76800UCe lambda$showSaveInfoDialog$8;
        switch (this.LJLIL) {
            case 0:
                LiveWidget liveWidget = (LiveWidget) this.LJLILLLLZI;
                liveWidget.getClass();
                int intValue = ((Integer) obj).intValue();
                DataChannel dataChannel = liveWidget.dataChannel;
                MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
                if ((intValue == 1 || intValue == 2) && C74776TWi.LJIILIIL(LJI) && C74776TWi.LJIIL()) {
                    C74776TWi.LIZJ(dataChannel);
                }
                return C76800UCe.LIZ;
            case 1:
                return MultiGuestPreviewFragment.vl((MultiGuestPreviewFragment) this.LJLILLLLZI);
            case 2:
                LivePlayFragment livePlayFragment = (LivePlayFragment) this.LJLILLLLZI;
                Long l = (Long) obj;
                if (livePlayFragment.r != null && l.longValue() == livePlayFragment.LJLIL) {
                    ((LiveRoomFragment) livePlayFragment.r).Ql();
                }
                return C76800UCe.LIZ;
            case 3:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) this.LJLILLLLZI;
                i18nSettingManageMyAccountActivity.getClass();
                i18nSettingManageMyAccountActivity.LLIL(false, EnumC85784Xlc.CHANGE, null);
                if (i18nSettingManageMyAccountActivity.LLIILII.LIZ()) {
                    i18nSettingManageMyAccountActivity.LLFII(false);
                } else {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("status", "verified");
                    FMX.LJIIL("enter_email_setting", c188727au.LIZ);
                    i18nSettingManageMyAccountActivity.LJLJI = true;
                    Bundle bundle = new Bundle();
                    bundle.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementEmail.getValue());
                    if (i18nSettingManageMyAccountActivity.LJLJJL && i18nSettingManageMyAccountActivity.LJLJJLL) {
                        bundle.putString("page", "prompt_user_confirm");
                        bundle.putString("enter_from", i18nSettingManageMyAccountActivity.LLIIIZ);
                        bundle.putString("enter_method", "normal");
                        bundle.putBoolean("is_from_prompt", true);
                    }
                    HG3.LJFF().changeEmail(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LLIIIZ, bundle, null);
                }
                return C76800UCe.LIZ;
            default:
                lambda$showSaveInfoDialog$8 = ((I18nSettingNewVersionFragment) this.LJLILLLLZI).lambda$showSaveInfoDialog$8((ARN) obj);
                return lambda$showSaveInfoDialog$8;
        }
    }

    public /* synthetic */ C31457CWf(int i, LifecycleOwner lifecycleOwner) {
        this.LJLIL = i;
        this.LJLILLLLZI = lifecycleOwner;
    }
}
