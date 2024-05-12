package com.ss.android.ugc.aweme.services.story;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;

/* loaded from: classes8.dex */
public interface IStoryService {
    <T> T convertTIRAMISU(T t, T t2);

    boolean enableMusicShareStory();

    boolean isPostStoryEnable();

    void startStoryActivity(Context context, EnterStoryParam enterStoryParam);

    void startStoryActivityWithAnim(Context context, EnterStoryParam enterStoryParam);

    void startStoryPublish(Activity activity, EnterStoryParam enterStoryParam, String str, String str2, TokenCert tokenCert, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    IStoryDraftService storyDraftService();

    IStoryPublishService storyPublishService();

    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void startStoryActivity$default(IStoryService iStoryService, Context context, EnterStoryParam enterStoryParam, int i, Object obj) {
            EnterStoryParam enterStoryParam2 = enterStoryParam;
            if (obj == null) {
                if ((i & 2) != 0) {
                    enterStoryParam2 = new EnterStoryParam(null, null, null, false, false, false, false, null, null, null, false, null, 4095, null);
                }
                iStoryService.startStoryActivity(context, enterStoryParam2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startStoryActivity");
        }

        public static /* synthetic */ void startStoryActivityWithAnim$default(IStoryService iStoryService, Context context, EnterStoryParam enterStoryParam, int i, Object obj) {
            EnterStoryParam enterStoryParam2 = enterStoryParam;
            if (obj == null) {
                if ((i & 2) != 0) {
                    enterStoryParam2 = new EnterStoryParam(null, null, null, false, false, false, false, null, null, null, false, null, 4095, null);
                }
                iStoryService.startStoryActivityWithAnim(context, enterStoryParam2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startStoryActivityWithAnim");
        }
    }
}
