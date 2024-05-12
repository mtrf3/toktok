package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81463Hq implements InterfaceC81473Hr {
    public static final C81483Hs LJI = new Object() { // from class: X.3Hs
    };
    public final int LIZ;
    public final int LIZIZ;
    public final C3Q9 LIZJ;
    public final InterfaceC65784Pro<Long> LIZLLL;
    public final InterfaceC88473Ynt<String, String, String, C76800UCe> LJ;
    public final C62822Ol8 LJFF;

    public C81463Hq(int i) {
        int i2 = IR3.LIZIZ().dmNoUpdateDays;
        int i3 = IR3.LIZIZ().dmNoUpdateDisplayCount;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C3AK getCurrentTime = C3AK.LJLIL;
        C3H4 c3h4 = new C3H4(C82983Nm.LIZ);
        o.LJIIIZ(getCurrentTime, "getCurrentTime");
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = c4wc;
        this.LIZLLL = getCurrentTime;
        this.LJ = c3h4;
        this.LJFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1056));
    }

    public static boolean LIZJ(OSZ osz) {
        o.LJIIIZ(osz, "<this>");
        if (((C3L4) osz.getFirst()).LJLLLL || ((C63120Opw) osz.getSecond()).isStickTop()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC81473Hr
    public final List<C3L4> LIZ(List<? extends C3L4> list) {
        OSZ osz;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= this.LIZIZ) {
            return list;
        }
        long longValue = this.LIZLLL.invoke().longValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3L4 c3l4 = (C3L4) it.next();
            if (c3l4 instanceof C3L2) {
                C63120Opw c63120Opw = ((C3L2) c3l4).LLIIJLIL;
                if (c63120Opw != null) {
                    osz = new OSZ(c3l4, c63120Opw);
                    arrayList2.add(osz);
                }
            } else {
                C63120Opw LIZ = this.LIZJ.LIZ(c3l4.LJFF());
                if (LIZ != null) {
                    osz = new OSZ(c3l4, LIZ);
                    arrayList2.add(osz);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (LIZJ((OSZ) next)) {
                arrayList3.add(next);
            }
        }
        List LIZIZ = LIZIZ(0, arrayList3, longValue);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!LIZJ((OSZ) next2)) {
                arrayList4.add(next2);
            }
        }
        List LLIIIZ = ORZ.LLIIIZ(LIZIZ(((ArrayList) LIZIZ).size(), arrayList4, longValue), LIZIZ);
        Iterator it4 = ((ArrayList) LLIIIZ).iterator();
        while (it4.hasNext()) {
            this.LJ.invoke(((C3L4) it4.next()).LJFF(), "key_focused_session_last_shown_time", String.valueOf(longValue));
        }
        return ORZ.LLJI(LLIIIZ);
    }

    public final List LIZIZ(int i, List list, long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C63120Opw conversation = (C63120Opw) ((OSZ) next).getSecond();
            o.LJIIIZ(conversation, "conversation");
            String str = conversation.getLocalExt().get("key_focused_session_last_shown_time");
            if (str != null && str.length() > 0) {
                Long LJJIZ = C38350F3i.LJJIZ(str);
                if (LJJIZ != null) {
                    if (conversation.getUpdatedTime() < LJJIZ.longValue() && j - conversation.getUpdatedTime() >= ((Number) this.LJFF.getValue()).longValue()) {
                    }
                } else {
                    String msg = i0.LJFF("Invalid number format ", str);
                    o.LJIIIZ(msg, "msg");
                }
            }
            arrayList.add(next);
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            o.LJIIIZ(osz, "<this>");
            arrayList3.add(osz.getFirst());
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList3);
        ArrayList arrayList4 = (ArrayList) LLJILJILJ;
        if (arrayList4.size() + i < this.LIZIZ) {
            ArrayList arrayList5 = new ArrayList(C32I.LJJL(list, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                OSZ osz2 = (OSZ) it3.next();
                o.LJIIIZ(osz2, "<this>");
                arrayList5.add(osz2.getFirst());
            }
            arrayList4.addAll(ORZ.LLILLL(ORZ.LLIIIILZ(arrayList5, LLJILJILJ), this.LIZIZ - arrayList4.size()));
            C40675Fxn.LJJLIIIJ(LLJILJILJ, C32064CiC.LJLIL);
        }
        return LLJILJILJ;
    }
}
