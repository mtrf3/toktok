package X;

import android.os.Handler;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.ICastSource;

/* renamed from: X.Ze6, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90414Ze6 {
    public final ICastSource LIZ;
    public final Handler LIZIZ = new Handler(Dispatcher.getInstance().getByteCastThreadLooper(), new C90413Ze5(this));
    public final ContextManager.CastContext LIZJ;
    public final CastLogger LIZLLL;
    public C90492ZfM LJ;
    public C90493ZfN LJFF;
    public volatile boolean LJI;

    public C90414Ze6(ContextManager.CastContext castContext, ICastSource iCastSource) {
        this.LIZ = iCastSource;
        this.LIZJ = castContext;
        this.LIZLLL = ContextManager.getLogger(castContext);
    }
}
