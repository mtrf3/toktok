package X;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q41 extends OutputStream implements Q4D {
    public final Handler LJLIL;
    public final java.util.Map<GraphRequest, Q43> LJLILLLLZI = new HashMap();
    public GraphRequest LJLJI;
    public Q43 LJLJJI;
    public int LJLJJL;

    public Q41(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // X.Q4D
    public final void LIZ(GraphRequest graphRequest) {
        Q43 q43;
        this.LJLJI = graphRequest;
        if (graphRequest != null) {
            q43 = (Q43) ((HashMap) this.LJLILLLLZI).get(graphRequest);
        } else {
            q43 = null;
        }
        this.LJLJJI = q43;
    }

    public final void LIZIZ(long j) {
        GraphRequest graphRequest = this.LJLJI;
        if (graphRequest == null) {
            return;
        }
        if (this.LJLJJI == null) {
            Q43 q43 = new Q43(this.LJLIL, graphRequest);
            this.LJLJJI = q43;
            ((HashMap) this.LJLILLLLZI).put(graphRequest, q43);
        }
        Q43 q432 = this.LJLJJI;
        if (q432 != null) {
            q432.LJFF += j;
        }
        this.LJLJJL += (int) j;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        o.LJIIIZ(buffer, "buffer");
        LIZIZ(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZIZ(1L);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i, int i2) {
        o.LJIIIZ(buffer, "buffer");
        LIZIZ(i2);
    }
}
