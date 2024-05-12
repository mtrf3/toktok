package X;

import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFI implements IFetchEffectListener {
    public final /* synthetic */ IDownloadCallback LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public XFI(IDownloadCallback iDownloadCallback) {
        this.LIZ = iDownloadCallback;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect response = effect;
        o.LJIIIZ(response, "response");
        response.setEffectId("123456");
        this.LIZ.onSuccess(response);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.onFail(-10, "", e.getException());
    }
}
