package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;

/* loaded from: classes14.dex */
public interface TSX extends InterfaceC31336CRo {
    void becomeGuest();

    void becomeNormalAudience();

    void dismissApplyDialogIfNeed();

    void forceDismissApplyDialog();

    boolean isApplyDialogShowing();

    boolean isInPipMode();

    boolean isViewValid();

    void onCheckPermissionFailed(C74698TTi c74698TTi);

    void onCheckPermissionFailedV3(C74764TVw c74764TVw);

    void onInteractFailed();

    void onJoinChannelFailed(Throwable th);

    void onPlayerListChange(List<LinkPlayerInfo> list);

    void showApplyDialog(long j);

    void showKickOutDialog();

    void showPreviewDialogWhenAnchorPermit(C74748TVg c74748TVg);

    void tryToShowGoLivePreviewDialogWhenAccepted(boolean z, List<LinkPayPlan> list, String str, long j, int i);
}
