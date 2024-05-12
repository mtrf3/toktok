package Y;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C126354xb;
import X.C133765Mu;
import X.C135215Sj;
import X.C140475fH;
import X.C142975jJ;
import X.C142985jK;
import X.C44384HbQ;
import X.C44687HgJ;
import X.C47261Igj;
import X.C47956Irw;
import X.C5OG;
import X.C5WW;
import X.C60903NvH;
import X.C6BI;
import X.C6YX;
import X.C76800UCe;
import X.C78685UuP;
import X.C78934UyQ;
import X.C79004UzY;
import X.H78;
import X.H7R;
import X.HZV;
import X.InterfaceC171226nm;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.ProgressDialogC173686rk;
import Y.ARunnableS3S0301000_2;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObjectS80S0300000_2 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS80S0300000_2 aObjectS80S0300000_2) {
        String videoCoverPath;
        MvCreateVideoData mvCreateVideoData;
        IDlS62S0100000_2 iDlS62S0100000_2 = (IDlS62S0100000_2) aObjectS80S0300000_2.l0;
        EffectTextModel effectTextModel = (EffectTextModel) aObjectS80S0300000_2.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS80S0300000_2.l2;
        iDlS62S0100000_2.getClass();
        if (effectTextModel.getTextSticker() != null && effectTextModel.getHasCoverText()) {
            ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).LJLLLLLL.put(0, effectTextModel);
        } else {
            ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).LJLLLLLL.put(0, new EffectTextModel());
        }
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) iDlS62S0100000_2.l0;
        VideoPublishEditModel LIZLLL = vEChooseVideoCoverFragment.LJLLL.LIZLLL();
        EffectTextModel from = vEChooseVideoCoverFragment.LJLLLLLL.get(0);
        EffectTextModel to = LIZLLL.getCoverPublishModel().getEffectTextModel();
        o.LJIIIZ(to, "to");
        o.LJIIIZ(from, "from");
        to.setHasCoverText(from.getHasCoverText());
        to.setTextSticker(from.getTextSticker());
        to.setCreateAwemeCoverInfo(from.getCreateAwemeCoverInfo());
        to.setCoverSelectedFrom(from.getCoverSelectedFrom());
        to.setCoverFrameIndex(from.getCoverFrameIndex());
        final VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = (VEChooseVideoCoverFragment) iDlS62S0100000_2.l0;
        if (vEChooseVideoCoverFragment2.LJLILLLLZI != null) {
            videoPublishEditModel.getCoverPublishModel().setVideoCoverViewX(vEChooseVideoCoverFragment2.LJLILLLLZI.getVideoCoverViewX());
        }
        EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
        if (editPostModel != null) {
            editPostModel.setChangeCover(true);
        }
        videoPublishEditModel.mVideoCoverStartTm = vEChooseVideoCoverFragment2.LJLLLL / 1000.0f;
        if (C142985jK.LIZ()) {
            OSZ LJJJJZI = C44384HbQ.LJJJJZI(videoPublishEditModel, false);
            if (LJJJJZI != null) {
                videoCoverPath = (String) LJJJJZI.getFirst();
            }
            videoCoverPath = null;
        } else if (videoPublishEditModel.isCurrentAutoCutMode()) {
            videoPublishEditModel.setVideoCoverPath("");
            videoPublishEditModel.generateVideoCoverPath();
            videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        } else if (videoPublishEditModel.creativeModel.editPostModel != null) {
            videoPublishEditModel.setVideoCoverPath("");
            videoPublishEditModel.generateVideoCoverPath();
            videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        } else if (videoPublishEditModel.isMvThemeVideoType() && (mvCreateVideoData = videoPublishEditModel.mvCreateVideoData) != null) {
            mvCreateVideoData.videoCoverStartTime = (int) vEChooseVideoCoverFragment2.LJLLLL;
            if (C142975jJ.LIZ()) {
                videoPublishEditModel.mvCreateVideoData.videoCoverImgPath = C78934UyQ.LJLIL.LJI().LIZ().LJII(videoPublishEditModel.creativeInfo);
                videoPublishEditModel.setVideoCoverPath(videoPublishEditModel.mvCreateVideoData.videoCoverImgPath);
            }
            videoCoverPath = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
        } else if (videoPublishEditModel.isMultiVideoEdit() && videoPublishEditModel.multiEditVideoRecordData != null) {
            if (C142975jJ.LIZ()) {
                videoPublishEditModel.multiEditVideoRecordData.coverImagePath = C6BI.LIZJ(videoPublishEditModel.creativeInfo);
                videoPublishEditModel.setVideoCoverPath(videoPublishEditModel.multiEditVideoRecordData.coverImagePath);
                videoCoverPath = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
            } else {
                if (H7R.LJJJJLI(videoPublishEditModel) || videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() || videoPublishEditModel.getOriginal() == 2 || videoPublishEditModel.isSoundSyncFromAnchor() || videoPublishEditModel.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor || H7R.LJJJIL(videoPublishEditModel) || videoPublishEditModel.getEditorProModel().getFromEditorProAnchor()) {
                    videoCoverPath = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                }
                videoCoverPath = null;
            }
        } else if (videoPublishEditModel.isCutSameVideoType() || C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            videoPublishEditModel.setVideoCoverPath("");
            videoPublishEditModel.generateVideoCoverPath();
            videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        } else if (H7R.LJJIJLIJ(videoPublishEditModel)) {
            videoPublishEditModel.setVideoCoverPath("");
            videoPublishEditModel.generateVideoCoverPath();
            videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        } else {
            if (C142975jJ.LIZ()) {
                videoPublishEditModel.setVideoCoverPath("");
                videoPublishEditModel.generateVideoCoverPath();
                videoCoverPath = videoPublishEditModel.getVideoCoverPath();
            }
            videoCoverPath = null;
        }
        if (!TextUtils.isEmpty(videoCoverPath) && vEChooseVideoCoverFragment2.LJLLL != null) {
            ProgressDialogC173686rk LIZJ = ProgressDialogC173686rk.LIZJ(vEChooseVideoCoverFragment2.getContext(), "");
            vEChooseVideoCoverFragment2.LJZI = LIZJ;
            LIZJ.setIndeterminate(true);
            vEChooseVideoCoverFragment2.Al(true);
            new C6YX(vEChooseVideoCoverFragment2.LJLLL.getEditor(), videoCoverPath, (int) vEChooseVideoCoverFragment2.LJLLLL, new IDhS95S0100000_2(videoPublishEditModel, 0), new C47956Irw(), new InterfaceC171226nm() { // from class: X.6Y6
                @Override // X.InterfaceC171226nm
                public final void LIZ() {
                    VEChooseVideoCoverFragment.this.vl();
                }
            });
        } else {
            vEChooseVideoCoverFragment2.vl();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS80S0300000_2 aObjectS80S0300000_2) {
        Intent intent = (Intent) aObjectS80S0300000_2.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS80S0300000_2.l1;
        Context context = (Context) aObjectS80S0300000_2.l2;
        H7R.LJJLIIJ(intent, videoPublishEditModel);
        HZV.LIZ().LJIIZILJ(context, intent);
        H78.LJI("DraftEditHelper after openVideoPublishPage");
        return null;
    }

    public static final Object invoke$2(AObjectS80S0300000_2 aObjectS80S0300000_2) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS80S0300000_2.l0;
        Context context = (Context) aObjectS80S0300000_2.l1;
        Intent intent = (Intent) aObjectS80S0300000_2.l2;
        boolean isEmpty = TextUtils.isEmpty(videoPublishEditModel.nleData);
        if (C78685UuP.LJJIFFI(videoPublishEditModel.audioEnhanceParam) && (C5WW.LIZIZ() == 1 || C5WW.LIZIZ() == 3 || C5WW.LIZ())) {
            z = true;
        } else {
            z = false;
        }
        if (isEmpty) {
            C60903NvH.LJIIJJI().LJIJ();
            C133765Mu LIZIZ = C135215Sj.LIZIZ(videoPublishEditModel, false);
            NLEEditor nLEEditor = LIZIZ.LJI().LJIIJ;
            if (z) {
                videoPublishEditModel = videoPublishEditModel;
                context = context;
                intent = intent;
                final C140475fH c140475fH = new C140475fH(videoPublishEditModel, LIZIZ, context, intent, nLEEditor);
                if (C44687HgJ.LIZIZ(C126354xb.LIZ)) {
                    C5OG.LIZIZ(new ARunnableS6S0400000_2(c140475fH, videoPublishEditModel, LIZIZ, context, intent, 6));
                } else {
                    DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"requirement_ftgru"}, C113554cx.LJJLIIIIJ(new OSZ("requirement_ftgru", C47261Igj.LJJIJIL("unet_denoise_44k_music_model_v1.0"))), new IFetchResourceListener() { // from class: X.5hS
                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        public final void onFailure(Exception exception) {
                            o.LJIIIZ(exception, "exception");
                            InterfaceC126364xc interfaceC126364xc = c140475fH;
                            if (interfaceC126364xc != null) {
                                C140475fH c140475fH2 = (C140475fH) interfaceC126364xc;
                                C5OG.LIZIZ(new ARunnableS3S0301000_2(1, c140475fH2, c140475fH2.LIZJ, c140475fH2.LIZLLL, 0));
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:5:0x0008, B:6:0x0025, B:8:0x002b, B:9:0x003a, B:11:0x003e, B:16:0x000d, B:18:0x0018), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:5:0x0008, B:6:0x0025, B:8:0x002b, B:9:0x003a, B:11:0x003e, B:16:0x000d, B:18:0x0018), top: B:1:0x0000 }] */
                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onSuccess(long r8) {
                            /*
                                r7 = this;
                                boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform     // Catch: java.lang.Exception -> L52
                                java.lang.String r3 = "unet_denoise_44k_music_model_v1.0"
                                r2 = 0
                                if (r0 == 0) goto L8
                                goto Ld
                            L8:
                                java.lang.String r1 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r2, r3)     // Catch: java.lang.Exception -> L52
                                goto L25
                            Ld:
                                X.XBf r0 = X.XBE.LJIIIIZZ     // Catch: java.lang.Exception -> L52
                                r0.getClass()     // Catch: java.lang.Exception -> L52
                                boolean r0 = X.C84419XBf.LIZJ()     // Catch: java.lang.Exception -> L52
                                if (r0 == 0) goto L8
                                X.XBE r0 = X.C84419XBf.LIZ()     // Catch: java.lang.Exception -> L52
                                com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r1 = r0.LIZLLL()     // Catch: java.lang.Exception -> L52
                                r0 = 0
                                java.lang.String r1 = r1.realFindResourceUri(r0, r2, r3)     // Catch: java.lang.Exception -> L52
                            L25:
                                boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.lang.Exception -> L52
                                if (r0 == 0) goto L3a
                                java.net.URI r0 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L52
                                java.lang.String r1 = r0.getPath()     // Catch: java.lang.Exception -> L52
                                java.lang.String r0 = "create(path).path"
                                kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L52
                                X.C126354xb.LIZ = r1     // Catch: java.lang.Exception -> L52
                            L3a:
                                X.4xc r1 = r1     // Catch: java.lang.Exception -> L52
                                if (r1 == 0) goto L5c
                                X.5fH r1 = (X.C140475fH) r1     // Catch: java.lang.Exception -> L52
                                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r1.LIZ     // Catch: java.lang.Exception -> L52
                                X.5Mu r3 = r1.LIZIZ     // Catch: java.lang.Exception -> L52
                                android.content.Context r4 = r1.LIZJ     // Catch: java.lang.Exception -> L52
                                android.content.Intent r5 = r1.LIZLLL     // Catch: java.lang.Exception -> L52
                                Y.ARunnableS6S0400000_2 r0 = new Y.ARunnableS6S0400000_2     // Catch: java.lang.Exception -> L52
                                r6 = 6
                                r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L52
                                X.C5OG.LIZIZ(r0)     // Catch: java.lang.Exception -> L52
                                goto L5c
                            L52:
                                r0 = move-exception
                                java.lang.StackTraceElement[] r1 = r0.getStackTrace()
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.print(r1)
                            L5c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C141825hS.onSuccess(long):void");
                        }
                    });
                }
            } else {
                nLEEditor.LIZJ();
                videoPublishEditModel.nleData = nLEEditor.LJIIIIZZ();
            }
            H78.LJI("DraftEditHelper has converted NLE from editModel");
        }
        H78.LJI("DraftEditHelper has converted NLE from editModel");
        if (isEmpty && z) {
            return null;
        }
        intent.putExtra("NLE", videoPublishEditModel.nleData);
        H7R.LJJLIIJ(intent, videoPublishEditModel);
        HZV.LIZ().LJIIZILJ(context, intent);
        H78.LJI("DraftEditHelper after openVideoPublishPage");
        return null;
    }

    public AObjectS80S0300000_2(ActivityC45651qj activityC45651qj, Intent intent, VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l0 = intent;
                this.l1 = videoPublishEditModel;
                this.l2 = activityC45651qj;
                return;
            default:
                this.l0 = videoPublishEditModel;
                this.l1 = activityC45651qj;
                this.l2 = intent;
                return;
        }
    }

    public AObjectS80S0300000_2(IDlS62S0100000_2 iDlS62S0100000_2, EffectTextModel effectTextModel, VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        this.l0 = iDlS62S0100000_2;
        this.l1 = effectTextModel;
        this.l2 = videoPublishEditModel;
    }
}
