package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes16.dex */
public class X55 implements X52 {
    public final boolean LIZ;
    public int LIZIZ = -1;
    public final /* synthetic */ X53 LIZJ;

    @Override // X.X52
    public final boolean LIZIZ() {
        return false;
    }

    public X55(X53 x53) {
        this.LIZJ = x53;
        if (!x53.LIZLLL.isEmpty()) {
            if (!x53.LJFF.isEmpty() || !x53.LJ.isEmpty()) {
                this.LIZ = true;
            }
        }
    }

    @Override // X.X52
    public final void LIZ(List<HttpHeader> list) {
        int size;
        int size2;
        if (!this.LIZ || this.LIZIZ < 0) {
            return;
        }
        if (!((ArrayList) this.LIZJ.LJ).isEmpty()) {
            if (this.LIZIZ < ((ArrayList) this.LIZJ.LJ).size()) {
                size2 = this.LIZIZ;
            } else {
                size2 = ((ArrayList) this.LIZJ.LJ).size() - 1;
            }
            String valueOf = String.valueOf(ListProtector.get(this.LIZJ.LJ, size2));
            if (C65210PiY.LIZ()) {
                int i = this.LIZJ.LJIIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Add ConnectTimeout:");
                LIZ.append(valueOf);
                C65210PiY.LIZLLL(i, "NetworkFailoverStrategy", "handleTimeoutHeader", X1D.LIZIZ(LIZ));
            }
            ((ArrayList) list).add(new HttpHeader("extra_ttnet_connect_timeout", valueOf));
        }
        if (((ArrayList) this.LIZJ.LJFF).isEmpty()) {
            return;
        }
        if (this.LIZIZ < ((ArrayList) this.LIZJ.LJFF).size()) {
            size = this.LIZIZ;
        } else {
            size = ((ArrayList) this.LIZJ.LJFF).size() - 1;
        }
        String valueOf2 = String.valueOf(ListProtector.get(this.LIZJ.LJFF, size));
        if (C65210PiY.LIZ()) {
            int i2 = this.LIZJ.LJIIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Add IoTimeout:");
            LIZ2.append(valueOf2);
            C65210PiY.LIZLLL(i2, "NetworkFailoverStrategy", "handleTimeoutHeader", X1D.LIZIZ(LIZ2));
        }
        ((ArrayList) list).add(new HttpHeader("extra_ttnet_io_timeout", valueOf2));
    }

    @Override // X.X52
    public final boolean LIZJ(BaseException baseException) {
        if (this.LIZ) {
            boolean contains = ((HashSet) this.LIZJ.LIZLLL).contains(Integer.valueOf(baseException.getErrorCode()));
            if (contains) {
                this.LIZIZ++;
                return true;
            }
            if (C65210PiY.LIZ()) {
                int i = this.LIZJ.LJIIL;
                StringBuilder LJI = JBR.LJI("IsMatch:", contains, " ttnetTimeoutIndex:");
                LJI.append(this.LIZIZ);
                LJI.append(" errorCode:");
                LJI.append(baseException.getErrorCode());
                C65210PiY.LIZLLL(i, "NetworkFailoverStrategy", "handleTimeoutError", X1D.LIZIZ(LJI));
            }
        }
        return false;
    }
}
