package X;

import java.util.LinkedHashMap;

/* renamed from: X.Wbg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82620Wbg<CHILD> {
    public final Class<CHILD> LIZ;
    public final String LIZIZ;
    public final /* synthetic */ C82621Wbh LIZJ;

    public final void LIZ(Class... clsArr) {
        for (Class cls : clsArr) {
            C82621Wbh c82621Wbh = this.LIZJ;
            Class<CHILD> cls2 = this.LIZ;
            String str = this.LIZIZ;
            c82621Wbh.getClass();
            C82131WLf c82131WLf = new C82131WLf(cls2, str);
            Object obj = ((LinkedHashMap) c82621Wbh.LIZJ).get(new C83683Qe(str, cls2));
            if (obj != null) {
                if (obj instanceof C82617Wbd) {
                    c82621Wbh.LIZLLL(cls, str, c82131WLf);
                } else {
                    c82621Wbh.LIZIZ(cls, str, c82131WLf);
                }
            } else {
                throw new IllegalStateException("isSrcSingleton can't find src provider");
            }
        }
    }

    public C82620Wbg(C82621Wbh c82621Wbh, Class<CHILD> cls, String str) {
        this.LIZJ = c82621Wbh;
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
