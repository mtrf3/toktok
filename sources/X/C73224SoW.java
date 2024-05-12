package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;

/* renamed from: X.SoW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73224SoW implements InterfaceC73142SnC<NewFaceStickerBean, AML> {
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

    public C73224SoW(AqS178S0100000_12 aqS178S0100000_12, AqS194S0100000_12 aqS194S0100000_12, LCX lcx) {
        this.LIZLLL = aqS178S0100000_12;
        this.LJ = aqS194S0100000_12;
        this.LJFF = lcx;
        this.LIZ = aqS178S0100000_12;
        this.LIZIZ = aqS194S0100000_12;
        this.LIZJ = lcx;
    }
}
