package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ga7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41755Ga7 implements InterfaceC41605GUn<CreateBaseAwemeResponse> {
    public final GUU LJLIL;
    public final GUX LJLILLLLZI;

    @Override // X.InterfaceC41605GUn
    public final void w8() {
    }

    @Override // X.InterfaceC41605GUn
    public final void J6(String path) {
        o.LJIIIZ(path, "path");
        this.LJLILLLLZI.onStageUpdate("STAGE_SYNTHETIC", new C41757Ga9(new GV8(path)), null);
    }

    public C41755Ga7(GUU record, GUX gux) {
        o.LJIIIZ(record, "record");
        this.LJLIL = record;
        this.LJLILLLLZI = gux;
    }

    @Override // X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
        this.LJLILLLLZI.onProgress(i, Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    @Override // X.InterfaceC41605GUn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z3(X.C41759GaB r11, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r12) {
        /*
            r10 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r5 = r11 instanceof X.C41601GUj
            r7 = 1
            r6 = 0
            if (r5 != 0) goto Ld9
            java.lang.Throwable r2 = r11.getCause()
            boolean r0 = r2 instanceof X.C42990Gu2
            if (r0 == 0) goto Lbc
            r0 = r2
            X.Gu2 r0 = (X.C42990Gu2) r0
            int r1 = r0.getCode()
            r0 = -66666(0xfffffffffffefb96, float:NaN)
            if (r1 != r0) goto Lbc
        L1f:
            r0 = 1
        L20:
            r3 = 0
            if (r0 == 0) goto L50
            X.GUX r1 = r10.LJLILLLLZI
            X.GAI r0 = X.GAI.LIZ
            r1.onFinish(r0, r3, r12)
        L2a:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJJIIJ()
            boolean r1 = X.C41775GaR.LIZIZ(r11)
            X.GaH r0 = new X.GaH
            r0.<init>(r12, r11, r1)
            X.C10K.LIZJ(r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJJIIJ()
            X.C41775GaR.LJFF(r11)
            return
        L50:
            X.GUU r0 = r10.LJLIL
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            int r1 = r0.videoType
            if (r1 == 0) goto L5c
            r0 = 11
            if (r1 != r0) goto L5f
        L5c:
            r11.setRecover(r7)
        L5f:
            X.GUU r0 = r10.LJLIL
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r1 = r0.editModel
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.String r1 = r1.getCreationId()
            X.GUU r0 = r10.LJLIL
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            LIZ(r1, r6, r0)
            X.GUX r2 = r10.LJLILLLLZI
            X.GPq r1 = new X.GPq
            X.GUo r4 = new X.GUo
            if (r5 == 0) goto Lb9
            java.lang.String r5 = "100104"
        L7f:
            java.lang.String r6 = ""
            boolean r7 = r11.isUserNetworkBad()
            java.lang.Throwable r8 = r11.getCause()
            boolean r0 = r11.isRecover()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r4.<init>(r5, r6, r7, r8, r9)
            r1.<init>(r4)
            r2.onFinish(r1, r3, r12)
            X.GUU r0 = r10.LJLIL
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r2 = r0.editModel
            X.HEz r1 = X.C44172HVg.LJIIZILJ
            X.Hyi r0 = X.C45828Hyi.LJIIJ
            X.HE2 r1 = (X.HE2) r1
            r1.LIZJ(r3, r2, r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJJ()
            X.C41859Gbn.LJI(r11)
            goto L2a
        Lb9:
            java.lang.String r5 = ""
            goto L7f
        Lbc:
            boolean r0 = r2 instanceof X.C41767GaJ
            if (r0 == 0) goto Lcf
            X.GaJ r2 = (X.C41767GaJ) r2
            long r3 = r2.getErrorCode()
            r1 = -39993(0xffffffffffff63c7, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lcf
            goto L1f
        Lcf:
            X.Ga8 r0 = X.C41756Ga8.INSTANCE
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            if (r0 == 0) goto Ld9
            goto L1f
        Ld9:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41755Ga7.Z3(X.GaB, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
    }

    public static void LIZ(String str, boolean z, PublishModel publishModel) {
        if (publishModel.LIZIZ()) {
            C145995oB LIZIZ = GFJ.LIZIZ(z ? 1 : 0, "is_success");
            if (str == null) {
                str = "";
            }
            LIZIZ.LJI("creation_id", str);
            LIZIZ.LIZ(publishModel.isStoryPublish ? 1 : 0, "is_story");
            FMX.LJIIL("publish_retry_status", LIZIZ.LIZ);
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse response, boolean z, PublishModel publishModel) {
        boolean z2;
        String str;
        Activity LIZIZ;
        String str2;
        CreateAwemeResponse createAwemeResponse;
        Aweme aweme;
        Video video;
        o.LJIIIZ(response, "response");
        if (this.LJLIL.LIZ.videoType == 0) {
            BaseShortVideoContext baseShortVideoContext = this.LJLIL.LIZ.editModel;
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            if ((response instanceof CreateAwemeResponse) && (createAwemeResponse = (CreateAwemeResponse) response) != null && (aweme = createAwemeResponse.aweme) != null && (video = aweme.getVideo()) != null) {
                video.setVideoLength(baseShortVideoContext.getVideoLength());
            }
            response.setVideoCoverPath((String) ORZ.LJLLLL(this.LJLIL.LIZ.videoCoverPaths));
        }
        this.LJLILLLLZI.onFinish(new C41505GQr(response), Boolean.valueOf(z), publishModel);
        BaseShortVideoContext baseShortVideoContext2 = this.LJLIL.LIZ.editModel;
        AVUploadSaveModel aVUploadSaveModel = response.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.isSaveLocal()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = "";
        if (z2) {
            C44172HVg.LJIJJ.getClass();
            AVAweme lambda$getAVConverter$1 = AVServiceProxyImpl.lambda$getAVConverter$1(response);
            if (lambda$getAVConverter$1 == null) {
                str = "";
            } else {
                str = lambda$getAVConverter$1.aid;
                o.LJIIIIZZ(str, "avAweme.aid");
            }
            o.LJII(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            String LJIIIZ = H7R.LJIIIZ((VideoPublishEditModel) baseShortVideoContext2);
            C145995oB LIZIZ2 = GFJ.LIZIZ(1004, "scene_id");
            LIZIZ2.LJI("group_id", str);
            LIZIZ2.LJI("content_type", LJIIIZ);
            LIZIZ2.LJI("download_type", "self");
            LIZIZ2.LJI("download_method", "download_with_publish");
            FMX.LJIIL("download_publish_finish", LIZIZ2.LIZ);
        }
        BaseShortVideoContext baseShortVideoContext3 = this.LJLIL.LIZ.editModel;
        o.LJII(baseShortVideoContext3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        LIZ(baseShortVideoContext3.getCreationId(), true, this.LJLIL.LIZ);
        InterfaceC43749HEz interfaceC43749HEz = C44172HVg.LJIIZILJ;
        BaseShortVideoContext baseShortVideoContext4 = this.LJLIL.LIZ.editModel;
        interfaceC43749HEz.getClass();
        C43722HDy LIZJ = C43723HDz.LIZJ(baseShortVideoContext4);
        if (LIZJ == null || LIZJ.mIsFromDraft || !C43723HDz.LJ(LIZJ) || (LIZIZ = FKM.LIZIZ()) == null) {
            return;
        }
        if (TextUtils.isEmpty(LIZJ.mAppName)) {
            str2 = LIZIZ.getString(R.string.s7b);
        } else {
            str2 = LIZJ.mAppName;
        }
        String sdkNameForServer = LIZJ.getSdkNameForServer();
        if (!TextUtils.isEmpty(LIZJ.mSdkVersion)) {
            str3 = LIZJ.mSdkVersion;
        }
        HJQ hjq = new HJQ(LIZIZ, str2, "share success", LIZJ.mClientKey, new HE0(LIZIZ, LIZJ, sdkNameForServer, str3));
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/opensdk/share/ui/DYShareResultPopDialog", "show", hjq, new Object[0], "void", new C65300Pk0(false, "()V", "5142115654059896973")).LIZ) {
            return;
        }
        hjq.show();
    }
}
