package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Io3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47715Io3 implements InterfaceC47844Iq8 {
    public final WeakReference<C47708Inw> LIZ;

    @Override // X.InterfaceC47844Iq8
    public final void LIZ(C47789IpF c47789IpF) {
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZIZ(String str) {
    }

    public C47715Io3(C47708Inw c47708Inw) {
        this.LIZ = new WeakReference<>(c47708Inw);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZJ(C47164IfA c47164IfA, C47789IpF c47789IpF) {
        C47708Inw c47708Inw = this.LIZ.get();
        if (c47708Inw == null) {
            return;
        }
        c47708Inw.LIZIZ = c47164IfA;
        c47708Inw.getClass();
        c47708Inw.getClass();
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZLLL(int i, String str) {
        C47708Inw c47708Inw = this.LIZ.get();
        if (c47708Inw == null) {
            return;
        }
        if (i != 0 && i != 10) {
            new C47789IpF("kTTVideoErrorDomainFetchingInfo", -7996);
            c47708Inw.getClass();
        }
        c47708Inw.getClass();
    }
}
