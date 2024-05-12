package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;

/* renamed from: X.TQf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC74617TQf extends InterfaceC31336CRo {
    void Tp(C74765TVx c74765TVx);

    void X9(boolean z);

    void dismissApplyDialogIfNeed();

    void forceDismissApplyDialog();

    void iA(TXC txc);

    void onPlayerListChange(List<? extends LinkPlayerInfo> list);

    void showApplyDialog(boolean z, List<? extends LinkPayPlan> list, String str, long j);

    void showKickOutDialog();

    void yq0(int i);
}
