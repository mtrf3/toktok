package X;

import Y.ARunnableS17S0201000_14;
import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q42 extends FilterOutputStream implements Q4D {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C66390Q3u LJLIL;
    public final java.util.Map<GraphRequest, Q43> LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public Q43 LJLJL;

    public final void LIZJ() {
        Handler handler;
        if (this.LJLJJL > this.LJLJJLL) {
            Iterator it = ((ArrayList) this.LJLIL.LJLJJI).iterator();
            while (it.hasNext()) {
                BMW bmw = (BMW) it.next();
                if ((bmw instanceof Q4C) && ((handler = this.LJLIL.LJLIL) == null || Boolean.valueOf(handler.post(new ARunnableS17S0201000_14(1, bmw, this, 15))) == null)) {
                    ((Q4C) bmw).LIZIZ();
                }
            }
            this.LJLJJLL = this.LJLJJL;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        Iterator<Q43> it = this.LJLILLLLZI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        LIZJ();
    }

    @Override // X.Q4D
    public final void LIZ(GraphRequest graphRequest) {
        Q43 q43;
        if (graphRequest != null) {
            q43 = this.LJLILLLLZI.get(graphRequest);
        } else {
            q43 = null;
        }
        this.LJLJL = q43;
    }

    public final void LIZIZ(long j) {
        Q43 q43 = this.LJLJL;
        if (q43 != null) {
            long j2 = q43.LIZLLL + j;
            q43.LIZLLL = j2;
            if (j2 >= q43.LJ + q43.LIZJ || j2 >= q43.LJFF) {
                q43.LIZ();
            }
        }
        long j3 = this.LJLJJL + j;
        this.LJLJJL = j3;
        if (j3 >= this.LJLJJLL + this.LJLJJI || j3 >= this.LJLJI) {
            LIZJ();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) {
        o.LJIIIZ(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        LIZIZ(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        LIZIZ(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i, int i2) {
        o.LJIIIZ(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i, i2);
        LIZIZ(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q42(OutputStream outputStream, C66390Q3u c66390Q3u, java.util.Map<GraphRequest, Q43> progressMap, long j) {
        super(outputStream);
        o.LJIIIZ(progressMap, "progressMap");
        this.LJLIL = c66390Q3u;
        this.LJLILLLLZI = progressMap;
        this.LJLJI = j;
        Q4J.LJI();
        this.LJLJJI = u.LJI.get();
    }
}
