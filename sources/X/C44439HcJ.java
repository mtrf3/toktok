package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import kotlin.jvm.internal.o;

/* renamed from: X.HcJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44439HcJ implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C44436HcG LIZ;
    public final /* synthetic */ StringBuilder LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        Exception exception = e.getException();
        if (exception != null) {
            C16880lQ.LLLLIIL(exception);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        if (this.LIZ.LJIIIZ(response, this.LIZIZ)) {
            return;
        }
        I0N fetchEffect = this.LIZ.LIZJ;
        String effectId = ((EffectTemplate) ORZ.LJLLJ(response.getData())).getEffectId();
        java.util.Map<String, String> map = this.LIZJ;
        C44442HcM c44442HcM = new C44442HcM(this.LIZ, response, this.LIZIZ);
        o.LJIIIZ(fetchEffect, "$this$fetchEffect");
        o.LJIIIZ(effectId, "effectId");
        fetchEffect.LLLLL().LJ(C47261Igj.LJJIJ(effectId), true, map, c44442HcM);
    }

    public C44439HcJ(C44436HcG c44436HcG, StringBuilder sb, java.util.Map<String, String> map) {
        this.LIZ = c44436HcG;
        this.LIZIZ = sb;
        this.LIZJ = map;
    }
}
