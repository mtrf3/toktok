package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QV7 implements QVG<QVX> {
    @Override // X.QVG
    public final boolean LIZIZ(QVX obj) {
        o.LJIIJ(obj, "obj");
        if (obj == QVX.Sync) {
            return true;
        }
        return false;
    }

    @Override // X.QVG
    public final void LIZ(C67098QVa c67098QVa, List<QVZ> list) {
        List<QV9> arrayList;
        String str;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator<QVZ> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().topic_type);
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (QVZ qvz : list) {
            QVZ qvz2 = qvz;
            if (qvz2.topic_type != EnumC67115QVr.CustomTopic || qvz2.topic_status == EnumC67116QVs.Active) {
                arrayList3.add(qvz);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            QVZ qvz3 = (QVZ) it2.next();
            arrayList4.add(new OSZ(String.valueOf(qvz3.sync_id.longValue()), qvz3));
        }
        java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList4);
        java.util.Set keySet = LJJLIIIJLJLI.keySet();
        try {
            arrayList = ((InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class)).LJJII(new QUJ(c67098QVa.did, c67098QVa.uid));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList5 = new ArrayList();
        for (QV9 qv9 : arrayList) {
            if (LLJJ.contains(qv9.LIZLLL)) {
                arrayList5.add(qv9);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!keySet.contains(((QV9) next).LIZ)) {
                arrayList6.add(next);
            }
        }
        ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            arrayList7.add(((QV9) it4.next()).LIZ);
        }
        ArrayList arrayList8 = new ArrayList(C32I.LJJL(arrayList, 10));
        for (QV9 qv92 : arrayList) {
            arrayList8.add(new OSZ(qv92.LIZ, qv92));
        }
        java.util.Map LJJLIIIJLJLI2 = C113554cx.LJJLIIIJLJLI(arrayList8);
        ArrayList arrayList9 = new ArrayList();
        for (Map.Entry entry : LJJLIIIJLJLI.entrySet()) {
            QV9 qv93 = (QV9) LJJLIIIJLJLI2.get(entry.getKey());
            if (qv93 == null) {
                qv93 = new QV9();
            }
            QVZ qvz4 = (QVZ) entry.getValue();
            if (qvz4 != null) {
                qv93.LIZ = String.valueOf(qvz4.sync_id.longValue());
                qv93.LIZIZ = c67098QVa.did;
                QW9 qw9 = qvz4.bucket;
                if (qw9 == QW9.Device) {
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str = c67098QVa.uid;
                }
                qv93.LIZJ = str;
                qv93.LJ = qw9;
                qv93.LIZLLL = qvz4.topic_type;
                if (qvz4.ref_cursor.longValue() > qv93.LJI) {
                    Long l = qvz4.ref_cursor;
                    o.LJFF(l, "topic.ref_cursor");
                    qv93.LJI = l.longValue();
                }
                arrayList9.add(qv93);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (QVZ qvz5 : LJJLIIIJLJLI.values()) {
            List<C67102QVe> list2 = qvz5.packets;
            if (list2 != null) {
                for (C67102QVe c67102QVe : list2) {
                    if (c67102QVe != null) {
                        QVB qvb = new QVB();
                        Integer num = c67102QVe.payload.business;
                        o.LJFF(num, "pkg.payload.business");
                        qvb.LIZ = num.intValue();
                        qvb.LIZJ = qvz5.bucket;
                        qvb.LIZIZ = c67102QVe.payload.consume_type;
                        arrayList10.add(qvb);
                    }
                }
            }
        }
        OSJ osj = new OSJ(arrayList7, arrayList9, arrayList10);
        try {
            ((InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class)).LJJLIIIIJ((List) osj.getSecond(), (List) osj.getFirst(), (List) osj.getThird());
            ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJJJI(false);
            ((QU3) QPG.LIZ(QU3.class)).LJIILL();
            ((InterfaceC67064QTs) QPG.LIZ(InterfaceC67064QTs.class)).LJJJJJ();
        } catch (Exception e2) {
            QUU.LIZJ().ensureNotReachHere(e2, "execute sql failed when bindUploadSyncId");
            C16880lQ.LLLLIIL(e2);
        }
    }
}
