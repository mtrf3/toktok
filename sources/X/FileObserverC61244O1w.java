package X;

import android.os.FileObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.O1w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class FileObserverC61244O1w extends FileObserver {
    public final /* synthetic */ C61243O1v LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 512 || i == 1024) {
            C61243O1v c61243O1v = this.LIZ;
            String cacheKey = this.LIZIZ;
            c61243O1v.getClass();
            o.LJIIJ(cacheKey, "cacheKey");
            if (cacheKey.length() == 0) {
                return;
            }
            c61243O1v.LIZIZ.remove(cacheKey);
            C61234O1m c61234O1m = c61243O1v.LIZ;
            if (c61234O1m != null) {
                c61234O1m.remove(cacheKey);
            }
            c61243O1v.LIZJ.remove(cacheKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC61244O1w(C61243O1v c61243O1v, String str, String str2) {
        super(str2, 1536);
        this.LIZ = c61243O1v;
        this.LIZIZ = str;
    }
}
