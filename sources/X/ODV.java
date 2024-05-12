package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class ODV extends OE9 {
    public final /* synthetic */ OptionCheckUpdateParams LIZ;
    public final /* synthetic */ AbstractC61537ODd LIZIZ;

    public ODV(OptionCheckUpdateParams optionCheckUpdateParams, AbstractC61537ODd abstractC61537ODd) {
        this.LIZ = optionCheckUpdateParams;
        this.LIZIZ = abstractC61537ODd;
    }

    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        List<UpdatePackage> list = (List) c61546ODm.LJFF(OD5.class);
        java.util.Map<String, List<Pair<String, Long>>> map = (java.util.Map) c61546ODm.LIZIZ(OD5.class);
        HashMap hashMap = new HashMap();
        for (UpdatePackage updatePackage : list) {
            String accessKey = updatePackage.getAccessKey();
            List list2 = (List) hashMap.get(accessKey);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.add(updatePackage);
            hashMap.put(accessKey, list2);
        }
        OptionCheckUpdateParams optionCheckUpdateParams = this.LIZ;
        if (optionCheckUpdateParams != null && !TextUtils.isEmpty(optionCheckUpdateParams.getFrom())) {
            C61550ODq c61550ODq = new C61550ODq(this.LIZ.getFrom());
            c61546ODm.LIZLLL(c61550ODq, "update_operation");
            this.LIZIZ.LJ(hashMap, c61550ODq);
            return;
        }
        this.LIZIZ.LJFF(map, hashMap);
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        java.util.Map map = (java.util.Map) c61546ODm.LIZIZ(OD5.class);
        if (th instanceof C36356EOq) {
            this.LIZIZ.LIZJ(((C36356EOq) th).getCode(), th, map);
        } else {
            this.LIZIZ.LIZLLL(th, map);
        }
    }
}
