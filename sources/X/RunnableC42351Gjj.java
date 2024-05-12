package X;

import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gjj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42351Gjj implements Runnable {
    public final /* synthetic */ VEMediaParserFrameProviderImpl LJLIL;

    public RunnableC42351Gjj(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
        this.LJLIL = vEMediaParserFrameProviderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Iterator it = ((LinkedHashMap) this.LJLIL.LJLILLLLZI).entrySet().iterator();
            while (it.hasNext()) {
                this.LJLIL.LIZJ((String) ((Map.Entry) it.next()).getKey());
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
