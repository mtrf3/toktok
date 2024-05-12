package X;

import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HPc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44012HPc implements IFetchEffectListener {
    public final /* synthetic */ StickerDownloadConfig LIZ;
    public final /* synthetic */ IFetchEffectListener LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.getOnSuccess();
        this.LIZIZ.onSuccess(effect);
    }

    public C44012HPc(StickerDownloadConfig stickerDownloadConfig, IFetchEffectListener iFetchEffectListener) {
        this.LIZ = stickerDownloadConfig;
        this.LIZIZ = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC88472Yns<Integer, C76800UCe> onFail = this.LIZ.getOnFail();
        if (onFail != null) {
            onFail.invoke(Integer.valueOf(e.getErrorCode()));
        }
        this.LIZIZ.onFail(effect, e);
    }
}
