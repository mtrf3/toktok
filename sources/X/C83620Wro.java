package X;

import android.os.Looper;
import java.util.List;

/* renamed from: X.Wro, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83620Wro implements InterfaceC83659WsR {
    public final /* synthetic */ C83621Wrp LIZ;

    @Override // X.InterfaceC83659WsR
    public final void LJ(boolean z, float f, List<Integer> list) {
    }

    @Override // X.InterfaceC83659WsR
    public final void LJFF() {
        this.LIZ.LLLFZ();
    }

    @Override // X.InterfaceC83659WsR
    public final void LJII() {
        this.LIZ.LLJLLIL();
    }

    public C83620Wro(C83621Wrp c83621Wrp) {
        this.LIZ = c83621Wrp;
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZLLL(int i) {
        this.LIZ.LLLI(i);
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIJ(int i) {
        this.LIZ.LLLFFI(i);
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZ(int i, int i2) {
        this.LIZ.LLLILZLLLI(i, i2);
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZIZ(int i, int i2, String str) {
        this.LIZ.LLLIIIL(i, i2, str);
    }

    @Override // X.InterfaceC83659WsR
    public final void LJI(int i, int i2, String str) {
        this.LIZ.LLJZIJLIL(i, i2, str);
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIIZ(float f, int i, boolean z) {
        this.LIZ.LLLJIL(i, f, z);
    }

    @Override // X.InterfaceC83659WsR
    public final void LJIIIIZZ(long j, String str, String str2, String str3) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LIZ.LJLJLJ.LJII(new HY0(j, str, str2, str3));
        } else {
            this.LIZ.LJLJLJ.LJI(new HY0(j, str, str2, str3));
        }
    }

    @Override // X.InterfaceC83659WsR
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        this.LIZ.LLLJL(i, z, z2, f, list);
    }
}
