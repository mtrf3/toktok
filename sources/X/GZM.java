package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.DefaultStoryForwardServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZM implements IStoryForwardService {
    public static final GZM LIZIZ = new GZM();
    public final /* synthetic */ IStoryForwardService LIZ;

    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    public final boolean editForwardTask(Context context, ForwardResult forwardResult, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(forwardResult, "forwardResult");
        return this.LIZ.editForwardTask(context, forwardResult, z, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    public final ForwardResult forward2Story(Context context, ForwardMedia source, ForwardConfig config, InterfaceC88472Yns<? super ForwardResult, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(config, "config");
        return this.LIZ.forward2Story(context, source, config, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    public final void forwardOnThisDay(Context context, ForwardMedia source, ForwardConfig config, InterfaceC65784Pro<C76800UCe> shareFinish) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(shareFinish, "shareFinish");
        this.LIZ.forwardOnThisDay(context, source, config, shareFinish);
    }

    public GZM() {
        IStoryForwardService iStoryForwardService;
        Object LIZ = C58096Mr6.LIZ(IStoryForwardService.class, false);
        if (LIZ != null) {
            iStoryForwardService = (IStoryForwardService) LIZ;
        } else {
            if (C58096Mr6.z8 == null) {
                synchronized (IStoryForwardService.class) {
                    if (C58096Mr6.z8 == null) {
                        C58096Mr6.z8 = new DefaultStoryForwardServiceImpl();
                    }
                }
            }
            iStoryForwardService = C58096Mr6.z8;
        }
        this.LIZ = iStoryForwardService;
    }
}
