package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS56S0400000_10;

/* renamed from: X.Obh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62237Obh implements InterfaceC62350OdW {
    public final /* synthetic */ AwemeSharePackage LIZ;
    public final /* synthetic */ C62239Obj LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;

    @Override // X.InterfaceC62350OdW
    public final void LIZIZ() {
        AwemeSharePackage awemeSharePackage = this.LIZ;
        String key = this.LIZIZ.LIZ.key();
        Context context = this.LIZJ;
        C62340OdM.LJIIZILJ(awemeSharePackage, key, context, this.LIZLLL, new AqS56S0400000_10(this.LIZIZ, (C62239Obj) this.LIZ, (AwemeSharePackage) context, (Context) this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 13), new AqS160S0100000_10(this.LJ, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 510));
        this.LIZ.extras.putString("share_form", "video_form");
    }

    @Override // X.InterfaceC62350OdW
    public final void LIZ() {
        this.LIZ.extras.putString("share_form", "url_form");
    }

    public C62237Obh(Context context, View view, C62239Obj c62239Obj, AwemeSharePackage awemeSharePackage, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = awemeSharePackage;
        this.LIZIZ = c62239Obj;
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = interfaceC88472Yns;
    }
}
