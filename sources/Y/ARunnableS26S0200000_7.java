package Y;

import X.A90;
import X.AbstractC41437GOb;
import X.AbstractC42651GoZ;
import X.AbstractC82681Wcf;
import X.ActivityC45651qj;
import X.ActivityC61947OSx;
import X.AnonymousClass607;
import X.C03880Dg;
import X.C145995oB;
import X.C173786ru;
import X.C211898Th;
import X.C38816FLg;
import X.C41359GLb;
import X.C41442GOg;
import X.C41658GWo;
import X.C42041Gej;
import X.C42139GgJ;
import X.C42898GsY;
import X.C43169Gwv;
import X.C43356Gzw;
import X.C43687HCp;
import X.C44066HRe;
import X.C44293HZx;
import X.C45417Hs5;
import X.C46118I8c;
import X.C46156I9o;
import X.C46193IAz;
import X.C47261Igj;
import X.C53258KvG;
import X.C60903NvH;
import X.C60996Nwm;
import X.C65300Pk0;
import X.C65777Prh;
import X.C68322mC;
import X.C78605Ut7;
import X.C78866UxK;
import X.C81392Vwy;
import X.EF7;
import X.EnumC42934Gt8;
import X.EnumC44070HRi;
import X.EnumC44267HYx;
import X.FGR;
import X.FMX;
import X.GIR;
import X.GOX;
import X.GUG;
import X.GUH;
import X.GUQ;
import X.GUU;
import X.GUX;
import X.GVF;
import X.GVX;
import X.GW2;
import X.H78;
import X.HB4;
import X.HWG;
import X.HWK;
import X.HWR;
import X.HWX;
import X.I2A;
import X.I88;
import X.I9X;
import X.InterfaceC41605GUn;
import X.InterfaceC42534Gmg;
import X.InterfaceC46204IBk;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.J8V;
import X.KL2;
import X.O6R;
import X.ORS;
import X.ORZ;
import X.Q5C;
import X.TEZ;
import X.WHL;
import X.WM7;
import X.WMU;
import X.X1D;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes8.dex */
public class ARunnableS26S0200000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r1 == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            X.Har r0 = (X.C44349Har) r0
            X.ICy r0 = r0.LIZ
            X.WJm r0 = r0.LJLJI
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.zZ()
            X.HCA r0 = r0.LIZIZ()
            int r2 = r0.size()
            java.lang.Object r1 = r5.l0
            X.Har r1 = (X.C44349Har) r1
            int r0 = r1.LIZIZ
            r4 = 1
            if (r0 >= 0) goto L2b
        L1d:
            java.lang.Object r0 = r5.l0
            X.Har r0 = (X.C44349Har) r0
            X.ICy r0 = r0.LIZ
            X.I3X r0 = r0.getRecordControlApi()
            r0.Pk(r4)
            return
        L2b:
            if (r2 <= r0) goto L1d
            X.ICy r0 = r1.LIZ
            X.WJm r0 = r0.LJLJI
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.zZ()
            X.HCA r1 = r0.LIZIZ()
            java.lang.Object r0 = r5.l0
            X.Har r0 = (X.C44349Har) r0
            int r0 = r0.LIZIZ
            java.lang.Object r3 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r3 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r3
            java.lang.Object r0 = r5.l1
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 == 0) goto L4f
            int r1 = r0.length
            r0 = 0
            if (r1 != 0) goto L50
        L4f:
            r0 = 1
        L50:
            r2 = 0
            if (r0 != 0) goto L74
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r0 = r5.l1
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = X.ORY.LJJZZIII(r0)
            r1.<init>(r0)
        L60:
            r3.setBubbleText(r1)
            java.lang.Object r0 = r5.l0
            X.Har r0 = (X.C44349Har) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LIZJ
            boolean r0 = X.ID0.LIZLLL(r0)
            if (r0 == 0) goto L70
            r2 = r1
        L70:
            r3.setARText(r2)
            goto L1d
        L74:
            r1 = r2
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS26S0200000_7.LIZ$0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        T t;
        Activity activity = ((I88) this.l0).mActivity;
        if (activity == null || activity.isFinishing() || (t = ((C68322mC) this.l1).element) == 0) {
            return;
        }
        I88 i88 = (I88) this.l0;
        AbstractC82681Wcf abstractC82681Wcf = (AbstractC82681Wcf) t;
        TextView textView = i88.LJLJLJ;
        if (textView != null) {
            abstractC82681Wcf.LIZIZ(textView);
            abstractC82681Wcf.LJI(WHL.BOTTOM);
            i88.LJLJJL = abstractC82681Wcf.LIZJ();
            InterfaceC82683Wch interfaceC82683Wch = ((I88) this.l0).LJLJJL;
            if (interfaceC82683Wch == null) {
                return;
            }
            interfaceC82683Wch.show();
            return;
        }
        o.LJIJI("tvChooseMusic");
        throw null;
    }

    public final void LIZ$10() {
        boolean z;
        String thirdId;
        ArrayList arrayList = new ArrayList();
        for (CreateAnchorInfo createAnchorInfo : (List) this.l0) {
            int type = createAnchorInfo.getType();
            String content = createAnchorInfo.getContent();
            String keyword = createAnchorInfo.getKeyword();
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C47261Igj.LJII(createAnchorInfo.getIconUrl()));
            urlModel.setUri(Uri.decode(createAnchorInfo.getIconUrl()));
            String subtype = createAnchorInfo.getSubtype();
            if (createAnchorInfo.getType() == 40) {
                z = true;
            } else {
                z = false;
            }
            String language = createAnchorInfo.getLanguage();
            Long addTime = createAnchorInfo.getAddTime();
            String extra = createAnchorInfo.getExtra();
            boolean display = createAnchorInfo.getDisplay();
            if (createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) {
                thirdId = createAnchorInfo.getThirdId();
            } else {
                thirdId = "";
            }
            arrayList.add(new AnchorTransData(type, content, keyword, null, null, thirdId, urlModel, z, null, language, addTime, extra, subtype, display, 280, null));
        }
        C42898GsY c42898GsY = (C42898GsY) this.l1;
        View view = c42898GsY.LJLJJL;
        if (view != null) {
            view.post(new ARunnableS26S0200000_7(arrayList, c42898GsY, 22));
        } else {
            o.LJIJI("view");
            throw null;
        }
    }

    public final void LIZ$12() {
        List<AwemeDraft> list;
        Future<List<AwemeDraft>> future = ((GW2) this.l0).LIZJ;
        if (future != null && (list = future.get()) != null) {
            GW2 gw2 = (GW2) this.l0;
            ArrayList arrayList = new ArrayList();
            for (AwemeDraft awemeDraft : list) {
                if (!o.LJ(awemeDraft.LIZJ(), gw2.LIZIZ)) {
                    arrayList.add(awemeDraft);
                }
            }
            GW2 gw22 = (GW2) this.l0;
            PublishFailureReason publishFailureReason = (PublishFailureReason) this.l1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C38816FLg.LIZJ(new ARunnableS18S0300000_7(gw22, (AwemeDraft) it.next(), publishFailureReason, 14));
            }
        }
    }

    public final void LIZ$13() {
        List<AwemeDraft> list;
        Future<List<AwemeDraft>> future = ((GW2) this.l0).LIZJ;
        if (future != null && (list = future.get()) != null) {
            GW2 gw2 = (GW2) this.l0;
            ArrayList arrayList = new ArrayList();
            for (AwemeDraft awemeDraft : list) {
                if (!o.LJ(awemeDraft.LIZJ(), gw2.LIZIZ)) {
                    arrayList.add(awemeDraft);
                }
            }
            GW2 gw22 = (GW2) this.l0;
            PublishFailureReason publishFailureReason = (PublishFailureReason) this.l1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C38816FLg.LIZJ(new ARunnableS18S0300000_7(gw22, (AwemeDraft) it.next(), publishFailureReason, 15));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        View view;
        String str;
        String str2;
        AnonymousClass607 anonymousClass607;
        C46118I8c c46118I8c = (C46118I8c) this.l0;
        if (c46118I8c.mActivity == null || c46118I8c.requireActivity().isFinishing() || ((C68322mC) this.l1).element == 0) {
            return;
        }
        C46118I8c c46118I8c2 = (C46118I8c) this.l0;
        AnonymousClass607 anonymousClass6072 = c46118I8c2.LJZL;
        if ((anonymousClass6072 != null && (view = anonymousClass6072.getChooseMusicDockerContentView()) != null && (anonymousClass607 = c46118I8c2.LJZL) != null && anonymousClass607.getVisibility() == 0 && view.getVisibility() == 0) || (view = c46118I8c2.LJLLLL) != null) {
            C46118I8c c46118I8c3 = (C46118I8c) this.l0;
            AbstractC82681Wcf abstractC82681Wcf = (AbstractC82681Wcf) ((C68322mC) this.l1).element;
            abstractC82681Wcf.getClass();
            abstractC82681Wcf.LIZ.LIZIZ = view;
            abstractC82681Wcf.LJI(WHL.BOTTOM);
            InterfaceC82683Wch LIZJ = abstractC82681Wcf.LIZJ();
            c46118I8c3.LJLL = LIZJ;
            LIZJ.show();
        }
        C44293HZx c44293HZx = ((C46118I8c) this.l0).LJLJLLL;
        if (c44293HZx != null) {
            str = c44293HZx.LJI;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        ShortVideoContextViewModel shortVideoContextViewModel = ((C46118I8c) this.l0).LJLLI;
        if (shortVideoContextViewModel != null) {
            c145995oB.LJI("creation_id", shortVideoContextViewModel.LJLIL.LJI());
            c145995oB.LJI("enter_from", "video_shoot_page");
            C44293HZx c44293HZx2 = ((C46118I8c) this.l0).LJLJLLL;
            if (c44293HZx2 != null) {
                str2 = c44293HZx2.LJI;
            } else {
                str2 = null;
            }
            c145995oB.LJI("text", str2);
            ShortVideoContextViewModel shortVideoContextViewModel2 = ((C46118I8c) this.l0).LJLLI;
            if (shortVideoContextViewModel2 != null) {
                c145995oB.LJI("shoot_way", shortVideoContextViewModel2.LJLIL.shootWay);
                c145995oB.LJI(WM7.SCENE_SERVICE, "reuse_music");
                FMX.LJIIL("creation_bubble_show", c145995oB.LIZ);
                return;
            }
            o.LJIJI("shortVideoContextViewModel");
            throw null;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$3() {
        int i;
        if (C78866UxK.LJJJJLL(((C46193IAz) this.l0).LLLLL(), (Effect) this.l1)) {
            TEZ currentChildPosition = ((C46193IAz) this.l0).LLLLL();
            o.LJIIIZ(currentChildPosition, "$this$currentChildPosition");
            I2A i2a = (I2A) currentChildPosition.LJIIIIZZ().LJIILIIL().getValue();
            if (i2a != null) {
                i = i2a.LJLILLLLZI;
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        InterfaceC46204IBk LLZL = ((C46193IAz) this.l0).LLZL();
        Effect effect = (Effect) this.l1;
        o.LJIIIIZZ(effect, "effect");
        LLZL.LIZJ(J8V.LJI(effect, i, EnumC44267HYx.RECOVER, null, null, null, null, 0, false, null, 508));
    }

    public final void LIZ$4() {
        int LJIIIIZZ = (C60996Nwm.LJIIIIZZ(((MvChoosePhotoScene) this.l1).requireSceneContext()) - (((TextView) this.l0).getMeasuredWidth() * 2)) - ((int) KL2.LIZJ(((MvChoosePhotoScene) this.l1).requireSceneContext(), 60.0f));
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) this.l1;
        TextView textView = mvChoosePhotoScene.LLF;
        if (textView != null) {
            if (mvChoosePhotoScene.LLZIL.LIZ && !mvChoosePhotoScene.LLLLLZL()) {
                LJIIIIZZ = Math.min((int) KL2.LIZJ(((MvChoosePhotoScene) this.l1).requireSceneContext(), 130.0f), LJIIIIZZ);
            }
            textView.setMaxWidth(LJIIIIZZ);
        }
        ((TextView) this.l0).setVisibility(8);
        ((TextView) this.l0).setTextSize(1, 17.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1 == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.l0
            X.GUI r0 = (X.GUI) r0
            java.util.List<X.GUU> r1 = r0.LIZ
            java.lang.String r0 = "mPublishRecordList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r5 = r8.l1
            X.GLb r5 = (X.C41359GLb) r5
            java.util.Iterator r7 = r1.iterator()
        L13:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r6 = r7.next()
            X.GUU r6 = (X.GUU) r6
            X.GOb r3 = r6.LIZLLL
            X.GUQ r2 = r6.LJI
            boolean r0 = r3 instanceof X.C41442GOg
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            X.GUG r0 = r2.LJLJL
            if (r0 == 0) goto L7d
            boolean r1 = r0.LIZLLL()
            r0 = 1
            if (r1 != r0) goto L7d
        L34:
            java.lang.String r4 = "PublishParallel cancelPublish id="
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r4)
            java.lang.String r1 = r6.LIZIZ
            java.lang.String r0 = " can't pause because its compile finished"
            java.lang.String r0 = X.JBR.LJFF(r2, r1, r0, r2)
            X.H78.LJI(r0)
            goto L13
        L4b:
            X.GOg r3 = (X.C41442GOg) r3
            int r0 = r3.LIZ
            int r3 = X.GUI.LIZIZ
            if (r0 < r3) goto L66
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r4)
            java.lang.String r1 = r6.LIZIZ
            java.lang.String r0 = " can't pause because its progress >= "
            java.lang.String r0 = X.C40084FoG.LIZ(r2, r1, r0, r3, r2)
            X.H78.LJI(r0)
            goto L13
        L66:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            java.lang.String r0 = r6.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LJI(r0)
            r2.LIZIZ(r5)
            goto L13
        L7d:
            r0 = 0
            goto L34
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS26S0200000_7.LIZ$5():void");
    }

    public final void LIZ$7() {
        List<String> list;
        PublishModel publishModel = ((GUQ) this.l0).LJLJJL.LIZ;
        GUU guu = ((GUQ) this.l0).LJLJJL;
        PublishModel publishModel2 = (PublishModel) this.l1;
        guu.getClass();
        o.LJIIIZ(publishModel2, "<set-?>");
        guu.LIZ = publishModel2;
        if (GOX.LIZ()) {
            PublishModel publishModel3 = (PublishModel) this.l1;
            BaseShortVideoContext baseShortVideoContext = publishModel3.editModel;
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            BaseShortVideoContext baseShortVideoContext2 = publishModel.editModel;
            o.LJII(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            ((VideoPublishEditModel) baseShortVideoContext).setImageAlbumData(((VideoPublishEditModel) baseShortVideoContext2).getImageAlbumData());
            BaseShortVideoContext baseShortVideoContext3 = publishModel3.editModel;
            o.LJII(baseShortVideoContext3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            AVUploadSaveModel saveModel = ((VideoPublishEditModel) baseShortVideoContext3).getSaveModel();
            if (saveModel != null) {
                BaseShortVideoContext baseShortVideoContext4 = publishModel.editModel;
                o.LJII(baseShortVideoContext4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                AVUploadSaveModel saveModel2 = ((VideoPublishEditModel) baseShortVideoContext4).getSaveModel();
                if (saveModel2 != null) {
                    list = saveModel2.getImageModeLocalPaths();
                } else {
                    list = null;
                }
                saveModel.setImageModeLocalPaths(list);
            }
        }
        GUQ guq = (GUQ) this.l0;
        guq.LJLJJLL.LIZJ("reStart");
        GUG gug = guq.LJLJL;
        if (gug != null) {
            gug.LIZJ();
        }
    }

    public final void LIZ$8() {
        Aweme aweme = (Aweme) this.l0;
        if (aweme == null) {
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LJII(R.string.f0q, EnumC44070HRi.AWEME_ID_UNAVAILABLE);
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LIZ();
            return;
        }
        if (aweme.getStatus() != null && ((Aweme) this.l0).getStatus().isPrivate()) {
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LJII(R.string.h47, EnumC44070HRi.PRIVATE_STATUS);
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LIZ();
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LJIIL.onFailed();
        } else if (((Aweme) this.l0).getStatus() != null && ((Aweme) this.l0).getStatus().isDelete()) {
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LJII(R.string.h46, EnumC44070HRi.DELETE_STATUS);
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LIZ();
            ((C44066HRe) ((ARunnableS2S2100000_7) this.l1).l2).LJIIL.onFailed();
        } else {
            ARunnableS2S2100000_7 aRunnableS2S2100000_7 = (ARunnableS2S2100000_7) this.l1;
            C44066HRe c44066HRe = (C44066HRe) aRunnableS2S2100000_7.l2;
            c44066HRe.LIZIZ(c44066HRe.LJIIJJI, (Aweme) this.l0, aRunnableS2S2100000_7.s1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$9() {
        List<AnchorTransData> value = ((C42898GsY) this.l0).LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            ORZ.LLILII(new IDComparatorS35S0000000_7(13), value);
            C42898GsY c42898GsY = (C42898GsY) this.l0;
            ArrayList arrayList = (ArrayList) this.l1;
            for (AnchorTransData anchorTransData : value) {
                if (anchorTransData.getBusinessType() != c42898GsY.LJLLL && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.TTS_VOICE.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.PROP.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_SOUND_SYNC.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.MV_TEMPLATE.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_EDIT_EFFECT.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_EDITOR_PRO.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE() && anchorTransData.getBusinessType() != EnumC42934Gt8.ANCHOR_VOICECONVERSION.getTYPE()) {
                    if (C53258KvG.LIZIZ()) {
                        arrayList.clear();
                    }
                    arrayList.add(anchorTransData);
                }
            }
        }
        C42898GsY c42898GsY2 = (C42898GsY) this.l0;
        ArrayList arrayList2 = (ArrayList) this.l1;
        c42898GsY2.getClass();
        List<AnchorTransData> LIZIZ = C65777Prh.LIZIZ(C42898GsY.LIZJ(arrayList2));
        if (!C211898Th.LIZ()) {
            C42898GsY c42898GsY3 = (C42898GsY) this.l0;
            c42898GsY3.getClass();
            ORS.LJJLIL(new AqS173S0100000_7(c42898GsY3, 315), LIZIZ);
        }
        if (C53258KvG.LIZIZ()) {
            ((C42898GsY) this.l0).getClass();
            C42898GsY.LJIILIIL(LIZIZ);
            if (!LIZIZ.isEmpty()) {
                Object LJLLJ = ORZ.LJLLJ(LIZIZ);
                C42898GsY c42898GsY4 = (C42898GsY) this.l0;
                AnchorTransData anchorTransData2 = (AnchorTransData) LJLLJ;
                if (anchorTransData2.getBusinessType() == EnumC42934Gt8.PROP.getTYPE() || anchorTransData2.getBusinessType() == c42898GsY4.LJLLL || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_SOUND_SYNC.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.TTS_VOICE.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_VOICECONVERSION.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.MV_TEMPLATE.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_EDITOR_PRO.getTYPE() || anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE()) {
                    int businessType = anchorTransData2.getBusinessType();
                    UrlModel anchorIcon = anchorTransData2.getAnchorIcon();
                    o.LJI(anchorIcon);
                    String title = anchorTransData2.getTitle();
                    o.LJI(title);
                    String url = anchorTransData2.getUrl();
                    UrlModel anchorIcon2 = anchorTransData2.getAnchorIcon();
                    o.LJI(anchorIcon2);
                    String string = EF7.LIZIZ().getResources().getString(R.string.fr2);
                    String anchorContent = anchorTransData2.getAnchorContent();
                    ExtensionMisc LJ = c42898GsY4.LJ();
                    boolean display = anchorTransData2.getDisplay();
                    c42898GsY4.LJZ = new AnchorPublishStruct(businessType, anchorIcon, title, url, anchorIcon2, "", anchorContent, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 3, C42139GgJ.LJLIL, LJ, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, string, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, display, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 259768704, 0 == true ? 1 : 0);
                }
            }
        }
        ((C42898GsY) this.l0).LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZIZ);
    }

    public final void LIZ$11() {
        EventBus.LIZJ().LJIILJJIL((ActivityC61947OSx) this.l0);
        IOpenPlatformService LJ = OpenPlatformServiceImpl.LJ();
        ActivityC61947OSx activityC61947OSx = (ActivityC61947OSx) this.l0;
        ArrayList arrayList = new ArrayList();
        String str = ((ActivityC61947OSx) this.l0).clientKey;
        if (str != null) {
            LJ.LIZJ(activityC61947OSx, arrayList, str, (Bundle) this.l1);
        } else {
            o.LJIJI("clientKey");
            throw null;
        }
    }

    public final void LIZ$6() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishSchedule clearPrePublishTask task id = ");
        LIZ.append(((GUQ) this.l0).LJLJJL.LIZIZ);
        H78.LJI(X1D.LIZIZ(LIZ));
        ((GUQ) this.l0).LIZIZ((C41359GLb) this.l1);
        GUH.LJI = null;
    }

    public static final void run$0(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        Double rewardConsumePercent;
        try {
            C43687HCp c43687HCp = (C43687HCp) aRunnableS26S0200000_7.l0;
            if (c43687HCp.LJFF != null && (rewardConsumePercent = ((HTCMissionModule) aRunnableS26S0200000_7.l1).getRewardConsumePercent()) != null) {
                int LJJIIJZLJL = O6R.LJJIIJZLJL((Math.min(Math.max(rewardConsumePercent.doubleValue(), LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), 100.0d) / 100.0d) * c43687HCp.LJI.getWidth());
                FrameLayout frameLayout = c43687HCp.LJFF;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = LJJIIJZLJL;
                frameLayout.setLayoutParams(layoutParams);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        C45417Hs5 c45417Hs5 = (C45417Hs5) aRunnableS26S0200000_7.l0;
        Activity activity = (Activity) aRunnableS26S0200000_7.l1;
        c45417Hs5.getClass();
        A90 a90 = new A90(activity);
        c45417Hs5.LIZIZ = a90;
        a90.LIZJ(activity.getString(R.string.hvo));
        c45417Hs5.LIZIZ.LJ(false);
        A90 a902 = c45417Hs5.LIZIZ;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a902, new Object[0], "void", new C65300Pk0(false, "()V", "7861078374341520835")).LIZ) {
            a902.show();
        }
        FeedPanelStateViewModel feedPanelStateViewModel = c45417Hs5.LIZ;
        if (feedPanelStateViewModel != null) {
            feedPanelStateViewModel.LJLJLLL.setValue(true);
        }
    }

    public static final void run$12(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            GUX gux = (GUX) aRunnableS26S0200000_7.l0;
            AbstractC41437GOb abstractC41437GOb = (AbstractC41437GOb) aRunnableS26S0200000_7.l1;
            gux.onProgress(((C41442GOg) abstractC41437GOb).LIZ, ((C41442GOg) abstractC41437GOb).LIZIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            GUQ guq = ((GUU) aRunnableS26S0200000_7.l0).LJI;
            if (guq != null) {
                GUX callback = (GUX) aRunnableS26S0200000_7.l1;
                o.LJIIIZ(callback, "callback");
                ((ArrayList) guq.LJLJLJ).remove(callback);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            GUQ guq = ((GUU) aRunnableS26S0200000_7.l0).LJI;
            if (guq != null) {
                guq.LJ((InterfaceC41605GUn) aRunnableS26S0200000_7.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            List<GUQ> list = (List) aRunnableS26S0200000_7.l0;
            InterfaceC41605GUn<CreateBaseAwemeResponse> interfaceC41605GUn = (InterfaceC41605GUn) aRunnableS26S0200000_7.l1;
            for (GUQ guq : list) {
                if (guq != null) {
                    guq.LJ(interfaceC41605GUn);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            if (((GUQ) aRunnableS26S0200000_7.l0) != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PublishSchedule cancelPrePublish task id = ");
                LIZ2.append(((GUQ) aRunnableS26S0200000_7.l0).LJLJJL.LIZIZ);
                H78.LJI(X1D.LIZIZ(LIZ2));
            }
            GUQ guq = (GUQ) aRunnableS26S0200000_7.l0;
            if (guq != null) {
                guq.LIZIZ((C41359GLb) aRunnableS26S0200000_7.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            GVF publishService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getPublishService();
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) aRunnableS26S0200000_7.l0;
            BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) aRunnableS26S0200000_7.l1;
            ((C78605Ut7) publishService).getClass();
            C60903NvH.LJIIJJI().getPublishService().LJJIJIIJIL(activityC45651qj, baseShortVideoContext);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((C42041Gej) aRunnableS26S0200000_7.l0).LJLLLL.LJ((C43356Gzw) aRunnableS26S0200000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            FGR.LIZIZ().LIZ(((C43169Gwv) aRunnableS26S0200000_7.l1).mHandler, new Q5C(1, (Object[]) aRunnableS26S0200000_7.l0), 0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            GVX.LIZ.LIZJ(true);
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZLLL(((GW2) aRunnableS26S0200000_7.l0).LIZ, (AwemeDraft) aRunnableS26S0200000_7.l1, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((TuxTextView) aRunnableS26S0200000_7.l0).getViewTreeObserver().removeOnDrawListener((GIR) aRunnableS26S0200000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((AbstractC42651GoZ) aRunnableS26S0200000_7.l0).LLJJJJ();
            ((WMU) aRunnableS26S0200000_7.l1).LIZIZ = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            RecordScene recordScene = (RecordScene) aRunnableS26S0200000_7.l0;
            if (recordScene != null) {
                CreativeInfo creativeInfo = recordScene.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "recordScene.creativeInfo");
                C173786ru.LIZLLL(creativeInfo);
                C41658GWo LIZLLL = C41658GWo.LIZLLL();
                RecordScene recordScene2 = (RecordScene) aRunnableS26S0200000_7.l0;
                LIZLLL.getClass();
                C41658GWo.LJI(recordScene2);
                HB4.LIZLLL();
                InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS26S0200000_7.l1;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            MusicModel musicModel = (MusicModel) aRunnableS26S0200000_7.l0;
            if (musicModel != null) {
                HWR hwr = (HWR) aRunnableS26S0200000_7.l1;
                if (hwr.LJI == null) {
                    hwr.LJI = HWG.LIZIZ(hwr.LIZ, HWK.VISIBLE_AFTER_5S, new HWX(musicModel, hwr));
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((I9X) aRunnableS26S0200000_7.l0).JE((C46156I9o) aRunnableS26S0200000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((ParallelPublishDialogFragment) aRunnableS26S0200000_7.l0).LJLLILLLL.LJ((C43356Gzw) aRunnableS26S0200000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((InterfaceC42534Gmg) aRunnableS26S0200000_7.l0).LIZ((C81392Vwy) aRunnableS26S0200000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            ((View) aRunnableS26S0200000_7.l0).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS194S0100000_7((InterfaceC82683Wch) aRunnableS26S0200000_7.l1, 2));
            ((InterfaceC82683Wch) aRunnableS26S0200000_7.l1).show();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS26S0200000_7 aRunnableS26S0200000_7) {
        boolean LIZ;
        try {
            aRunnableS26S0200000_7.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS26S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
