package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Th2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75308Th2 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75308Th2(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, int i, int i2) {
        super(0);
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nav);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mu…witchToPanel_modal_title)");
        String LJIILL = C15380j0.LJIILL(R.string.nau, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI));
        o.LJIIIIZZ(LJIILL, "getString(\n             …                        )");
        multiLiveAnchorSettingDialog.Zl(this.LJLJI, LJIILJJIL, LJIILL, C74776TWi.LJ);
        return C76800UCe.LIZ;
    }
}
