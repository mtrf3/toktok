package X;

import com.bytedance.forest.model.Request;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.O3m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61286O3m {
    public final Request LIZ;
    public int LIZIZ;
    public final C62822Ol8 LIZJ;
    public String LIZLLL;
    public android.net.Uri LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public OSZ<String, ? extends android.net.Uri> LJIIIIZZ;
    public final String LJIIIZ;
    public boolean LJIIJ;
    public final /* synthetic */ C61296O3w LJIIJJI;

    public final List<String> LIZ() {
        return (List) this.LIZJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61286O3m(X.C61296O3w r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61286O3m.<init>(X.O3w):void");
    }

    public final void LIZIZ(O4H o4h) {
        String str;
        C61296O3w c61296O3w = this.LJIIJJI;
        String str2 = c61296O3w.LIZLLL.LIZLLL;
        Object obj = c61296O3w.LJIIL.LJZI.getCustomParams().get("rl_container_uuid");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str3 = (String) obj;
        JSONObject LIZLLL = C770830u.LIZLLL("type", 1);
        LIZLLL.put("url", this.LIZLLL);
        LIZLLL.put("message", o4h.getErrorMessage());
        LIZLLL.put("code", o4h.getCode());
        if (o.LJ(this.LJIIJJI.LJIIL.LJZI.getNetDepender(), C61298O3y.LIZJ)) {
            str = "ttnet";
        } else {
            str = "downloader";
        }
        LIZLLL.put("extra", str);
        C61288O3o.LIZIZ(str2, str3, LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:27:0x0050, B:29:0x0058, B:33:0x0070, B:36:0x0079, B:38:0x007f, B:44:0x009c, B:46:0x00a4, B:48:0x00ac, B:49:0x00b5, B:50:0x00b8, B:52:0x00bb, B:53:0x00be, B:57:0x0086, B:59:0x008a, B:61:0x008e, B:68:0x00ce, B:69:0x00d1), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:27:0x0050, B:29:0x0058, B:33:0x0070, B:36:0x0079, B:38:0x007f, B:44:0x009c, B:46:0x00a4, B:48:0x00ac, B:49:0x00b5, B:50:0x00b8, B:52:0x00bb, B:53:0x00be, B:57:0x0086, B:59:0x008a, B:61:0x008e, B:68:0x00ce, B:69:0x00d1), top: B:26:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.String, android.net.Uri> LIZLLL(boolean r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61286O3m.LIZLLL(boolean):X.OSZ");
    }

    public final void LIZJ(android.net.Uri uri, String str) {
        this.LIZLLL = str;
        this.LJ = uri;
        int i = 1;
        int loadRetryTimes = this.LIZ.getLoadRetryTimes() + 1;
        if (loadRetryTimes >= 1) {
            i = loadRetryTimes;
        }
        this.LJFF = i;
    }
}
