package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class MDH extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MDH(int i, int i2, boolean z) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Integer num;
        List<MusNotice> list;
        List<MusNotice> list2;
        OSZ osz = new OSZ(Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI));
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateUnsubscribeStatus thread = ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        LIZ.append(", key = ");
        LIZ.append(osz);
        LIZ.append(", isUnsubscribe = ");
        LIZ.append(this.LJLJI);
        LIZ.append(", combineGroupDataMap = ");
        java.util.Map<OSZ<Integer, Integer>, List<MusNotice>> map = MDJ.LIZIZ;
        Integer num2 = null;
        if (map != null) {
            num = Integer.valueOf(map.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", singleGroupDataMap = ");
        java.util.Map<OSZ<Integer, Integer>, List<MusNotice>> map2 = MDJ.LIZJ;
        if (map2 != null) {
            num2 = Integer.valueOf(map2.size());
        }
        LIZ.append(num2);
        C221018lt.LJFF("SNUnsubscribeDataHelper", X1D.LIZIZ(LIZ));
        java.util.Map<OSZ<Integer, Integer>, List<MusNotice>> map3 = MDJ.LIZIZ;
        if (map3 != null && (list2 = map3.get(osz)) != null) {
            boolean z = this.LJLJI;
            Iterator<MusNotice> it = list2.iterator();
            while (it.hasNext()) {
                it.next().updateUnsubscribeStatus(Boolean.valueOf(z));
            }
        }
        java.util.Map<OSZ<Integer, Integer>, List<MusNotice>> map4 = MDJ.LIZJ;
        if (map4 != null && (list = map4.get(osz)) != null) {
            boolean z2 = this.LJLJI;
            Iterator<MusNotice> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().updateUnsubscribeStatus(Boolean.valueOf(z2));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateUnsubscribeStatus handle time ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ2.append("ms");
        C221018lt.LJFF("SNUnsubscribeDataHelper", X1D.LIZIZ(LIZ2));
        MS5.LJ(MDI.LJLIL);
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
