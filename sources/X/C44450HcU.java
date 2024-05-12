package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HcU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44450HcU implements IEffectDownloadProgressListener {
    public final /* synthetic */ C45928I0u LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C44450HcU(C45928I0u c45928I0u) {
        this.LIZ = c45928I0u;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.LJLJLJ().dismiss();
        if (effect != null) {
            C45928I0u c45928I0u = this.LIZ;
            if (!c45928I0u.LLJILLL) {
                c45928I0u.LLIZ.showCancelAfterPinProp = Boolean.TRUE;
                FaceStickerBean.sCurPropSource = "qa_prop";
                c45928I0u.getStickerApiComponent().Sl(true, true);
                C82398WVm.LJ(c45928I0u.getStickerApiComponent(), C47261Igj.LJJIJ(effect), true, true, null, false, null, 0, 16376);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJLJLJ().dismiss();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZ.LJLJLJ().setProgress(i);
    }
}
