package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.OKy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61740OKy implements InterfaceC53896LDg {
    public final /* synthetic */ Context LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public C61740OKy(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        OL3.LIZLLL = false;
        OL3.LJ = true;
        try {
            C38995FSd.LJ().schedule(new ARunnableS46S0100000_10(this.LJLIL, 136), 300L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        OL3.LIZLLL = true;
        try {
            C38995FSd.LIZJ().execute(new ARunnableS46S0100000_10(this.LJLIL, 137));
        } catch (Throwable unused) {
        }
    }
}
