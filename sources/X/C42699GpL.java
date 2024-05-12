package X;

import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GpL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42699GpL implements InterfaceC42864Gs0 {
    public final /* synthetic */ IDonationService.OnDonationOrgChangeListener LIZ;

    @Override // X.InterfaceC42864Gs0
    public final void onDismiss() {
        this.LIZ.onDismiss();
    }

    public C42699GpL(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
        this.LIZ = onDonationOrgChangeListener;
    }

    @Override // X.InterfaceC42864Gs0
    public final void LIZ(C6J6 org2) {
        o.LJIIIZ(org2, "org");
        IDonationService.OrganizationModel organizationModel = new IDonationService.OrganizationModel(org2.getName(), org2.getDesc(), org2.getIcon(), org2.getDetailUrl(), org2.getDonateLink(), org2.getOrgId(), org2.getOrgType(), org2.getNgoId());
        if (org2 instanceof OrganizationModel) {
            organizationModel.setAddTime(org2.getAddTime());
        }
        this.LIZ.onOrgSelected(organizationModel);
    }
}
