package X;

import Y.AfS23S1200000_15;
import Y.IDaS9S1100000_15;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86714Y1m {
    public final List<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C86714Y1m(List<? extends Y25<? extends AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> listOfUseCase) {
        o.LJIIIZ(listOfUseCase, "listOfUseCase");
        this.LIZ = listOfUseCase;
    }

    public final boolean LIZ(Aweme aweme) {
        if (aweme == null || !C86678Y0c.LIZJ(aweme)) {
            return false;
        }
        List<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> list = this.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().LJI(aweme)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        List<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> list = this.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().LJII(aweme)) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC73672Svk<Boolean> LIZIZ(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        ArrayList arrayList = new ArrayList();
        for (Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>> y25 : this.LIZ) {
            y25.getClass();
            boolean LJI = y25.LJI(aweme);
            boolean LJII = y25.LJII(aweme);
            y25.LIZJ(aweme, interfaceC86733Y2f, LJI, LJII);
            if (LJI && LJII) {
                AbstractC86724Y1w<? extends InterfaceC86772Y3s> LIZ = y25.LIZ();
                LIZ.getClass();
                Y20<? extends InterfaceC86772Y3s> LIZJ = LIZ.LIZJ();
                Y01 y01 = Y01.LIZIZ;
                String LIZIZ = LIZJ.LIZIZ(aweme, y01.LJJIIZI());
                AbstractC73672Svk<Boolean> abstractC73672Svk = LIZ.LIZ.get(LIZIZ);
                if (abstractC73672Svk == null) {
                    InterfaceC86772Y3s LJ = LIZ.LJ(aweme, y01.LJJIIZI());
                    if (LJ != null) {
                        if (LIZ.LJIIIIZZ(LJ)) {
                            Integer i = LJ.i();
                            if (interfaceC86733Y2f != null) {
                                interfaceC86733Y2f.LIZJ(LIZ.LIZLLL(), true, true, i, null);
                            }
                        }
                        abstractC73672Svk = AbstractC73672Svk.LJJIJIL(Boolean.TRUE);
                    } else {
                        abstractC73672Svk = LIZ.LJII(aweme, interfaceC86733Y2f, enterFrom).LJJIJL(new Y2K(LIZ, LIZIZ)).LJIJ(new IDaS9S1100000_15(LIZ, LIZIZ, 0)).LJIJJ(new AfS23S1200000_15(LIZIZ, LIZ, interfaceC86733Y2f, 0)).LJIIZILJ(new IDaS9S1100000_15(LIZ, LIZIZ, 1));
                        LIZ.LIZ.put(LIZIZ, abstractC73672Svk);
                    }
                    if (abstractC73672Svk != null) {
                    }
                }
                arrayList.add(abstractC73672Svk);
            }
        }
        if (arrayList.isEmpty()) {
            if (!C41032G8m.LIZ()) {
                return AbstractC73672Svk.LJJIJIL(Boolean.FALSE);
            }
            return AbstractC73672Svk.LJJIJIL(Boolean.valueOf(AK4.LIZ().LJJIIZI()));
        }
        if (interfaceC86733Y2f != null) {
            interfaceC86733Y2f.onStart();
        }
        return AbstractC73672Svk.LJJLJ(arrayList, WQL.LJLIL);
    }
}
