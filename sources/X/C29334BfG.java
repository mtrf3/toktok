package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SharePanelMethod;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.BfG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29334BfG implements InterfaceC62096OYq {
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

    public C29334BfG(SharePanelMethod sharePanelMethod, Room room) {
        this.LJLILLLLZI = sharePanelMethod;
        this.LJLIL = room;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        String str3 = "";
        if (bundle != null) {
            str3 = bundle.getString("shareIdList", "");
        }
        this.LJLILLLLZI.LJJIFFI(str, this.LJLIL.getLabels(), this.LJLIL.getId(), str3);
        SharePanelMethod sharePanelMethod = this.LJLILLLLZI;
        Room room = this.LJLIL;
        sharePanelMethod.getClass();
        SharePanelMethod.LJJI(room, str, str2, str3);
    }
}
