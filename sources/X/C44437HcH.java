package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HcH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44437HcH implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C44436HcG LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Effect, C76800UCe> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZIZ.invoke(null);
        Exception exception = e.getException();
        if (exception != null) {
            C16880lQ.LLLLIIL(exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        this.LIZ.LIZJ.Lv().LIZIZ(response.getUrlPrefix());
        List LLJILJILJ = ORZ.LLJILJILJ(response.getData());
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (!arrayList.isEmpty() && !TextUtils.equals(this.LIZ.LJIIJ(), "qrcode") && V3N.LJIILJJIL((Effect) ORZ.LJLLJ(LLJILJILJ)) && !ETV.LIZ((Effect) ORZ.LJLLJ(LLJILJILJ))) {
            ListProtector.remove(LLJILJILJ, 0);
        }
        if (arrayList.isEmpty()) {
            this.LIZIZ.invoke(null);
            return;
        }
        if (C32151Nz.LJJIIZI(response.getCollection())) {
            C82398WVm.LJFF(this.LIZ.LIZJ, response.getCollection());
        }
        Iterator it = arrayList.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            String parentId = ((EffectTemplate) it.next()).getParentId();
            if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                it.remove();
            }
        }
        C82398WVm.LJ(this.LIZ.LIZJ, LLJILJILJ, true, false, null, false, null, 0, 16376);
        Effect effect = (Effect) ORZ.LJLLLL(LLJILJILJ);
        if (effect != null) {
            this.LIZ.LJIIL(effect);
        }
        this.LIZIZ.invoke(ORZ.LJLLLL(LLJILJILJ));
    }

    public C44437HcH(C44436HcG c44436HcG, AqS173S0100000_7 aqS173S0100000_7) {
        this.LIZ = c44436HcG;
        this.LIZIZ = aqS173S0100000_7;
    }
}
