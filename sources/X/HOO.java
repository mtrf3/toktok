package X;

import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HOO implements IVideo2GifService.ConvertListener {
    public final /* synthetic */ VideoShare2GifEditContext LIZ;
    public final /* synthetic */ IAVTransformService.ITransformProgress LIZIZ;
    public final /* synthetic */ IAVTransformService.ITransformCallback<Boolean> LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onConfigured(HOR params) {
        o.LJIIIZ(params, "params");
        QM9 qm9 = new QM9(4);
        qm9.LIZ("height", String.valueOf(params.LIZIZ));
        qm9.LIZ("width", String.valueOf(params.LIZ));
        qm9.LIZ("gif_length_in_video", String.valueOf(params.LIZLLL - params.LIZJ));
        qm9.LIZ("gif_offset", String.valueOf(params.LIZJ));
        qm9.LIZ("group_id", this.LIZ.awemeId);
        qm9.LIZ("author_id", this.LIZ.authorId);
        qm9.LIZ("speed", String.valueOf(2.5f));
        FMX.LJIILJJIL("gif_generate", new JSONObject((java.util.Map) qm9.LJLIL));
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onDone(boolean z) {
        IAVTransformService.ITransformCallback<Boolean> iTransformCallback = this.LIZJ;
        if (iTransformCallback != null) {
            iTransformCallback.finish(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onUpdateProgress(int i) {
        IAVTransformService.ITransformProgress iTransformProgress = this.LIZIZ;
        if (iTransformProgress != null) {
            iTransformProgress.update(i);
        }
    }

    public HOO(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback<Boolean> iTransformCallback) {
        this.LIZ = videoShare2GifEditContext;
        this.LIZIZ = iTransformProgress;
        this.LIZJ = iTransformCallback;
    }
}
