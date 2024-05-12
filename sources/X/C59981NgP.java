package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import yq4.a;

/* renamed from: X.NgP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59981NgP implements InterfaceC41034G8o {
    public final InterfaceC59983NgR LJLIL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final void LIZ() {
        Activity activity;
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "ba_report_i18n").appendQueryParameter("object_id", this.LJLIL.getProductId()).appendQueryParameter("category", this.LJLIL.LIZ()).appendQueryParameter("website", this.LJLIL.LIZIZ()).appendQueryParameter("country_id", C85990Xow.LIZ()).appendQueryParameter("pixel_id", this.LJLIL.LIZJ());
        IReportService LJIILLIIL = a.LJIILLIIL();
        Context context = this.LJLIL.getContext();
        if (context != null) {
            activity = KR3.LIZJ(context);
        } else {
            activity = null;
        }
        LJIILLIIL.LIZJ(activity, appendQueryParameter);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C59981NgP(C59982NgQ c59982NgQ) {
        this.LJLIL = c59982NgQ;
    }
}
