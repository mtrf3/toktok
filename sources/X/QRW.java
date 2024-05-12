package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class QRW {
    public final Application LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public QS6 LIZLLL;
    public R39 LJFF;
    public InterfaceC64320PMe LJI;
    public C62819Ol5 LJII;
    public C47956Irw LJIIIIZZ;
    public C63933P7h LJIIIZ;
    public HHB LJIIJ;
    public V52 LJIIJJI;
    public C43001GuD LJIIL;
    public final QRU LJIILIIL;
    public InterfaceC66999QRf LJIILJJIL;
    public boolean LJIILL;
    public final List<InterfaceC66998QRe> LJ = new ArrayList();
    public final long LJIILLIIL = TimeUnit.MINUTES.toMillis(2);

    public final void LIZ(String str) {
        if (!this.LIZIZ) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public QRW(Application application, QRU qru) {
        this.LIZ = application;
        this.LJIILIIL = qru;
    }
}
