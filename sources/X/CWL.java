package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CWL implements InterfaceC78910Uy2 {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ CWA LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ long LJ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(' ');
            sb.append(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPermissionDenied: ");
        LIZ2.append((Object) sb);
        C0NB.LJ("LiveGameMsgView2", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onPermissionDenied: ");
        LIZ3.append((Object) sb);
        C78555UsJ.LJJIJ(4, 0, this.LIZJ, this.LIZLLL, this.LJ, this.LIZIZ.LJLLILLLL, this.LIZ, X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C46104I7o.LJJIJLIJ(this.LIZ);
        if (!this.LIZIZ.LJIJI(this.LIZJ, this.LIZLLL, this.LJ, this.LIZ)) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("LiveGameMsgView2", "do not record highlight.");
                return;
            }
            return;
        }
        this.LIZIZ.LJJI(this.LIZJ, this.LIZLLL, this.LJ, this.LIZ);
    }

    public CWL(long j, long j2, long j3, long j4, CWA cwa) {
        this.LIZ = j;
        this.LIZIZ = cwa;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
    }
}
