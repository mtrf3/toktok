package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SharePanelMethod;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.BfH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29335BfH implements InterfaceC62096OYq {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ SharePanelMethod LJLILLLLZI;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        C0NB.LJI("SharePanelMethod", th);
    }

    public C29335BfH(SharePanelMethod sharePanelMethod, Room room) {
        this.LJLILLLLZI = sharePanelMethod;
        this.LJLIL = room;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        String str3;
        String str4 = "";
        if (bundle == null) {
            str3 = "";
        } else {
            str3 = bundle.getString("shareIdList", "");
        }
        SharePanelMethod sharePanelMethod = this.LJLILLLLZI;
        Room room = this.LJLIL;
        if (room != null) {
            str4 = room.getLabels();
        }
        sharePanelMethod.LJJIFFI(str, str4, 0L, str3);
        SharePanelMethod sharePanelMethod2 = this.LJLILLLLZI;
        Room room2 = this.LJLIL;
        sharePanelMethod2.getClass();
        SharePanelMethod.LJJI(room2, str, str2, str3);
    }
}
