package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.Oby, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62254Oby implements InterfaceC62349OdV {
    public final /* synthetic */ AwemeSharePackage LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ View LIZJ;
    public final /* synthetic */ C62252Obw LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62349OdV
    public final void LIZ() {
        this.LIZ.extras.putString("share_form", "url_form");
    }

    @Override // X.InterfaceC62349OdV
    public final void LIZIZ() {
        AwemeSharePackage awemeSharePackage = this.LIZ;
        if (awemeSharePackage != null) {
            Context context = this.LIZIZ;
            View view = this.LIZJ;
            C62252Obw c62252Obw = this.LIZLLL;
            C62340OdM.LJIJJ(context, view, awemeSharePackage, c62252Obw.LIZ, this.LJ);
        }
    }

    public C62254Oby(Context context, View view, C62252Obw c62252Obw, AwemeSharePackage awemeSharePackage, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = awemeSharePackage;
        this.LIZIZ = context;
        this.LIZJ = view;
        this.LIZLLL = c62252Obw;
        this.LJ = interfaceC88472Yns;
    }
}
