package X;

/* renamed from: X.Phx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65173Phx<T> extends C65445PmL {
    public final C65172Phw LJLJI;

    public AbstractC65173Phx(AbstractC65467Pmh abstractC65467Pmh, Class cls) {
        C65172Phw c65172Phw = new C65172Phw();
        this.LJLJI = c65172Phw;
        abstractC65467Pmh.getClass();
        String str = abstractC65467Pmh.LIZ;
        if (str != null) {
            StringBuilder sb = new StringBuilder(C1FL.LIZ(str, 1, 22));
            sb.append(str);
            sb.append(" Google-API-Java-Client");
            c65172Phw.LIZLLL(sb.toString());
            return;
        }
        c65172Phw.LIZLLL("Google-API-Java-Client");
    }

    public AbstractC65173Phx LIZJ(Object obj, String str) {
        super.LIZIZ(obj, str);
        return this;
    }
}
