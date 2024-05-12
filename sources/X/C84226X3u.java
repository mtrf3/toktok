package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.X3u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84226X3u extends LinkedHashMap<Integer, DownloadInfo> {
    public final /* synthetic */ C84224X3s LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84226X3u(C84224X3s c84224X3s) {
        super(0, 0.75f, true);
        this.LJLIL = c84224X3s;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Integer, DownloadInfo> entry) {
        if (size() > X4A.LJLJL && X4A.LJLJLJ == null) {
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Will delete eldest key=");
                LIZ.append(entry.getKey());
                C65210PiY.LIZIZ("LruDownloadCache", "removeEldestEntry", X1D.LIZIZ(LIZ));
            }
            C84224X3s c84224X3s = this.LJLIL;
            Integer key = entry.getKey();
            if (C65210PiY.LIZ()) {
                c84224X3s.getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Key: ");
                LIZ2.append(key);
                C65210PiY.LIZIZ("LruDownloadCache", "addToUnreadMap", X1D.LIZIZ(LIZ2));
            }
            synchronized (c84224X3s.LJLJJL) {
                c84224X3s.LJLJJL.put(key, 0);
            }
            return true;
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Will add new to tail key=");
            LIZ3.append(entry.getKey());
            C65210PiY.LIZIZ("LruDownloadCache", "removeEldestEntry", X1D.LIZIZ(LIZ3));
        }
        return false;
    }
}
