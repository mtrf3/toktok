package X;

import com.bytedance.sync.settings.SettingsV2;

/* renamed from: X.Ye6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87866Ye6 implements InterfaceC67081QUj {
    public final InterfaceC87871YeB LJLIL;
    public final AbstractC48851JFf LJLILLLLZI;
    public final InterfaceC67096QUy LJLJI;
    public final boolean LJLJJI;
    public AbstractC87863Ye3 LJLJJL;
    public SettingsV2 LJLJJLL;
    public final boolean LJLJL;

    @Override // X.InterfaceC67081QUj
    public final void LIZIZ() {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJL;
        if (abstractC87863Ye3 == null || abstractC87863Ye3.LIZJ() == 1) {
            AbstractC87863Ye3 abstractC87863Ye32 = this.LJLJJL;
            if (abstractC87863Ye32 != null) {
                abstractC87863Ye32.LIZ();
            }
            C87869Ye9 c87869Ye9 = new C87869Ye9();
            SettingsV2 settingsV2 = this.LJLJJLL;
            c87869Ye9.LIZ = settingsV2.poll;
            c87869Ye9.LIZIZ = settingsV2.backgroundPoll;
            C87864Ye4 c87864Ye4 = new C87864Ye4("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
            this.LJLJJL = c87864Ye4;
            c87864Ye4.LJFF(true);
        }
    }

    @Override // X.QW5
    public final int LIZLLL() {
        if (this.LJLIL.isForeground()) {
            return 3;
        }
        return 4;
    }

    @Override // X.InterfaceC67081QUj
    public final void destroy() {
        C66629QCz.LIZ("[Compensator] HttpsCompensator destroy");
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJL;
        if (abstractC87863Ye3 != null) {
            abstractC87863Ye3.LIZ();
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZ(C67101QVd c67101QVd) {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LJLJJL;
        if (abstractC87863Ye3 != null && this.LJLJL) {
            abstractC87863Ye3.LJI(c67101QVd);
        }
    }

    @Override // X.InterfaceC67081QUj
    public final void LIZJ(SettingsV2 settingsV2) {
        this.LJLJJLL = settingsV2;
        C87869Ye9 c87869Ye9 = new C87869Ye9();
        if (this.LJLJJL.LIZJ() == 1) {
            c87869Ye9.LIZ = settingsV2.sync;
            c87869Ye9.LIZIZ = settingsV2.backgroundSync;
        } else {
            c87869Ye9.LIZ = settingsV2.poll;
            c87869Ye9.LIZIZ = settingsV2.backgroundPoll;
        }
        this.LJLJJL.LJ = c87869Ye9;
    }

    @Override // X.InterfaceC67081QUj
    public final void LJ(SettingsV2 settingsV2, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Compensator] HttpsCompensator start readyToPoll = ");
        LIZ.append(z);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJJLL = settingsV2;
        C87869Ye9 c87869Ye9 = new C87869Ye9();
        if (z) {
            c87869Ye9.LIZ = settingsV2.poll;
            c87869Ye9.LIZIZ = settingsV2.backgroundPoll;
            this.LJLJJL = new C87864Ye4("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
        } else {
            c87869Ye9.LIZ = settingsV2.sync;
            c87869Ye9.LIZIZ = settingsV2.backgroundSync;
            this.LJLJJL = new C87865Ye5("[Compensator] ", this.LJLIL, this.LJLJI, this.LJLILLLLZI, c87869Ye9);
        }
        this.LJLJJL.LJFF(this.LJLJJI);
    }

    public C87866Ye6(InterfaceC87871YeB interfaceC87871YeB, AbstractC48851JFf abstractC48851JFf, InterfaceC67096QUy interfaceC67096QUy, boolean z, boolean z2) {
        this.LJLIL = interfaceC87871YeB;
        this.LJLILLLLZI = abstractC48851JFf;
        this.LJLJI = interfaceC67096QUy;
        this.LJLJJI = z;
        this.LJLJL = z2;
    }
}
