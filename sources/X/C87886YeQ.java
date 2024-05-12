package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YeQ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87886YeQ implements Y9V {
    public final C87881YeL LIZ;
    public final C88213dB LIZIZ;
    public final AqS166S0100000_16 LIZJ = new AqS166S0100000_16(this, 10);

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88472Yns LIZIZ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LIZ.LJIIIIZZ;
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
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIJ() {
        return this.LIZ.LJIIL;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87886YeQ)) {
            return false;
        }
        return this.LIZ.LJII(((C87886YeQ) delegate).LIZ);
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87886YeQ)) {
            return false;
        }
        return this.LIZ.LJIIIZ(((C87886YeQ) delegate).LIZ);
    }

    public C87886YeQ(C87881YeL c87881YeL, C88213dB c88213dB) {
        this.LIZ = c87881YeL;
        this.LIZIZ = c88213dB;
    }
}
