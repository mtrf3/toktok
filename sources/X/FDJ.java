package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FDJ extends C40323Fs7 {
    public final Aweme LIZ;
    public final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, C55402Lok.LJLIL);
    public final List<String> LIZJ = new ArrayList();
    public boolean LIZLLL;

    public final void LJIIZILJ() {
        if (((ArrayList) this.LIZJ).isEmpty() && !this.LIZLLL) {
            this.LIZLLL = true;
            FDK fdk = (FDK) this.LIZIZ.getValue();
            if (fdk != null) {
                fdk.LIZ(this.LIZ, true);
            }
        }
    }

    public FDJ(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // X.C40323Fs7, X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GeckoX---onCheckServerVersionSuccess, updateList empty: ");
        LIZ.append(((ArrayList) this.LIZJ).isEmpty());
        FDL.LIZ(X1D.LIZIZ(LIZ));
        super.LJFF(map, map2);
        ((ArrayList) this.LIZJ).clear();
        if (map2 != null) {
            Iterator<Map.Entry<String, List<UpdatePackage>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                List<UpdatePackage> value = it.next().getValue();
                if (value != null) {
                    for (UpdatePackage updatePackage : value) {
                        List<String> list = this.LIZJ;
                        String channel = updatePackage.getChannel();
                        o.LJIIIIZZ(channel, "up.channel");
                        ((ArrayList) list).add(channel);
                    }
                }
            }
        }
        LJIIZILJ();
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GeckoX---onUpdateSuccess, channel: ");
        LIZ.append(str);
        FDL.LIZ(X1D.LIZIZ(LIZ));
        C65777Prh.LIZ(this.LIZJ).remove(str);
        LJIIZILJ();
    }
}
