package X;

import Y.IDComparatorS43S0000000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* loaded from: classes16.dex */
public final class Y6X extends Y6Y {
    public int LIZ = -1;

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "publish_log";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        List list;
        String str;
        String LIZIZ;
        if (this.LIZ <= 0) {
            this.LIZ = Q7K.LIZIZ("publish_log_max_length", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        }
        if (this.LIZ <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Null maxTextLength:");
            LIZ.append(this.LIZ);
            return X1D.LIZIZ(LIZ);
        }
        Y6Z LJI = LJI();
        List<C86832Y6a> list2 = LJI.LIZ;
        List LLILZ = ORZ.LLILZ(4, ORZ.LLIIIZ(LJI.LIZLLL, LJI.LIZJ));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILZ, 10));
        int i = 0;
        for (Object obj : LLILZ) {
            int i2 = i + 1;
            if (i >= 0) {
                C86832Y6a c86832Y6a = (C86832Y6a) obj;
                Iterator<PublishBehaviorModel> it = c86832Y6a.LIZ.iterator();
                while (it.hasNext()) {
                    it.next().idIndex = i;
                }
                arrayList.add(c86832Y6a);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((C86832Y6a) it2.next()).LIZ, arrayList2);
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        if (this.LIZ > 500) {
            list = new ArrayList();
            Iterator<C86832Y6a> it3 = list2.iterator();
            while (it3.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it3.next().LIZ, list);
            }
        } else {
            list = C61878OQg.INSTANCE;
        }
        ((ArrayList) LLJILJILJ).addAll(list);
        List LLILII = ORZ.LLILII(new IDComparatorS43S0000000_15(7), LLJILJILJ);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(LLILII, 10));
        Iterator it4 = LLILII.iterator();
        while (true) {
            str = "";
            if (!it4.hasNext()) {
                break;
            }
            PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) it4.next();
            if (o.LJJJJJL(publishBehaviorModel.code)) {
                LIZIZ = "";
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(' ');
                LIZ2.append(publishBehaviorModel.code);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            if (!o.LJJJJJL(publishBehaviorModel.info)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(' ');
                LIZ3.append(publishBehaviorModel.info);
                str = X1D.LIZIZ(LIZ3);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(publishBehaviorModel.getSimpleTime());
            LIZ4.append(' ');
            LIZ4.append(publishBehaviorModel.idIndex);
            LIZ4.append(' ');
            LIZ4.append(publishBehaviorModel.stage);
            LIZ4.append(' ');
            LIZ4.append(publishBehaviorModel.type.getSimpleName());
            LIZ4.append(LIZIZ);
            LIZ4.append(str);
            arrayList3.add(X1D.LIZIZ(LIZ4));
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            str = C00F.LIZIZ(str, '|', (String) it5.next());
        }
        return C40689Fy1.LLIIII(this.LIZ, str);
    }
}
