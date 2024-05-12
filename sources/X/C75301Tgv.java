package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* renamed from: X.Tgv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75301Tgv implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C75301Tgv(int i, MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = multiLiveAnchorSettingDialog;
        this.LJLJI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        EnumC74991Tbv enumC74991Tbv;
        liveDialog.dismiss();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJJJJL(this.LJLIL);
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LJLILLLLZI.LLJLLL;
        if (multiLiveAnchorPanelSettings != null) {
            enumC74991Tbv = C86793Y4n.LJJ(multiLiveAnchorPanelSettings);
        } else {
            enumC74991Tbv = null;
        }
        int LJFF = C74776TWi.LJFF(enumC74991Tbv);
        AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) this.LJLILLLLZI.LJLILLLLZI;
        if (abstractC75306Th0 != null) {
            C74983Tbn LIZ = C29556Biq.LIZ();
            String str = this.LJLIL;
            LIZ.getClass();
            int LJIIJ = C74983Tbn.LJIIJ(str);
            String str2 = this.LJLIL;
            abstractC75306Th0.LIZJ(LJIIJ, str2, LJFF, new C75302Tgw(LJFF, this.LJLILLLLZI, str2));
        }
        int i = this.LJLJI;
        C74983Tbn LIZ2 = C29556Biq.LIZ();
        String str3 = this.LJLIL;
        LIZ2.getClass();
        C74824TYe.LJJJJJ(i, C74983Tbn.LJIIJ(str3) - 1, "guidance", "click", "change");
    }
}
