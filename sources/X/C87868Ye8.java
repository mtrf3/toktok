package X;

import com.bytedance.sync.settings.SettingsV2;

/* renamed from: X.Ye8, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C87868Ye8 implements InterfaceC67082QUk {
    public final SettingsV2 LIZ;
    public final AbstractC48851JFf LIZIZ;
    public final QVY LIZJ;
    public AbstractC87863Ye3 LIZLLL;
    public final C87870YeA LJ = new C87870YeA();

    @Override // X.InterfaceC67082QUk
    public final void LIZIZ() {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LIZLLL;
        if (abstractC87863Ye3 != null) {
            if (abstractC87863Ye3.LIZJ() == 1) {
                abstractC87863Ye3.LIZ();
            } else {
                return;
            }
        }
        AbstractC87863Ye3 LIZLLL = LIZLLL(this.LIZ, true);
        LIZLLL.LJFF(true);
        this.LIZLLL = LIZLLL;
    }

    @Override // X.InterfaceC67082QUk
    public final void destroy() {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LIZLLL;
        if (abstractC87863Ye3 != null) {
            abstractC87863Ye3.LIZ();
        }
    }

    @Override // X.InterfaceC67082QUk
    public final void LIZ(C67101QVd c67101QVd) {
        AbstractC87863Ye3 abstractC87863Ye3 = this.LIZLLL;
        if (abstractC87863Ye3 != null) {
            abstractC87863Ye3.LJI(c67101QVd);
        }
    }

    @Override // X.InterfaceC67082QUk
    public final void LIZJ(boolean z) {
        AbstractC87863Ye3 LIZLLL = LIZLLL(this.LIZ, z);
        LIZLLL.LJFF(true);
        this.LIZLLL = LIZLLL;
    }

    public final AbstractC87863Ye3 LIZLLL(SettingsV2 settingsV2, boolean z) {
        C87869Ye9 c87869Ye9 = new C87869Ye9();
        if (z) {
            c87869Ye9.LIZ = settingsV2.LIZ();
            c87869Ye9.LIZIZ = settingsV2.LIZ();
            return new C87864Ye4("[SocketPoll] ", this.LJ, this.LIZJ, this.LIZIZ, c87869Ye9);
        }
        c87869Ye9.LIZ = settingsV2.LIZ();
        c87869Ye9.LIZIZ = settingsV2.LIZ();
        return new C87865Ye5("[SocketPoll] ", this.LJ, this.LIZJ, this.LIZIZ, c87869Ye9);
    }

    public C87868Ye8(C67077QUf c67077QUf, SettingsV2 settingsV2, QVY qvy) {
        this.LIZIZ = c67077QUf;
        this.LIZ = settingsV2;
        this.LIZJ = qvy;
    }
}
