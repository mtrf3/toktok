package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.YeR, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87887YeR implements Y9V {
    public final String LIZ;
    public final C86033Zf LIZIZ;
    public final C87882YeM LIZJ;
    public final AqS166S0100000_16 LIZLLL = new AqS166S0100000_16(this, 11);
    public final AqS167S0100000_1 LJ = new AqS167S0100000_1(this, 275);

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, String> LIZIZ() {
        this.LIZJ.getClass();
        return null;
    }

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88471Ynr LJIIJ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LIZJ.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LIZJ.LJIIIZ;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LIZJ.LJIIJJI;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LIZJ.LJI;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LIZJ.LJIIL;
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
    public final boolean LJII(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87887YeR)) {
            return false;
        }
        C87887YeR c87887YeR = (C87887YeR) delegate;
        if (!this.LIZJ.LJII(c87887YeR.LIZJ) || this.LIZIZ != c87887YeR.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87887YeR)) {
            return false;
        }
        C87887YeR c87887YeR = (C87887YeR) delegate;
        if (!this.LIZJ.LJIIIZ(c87887YeR.LIZJ) || !o.LJ(this.LIZIZ, c87887YeR.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C87887YeR(String str, C86033Zf c86033Zf, C87882YeM c87882YeM) {
        this.LIZ = str;
        this.LIZIZ = c86033Zf;
        this.LIZJ = c87882YeM;
    }
}
