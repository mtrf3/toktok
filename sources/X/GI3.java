package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GI3 extends C78253UnR {
    public static final /* synthetic */ int LJLJJLL = 0;

    public static void LJII(G8Q g8q) {
        String str;
        BaseShortVideoContext baseShortVideoContext;
        if (g8q instanceof G8R) {
            G8R g8r = (G8R) g8q;
            ActivityC45651qj activityC45651qj = g8r.LIZ;
            Bundle bundle = g8r.LIZIZ;
            GI4 LJJIIZ = C78857UxB.LJJIIZ();
            LJJIIZ.LJII();
            LJJIIZ.LJFF("after_click_publish", true);
            LJJIIZ.LJI(1);
            InterfaceC147495qb storyService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            Object serializable = bundle.getSerializable("extra_video_publish_args");
            if (!(serializable instanceof VideoPublishEditModel) || (baseShortVideoContext = (BaseShortVideoContext) serializable) == null || (str = baseShortVideoContext.getCreationId()) == null) {
                str = "";
            }
            storyService.getClass();
            C55723Ltv.LIZIZ.LJIILJJIL().LJIIJ(str, true);
            GTM.LJII(activityC45651qj, bundle);
            return;
        }
        if (g8q instanceof G8P) {
            InterfaceC147495qb storyService2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            G8P g8p = (G8P) g8q;
            String creationId = g8p.LIZ.LJLIL.getCreationId();
            o.LJIIIIZZ(creationId, "pageAction.params.editModel.creationId");
            storyService2.getClass();
            C55723Ltv.LIZIZ.LJIILJJIL().LJIIJ(creationId, true);
            if (C150655vh.LIZ()) {
                C41021G8b c41021G8b = g8p.LIZ;
                if (c41021G8b.LJLILLLLZI.LIZIZ == 0) {
                    H7R.LIZIZ(c41021G8b.LJLIL.creativeModel.draftInfoModel);
                }
            }
            CreativeModel creativeModel = g8p.LIZ.LJLIL.creativeModel;
            if (!creativeModel.draftInfoModel.isDraft) {
                creativeModel.ugcTemplateData.ugcTemplateVersion = 1;
            }
            C60903NvH.LJIIJJI().LJJJI().LJFF().LJ(g8p.LIZ, new GI0(g8q), new AqS173S0100000_7(g8q, (G8Q<Object>) 230));
            return;
        }
        if (g8q instanceof G8O) {
            G8O g8o = (G8O) g8q;
            AbstractC42651GoZ abstractC42651GoZ = g8o.LIZIZ;
            if (abstractC42651GoZ != null) {
                abstractC42651GoZ.LLJJI();
                return;
            } else {
                g8o.LIZ.finish();
                return;
            }
        }
        throw new C162476Zf();
    }
}
