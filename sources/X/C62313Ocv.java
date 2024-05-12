package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62313Ocv extends AbstractC62625Ohx {
    public final android.net.Uri LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final String LJFF;
    public final List<String> LJI;
    public final boolean LJII;

    public C62313Ocv() {
        throw null;
    }

    public C62313Ocv(android.net.Uri localUri, String localPath, String str, String str2, String str3, List list, boolean z, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        list = (i & 64) != 0 ? null : list;
        z = (i & 128) != 0 ? false : z;
        o.LJIIIZ(localUri, "localUri");
        o.LJIIIZ(localPath, "localPath");
        this.LIZIZ = localUri;
        this.LIZJ = localPath;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list;
        this.LJII = z;
    }
}
