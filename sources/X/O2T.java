package X;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class O2T {
    public InterfaceC61566OEg LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public final Context LIZLLL;
    public InterfaceC61465OAj LJ;
    public C59125NIj LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public File LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;

    public O2T(Context context) {
        this.LIZLLL = C16880lQ.LLLLL(context);
    }

    public final void LIZ(String... strArr) {
        if (strArr.length >= 1) {
            this.LIZIZ = Arrays.asList(strArr);
        }
    }

    public final void LIZIZ(String... strArr) {
        if (strArr != null && strArr.length >= 1) {
            this.LIZJ = Arrays.asList(strArr);
        }
    }

    public final void LIZJ(long j) {
        this.LJI = Long.valueOf(j);
    }
}
