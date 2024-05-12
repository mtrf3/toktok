package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H15 implements InterfaceC148965sy {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(H1E.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(H1F.LJLIL);
    public final java.util.Map<EnumC159096Mf, H16> LIZJ = new LinkedHashMap();
    public final LinkedHashMap<String, String> LIZLLL = new LinkedHashMap<>();
    public final H1B LJ = new H1B(this);

    @Override // X.InterfaceC148965sy
    public final synchronized void LIZIZ() {
        this.LIZLLL.clear();
        XKX.LJ(C78613UtF.LIZJ, new C43385H0z(this, null));
    }

    public final String LJ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-cacheDir>(...)");
        return (String) value;
    }

    @Override // X.InterfaceC148965sy
    public final void destroy() {
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            C48841JEv.LIZJ(((H16) it.next()).LJIIIIZZ, null);
        }
        C44687HgJ.LJIILLIIL(LJ(), H1G.LJLIL);
        C44687HgJ.LJIILIIL(LJ());
    }

    @Override // X.InterfaceC148965sy
    public final String LIZJ(EnumC159096Mf type) {
        H16 h16;
        o.LJIIIZ(type, "type");
        if (!this.LIZJ.containsKey(type) || (h16 = (H16) ((LinkedHashMap) this.LIZJ).get(type)) == null) {
            return null;
        }
        switch (H13.LIZ[h16.LIZIZ.ordinal()]) {
            case 1:
                h16.LIZ();
                return h16.LJFF;
            case 2:
                return h16.LJFF;
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new C162476Zf();
        }
    }

    @Override // X.InterfaceC148965sy
    public final C73426Srm LIZLLL(EnumC159096Mf type) {
        H16 h16;
        o.LJIIIZ(type, "type");
        if (!this.LIZJ.containsKey(type) || (h16 = (H16) ((LinkedHashMap) this.LIZJ).get(type)) == null) {
            return null;
        }
        switch (H13.LIZ[h16.LIZIZ.ordinal()]) {
            case 1:
                h16.LIZ();
                return h16.LJI;
            case 2:
            case 3:
            case 4:
                return h16.LJI;
            case 5:
            case 6:
                return null;
            default:
                throw new C162476Zf();
        }
    }

    @Override // X.InterfaceC148965sy
    public final void LIZ(EnumC159096Mf type, QXX qxx, H1H h1h, C139965eS c139965eS, C140005eW c140005eW) {
        H16 h16;
        o.LJIIIZ(type, "type");
        this.LIZJ.put(type, new H16(this, type, qxx, H14.PREPARED, h1h, c139965eS, c140005eW));
        if (!h1h.LIZLLL && (h16 = (H16) ((LinkedHashMap) this.LIZJ).get(type)) != null) {
            h16.LIZ();
        }
    }
}
