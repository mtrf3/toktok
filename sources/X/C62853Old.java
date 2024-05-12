package X;

import com.ss.android.ugc.aweme.im.service.experiment.IMTemplateConfigurationSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Old, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62853Old implements C4XG {
    public final String LIZ;
    public final long LIZIZ;
    public final C31F LIZJ;
    public final AbstractC73946T0k LIZLLL;
    public final InterfaceC65784Pro<Integer> LJ;
    public final C61902ORe LJFF;
    public final C61902ORe LJI;
    public final C62822Ol8 LJII;
    public final C73893SzJ<Integer> LJIIIIZZ;
    public final AtomicBoolean LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public C73411SrX LJIIJJI;
    public volatile C73411SrX LJIIL;

    @Override // X.C4XG
    public final void LIZIZ() {
        C73411SrX c73411SrX = this.LJIIJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJIIL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        C61902ORe c61902ORe = this.LJFF;
        c61902ORe.LIZIZ.clear();
        c61902ORe.LIZJ.clear();
        if (C33934DTm.LIZ) {
            C61902ORe LIZLLL = LIZLLL();
            LIZLLL.LIZIZ.clear();
            LIZLLL.LIZJ.clear();
        }
    }

    public final C61902ORe LIZLLL() {
        return (C61902ORe) this.LJII.getValue();
    }

    public final void LJFF() {
        C73411SrX c73411SrX = this.LJIIJJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            return;
        }
        this.LJIIJJI = C73542Ste.LJIIIIZZ(this.LJIIIIZZ.LJJJJLI(this.LIZIZ, TimeUnit.MILLISECONDS).LJJJ(this.LIZLLL), C62854Ole.LJLIL, null, new C62851Olb(this), 2);
    }

    public C62853Old(String conversationID) {
        IMTemplateConfigurationSetting iMTemplateConfigurationSetting = IMTemplateConfigurationSetting.LIZ;
        iMTemplateConfigurationSetting.getClass();
        IMTemplateConfigurationSetting.TemplateConfigurationModel templateConfigurationModel = IMTemplateConfigurationSetting.LIZIZ;
        int i = templateConfigurationModel.refreshPageSize;
        iMTemplateConfigurationSetting.getClass();
        long j = templateConfigurationModel.refreshInterval;
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
        C73957T0v c73957T0v = new C73957T0v();
        C73152tz networkTimestamp = C73152tz.LJLIL;
        o.LJIIIZ(conversationID, "conversationID");
        o.LJIIIZ(networkTimestamp, "networkTimestamp");
        this.LIZ = conversationID;
        this.LIZIZ = j;
        this.LIZJ = c63164Oqe;
        this.LIZLLL = c73957T0v;
        this.LJ = networkTimestamp;
        this.LJFF = new C61902ORe(i);
        this.LJI = new C61902ORe(i);
        this.LJII = C221108m2.LIZIZ(new C62859Olj(i));
        this.LJIIIIZZ = new C73893SzJ<>();
        this.LJIIIZ = new AtomicBoolean();
        this.LJIIJ = new AtomicBoolean();
        LJFF();
    }

    @Override // X.C4XG
    public final void LIZ(List<? extends C109544Rq> msgList) {
        Integer num;
        o.LJIIIZ(msgList, "msgList");
        if (C33934DTm.LIZ) {
            int intValue = this.LJ.invoke().intValue();
            C115534g9 LJJJJ = OJ4.LJJJJ(OJ4.LJJJJ(OJ4.LJJJJ(ORZ.LJLIIIL(msgList), C95033oB.LJLIL), C62856Olg.LJLIL), C62858Oli.LJLIL);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C115524g8 c115524g8 = new C115524g8(LJJJJ);
            while (c115524g8.hasNext()) {
                Object next = c115524g8.next();
                if (o.LJ(((C109544Rq) next).getLocalExt().get("s:msg_error_code"), "100022")) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            OSZ osz = new OSZ(arrayList, arrayList2);
            List list = (List) osz.getFirst();
            Object second = osz.getSecond();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                C109544Rq c109544Rq = (C109544Rq) obj;
                String str = c109544Rq.getLocalExt().get("a:refreshed_res_ttl");
                if (str != null) {
                    num = C38350F3i.LJJIL(str);
                } else {
                    num = null;
                }
                if (c109544Rq.getMsgType() == 1805 || c109544Rq.getMsgType() == 1809) {
                    if (num == null || num.intValue() < intValue) {
                        arrayList3.add(obj);
                    }
                }
            }
            OSZ osz2 = new OSZ(arrayList3, second);
            List<? extends C109544Rq> list2 = (List) osz2.getFirst();
            List<? extends C109544Rq> list3 = (List) osz2.getSecond();
            LIZLLL().LIZJ(list2);
            this.LJI.LIZJ(list3);
        } else {
            this.LJI.LIZJ(C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(OJ4.LJJJJ(OJ4.LJJJJ(ORZ.LJLIIIL(msgList), C95023oA.LJLIL), C62855Olf.LJLIL), C62857Olh.LJLIL))));
        }
        LJFF();
        this.LJIIIIZZ.onNext(1);
    }

    @Override // X.C4XG
    public final void LIZJ(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        if (C33934DTm.LIZ && o.LJ(msg.getLocalExt().get("s:msg_error_code"), "100022")) {
            LIZLLL().LIZIZ(msg);
        } else {
            this.LJFF.LIZIZ(msg);
        }
        LJFF();
        this.LJIIIIZZ.onNext(1);
    }

    public static void LJ(List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C109544Rq c109544Rq = (C109544Rq) it.next();
            o.LJIIIZ(c109544Rq, "<this>");
            c109544Rq.putLocalCache(505, Boolean.FALSE);
        }
        if (z || list.isEmpty()) {
            return;
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LJIILJJIL(list);
    }
}
