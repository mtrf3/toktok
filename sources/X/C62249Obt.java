package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Obt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62249Obt implements InterfaceC62350OdW {
    public final /* synthetic */ AwemeSharePackage LIZ;
    public final /* synthetic */ C62248Obs LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        AwemeSharePackage awemeSharePackage = this.LIZ;
        String key = this.LIZIZ.LIZ.key();
        Context context = this.LIZJ;
        C62340OdM.LJIIZILJ(awemeSharePackage, key, context, this.LIZLLL, new AqS114S0300000_10(this.LIZIZ, (C62248Obs) context, (Context) this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 21), new AqS160S0100000_10(this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 515));
        this.LIZ.extras.putString("share_form", "video_form");
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZ.extras.putString("share_form", "url_form");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C62249Obt(AwemeSharePackage awemeSharePackage, C62248Obs c62248Obs, Context context, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = awemeSharePackage;
        this.LIZIZ = c62248Obs;
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = interfaceC88472Yns;
    }
}
