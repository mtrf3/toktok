package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.a8q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92320a8q implements InterfaceC91814a0g {
    public final /* synthetic */ PinVerifyViewAssem LIZ;

    @Override // X.InterfaceC91814a0g
    public final void LIZIZ() {
    }

    public C92320a8q(PinVerifyViewAssem pinVerifyViewAssem) {
        this.LIZ = pinVerifyViewAssem;
    }

    @Override // X.InterfaceC91814a0g
    public final void LIZ(String inputString) {
        o.LJIIIZ(inputString, "inputString");
        PinVerifyViewModel pinVerifyViewModel = (PinVerifyViewModel) this.LIZ.LJLILLLLZI.getValue();
        String verifyInfo = this.LIZ.A3().LJLIL;
        o.LJIIIZ(verifyInfo, "verifyInfo");
        XKX.LIZLLL(pinVerifyViewModel.getAssemVMScope(), null, null, new C93157aML(pinVerifyViewModel, verifyInfo, inputString, null), 3);
    }
}
