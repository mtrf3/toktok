package X;

import com.bytedance.applog.compress.CompressManager;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QHG implements InterfaceC66739QHf {
    public final QH9 LIZ;
    public final CompressManager LIZIZ;

    @Override // X.InterfaceC66739QHf
    public final QHK LIZ(byte[] bArr) {
        QHK qhk = new QHK();
        C66576QAy c66576QAy = new C66576QAy();
        qhk.LIZ = this.LIZIZ.compress(bArr, this.LIZ.LJ.getInt("content_encode_method", 0), c66576QAy);
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

    public QHG(QI3 qi3, QH9 qh9) {
        this.LIZ = qh9;
        this.LIZIZ = new CompressManager(qi3.LJIIJ, C66745QHl.LIZIZ(qi3, "sp_tea_log_compress"), new QHI(qi3), qi3.LJJIZ);
    }
}
