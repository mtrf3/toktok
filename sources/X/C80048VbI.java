package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VbI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80048VbI implements InterfaceC48640J7c {
    public final /* synthetic */ C80049VbJ LIZ;

    @Override // X.InterfaceC48640J7c
    public final void LIZJ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIIZ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIJ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    public C80048VbI(C80049VbJ c80049VbJ) {
        this.LIZ = c80049VbJ;
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZ(EnumC48648J7k errorCode) {
        String str;
        o.LJIIJ(errorCode, "errorCode");
        String str2 = C80049VbJ.LJIIIIZZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Playable: ");
        LIZ.append(this.LIZ.LIZJ);
        LIZ.append(", occurred an error ");
        LIZ.append(errorCode.getMsg());
        J7Z.LIZJ(str2, X1D.LIZIZ(LIZ));
        this.LIZ.LJIILIIL(errorCode);
        EnumC79950VZi enumC79950VZi = EnumC79950VZi.DEFAULT;
        if (this.LIZ.LJIIL() instanceof C48642J7e) {
            enumC79950VZi = EnumC79950VZi.LIGHT;
        }
        C79702VPu c79702VPu = this.LIZ.LJII;
        String desc = enumC79950VZi.getDesc();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("play error and to switchResources, currentPlayable: ");
        C73363Sql c73363Sql = this.LIZ.LIZJ;
        String str3 = null;
        if (c73363Sql != null) {
            str = c73363Sql.toString();
        } else {
            str = null;
        }
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C73363Sql c73363Sql2 = this.LIZ.LIZJ;
        if (c73363Sql2 != null) {
            str3 = c73363Sql2.toString();
        }
        c79702VPu.LIZIZ(-1, -1, desc, LIZIZ, str3, false);
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZIZ(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.onPrepare();
    }

    @Override // X.InterfaceC48640J7c
    public final void LJII(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.onPrepared();
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIIIZZ(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.onCompletion();
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZLLL(InterfaceC80053VbN engine, long j) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.onPlaybackTimeChanged(j);
    }

    @Override // X.InterfaceC48640J7c
    public final void LJ(J7W engine, EnumC48641J7d enumC48641J7d) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.LJFF(enumC48641J7d);
    }

    @Override // X.InterfaceC48640J7c
    public final void LJFF(InterfaceC80053VbN engine, EnumC79954VZm playbackState) {
        o.LJIIJ(engine, "engine");
        o.LJIIJ(playbackState, "playbackState");
        this.LIZ.LJI.LJIILLIIL(playbackState);
    }

    @Override // X.InterfaceC48640J7c
    public final void LJI(InterfaceC80053VbN engine, long j) {
        o.LJIIJ(engine, "engine");
        this.LIZ.LJI.LJIIJJI(j);
    }
}
