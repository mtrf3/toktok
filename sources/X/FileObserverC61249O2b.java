package X;

import android.os.FileObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.O2b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class FileObserverC61249O2b extends FileObserver {
    public final /* synthetic */ C61250O2c LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 512 || i == 1024) {
            C61250O2c c61250O2c = this.LIZ;
            String cacheKey = this.LIZIZ;
            c61250O2c.getClass();
            o.LJIIJ(cacheKey, "cacheKey");
            if (cacheKey.length() == 0) {
                return;
            }
            c61250O2c.LIZIZ.remove(cacheKey);
            O2Y o2y = c61250O2c.LIZ;
            if (o2y != null) {
                o2y.remove(cacheKey);
            }
            FileObserver fileObserver = c61250O2c.LIZJ.get(cacheKey);
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
            c61250O2c.LIZJ.remove(cacheKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC61249O2b(C61250O2c c61250O2c, String str, String str2) {
        super(str2, 1536);
        this.LIZ = c61250O2c;
        this.LIZIZ = str;
    }
}
