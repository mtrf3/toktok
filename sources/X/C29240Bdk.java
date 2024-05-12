package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.DobDialogCanceledEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.EditBirthFailedWithoutConfirm;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.EditBirthSucc;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29240Bdk implements InterfaceC05250In {
    public final /* synthetic */ GameLinkWidget LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC05250In
    public final C76800UCe LJI() {
        String str;
        C0NB.LIZIZ("GameLinkWidget", "canceled dialog for edit dob");
        int i = this.LIZIZ;
        BZI LIZ = C28787BRn.LIZ("livesdk_add_birth_popup_window_click");
        if (i == 0) {
            str = "multi_live_apply";
        } else {
            str = "multi_live_accept";
        }
        LIZ.LJIJJ(str, "request_page");
        LIZ.LJIJJ("cancel", "click_type");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(DobDialogCanceledEvent.class);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe onFailed(String str) {
        DataChannel dataChannel;
        if (o.LJ(str, "") && this.LIZIZ == 2 && (dataChannel = this.LIZ.dataChannel) != null) {
            dataChannel.pv0(EditBirthFailedWithoutConfirm.class);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("edit dob failed and msg:");
        LIZ.append(str);
        C0NB.LJ("GameLinkWidget", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public C29240Bdk(int i, GameLinkWidget gameLinkWidget) {
        this.LIZ = gameLinkWidget;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe LJFF(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" enter edit dob succeed and dob:");
        LIZ.append(str);
        LIZ.append(", appealUrl:");
        LIZ.append(str2);
        C0NB.LIZIZ("GameLinkWidget", X1D.LIZIZ(LIZ));
        C78963Uyt.LJLIL = true;
        C78963Uyt.LJLILLLLZI = true;
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(EditBirthSucc.class, Integer.valueOf(this.LIZIZ));
        }
        return C76800UCe.LIZ;
    }
}
