package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YW2 implements InterfaceC80883Fk {
    public final YWB LIZ;
    public final InterfaceC88472Yns<String, String> LIZIZ;
    public final InterfaceC88472Yns<String, String> LIZJ;
    public final String LIZLLL;

    public YW2(YWB imUserRoomDao) {
        C86970YBi c86970YBi = C86970YBi.LIZ;
        C80843Fg c80843Fg = new C80843Fg(c86970YBi);
        C80863Fi c80863Fi = new C80863Fi(c86970YBi);
        o.LJIIIZ(imUserRoomDao, "imUserRoomDao");
        this.LIZ = imUserRoomDao;
        this.LIZIZ = c80843Fg;
        this.LIZJ = c80863Fi;
        this.LIZLLL = "IMUserDaoWithRoom";
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C34B.LJI(this.LIZLLL, "clear table");
        this.LIZ.LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZIZ(InterfaceC67352kd<? super List<String>> interfaceC67352kd) {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZJ(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        return new Integer(this.LIZ.LJIILIIL(LIZ));
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZLLL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return new Integer(this.LIZ.LIZLLL());
    }

    @Override // X.InterfaceC80883Fk
    public final List<IMUser> LJ(String str) {
        List LJIIJ = this.LIZ.LJIIJ(new C37581di(a1.LJ("\n            SELECT * FROM SIMPLE_USER\n            WHERE ", str, "\n            AND SORT_WEIGHT IS NOT NULL\n            AND INITIAL_LETTER IS NOT NULL\n            ORDER BY SORT_WEIGHT")));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
        Iterator it = LJIIJ.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ((YW6) it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJII(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        YW6 LJIILJJIL = this.LIZ.LJIILJJIL(secUid);
        if (LJIILJJIL != null) {
            return YW4.LIZ(LJIILJJIL);
        }
        return null;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIJJI(InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        List<YW6> all = this.LIZ.getAll();
        ArrayList arrayList = new ArrayList(C32I.LJJL(all, 10));
        Iterator<YW6> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ(it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        YW6 LIZJ = this.LIZ.LIZJ(uid);
        if (LIZJ != null) {
            return YW4.LIZ(LIZJ);
        }
        return null;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILIIL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return new Integer(this.LIZ.LJIILL());
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        if (this.LIZ.LIZLLL() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJFF(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        List<YW6> LJIIJJI = this.LIZ.LJIIJJI(i);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJJI, 10));
        Iterator<YW6> it = LJIIJJI.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ(it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJI(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        List LJII = this.LIZ.LJII(i, LIZ);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJII, 10));
        Iterator it = LJII.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ((YW6) it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIIIZZ(List<? extends IMUser> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJIJI = LJIJI(list, interfaceC67352kd, false);
        if (LJIJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILJJIL(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        String str2 = this.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete ");
        LIZ.append(str);
        C34B.LJI(str2, X1D.LIZIZ(LIZ));
        if (str.length() > 0) {
            this.LIZ.LJIIL(str);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIJ(List<? extends IMUser> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJIJI = LJIJI(list, interfaceC67352kd, true);
        if (LJIJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIJ(int i, List<String> list, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        YWB ywb = this.LIZ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        List<YW6> LJIIIZ = ywb.LJIIIZ(i, list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIIZ, 10));
        Iterator<YW6> it = LJIIIZ.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[LOOP:0: B:14:0x004c->B:16:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.util.List r71, X.InterfaceC67352kd r72, boolean r73) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YW2.LJIJI(java.util.List, X.2kd, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILLIIL(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        YWB ywb = this.LIZ;
        if (i <= 0) {
            i = -1;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        List LJ = ywb.LJ(i, i2, list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ((YW6) it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIZILJ(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        YWB ywb = this.LIZ;
        if (i <= 0) {
            i = -1;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        List LJI = ywb.LJI(i, i2, list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJI, 10));
        Iterator it = LJI.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ((YW6) it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIIZ(List<String> list, int i, int i2, String str, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        String str2;
        StringBuilder LIZIZ = C25620zW.LIZIZ("\n            SELECT * FROM SIMPLE_USER\n            WHERE ", str, "\n            AND UID NOT IN (");
        if (list != null) {
            str2 = ORZ.LLD(list, ",", null, null, null, 62);
        } else {
            str2 = "";
        }
        C0EH.LIZLLL(LIZIZ, str2, ")\n            LIMIT ", i, "\n            OFFSET ");
        List LJIIIIZZ = this.LIZ.LJIIIIZZ(new C37581di(C08380Uo.LIZ(LIZIZ, i2, "\n        ", LIZIZ)));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIIIZZ, 10));
        Iterator it = LJIIIIZZ.iterator();
        while (it.hasNext()) {
            arrayList.add(YW4.LIZ((YW6) it.next()));
        }
        return arrayList;
    }
}
