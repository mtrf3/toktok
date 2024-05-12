package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Oc1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62257Oc1 implements InterfaceC62350OdW {
    public final /* synthetic */ AwemeSharePackage LIZ;
    public final /* synthetic */ C62256Oc0 LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        AwemeSharePackage awemeSharePackage = this.LIZ;
        String key = this.LIZIZ.LIZ.key();
        Context context = this.LIZJ;
        C62340OdM.LJIIZILJ(awemeSharePackage, key, context, this.LIZLLL, new AqS114S0300000_10(this.LIZIZ, (C62256Oc0) context, (Context) this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 23), new AqS160S0100000_10(this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 517));
        this.LIZ.extras.putString("share_form", "video_form");
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZ.extras.putString("share_form", "url_form");
    }

    public C62257Oc1(Context context, View view, C62256Oc0 c62256Oc0, AwemeSharePackage awemeSharePackage, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = awemeSharePackage;
        this.LIZIZ = c62256Oc0;
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = interfaceC88472Yns;
    }
}
