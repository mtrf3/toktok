package X;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public class QKC extends PthreadThread {
    public final boolean LJLIL;
    public final InterfaceC66828QKq LJLILLLLZI;
    public final boolean LJLJI;
    public final Context LJLJJI;
    public final String[] LJLJJL;
    public final long LJLJJLL;

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0175, code lost:
    
        X.QIV.LIZ(X.QIU.active, X.QIL.f_resp_error);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKC.LIZLLL():void");
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

    public QKC(Context context, String[] strArr, boolean z, boolean z2, QKX qkx) {
        super("ActiveUser$ActiveThread");
        this.LJLJJI = context;
        this.LJLJJL = strArr;
        this.LJLIL = z;
        this.LJLJJLL = System.currentTimeMillis();
        this.LJLILLLLZI = qkx;
        this.LJLJI = z2;
    }
}
