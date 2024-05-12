package Y;

import X.AbstractC156406Bw;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C142575if;
import X.C142765iy;
import X.C142985jK;
import X.C147295qH;
import X.C152915zL;
import X.C156306Bm;
import X.C156346Bq;
import X.C156356Br;
import X.C156366Bs;
import X.C156376Bt;
import X.C156396Bv;
import X.C156426By;
import X.C157416Ft;
import X.C157426Fu;
import X.C158326Jg;
import X.C161296Ur;
import X.C162236Yh;
import X.C17N;
import X.C34K;
import X.C39579Fg7;
import X.C42802Gr0;
import X.C44384HbQ;
import X.C44729Hgz;
import X.C46104I7o;
import X.C68322mC;
import X.C6BI;
import X.C6G0;
import X.C6G2;
import X.C6H7;
import X.C6JF;
import X.C6JH;
import X.C6JI;
import X.C6JV;
import X.C6JY;
import X.C6OC;
import X.C6RZ;
import X.C6SE;
import X.C6UA;
import X.C6UD;
import X.C73969T1h;
import X.C76732zl;
import X.C79004UzY;
import X.C88517Yob;
import X.C8H9;
import X.EnumC157656Gr;
import X.EnumC161246Um;
import X.H7R;
import X.H9C;
import X.InterfaceC161306Us;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.T16;
import X.ViewOnClickListenerC158316Jf;
import X.W5G;
import X.X1D;
import Y.ACallableS80S0200000_2;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryGlobalStickerComponent;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component.StoryStickerComponent;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS13S0300000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.Object] */
    public final void LIZ$0() {
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        final ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.l0;
        if (activityC45651qj == null) {
            return;
        }
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l1;
        final W5G coverView = (W5G) this.l2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(coverView, "coverView");
        C68322mC c68322mC = new C68322mC();
        OSZ LJJJJZI = C44384HbQ.LJJJJZI(videoPublishEditModel, false);
        if (LJJJJZI != null) {
            c68322mC.element = LJJJJZI.getFirst();
        }
        CharSequence charSequence = (CharSequence) c68322mC.element;
        if (charSequence == null || charSequence.length() == 0 || !C39579Fg7.LIZIZ((String) c68322mC.element)) {
            videoPublishEditModel.generateVideoCoverPath();
            c68322mC.element = videoPublishEditModel.getVideoCoverPath();
            if (H7R.LJJJJL(videoPublishEditModel)) {
                C152915zL.LIZIZ(videoPublishEditModel, new AqS132S0200000_1(coverView, (W5G) c68322mC, (C68322mC<String>) 1));
                return;
            }
            CanvasVideoData canvasVideoData2 = videoPublishEditModel.canvasVideoData;
            if ((canvasVideoData2 != null && C79004UzY.LJJIIZI(canvasVideoData2)) || ((canvasVideoData = videoPublishEditModel.canvasVideoData) != null && C79004UzY.LJJIL(canvasVideoData))) {
                CanvasVideoData canvasVideoData3 = videoPublishEditModel.canvasVideoData;
                if (canvasVideoData3 == null || (sourceInfo = canvasVideoData3.getSourceInfo()) == null || !(!sourceInfo.isEmpty()) || !C39579Fg7.LIZIZ((String) ListProtector.get(sourceInfo, 0))) {
                    return;
                }
                videoPublishEditModel.setVideoCoverPath((String) ListProtector.get(sourceInfo, 0));
                C44729Hgz.LIZLLL(coverView, (String) ListProtector.get(sourceInfo, 0));
                return;
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "creativeInfo");
                multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                videoPublishEditModel.setVideoCoverPath(videoPublishEditModel.multiEditVideoRecordData.coverImagePath);
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
                o.LJIIIIZZ(curMultiEditVideoRecordData, "curMultiEditVideoRecordData");
                final VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
                o.LJIIIIZZ(playInOutTime, "curMultiEditVideoRecordData.playInOutTime");
                LJIIJJI.setTimeRange(((Number) playInOutTime.first).intValue() * 1000, ((Number) playInOutTime.second).intValue() * 1000);
                final C76732zl c76732zl = new C76732zl();
                c76732zl.element = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
                if (videoPublishEditModel.isUseTimeReverseEffect()) {
                    int intValue = ((Number) playInOutTime.second).intValue();
                    Object obj = playInOutTime.first;
                    o.LJIIIIZZ(obj, "playPair.first");
                    c76732zl.element = (intValue - ((Number) obj).intValue()) - c76732zl.element;
                }
                AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.6ZB
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<Drawable> interfaceC73573Su9) {
                        VERecordData vERecordData = VERecordData.this;
                        int i = c76732zl.element;
                        int height = coverView.getHeight();
                        final ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                        int videoThumb = VEUtils.getVideoThumb(vERecordData, i, -1, height, false, new P5A() { // from class: X.6ZC
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v4, types: [T, android.graphics.Bitmap] */
                            /* JADX WARN: Type inference failed for: r1v0, types: [T, android.graphics.Bitmap] */
                            @Override // X.P5A
                            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                                ActivityC45651qj activityC45651qj3 = ActivityC45651qj.this;
                                if (activityC45651qj3 != null) {
                                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                                    InterfaceC73573Su9<Drawable> interfaceC73573Su92 = c73433Srt;
                                    C68322mC c68322mC2 = new C68322mC();
                                    ?? createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                                    c68322mC2.element = createBitmap;
                                    createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                    EffectTextModel effectTextModel = videoPublishEditModel3.getCoverPublishModel().getEffectTextModel();
                                    T bitmap = c68322mC2.element;
                                    o.LJIIIIZZ(bitmap, "bitmap");
                                    c68322mC2.element = effectTextModel.mergeCoverText((Bitmap) bitmap);
                                    C1M5 c1m5 = new C1M5(activityC45651qj3.getResources(), (Bitmap) c68322mC2.element);
                                    c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                                    C10K.LIZJ(new ACallableS80S0200000_2(c68322mC2, videoPublishEditModel3, 1));
                                    interfaceC73573Su92.onNext(c1m5);
                                    interfaceC73573Su92.onComplete();
                                }
                                return false;
                            }
                        });
                        if (videoThumb != 0) {
                            H78.LIZLLL("publish_page_get_cover_error", new Exception(KMP.LJ("VEUtils.getVideoThumb return code=", videoThumb)));
                            interfaceC73573Su9.onComplete();
                        }
                    }
                }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0100000_2(coverView, 0), new InterfaceC64592gB() { // from class: X.6Yn
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj2) {
                        KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
                    }
                });
                return;
            }
            C44729Hgz.LJJIZ(activityC45651qj, coverView, videoPublishEditModel, null);
            return;
        }
        C44729Hgz.LIZLLL(coverView, (String) c68322mC.element);
    }

    public final void LIZ$1() {
        C156396Bv c156396Bv;
        AbstractC156406Bw mBaseView;
        C156426By c156426By = (C156426By) this.l0;
        if (c156426By instanceof C156376Bt) {
            c156396Bv = (C156396Bv) c156426By;
        } else {
            c156396Bv = null;
        }
        if (c156396Bv != null && (mBaseView = c156396Bv.getMBaseView()) != null) {
            mBaseView.LIZ(false);
        }
        ((C156346Bq) this.l1).LJJJ((C156426By) this.l0, (InteractStickerStruct) this.l2);
        ((C156426By) this.l0).setVisibility(0);
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(((C156426By) this.l0).getContext());
        EffectConfiguration build = LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        C156346Bq c156346Bq = (C156346Bq) this.l1;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(build.getEffectDir().getAbsolutePath());
        LIZ2.append("/hashtag_sticker/");
        LIZ2.append(UUID.randomUUID());
        c156346Bq.LJJIJ(X1D.LIZIZ(LIZ2));
        new H9C().LJIIL(((C156346Bq) this.l1).LLI.creativeModel.commerceModel.getMission(), 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0300000_2.LIZ$2():void");
    }

    public final void LIZ$3() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        ((StoryGlobalStickerComponent) this.l1).LLD = StickerContainerService.LIZ().getContainer();
        EnumC161246Um enumC161246Um = EnumC161246Um.INTERACT;
        FrameLayout frameLayout = (FrameLayout) ((View) this.l0);
        C6UA c6ua = new C6UA(enumC161246Um, frameLayout, new C6UD(frameLayout.getWidth(), ((View) this.l0).getHeight(), 28), (ActivityC45651qj) this.l2, new C161296Ur((StoryGlobalStickerComponent) this.l1, null, null, null, 14), null, null, null, null, 992);
        InterfaceC161306Us interfaceC161306Us = ((StoryGlobalStickerComponent) this.l1).LLD;
        if (interfaceC161306Us != null) {
            interfaceC161306Us.LIZIZ(c6ua);
        }
    }

    public final void LIZ$4() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        ((StoryStickerComponent) this.l1).LLD = StickerContainerService.LIZ().getContainer();
        EnumC161246Um enumC161246Um = EnumC161246Um.INTERACT;
        FrameLayout frameLayout = (FrameLayout) ((View) this.l0);
        C6UA c6ua = new C6UA(enumC161246Um, frameLayout, new C6UD(frameLayout.getWidth(), ((View) this.l0).getHeight(), 28), (ActivityC45651qj) this.l2, new C161296Ur((StoryStickerComponent) this.l1, null, null, null, 14), null, null, null, null, 992);
        InterfaceC161306Us interfaceC161306Us = ((StoryStickerComponent) this.l1).LLD;
        if (interfaceC161306Us != null) {
            interfaceC161306Us.LIZIZ(c6ua);
        }
    }

    public final void LIZ$5() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((VideoPublishEditModel) this.l0).multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            if (TextUtils.isEmpty(multiEditVideoStatusRecordData.coverImagePath)) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
                multiEditVideoStatusRecordData2.coverImagePath = C6BI.LIZJ(creativeInfo);
            }
            Bitmap bitmap = (Bitmap) this.l1;
            String str = ((VideoPublishEditModel) this.l0).multiEditVideoRecordData.coverImagePath;
            o.LJIIIIZZ(str, "editModel.multiEditVideoRecordData.coverImagePath");
            C6BI.LIZLLL(bitmap, str, (InterfaceC65784Pro) this.l2);
        }
    }

    public final void LIZ$6() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((VideoPublishEditModel) this.l0).multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            if (TextUtils.isEmpty(multiEditVideoStatusRecordData.coverImagePath)) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                multiEditVideoStatusRecordData2.coverImagePath = C6BI.LIZJ(creativeInfo);
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l0;
                videoPublishEditModel2.setVideoCoverPath(videoPublishEditModel2.multiEditVideoRecordData.coverImagePath);
            }
            Bitmap bitmap = (Bitmap) this.l1;
            String str = ((VideoPublishEditModel) this.l0).multiEditVideoRecordData.coverImagePath;
            o.LJIIIIZZ(str, "model.multiEditVideoRecordData.coverImagePath");
            C6BI.LIZLLL(bitmap, str, new AqS149S0200000_2((VideoPublishEditModel) this.l0, (InterfaceC88472Yns) this.l2, 71));
        }
    }

    public final void LIZ$7() {
        int i;
        if (((View) this.l0).getParent() != null) {
            ((C6OC) this.l1).LJFF.getLocationInWindow(new int[2]);
            int[] iArr = new int[2];
            ((View) this.l0).getLocationInWindow(iArr);
            ((View) this.l2).getLocationInWindow(new int[2]);
            int i2 = iArr[1];
            View view = ((C6OC) this.l1).LJFF;
            ViewGroup.LayoutParams layoutParams = ((View) this.l0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            view.setY((((i2 - i) - ((C6OC) this.l1).LJFF.getHeight()) - ((Number) C88517Yob.LIZ.getValue()).intValue()) - r5[1]);
        }
    }

    public static final void run$0(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            C6G0 c6g0 = ((C157426Fu) aRunnableS13S0300000_2.l0).LLIIIJ;
            if (c6g0 != null) {
                c6g0.LIZ((C157416Ft) aRunnableS13S0300000_2.l1, (C6G2) aRunnableS13S0300000_2.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aRunnableS13S0300000_2.l0;
            C162236Yh.LIZLLL((ActivityC45651qj) aRunnableS13S0300000_2.l2, (W5G) aRunnableS13S0300000_2.l1, videoPublishEditModel);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            if (C142985jK.LIZIZ() == 2) {
                ((C147295qH) aRunnableS13S0300000_2.l0).LLJLLL(true, (C142765iy) aRunnableS13S0300000_2.l1);
            }
            ((Runnable) aRunnableS13S0300000_2.l2).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            AudioRecordActivityViewModel audioRecordActivityViewModel = (AudioRecordActivityViewModel) aRunnableS13S0300000_2.l0;
            audioRecordActivityViewModel.LJLJL = false;
            audioRecordActivityViewModel.iv0((VideoPublishEditModel) aRunnableS13S0300000_2.l2, (EditorProContext) aRunnableS13S0300000_2.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            if (((View) aRunnableS13S0300000_2.l0).getMeasuredHeight() != 0 && ((View) aRunnableS13S0300000_2.l1).getMeasuredHeight() != 0) {
                ((TTResourcePanelFragment) aRunnableS13S0300000_2.l2).hm(((View) aRunnableS13S0300000_2.l1).getMeasuredHeight() + ((View) aRunnableS13S0300000_2.l0).getMeasuredHeight());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            C156426By c156426By = (C156426By) aRunnableS13S0300000_2.l0;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            AbstractC156406Bw<User> mBaseView = ((C156366Bs) c156426By).getMBaseView();
            if (mBaseView != null) {
                mBaseView.LIZ(false);
            }
            ((C156356Br) aRunnableS13S0300000_2.l1).LJJJ((C156426By) aRunnableS13S0300000_2.l0, (InteractStickerStruct) aRunnableS13S0300000_2.l2);
            ((C156366Bs) ((C156426By) aRunnableS13S0300000_2.l0)).setVisibility(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            int width = ((ViewGroup) aRunnableS13S0300000_2.l0).getWidth();
            int LJIILL = C17N.LJIILL(150.0d);
            if (width > LJIILL) {
                int width2 = width - ((TextView) aRunnableS13S0300000_2.l1).getWidth();
                ShootButtonBottomComponent shootButtonBottomComponent = (ShootButtonBottomComponent) aRunnableS13S0300000_2.l2;
                TextView textView = (TextView) aRunnableS13S0300000_2.l1;
                shootButtonBottomComponent.getClass();
                textView.setTextSize(1, 13);
                if (((int) textView.getPaint().measureText(textView.getText().toString())) + width2 > LJIILL) {
                    ShootButtonBottomComponent shootButtonBottomComponent2 = (ShootButtonBottomComponent) aRunnableS13S0300000_2.l2;
                    TextView textView2 = (TextView) aRunnableS13S0300000_2.l1;
                    shootButtonBottomComponent2.getClass();
                    textView2.setTextSize(1, 12);
                    if (((int) textView2.getPaint().measureText(textView2.getText().toString())) + width2 > LJIILL) {
                        ((TextView) aRunnableS13S0300000_2.l1).setMaxWidth(LJIILL - width2);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            super/*X.5HL*/.LJIILJJIL((NLETrack) aRunnableS13S0300000_2.l1, (NLETrackSlot) aRunnableS13S0300000_2.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            super/*X.5HL*/.LJIILJJIL((NLETrack) aRunnableS13S0300000_2.l1, (NLETrackSlot) aRunnableS13S0300000_2.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        C8H9 c8h9;
        try {
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = ((C6JV) aRunnableS13S0300000_2.l0).LLIIIILZ;
            if (viewOnClickListenerC158316Jf != null && (c8h9 = viewOnClickListenerC158316Jf.LJLJJL) != null) {
                c8h9.setVisibility(8);
            }
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = ((C6JV) aRunnableS13S0300000_2.l0).LLIIIILZ;
            if (viewOnClickListenerC158316Jf2 != null) {
                viewOnClickListenerC158316Jf2.LJIIIIZZ((C158326Jg) aRunnableS13S0300000_2.l1, (C6JY) aRunnableS13S0300000_2.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS13S0300000_2.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            ((NLEEditor) aRunnableS13S0300000_2.l1).LIZIZ();
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aRunnableS13S0300000_2.l2;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$22(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            C6JI c6ji = ((C6JF) aRunnableS13S0300000_2.l0).LLIIJI;
            if (c6ji != null) {
                c6ji.LIZLLL((C6JH) ((C68322mC) aRunnableS13S0300000_2.l1).element, (C156306Bm) ((C68322mC) aRunnableS13S0300000_2.l2).element);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        C156376Bt c156376Bt;
        AbstractC156406Bw<C42802Gr0> mBaseView;
        try {
            C156426By c156426By = (C156426By) aRunnableS13S0300000_2.l0;
            if (c156426By instanceof C156376Bt) {
                c156376Bt = (C156376Bt) c156426By;
            } else {
                c156376Bt = null;
            }
            if (c156376Bt != null && (mBaseView = c156376Bt.getMBaseView()) != null) {
                mBaseView.LIZ(false);
            }
            ((C156346Bq) aRunnableS13S0300000_2.l1).LJJJ((C156426By) aRunnableS13S0300000_2.l0, (InteractStickerStruct) aRunnableS13S0300000_2.l2);
            ((C156426By) aRunnableS13S0300000_2.l0).setVisibility(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            C6H7 c6h7 = ((C6RZ) aRunnableS13S0300000_2.l0).LLFII;
            if (c6h7 != null) {
                c6h7.P7((EnumC157656Gr) aRunnableS13S0300000_2.l1, (C6SE) aRunnableS13S0300000_2.l2);
            } else {
                o.LJIJI("stickerService");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            if (((C34K) aRunnableS13S0300000_2.l0).element) {
                C142575if c142575if = ((NowsEditRootScene) aRunnableS13S0300000_2.l1).LJLLILLLL;
                if (c142575if != null) {
                    c142575if.Iq0();
                    ((C34K) aRunnableS13S0300000_2.l0).element = false;
                } else {
                    o.LJIJI("editPreviewApi");
                    throw null;
                }
            }
            ((Runnable) aRunnableS13S0300000_2.l2).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS13S0300000_2 aRunnableS13S0300000_2) {
        boolean LIZ;
        try {
            aRunnableS13S0300000_2.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS13S0300000_2(X.C156426By r2, X.C156346Bq r3, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L10;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0300000_2.<init>(X.6By, X.6Bq, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS13S0300000_2(X.ActivityC45651qj r2, X.C164096cH r3, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0300000_2.<init>(X.1qj, X.6cH, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):void");
    }

    public ARunnableS13S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
