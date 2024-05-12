package ud2;

import X.AbstractC163776bl;
import X.AbstractC164296cb;
import X.AbstractC42651GoZ;
import X.AbstractC82618Wbe;
import X.ActivityC45651qj;
import X.AnonymousClass621;
import X.AnonymousClass692;
import X.C124234uB;
import X.C134665Qg;
import X.C138495c5;
import X.C138595cF;
import X.C138805ca;
import X.C139305dO;
import X.C139875eJ;
import X.C141535gz;
import X.C142575if;
import X.C143595kJ;
import X.C143665kQ;
import X.C143805ke;
import X.C143965ku;
import X.C145225mw;
import X.C145515nP;
import X.C146295of;
import X.C146305og;
import X.C146435ot;
import X.C146445ou;
import X.C146455ov;
import X.C146465ow;
import X.C146475ox;
import X.C146555p5;
import X.C146575p7;
import X.C146815pV;
import X.C146945pi;
import X.C147095px;
import X.C147295qH;
import X.C147785r4;
import X.C147975rN;
import X.C147985rO;
import X.C147995rP;
import X.C148035rT;
import X.C148065rW;
import X.C148785sg;
import X.C149005t2;
import X.C149145tG;
import X.C149285tU;
import X.C149295tV;
import X.C149355tb;
import X.C150935w9;
import X.C151055wL;
import X.C152175y9;
import X.C153135zh;
import X.C1538161x;
import X.C156226Be;
import X.C156296Bl;
import X.C156566Cm;
import X.C156906Du;
import X.C157356Fn;
import X.C157546Gg;
import X.C158636Kl;
import X.C159116Mh;
import X.C163096af;
import X.C163826bq;
import X.C164186cQ;
import X.C164436cp;
import X.C168346j8;
import X.C173426rK;
import X.C19N;
import X.C275416g;
import X.C275516h;
import X.C41047G9b;
import X.C42210GhS;
import X.C45929I0v;
import X.C46066I6c;
import X.C51W;
import X.C5LF;
import X.C5PB;
import X.C5U1;
import X.C5V0;
import X.C5VA;
import X.C5ZZ;
import X.C60903NvH;
import X.C61447O9r;
import X.C62O;
import X.C63C;
import X.C66D;
import X.C6EC;
import X.C6EF;
import X.C6H3;
import X.C6JB;
import X.C6JS;
import X.C6WG;
import X.C6XR;
import X.C6XT;
import X.C78915Uy7;
import X.C78926UyI;
import X.C78927UyJ;
import X.C78934UyQ;
import X.C82149WLx;
import X.C82586Wb8;
import X.C82622Wbi;
import X.C83345WnN;
import X.C83374Wnq;
import X.C83399WoF;
import X.C83403WoJ;
import X.E9Q;
import X.HEB;
import X.InterfaceC1546365b;
import X.InterfaceC82231WPb;
import X.InterfaceC82236WPg;
import X.InterfaceC84498XEg;
import X.TIU;
import X.W32;
import X.WM7;
import X.WMH;
import X.WPG;
import X.WUR;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.image.crop.ImageCropViewModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.Video2StickerEditRootScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ApS178S0200000_2 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC82618Wbe
    public final Object LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            case 5:
                return LIZIZ$5(this, c82622Wbi);
            case 6:
                return LIZIZ$6(this, c82622Wbi);
            case 7:
                return LIZIZ$7(this, c82622Wbi);
            case 8:
                return LIZIZ$8(this, c82622Wbi);
            case 9:
                return LIZIZ$9(this, c82622Wbi);
            case 10:
                return LIZIZ$10(this, c82622Wbi);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this, c82622Wbi);
            case 12:
                return LIZIZ$12(this, c82622Wbi);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this, c82622Wbi);
            case 14:
                return LIZIZ$14(this, c82622Wbi);
            case 15:
                return LIZIZ$15(this, c82622Wbi);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZIZ$16(this, c82622Wbi);
            case 17:
                return LIZIZ$17(this, c82622Wbi);
            case 18:
                return LIZIZ$18(this, c82622Wbi);
            case 19:
                return LIZIZ$19(this, c82622Wbi);
            case 20:
                return LIZIZ$20(this, c82622Wbi);
            case 21:
                return LIZIZ$21(this, c82622Wbi);
            case 22:
                return LIZIZ$22(this, c82622Wbi);
            case 23:
                return LIZIZ$23(this, c82622Wbi);
            case 24:
                return LIZIZ$24(this, c82622Wbi);
            case 25:
                return LIZIZ$25(this, c82622Wbi);
            case 26:
                return LIZIZ$26(this, c82622Wbi);
            case 27:
                return LIZIZ$27(this, c82622Wbi);
            case 28:
                return LIZIZ$28(this, c82622Wbi);
            case 29:
                return LIZIZ$29(this, c82622Wbi);
            case 30:
                return LIZIZ$30(this, c82622Wbi);
            case 31:
                return LIZIZ$31(this, c82622Wbi);
            case 32:
                return LIZIZ$32(this, c82622Wbi);
            case 33:
                return LIZIZ$33(this, c82622Wbi);
            case 34:
                return LIZIZ$34(this, c82622Wbi);
            case 35:
                return LIZIZ$35(this, c82622Wbi);
            case 36:
                return LIZIZ$36(this, c82622Wbi);
            case 37:
                return LIZIZ$37(this, c82622Wbi);
            case 38:
                return LIZIZ$38(this, c82622Wbi);
            case 39:
                return LIZIZ$39(this, c82622Wbi);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return LIZIZ$40(this, c82622Wbi);
            case 41:
                return LIZIZ$41(this, c82622Wbi);
            case 42:
                return LIZIZ$42(this, c82622Wbi);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return LIZIZ$43(this, c82622Wbi);
            case 44:
                return LIZIZ$44(this, c82622Wbi);
            case 45:
                return LIZIZ$45(this, c82622Wbi);
            case 46:
                return LIZIZ$46(this, c82622Wbi);
            case 47:
                return LIZIZ$47(this, c82622Wbi);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return LIZIZ$48(this, c82622Wbi);
            case C61447O9r.LJIIJ:
                return LIZIZ$49(this, c82622Wbi);
            case 50:
                return LIZIZ$50(this, c82622Wbi);
            case 51:
                return LIZIZ$51(this, c82622Wbi);
            case 52:
                return LIZIZ$52(this, c82622Wbi);
            case 53:
                return LIZIZ$53(this, c82622Wbi);
            case 54:
                return LIZIZ$54(this, c82622Wbi);
            case 55:
                return LIZIZ$55(this, c82622Wbi);
            case 56:
                return LIZIZ$56(this, c82622Wbi);
            case 57:
                return LIZIZ$57(this, c82622Wbi);
            case 58:
                return LIZIZ$58(this, c82622Wbi);
            case 59:
                return LIZIZ$59(this, c82622Wbi);
            case 60:
                return LIZIZ$60(this, c82622Wbi);
            case 61:
                return LIZIZ$61(this, c82622Wbi);
            case BaseNotice.CREATOR /* 62 */:
                return LIZIZ$62(this, c82622Wbi);
            case 63:
                return LIZIZ$63(this, c82622Wbi);
            case 64:
                return LIZIZ$64(this, c82622Wbi);
            case 65:
                return LIZIZ$65(this, c82622Wbi);
            case 66:
                return LIZIZ$66(this, c82622Wbi);
            case 67:
                return LIZIZ$67(this, c82622Wbi);
            case 68:
                return LIZIZ$68(this, c82622Wbi);
            case 69:
                return LIZIZ$69(this, c82622Wbi);
            case 70:
                return LIZIZ$70(this, c82622Wbi);
            case 71:
                return LIZIZ$71(this, c82622Wbi);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return LIZIZ$72(this, c82622Wbi);
            case 73:
                return LIZIZ$73(this, c82622Wbi);
            case 74:
                return LIZIZ$74(this, c82622Wbi);
            case 75:
                return LIZIZ$75(this, c82622Wbi);
            case 76:
                return LIZIZ$76(this, c82622Wbi);
            case 77:
                return LIZIZ$77(this, c82622Wbi);
            case 78:
                return LIZIZ$78(this, c82622Wbi);
            case 79:
                return LIZIZ$79(this, c82622Wbi);
            case 80:
                return LIZIZ$80(this, c82622Wbi);
            case 81:
                return LIZIZ$81(this, c82622Wbi);
            case 82:
                return LIZIZ$82(this, c82622Wbi);
            case 83:
                return LIZIZ$83(this, c82622Wbi);
            case 84:
                return LIZIZ$84(this, c82622Wbi);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return LIZIZ$85(this, c82622Wbi);
            case 86:
                return LIZIZ$86(this, c82622Wbi);
            case 87:
                return LIZIZ$87(this, c82622Wbi);
            case 88:
                return LIZIZ$88(this, c82622Wbi);
            case 89:
                return LIZIZ$89(this, c82622Wbi);
            case 90:
                return LIZIZ$90(this, c82622Wbi);
            case 91:
                return LIZIZ$91(this, c82622Wbi);
            case 92:
                return LIZIZ$92(this, c82622Wbi);
            case 93:
                return LIZIZ$93(this, c82622Wbi);
            case 94:
                return LIZIZ$94(this, c82622Wbi);
            case 95:
                return LIZIZ$95(this, c82622Wbi);
            case 96:
                return LIZIZ$96(this, c82622Wbi);
            case 97:
                return LIZIZ$97(this, c82622Wbi);
            case 98:
                return LIZIZ$98(this, c82622Wbi);
            case 99:
                return LIZIZ$99(this, c82622Wbi);
            case 100:
                return LIZIZ$100(this, c82622Wbi);
            case 101:
                return LIZIZ$101(this, c82622Wbi);
            case 102:
                return LIZIZ$102(this, c82622Wbi);
            case 103:
                return LIZIZ$103(this, c82622Wbi);
            case 104:
                return LIZIZ$104(this, c82622Wbi);
            case 105:
                return LIZIZ$105(this, c82622Wbi);
            case 106:
                return LIZIZ$106(this, c82622Wbi);
            case 107:
                return LIZIZ$107(this, c82622Wbi);
            case 108:
                return LIZIZ$108(this, c82622Wbi);
            case 109:
                return LIZIZ$109(this, c82622Wbi);
            case 110:
                return LIZIZ$110(this, c82622Wbi);
            case 111:
                return LIZIZ$111(this, c82622Wbi);
            case 112:
                return LIZIZ$112(this, c82622Wbi);
            case 113:
                return LIZIZ$113(this, c82622Wbi);
            case 114:
                return LIZIZ$114(this, c82622Wbi);
            case 115:
                return LIZIZ$115(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        VideoPublishEditModel videoPublishEditModel = ((Video2StickerEditRootScene) apS178S0200000_2.l1).LJLJJL;
        if (videoPublishEditModel != null) {
            C143965ku c143965ku = new C143965ku(container, C78927UyJ.LIZLLL(videoPublishEditModel, container), C143665kQ.LJLIL);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c143965ku.afterInit$als_release(uptimeMillis);
            return c143965ku;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object LIZIZ$1(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        View requireViewById = ((Video2StickerEditRootScene) apS178S0200000_2.l1).requireViewById(R.id.cpo);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.edit_sticker_container)");
        View requireViewById2 = ((Video2StickerEditRootScene) apS178S0200000_2.l1).requireViewById(R.id.h04);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.new_sticker_higher_layer)");
        C157546Gg c157546Gg = new C157546Gg(container, (FrameLayout) requireViewById, (FrameLayout) requireViewById2);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c157546Gg.afterInit$als_release(uptimeMillis);
        return c157546Gg;
    }

    public static final Object LIZIZ$10(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = nowsEditRootScene.LJLL;
        if (videoPublishEditModel != null) {
            C45929I0v c45929I0v = new C45929I0v(container, nowsEditRootScene, R.id.fns, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c45929I0v.afterInit$als_release(uptimeMillis);
            return c45929I0v;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object LIZIZ$100(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145225mw c145225mw = new C145225mw(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145225mw.afterInit$als_release(uptimeMillis);
        return c145225mw;
    }

    public static final Object LIZIZ$101(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146305og c146305og = new C146305og(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fmn);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146305og.afterInit$als_release(uptimeMillis);
        return c146305og;
    }

    public static final Object LIZIZ$102(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145515nP c145515nP = new C145515nP(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145515nP.afterInit$als_release(uptimeMillis);
        return c145515nP;
    }

    public static final Object LIZIZ$103(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LJLLJ;
        if (videoPublishEditModel != null) {
            C45929I0v c45929I0v = new C45929I0v(container, imageEditRootScene, R.id.fns, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c45929I0v.afterInit$als_release(uptimeMillis);
            return c45929I0v;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$104(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LJLLJ;
        if (videoPublishEditModel != null) {
            VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(videoPublishEditModel, 0, 0, 7);
            ImageEditRootScene imageEditRootScene2 = (ImageEditRootScene) apS178S0200000_2.l1;
            AqS168S0100000_2 aqS168S0100000_2 = imageEditRootScene2.LLJJ;
            View requireViewById = imageEditRootScene2.requireViewById(R.id.n9y);
            o.LJIIIIZZ(requireViewById, "requireViewById(R.id.viewPager)");
            C148785sg c148785sg = new C148785sg(imageEditRootScene, container, LJJJJZ, aqS168S0100000_2, (C152175y9) requireViewById, ((ImageEditRootScene) apS178S0200000_2.l1).LJLLLL, C146555p5.LJLIL);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c148785sg.afterInit$als_release(uptimeMillis);
            return c148785sg;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$105(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC164296cb abstractC164296cb = new AbstractC164296cb(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fns) { // from class: X.5w8
            public final C82622Wbi LJLLLL;
            public final C5H3 LJLLLLLL;

            @Override // X.AbstractC164296cb
            /* renamed from: LJJLIIIJLLLLLLLZ, reason: merged with bridge method [inline-methods] */
            public C150905w6 LJJLIIIIJ() {
                return (C150905w6) this.LJLLLLLL.getValue();
            }

            @Override // X.AbstractC164296cb, X.InterfaceC135635Tz
            public C82622Wbi getDiContainer() {
                return this.LJLLLL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(container, parentScene, r5);
                o.LJIIIZ(container, "diContainer");
                o.LJIIIZ(parentScene, "parentScene");
                this.LJLLLL = container;
                this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 89));
            }
        };
        ((C275416g) apS178S0200000_2.l0).getClass();
        abstractC164296cb.afterInit$als_release(uptimeMillis);
        return abstractC164296cb;
    }

    public static final Object LIZIZ$106(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        InterfaceC82236WPg LJI = C60903NvH.LJIIJJI().LJIILL().LJI();
        InterfaceC84498XEg LIZIZ = C60903NvH.LJIIJJI().LJIILL().LIZIZ();
        final ImageEditRootScene imageEditRootScene2 = (ImageEditRootScene) apS178S0200000_2.l1;
        imageEditRootScene2.getClass();
        WPG wpg = new WPG(container, imageEditRootScene, R.id.fns, LJI, LIZIZ, new InterfaceC82231WPb() { // from class: X.5oW
            @Override // X.InterfaceC82231WPb
            public final void pg(String name) {
                o.LJIIIZ(name, "name");
            }

            @Override // X.InterfaceC82231WPb
            public final void H60(boolean z, FilterBean filterBean) {
                InterfaceC150615vd interfaceC150615vd = ImageEditRootScene.this.LLFFF;
                if (interfaceC150615vd != null) {
                    boolean z2 = !z;
                    interfaceC150615vd.U2(z2, false, z2);
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void P30(float f, boolean z) {
                InterfaceC150685vk interfaceC150685vk;
                if (z && (interfaceC150685vk = ImageEditRootScene.this.LLIIL) != null) {
                    interfaceC150685vk.Pr();
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void nz(FilterBean filterBean, boolean z, Context context) {
                String str;
                if (filterBean != null) {
                    InterfaceC150615vd interfaceC150615vd = ImageEditRootScene.this.LLFFF;
                    o.LJI(interfaceC150615vd);
                    InterfaceC148845sm value = interfaceC150615vd.Nm().getValue();
                    o.LJI(value);
                    InterfaceC150615vd interfaceC150615vd2 = ImageEditRootScene.this.LLFFF;
                    o.LJI(interfaceC150615vd2);
                    InterfaceC122704ri value2 = interfaceC150615vd2.v50().getValue();
                    o.LJI(value2);
                    float LIZJ = TML.LIZJ(filterBean, value, value2);
                    if (context != null) {
                        VideoPublishEditModel videoPublishEditModel = ImageEditRootScene.this.LJLLJ;
                        if (videoPublishEditModel != null) {
                            if (z) {
                                str = "slide";
                            } else {
                                str = "click";
                            }
                            H8F.LJJJI(videoPublishEditModel, str, filterBean.getEnName(), filterBean.getId(), LIZJ);
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                }
                InterfaceC150685vk interfaceC150685vk = ImageEditRootScene.this.LLIIL;
                if (interfaceC150685vk != null) {
                    interfaceC150685vk.Pr();
                }
            }
        }, new AqS180S0100000_14((ImageEditRootScene) apS178S0200000_2.l1, 297));
        ((C275416g) apS178S0200000_2.l0).getClass();
        wpg.afterInit$als_release(uptimeMillis);
        return wpg;
    }

    public static final Object LIZIZ$107(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        TIU tiu = new TIU(container, (ImageEditRootScene) apS178S0200000_2.l1, C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(0), C60903NvH.LJIIJJI().LJIILL().LJI());
        ((C275416g) apS178S0200000_2.l0).getClass();
        tiu.afterInit$als_release(uptimeMillis);
        return tiu;
    }

    public static final Object LIZIZ$108(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        int i = R.id.fns;
        View requireViewById = imageEditRootScene.requireViewById(R.id.n9y);
        o.LJIIIIZZ(requireViewById, "requireViewById(id.viewPager)");
        W32 w32 = new W32(container, imageEditRootScene, i, (C152175y9) requireViewById, 0, true, ((Boolean) C146575p7.LIZ.getValue()).booleanValue(), 16);
        ((C275416g) apS178S0200000_2.l0).getClass();
        w32.afterInit$als_release(uptimeMillis);
        return w32;
    }

    public static final Object LIZIZ$109(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC163776bl<ImageCropViewModel> abstractC163776bl = new AbstractC163776bl<ImageCropViewModel>((ImageEditRootScene) apS178S0200000_2.l1, container) { // from class: X.5xB
            public final WMH LJLJLJ;
            public final int LJLJLLL;
            public final C82622Wbi LJLL;
            public ViewOnClickListenerC151455wz LJLLI;

            @Override // X.AbstractC165596eh
            public final void LJJLIIIJJIZ() {
                ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = this.LJLLI;
                if (viewOnClickListenerC151455wz != null) {
                    viewOnClickListenerC151455wz.LLJJIII(false);
                }
            }

            @Override // X.AbstractC165596eh
            public final void LJJLIIIJLLLLLLLZ() {
                if (this.LJLLI == null) {
                    ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = new ViewOnClickListenerC151455wz(this.LJLL);
                    this.LJLLI = viewOnClickListenerC151455wz;
                    this.LJLJLJ.add(this.LJLJLLL, viewOnClickListenerC151455wz, "ImageCropScene");
                }
                ViewOnClickListenerC151455wz viewOnClickListenerC151455wz2 = this.LJLLI;
                if (viewOnClickListenerC151455wz2 != null) {
                    viewOnClickListenerC151455wz2.LLJJIII(true);
                }
            }

            @Override // X.AbstractC165596eh
            public final WMH LJJLI() {
                return this.LJLJLJ;
            }

            @Override // X.AbstractC165596eh
            public final InterfaceC65784Pro<ImageCropViewModel> LJJLIIIJILLIZJL() {
                return C151695xN.LJLIL;
            }

            {
                o.LJIIIZ(parentScene, "parentScene");
                o.LJIIIZ(container, "rootIOCContainer");
                this.LJLJLJ = parentScene;
                this.LJLJLLL = R.id.fhq;
                this.LJLL = container;
            }
        };
        ((C275416g) apS178S0200000_2.l0).getClass();
        abstractC163776bl.afterInit$als_release(uptimeMillis);
        return abstractC163776bl;
    }

    public static final Object LIZIZ$11(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        E9Q e9q = new E9Q(container);
        VideoPublishEditModel videoPublishEditModel = ((NowsEditRootScene) apS178S0200000_2.l1).LJLL;
        if (videoPublishEditModel != null) {
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            if (musicBuzModel.needAddRecent) {
                musicBuzModel.needAddRecent = false;
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                if (extractAVMusic != null) {
                    MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                    VideoPublishEditModel videoPublishEditModel2 = ((NowsEditRootScene) apS178S0200000_2.l1).LJLL;
                    if (videoPublishEditModel2 != null) {
                        String musicOrigin = videoPublishEditModel2.getMusicOrigin();
                        o.LJIIIIZZ(musicOrigin, "model.musicOrigin");
                        e9q.Lp(LJJIJIL, musicOrigin);
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                }
            }
            ((C275416g) apS178S0200000_2.l0).getClass();
            e9q.afterInit$als_release(uptimeMillis);
            return e9q;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object LIZIZ$110(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C41047G9b c41047G9b = new C41047G9b(container);
        ((ImageEditRootScene) apS178S0200000_2.l1).LLILLIZIL = c41047G9b;
        ((C275416g) apS178S0200000_2.l0).getClass();
        c41047G9b.afterInit$als_release(uptimeMillis);
        return c41047G9b;
    }

    public static final Object LIZIZ$111(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C163826bq c163826bq = new C163826bq(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c163826bq.afterInit$als_release(uptimeMillis);
        return c163826bq;
    }

    public static final Object LIZIZ$112(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C164186cQ c164186cQ = new C164186cQ((WMH) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c164186cQ.afterInit$als_release(uptimeMillis);
        return c164186cQ;
    }

    public static final Object LIZIZ$113(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C143595kJ c143595kJ = new C143595kJ((WMH) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c143595kJ.afterInit$als_release(uptimeMillis);
        return c143595kJ;
    }

    public static final Object LIZIZ$114(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146945pi c146945pi = (C146945pi) apS178S0200000_2.l1;
        FrameLayout frameLayout = c146945pi.LJLL;
        if (frameLayout != null) {
            C149005t2 c149005t2 = new C149005t2(container, c146945pi, frameLayout);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c149005t2.afterInit$als_release(uptimeMillis);
            return c149005t2;
        }
        o.LJIJI("textLayout");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.5rL] */
    public static final Object LIZIZ$115(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        Integer maxStickerCount;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C78934UyQ.LJLIL.getSpService().getClass();
        Integer num = (Integer) new C66D().LIZ();
        if (num == null || num.intValue() != 0) {
            C78934UyQ.LJLIL.getSpService().getClass();
            maxStickerCount = (Integer) new C66D().LIZ();
        } else {
            maxStickerCount = 30;
        }
        final C146945pi c146945pi = (C146945pi) apS178S0200000_2.l1;
        ?? r3 = new InterfaceC1546365b() { // from class: X.5rL
            @Override // X.InterfaceC1546365b
            public final InfoStickerModel LIZ() {
                return C146945pi.this.LLJILJILJ().infoStickerModel;
            }
        };
        o.LJIIIIZZ(maxStickerCount, "maxStickerCount");
        C147995rP c147995rP = new C147995rP(container, c146945pi, r3, maxStickerCount.intValue());
        ((C275416g) apS178S0200000_2.l0).getClass();
        c147995rP.afterInit$als_release(uptimeMillis);
        return c147995rP;
    }

    public static final Object LIZIZ$12(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145225mw c145225mw = new C145225mw(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.dpw);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145225mw.afterInit$als_release(uptimeMillis);
        return c145225mw;
    }

    public static final Object LIZIZ$13(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.fju, true);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$14(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C41047G9b c41047G9b = new C41047G9b(container);
        ((NowsEditRootScene) apS178S0200000_2.l1).LLIFFJFJJ = c41047G9b;
        ((C275416g) apS178S0200000_2.l0).getClass();
        c41047G9b.afterInit$als_release(uptimeMillis);
        return c41047G9b;
    }

    public static final Object LIZIZ$15(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145515nP c145515nP = new C145515nP(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.dpw);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145515nP.afterInit$als_release(uptimeMillis);
        return c145515nP;
    }

    public static final Object LIZIZ$16(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5LF c5lf = new C5LF((NowsEditRootScene) apS178S0200000_2.l1, container, R.id.fi3);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5lf.afterInit$als_release(uptimeMillis);
        return c5lf;
    }

    public static final Object LIZIZ$17(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5VA c5va = new C5VA(container, new AqS152S0100000_2((NowsEditRootScene) apS178S0200000_2.l1, 127));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5va.afterInit$als_release(uptimeMillis);
        return c5va;
    }

    public static final Object LIZIZ$18(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        TIU tiu = new TIU(container, (NowsEditRootScene) apS178S0200000_2.l1, C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(0), C60903NvH.LJIIJJI().LJIILL().LJI());
        ((C275416g) apS178S0200000_2.l0).getClass();
        tiu.afterInit$als_release(uptimeMillis);
        return tiu;
    }

    public static final Object LIZIZ$19(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        InterfaceC84498XEg LIZIZ;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) apS178S0200000_2.l1;
        InterfaceC82236WPg LJI = C60903NvH.LJIIJJI().LJIILL().LJI();
        if (C19N.LJ("studio_fix_effect_platform_anr", true)) {
            LIZIZ = (InterfaceC84498XEg) container.LJ(InterfaceC84498XEg.class, null);
        } else {
            LIZIZ = C60903NvH.LJIIJJI().LJIILL().LIZIZ();
        }
        final NowsEditRootScene nowsEditRootScene2 = (NowsEditRootScene) apS178S0200000_2.l1;
        nowsEditRootScene2.getClass();
        WPG wpg = new WPG(container, nowsEditRootScene, R.id.dpw, LJI, LIZIZ, new InterfaceC82231WPb() { // from class: X.5sj
            @Override // X.InterfaceC82231WPb
            public final void pg(String name) {
                o.LJIIIZ(name, "name");
            }

            @Override // X.InterfaceC82231WPb
            public final void H60(boolean z, FilterBean filterBean) {
                C142575if c142575if = NowsEditRootScene.this.LJLLILLLL;
                if (c142575if != null) {
                    boolean z2 = !z;
                    c142575if.U2(z2, false, z2);
                } else {
                    o.LJIJI("editPreviewApi");
                    throw null;
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void P30(float f, boolean z) {
                FilterBean filterBean;
                C142575if c142575if = NowsEditRootScene.this.LJLLILLLL;
                if (c142575if != null) {
                    C140415fB value = c142575if.Dm().getValue();
                    if (value != null && (filterBean = value.LJLILLLLZI) != null) {
                        NowsEditRootScene nowsEditRootScene3 = NowsEditRootScene.this;
                        C142575if c142575if2 = nowsEditRootScene3.LJLLILLLL;
                        if (c142575if2 != null) {
                            InterfaceC148845sm value2 = c142575if2.Nm().getValue();
                            if (value2 != null) {
                                InterfaceC148845sm interfaceC148845sm = value2;
                                C142575if c142575if3 = nowsEditRootScene3.LJLLILLLL;
                                if (c142575if3 != null) {
                                    InterfaceC122704ri value3 = c142575if3.v50().getValue();
                                    if (value3 != null) {
                                        InterfaceC122704ri interfaceC122704ri = value3;
                                        VideoPublishEditModel videoPublishEditModel = nowsEditRootScene3.LJLL;
                                        if (videoPublishEditModel != null) {
                                            videoPublishEditModel.mSelectedFilterIntensity = interfaceC148845sm.LIZ(filterBean, interfaceC122704ri) / 100;
                                            return;
                                        } else {
                                            o.LJIJI("model");
                                            throw null;
                                        }
                                    }
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                o.LJIJI("editPreviewApi");
                                throw null;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        o.LJIJI("editPreviewApi");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("editPreviewApi");
                throw null;
            }

            @Override // X.InterfaceC82231WPb
            public final void nz(FilterBean filterBean, boolean z, Context context) {
                if (filterBean != null) {
                    C142575if c142575if = NowsEditRootScene.this.LJLLILLLL;
                    if (c142575if != null) {
                        InterfaceC148845sm value = c142575if.Nm().getValue();
                        if (value != null) {
                            InterfaceC148845sm interfaceC148845sm = value;
                            C142575if c142575if2 = NowsEditRootScene.this.LJLLILLLL;
                            if (c142575if2 != null) {
                                InterfaceC122704ri value2 = c142575if2.v50().getValue();
                                if (value2 != null) {
                                    InterfaceC122704ri interfaceC122704ri = value2;
                                    VideoPublishEditModel videoPublishEditModel = NowsEditRootScene.this.LJLL;
                                    if (videoPublishEditModel != null) {
                                        videoPublishEditModel.mSelectedId = TMC.LJIJ(filterBean, C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL());
                                        videoPublishEditModel.mSelectedFilterId = String.valueOf(filterBean.getId());
                                        videoPublishEditModel.mSelectedFilterLabel = filterBean.getEnName();
                                        videoPublishEditModel.mSelectedFilterResId = filterBean.getResId();
                                        videoPublishEditModel.mSelectedFilterIntensity = interfaceC148845sm.LIZ(filterBean, interfaceC122704ri) / 100;
                                        C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 3);
                                        C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 7);
                                        C46104I7o.LJJJI(filterBean.getResId(), 6);
                                        C5UD applicationService = C78934UyQ.LJLIL.getApplicationService();
                                        VideoPublishEditModel videoPublishEditModel2 = NowsEditRootScene.this.LJLL;
                                        if (videoPublishEditModel2 != null) {
                                            String contentType = videoPublishEditModel2.getAvetParameter().getContentType();
                                            String enName = filterBean.getEnName();
                                            applicationService.getClass();
                                            C148855sn c148855sn = new C148855sn();
                                            c148855sn.LJIILJJIL = contentType;
                                            c148855sn.LJIILL = "mid_page";
                                            c148855sn.LJIILLIIL = enName;
                                            c148855sn.LJIILIIL();
                                            if (context != null) {
                                                if (z) {
                                                    VideoPublishEditModel videoPublishEditModel3 = NowsEditRootScene.this.LJLL;
                                                    if (videoPublishEditModel3 != null) {
                                                        H8F.LJJJI(videoPublishEditModel3, "slide", filterBean.getEnName(), filterBean.getId(), videoPublishEditModel3.mSelectedFilterIntensity);
                                                        return;
                                                    } else {
                                                        o.LJIJI("model");
                                                        throw null;
                                                    }
                                                }
                                                VideoPublishEditModel videoPublishEditModel4 = NowsEditRootScene.this.LJLL;
                                                if (videoPublishEditModel4 != null) {
                                                    H8F.LJJJI(videoPublishEditModel4, "click", filterBean.getEnName(), filterBean.getId(), videoPublishEditModel4.mSelectedFilterIntensity);
                                                    return;
                                                } else {
                                                    o.LJIJI("model");
                                                    throw null;
                                                }
                                            }
                                            return;
                                        }
                                        o.LJIJI("model");
                                        throw null;
                                    }
                                    o.LJIJI("model");
                                    throw null;
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            o.LJIJI("editPreviewApi");
                            throw null;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    o.LJIJI("editPreviewApi");
                    throw null;
                }
                VideoPublishEditModel videoPublishEditModel5 = NowsEditRootScene.this.LJLL;
                if (videoPublishEditModel5 != null) {
                    videoPublishEditModel5.mSelectedId = 0;
                    videoPublishEditModel5.mSelectedFilterId = "";
                    videoPublishEditModel5.mSelectedFilterLabel = "";
                    videoPublishEditModel5.mSelectedFilterResId = "";
                    return;
                }
                o.LJIJI("model");
                throw null;
            }
        }, new AqS180S0100000_14((NowsEditRootScene) apS178S0200000_2.l1, 119));
        ((C275416g) apS178S0200000_2.l0).getClass();
        wpg.afterInit$als_release(uptimeMillis);
        return wpg;
    }

    public static final Object LIZIZ$2(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83399WoF c83399WoF = new C83399WoF(container, (C5ZZ) apS178S0200000_2.l1, R.id.ni);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c83399WoF.afterInit$als_release(uptimeMillis);
        return c83399WoF;
    }

    public static final Object LIZIZ$20(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        View requireViewById = ((NowsEditRootScene) apS178S0200000_2.l1).requireViewById(R.id.kuk);
        o.LJIIIIZZ(requireViewById, "requireViewById<ViewGroup>(R.id.surface_container)");
        View requireViewById2 = ((NowsEditRootScene) apS178S0200000_2.l1).requireViewById(R.id.egy);
        o.LJIIIIZZ(requireViewById2, "requireViewById<ViewGroup>(R.id.image_container)");
        ViewGroup viewGroup = (ViewGroup) requireViewById2;
        VideoPublishEditModel videoPublishEditModel = ((NowsEditRootScene) apS178S0200000_2.l1).LJLL;
        if (videoPublishEditModel != null) {
            C142575if c142575if = new C142575if(container, requireViewById, viewGroup, C78927UyJ.LIZLLL(videoPublishEditModel, container), ((NowsEditRootScene) apS178S0200000_2.l1).LJLJJLL);
            ((NowsEditRootScene) apS178S0200000_2.l1).LJLLILLLL = c142575if;
            ((C275416g) apS178S0200000_2.l0).getClass();
            c142575if.afterInit$als_release(uptimeMillis);
            return c142575if;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object LIZIZ$21(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C141535gz c141535gz = new C141535gz(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.d9x);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c141535gz.afterInit$als_release(uptimeMillis);
        return c141535gz;
    }

    public static final Object LIZIZ$22(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) apS178S0200000_2.l1;
        C163096af c163096af = new C163096af(container, nowsEditRootScene, R.id.fns, new AqS152S0100000_2(nowsEditRootScene, 129));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c163096af.afterInit$als_release(uptimeMillis);
        return c163096af;
    }

    public static final Object LIZIZ$23(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        SAAActivity sAAActivity = (SAAActivity) apS178S0200000_2.l0;
        VideoPublishEditModel mModel = ((VideoEditContainerScene) apS178S0200000_2.l1).LJZL;
        o.LJIIIIZZ(mModel, "mModel");
        return new C156906Du(sAAActivity, mModel, new AqS152S0100000_2((VideoEditContainerScene) apS178S0200000_2.l1, 248));
    }

    public static final Object LIZIZ$24(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        String string;
        EditEffectAnchorManager data;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) apS178S0200000_2.l1;
        VideoPublishEditModel mModel = videoEditContainerScene.LJZL;
        o.LJIIIIZZ(mModel, "mModel");
        VEPreviewParams LIZLLL = C78927UyJ.LIZLLL(mModel, container);
        C5V0 c5v0 = null;
        Bundle bundle = ((WM7) container.LJ(AbstractC42651GoZ.class, null)).mArguments;
        if (bundle != null && (string = bundle.getString("extra_edit_effect_uid")) != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) != null) {
            c5v0 = new C5V0(data);
        }
        C139875eJ c139875eJ = new C139875eJ(container, LIZLLL, c5v0, new AqS133S0200000_2(videoEditContainerScene, container, 41));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c139875eJ.afterInit$als_release(uptimeMillis);
        return c139875eJ;
    }

    public static final Object LIZIZ$25(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImagePublishPreviewScene imagePublishPreviewScene = (ImagePublishPreviewScene) apS178S0200000_2.l1;
        C152175y9 c152175y9 = imagePublishPreviewScene.LLFZ;
        if (c152175y9 != null) {
            W32 w32 = new W32(container, imagePublishPreviewScene, R.id.nbw, c152175y9, imagePublishPreviewScene.LJLLLLLL, false, ((Boolean) C6XT.LIZ.getValue()).booleanValue());
            ((C275416g) apS178S0200000_2.l0).getClass();
            w32.afterInit$als_release(uptimeMillis);
            return w32;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final Object LIZIZ$26(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C6XR c6xr = (C6XR) apS178S0200000_2.l1;
        int i = R.id.nbw;
        C152175y9 c152175y9 = c6xr.LJLJL;
        if (c152175y9 != null) {
            boolean z = false;
            W32 w32 = new W32(container, c6xr, i, c152175y9, c6xr.LJLLL, z, z, 96);
            ((C275416g) apS178S0200000_2.l0).getClass();
            w32.afterInit$als_release(uptimeMillis);
            return w32;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final Object LIZIZ$27(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (C147295qH) apS178S0200000_2.l1, R.id.fju, false);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$28(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        TIU tiu = new TIU(container, (C147295qH) apS178S0200000_2.l1, C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(0), C60903NvH.LJIIJJI().LJIILL().LJI());
        ((C275416g) apS178S0200000_2.l0).getClass();
        tiu.afterInit$als_release(uptimeMillis);
        return tiu;
    }

    public static final Object LIZIZ$29(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        InterfaceC84498XEg LIZIZ;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        InterfaceC82236WPg LJI = C60903NvH.LJIIJJI().LJIILL().LJI();
        if (C19N.LJ("studio_fix_effect_platform_anr", true)) {
            LIZIZ = (InterfaceC84498XEg) container.LJ(InterfaceC84498XEg.class, null);
        } else {
            LIZIZ = C60903NvH.LJIIJJI().LJIILL().LIZIZ();
        }
        final C147295qH c147295qH2 = (C147295qH) apS178S0200000_2.l1;
        c147295qH2.getClass();
        WPG wpg = new WPG(container, c147295qH, R.id.fns, LJI, LIZIZ, new InterfaceC82231WPb() { // from class: X.5sk
            @Override // X.InterfaceC82231WPb
            public final void pg(String name) {
                o.LJIIIZ(name, "name");
            }

            @Override // X.InterfaceC82231WPb
            public final void H60(boolean z, FilterBean filterBean) {
                boolean z2 = !z;
                C147295qH.this.LLLILZLLLI().U2(z2, false, z2);
                if (z) {
                    ((DefaultStreamEditSubPanelHelper) C147295qH.this.LLJJJ.getValue()).LIZJ();
                } else {
                    ((DefaultStreamEditSubPanelHelper) C147295qH.this.LLJJJ.getValue()).LIZIZ();
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void P30(float f, boolean z) {
                FilterBean filterBean;
                InterfaceC150685vk interfaceC150685vk;
                C140415fB value = C147295qH.this.LLLILZLLLI().Dm().getValue();
                if (value != null && (filterBean = value.LJLILLLLZI) != null) {
                    C147295qH c147295qH3 = C147295qH.this;
                    InterfaceC148845sm value2 = c147295qH3.LLLILZLLLI().Nm().getValue();
                    o.LJI(value2);
                    InterfaceC148845sm interfaceC148845sm = value2;
                    InterfaceC122704ri value3 = c147295qH3.LLLILZLLLI().v50().getValue();
                    o.LJI(value3);
                    InterfaceC122704ri interfaceC122704ri = value3;
                    VideoPublishEditModel videoPublishEditModel = c147295qH3.LJLLJ;
                    if (videoPublishEditModel != null) {
                        videoPublishEditModel.mSelectedFilterIntensity = interfaceC148845sm.LIZ(filterBean, interfaceC122704ri) / 100;
                        if (z && (interfaceC150685vk = c147295qH3.LLILII) != null) {
                            interfaceC150685vk.Pr();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void nz(FilterBean filterBean, boolean z, Context context) {
                if (filterBean != null) {
                    InterfaceC148845sm value = C147295qH.this.LLLILZLLLI().Nm().getValue();
                    o.LJI(value);
                    InterfaceC148845sm interfaceC148845sm = value;
                    InterfaceC122704ri value2 = C147295qH.this.LLLILZLLLI().v50().getValue();
                    o.LJI(value2);
                    InterfaceC122704ri interfaceC122704ri = value2;
                    VideoPublishEditModel videoPublishEditModel = C147295qH.this.LJLLJ;
                    if (videoPublishEditModel != null) {
                        videoPublishEditModel.mSelectedId = TMC.LJIJ(filterBean, C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL());
                        VideoPublishEditModel videoPublishEditModel2 = C147295qH.this.LJLLJ;
                        if (videoPublishEditModel2 != null) {
                            videoPublishEditModel2.mSelectedFilterId = String.valueOf(filterBean.getId());
                            VideoPublishEditModel videoPublishEditModel3 = C147295qH.this.LJLLJ;
                            if (videoPublishEditModel3 != null) {
                                videoPublishEditModel3.mSelectedFilterLabel = filterBean.getEnName();
                                VideoPublishEditModel videoPublishEditModel4 = C147295qH.this.LJLLJ;
                                if (videoPublishEditModel4 != null) {
                                    videoPublishEditModel4.mSelectedFilterResId = filterBean.getResId();
                                    VideoPublishEditModel videoPublishEditModel5 = C147295qH.this.LJLLJ;
                                    if (videoPublishEditModel5 != null) {
                                        videoPublishEditModel5.mSelectedFilterIntensity = interfaceC148845sm.LIZ(filterBean, interfaceC122704ri) / 100;
                                        C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 3);
                                        C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 7);
                                        C46104I7o.LJJJI(filterBean.getResId(), 6);
                                        C5UD applicationService = C78934UyQ.LJLIL.getApplicationService();
                                        VideoPublishEditModel videoPublishEditModel6 = C147295qH.this.LJLLJ;
                                        if (videoPublishEditModel6 != null) {
                                            String contentType = videoPublishEditModel6.getAvetParameter().getContentType();
                                            String enName = filterBean.getEnName();
                                            applicationService.getClass();
                                            C148855sn c148855sn = new C148855sn();
                                            c148855sn.LJIILJJIL = contentType;
                                            c148855sn.LJIILL = "mid_page";
                                            c148855sn.LJIILLIIL = enName;
                                            c148855sn.LJIILIIL();
                                            if (context != null) {
                                                if (z) {
                                                    VideoPublishEditModel videoPublishEditModel7 = C147295qH.this.LJLLJ;
                                                    if (videoPublishEditModel7 != null) {
                                                        H8F.LJJJI(videoPublishEditModel7, "slide", filterBean.getEnName(), filterBean.getId(), videoPublishEditModel7.mSelectedFilterIntensity);
                                                    } else {
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                } else {
                                                    VideoPublishEditModel videoPublishEditModel8 = C147295qH.this.LJLLJ;
                                                    if (videoPublishEditModel8 != null) {
                                                        H8F.LJJJI(videoPublishEditModel8, "click", filterBean.getEnName(), filterBean.getId(), videoPublishEditModel8.mSelectedFilterIntensity);
                                                    } else {
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else {
                                            o.LJIJI("mModel");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                } else {
                    VideoPublishEditModel videoPublishEditModel9 = C147295qH.this.LJLLJ;
                    if (videoPublishEditModel9 != null) {
                        videoPublishEditModel9.mSelectedId = 0;
                        videoPublishEditModel9.mSelectedFilterId = "";
                        videoPublishEditModel9.mSelectedFilterLabel = "";
                        videoPublishEditModel9.mSelectedFilterResId = "";
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                InterfaceC150685vk interfaceC150685vk = C147295qH.this.LLILII;
                if (interfaceC150685vk != null) {
                    interfaceC150685vk.Pr();
                }
            }
        }, new AqS180S0100000_14((C147295qH) apS178S0200000_2.l1, 202));
        ((C275416g) apS178S0200000_2.l0).getClass();
        wpg.afterInit$als_release(uptimeMillis);
        return wpg;
    }

    public static final Object LIZIZ$3(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83345WnN c83345WnN = new C83345WnN(container, (C5ZZ) apS178S0200000_2.l1, R.id.ne);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c83345WnN.afterInit$als_release(uptimeMillis);
        return c83345WnN;
    }

    public static final Object LIZIZ$30(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83403WoJ c83403WoJ = new C83403WoJ((C147295qH) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c83403WoJ.afterInit$als_release(uptimeMillis);
        return c83403WoJ;
    }

    public static final Object LIZIZ$31(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5U1 c5u1 = new C5U1(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5u1.afterInit$als_release(uptimeMillis);
        return c5u1;
    }

    public static final Object LIZIZ$32(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C173426rK c173426rK = new C173426rK(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c173426rK.afterInit$als_release(uptimeMillis);
        return c173426rK;
    }

    public static final Object LIZIZ$33(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HEB heb = new HEB(container, (C147295qH) apS178S0200000_2.l1, R.id.cpk);
        ((C275416g) apS178S0200000_2.l0).getClass();
        heb.afterInit$als_release(uptimeMillis);
        return heb;
    }

    public static final Object LIZIZ$34(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C42210GhS c42210GhS = new C42210GhS(container, (C147295qH) apS178S0200000_2.l1, R.id.cpn);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c42210GhS.afterInit$als_release(uptimeMillis);
        return c42210GhS;
    }

    public static final Object LIZIZ$35(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5PB c5pb = new C5PB(container, new AqS184S0100000_2((C147295qH) apS178S0200000_2.l1, 33));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5pb.afterInit$als_release(uptimeMillis);
        return c5pb;
    }

    public static final Object LIZIZ$36(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C6WG c6wg = new C6WG(container, (CapCutTemplateMusic) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c6wg.afterInit$als_release(uptimeMillis);
        return c6wg;
    }

    public static final Object LIZIZ$37(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C164436cp c164436cp = new C164436cp(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c164436cp.afterInit$als_release(uptimeMillis);
        return c164436cp;
    }

    public static final Object LIZIZ$38(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145515nP c145515nP = new C145515nP(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145515nP.afterInit$als_release(uptimeMillis);
        return c145515nP;
    }

    public static final Object LIZIZ$39(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            C148035rT c148035rT = new C148035rT(container, c147295qH, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c148035rT.afterInit$als_release(uptimeMillis);
            return c148035rT;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$4(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C151055wL c151055wL = (C151055wL) apS178S0200000_2.l1;
        C147785r4 c147785r4 = new C147785r4(container, c151055wL, R.id.etx, c151055wL.LLIIIJ);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c147785r4.afterInit$als_release(uptimeMillis);
        return c147785r4;
    }

    public static final Object LIZIZ$40(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5LF c5lf = new C5LF((C147295qH) apS178S0200000_2.l1, container, R.id.fi3);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5lf.afterInit$als_release(uptimeMillis);
        return c5lf;
    }

    public static final Object LIZIZ$41(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149285tU c149285tU = new C149285tU(container, (C147295qH) apS178S0200000_2.l1, R.id.cq1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149285tU.afterInit$als_release(uptimeMillis);
        return c149285tU;
    }

    public static final Object LIZIZ$42(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C168346j8 c168346j8 = new C168346j8((C147295qH) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c168346j8.afterInit$als_release(uptimeMillis);
        return c168346j8;
    }

    public static final Object LIZIZ$43(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C124234uB c124234uB = new C124234uB(new AqS152S0100000_2((C147295qH) apS178S0200000_2.l1, 385));
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) apS178S0200000_2.l1).LJLLJ;
        if (videoPublishEditModel != null) {
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
            C138495c5 c138495c5 = new C138495c5(container, c124234uB, new C138595cF(creativeInfo));
            ((C275416g) apS178S0200000_2.l0).getClass();
            c138495c5.afterInit$als_release(uptimeMillis);
            return c138495c5;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$44(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        C146295of c146295of = new C146295of(container, c147295qH, R.id.fns, c147295qH.LLJJJJ);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146295of.afterInit$als_release(uptimeMillis);
        return c146295of;
    }

    public static final Object LIZIZ$45(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C5VA c5va = new C5VA(container, new AqS152S0100000_2((C147295qH) apS178S0200000_2.l1, 389));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c5va.afterInit$als_release(uptimeMillis);
        return c5va;
    }

    public static final Object LIZIZ$46(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            C45929I0v c45929I0v = new C45929I0v(container, c147295qH, R.id.blw, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c45929I0v.afterInit$als_release(uptimeMillis);
            return c45929I0v;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$47(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        E9Q e9q = new E9Q(container);
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) apS178S0200000_2.l1).LJLLJ;
        if (videoPublishEditModel != null) {
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            if (musicBuzModel.needAddRecent) {
                musicBuzModel.needAddRecent = false;
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                if (extractAVMusic != null) {
                    MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                    VideoPublishEditModel videoPublishEditModel2 = ((C147295qH) apS178S0200000_2.l1).LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        String musicOrigin = videoPublishEditModel2.getMusicOrigin();
                        if (musicOrigin == null) {
                            musicOrigin = "";
                        }
                        e9q.Lp(LJJIJIL, musicOrigin);
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
            }
            ((C275416g) apS178S0200000_2.l0).getClass();
            e9q.afterInit$als_release(uptimeMillis);
            return e9q;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$48(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C141535gz c141535gz = new C141535gz(container, (C147295qH) apS178S0200000_2.l1, R.id.n7c);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c141535gz.afterInit$als_release(uptimeMillis);
        return c141535gz;
    }

    public static final Object LIZIZ$49(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146465ow c146465ow = new C146465ow(container, (C147295qH) apS178S0200000_2.l1, R.id.cpo);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146465ow.afterInit$als_release(uptimeMillis);
        return c146465ow;
    }

    public static final Object LIZIZ$5(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C150935w9 c150935w9 = new C150935w9(container, (C146475ox) apS178S0200000_2.l1, R.id.kio);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c150935w9.afterInit$als_release(uptimeMillis);
        return c150935w9;
    }

    public static final Object LIZIZ$50(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C145225mw c145225mw = new C145225mw(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c145225mw.afterInit$als_release(uptimeMillis);
        return c145225mw;
    }

    public static final Object LIZIZ$51(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149295tV c149295tV = new C149295tV(container, (C147295qH) apS178S0200000_2.l1, R.id.cq1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149295tV.afterInit$als_release(uptimeMillis);
        return c149295tV;
    }

    public static final Object LIZIZ$52(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146445ou c146445ou = new C146445ou(container, (C147295qH) apS178S0200000_2.l1, R.id.cpo);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146445ou.afterInit$als_release(uptimeMillis);
        return c146445ou;
    }

    public static final Object LIZIZ$53(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83374Wnq c83374Wnq = new C83374Wnq(container, (C147295qH) apS178S0200000_2.l1, R.id.ng);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c83374Wnq.afterInit$als_release(uptimeMillis);
        return c83374Wnq;
    }

    public static final Object LIZIZ$54(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            C148035rT c148035rT = new C148035rT(container, c147295qH, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c148035rT.afterInit$als_release(uptimeMillis);
            return c148035rT;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$55(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147985rO c147985rO = new C147985rO(container, (C147295qH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c147985rO.afterInit$als_release(uptimeMillis);
        return c147985rO;
    }

    public static final Object LIZIZ$56(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C6EC c6ec = new C6EC(container, (C6EF) ((C147295qH) apS178S0200000_2.l1).LLJLIL.getValue(), new AqS152S0100000_2((C147295qH) apS178S0200000_2.l1, 386), new AqS152S0100000_2((C147295qH) apS178S0200000_2.l1, 387));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c6ec.afterInit$als_release(uptimeMillis);
        return c6ec;
    }

    public static final Object LIZIZ$57(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46066I6c c46066I6c = new C46066I6c(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c46066I6c.afterInit$als_release(uptimeMillis);
        return c46066I6c;
    }

    public static final Object LIZIZ$58(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46066I6c c46066I6c = new C46066I6c(container, (C147295qH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c46066I6c.afterInit$als_release(uptimeMillis);
        return c46066I6c;
    }

    public static final Object LIZIZ$59(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ActivityC45651qj LIZLLL = SceneExtensionsKt.LIZLLL((C147295qH) apS178S0200000_2.l1);
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            C143805ke c143805ke = new C143805ke(container, LIZLLL, videoPublishEditModel, c147295qH.LLJJIII(), ((C147295qH) apS178S0200000_2.l1).LLJJJJ);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c143805ke.afterInit$als_release(uptimeMillis);
            return c143805ke;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$6(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C62O c62o = new C62O((NowsEditRootScene) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c62o.afterInit$als_release(uptimeMillis);
        return c62o;
    }

    public static final Object LIZIZ$60(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        C163096af c163096af = new C163096af(container, c147295qH, R.id.fns, new AqS152S0100000_2(c147295qH, 388));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c163096af.afterInit$als_release(uptimeMillis);
        return c163096af;
    }

    public static final Object LIZIZ$61(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (C147295qH) apS178S0200000_2.l1, R.id.fju, true);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$62(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147295qH c147295qH = (C147295qH) apS178S0200000_2.l1;
        AnonymousClass621 anonymousClass621 = new AnonymousClass621(container, c147295qH, new AqS168S0100000_2(c147295qH, 234));
        ((C275416g) apS178S0200000_2.l0).getClass();
        anonymousClass621.afterInit$als_release(uptimeMillis);
        return anonymousClass621;
    }

    public static final Object LIZIZ$63(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C1538161x c1538161x = new C1538161x(container, (C147295qH) apS178S0200000_2.l1, R.id.cq1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c1538161x.afterInit$als_release(uptimeMillis);
        return c1538161x;
    }

    public static final Object LIZIZ$64(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (C147295qH) apS178S0200000_2.l1, R.id.fju, true);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$65(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C157356Fn c157356Fn = new C157356Fn(container, (C63C) apS178S0200000_2.l1, R.id.ihb, R.id.ncd);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c157356Fn.afterInit$als_release(uptimeMillis);
        return c157356Fn;
    }

    public static final Object LIZIZ$66(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C6JS c6js = new C6JS(container, (C63C) apS178S0200000_2.l1, R.id.l5j, R.id.nc5);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c6js.afterInit$als_release(uptimeMillis);
        return c6js;
    }

    public static final Object LIZIZ$67(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C63C c63c = (C63C) apS178S0200000_2.l1;
        WM7 wm7 = c63c.mParentScene;
        View requireViewById = c63c.requireViewById(R.id.elm);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.infini_sticker_container)");
        View requireViewById2 = ((C63C) apS178S0200000_2.l1).requireViewById(R.id.eln);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.inf…sticker_higher_container)");
        C6H3 c6h3 = new C6H3(container, wm7, (FrameLayout) requireViewById, (FrameLayout) requireViewById2);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c6h3.afterInit$als_release(uptimeMillis);
        return c6h3;
    }

    public static final Object LIZIZ$68(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C63C c63c = (C63C) apS178S0200000_2.l1;
        C139305dO c139305dO = new C139305dO(container, c63c.mParentScene, new AqS152S0100000_2(c63c, 468));
        ((C275416g) apS178S0200000_2.l0).getClass();
        c139305dO.afterInit$als_release(uptimeMillis);
        return c139305dO;
    }

    public static final Object LIZIZ$69(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C156566Cm c156566Cm = new C156566Cm(container, (C63C) apS178S0200000_2.l1, R.id.g9q);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c156566Cm.afterInit$als_release(uptimeMillis);
        return c156566Cm;
    }

    public static final Object LIZIZ$7(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C124234uB c124234uB = new C124234uB(new AqS152S0100000_2((NowsEditRootScene) apS178S0200000_2.l1, 130));
        VideoPublishEditModel videoPublishEditModel = ((NowsEditRootScene) apS178S0200000_2.l1).LJLL;
        if (videoPublishEditModel != null) {
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            C138495c5 c138495c5 = new C138495c5(container, c124234uB, new C138595cF(creativeInfo));
            ((C275416g) apS178S0200000_2.l0).getClass();
            c138495c5.afterInit$als_release(uptimeMillis);
            return c138495c5;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object LIZIZ$70(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C138805ca c138805ca = new C138805ca(container, (C63C) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c138805ca.afterInit$als_release(uptimeMillis);
        return c138805ca;
    }

    public static final Object LIZIZ$71(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C150935w9 c150935w9 = new C150935w9(container, (C146435ot) apS178S0200000_2.l1, R.id.kio);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c150935w9.afterInit$als_release(uptimeMillis);
        return c150935w9;
    }

    public static final Object LIZIZ$72(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C156226Be c156226Be = new C156226Be((C63C) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c156226Be.afterInit$als_release(uptimeMillis);
        return c156226Be;
    }

    public static final Object LIZIZ$73(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C156296Bl c156296Bl = new C156296Bl((C63C) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c156296Bl.afterInit$als_release(uptimeMillis);
        return c156296Bl;
    }

    public static final Object LIZIZ$74(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C63C c63c = (C63C) apS178S0200000_2.l1;
        FrameLayout frameLayout = c63c.LLIIIL;
        if (frameLayout != null) {
            C153135zh c153135zh = new C153135zh(container, c63c, R.id.em3, frameLayout);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c153135zh.afterInit$als_release(uptimeMillis);
            return c153135zh;
        }
        o.LJIJI("textPStickerLayout");
        throw null;
    }

    public static final Object LIZIZ$75(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C6JB c6jb = new C6JB(container, (C63C) apS178S0200000_2.l1, R.id.l5k, R.id.ncc);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c6jb.afterInit$als_release(uptimeMillis);
        return c6jb;
    }

    public static final Object LIZIZ$76(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C159116Mh c159116Mh = new C159116Mh(container, (WMH) apS178S0200000_2.l1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c159116Mh.afterInit$als_release(uptimeMillis);
        return c159116Mh;
    }

    public static final Object LIZIZ$77(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C163826bq c163826bq = new C163826bq(container, (WMH) apS178S0200000_2.l1, R.id.ehn);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c163826bq.afterInit$als_release(uptimeMillis);
        return c163826bq;
    }

    public static final Object LIZIZ$78(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C51W c51w = new C51W((EditorProScene) apS178S0200000_2.l1, container);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c51w.afterInit$als_release(uptimeMillis);
        return c51w;
    }

    public static final Object LIZIZ$79(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82149WLx c82149WLx = new C82149WLx(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c82149WLx.afterInit$als_release(uptimeMillis);
        return c82149WLx;
    }

    public static final Object LIZIZ$8(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146455ov c146455ov = new C146455ov(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.cpo);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146455ov.afterInit$als_release(uptimeMillis);
        return c146455ov;
    }

    public static final Object LIZIZ$80(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C146815pV c146815pV = new C146815pV(container, (WMH) apS178S0200000_2.l1, R.id.fns);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c146815pV.afterInit$als_release(uptimeMillis);
        return c146815pV;
    }

    public static final Object LIZIZ$81(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WUR wur = new WUR(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        wur.afterInit$als_release(uptimeMillis);
        return wur;
    }

    public static final Object LIZIZ$82(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C141535gz c141535gz = new C141535gz(container, (WMH) apS178S0200000_2.l1, R.id.n7c);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c141535gz.afterInit$als_release(uptimeMillis);
        return c141535gz;
    }

    public static final Object LIZIZ$83(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C148065rW c148065rW = new C148065rW(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c148065rW.afterInit$als_release(uptimeMillis);
        return c148065rW;
    }

    public static final Object LIZIZ$84(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C147975rN c147975rN = new C147975rN(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c147975rN.afterInit$als_release(uptimeMillis);
        return c147975rN;
    }

    public static final Object LIZIZ$85(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        TIU tiu = new TIU(container, (WMH) apS178S0200000_2.l1, C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(0), C60903NvH.LJIIJJI().LJIILL().LJI());
        ((C275416g) apS178S0200000_2.l0).getClass();
        tiu.afterInit$als_release(uptimeMillis);
        return tiu;
    }

    public static final Object LIZIZ$86(ApS178S0200000_2 apS178S0200000_2, final C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        final WMH wmh = (WMH) apS178S0200000_2.l1;
        AbstractC163776bl<FTCEditToolbarViewModel> abstractC163776bl = new AbstractC163776bl<FTCEditToolbarViewModel>(container, wmh) { // from class: X.612
            public final C82622Wbi LJLJLJ;
            public final WMH LJLJLLL;
            public final int LJLL;
            public final int LJLLI;
            public final AnonymousClass616 LJLLILLLL;

            @Override // X.AbstractC165596eh
            public final void LJJLIIIJLLLLLLLZ() {
            }

            @Override // X.AbstractC165596eh, X.AbstractC29891Fh
            public final void onCreate() {
                super.onCreate();
                WMH wmh2 = this.LJLJLLL;
                wmh2.add(this.LJLL, new C61B(this.LJLJLJ), "FTCEditTitleBarScene");
                wmh2.add(this.LJLLI, new AnonymousClass611(this.LJLJLJ), "FTCEditBottomBarScene");
            }

            @Override // X.AbstractC165596eh
            public final WMH LJJLI() {
                return this.LJLJLLL;
            }

            @Override // X.AbstractC165596eh
            public final InterfaceC65784Pro<FTCEditToolbarViewModel> LJJLIIIJILLIZJL() {
                return this.LJLLILLLL;
            }

            {
                o.LJIIIZ(container, "diContainer");
                o.LJIIIZ(wmh, "parentScene");
                this.LJLJLJ = container;
                this.LJLJLLL = wmh;
                this.LJLL = R.id.cq1;
                this.LJLLI = R.id.aot;
                this.LJLLILLLL = AnonymousClass616.LJLIL;
            }
        };
        ((C275416g) apS178S0200000_2.l0).getClass();
        abstractC163776bl.afterInit$als_release(uptimeMillis);
        return abstractC163776bl;
    }

    public static final Object LIZIZ$87(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C158636Kl c158636Kl = new C158636Kl(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c158636Kl.afterInit$als_release(uptimeMillis);
        return c158636Kl;
    }

    public static final Object LIZIZ$88(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82586Wb8 c82586Wb8 = new C82586Wb8(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c82586Wb8.afterInit$als_release(uptimeMillis);
        return c82586Wb8;
    }

    public static final Object LIZIZ$89(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149145tG c149145tG = new C149145tG(container, (WMH) apS178S0200000_2.l1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149145tG.afterInit$als_release(uptimeMillis);
        return c149145tG;
    }

    public static final Object LIZIZ$9(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C159116Mh c159116Mh = new C159116Mh(container, (NowsEditRootScene) apS178S0200000_2.l1, R.id.e58);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c159116Mh.afterInit$als_release(uptimeMillis);
        return c159116Mh;
    }

    public static final Object LIZIZ$90(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        EditCaptionScene editCaptionScene = (EditCaptionScene) apS178S0200000_2.l1;
        AnonymousClass692 anonymousClass692 = new AnonymousClass692(container, editCaptionScene, new C147095px(new C134665Qg(editCaptionScene.LLJLLIL(), "caption_font_edit_page")));
        ((C275416g) apS178S0200000_2.l0).getClass();
        anonymousClass692.afterInit$als_release(uptimeMillis);
        return anonymousClass692;
    }

    public static final Object LIZIZ$91(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LJLLJ;
        if (videoPublishEditModel != null) {
            C148035rT c148035rT = new C148035rT(container, imageEditRootScene, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c148035rT.afterInit$als_release(uptimeMillis);
            return c148035rT;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$92(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149295tV c149295tV = new C149295tV(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.cq1);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149295tV.afterInit$als_release(uptimeMillis);
        return c149295tV;
    }

    public static final Object LIZIZ$93(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fju, true);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$94(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C159116Mh c159116Mh = new C159116Mh(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c159116Mh.afterInit$als_release(uptimeMillis);
        return c159116Mh;
    }

    public static final Object LIZIZ$95(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C1538161x c1538161x = new C1538161x(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.cq1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c1538161x.afterInit$als_release(uptimeMillis);
        return c1538161x;
    }

    public static final Object LIZIZ$96(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149355tb c149355tb = new C149355tb(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.fju, true);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149355tb.afterInit$als_release(uptimeMillis);
        return c149355tb;
    }

    public static final Object LIZIZ$97(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) apS178S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LJLLJ;
        if (videoPublishEditModel != null) {
            C148035rT c148035rT = new C148035rT(container, imageEditRootScene, videoPublishEditModel);
            ((C275416g) apS178S0200000_2.l0).getClass();
            c148035rT.afterInit$als_release(uptimeMillis);
            return c148035rT;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$98(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        E9Q e9q = new E9Q(container);
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) apS178S0200000_2.l1).LJLLJ;
        if (videoPublishEditModel != null) {
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            if (musicBuzModel.needAddRecent) {
                musicBuzModel.needAddRecent = false;
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                if (extractAVMusic != null) {
                    MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                    VideoPublishEditModel videoPublishEditModel2 = ((ImageEditRootScene) apS178S0200000_2.l1).LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        String musicOriginWithCheck = videoPublishEditModel2.getMusicOriginWithCheck();
                        o.LJIIIIZZ(musicOriginWithCheck, "mModel.musicOriginWithCheck");
                        e9q.Lp(LJJIJIL, musicOriginWithCheck);
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
            }
            ((C275416g) apS178S0200000_2.l0).getClass();
            e9q.afterInit$als_release(uptimeMillis);
            return e9q;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$99(ApS178S0200000_2 apS178S0200000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C149285tU c149285tU = new C149285tU(container, (ImageEditRootScene) apS178S0200000_2.l1, R.id.cq1, R.id.aot);
        ((C275416g) apS178S0200000_2.l0).getClass();
        c149285tU.afterInit$als_release(uptimeMillis);
        return c149285tU;
    }

    public ApS178S0200000_2(SAAActivity sAAActivity, VideoEditContainerScene videoEditContainerScene, int i) {
        this.$t = i;
        this.l0 = sAAActivity;
        this.l1 = videoEditContainerScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C5ZZ c5zz, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c5zz;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C146435ot c146435ot, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c146435ot;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C146475ox c146475ox, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c146475ox;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C146945pi c146945pi, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c146945pi;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C147295qH c147295qH, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c147295qH;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C151055wL c151055wL, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c151055wL;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C63C c63c, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c63c;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, C6XR c6xr, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c6xr;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, WMH wmh, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, CapCutTemplateMusic capCutTemplateMusic, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = capCutTemplateMusic;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, ImageEditRootScene imageEditRootScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = imageEditRootScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, NowsEditRootScene nowsEditRootScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = nowsEditRootScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, VideoEditContainerScene videoEditContainerScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = videoEditContainerScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, EditCaptionScene editCaptionScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = editCaptionScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, ImagePublishPreviewScene imagePublishPreviewScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = imagePublishPreviewScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, Video2StickerEditRootScene video2StickerEditRootScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = video2StickerEditRootScene;
    }

    public ApS178S0200000_2(C275416g c275416g, C275516h c275516h, EditorProScene editorProScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = editorProScene;
    }
}
