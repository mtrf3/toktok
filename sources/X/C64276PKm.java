package X;

import android.os.Build;
import com.bytedance.crash.gwpasan.GwpAsan;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;

/* renamed from: X.PKm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64276PKm extends PthreadThread {
    public final /* synthetic */ GwpAsan LJLIL;

    public final void LIZLLL() {
        int i;
        try {
            GwpAsan gwpAsan = this.LJLIL;
            gwpAsan.getClass();
            C78685UuP.LJJJLZIJ();
            if (!gwpAsan.LIZ) {
                try {
                    Librarian.LJFF(GwpAsan.LJIILIIL, "npth_xasan");
                    gwpAsan.LIZ = true;
                } catch (Throwable unused) {
                }
            }
            if (!gwpAsan.LIZ) {
                C78685UuP.LJJI();
                return;
            }
            File file = GwpAsan.LJIIL;
            if (file == null) {
                C78685UuP.LJJI();
                return;
            }
            if (!file.exists() && !GwpAsan.LJIIL.mkdir()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cannot create ");
                LIZ.append(GwpAsan.LJIIL);
                X1D.LIZIZ(LIZ);
                C78685UuP.LJJI();
                return;
            }
            if (!GwpAsan.LIZ(GwpAsan.LJIIIZ)) {
                C78685UuP.LJJI();
                return;
            }
            String[] strArr = GwpAsan.LJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(GwpAsan.LJIIL.getAbsolutePath());
            LIZ2.append('/');
            LIZ2.append(PK0.LIZJ());
            strArr[5] = X1D.LIZIZ(LIZ2);
            GwpAsan.LJI[6] = GwpAsan.LJIIL.getAbsolutePath();
            GwpAsan.LJIIIIZZ = true;
            String[] strArr2 = GwpAsan.LJI;
            if (strArr2 != null && strArr2[5] != null && strArr2[6] != null) {
                i = GwpAsan.gwpAsanNativeInit(Build.VERSION.SDK_INT, GwpAsan.LJI);
                if (1 == i) {
                    C78685UuP.LJJJLZIJ();
                    return;
                }
            } else {
                i = -1;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("XAsan Init Failed code ");
            LIZ3.append(i);
            X1D.LIZIZ(LIZ3);
            C78685UuP.LJJI();
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64276PKm(GwpAsan gwpAsan) {
        super("XAsanTracker");
        this.LJLIL = gwpAsan;
    }
}
