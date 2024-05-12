package X;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.G3t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40909G3t {
    public long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;
    public final Locale LIZLLL;
    public EnumC40914G3y LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public JSONObject LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public List<String> LJIIJJI;

    public C40909G3t() {
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        this.LIZLLL = locale;
        this.LJ = EnumC40914G3y.JSON;
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIIZZ = new JSONObject();
        this.LJIIJ = "";
    }
}
