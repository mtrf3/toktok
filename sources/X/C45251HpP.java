package X;

import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HpP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45251HpP implements IFetchEffectListByIdsListener {
    public final /* synthetic */ EpResourceCallback LIZ;
    public final /* synthetic */ C45250HpO LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        EpResourceCallback epResourceCallback = this.LIZ;
        if (epResourceCallback != null) {
            epResourceCallback.onFailure(e.getErrorCode(), e.getMsg());
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        Effect effect;
        C76800UCe c76800UCe;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (Effect) ORZ.LJLLLLLL(0, data)) != null) {
            C45250HpO c45250HpO = this.LIZIZ;
            String str = this.LIZJ;
            String str2 = this.LIZLLL;
            EpResourceCallback epResourceCallback = this.LIZ;
            if (((InterfaceC84498XEg) c45250HpO.LIZIZ.getValue()).LJJIJLIJ(effect)) {
                c45250HpO.LIZ.LIZIZ(effect, str, str2);
                if (epResourceCallback != null) {
                    epResourceCallback.onSuccess(effect.getUnzipPath());
                    c76800UCe = C76800UCe.LIZ;
                }
            } else {
                ((InterfaceC84498XEg) c45250HpO.LIZIZ.getValue()).fetchEffect(effect, new C45252HpQ(c45250HpO, str, str2, effect, epResourceCallback));
                c76800UCe = C76800UCe.LIZ;
            }
            if (c76800UCe != null) {
                return;
            }
        }
        EpResourceCallback epResourceCallback2 = this.LIZ;
        if (epResourceCallback2 != null) {
            epResourceCallback2.onFailure(10003, "");
        }
    }

    public C45251HpP(EpResourceCallback epResourceCallback, C45250HpO c45250HpO, String str, String str2) {
        this.LIZ = epResourceCallback;
        this.LIZIZ = c45250HpO;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
