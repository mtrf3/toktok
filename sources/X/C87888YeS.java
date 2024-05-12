package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.YeS, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87888YeS implements Y9V {
    public final IMUser LIZ;
    public final C86033Zf LIZIZ;
    public final C87881YeL LIZJ;
    public final AqS166S0100000_16 LIZLLL = new AqS166S0100000_16(this, 12);
    public final AqS167S0100000_1 LJ = new AqS167S0100000_1(this, 277);
    public final AqS167S0100000_1 LJFF = new AqS167S0100000_1(this, 276);

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88471Ynr LJIIJ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LIZJ.LJIIIIZZ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, String> LIZIZ() {
        return this.LIZJ.LJIIJ;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LIZJ.LJIILIIL;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LIZJ.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LIZJ.LJIILJJIL;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LIZJ() {
        return this.LJ;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LJFF;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87888YeS)) {
            return false;
        }
        C87888YeS c87888YeS = (C87888YeS) delegate;
        if (!this.LIZJ.LJII(c87888YeS.LIZJ) || this.LIZIZ != c87888YeS.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87888YeS)) {
            return false;
        }
        C87888YeS c87888YeS = (C87888YeS) delegate;
        if (!this.LIZJ.LJIIIZ(c87888YeS.LIZJ) || !o.LJ(this.LIZIZ, c87888YeS.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C87888YeS(IMUser iMUser, C86033Zf c86033Zf, C87881YeL c87881YeL) {
        this.LIZ = iMUser;
        this.LIZIZ = c86033Zf;
        this.LIZJ = c87881YeL;
    }
}
