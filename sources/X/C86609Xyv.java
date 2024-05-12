package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86609Xyv extends AbstractC37843EtD {
    public static final /* synthetic */ int LJIIL = 0;
    public String LIZ;
    public String LIZIZ;
    public InterfaceC78505UrV LIZJ;
    public String LIZLLL;
    public InterfaceC78280Uns LJ;
    public InterfaceC78280Uns LJFF;
    public boolean LJI;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public int LJIIIZ;
    public C86628XzE LJIIJ;
    public boolean LJIIJJI;

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        o.LJIJI("method");
        throw null;
    }

    public final String getUrl() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        o.LJIJI("url");
        throw null;
    }

    @Override // X.AbstractC37843EtD
    public final List<String> provideParamList() {
        return C47261Igj.LJJIJIIJI("url", "method", "body", "params", "header", "bodyType", "disableRedirect", "addCommonParams", "needCommonParams", "jsonFormatOption");
    }
}
