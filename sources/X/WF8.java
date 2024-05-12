package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WF8 {
    public final int[] LIZ;
    public final List<VideoSegment> LIZIZ;
    public final HashMap<String, Float> LIZJ;
    public final int LIZLLL;
    public final WFB LJ;
    public final boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public WF8(int[] framesSize, List<? extends VideoSegment> list, HashMap<String, Float> hashMap, int i, WFB wfb, boolean z) {
        o.LJIIIZ(framesSize, "framesSize");
        this.LIZ = framesSize;
        this.LIZIZ = list;
        this.LIZJ = hashMap;
        this.LIZLLL = i;
        this.LJ = wfb;
        this.LJFF = z;
    }
}
