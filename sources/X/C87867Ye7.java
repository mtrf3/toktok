package X;

import com.bytedance.sync.settings.SettingsV2;

/* renamed from: X.Ye7, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87867Ye7 implements InterfaceC67081QUj {
    public final InterfaceC87871YeB LJLIL;
    public final AbstractC48851JFf LJLILLLLZI;
    public final InterfaceC67096QUy LJLJI;
    public AbstractC87863Ye3 LJLJJI;
    public SettingsV2 LJLJJL;

    @Override // X.QW5
    public final int LIZLLL() {
        return 1;
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZIZ() {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJI;
        if (abstractC87863Ye3 == null || abstractC87863Ye3.LIZJ() == 1) {
            AbstractC87863Ye3 abstractC87863Ye32 = this.LJLJJI;
            if (abstractC87863Ye32 != null) {
                abstractC87863Ye32.LIZ();
            }
            C87869Ye9 c87869Ye9 = new C87869Ye9();
            int i = this.LJLJJL.backgroundPoll;
            c87869Ye9.LIZ = i;
            c87869Ye9.LIZIZ = i;
            C87864Ye4 c87864Ye4 = new C87864Ye4("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
            this.LJLJJI = c87864Ye4;
            c87864Ye4.LJFF(true);
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void destroy() {
        C66629QCz.LIZ("[Compensator] WsConnectedCompensator destroy");
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJI;
        if (abstractC87863Ye3 != null) {
            abstractC87863Ye3.LIZ();
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZ(C67101QVd c67101QVd) {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJI;
        if (abstractC87863Ye3 != null) {
            abstractC87863Ye3.LJI(c67101QVd);
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZJ(SettingsV2 settingsV2) {
        this.LJLJJL = settingsV2;
        C87869Ye9 c87869Ye9 = new C87869Ye9();
        if (this.LJLJJI.LIZJ() == 1) {
            int i = settingsV2.backgroundSync;
            c87869Ye9.LIZ = i;
            c87869Ye9.LIZIZ = i;
        } else {
            int i2 = settingsV2.backgroundPoll;
            c87869Ye9.LIZ = i2;
            c87869Ye9.LIZIZ = i2;
        }
        this.LJLJJI.LJ = c87869Ye9;
    }

    @Override // X.InterfaceC67081QUj
    public final void LJ(SettingsV2 settingsV2, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Compensator] WsConnectedCompensator start readyToPoll = ");
        LIZ.append(z);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJJL = settingsV2;
        C87869Ye9 c87869Ye9 = new C87869Ye9();
        if (z) {
            int i = settingsV2.backgroundPoll;
            c87869Ye9.LIZ = i;
            c87869Ye9.LIZIZ = i;
            this.LJLJJI = new C87864Ye4("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
        } else {
            int i2 = settingsV2.backgroundSync;
            c87869Ye9.LIZ = i2;
            c87869Ye9.LIZIZ = i2;
            this.LJLJJI = new C87865Ye5("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
        }
        this.LJLJJI.LJFF(true);
    }

    public C87867Ye7(InterfaceC87871YeB interfaceC87871YeB, C67080QUi c67080QUi, InterfaceC67096QUy interfaceC67096QUy) {
        this.LJLIL = interfaceC87871YeB;
        this.LJLILLLLZI = c67080QUi;
        this.LJLJI = interfaceC67096QUy;
    }
}
