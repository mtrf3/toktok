package X;

import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.gamora.editor.sticker.donation.EditSelectDonationOrganizationDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.GpJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42697GpJ implements IDonationService {
    @Override // com.ss.android.ugc.aweme.services.external.IDonationService
    public final DialogFragment getSelectDonationDialog(IDonationService.OnDonationOrgChangeListener listener) {
        o.LJIIIZ(listener, "listener");
        EditSelectDonationOrganizationDialogFragment editSelectDonationOrganizationDialogFragment = new EditSelectDonationOrganizationDialogFragment();
        editSelectDonationOrganizationDialogFragment.LJLILLLLZI = new C42699GpL(listener);
        return editSelectDonationOrganizationDialogFragment;
    }
}
