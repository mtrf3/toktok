package X;

import android.content.Context;
import android.os.Handler;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.MaxSizeLinkedHashMap;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.source.ServiceInfo;
import java.util.LinkedHashMap;

/* renamed from: X.Ze8, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90416Ze8 {
    public static long LJIIL = 15000;
    public Context LIZ;
    public final ContextManager.CastContext LIZIZ;
    public final CastLogger LIZJ;
    public final CastMonitor LIZLLL;
    public final ICastSource LJ;
    public C90494ZfO LJI;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public String LJII = "BDLink";
    public final int[] LJIIJ = Constants.BDLINK_DEFAULT_PORT_ARRAY;
    public final LinkedHashMap<String, ServiceInfo> LJIIJJI = new MaxSizeLinkedHashMap(5);
    public final Handler LJFF = new Handler(Dispatcher.getInstance().getByteCastThreadLooper(), new C90415Ze7(this));

    public C90416Ze8(ContextManager.CastContext castContext, ICastSource iCastSource) {
        this.LIZIZ = castContext;
        this.LIZJ = ContextManager.getLogger(castContext);
        this.LIZLLL = ContextManager.getMonitor(castContext);
        this.LJ = iCastSource;
    }
}
