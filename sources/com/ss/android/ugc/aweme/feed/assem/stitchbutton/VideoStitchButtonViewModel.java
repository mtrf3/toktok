package com.ss.android.ugc.aweme.feed.assem.stitchbutton;

import X.C208908Hu;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;

/* loaded from: classes4.dex */
public final class VideoStitchButtonViewModel extends FeedBaseViewModel<C208908Hu> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C208908Hu();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean kv0(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.enableStitch()
            if (r0 != 0) goto L17
            return r8
        L17:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L2e
            boolean r0 = X.C78996UzQ.LJJIIZI(r9)
            if (r0 != 0) goto L2e
            return r8
        L2e:
            com.ss.android.ugc.aweme.feed.model.InteractPermission r0 = r9.getInteractPermission()
            if (r0 == 0) goto L3c
            int r2 = r0.getStitch()
            r0 = 4
            if (r2 != r0) goto L3d
            return r8
        L3c:
            r2 = 0
        L3d:
            boolean r0 = X.C78996UzQ.LJJIIZI(r9)
            r1 = 2
            if (r0 != 0) goto L4d
            if (r2 == r1) goto L4c
            boolean r0 = r9.isPrivate()
            if (r0 == 0) goto L4d
        L4c:
            return r8
        L4d:
            boolean r0 = r9.canStitchVideoType()
            r7 = 1
            if (r0 == 0) goto Ld1
            boolean r0 = r9.isWithPromotionalMusic()
            if (r0 != 0) goto Ld1
            int r0 = r9.getStitchSetting()
            if (r0 == r1) goto Ld1
            r6 = 1
        L61:
            boolean r5 = X.C220858ld.LIZLLL(r9)
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            if (r0 != 0) goto Lbd
        L6b:
            r4 = 0
        L6c:
            com.ss.android.ugc.aweme.feed.model.InteractPermission r0 = r9.getInteractPermission()
            if (r0 == 0) goto Lbb
            int r3 = r0.getStitch()
        L76:
            int r1 = r9.getAwemeType()
            r0 = 150(0x96, float:2.1E-43)
            if (r1 != r0) goto Lb9
            r2 = 1
        L7f:
            if (r5 == 0) goto Lb2
            r0 = 3
            if (r3 == r0) goto Lb2
            boolean r0 = X.C78996UzQ.LJJIIZI(r9)
            if (r0 != 0) goto L8e
            if (r4 == 0) goto Lb2
            if (r3 == r7) goto Lb2
        L8e:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto La4
            boolean r0 = X.C78996UzQ.LJJIIZI(r9)
            if (r0 == 0) goto Lb2
        La4:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r1 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ()
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.getMusic()
            boolean r0 = r1.LJIILLIIL(r0)
            if (r0 == 0) goto Lb3
        Lb2:
            return r8
        Lb3:
            if (r2 != 0) goto Lb2
            if (r6 == 0) goto Lb2
            r8 = 1
            goto Lb2
        Lb9:
            r2 = 0
            goto L7f
        Lbb:
            r3 = 0
            goto L76
        Lbd:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            int r0 = r0.getStitchSetting()
            if (r0 == 0) goto Lcf
            if (r0 == r7) goto Lca
            goto L6b
        Lca:
            boolean r4 = X.C45441HsT.LIZ(r9)
            goto L6c
        Lcf:
            r4 = 1
            goto L6c
        Ld1:
            r6 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonViewModel.kv0(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
