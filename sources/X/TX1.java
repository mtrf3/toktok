package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class TX1 implements F6T {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ TX2 LIZJ;
    public final /* synthetic */ C74744TVc LIZLLL;
    public final /* synthetic */ C75154TeY LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ DataChannel LJII;

    @Override // X.F6T
    public final void onFailed() {
        MultiLiveAnchorPanelSettings LJI;
        this.LIZLLL.getClass();
        String LIZ = C74744TVc.LIZ(73);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Link mic bundle load failed");
        LIZ2.append(this);
        C32014ChO.LIZJ(LIZ, X1D.LIZIZ(LIZ2), null);
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(-1, "err_code", jSONObject);
        C05630Jz.LJI(jSONObject, "err_msg", "load_failed");
        C58414MwE.LIZLLL.LIZ("load_plugin", jSONObject);
        if (this.LIZ) {
            C74744TVc c74744TVc = this.LIZLLL;
            TX2 tx2 = this.LIZJ;
            C75154TeY c75154TeY = this.LJ;
            c74744TVc.getClass();
            if (tx2.LIZ()) {
                c75154TeY.LIZLLL();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("load link mic aab failed and show entrance ");
                LIZ3.append(c74744TVc);
                TVY.LIZIZ(X1D.LIZIZ(LIZ3));
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("load link mic aab failed and not show entrance");
            LIZ4.append(c74744TVc);
            TVY.LIZIZ(X1D.LIZIZ(LIZ4));
            return;
        }
        C74744TVc c74744TVc2 = this.LIZLLL;
        TX2 tx22 = this.LIZJ;
        C75154TeY c75154TeY2 = this.LJ;
        int i = this.LJFF;
        c74744TVc2.getClass();
        if (C77125UOr.LJIIJJI(i, 2) && (LJI = C74776TWi.LJI()) != null && LJI.allowViewerReq == 3 && tx22.LIZ()) {
            c75154TeY2.LIZLLL();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("load link mic aab failed and show entrance ");
            LIZ5.append(c74744TVc2);
            TVY.LIZIZ(X1D.LIZIZ(LIZ5));
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("load link mic aab failed and not show entrance ");
        LIZ6.append(c74744TVc2);
        TVY.LIZIZ(X1D.LIZIZ(LIZ6));
    }

    @Override // X.F6T
    public final void onSuccess() {
        MultiLiveAnchorPanelSettings LJI;
        this.LIZJ.LIZJ(Integer.MAX_VALUE);
        TVU.LJIJI(true, 0, this.LIZ, System.currentTimeMillis() - this.LIZIZ, "link_control_widget", "", "");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Link mic bundle load succeed, mIsMicRoom: ");
        LIZ.append(this.LJI);
        LIZ.append("mIsAnchor");
        LIZ.append(this.LIZ);
        LIZ.append(this.LJFF);
        C0NB.LJIIIZ("LinkMicAppBundleHelper", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        if (this.LJI && !CL8.LJ(this.LJII)) {
            C05630Jz.LIZ(-2, "err_code", jSONObject);
            C05630Jz.LJI(jSONObject, "err_msg", "is_mic_room");
            C58414MwE.LIZLLL.LIZ("load_plugin", jSONObject);
            return;
        }
        if (!this.LIZ) {
            C05630Jz.LIZ(-3, "err_code", jSONObject);
            C05630Jz.LJI(jSONObject, "err_msg", "not_anchor");
        } else {
            C05630Jz.LIZ(0, "err_code", jSONObject);
        }
        C58414MwE.LIZLLL.LIZ("load_plugin", jSONObject);
        if (this.LIZ) {
            C74744TVc c74744TVc = this.LIZLLL;
            C75154TeY c75154TeY = this.LJ;
            c74744TVc.getClass();
            c75154TeY.LIZJ();
            return;
        }
        C74744TVc c74744TVc2 = this.LIZLLL;
        C75154TeY c75154TeY2 = this.LJ;
        int i = this.LJFF;
        c74744TVc2.getClass();
        if (!C77125UOr.LJIIJJI(i, 2) || (LJI = C74776TWi.LJI()) == null || LJI.allowViewerReq != 3) {
            return;
        }
        c75154TeY2.LIZJ();
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        this.LIZJ.LIZJ(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPluginInstallError: reason = ");
        LIZ.append(i);
        TVY.LIZIZ(X1D.LIZIZ(LIZ));
        TVU.LJIJI(true, 1, this.LIZ, System.currentTimeMillis() - this.LIZIZ, "link_control_widget", String.valueOf(i), "");
    }

    public TX1(boolean z, long j, TX2 tx2, C74744TVc c74744TVc, C75154TeY c75154TeY, int i, boolean z2, DataChannel dataChannel) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = tx2;
        this.LIZLLL = c74744TVc;
        this.LJ = c75154TeY;
        this.LJFF = i;
        this.LJI = z2;
        this.LJII = dataChannel;
    }
}
