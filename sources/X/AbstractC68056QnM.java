package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QnM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68056QnM {
    public static final Object LJFF = new Object();
    public static volatile C68060QnQ LJI = null;
    public static final AtomicInteger LJII;
    public final C68559QvT LIZ;
    public final String LIZIZ;
    public final Object LIZJ;
    public volatile int LIZLLL = -1;
    public volatile Object LJ;

    public abstract Object LIZ(Object obj);

    static {
        new AtomicReference();
        new C72085SQv(0);
        LJII = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[Catch: all -> 0x00fa, TryCatch #2 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:15:0x004c, B:17:0x0059, B:20:0x00a7, B:22:0x00b5, B:24:0x00c6, B:27:0x00d5, B:29:0x00e7, B:30:0x00f0, B:31:0x00f4, B:32:0x0062, B:34:0x0068, B:37:0x0078, B:46:0x007d, B:48:0x0082, B:49:0x0092, B:42:0x009d, B:44:0x00a5, B:51:0x0087, B:54:0x008f, B:57:0x0096, B:58:0x0099, B:61:0x0076, B:65:0x003f, B:66:0x00ea, B:67:0x00ef, B:68:0x00f8), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x00fa, TryCatch #2 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:15:0x004c, B:17:0x0059, B:20:0x00a7, B:22:0x00b5, B:24:0x00c6, B:27:0x00d5, B:29:0x00e7, B:30:0x00f0, B:31:0x00f4, B:32:0x0062, B:34:0x0068, B:37:0x0078, B:46:0x007d, B:48:0x0082, B:49:0x0092, B:42:0x009d, B:44:0x00a5, B:51:0x0087, B:54:0x008f, B:57:0x0096, B:58:0x0099, B:61:0x0076, B:65:0x003f, B:66:0x00ea, B:67:0x00ef, B:68:0x00f8), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: all -> 0x00fa, TRY_ENTER, TryCatch #2 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:15:0x004c, B:17:0x0059, B:20:0x00a7, B:22:0x00b5, B:24:0x00c6, B:27:0x00d5, B:29:0x00e7, B:30:0x00f0, B:31:0x00f4, B:32:0x0062, B:34:0x0068, B:37:0x0078, B:46:0x007d, B:48:0x0082, B:49:0x0092, B:42:0x009d, B:44:0x00a5, B:51:0x0087, B:54:0x008f, B:57:0x0096, B:58:0x0099, B:61:0x0076, B:65:0x003f, B:66:0x00ea, B:67:0x00ef, B:68:0x00f8), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5 A[Catch: all -> 0x00fa, TryCatch #2 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:15:0x004c, B:17:0x0059, B:20:0x00a7, B:22:0x00b5, B:24:0x00c6, B:27:0x00d5, B:29:0x00e7, B:30:0x00f0, B:31:0x00f4, B:32:0x0062, B:34:0x0068, B:37:0x0078, B:46:0x007d, B:48:0x0082, B:49:0x0092, B:42:0x009d, B:44:0x00a5, B:51:0x0087, B:54:0x008f, B:57:0x0096, B:58:0x0099, B:61:0x0076, B:65:0x003f, B:66:0x00ea, B:67:0x00ef, B:68:0x00f8), top: B:4:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.QnN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC68056QnM.LIZIZ():java.lang.Object");
    }

    public /* synthetic */ AbstractC68056QnM(C68559QvT c68559QvT, String str, Object obj) {
        if (c68559QvT.LIZ != null) {
            this.LIZ = c68559QvT;
            this.LIZIZ = str;
            this.LIZJ = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
