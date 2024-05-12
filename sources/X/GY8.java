package X;

import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GY8 {
    public final String LIZ;
    public final StreamEditConfigure LIZIZ;
    public final Exception LIZJ;

    public GY8(String downloadPath, StreamEditConfigure streamEditConfigure, Exception exc, int i) {
        streamEditConfigure = (i & 8) != 0 ? null : streamEditConfigure;
        exc = (i & 16) != 0 ? null : exc;
        o.LJIIIZ(downloadPath, "downloadPath");
        this.LIZ = downloadPath;
        this.LIZIZ = streamEditConfigure;
        this.LIZJ = exc;
    }
}
