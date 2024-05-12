package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HcM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44442HcM implements IFetchEffectListListener {
    public final /* synthetic */ C44436HcG LIZ;
    public final /* synthetic */ EffectListResponse LIZIZ;
    public final /* synthetic */ StringBuilder LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> effectList) {
        o.LJIIIZ(effectList, "effectList");
        this.LIZ.LJIIJJI(this.LIZIZ, this.LIZJ);
    }

    public C44442HcM(C44436HcG c44436HcG, EffectListResponse effectListResponse, StringBuilder sb) {
        this.LIZ = c44436HcG;
        this.LIZIZ = effectListResponse;
        this.LIZJ = sb;
    }
}
