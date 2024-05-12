package X;

import android.content.Context;
import android.os.Handler;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.discovery.INsdHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZWQ {
    public INsdHelper LIZ;
    public Context LIZIZ;
    public String LIZLLL;
    public boolean LJ;
    public IServerListener LJFF;
    public String LJII;
    public ILibraryLoader LJIIIIZZ;
    public final ICastSink LJIIIZ;
    public final ICastSink LJIIJ;
    public String LIZJ = "_BDLink._tcp.";
    public final List<String> LJI = new ArrayList();
    public final C90556ZgO LJIIL = new C90556ZgO(this);
    public final Handler LJIIJJI = new Handler(Dispatcher.getInstance().getByteCastThreadLooper());

    public ZWQ(ICastSink iCastSink, ICastSink iCastSink2) {
        this.LJIIIZ = iCastSink;
        this.LJIIJ = iCastSink2;
    }
}
