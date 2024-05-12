package X;

import com.bytedance.forest.Forest;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.O3x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61297O3x implements InterfaceC61309O4j {
    public static final JSONObject LIZ;
    public static final List<String> LIZIZ;
    public static final C61297O3x LIZJ = new C61297O3x();

    static {
        JSONObject jSONObject = new JSONObject();
        LIZ = jSONObject;
        LIZIZ = C47261Igj.LJJIJIIJI("x-gecko-proxy-pkgid", "content-type", "content-length", "content-encoding", "x-gecko-proxy-logid", "x-gecko-proxy-tvid", "x-tos-version-id", "x-bdcdn-cache-status", "x-cache", "x-response-cache", "x-tt-trace-host", "via");
        jSONObject.put("net_lib_strategy", 5);
    }

    @Override // X.InterfaceC61309O4j
    public final void LIZIZ(C61296O3w c61296O3w) {
        Object obj = c61296O3w.LJIIJJI;
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Downloader.getInstance(Forest.Companion.getApp()).cancel(num.intValue());
        }
    }

    public static boolean LJ(C61295O3v c61295O3v, File file) {
        if (file.exists() && file.isFile()) {
            c61295O3v.LJZL = true;
            c61295O3v.X(new O4O(file));
            c61295O3v.LLD = "cdn";
            if (c61295O3v.LLFF) {
                return true;
            }
            O40.LIZLLL(c61295O3v);
            return true;
        }
        if (o.LJJJJJL(c61295O3v.LL.LJIIJ)) {
            c61295O3v.LL.LIZ(4, "file not exists or a directory");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r3 != null) goto L7;
     */
    @Override // X.InterfaceC61309O4j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r14, X.C61296O3w r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61297O3x.LIZ(android.content.Context, X.O3w):void");
    }

    @Override // X.InterfaceC61309O4j
    public final Boolean LIZJ(String url, File file) {
        kotlin.jvm.internal.o.LJIIJ(url, "url");
        DownloadInfo downloadInfo = Downloader.getInstance(Forest.Companion.getApp()).getDownloadInfo(url, file.getParent());
        if (downloadInfo != null) {
            return Boolean.valueOf(downloadInfo.cacheExpierd());
        }
        return null;
    }

    public static void LIZLLL(C61295O3v c61295O3v, C61296O3w c61296O3w, DownloadInfo downloadInfo) {
        boolean z;
        long j;
        Long LJJIZ;
        if (downloadInfo != null) {
            z = downloadInfo.isSuccessByCache();
        } else {
            z = false;
        }
        c61295O3v.LLFF = z;
        if (downloadInfo != null) {
            String mimeType = downloadInfo.getMimeType();
            if (mimeType != null) {
                c61295O3v.LJLL = s.LJLLL(mimeType, ";", mimeType);
                String LJLLI = s.LJLLI(mimeType, "charset=", "");
                c61295O3v.LJLLJ = s.LJLLL(LJLLI, ";", LJLLI);
            }
            java.util.Map<String, String> httpHeaders = downloadInfo.getHttpHeaders();
            if (httpHeaders != null) {
                String str = httpHeaders.get("x-gecko-proxy-pkgid");
                if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                c61295O3v.LLFFF = j;
                c61295O3v.LJZI.getCustomParams().put("http_response_headers", httpHeaders.toString());
            }
        }
        c61295O3v.LLD = "cdn";
        c61296O3w.LIZLLL();
    }
}
