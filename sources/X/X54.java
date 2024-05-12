package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class X54 implements X52 {
    public final boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;
    public final java.util.Set<String> LIZLLL = new HashSet();
    public final /* synthetic */ X53 LJ;

    @Override // X.X52
    public final boolean LIZIZ() {
        return true;
    }

    public X54(X53 x53) {
        this.LJ = x53;
        if (x53.LJII > 0 && !x53.LJI.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // X.X52
    public void LIZ(List<HttpHeader> list) {
        int i;
        if (!this.LIZ || !this.LIZIZ || (i = this.LIZJ) < 0 || i >= this.LJ.LJII) {
            return;
        }
        this.LIZIZ = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = ((HashSet) this.LIZLLL).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        if (C65210PiY.LIZ()) {
            int i2 = this.LJ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Add extra_ttnet_change_ip:");
            LIZ.append(sb.toString());
            C65210PiY.LIZLLL(i2, "NetworkFailoverStrategy", "handleIpChangeHeader", X1D.LIZIZ(LIZ));
        }
        ((ArrayList) list).add(new HttpHeader("extra_ttnet_change_ip", sb.toString()));
    }

    @Override // X.X52
    public boolean LIZJ(BaseException baseException) {
        int indexOf;
        boolean z = false;
        if (this.LIZ && (baseException instanceof DownloadTTNetException)) {
            int i = this.LIZJ;
            X53 x53 = this.LJ;
            if (i < x53.LJII) {
                if (((HashSet) x53.LJI).contains(Integer.valueOf(baseException.getErrorCode()))) {
                    String remoteIp = ((DownloadTTNetException) baseException).getRemoteIp();
                    int i2 = this.LIZJ;
                    int i3 = this.LJ.LJII;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        this.LIZJ = i4;
                        if (i4 == i3) {
                            if (C65210PiY.LIZ()) {
                                int i5 = this.LJ.LJIIL;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("CurrentIpChangeCount:");
                                LIZ.append(this.LIZJ);
                                LIZ.append(" mIpChangeCountLimit:");
                                C0FS.LIZJ(LIZ, this.LJ.LJII, LIZ, i5, "NetworkFailoverStrategy", "handleIpChangeError");
                            }
                        } else {
                            if (!TextUtils.isEmpty(remoteIp) && (indexOf = remoteIp.indexOf(":")) > 0 && indexOf < remoteIp.length()) {
                                ((HashSet) this.LIZLLL).add(remoteIp.substring(0, indexOf));
                            } else {
                                ((HashSet) this.LIZLLL).add("0.0.0.0");
                            }
                            z = true;
                        }
                    } else if (C65210PiY.LIZ()) {
                        int i6 = this.LJ.LJIIL;
                        StringBuilder LIZIZ = C25620zW.LIZIZ(" RemoteIp:", remoteIp, " currentIpChangeCount:");
                        LIZIZ.append(this.LIZJ);
                        LIZIZ.append(" errorCode:");
                        LIZIZ.append(baseException.getErrorCode());
                        LIZIZ.append(" mIpChangeErrorIps:");
                        LIZIZ.append(this.LIZLLL.toString());
                        C65210PiY.LIZLLL(i6, "NetworkFailoverStrategy", "handleIpChangeError", X1D.LIZIZ(LIZIZ));
                    }
                }
            }
        }
        this.LIZIZ = z;
        return z;
    }
}
