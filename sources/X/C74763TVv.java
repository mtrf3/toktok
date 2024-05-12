package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TVv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74763TVv implements InterfaceC14120gy {
    public final /* synthetic */ C74762TVu LJLIL;

    public C74763TVv(C74762TVu c74762TVu) {
        this.LJLIL = c74762TVu;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        C74762TVu c74762TVu = this.LJLIL;
        c74762TVu.getClass();
        TWL twl = TWL.LIZ;
        String str = TTV.LIZ().LJJ;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        String LIZLLL = C74838TYs.LJ().LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        twl.LJIIIIZZ(currentUserId, "guest_icon", str, LIZLLL);
        DataChannel dataChannel = c74762TVu.LJLIL;
        if (dataChannel != null) {
            dataChannel.qv0(ShowGuestDisconnectDialogEvent.class, new OSZ("guest_icon", 10002));
        }
    }
}
