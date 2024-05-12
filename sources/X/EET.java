package X;

import Y.ARunnableS12S1000000_6;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EET extends EEN implements Handler.Callback {
    public final EFV LJLILLLLZI = new EFV(this);
    public boolean LJLJI;

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
        this.LJLJI = true;
        if (EEZ.LIZIZ == EEU.COLD_BOOT_BEGIN) {
            EEZ.LIZIZ = EEU.COLD_BOOT_END;
            C36093EEn.LIZ.getClass();
            EEX eex = C36093EEn.LJIIJJI;
            if (eex != null) {
                eex.LIZ(EEV.COLD_BOOT_END);
            }
            EEW eew = EEW.LIZ;
            eew.LIZIZ(1207, 1000L);
            eew.LIZIZ(1208, 8000L);
            eew.postDelayed(E40.LJLIL, 8000L);
            C38995FSd.LIZIZ().execute(RunnableC36080EEa.LJLIL);
            HashMap<EnumC36103EEx, InterfaceC36091EEl> hashMap = C36093EEn.LJIILJJIL;
            InterfaceC36091EEl interfaceC36091EEl = hashMap.get(EnumC36103EEx.REQUEST_BOOT_FINISH);
            if (interfaceC36091EEl != null) {
                interfaceC36091EEl.LIZ();
            }
            InterfaceC36091EEl interfaceC36091EEl2 = hashMap.get(EnumC36103EEx.REQUEST_IDLE);
            if (interfaceC36091EEl2 != null) {
                interfaceC36091EEl2.LIZ();
            }
        }
        if (EEZ.LIZIZ == EEU.HOT_BOOT_BEGIN) {
            EEZ.LIZIZ = EEU.HOT_BOOT_END;
            C36093EEn.LIZ.getClass();
            HashMap<EnumC36103EEx, InterfaceC36091EEl> hashMap2 = C36093EEn.LJIILJJIL;
            InterfaceC36091EEl interfaceC36091EEl3 = hashMap2.get(EnumC36103EEx.REQUEST_BOOT_FINISH);
            if (interfaceC36091EEl3 != null) {
                interfaceC36091EEl3.LIZ();
            }
            InterfaceC36091EEl interfaceC36091EEl4 = hashMap2.get(EnumC36103EEx.REQUEST_IDLE);
            if (interfaceC36091EEl4 != null) {
                interfaceC36091EEl4.LIZ();
            }
        }
        this.LJLILLLLZI.LIZIZ(1201, 1000L);
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
        this.LJLJI = false;
    }

    public final void LJFF() {
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        EFK efk = EFK.BOOT_FINISH;
        String LIZJ = eem.LIZJ(efk);
        if (LIZJ != null) {
            C37179EiV.LIZJ(false).execute(new ARunnableS12S1000000_6(LIZJ, 7));
        }
        if (eem.LIZ(efk)) {
            this.LJLILLLLZI.LIZIZ(1201, 50L);
        }
    }

    @Override // X.EEN, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (C2NW.LIZ().LJJIIZ()) {
            if (this.LJLJI) {
                LJFF();
                return true;
            }
            return true;
        }
        LJFF();
        return true;
    }
}
