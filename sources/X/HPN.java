package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPN implements IFetchEffectListener {
    public final /* synthetic */ StickerDownloadConfig LIZ;
    public final /* synthetic */ HPQ LIZIZ;
    public final /* synthetic */ Context LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        InterfaceC65784Pro<C76800UCe> onSuccess = this.LIZ.getOnSuccess();
        if (onSuccess != null) {
            onSuccess.invoke();
        }
        MvThemeData mvThemeData = new MvThemeData();
        mvThemeData.LJIILJJIL(effect2);
        this.LIZIZ.LJFF(C45804HyK.LJIJJ(this.LIZJ), mvThemeData);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC88472Yns<Integer, C76800UCe> onFail = this.LIZ.getOnFail();
        if (onFail != null) {
            onFail.invoke(Integer.valueOf(e.getErrorCode()));
        }
    }

    public HPN(Context context, HPQ hpq, StickerDownloadConfig stickerDownloadConfig) {
        this.LIZ = stickerDownloadConfig;
        this.LIZIZ = hpq;
        this.LIZJ = context;
    }
}
