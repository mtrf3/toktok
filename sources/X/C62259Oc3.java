package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.Oc3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62259Oc3 implements InterfaceC62349OdV {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ AwemeSharePackage LIZJ;
    public final /* synthetic */ C62255Obz LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62349OdV
    public final void LIZIZ() {
        C62340OdM.LJIJJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL.LIZ, this.LJ);
    }

    @Override // X.InterfaceC62349OdV
    public final void LIZ() {
        this.LIZJ.extras.putString("share_form", "url_form");
    }

    public C62259Oc3(Context context, View view, C62255Obz c62255Obz, AwemeSharePackage awemeSharePackage, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = awemeSharePackage;
        this.LIZLLL = c62255Obz;
        this.LJ = interfaceC88472Yns;
    }
}