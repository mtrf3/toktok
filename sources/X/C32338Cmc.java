package X;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cmc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32338Cmc extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            File file = new File(this.LJLJJL);
            if (file.exists()) {
                try {
                    C31880CfE.LJ(file);
                    ((ConcurrentHashMap) PU0.LJI().LJ).clear();
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32338Cmc(String str) {
        super((Object) null);
        this.LJLJJL = str;
    }
}
