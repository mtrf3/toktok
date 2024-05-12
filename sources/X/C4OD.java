package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.4OD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OD extends AbstractC65781Prl implements InterfaceC88472Yns<C63120Opw, C76800UCe> {
    public final /* synthetic */ C4OF LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OD(C4OF c4of) {
        super(1);
        this.LJLIL = c4of;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C63120Opw c63120Opw) {
        Bundle bundle;
        C63120Opw c63120Opw2 = c63120Opw;
        this.LJLIL.LIZLLL(false);
        if (c63120Opw2 != null) {
            SharePackage sharePackage = this.LJLIL.LJLIL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                bundle.putBoolean("is_new_group", true);
            }
            this.LJLIL.LIZIZ(C47261Igj.LJJIJIL(C3K0.LIZIZ(c63120Opw2)));
        }
        return C76800UCe.LIZ;
    }
}
