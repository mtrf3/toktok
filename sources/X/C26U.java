package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.26U, reason: invalid class name */
/* loaded from: classes.dex */
public class C26U extends QXX {
    public static boolean LLLLZLLLI(C279917z c279917z, C279917z c279917z2) {
        if (c279917z.LJIILJJIL != c279917z2.LJIILJJIL) {
            return false;
        }
        while (true) {
            boolean z = true;
            for (OSZ osz : ORZ.LLILLL(ORZ.LLJJIII(c279917z.LJI(), c279917z2.LJI()), 3)) {
                if (!z || !o.LJ(osz.getFirst(), osz.getSecond())) {
                    z = false;
                }
            }
            return z;
        }
    }

    public boolean LLLLZIL(C279917z c279917z, C279917z c279917z2) {
        if (c279917z.LIZ == c279917z2.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.QXX
    public /* bridge */ /* synthetic */ boolean LJLIIIL(int i, int i2, Object obj, Object obj2) {
        return LLLLZIL((C279917z) obj, (C279917z) obj2);
    }

    @Override // X.QXX
    /* renamed from: LLLLZ, reason: merged with bridge method [inline-methods] */
    public boolean LJLI(C279917z c279917z, C279917z c279917z2, int i, int i2) {
        if ((c279917z.LJIIIIZZ() && c279917z2.LJIIIIZZ()) || c279917z.LJIIJ != c279917z2.LJIIJ || c279917z.LJIIJJI != c279917z2.LJIIJJI || c279917z.LJIIL != c279917z2.LJIIL || c279917z.LJIILIIL != c279917z2.LJIILIIL || !o.LJ(c279917z.LJFF, c279917z2.LJFF) || !LLLLZLLLI(c279917z, c279917z2) || c279917z.LIZ != c279917z2.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.QXX
    /* renamed from: LLLLZLLIL, reason: merged with bridge method [inline-methods] */
    public Object LLIIIL(C279917z c279917z, C279917z c279917z2, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (c279917z.LJIIJ != c279917z2.LJIIJ) {
            arrayList.add(EnumC24230xH.FAV_CHANGE);
        }
        if (c279917z.LJIIJJI != c279917z2.LJIIJJI) {
            arrayList.add(EnumC24230xH.ADDED);
        }
        if (c279917z.LJIIL != c279917z2.LJIIL) {
            arrayList.add(EnumC24230xH.REQUESTED);
        }
        if (c279917z.LJIILIIL != c279917z2.LJIILIIL) {
            arrayList.add(EnumC24230xH.PLAY_STATUS);
        }
        if (!o.LJ(c279917z.LJFF, c279917z2.LJFF)) {
            arrayList.add(EnumC24230xH.COVER_CHANGED);
        }
        if (!LLLLZLLLI(c279917z, c279917z2)) {
            arrayList.add(EnumC24230xH.USER_INFO_CHANGED);
        }
        return arrayList;
    }
}
