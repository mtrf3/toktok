package X;

import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.It8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48030It8 implements InterfaceC48031It9 {
    public final IZ2 LIZ;
    public final InterfaceC46811IYt LIZIZ;
    public final C62822Ol8 LIZJ;

    public final InterfaceC197777pV LIZIZ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-bgmPlayer>(...)");
        return (InterfaceC197777pV) value;
    }

    @Override // X.InterfaceC48031It9
    public final void LIZ(EnumC57602Mj8 action) {
        o.LJIIIZ(action, "action");
        try {
            switch (C57603Mj9.LIZ[action.ordinal()]) {
                case 1:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "INIT");
                    LIZIZ().LIZIZ(this.LIZ);
                    break;
                case 2:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "START");
                    LIZIZ().LIZ(this.LIZIZ);
                    break;
                case 3:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "PAUSE");
                    LIZIZ().pause();
                    break;
                case 4:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "RESUME");
                    LIZIZ().resume();
                    break;
                case 5:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "STOP");
                    LIZIZ().stop();
                    break;
                case 6:
                    C221018lt.LJFF("TTRecUserBgmPlayer", "RELEASE");
                    LIZIZ().release();
                    break;
            }
        } catch (Exception e) {
            C36922EeM.LIZLLL(2, "TTRecUserBgmPlayer", e.getStackTrace().toString());
        }
    }

    public C48030It8(IZ2 host, InterfaceC46811IYt interfaceC46811IYt) {
        o.LJIIIZ(host, "host");
        this.LIZ = host;
        this.LIZIZ = interfaceC46811IYt;
        this.LIZJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 669));
    }
}
