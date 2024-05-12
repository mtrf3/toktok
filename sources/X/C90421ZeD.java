package X;

import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.threadpool.CastThreadExecutorsUtils;
import com.byted.cast.common.threadpool.CastThreadFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.ZeD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90421ZeD {
    public static final String LJ = C16880lQ.LJLLJ(C90421ZeD.class);
    public final ICastSink LIZ;
    public final ICastSink LIZIZ;
    public final List<String> LIZJ = new ArrayList();
    public final ExecutorService LIZLLL = CastThreadExecutorsUtils.newSingleThreadExecutor(new CastThreadFactory("SsdpServer"));

    public C90421ZeD(ICastSink iCastSink, ICastSink iCastSink2) {
        this.LIZ = iCastSink;
        this.LIZIZ = iCastSink2;
    }
}
