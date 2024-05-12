package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class GVG extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GVG(ActivityC45651qj activityC45651qj, boolean z, InterfaceC65784Pro<Boolean> interfaceC65784Pro, boolean z2) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        GVH gvh;
        C42041Gej c42041Gej;
        String LJIILL;
        boolean booleanValue = bool.booleanValue();
        ActivityC45651qj activityC45651qj = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJI;
        boolean z2 = this.LJLJJI;
        List<PublishModel> LJIIJ = GUH.LJIIJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
        Iterator it = ((ArrayList) LJIIJ).iterator();
        while (it.hasNext()) {
            PublishModel publishModel = (PublishModel) it.next();
            if (publishModel == null) {
                LJIILL = "";
            } else {
                LJIILL = GUH.LJIILL(publishModel);
            }
            arrayList.add(LJIILL);
        }
        List<PublishModel> LJIILIIL = GUH.LJIILIIL();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIILIIL, 10));
        Iterator it2 = ((ArrayList) LJIILIIL).iterator();
        while (it2.hasNext()) {
            arrayList2.add(GUH.LJIILL((PublishModel) it2.next()));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            GVH gvh2 = C41620GVc.LJI.get(activityC45651qj);
            if (gvh2 != null) {
                gvh2.LIZ(Boolean.valueOf(z), str);
            }
        }
        if (booleanValue) {
            if (!interfaceC65784Pro.invoke().booleanValue() || GVE.LIZ()) {
                C41620GVc.LJ(z2);
            } else {
                C42041Gej c42041Gej2 = C41620GVc.LIZLLL;
                if (c42041Gej2 != null && c42041Gej2.getParent() != null && (c42041Gej = C41620GVc.LIZLLL) != null) {
                    c42041Gej.LIZJ();
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                it4.next();
                GVH gvh3 = C41620GVc.LJI.get(activityC45651qj);
                if (gvh3 != null) {
                    gvh3.LIZJ();
                }
            }
            if ((!arrayList2.isEmpty()) && (gvh = C41620GVc.LJI.get(activityC45651qj)) != null) {
                gvh.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
