package X;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Iv3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48149Iv3 extends X3T {
    public final /* synthetic */ InputStream LIZ;
    public final /* synthetic */ C64797Pbt LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC37276Ek4 LJ;

    @Override // X.X5J
    public final int LIZ() {
        return this.LIZIZ.LIZ.LIZIZ;
    }

    @Override // X.X5J
    public final void cancel() {
        long j = this.LIZJ;
        String scene = this.LIZLLL;
        InterfaceC37276Ek4 interfaceC37276Ek4 = this.LJ;
        C64797Pbt c64797Pbt = this.LIZIZ;
        o.LJIIIZ(scene, "scene");
        C48150Iv4.LIZIZ(j, 2, scene, interfaceC37276Ek4, c64797Pbt, null);
        try {
            InterfaceC37276Ek4 interfaceC37276Ek42 = this.LJ;
            if (interfaceC37276Ek42 != null && !interfaceC37276Ek42.isCanceled()) {
                this.LJ.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.X5F
    public final void end() {
        try {
            InterfaceC37276Ek4 interfaceC37276Ek4 = this.LJ;
            if (interfaceC37276Ek4 != null && !interfaceC37276Ek4.isCanceled()) {
                long j = this.LIZJ;
                String scene = this.LIZLLL;
                InterfaceC37276Ek4 interfaceC37276Ek42 = this.LJ;
                C64797Pbt c64797Pbt = this.LIZIZ;
                o.LJIIIZ(scene, "scene");
                C48150Iv4.LIZIZ(j, 0, scene, interfaceC37276Ek42, c64797Pbt, null);
                this.LJ.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.X5F
    public final InputStream LIZJ() {
        return this.LIZ;
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        List<EJ6> list = this.LIZIZ.LIZ.LIZLLL;
        if (list != null) {
            for (EJ6 ej6 : list) {
                if (ej6.LIZ.equals(str)) {
                    return ej6.LIZIZ;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.X3T
    public final void LJI(Throwable th) {
        String str;
        if (this.LIZIZ == null && (th instanceof C64799Pbv)) {
            str = ((C64799Pbv) th).getRequestLog();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C48150Iv4.LIZIZ(this.LIZJ, 1, this.LIZLLL, this.LJ, this.LIZIZ, th.getMessage());
        } else {
            C48150Iv4.LIZ(1, this.LIZLLL, this.LIZJ, str, th.getMessage());
        }
    }

    public C48149Iv3(InputStream inputStream, C64797Pbt c64797Pbt, long j, String str, InterfaceC37276Ek4 interfaceC37276Ek4) {
        this.LIZ = inputStream;
        this.LIZIZ = c64797Pbt;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = interfaceC37276Ek4;
    }
}
