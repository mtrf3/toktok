package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPO implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC82548WaW LIZ;
    public final /* synthetic */ StickerDownloadConfig LIZIZ;
    public final /* synthetic */ HPQ LIZJ;
    public final /* synthetic */ Context LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        ((MvThemeData) this.LIZ).LJIILJJIL(effect2);
        InterfaceC65784Pro<C76800UCe> onSuccess = this.LIZIZ.getOnSuccess();
        if (onSuccess != null) {
            onSuccess.invoke();
        }
        this.LIZJ.LJFF(C45804HyK.LJIJJ(this.LIZLLL), this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC88472Yns<Integer, C76800UCe> onFail = this.LIZIZ.getOnFail();
        if (onFail != null) {
            onFail.invoke(1);
        }
    }

    public HPO(InterfaceC82548WaW interfaceC82548WaW, StickerDownloadConfig stickerDownloadConfig, HPQ hpq, Context context) {
        this.LIZ = interfaceC82548WaW;
        this.LIZIZ = stickerDownloadConfig;
        this.LIZJ = hpq;
        this.LIZLLL = context;
    }
}
