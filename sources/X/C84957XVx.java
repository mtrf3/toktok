package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* renamed from: X.XVx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84957XVx implements IFetchEffectListByIdsListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LIZIZ;
    public final /* synthetic */ IAVEffectService LIZJ;
    public final /* synthetic */ Context LIZLLL;
    public final /* synthetic */ java.util.Map<String, String> LJ;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LJFF;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        C84952XVs.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LIZ, this.LJ, this.LJFF, null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        Effect effect;
        List<Effect> data;
        EffectListResponse effectListResponse2 = effectListResponse;
        String str = this.LIZ;
        if (str != null && effectListResponse2 != null) {
            C44027HPr.LIZ.put(str, effectListResponse2);
        }
        AbstractC73851Syd<C84768XOq> abstractC73851Syd = this.LIZIZ;
        IAVEffectService iAVEffectService = this.LIZJ;
        Context context = this.LIZLLL;
        String str2 = this.LIZ;
        java.util.Map<String, String> map = this.LJ;
        InterfaceC73573Su9<C84767XOp> interfaceC73573Su9 = this.LJFF;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
            effect = (Effect) ORZ.LJLLLL(data);
        } else {
            effect = null;
        }
        C84952XVs.LIZJ(abstractC73851Syd, iAVEffectService, context, str2, map, interfaceC73573Su9, effect);
    }

    public C84957XVx(Context context, IAVEffectService iAVEffectService, InterfaceC73573Su9 interfaceC73573Su9, AbstractC73851Syd abstractC73851Syd, String str, java.util.Map map) {
        this.LIZ = str;
        this.LIZIZ = abstractC73851Syd;
        this.LIZJ = iAVEffectService;
        this.LIZLLL = context;
        this.LJ = map;
        this.LJFF = interfaceC73573Su9;
    }
}
