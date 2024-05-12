package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;

/* loaded from: classes8.dex */
public interface IAvatarPublishStoryService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    boolean canRecoverEditPage();

    void clearEditPageData();

    void dismissDialog();

    void downloadTextFont(Context context);

    boolean isChangAvatarPublish(Object obj);

    void openEditPage(ActivityC45651qj activityC45651qj, Bundle bundle, String str, String str2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void publishDirectly(ActivityC45651qj activityC45651qj, Bundle bundle, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void registerDialogCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void requestUpdateAvatar(String str, InterfaceC88472Yns<? super AvatarUri, C76800UCe> interfaceC88472Yns);

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void publishDirectly$default(IAvatarPublishStoryService iAvatarPublishStoryService, ActivityC45651qj activityC45651qj, Bundle bundle, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                iAvatarPublishStoryService.publishDirectly(activityC45651qj, bundle, z, interfaceC65784Pro);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishDirectly");
        }
    }
}
