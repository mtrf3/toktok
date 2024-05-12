package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZA {
    public LinkedHashMap<String, String> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public java.util.Map<String, String> LIZLLL;
    public byte[] LJ;
    public String LJFF;
    public LinkedHashMap<String, File> LJI;
    public final String LJII;

    public EZA(String url) {
        o.LJIIJ(url, "url");
        this.LJII = url;
    }

    public final C86624XzA LIZ(IHostNetworkDepend iHostNetworkDepend) {
        EZ9 ez9 = EZ9.LIZ;
        EZC ezc = EZC.POST;
        ez9.getClass();
        return EZ9.LJ(ezc, this, iHostNetworkDepend);
    }
}
