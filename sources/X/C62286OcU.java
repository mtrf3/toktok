package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.core.ui.campaign.ShareCampaignFragment;

/* renamed from: X.OcU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62286OcU implements C4P8 {
    public final /* synthetic */ ShareCampaignFragment LJLIL;

    @Override // X.C4P8
    public final void O0(int i) {
    }

    public C62286OcU(ShareCampaignFragment shareCampaignFragment) {
        this.LJLIL = shareCampaignFragment;
    }

    @Override // X.C4P8
    public final void Vd(ASU asu) {
        TuxSheet tuxSheet = this.LJLIL.LJLJJLL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
    }
}
