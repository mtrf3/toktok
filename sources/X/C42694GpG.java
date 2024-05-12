package X;

import com.ss.android.ugc.gamora.editor.sticker.donation.EditSelectDonationOrganizationDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.GpG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42694GpG implements InterfaceC42864Gs0 {
    public final /* synthetic */ EditSelectDonationOrganizationDialogFragment LIZ;

    @Override // X.InterfaceC42864Gs0
    public final void onDismiss() {
        this.LIZ.dismiss();
        C42699GpL c42699GpL = this.LIZ.LJLILLLLZI;
        if (c42699GpL != null) {
            c42699GpL.onDismiss();
        }
    }

    public C42694GpG(EditSelectDonationOrganizationDialogFragment editSelectDonationOrganizationDialogFragment) {
        this.LIZ = editSelectDonationOrganizationDialogFragment;
    }

    @Override // X.InterfaceC42864Gs0
    public final void LIZ(C6J6 org2) {
        o.LJIIIZ(org2, "org");
        C42699GpL c42699GpL = this.LIZ.LJLILLLLZI;
        if (c42699GpL != null) {
            c42699GpL.LIZ(org2);
        }
    }
}
