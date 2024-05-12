package X;

import Y.IDbS398S0100000_1;
import Y.IDcS133S0200000_1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115934gn implements InterfaceC63226Ore {
    public final String LJLIL;
    public final int[] LJLILLLLZI;
    public final int LJLJI;
    public final C115954gp LJLJJI = new C115954gp();
    public InterfaceC63226Ore LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC63226Ore
    public final void X8(java.util.Map map, int i, List list) {
    }

    @Override // X.InterfaceC63226Ore
    public final void ea(C109544Rq c109544Rq, boolean z) {
    }

    @Override // X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
    }

    @Override // X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC63226Ore
    public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
    }

    @Override // X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id c107074Id) {
    }

    @Override // X.InterfaceC63226Ore
    public final void y5(int i, C63219OrX c63219OrX) {
    }

    public final void LIZ() {
        if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
            C63322OtC.LJFF("MessageBrowserModel loadOlderMessageList checking now");
        } else if (this.LJLJJLL) {
            C63322OtC.LJFF("MessageBrowserModel loadOlderMessageList querying now");
        } else {
            this.LJLJJLL = true;
            RunnableC63345OtZ.LJ(new IDcS133S0200000_1(this, new ArrayList(this.LJLJJI), 0), new IDbS398S0100000_1(this, 0), false);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
        if (c109544Rq != null && this.LJLJJL != null) {
            C47922IrO.LIZ();
            this.LJLJJL.T1(c109544Rq);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
        InterfaceC63226Ore interfaceC63226Ore;
        if (this.LJLJJI.remove(c109544Rq) && (interfaceC63226Ore = this.LJLJJL) != null) {
            interfaceC63226Ore.y(c109544Rq);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.LJLJJI.appendList(list);
        }
        InterfaceC63226Ore interfaceC63226Ore = this.LJLJJL;
        if (interfaceC63226Ore != null) {
            interfaceC63226Ore.M1(list, z);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void v0(List<C109544Rq> list, boolean z) {
        InterfaceC63226Ore interfaceC63226Ore = this.LJLJJL;
        if (interfaceC63226Ore != null) {
            interfaceC63226Ore.v0(list, z);
        }
    }

    public C115934gn(int i, String str, int[] iArr) {
        this.LJLIL = str;
        this.LJLILLLLZI = iArr;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        InterfaceC63226Ore interfaceC63226Ore = this.LJLJJL;
        if (interfaceC63226Ore != null) {
            interfaceC63226Ore.K7(1, str, list);
        }
    }
}
