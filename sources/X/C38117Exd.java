package X;

import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Exd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38117Exd {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Boolean LJIIIIZZ;
    public final String LJIIIZ;
    public int LJIIJ;
    public final C37960Ev6 LJIIJJI = new C37960Ev6();
    public final List<TimeLineEvent> LJIIL;
    public InterfaceC38149Ey9 LJIILIIL;
    public String LJIILJJIL;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("methodName: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", params: ");
        LIZ.append(this.LJ);
        LIZ.append(", callbackId: ");
        LIZ.append(this.LJFF);
        LIZ.append(", type: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", iFrameUrl: ");
        if (TextUtils.isEmpty(this.LJII)) {
            str = "null";
        } else {
            str = this.LJII;
        }
        LIZ.append(str);
        LIZ.append(", version: ");
        return JBR.LJFF(LIZ, this.LIZIZ, ", ", LIZ);
    }

    public C38117Exd(C38128Exo c38128Exo) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJIIL = copyOnWriteArrayList;
        this.LJIILJJIL = "";
        String str = c38128Exo.LIZ;
        this.LIZIZ = str;
        String str2 = c38128Exo.LIZIZ;
        this.LIZJ = str2;
        String str3 = c38128Exo.LIZJ;
        this.LIZLLL = str3;
        String str4 = c38128Exo.LIZLLL;
        this.LJ = str4;
        String str5 = c38128Exo.LJ;
        this.LJFF = str5;
        String str6 = c38128Exo.LJFF;
        this.LJI = str6;
        this.LIZ = 1;
        String str7 = c38128Exo.LJI;
        this.LJII = str7;
        this.LJIIIIZZ = c38128Exo.LJIIIIZZ;
        String str8 = c38128Exo.LJII;
        this.LJIIIZ = str8;
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(str, "version");
        c38185Eyj.LIZJ(str2, "type");
        c38185Eyj.LIZJ(str3, "methodName");
        c38185Eyj.LIZJ(str4, "params");
        c38185Eyj.LIZJ(str6, "namespace");
        c38185Eyj.LIZJ(str5, "callbackId");
        c38185Eyj.LIZJ(str6, "namespace");
        c38185Eyj.LIZJ(str7, "iFrameUrl");
        c38185Eyj.LIZJ(str8, "token");
        c38185Eyj.LIZ("label_create_java_call", copyOnWriteArrayList);
    }

    public static boolean LIZ(C38117Exd c38117Exd) {
        if (c38117Exd == null || c38117Exd.LIZ != 1 || TextUtils.isEmpty(c38117Exd.LIZLLL) || TextUtils.isEmpty(c38117Exd.LJ)) {
            return true;
        }
        return false;
    }

    public C38117Exd(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJIIL = copyOnWriteArrayList;
        this.LJIILJJIL = "";
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = str;
        this.LJI = null;
        this.LIZ = -5;
        this.LJII = null;
        this.LJIIIIZZ = Boolean.FALSE;
        this.LJIIIZ = null;
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(str, "callbackId");
        c38185Eyj.LIZJ(-5, "code");
        c38185Eyj.LIZ("label_create_java_call", copyOnWriteArrayList);
    }
}
