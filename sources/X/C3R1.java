package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.contact.experiment.IMContactSetting;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3R1, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3R1 extends TAZ implements InterfaceC88471Ynr<C3RY<IMContact>, InterfaceC67352kd<? super Boolean>, Object> {
    public C3R1(Object obj) {
        super(2, obj, C3R0.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3RY<IMContact> c3ry, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        List arrayList;
        C3RY<IMContact> c3ry2 = c3ry;
        C3R0 c3r0 = (C3R0) this.receiver;
        c3r0.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("intercept begin list: ");
        DIL.LIZIZ(c3ry2.LIZIZ, LIZ, " map: ");
        LIZ.append(c3ry2.LIZ.size());
        C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ));
        c3ry2.LIZ.put(c3ry2.LIZJ, c3ry2.LIZIZ);
        c3r0.LJLLJ.addAll(AbstractC82553Lv.LJII(c3ry2.LIZIZ));
        boolean z2 = true;
        if ((!C3QM.LIZ() || !IMContactSetting.LIZ().cancelRequestWhenOpenSharePanel) && c3r0.LJLZ.compareAndSet(false, true)) {
            C3R9 c3r9 = c3r0.LJLIL;
            String str = c3r9.LJIILIIL;
            String str2 = c3r9.LJIILJJIL;
            if (C3UE.LIZ() && C3UE.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            C3FK.LJFF(str, str2, z, null, false, 48);
        }
        C3RG<IMContact> c3rg = c3ry2.LIZJ;
        if (c3rg == c3r0.LJLJL) {
            c3r0.LJLL = AbstractC82553Lv.LJII(c3ry2.LIZIZ);
            List<String> list = c3r0.LJLLILLLL;
            List<String> list2 = c3r0.LJLL;
            if (list2 != null) {
                arrayList = ORZ.LLJILJILJ(list2);
            } else {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
        } else if (o.LJ(c3rg, c3r0.LJZ.getValue())) {
            C34B.LJI("SharePanelRelationModel", "intercept maf finish");
            if (C3UE.LIZ()) {
                ArrayList arrayList2 = new ArrayList();
                int size = c3ry2.LIZIZ.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(c3ry2.LIZIZ, i);
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    IMUser iMUser = (IMUser) obj;
                    if (iMUser.getShareStatus() == 1) {
                        arrayList2.add(iMUser);
                    }
                }
                c3ry2.LIZ.put(c3ry2.LIZJ, arrayList2);
            }
        }
        List<IMContact> list3 = c3ry2.LIZIZ;
        Iterator<IMContact> it = list3.subList(0, Math.min(list3.size(), 5)).iterator();
        while (it.hasNext()) {
            it.next().setIsRecentTop5Contact(1);
        }
        C34B.LJI("SharePanelRelationModel", "intercept finish");
        if (UC0.LJJJLIIL(c3ry2.LIZ) > c3r0.LJLLI) {
            z2 = C3UE.LIZ();
        }
        return Boolean.valueOf(z2);
    }
}
