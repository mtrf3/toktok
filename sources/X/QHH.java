package X;

import android.content.Context;
import com.bytedance.applog.compress.CompressManager;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QHH implements InterfaceC66739QHf {
    public final CompressManager LIZ;

    public QHH(Context context) {
        this.LIZ = new CompressManager(context, null, new QHJ(), null);
    }

    @Override // X.InterfaceC66739QHf
    public final QHK LIZ(byte[] bArr) {
        QHK qhk = new QHK();
        C66576QAy c66576QAy = new C66576QAy();
        try {
            qhk.LIZ = this.LIZ.compress(bArr, AppLog.getEncodeType(), c66576QAy);
        } catch (Throwable th) {
            QHL.LIZIZ("Compress do compress failed", th);
        }
        qhk.LIZIZ = c66576QAy.LIZJ;
        HashMap hashMap = new HashMap(4);
        int i = c66576QAy.LIZJ;
        if (i == 0) {
            hashMap.put("log-encode-type", "gzip");
        } else if (i == 1 || i == 2) {
            C116484hg.LIZIZ(hashMap, "log-encode-type", "zstd", 0, "log-encode-token");
        }
        qhk.LIZJ = hashMap;
        return qhk;
    }
}
