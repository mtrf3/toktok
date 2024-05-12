package Y;

import X.AbstractC08530Vd;
import X.C123074sJ;
import X.C34445DfV;
import X.C47629Imf;
import X.C52260KfA;
import X.C67257QaT;
import X.C68468Qu0;
import X.C68472Qu4;
import X.C68474Qu6;
import X.C68476Qu8;
import X.C78841Uwv;
import X.EnumC68477Qu9;
import X.IVZ;
import X.InterfaceC68480QuC;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.ORZ;
import X.X1D;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDuS321S0100000_11 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS321S0100000_11(C68474Qu6 c68474Qu6, int i) {
        this.$t = i;
        this.l0 = c68474Qu6;
    }

    public static final void subscribe$0(IDuS321S0100000_11 iDuS321S0100000_11, InterfaceC73573Su9 interfaceC73573Su9) {
        InterfaceC68480QuC LJI = ((C68474Qu6) iDuS321S0100000_11.l0).LJI();
        ArrayList<Integer> tags = C123074sJ.LIZ;
        int LIZJ = LJI.LIZJ(tags);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clear ");
        LIZ.append(LIZJ);
        LIZ.append(" DB records.");
        C47629Imf.LIZ("LocalNotifyTasksPublisher", X1D.LIZIZ(LIZ));
        o.LJIIIZ(tags, "tags");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelWorkManagerTasksByTags(");
        LIZ2.append(tags);
        LIZ2.append(')');
        C47629Imf.LIZ("WMPublishCenter", X1D.LIZIZ(LIZ2));
        if (!tags.isEmpty()) {
            Iterator<Integer> it = tags.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                AbstractC08530Vd abstractC08530Vd = (AbstractC08530Vd) C68468Qu0.LIZ.getValue();
                if (abstractC08530Vd != null) {
                    abstractC08530Vd.LIZIZ(String.valueOf(intValue));
                }
            }
        }
        interfaceC73573Su9.onNext(1);
    }

    public static final void subscribe$1(IDuS321S0100000_11 iDuS321S0100000_11, InterfaceC73573Su9 interfaceC73573Su9) {
        int LJII = ((C68474Qu6) iDuS321S0100000_11.l0).LJI().LJII(3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clear ");
        LIZ.append(LJII);
        LIZ.append(" DB records.");
        C47629Imf.LIZ("LocalNotifyTasksPublisher", X1D.LIZIZ(LIZ));
        C68468Qu0.LIZ(3);
        interfaceC73573Su9.onNext(3);
    }

    public static final void subscribe$2(IDuS321S0100000_11 iDuS321S0100000_11, InterfaceC73573Su9 interfaceC73573Su9) {
        C68474Qu6 c68474Qu6 = (C68474Qu6) iDuS321S0100000_11.l0;
        c68474Qu6.getClass();
        IVZ.LIZ();
        ArrayList arrayList = new ArrayList();
        int LIZIZ = IVZ.LIZIZ();
        if (LIZIZ > 0) {
            if (LIZIZ > 10) {
                LIZIZ = 10;
            }
            if (C52260KfA.LIZ) {
                int i = LIZIZ / 10;
                for (int i2 = 0; i2 < i; i2++) {
                    long j = (i2 * 3 * 60000) + C52260KfA.LIZIZ;
                    long LIZJ = C67257QaT.LIZJ(0);
                    long currentTimeMillis = System.currentTimeMillis() + j;
                    EnumC68477Qu9 enumC68477Qu9 = EnumC68477Qu9.CURRENT;
                    arrayList.add(new C68476Qu8(C68472Qu4.LIZ(3, enumC68477Qu9.getIndex(), LIZJ), 3, LIZJ, enumC68477Qu9.getIndex(), currentTimeMillis - LIZJ, currentTimeMillis, 1410));
                }
            }
            int i3 = 0;
            do {
                long LIZJ2 = C67257QaT.LIZJ(i3);
                EnumC68477Qu9 enumC68477Qu92 = EnumC68477Qu9.EIGHT2TWENTYONE;
                long LIZIZ2 = C67257QaT.LIZIZ(LIZJ2, enumC68477Qu92);
                long nextLong = C78841Uwv.LIZ(SystemClock.elapsedRealtime()).nextLong(enumC68477Qu92.getDuration() * 60000);
                arrayList.add(new C68476Qu8(C68472Qu4.LIZ(3, enumC68477Qu92.getIndex(), LIZJ2), 3, LIZJ2, enumC68477Qu92.getIndex(), nextLong, LIZIZ2 + nextLong, 1410));
                i3++;
            } while (i3 < LIZIZ);
        }
        c68474Qu6.LJI().LJ();
        List<C68476Qu8> LIZLLL = c68474Qu6.LJI().LIZLLL();
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C68476Qu8 c68476Qu8 = (C68476Qu8) next;
            for (C68476Qu8 c68476Qu82 : LIZLLL) {
                if (o.LJ(c68476Qu82.LJLIL, c68476Qu8.LJLIL) && (!C52260KfA.LIZ || c68476Qu8.LJLJJL != EnumC68477Qu9.CURRENT.getIndex())) {
                    c68476Qu8.LJLJL = c68476Qu82.LJLJL;
                    c68476Qu8.LJLJJLL = c68476Qu82.LJLJJLL;
                    c68476Qu8.LJLL = true;
                    c68476Qu8.L("Already has:");
                }
            }
            if (c68476Qu8.LJLJL < currentTimeMillis2) {
                c68476Qu8.L("Expired:");
            } else {
                c68476Qu8.L("To insert:");
                arrayList2.add(next);
            }
        }
        List<C68476Qu8> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        c68474Qu6.LJI().LJII(3);
        c68474Qu6.LJI().LIZIZ(LLJILJILJ);
        C68468Qu0.LIZ(3);
        C68468Qu0.LIZIZ(LLJILJILJ);
        interfaceC73573Su9.onNext(3);
    }

    public static final void subscribe$3(IDuS321S0100000_11 iDuS321S0100000_11, InterfaceC73573Su9 interfaceC73573Su9) {
        EnumC68477Qu9[] enumC68477Qu9Arr;
        C68474Qu6 c68474Qu6 = (C68474Qu6) iDuS321S0100000_11.l0;
        c68474Qu6.getClass();
        ArrayList arrayList = new ArrayList();
        int i = C34445DfV.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    enumC68477Qu9Arr = new EnumC68477Qu9[0];
                } else {
                    enumC68477Qu9Arr = new EnumC68477Qu9[]{EnumC68477Qu9.TWO2THREE_PM, EnumC68477Qu9.SEVEN2EIGHT_PM};
                }
            } else {
                enumC68477Qu9Arr = new EnumC68477Qu9[]{EnumC68477Qu9.SEVEN2EIGHT_PM};
            }
        } else {
            enumC68477Qu9Arr = new EnumC68477Qu9[0];
        }
        if (C52260KfA.LIZ) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = (i2 * 5 * 60000) + C52260KfA.LIZIZ;
                long LIZJ = C67257QaT.LIZJ(0);
                long currentTimeMillis = System.currentTimeMillis() + j;
                EnumC68477Qu9 enumC68477Qu9 = EnumC68477Qu9.CURRENT;
                arrayList.add(new C68476Qu8(C68472Qu4.LIZ(1, enumC68477Qu9.getIndex(), LIZJ), 1, LIZJ, enumC68477Qu9.getIndex(), currentTimeMillis - LIZJ, currentTimeMillis, 1410));
            }
        }
        int i3 = 0;
        do {
            for (EnumC68477Qu9 index : enumC68477Qu9Arr) {
                o.LJIIIZ(index, "index");
                long LIZJ2 = C67257QaT.LIZJ(i3);
                long LIZIZ = C67257QaT.LIZIZ(LIZJ2, index);
                long nextLong = C78841Uwv.LIZ(SystemClock.elapsedRealtime()).nextLong(index.getDuration() * 60000) - 900000;
                arrayList.add(new C68476Qu8(C68472Qu4.LIZ(1, index.getIndex(), LIZJ2), 1, LIZJ2, index.getIndex(), nextLong, LIZIZ + nextLong, 1410));
            }
            i3++;
        } while (i3 < 7);
        c68474Qu6.LJI().LJI(C123074sJ.LIZ);
        List<C68476Qu8> LIZ = c68474Qu6.LJI().LIZ();
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C68476Qu8 c68476Qu8 = (C68476Qu8) next;
            for (C68476Qu8 c68476Qu82 : LIZ) {
                if (o.LJ(c68476Qu82.LJLIL, c68476Qu8.LJLIL) && (!C52260KfA.LIZ || c68476Qu8.LJLJJL != EnumC68477Qu9.CURRENT.getIndex())) {
                    c68476Qu8.LJLJL = c68476Qu82.LJLJL;
                    c68476Qu8.LJLJJLL = c68476Qu82.LJLJJLL;
                    c68476Qu8.LJLL = true;
                    c68476Qu8.L("Already has:");
                }
            }
            if (c68476Qu8.LJLJL < currentTimeMillis2) {
                c68476Qu8.L("Expired:");
            } else {
                c68476Qu8.L("To insert:");
                arrayList2.add(next);
            }
        }
        List<C68476Qu8> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        c68474Qu6.LJI().LJII(1);
        c68474Qu6.LJI().LIZIZ(LLJILJILJ);
        C68468Qu0.LIZ(1);
        C68468Qu0.LIZIZ(LLJILJILJ);
        interfaceC73573Su9.onNext(1);
    }
}
