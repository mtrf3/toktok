package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YeP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87885YeP implements Y9V {
    public final C87882YeM LIZ;
    public final C88213dB LIZIZ;
    public final AqS166S0100000_16 LIZJ = new AqS166S0100000_16(this, 9);

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88472Yns LIZIZ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LIZ.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LIZJ() {
        return this.LIZ.LJIIIIZZ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LIZ.LJIIIZ;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LIZ.LJIIJJI;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LIZ.LJI;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LIZ.LJIIL;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIJ() {
        return this.LIZ.LJIIJ;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87885YeP)) {
            return false;
        }
        return this.LIZ.LJII(((C87885YeP) delegate).LIZ);
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87885YeP)) {
            return false;
        }
        return this.LIZ.LJIIIZ(((C87885YeP) delegate).LIZ);
    }

    public C87885YeP(C87882YeM c87882YeM, C88213dB c88213dB) {
        this.LIZ = c87882YeM;
        this.LIZIZ = c88213dB;
    }
}
