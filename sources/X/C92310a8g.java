package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.a8g, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92310a8g implements InterfaceC91814a0g {
    public final /* synthetic */ PinConfirmViewAssem LIZ;

    @Override // X.InterfaceC91814a0g
    public final void LIZIZ() {
        ((SY4) this.LIZ._$_findCachedViewById(R.id.gf)).setEnabled(false);
    }

    public C92310a8g(PinConfirmViewAssem pinConfirmViewAssem) {
        this.LIZ = pinConfirmViewAssem;
    }

    @Override // X.InterfaceC91814a0g
    public final void LIZ(String inputString) {
        o.LJIIIZ(inputString, "inputString");
        PinConfirmViewAssem pinConfirmViewAssem = this.LIZ;
        pinConfirmViewAssem.LJLJJI = inputString;
        ((SY4) pinConfirmViewAssem._$_findCachedViewById(R.id.gf)).setEnabled(true);
    }
}
