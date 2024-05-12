package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QTx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67069QTx implements QT0, InterfaceC67063QTr {
    public final List<InterfaceC67071QTz> LJLIL = new ArrayList();
    public final C67040QSu LJLILLLLZI;
    public C66930QOo LJLJI;

    @Override // X.InterfaceC67063QTr
    public final boolean LJFF() {
        C66930QOo c66930QOo = this.LJLJI;
        if (c66930QOo != null && c66930QOo.LIZIZ == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return this.LJLILLLLZI.LIZJ.LJFF();
    }

    public C67069QTx(C67040QSu c67040QSu) {
        this.LJLILLLLZI = c67040QSu;
        c67040QSu.LIZJ.LIZ(this);
    }

    @Override // X.QT0
    public final void LIZLLL(C66930QOo c66930QOo) {
        boolean z;
        if (c66930QOo == null || c66930QOo.LIZJ != this.LJLILLLLZI.LJ) {
            return;
        }
        C66930QOo c66930QOo2 = this.LJLJI;
        boolean z2 = true;
        if (c66930QOo2 != null && c66930QOo2.LIZIZ == EnumC66933QOr.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        if (c66930QOo.LIZIZ != EnumC66933QOr.CONNECTED) {
            z2 = false;
        }
        this.LJLJI = c66930QOo;
        if (z == z2) {
            return;
        }
        synchronized (this) {
            int size = ((ArrayList) this.LJLIL).size();
            InterfaceC67071QTz[] interfaceC67071QTzArr = new InterfaceC67071QTz[size];
            ((ArrayList) this.LJLIL).toArray(interfaceC67071QTzArr);
            for (int i = 0; i < size; i++) {
                interfaceC67071QTzArr[i].LJJJLZIJ(z2);
            }
        }
    }

    @Override // X.InterfaceC67063QTr
    public final void LJIIZILJ(InterfaceC67071QTz interfaceC67071QTz) {
        synchronized (this) {
            ((ArrayList) this.LJLIL).remove(interfaceC67071QTz);
        }
    }

    @Override // X.InterfaceC67063QTr
    public final void LJJIJIIJI(InterfaceC67071QTz interfaceC67071QTz) {
        synchronized (this) {
            ((ArrayList) this.LJLIL).add(interfaceC67071QTz);
        }
    }
}
