package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ott, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63365Ott implements InterfaceC63423Oup {
    public final XKW LIZ;
    public final XKW LIZIZ;
    public final InterfaceC70422pa LIZJ;
    public final C63205OrJ LIZLLL;
    public final C63630OyA LJ;
    public final C63309Osz LJFF;
    public final C115284fk LJI;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJII;

    @Override // X.InterfaceC63423Oup
    public final C63291Osh LJIILJJIL() {
        C63291Osh LIZ = C63291Osh.LIZ();
        o.LJIIIIZZ(LIZ, "get()");
        return LIZ;
    }

    @Override // X.InterfaceC63423Oup
    public final C63630OyA LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC63423Oup
    public final C63309Osz LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC63423Oup
    public final XKW LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC63423Oup
    public final C63205OrJ LJFF() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC63423Oup
    public final InterfaceC70422pa LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC63423Oup
    public final XKW LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC63423Oup
    public final C115284fk LJIIIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC63423Oup
    public final void LJIIJ(boolean z) {
        C63269OsL.LIZLLL(z);
    }

    @Override // X.InterfaceC63423Oup
    public final void LJIIL(int i) {
        C63269OsL.LJIIJ(i);
    }

    @Override // X.InterfaceC63423Oup
    public final C63120Opw LJIILIIL(String str) {
        return C63133Oq9.LJIIIZ(str, true);
    }

    @Override // X.InterfaceC63423Oup
    public final void LIZJ(int i, C109544Rq message) {
        o.LJIIIZ(message, "message");
        C63269OsL.LIZ(i, message);
    }

    @Override // X.InterfaceC63423Oup
    public final void LJIIJJI(int i, int i2) {
        this.LJII.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC63423Oup
    public final void LIZ(C63120Opw c63120Opw, C109544Rq message, int i) {
        o.LJIIIZ(message, "message");
        C63192Or6.LJIJI(c63120Opw, message, Integer.valueOf(i));
    }

    @Override // X.InterfaceC63423Oup
    public final C63120Opw LJII(int i, String str, int i2, C109544Rq lastMessage) {
        o.LJIIIZ(lastMessage, "lastMessage");
        return C63217OrV.LJIJI(i, lastMessage.getConversationId(), lastMessage.getConversationShortId(), lastMessage.getConversationType(), lastMessage.getCreatedAt(), i2, lastMessage);
    }

    public C63365Ott(AbstractC78621UtN mainDispatcher, XKW receiveMsgDispatcher, InterfaceC70422pa interfaceC70422pa, C63205OrJ c63205OrJ, C63630OyA c63630OyA, C63309Osz c63309Osz, C115284fk c115284fk, C63382OuA c63382OuA) {
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        o.LJIIIZ(receiveMsgDispatcher, "receiveMsgDispatcher");
        this.LIZ = mainDispatcher;
        this.LIZIZ = receiveMsgDispatcher;
        this.LIZJ = interfaceC70422pa;
        this.LIZLLL = c63205OrJ;
        this.LJ = c63630OyA;
        this.LJFF = c63309Osz;
        this.LJI = c115284fk;
        this.LJII = c63382OuA;
    }
}
