package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* renamed from: X.Tgt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75299Tgt implements C0K7 {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C75299Tgt(int i, MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, String str) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        EnumC74991Tbv enumC74991Tbv;
        liveDialog.dismiss();
        String Rl = this.LJLIL.Rl();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJJJJL(this.LJLILLLLZI);
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("sourceLayoutId:", Rl, ", targetLayoutId:");
        C31811Ce7.LJ(LIZIZ, this.LJLILLLLZI, LIZIZ, "MultiLiveAnchorSettingDialog");
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LJLIL.LLJLLL;
        Integer num = null;
        if (multiLiveAnchorPanelSettings != null) {
            enumC74991Tbv = C86793Y4n.LJJ(multiLiveAnchorPanelSettings);
        } else {
            enumC74991Tbv = null;
        }
        int LJFF = C74776TWi.LJFF(enumC74991Tbv);
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) multiLiveAnchorSettingDialog.LJLILLLLZI;
        if (abstractC75306Th0 != null) {
            int i = this.LJLJI;
            String str = this.LJLILLLLZI;
            abstractC75306Th0.LIZJ(i, str, LJFF, new C75300Tgu(multiLiveAnchorSettingDialog, str, LJFF, Rl));
        }
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog2 = this.LJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorSettingDialog2.LLJLLL;
        if (multiLiveAnchorPanelSettings2 != null) {
            num = Integer.valueOf(multiLiveAnchorPanelSettings2.layoutType);
        }
        C74824TYe.LJJJJJ(multiLiveAnchorSettingDialog2.Nl(num), this.LJLJI - 1, "normal", "click", "change");
    }
}
