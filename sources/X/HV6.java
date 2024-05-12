package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import defpackage.e1;
import java.util.Arrays;
import kotlin.jvm.internal.AqS45S1000000_7;
import kotlin.jvm.internal.AqS4S2300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HV6 implements IStoryService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(HV2.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(HV1.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final boolean isPostStoryEnable() {
        InterfaceC147495qb storyService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (!C151965xo.LIZIZ()) {
            storyService.getClass();
            C53578L1a.LIZ.getClass();
            if (!C53578L1a.LIZ() || C43119Gw7.LIZ()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final boolean enableMusicShareStory() {
        if (e1.LIZ(31744, "enable_share_music_to_story", true, false)) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            if (C43119Gw7.LIZ() && !C1DG.LJIIIIZZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final IStoryDraftService storyDraftService() {
        return (GM0) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final IStoryPublishService storyPublishService() {
        return (C41439GOd) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final <T> T convertTIRAMISU(T t, T t2) {
        return (T) C73994T2g.LJIIJ(t, t2);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final void startStoryActivity(Context context, EnterStoryParam param) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Bundle LJIILJJIL = OQN.LJIILJJIL(param);
        LJIILJJIL.putInt("translation_type", 6);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C41646GWc.LIZ(LJIILJJIL, LJIJJ);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        throw new IllegalArgumentException("use activity as context to launch record page please");
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final void startStoryActivityWithAnim(Context context, EnterStoryParam param) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Bundle LJIILJJIL = OQN.LJIILJJIL(param);
        LJIILJJIL.putInt("translation_type", 18);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C41646GWc.LIZ(LJIILJJIL, LJIJJ);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        throw new IllegalArgumentException("use activity as context to launch record page please");
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final void startStoryPublish(Activity activity, EnterStoryParam storyParam, String enterFrom, String enterMethod, TokenCert cert, InterfaceC65784Pro<C76800UCe> openRecordPage) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(storyParam, "storyParam");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(cert, "cert");
        o.LJIIIZ(openRecordPage, "openRecordPage");
        String[] strArr = (String[]) C73994T2g.LJIIJ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        if (C00F.LIZ(31744, 0, "studio_config_open_album_with_story", true) != 0 || C142355iJ.LIZ()) {
            AqS45S1000000_7 aqS45S1000000_7 = new AqS45S1000000_7(enterFrom, 6);
            AqS45S1000000_7 aqS45S1000000_72 = new AqS45S1000000_7(enterFrom, 7);
            AqS4S2300000_7 aqS4S2300000_7 = new AqS4S2300000_7(enterFrom, enterMethod, (String) storyParam, (EnterStoryParam) activity, (Activity) openRecordPage, (InterfaceC65784Pro<C76800UCe>) 0);
            if (activity instanceof ActivityC45651qj) {
                C61099NyR.LIZIZ.LIZIZ(activity, cert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new HV7(aqS45S1000000_7, aqS4S2300000_7, this, activity, aqS45S1000000_72));
                return;
            }
            return;
        }
        openRecordPage.invoke();
    }
}
