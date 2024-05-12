package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sync.settings.SettingsV2;

/* renamed from: X.QUh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67079QUh implements InterfaceC67081QUj, Handler.Callback, InterfaceC67071QTz {
    public final C67080QUi LJLIL = new C67080QUi(this);
    public final C67040QSu LJLILLLLZI;
    public final InterfaceC87871YeB LJLJI;
    public final InterfaceC67096QUy LJLJJI;
    public SettingsV2 LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC67081QUj LJLJL;
    public boolean LJLJLJ;

    @Override // X.InterfaceC67081QUj
    public final void LIZIZ() {
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
        if (interfaceC67081QUj != null) {
            interfaceC67081QUj.LIZIZ();
        }
        this.LJLJLJ = true;
    }

    @Override // X.QW5
    public final int LIZLLL() {
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
        if (interfaceC67081QUj == null) {
            return 0;
        }
        if (interfaceC67081QUj instanceof C87867Ye7) {
            return 1;
        }
        return 2;
    }

    @Override // X.InterfaceC67081QUj
    public final void destroy() {
        C66629QCz.LIZ("Compensator: WsFirstCompensator destroy");
        ((InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class)).LJIIZILJ(this);
        ((Handler) this.LJLIL.LIZLLL(new Object[0])).removeCallbacksAndMessages(null);
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
        if (interfaceC67081QUj != null) {
            interfaceC67081QUj.destroy();
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZ(C67101QVd c67101QVd) {
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
        if (interfaceC67081QUj != null) {
            interfaceC67081QUj.LIZ(c67101QVd);
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZJ(SettingsV2 settingsV2) {
        this.LJLJJL = settingsV2;
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
        if (interfaceC67081QUj != null) {
            interfaceC67081QUj.LIZJ(settingsV2);
        }
    }

    @Override // X.InterfaceC67071QTz
    public final void LJJJLZIJ(boolean z) {
        StringBuilder LJI = JBR.LJI("Compensator: WsFirstCompensator onWsStatusChanged cur=", z, ", before=");
        LJI.append(this.LJLJJLL);
        C66629QCz.LIZ(X1D.LIZIZ(LJI));
        if (z == this.LJLJJLL) {
            ((Handler) this.LJLIL.LIZLLL(new Object[0])).removeMessages(3);
        } else {
            if (((Handler) this.LJLIL.LIZLLL(new Object[0])).hasMessages(3)) {
                return;
            }
            ((Handler) this.LJLIL.LIZLLL(new Object[0])).sendMessageDelayed(((Handler) this.LJLIL.LIZLLL(new Object[0])).obtainMessage(3, Boolean.valueOf(z)), this.LJLJJL.eventSendDelay * 1000);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 3) {
            boolean booleanValue = ((Boolean) message.obj).booleanValue();
            if (booleanValue != this.LJLJJLL) {
                InterfaceC67081QUj interfaceC67081QUj = this.LJLJL;
                if (interfaceC67081QUj != null) {
                    interfaceC67081QUj.destroy();
                }
                InterfaceC67081QUj LJFF = LJFF(booleanValue, false);
                this.LJLJL = LJFF;
                LJFF.LJ(this.LJLJJL, this.LJLJLJ);
            }
            this.LJLJJLL = booleanValue;
        }
        return false;
    }

    @Override // X.InterfaceC67081QUj
    public final void LJ(SettingsV2 settingsV2, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Compensator] WsFirst start readyToPoll = ");
        LIZ.append(z);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJJL = settingsV2;
        this.LJLJLJ = z;
        this.LJLJJLL = this.LJLILLLLZI.LIZJ.LJFF();
        ((InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class)).LJJIJIIJI(this);
        InterfaceC67081QUj LJFF = LJFF(this.LJLJJLL, true);
        this.LJLJL = LJFF;
        LJFF.LJ(settingsV2, z);
    }

    public final InterfaceC67081QUj LJFF(boolean z, boolean z2) {
        if (z) {
            this.LJLJL = new C87867Ye7(this.LJLJI, this.LJLIL, this.LJLJJI);
        } else {
            this.LJLJL = new C87866Ye6(this.LJLJI, this.LJLIL, this.LJLJJI, z2, false);
        }
        return this.LJLJL;
    }

    public C67079QUh(InterfaceC87871YeB interfaceC87871YeB, QVY qvy, C67040QSu c67040QSu) {
        this.LJLJI = interfaceC87871YeB;
        this.LJLJJI = qvy;
        this.LJLILLLLZI = c67040QSu;
    }
}
