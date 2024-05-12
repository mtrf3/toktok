package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.Obx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62253Obx implements InterfaceC62350OdW {
    public final /* synthetic */ C62252Obw LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ View LIZJ;
    public final /* synthetic */ AwemeSharePackage LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        int LIZJ = C62359Odf.LIZJ(this.LIZ.LIZ.key(), C62359Odf.LIZLLL());
        C62252Obw c62252Obw = this.LIZ;
        C62233Obd.LJ(c62252Obw.LIZIZ, c62252Obw.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, false, LIZJ);
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZLLL.extras.putString("share_form", "url_form");
    }

    public C62253Obx(Context context, View view, C62252Obw c62252Obw, AwemeSharePackage awemeSharePackage, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = c62252Obw;
        this.LIZIZ = context;
        this.LIZJ = view;
        this.LIZLLL = awemeSharePackage;
        this.LJ = interfaceC88472Yns;
    }
}
