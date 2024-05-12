package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.AqS174S0200000_12;

/* renamed from: X.T2y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74012T2y implements InterfaceC73142SnC<NewFaceStickerBean, AML> {
    public final InterfaceC88472Yns<AML, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<AML, List<? extends NewFaceStickerBean>, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr LJ;
    public final /* synthetic */ InterfaceC88471Ynr LJFF;

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, List<? extends NewFaceStickerBean>, C76800UCe> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88472Yns<AML, C76800UCe> LIZJ() {
        return this.LIZ;
    }

    public C74012T2y(T34 t34, T32 t32, AqS174S0200000_12 aqS174S0200000_12) {
        this.LIZLLL = t34;
        this.LJ = t32;
        this.LJFF = aqS174S0200000_12;
        this.LIZ = t34;
        this.LIZIZ = t32;
        this.LIZJ = aqS174S0200000_12;
    }
}
