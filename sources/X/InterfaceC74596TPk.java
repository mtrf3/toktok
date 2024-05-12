package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import webcast.data.multi_guest_play.ShowContent;

/* renamed from: X.TPk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC74596TPk extends InterfaceC31336CRo {
    void becomeGuest();

    void becomeNormalAudience();

    void dismissApplyDialogIfNeed();

    void forceDismissApplyDialog();

    boolean isApplyDialogShowing();

    boolean isInPipMode();

    boolean isViewValid();

    InterfaceC55235Lm3 linkScope();

    void loadLiveShowAudienceWidget();

    void onCheckPermissionFailed(TXK txk);

    void onCheckPermissionFailedV3(C74766TVy c74766TVy);

    void onInteractFailed();

    void onJoinChannelFailed(Throwable th);

    void onPlayerListChange(List<LinkPlayerInfo> list);

    void onTalkVoiceUpdated(int i);

    void setLiveShowContentForCharacterChange(ShowContent showContent);

    void showApplyDialog(boolean z, List<LinkPayPlan> list, String str, long j);

    void showBeautySettingDialog(long j, int i);

    void showKickOutDialog();

    void showLiveShowDialog();

    void showPreviewDialogWhenAnchorOrModeratorPermit(C74749TVh c74749TVh);

    void showReservationDialog(long j);

    void tryToShowGoLivePreviewDialogWhenAccepted(boolean z, List<LinkPayPlan> list, String str, long j, int i);
}
