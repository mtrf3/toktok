package X;

import Y.ARunnableS29S0200000_10;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.Response;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Otk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63356Otk implements InterfaceC63351Otf {
    public static C63356Otk LJLILLLLZI;
    public static final List<InterfaceC63362Otq> LJLJI = new ArrayList();
    public final HandlerC63347Otb LJLIL;

    public static C63356Otk LJIIIZ() {
        if (LJLILLLLZI == null) {
            synchronized (C63356Otk.class) {
                if (LJLILLLLZI == null) {
                    LJLILLLLZI = new C63356Otk();
                }
            }
        }
        return LJLILLLLZI;
    }

    public C63356Otk() {
        HandlerC63347Otb handlerC63347Otb = new HandlerC63347Otb(C16880lQ.LLJJJJ(), this);
        this.LJLIL = handlerC63347Otb;
        Iterator<InterfaceC63520OwO> it = C63521OwP.LIZIZ().LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ().LIZJ(handlerC63347Otb);
        }
    }

    public final void LJIIJ(Runnable runnable) {
        this.LJLIL.post(runnable);
    }

    @Override // X.InterfaceC63351Otf
    public final void handleMsg(Message message) {
        C63622Oy2 c63622Oy2;
        AbstractC63515OwJ abstractC63515OwJ;
        int i;
        Object obj = message.obj;
        if ((obj instanceof C63622Oy2) && (abstractC63515OwJ = (c63622Oy2 = (C63622Oy2) obj).LJLJLLL) != null) {
            if (!c63622Oy2.LJIIJ() && ((i = c63622Oy2.LJLL) == AbstractC63551Owt.LIZIZ || i == AbstractC63551Owt.LIZJ)) {
                C63308Osy.LJI().LIZIZ().LJI(c63622Oy2.LJFF(), c63622Oy2.LJLL);
            }
            abstractC63515OwJ.LJII(c63622Oy2, new ARunnableS29S0200000_10(c63622Oy2, abstractC63515OwJ, 64));
        }
    }

    public static void LJIIIIZZ(int i, int i2) {
        if (C63308Osy.LJI().LIZLLL().LJZI || !LIZIZ(1, i, i2, "pullRecentAndCmdMessage")) {
            return;
        }
        C63308Osy.LJI().LIZLLL().getClass();
        new C63301Osr(i, new C63204OrI(i, i2)).LJIILLIIL(i2);
    }

    public static void LIZ(java.util.Map map, InterfaceC86963bA interfaceC86963bA, java.util.Map map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            long j = 0L;
            if (map2 != null && map2.get(entry.getValue()) != null) {
                j = (Long) map2.get(entry.getValue());
            }
            C63460OvQ c63460OvQ = new C63460OvQ();
            c63460OvQ.LIZLLL = (String) entry.getValue();
            c63460OvQ.LJ = j;
            c63460OvQ.LJFF = (Long) entry.getKey();
            arrayList.add(c63460OvQ.build());
        }
        C63358Otm c63358Otm = new C63358Otm(interfaceC86963bA);
        C63471Ovb c63471Ovb = new C63471Ovb();
        C63685Oz3.LIZ(arrayList);
        c63471Ovb.LIZLLL = arrayList;
        BatchGetMessagesRequestBody build = c63471Ovb.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJLILLLLZI = build;
        c63358Otm.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
    }

    public static void LIZJ(C63622Oy2 c63622Oy2, List list, EnumC63359Otn enumC63359Otn) {
        long j;
        C63357Otl c63357Otl = new C63357Otl();
        int intValue = c63622Oy2.LJLJL.cmd.intValue();
        Long l = c63622Oy2.LJLJL.start_time_stamp;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Response response = c63622Oy2.LJLJL;
        String str = response.log_id;
        int intValue2 = response.inbox_type.intValue();
        StringBuilder LIZJ = b1.LIZJ("ClientBatchAckHandler", " clientBatchAckByUser, msgs.size() = ");
        ArrayList arrayList = (ArrayList) list;
        LIZJ.append(arrayList.size());
        LIZJ.append(", cmd = ");
        LIZJ.append(intValue);
        LIZJ.append(", start_time_stamp = ");
        C65232Piu.LIZLLL(LIZJ, j, ", log_id = ", str);
        LIZJ.append(", inbox_type = ");
        LIZJ.append(intValue2);
        LIZJ.append(", msgReportType = ");
        LIZJ.append(enumC63359Otn);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ));
        if (arrayList.size() > 0) {
            StringBuilder LIZJ2 = b1.LIZJ("ClientBatchAckHandler", ", lastMsgId = ");
            LIZJ2.append(((C109544Rq) U26.LIZIZ(arrayList, 1, list)).getMsgId());
            C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
        }
        try {
            EnumC48299IxT fromValue = EnumC48299IxT.fromValue(C48000Ise.LIZ(C63308Osy.LJI().LIZ));
            if (fromValue != null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C109544Rq c109544Rq = (C109544Rq) it.next();
                    String extValue = c109544Rq.getExtValue("s:is_ack_sampling");
                    if (!TextUtils.isEmpty(extValue) && extValue.equals("true")) {
                        StringBuilder LIZLLL = C1FL.LIZLLL("ClientBatchAckHandler", " clientBatchAckByUser, isAckSampling = ", extValue, ", content = ");
                        LIZLLL.append(c109544Rq.getContent());
                        C63322OtC.LJFF(X1D.LIZIZ(LIZLLL));
                        C63449OvF c63449OvF = new C63449OvF();
                        c63449OvF.LJ = Integer.valueOf(intValue);
                        c63449OvF.LJFF = fromValue;
                        c63449OvF.LIZLLL = Long.valueOf(j);
                        c63449OvF.LJI = str;
                        c63449OvF.LJIIIIZZ = Long.valueOf(c109544Rq.getMsgId());
                        c63449OvF.LJII = Long.valueOf(System.currentTimeMillis());
                        c63449OvF.LJIIIZ = enumC63359Otn;
                        arrayList2.add(c63449OvF.build());
                        arrayList3.add(c109544Rq);
                    }
                }
                if (V1B.LJJZZIII(arrayList2)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ClientBatchAckHandler");
                    LIZ.append(" clientBatchAckByUser no message isAckSampling");
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                    return;
                }
                C63473Ovd c63473Ovd = new C63473Ovd();
                C63685Oz3.LIZ(arrayList2);
                c63473Ovd.LIZLLL = arrayList2;
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LJLI = c63473Ovd.build();
                c63357Otl.LJIIJJI(intValue2, c89453Z8v.build(), null, enumC63359Otn, arrayList3);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ClientBatchAckHandler");
            LIZ2.append(" clientBatchAckByUser, e = ");
            LIZ2.append(e.toString());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZLLL(List list, int i, EnumC63359Otn enumC63359Otn) {
        if (list != null) {
            C63357Otl c63357Otl = new C63357Otl();
            StringBuilder LIZJ = b1.LIZJ("ClientBatchAckHandler", " clientBatchAckByLoadDB, msgs.size() = ");
            LIZJ.append(list.size());
            LIZJ.append(", inbox_type = ");
            LIZJ.append(i);
            LIZJ.append(", msgReportType = ");
            LIZJ.append(enumC63359Otn);
            C63322OtC.LJFF(X1D.LIZIZ(LIZJ));
            try {
                EnumC48299IxT fromValue = EnumC48299IxT.fromValue(C48000Ise.LIZ(C63308Osy.LJI().LIZ));
                if (fromValue != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C109544Rq c109544Rq = (C109544Rq) it.next();
                        String localExtValue = c109544Rq.getLocalExtValue("s:is_ack_sampling_show");
                        if (!TextUtils.isEmpty(localExtValue) && localExtValue.equals("true")) {
                            StringBuilder LIZLLL = C1FL.LIZLLL("ClientBatchAckHandler", " clientBatchAckByLoadDB, s:is_ack_sampling_show = ", localExtValue, ",content = ");
                            LIZLLL.append(c109544Rq.getContent());
                            C63322OtC.LJFF(X1D.LIZIZ(LIZLLL));
                            C63449OvF c63449OvF = new C63449OvF();
                            c63449OvF.LJ = 0;
                            c63449OvF.LJFF = fromValue;
                            c63449OvF.LIZLLL = 0L;
                            c63449OvF.LJI = "";
                            c63449OvF.LJIIIIZZ = Long.valueOf(c109544Rq.getMsgId());
                            c63449OvF.LJII = Long.valueOf(System.currentTimeMillis());
                            c63449OvF.LJIIIZ = enumC63359Otn;
                            arrayList.add(c63449OvF.build());
                            arrayList2.add(c109544Rq);
                        }
                    }
                    if (V1B.LJJZZIII(arrayList)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ClientBatchAckHandler");
                        LIZ.append(" clientBatchAckByLoadDB, no message isAckSamplingShow");
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                        return;
                    }
                    C63473Ovd c63473Ovd = new C63473Ovd();
                    C63685Oz3.LIZ(arrayList);
                    c63473Ovd.LIZLLL = arrayList;
                    C89453Z8v c89453Z8v = new C89453Z8v();
                    c89453Z8v.LJLI = c63473Ovd.build();
                    c63357Otl.LJIIJJI(i, c89453Z8v.build(), null, enumC63359Otn, arrayList2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ClientBatchAckHandler");
                LIZ2.append(" clientBatchAckByLoadDB, e = ");
                LIZ2.append(e.toString());
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static void LJI(int i, int i2, java.util.Map map) {
        if (C63305Osv.LIZIZ().LIZIZ) {
            C63322OtC.LIZLLL("IMHandlerCenter getMessageByLinkMode migrating now");
            return;
        }
        int LIZJ = C63305Osv.LIZIZ().LIZJ();
        if (LIZJ == 0) {
            LJII(i, i2, map);
            return;
        }
        if (LIZJ == 1 && !C63308Osy.LJI().LIZLLL().LJZI) {
            LJIIIIZZ(i, i2);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMHandlerCenter getMessageByLinkMode invalid mode:");
        LIZ.append(LIZJ);
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
    }

    public static void LJII(int i, int i2, java.util.Map map) {
        if (!LIZIZ(0, i, i2, "getMessageByUser")) {
            return;
        }
        C63281OsX c63281OsX = new C63281OsX(i, map);
        if (i2 != 9 && C63305Osv.LIZIZ().LIZJ() != 0) {
            C63272OsO.LIZJ(3, i2);
        }
        c63281OsX.LJIIJJI = SystemClock.uptimeMillis();
        C63291Osh LIZ = C63291Osh.LIZ();
        int i3 = c63281OsX.LIZJ;
        LIZ.getClass();
        c63281OsX.LJIILJJIL(i2, C63291Osh.LIZLLL(i3));
    }

    public static boolean LIZIZ(int i, int i2, int i3, String str) {
        boolean z = C63305Osv.LIZIZ().LIZIZ;
        int LIZJ = C63305Osv.LIZIZ().LIZJ();
        if (i3 != 9) {
            if (z || i != LIZJ) {
                StringBuilder LJ = AnonymousClass028.LJ("IMHandlerCenter ", str, " illegal state, inbox:", i2, ", reason:");
                LJ.append(i3);
                LJ.append(", isMigrating:");
                LJ.append(z);
                LJ.append(", linkMode:");
                LJ.append(LIZJ);
                C63322OtC.LIZLLL(X1D.LIZIZ(LJ));
                return false;
            }
            return true;
        }
        return true;
    }

    public static void LJ(int i, String str, long j, int i2, InterfaceC86963bA interfaceC86963bA) {
        new C63217OrV(interfaceC86963bA).LJIILIIL(i, i2, j, System.currentTimeMillis(), str, true);
    }

    public static void LJFF(long j, EnumC63479Ovj enumC63479Ovj, EnumC96113pv[] enumC96113pvArr, Boolean bool, C86943b8 c86943b8) {
        C63280OsW c63280OsW = new C63280OsW(c86943b8);
        C63448OvE c63448OvE = new C63448OvE();
        c63448OvE.LJFF = EnumC63506OwA.GROUP_CHAT;
        c63448OvE.LJ = Long.valueOf(j);
        if (enumC63479Ovj == null) {
            enumC63479Ovj = EnumC63479Ovj.JOIN_TIME;
        }
        c63448OvE.LIZLLL = enumC63479Ovj;
        if (enumC96113pvArr.length > 0) {
            if (enumC96113pvArr.length == 1) {
                c63448OvE.LJII = Integer.valueOf(enumC96113pvArr[0].getValue());
            } else {
                ArrayList arrayList = new ArrayList(enumC96113pvArr.length);
                for (EnumC96113pv enumC96113pv : enumC96113pvArr) {
                    arrayList.add(Integer.valueOf(enumC96113pv.getValue()));
                }
                C63685Oz3.LIZ(arrayList);
                c63448OvE.LJIIL = arrayList;
            }
        }
        if (bool != null) {
            c63448OvE.LJIIIZ = bool;
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJLL = c63448OvE.build();
        c63280OsW.LJIIJJI(c63280OsW.LIZJ, c89453Z8v.build(), null, new Object[0]);
    }
}
