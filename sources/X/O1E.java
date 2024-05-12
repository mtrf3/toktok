package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1E {
    public final int LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final List<String> LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final GeckoConfig LJIIIZ;
    public final java.util.Map<String, GeckoConfig> LJIIJ;
    public final InterfaceC61239O1r LJIIJJI;
    public final Object LJIIL;
    public final Object LJIILIIL;

    public O1E() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{[host]=");
        sb.append(this.LIZLLL);
        sb.append(",[region]=");
        sb.append(this.LJ);
        sb.append(",[prefix]=");
        Object[] array = this.LJFF.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            o.LJFF(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            sb.append(",[appId]=");
            sb.append(this.LJI);
            sb.append(",[appVersion]=");
            sb.append(this.LJII);
            sb.append(",[did]=");
            return C07670Rv.LIZIZ(sb, this.LJIIIIZZ, '}');
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public O1E(String str, String region, List list, String appId, String appVersion, String str2, GeckoConfig geckoConfig, InterfaceC61239O1r interfaceC61239O1r, GeckoXNetImpl geckoXNetImpl, int i) {
        LinkedHashMap geckoConfigs;
        if ((i & 128) != 0) {
            geckoConfigs = new LinkedHashMap();
        } else {
            geckoConfigs = null;
        }
        geckoXNetImpl = (i & 1024) != 0 ? null : geckoXNetImpl;
        o.LJIIJ(region, "region");
        o.LJIIJ(appId, "appId");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(geckoConfigs, "geckoConfigs");
        this.LIZLLL = str;
        this.LJ = region;
        this.LJFF = list;
        this.LJI = appId;
        this.LJII = appVersion;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = geckoConfig;
        this.LJIIJ = geckoConfigs;
        this.LJIIJJI = interfaceC61239O1r;
        this.LJIIL = null;
        this.LJIILIIL = geckoXNetImpl;
        this.LIZ = 10;
        this.LIZIZ = 83886080;
        this.LIZJ = new ArrayList();
    }
}
