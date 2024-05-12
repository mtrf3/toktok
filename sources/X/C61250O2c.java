package X;

import android.os.FileObserver;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.O2c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61250O2c {
    public static final /* synthetic */ int LIZLLL = 0;
    public O2Y LIZ;
    public final ConcurrentHashMap<String, O26> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, FileObserver> LIZJ = new ConcurrentHashMap<>();

    public final byte[] LIZ(String str) {
        boolean z;
        O2Y o2y;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (o2y = this.LIZ) == null) {
            return null;
        }
        return o2y.get(str);
    }
}
