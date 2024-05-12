package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.Obp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62245Obp implements InterfaceC62350OdW {
    public final /* synthetic */ C62244Obo LIZ;
    public final /* synthetic */ AwemeSharePackage LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        C62233Obd.LJ(this.LIZIZ.LJIILLIIL(), this.LIZ.LIZ, this.LIZJ, this.LIZLLL, this.LIZIZ, this.LJ, false, C62359Odf.LIZJ(this.LIZ.LIZ.key(), C62359Odf.LIZLLL()));
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZIZ.extras.putString("share_form", "url_form");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C62245Obp(C62244Obo c62244Obo, AwemeSharePackage awemeSharePackage, Context context, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = c62244Obo;
        this.LIZIZ = awemeSharePackage;
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = interfaceC88472Yns;
    }
}
