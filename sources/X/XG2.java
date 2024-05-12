package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;

/* loaded from: classes16.dex */
public class XG2 extends PthreadThread {
    public final C84541XFx LJLIL;
    public final /* synthetic */ XG3 LJLILLLLZI;

    public final void LIZLLL() {
        long j;
        System.currentTimeMillis();
        this.LJLIL.getClass();
        try {
            j = C36980EfI.LIZLLL(new File(C84541XFx.LIZJ)) + 0;
        } catch (Throwable unused) {
            j = 0;
        }
        System.currentTimeMillis();
        this.LJLILLLLZI.getClass();
        this.LJLILLLLZI.LJLJJLL.set(j);
        XG3.LJLLI.set(0L);
        XG3 xg3 = this.LJLILLLLZI;
        xg3.LJLJL.post(xg3.LJLJLLL);
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
    public XG2(XG3 xg3, C84541XFx c84541XFx) {
        super("CacheSizeThread");
        this.LJLILLLLZI = xg3;
        this.LJLIL = c84541XFx;
    }
}
