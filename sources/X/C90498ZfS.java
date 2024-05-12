package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ICastSource;

/* renamed from: X.ZfS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90498ZfS {
    public static final String LJ = C16880lQ.LJLLJ(C90498ZfS.class);
    public final ContextManager.CastContext LIZ;
    public final CastLogger LIZIZ;
    public final ICastSource LIZJ;
    public final ICastSource LIZLLL;

    public C90498ZfS(ContextManager.CastContext castContext, ICastSource iCastSource, ICastSource iCastSource2) {
        this.LIZ = castContext;
        this.LIZIZ = ContextManager.getLogger(castContext);
        this.LIZJ = iCastSource;
        this.LIZLLL = iCastSource2;
    }
}
