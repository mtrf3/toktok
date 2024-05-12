package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Obl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62241Obl implements InterfaceC62350OdW {
    public final /* synthetic */ AwemeSharePackage LIZ;
    public final /* synthetic */ C62240Obk LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ InterfaceC62225ObV LJ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJFF;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        AwemeSharePackage awemeSharePackage = this.LIZ;
        String key = this.LIZIZ.LIZ.key();
        Context context = this.LIZJ;
        C62340OdM.LJIIZILJ(awemeSharePackage, key, context, this.LIZLLL, new AqS114S0300000_10(this.LJ, (InterfaceC62225ObV) context, (Context) this.LJFF, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 18), new AqS160S0100000_10(this.LJFF, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 512));
        this.LIZ.extras.putString("share_form", "video_form");
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZ.extras.putString("share_form", "url_form");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C62241Obl(AwemeSharePackage awemeSharePackage, C62240Obk c62240Obk, Context context, View view, InterfaceC62225ObV interfaceC62225ObV, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = awemeSharePackage;
        this.LIZIZ = c62240Obk;
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = interfaceC62225ObV;
        this.LJFF = interfaceC88472Yns;
    }
}
