package X;

import com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LVe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54362LVe {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C54315LTj.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C54231LQd.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C54364LVg.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C54264LRk.LJLIL);

    public static IIMUnder16Proxy LJI() {
        return (IIMUnder16Proxy) LIZJ.getValue();
    }

    public static INoticeCountService LJIIIZ() {
        return (INoticeCountService) LIZIZ.getValue();
    }

    public static OldNoticeCountService LJIIL() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-oldNoticeCountService>(...)");
        return (OldNoticeCountService) value;
    }

    public static final int LJFF() {
        if (ENR.LIZ()) {
            return LJIIIZ().LJIJ();
        }
        return LJIIL().LJIJJ();
    }

    public static final int LJIIJ() {
        if (ENR.LIZ()) {
            return LJIIIZ().LIZLLL();
        }
        return LJIIL().LIZLLL();
    }

    public static final int LJIIJJI() {
        if (ENR.LIZ()) {
            return LJIIIZ().LJFF();
        }
        return LJIIL().LJFF();
    }

    public static final void LIZIZ(int... iArr) {
        if (ENR.LIZ()) {
            LJIIIZ().LJIIJJI(null, false, iArr);
        } else {
            LJIIL().LJIIL(null, iArr);
        }
    }

    public static final void LIZLLL(int... iArr) {
        if (ENR.LIZ()) {
            LJIIIZ().LJIL(null, iArr);
        } else {
            LJIIL().LJIILJJIL(null, iArr);
        }
    }

    public static final void LJ(int... iArr) {
        if (ENR.LIZ()) {
            for (int i : iArr) {
                LJIIIZ().LJIIIZ(i, null, false);
            }
            return;
        }
        LJIIL().LJIIL(null, iArr);
    }

    public static final NoticeGroupAttrs LJIIIIZZ(int i) {
        if (ENR.LIZ()) {
            return LJIIIZ().LJIIJ(i);
        }
        return LJIIL().LJIIJ(i);
    }

    public static final int LJIILIIL(int... groups) {
        o.LJIIIZ(groups, "groups");
        if (ENR.LIZ()) {
            return LJIIIZ().LJIIZILJ(true, groups);
        }
        ArrayList arrayList = new ArrayList(groups.length);
        for (int i : groups) {
            arrayList.add(Integer.valueOf(LJIIL().LJIIJJI(i)));
        }
        return ORZ.LLILLIZIL(arrayList);
    }

    public static final int LJIILJJIL(int... groups) {
        o.LJIIIZ(groups, "groups");
        if (ENR.LIZ()) {
            return LJIIIZ().LJIIZILJ(false, groups);
        }
        ArrayList arrayList = new ArrayList(groups.length);
        for (int i : groups) {
            arrayList.add(Integer.valueOf(LJIIL().LJI(i)));
        }
        return ORZ.LLILLIZIL(arrayList);
    }

    public static final int LJIILLIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        if (ENR.LIZ()) {
            return LJIIIZ().LJIILIIL(uid);
        }
        return LJIIL().LJIILIIL(uid);
    }

    public static final boolean LJIIZILJ(int... iArr) {
        int[] groups = Arrays.copyOf(iArr, iArr.length);
        o.LJIIIZ(groups, "groups");
        if (ENR.LIZ()) {
            return LJIIIZ().LJIILL(null, false, groups);
        }
        ArrayList arrayList = new ArrayList(groups.length);
        for (int i : groups) {
            List LJIJI = LJIIL().LJIJI(i);
            if (LJIJI.isEmpty()) {
                LJIJI = C47261Igj.LJJIJ(Integer.valueOf(i));
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIJI, 10));
            Iterator it = LJIJI.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(LJIIL().LJIIJJI(((Number) it.next()).intValue())));
            }
            arrayList.add(Integer.valueOf(ORZ.LLILLIZIL(arrayList2)));
        }
        if (ORZ.LLILLIZIL(arrayList) <= 0) {
            return false;
        }
        return true;
    }

    public static final AbstractC73672Svk LJIJI(NoticeList noticeList) {
        if (ENR.LIZ()) {
            return LJIIIZ().LIZ(noticeList);
        }
        return LJIIL().LIZ(noticeList);
    }

    public static final void LJIJJ(boolean z) {
        if (ENR.LIZ()) {
            return;
        }
        LJIIL().LIZJ(z);
    }

    public static final void LIZ(LVG occasion, int... iArr) {
        o.LJIIIZ(occasion, "occasion");
        if (ENR.LIZ()) {
            LJIIIZ().LJIIJJI(occasion, false, iArr);
        } else {
            LJIIL().LJIIL(occasion, iArr);
        }
    }

    public static final void LIZJ(LVG lvg, int... iArr) {
        if (ENR.LIZ()) {
            LJIIIZ().LJIL(lvg, iArr);
        } else {
            LJIIL().LJIILJJIL(lvg, iArr);
        }
    }

    public static final int LJII(int i, EnumC54302LSw showType) {
        o.LJIIIZ(showType, "showType");
        if (ENR.LIZ()) {
            return LJIIIZ().LJIIIIZZ(i, showType, false);
        }
        return LJIIL().LJIJJLI(i, showType);
    }

    public static int LJIILL(int i, EnumC54302LSw showType) {
        o.LJIIIZ(showType, "showType");
        if (ENR.LIZ()) {
            return LJIIIZ().LIZJ(i, showType);
        }
        return LJIIL().LJ(i);
    }

    public static final void LJIJ(String str, List list) {
        if (ENR.LIZ()) {
            LJIIIZ().LJII(str, list);
        } else {
            LJIIL().LJIIZILJ(str, list);
        }
    }

    public static final void LJIJJLI(int i, int i2) {
        if (ENR.LIZ()) {
            LJIIIZ().LIZIZ(i, i2);
        } else {
            LJIIL().LJIIIIZZ(i, i2);
        }
    }
}
