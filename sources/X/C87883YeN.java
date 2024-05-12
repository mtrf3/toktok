package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YeN, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87883YeN implements Y9V {
    public final C87881YeL LIZ;
    public final C88213dB LIZIZ;
    public final AqS166S0100000_16 LIZJ;

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88471Ynr LJIIJ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LIZ.LJIIIIZZ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, String> LIZIZ() {
        return this.LIZ.LJIIJ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LIZJ() {
        return this.LIZ.LJIIIZ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LIZ.LJIIJJI;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LIZ.LJIILIIL;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LIZ.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LIZ.LJIILJJIL;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87883YeN)) {
            return false;
        }
        return this.LIZ.LJII(((C87883YeN) delegate).LIZ);
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87883YeN)) {
            return false;
        }
        return this.LIZ.LJIIIZ(((C87883YeN) delegate).LIZ);
    }

    public C87883YeN(C87881YeL c87881YeL, C88213dB launchPerformanceHandler) {
        o.LJIIIZ(launchPerformanceHandler, "launchPerformanceHandler");
        this.LIZ = c87881YeL;
        this.LIZIZ = launchPerformanceHandler;
        this.LIZJ = new AqS166S0100000_16(this, 14);
    }
}
