package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinChangeConsultResult;
import kotlin.jvm.internal.o;

/* renamed from: X.a8J, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92287a8J implements InterfaceC91814a0g {
    public final /* synthetic */ PinChangeViewAssem LIZ;

    @Override // X.InterfaceC91814a0g
    public final void LIZIZ() {
    }

    public C92287a8J(PinChangeViewAssem pinChangeViewAssem) {
        this.LIZ = pinChangeViewAssem;
    }

    @Override // X.InterfaceC91814a0g
    public final void LIZ(String inputString) {
        String str;
        o.LJIIIZ(inputString, "inputString");
        PinChangeViewAssem pinChangeViewAssem = this.LIZ;
        PinChangeConsultResult pinChangeConsultResult = pinChangeViewAssem.LJLJJI;
        if (pinChangeConsultResult != null && (str = pinChangeConsultResult.verifyInfo) != null) {
            PinChangeViewModel C3 = pinChangeViewAssem.C3();
            C3.getClass();
            XKX.LIZLLL(C3.getAssemVMScope(), null, null, new C93151aMF(C3, str, inputString, null), 3);
        }
    }
}
