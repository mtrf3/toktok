package X;

import android.util.LruCache;
import java.io.File;

/* renamed from: X.HgR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44695HgR implements Runnable {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C10H LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC44688HgK LJLJJL;

    public RunnableC44695HgR(C34K c34k, C10H c10h, android.net.Uri uri, String str, InterfaceC44688HgK interfaceC44688HgK) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c10h;
        this.LJLJI = uri;
        this.LJLJJI = str;
        this.LJLJJL = interfaceC44688HgK;
    }

    public final void LIZ() {
        if (!this.LJLIL.element) {
            this.LJLILLLLZI.LIZ();
            String LIZIZ = C00S.LIZIZ(C44694HgQ.LJIILIIL.LJ(), this.LJLJI);
            if (LIZIZ == null || LIZIZ.length() == 0) {
                LruCache<String, Boolean> lruCache = C44694HgQ.LJIIIZ;
                String str = this.LJLJJI;
                Boolean bool = Boolean.FALSE;
                lruCache.put(str, bool);
                this.LJLJJL.LIZ(bool);
                return;
            }
            InterfaceC44688HgK interfaceC44688HgK = this.LJLJJL;
            Boolean valueOf = Boolean.valueOf(new File(LIZIZ).exists());
            C44694HgQ.LJIIIZ.put(this.LJLJJI, Boolean.valueOf(valueOf.booleanValue()));
            interfaceC44688HgK.LIZ(valueOf);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
