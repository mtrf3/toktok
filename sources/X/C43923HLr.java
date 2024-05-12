package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.services.story.SimplePublishModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.HLr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43923HLr extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends PublishModel>, C76800UCe> {
    public static final C43923HLr LJLIL = new C43923HLr();

    public C43923HLr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends PublishModel> list) {
        Iterator it;
        List<? extends PublishModel> publishModels = list;
        o.LJIIIZ(publishModels, "publishModels");
        if (!publishModels.isEmpty()) {
            C43921HLp c43921HLp = C43921HLp.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(publishModels, 10));
            Iterator<? extends PublishModel> it2 = publishModels.iterator();
            while (it2.hasNext()) {
                arrayList.add(SimplePublishModelKt.convert2SimplePublishModel(it2.next()));
            }
            EnumC221928nM enumC221928nM = EnumC221928nM.FAILED;
            String LIZLLL = C1DD.LIZLLL(R.string.rr0, "AppContextManager.getApp…on1_publish_error_failed)");
            C43924HLs c43924HLs = C43924HLs.LJLIL;
            c43921HLp.getClass();
            C43921HLp.LJIJJ(arrayList, enumC221928nM, LIZLLL, c43924HLs);
            C43921HLp.LJI = ((ArrayList) C43921HLp.LJIIIIZZ).size();
            C43921HLp.LJIJJLI(C43931HLz.LJLIL);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(publishModels, 10));
            Iterator<? extends PublishModel> it3 = publishModels.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().creationId);
            }
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(arrayList2, (List<VoucherInfoNew>) 401);
            java.util.Set LIZ = HM1.LIZ();
            if (LIZ != null && (it = LIZ.iterator()) != null) {
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((Boolean) aqS167S0100000_1.invoke(str)).booleanValue()) {
                        it.remove();
                        HM1.LIZIZ().erase(str);
                    }
                }
                HM1.LIZIZ().storeStringSet("key_unique_id_list", HM1.LIZ());
            }
        }
        return C76800UCe.LIZ;
    }
}
