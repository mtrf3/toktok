package X;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public class QAU implements InterfaceC66567QAp, InterfaceC65473Pmn {
    public final Lock LJLIL = new ReentrantLock();
    public final C66561QAj LJLILLLLZI;
    public final PP8 LJLJI;
    public final InterfaceC66567QAp LJLJJI;
    public final AbstractC38911fr LJLJJL;
    public final String LJLJJLL;
    public final Collection<Object> LJLJL;

    static {
        Logger.getLogger(QAU.class.getName());
    }

    public QAU(QAV qav) {
        String LIZLLL;
        qav.LIZ.getClass();
        this.LJLJI = qav.LIZIZ;
        this.LJLJJL = qav.LIZJ;
        C64364PNw c64364PNw = qav.LIZLLL;
        if (c64364PNw == null) {
            LIZLLL = null;
        } else {
            LIZLLL = c64364PNw.LIZLLL();
        }
        this.LJLJJLL = LIZLLL;
        this.LJLJJI = qav.LJFF;
        this.LJLJL = Collections.unmodifiableCollection(qav.LJI);
        C66561QAj c66561QAj = qav.LJ;
        c66561QAj.getClass();
        this.LJLILLLLZI = c66561QAj;
    }
}
