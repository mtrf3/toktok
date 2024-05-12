package X;

import defpackage.q;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.VMa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79604VMa {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;
    public JSONObject LJII;
    public String LJIIIIZZ;
    public EnumC40073Fo5 LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public InterfaceC79582VLe LJIIL;

    public C79604VMa() {
        new HashMap();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomInfo{url='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", bid='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", eventName='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", vid='");
        Q89.LIZIZ(LIZ, this.LJIIJ, '\'', ", transferTarget='");
        LIZ.append(this.LJIIIZ);
        LIZ.append('\'');
        LIZ.append(", canSample=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", monitorId=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, '}', LIZ);
    }
}
