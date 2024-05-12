package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPL implements IFetchPanelInfoListener {
    public final /* synthetic */ TPK LIZ;

    public TPL(TPK tpk) {
        this.LIZ = tpk;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC73573Su9 emitter = this.LIZ.LIZIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        this.LIZ.LIZIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        InterfaceC73573Su9 emitter = this.LIZ.LIZIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        if (panelInfoModel != null) {
            this.LIZ.LIZIZ.onNext(panelInfoModel);
            this.LIZ.LIZIZ.onComplete();
        } else {
            this.LIZ.LIZIZ.onError(new IllegalArgumentException("sticker panel fetching failed"));
        }
    }
}
