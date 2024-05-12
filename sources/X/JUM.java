package X;

import android.text.TextUtils;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUM implements InterfaceC62644OiG {
    public final /* synthetic */ JUK LIZ;

    @Override // X.InterfaceC62644OiG
    public final void LIZIZ() {
        this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC62644OiG
    public final void LIZJ() {
        this.LIZ.getStatusDelegate().LIZJ();
    }

    @Override // X.InterfaceC62644OiG
    public final void LIZLLL() {
        this.LIZ.getStatusDelegate().LIZIZ();
    }

    @Override // X.InterfaceC62644OiG
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // X.InterfaceC62644OiG
    public final void LJII() {
        this.LIZ.getStatusDelegate().LIZJ();
    }

    public JUM(JUK juk) {
        this.LIZ = juk;
    }

    @Override // X.InterfaceC62644OiG
    public final void LIZ(String str) {
        this.LIZ.LJI(str);
    }

    @Override // X.InterfaceC62644OiG
    public final void LJFF(String s) {
        o.LJIIIZ(s, "s");
        if (!TextUtils.isEmpty(s)) {
            this.LIZ.LIZLLL(s);
        }
    }

    @Override // X.InterfaceC62644OiG
    public final void LJI(int i, int i2, View view) {
        this.LIZ.LJII(i, i2, view);
    }
}
