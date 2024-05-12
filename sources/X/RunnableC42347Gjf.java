package X;

import Y.ARunnableS8S1100000_7;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gjf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42347Gjf implements Runnable {
    public final /* synthetic */ VEMediaParserProviderV2 LJLIL;

    public RunnableC42347Gjf(VEMediaParserProviderV2 vEMediaParserProviderV2) {
        this.LJLIL = vEMediaParserProviderV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LJLIL;
            Iterator it = ((LinkedHashMap) vEMediaParserProviderV2.LJLILLLLZI).entrySet().iterator();
            while (it.hasNext()) {
                vEMediaParserProviderV2.LJLJI.execute(new ARunnableS8S1100000_7(vEMediaParserProviderV2, (String) ((Map.Entry) it.next()).getKey(), 9));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
