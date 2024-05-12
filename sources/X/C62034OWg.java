package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OWg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62034OWg {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(VFC.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(VFB.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(VFE.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(VFF.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(VFD.LJLIL);

    public static C62031OWd LIZ(List list) {
        try {
            if (list.isEmpty()) {
                return new C62031OWd(-2, (InterfaceC62030OWc) null, 6);
            }
            if (IJV.LIZIZ() <= 2 && IJV.LIZIZ() != 0) {
                return new C62031OWd(-2, LIZIZ(list), 4);
            }
            int LIZIZ2 = IJV.LIZIZ();
            if ((LIZIZ2 <= 3 && LIZIZ2 != 0) || Float.compare(IJV.LIZ(), ((Number) LIZ.getValue()).floatValue()) < 0) {
                return new C62031OWd(1, (InterfaceC62030OWc) ListProtector.get(list, list.size() - 1), ((Number) LIZJ.getValue()).longValue());
            }
            if (IJV.LIZIZ() > 3 && Float.compare(IJV.LIZ(), ((Number) LIZIZ.getValue()).floatValue()) >= 0) {
                return new C62031OWd(1, (InterfaceC62030OWc) ListProtector.get(list, 0), ((Number) LJ.getValue()).longValue());
            }
            if (list.size() > 2) {
                return new C62031OWd(1, (InterfaceC62030OWc) ListProtector.get(list, 1), ((Number) LIZLLL.getValue()).longValue());
            }
            return new C62031OWd(1, (InterfaceC62030OWc) ListProtector.get(list, 0), ((Number) LIZLLL.getValue()).longValue());
        } catch (Exception unused) {
            return new C62031OWd(-1, (InterfaceC62030OWc) null, 6);
        }
    }

    public static InterfaceC62030OWc LIZIZ(List list) {
        if (Float.compare(IJV.LIZ(), ((Number) LIZ.getValue()).floatValue()) < 0) {
            return (InterfaceC62030OWc) DIX.LIZJ(list, 1, list);
        }
        if (Float.compare(IJV.LIZ(), ((Number) LIZIZ.getValue()).floatValue()) >= 0) {
            return (InterfaceC62030OWc) ListProtector.get(list, 0);
        }
        if (list.size() > 2) {
            return (InterfaceC62030OWc) ListProtector.get(list, 1);
        }
        return (InterfaceC62030OWc) ListProtector.get(list, 0);
    }
}
