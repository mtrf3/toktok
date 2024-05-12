package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC83312Wmq;
import X.AbstractC83369Wnl;
import X.AbstractC83637Ws5;
import X.C08380Uo;
import X.C16230kN;
import X.C162476Zf;
import X.C163726bg;
import X.C165626ek;
import X.C17N;
import X.C1XY;
import X.C29S;
import X.C39557Ffl;
import X.C45233Hp7;
import X.C45266Hpe;
import X.C45323HqZ;
import X.C45327Hqd;
import X.C61447O9r;
import X.C65232Piu;
import X.C73312Spw;
import X.C73994T2g;
import X.C74277TDd;
import X.C76800UCe;
import X.C78163Ulz;
import X.C79488VHo;
import X.C79601VLx;
import X.C79604VMa;
import X.C79619VMp;
import X.C80083Vbr;
import X.C80084Vbs;
import X.C80972VqC;
import X.C81312Vvg;
import X.C81313Vvh;
import X.C81314Vvi;
import X.C81315Vvj;
import X.C81455Vxz;
import X.C81457Vy1;
import X.C81489VyX;
import X.C81975WFf;
import X.C82016WGu;
import X.C82068WIu;
import X.C82247WPr;
import X.C82306WRy;
import X.C82308WSa;
import X.C82492WZc;
import X.C82516Wa0;
import X.C82537WaL;
import X.C82622Wbi;
import X.C82718WdG;
import X.C83113Wjd;
import X.C83146WkA;
import X.C83207Wl9;
import X.C83230WlW;
import X.C83310Wmo;
import X.C83324Wn2;
import X.C83328Wn6;
import X.C83329Wn7;
import X.C83332WnA;
import X.C83333WnB;
import X.C83346WnO;
import X.C83374Wnq;
import X.C83437Wor;
import X.C83439Wot;
import X.C83444Woy;
import X.C83448Wp2;
import X.C83449Wp3;
import X.C83453Wp7;
import X.C83454Wp8;
import X.C83467WpL;
import X.C83644WsC;
import X.C83666WsY;
import X.C83826Wv8;
import X.C83861Wvh;
import X.C8HN;
import X.EnumC81316Vvk;
import X.EnumC82528WaC;
import X.ILU;
import X.InterfaceC122704ri;
import X.InterfaceC148845sm;
import X.InterfaceC58234MtK;
import X.InterfaceC65350Pko;
import X.InterfaceC65637PpR;
import X.InterfaceC65784Pro;
import X.InterfaceC83314Wms;
import X.InterfaceC83334WnC;
import X.InterfaceC83370Wnm;
import X.InterfaceC83710WtG;
import X.InterfaceC83821Wv3;
import X.InterfaceC83991Wxn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ScaleGestureDetectorOnScaleGestureListenerC82717WdF;
import X.T4Q;
import X.T4X;
import X.TEZ;
import X.VIW;
import X.VJO;
import X.VJR;
import X.VJS;
import X.VM0;
import X.VM4;
import X.VM8;
import X.VMB;
import X.VMD;
import X.VMM;
import X.VN7;
import X.VN8;
import X.VNS;
import X.VY5;
import X.ViewOnTouchListenerC82716WdE;
import X.W5A;
import X.W5B;
import X.WI2;
import X.WI6;
import X.WID;
import X.WJ3;
import X.WM7;
import X.WYF;
import X.WZ5;
import X.X1D;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS13S0210000_14;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.LynxPerfMetric;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class AqS161S0200000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1();
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$2();
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$3();
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return LIZ$4();
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return LIZ$5();
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$6();
            case 84:
                return invoke$84(this);
            default:
                return null;
        }
    }

    public final C76800UCe LIZ$4() {
        boolean isCollectionType = ((ComposerBeauty) this.l0).isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = ((ComposerBeauty) this.l0).getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it = childList.iterator();
                while (it.hasNext()) {
                    ((AqS180S0100000_14) this.l1).LIZ$28(it.next());
                }
                return C76800UCe.LIZ;
            }
            return null;
        }
        if (!isCollectionType) {
            ((AqS180S0100000_14) this.l1).LIZ$28((ComposerBeauty) this.l0);
            return C76800UCe.LIZ;
        }
        throw new C162476Zf();
    }

    public final C76800UCe LIZ$5() {
        ComposerBeauty composerBeauty;
        boolean isCollectionType = ((ComposerBeauty) this.l0).isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = ((ComposerBeauty) this.l0).getChildList();
            if (childList == null) {
                return null;
            }
            Iterator<ComposerBeauty> it = childList.iterator();
            while (true) {
                if (it.hasNext()) {
                    composerBeauty = it.next();
                    if (composerBeauty.getSelected()) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty2 = composerBeauty;
            if (composerBeauty2 == null) {
                return null;
            }
            ((C83146WkA) this.l1).X7(composerBeauty2);
            return C76800UCe.LIZ;
        }
        if (!isCollectionType) {
            ((C83146WkA) this.l1).X7((ComposerBeauty) this.l0);
            return C76800UCe.LIZ;
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FilterPanelViewModel invoke$0() {
        C165626ek LIZIZ;
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (WM7) this.l0);
        return LIZIZ.LIZ(C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OptionSceneViewModel invoke$1() {
        C165626ek LIZIZ;
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (WM7) this.l0);
        return LIZIZ.LIZ(C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final EffectInfoViewModel invoke$2() {
        C165626ek LIZIZ;
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (WM7) this.l0);
        return LIZIZ.LIZ(C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final EditFilterViewModel invoke$3() {
        C165626ek LIZIZ;
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (WM7) this.l0);
        return LIZIZ.LIZ(C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DuetLayoutModeViewModel invoke$6() {
        C165626ek LIZIZ;
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (WM7) this.l0);
        return LIZIZ.LIZ(C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    public static final Object invoke$10(AqS161S0200000_14 aqS161S0200000_14) {
        C81314Vvi c81314Vvi = ((C81312Vvg) aqS161S0200000_14.l0).LJLLLLLL;
        EnumC81316Vvk mode = (EnumC81316Vvk) aqS161S0200000_14.l1;
        c81314Vvi.getClass();
        o.LJIIIZ(mode, "mode");
        if (c81314Vvi.LIZIZ != mode) {
            c81314Vvi.LIZIZ = mode;
            c81314Vvi.LIZJ.requestLayout();
            c81314Vvi.LIZJ.invalidate();
        }
        C81313Vvh c81313Vvh = ((C81312Vvg) aqS161S0200000_14.l0).LJLLLL;
        EnumC81316Vvk mode2 = (EnumC81316Vvk) aqS161S0200000_14.l1;
        c81313Vvh.getClass();
        o.LJIIIZ(mode2, "mode");
        if (c81313Vvh.LIZ != mode2) {
            c81313Vvh.LIZ = mode2;
            int i = C81315Vvj.LIZ[mode2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (c81313Vvh.LJI.isRunning()) {
                            c81313Vvh.LJI.cancel();
                        }
                        c81313Vvh.LJI.start();
                    }
                } else {
                    if (c81313Vvh.LJI.isRunning()) {
                        c81313Vvh.LJI.cancel();
                    }
                    c81313Vvh.LIZLLL = -1.0f;
                }
            } else {
                if (c81313Vvh.LJI.isRunning()) {
                    c81313Vvh.LJI.cancel();
                }
                c81313Vvh.LIZLLL = -1.0f;
            }
            c81313Vvh.LJIIIIZZ.requestLayout();
            c81313Vvh.LJIIIIZZ.invalidate();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS161S0200000_14 aqS161S0200000_14) {
        float f;
        float LJIJJLI;
        float f2;
        float LJIJJLI2;
        float f3;
        List<C80972VqC> list = ((EmojiAnimPlayground) aqS161S0200000_14.l0).LJLIL;
        if (list != null) {
            for (C80972VqC c80972VqC : list) {
                Canvas canvas = (Canvas) aqS161S0200000_14.l1;
                c80972VqC.getClass();
                o.LJIIIZ(canvas, "canvas");
                c80972VqC.LJLILLLLZI.setAlpha((int) (c80972VqC.LJLLJ * 255));
                if (C79488VHo.LIZIZ()) {
                    c80972VqC.LJLILLLLZI.setTextSize(((Number) c80972VqC.LJLLLL.getValue()).floatValue() * c80972VqC.LJLLI);
                    f = 2;
                    LJIJJLI = c80972VqC.LJLJLLL - ((((Number) c80972VqC.LJLLLL.getValue()).floatValue() * c80972VqC.LJLLI) / f);
                    f2 = c80972VqC.LJLL;
                    LJIJJLI2 = ((Number) c80972VqC.LJLLLL.getValue()).floatValue();
                    f3 = c80972VqC.LJLLI;
                } else {
                    float f4 = 28;
                    c80972VqC.LJLILLLLZI.setTextSize(C17N.LJIJJLI(f4) * c80972VqC.LJLLI);
                    f = 2;
                    LJIJJLI = c80972VqC.LJLJLLL - ((C17N.LJIJJLI(f4) * c80972VqC.LJLLI) / f);
                    f2 = c80972VqC.LJLL;
                    LJIJJLI2 = C17N.LJIJJLI(f4);
                    f3 = c80972VqC.LJLLI;
                }
                canvas.drawText(c80972VqC.LJLIL, LJIJJLI, C65232Piu.LIZIZ(LJIJJLI2, f3, f, f2), c80972VqC.LJLILLLLZI);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("emojiItemList");
        throw null;
    }

    public static final Object invoke$12(AqS161S0200000_14 aqS161S0200000_14) {
        ((C82306WRy) aqS161S0200000_14.l0).LJLJJLL();
        ((InterfaceC65784Pro) aqS161S0200000_14.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS161S0200000_14 aqS161S0200000_14) {
        SceneExtensionsKt.LIZIZ(((C82306WRy) aqS161S0200000_14.l0).LJLIL, new ARunnableS37S0100000_1((InterfaceC65784Pro) aqS161S0200000_14.l1, (InterfaceC65784Pro<C76800UCe>) 45));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS161S0200000_14 aqS161S0200000_14) {
        C8HN c8hn = ((C81489VyX) aqS161S0200000_14.l0).LJLJLLL;
        if (c8hn != null) {
            c8hn.startAnimation((Animation) aqS161S0200000_14.l1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("stickerPromptView");
        throw null;
    }

    public static final Object invoke$15(AqS161S0200000_14 aqS161S0200000_14) {
        ((InterfaceC88472Yns) aqS161S0200000_14.l0).invoke(((Effect) aqS161S0200000_14.l1).getResourceId());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS161S0200000_14 aqS161S0200000_14) {
        ((InterfaceC88472Yns) aqS161S0200000_14.l0).invoke(((Effect) aqS161S0200000_14.l1).getResourceId());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS161S0200000_14 aqS161S0200000_14) {
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) aqS161S0200000_14.l0;
        C73994T2g.LJIILIIL(backgroundVideoStickerPresenter.LJLLJ, backgroundVideoStickerPresenter.LLFFF, new AqS164S0100000_14(aqS161S0200000_14, 181));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS161S0200000_14 aqS161S0200000_14) {
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) aqS161S0200000_14.l0;
        C73994T2g.LJIILIIL(diyPropVideoStickerHandler.LJLL, diyPropVideoStickerHandler.LJZI, new AqS164S0100000_14(aqS161S0200000_14, 182));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS161S0200000_14 aqS161S0200000_14) {
        VMB.LJLLLL.LIZIZ((VNS) aqS161S0200000_14.l0, VM8.LIZ((C79604VMa) aqS161S0200000_14.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS161S0200000_14 aqS161S0200000_14) {
        UploadPicStickerARPresenter uploadPicStickerARPresenter = (UploadPicStickerARPresenter) aqS161S0200000_14.l0;
        C73994T2g.LJIILIIL(uploadPicStickerARPresenter.LLIIIJ, uploadPicStickerARPresenter.LLJI, new AqS164S0100000_14(aqS161S0200000_14, 183));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS161S0200000_14 aqS161S0200000_14) {
        if (((Context) aqS161S0200000_14.l1) instanceof C29S) {
            Object LJIIJJI = C1XY.LJIIJJI((C83207Wl9) aqS161S0200000_14.l0);
            if (LJIIJJI == null) {
                LJIIJJI = (Context) aqS161S0200000_14.l1;
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) LJIIJJI;
            lifecycleOwner.getLifecycle().addObserver((C83207Wl9) aqS161S0200000_14.l0);
            C83207Wl9 c83207Wl9 = (C83207Wl9) aqS161S0200000_14.l0;
            c83207Wl9.LLIIZ.B7().safeObserve(lifecycleOwner, new AObserverS82S0100000_14(c83207Wl9, 37));
            c83207Wl9.LLIIZ.g8().observe(lifecycleOwner, new AObserverS82S0100000_14(c83207Wl9, 38));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS161S0200000_14 aqS161S0200000_14) {
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(((ViewOnTouchListenerC82716WdE) aqS161S0200000_14.l0).getContext(), (ScaleGestureDetectorOnScaleGestureListenerC82717WdF) ((C82718WdG) aqS161S0200000_14.l1).LJ.getValue());
        scaleGestureDetector.setQuickScaleEnabled(false);
        return scaleGestureDetector;
    }

    public static final Object invoke$23(AqS161S0200000_14 aqS161S0200000_14) {
        return new ScaleGestureDetectorOnScaleGestureListenerC82717WdF((ViewOnTouchListenerC82716WdE) aqS161S0200000_14.l0, (C82718WdG) aqS161S0200000_14.l1);
    }

    public static final Object invoke$25(AqS161S0200000_14 aqS161S0200000_14) {
        return C73312Spw.LJ((InterfaceC148845sm) aqS161S0200000_14.l0, (InterfaceC122704ri) aqS161S0200000_14.l1);
    }

    public static final Object invoke$26(AqS161S0200000_14 aqS161S0200000_14) {
        return Float.valueOf(((C80083Vbr) aqS161S0200000_14.l0).LJIIJ(((Context) aqS161S0200000_14.l1).getResources().getDisplayMetrics()));
    }

    public static final Object invoke$27(AqS161S0200000_14 aqS161S0200000_14) {
        ((WYF) aqS161S0200000_14.l0).LJJLIIIJILLIZJL((Effect) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS161S0200000_14 aqS161S0200000_14) {
        return Float.valueOf(((C80084Vbs) aqS161S0200000_14.l0).LJIIJ(((Context) aqS161S0200000_14.l1).getResources().getDisplayMetrics()));
    }

    public static final Object invoke$29(AqS161S0200000_14 aqS161S0200000_14) {
        UniversalPopupManager universalPopupManager = (UniversalPopupManager) aqS161S0200000_14.l0;
        Context context = (Context) aqS161S0200000_14.l1;
        universalPopupManager.getClass();
        UniversalPopupManager.LJIIIZ(context);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS161S0200000_14 aqS161S0200000_14) {
        ((VNS) aqS161S0200000_14.l1).getCurrentData(new C79619VMp(aqS161S0200000_14));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS161S0200000_14 aqS161S0200000_14) {
        ((C82492WZc) aqS161S0200000_14.l0).LJLZ.invoke((WZ5) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS161S0200000_14 aqS161S0200000_14) {
        Context context = (Context) aqS161S0200000_14.l1;
        C83861Wvh c83861Wvh = (C83861Wvh) aqS161S0200000_14.l0;
        return new C82308WSa(context, c83861Wvh, C83861Wvh.LIZJ(c83861Wvh).LJLJL.LJJJJJL());
    }

    public static final Object invoke$32(AqS161S0200000_14 aqS161S0200000_14) {
        Context context = (Context) aqS161S0200000_14.l1;
        C83861Wvh c83861Wvh = (C83861Wvh) aqS161S0200000_14.l0;
        return new C83666WsY(context, c83861Wvh, C83861Wvh.LIZJ(c83861Wvh).getCameraController());
    }

    public static final Object invoke$33(AqS161S0200000_14 aqS161S0200000_14) {
        if (((C83310Wmo) aqS161S0200000_14.l0).LIZIZ) {
            ((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZJ.set(true);
            ((C83310Wmo) aqS161S0200000_14.l0).LIZIZ((AbstractC83312Wmq) aqS161S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS161S0200000_14 aqS161S0200000_14) {
        if (((C83310Wmo) aqS161S0200000_14.l0).LIZIZ) {
            ((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZJ.set(true);
            ((C83310Wmo) aqS161S0200000_14.l0).LIZIZ((AbstractC83312Wmq) aqS161S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS161S0200000_14 aqS161S0200000_14) {
        int i = ((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZ.get();
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    C83310Wmo c83310Wmo = (C83310Wmo) aqS161S0200000_14.l0;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("task ");
                    LIZ.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZLLL);
                    LIZ.append(" state: unknown, info: ");
                    LIZ.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c83310Wmo.getClass();
                    C83310Wmo.LJII(LIZIZ);
                } else {
                    List<InterfaceC83314Wms> list = ((C83310Wmo) aqS161S0200000_14.l0).LJ().get((InterfaceC65637PpR) ((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                    if (list != null) {
                        for (InterfaceC83314Wms interfaceC83314Wms : list) {
                            if (interfaceC83314Wms != null) {
                                interfaceC83314Wms.LIZ(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                            }
                        }
                    }
                    C83310Wmo c83310Wmo2 = (C83310Wmo) aqS161S0200000_14.l0;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("task ");
                    LIZ2.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZLLL);
                    LIZ2.append(" state: failed, info: ");
                    LIZ2.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    c83310Wmo2.getClass();
                    C83310Wmo.LJII(LIZIZ2);
                }
            } else {
                List<InterfaceC83314Wms> list2 = ((C83310Wmo) aqS161S0200000_14.l0).LJ().get((InterfaceC65637PpR) ((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                if (list2 != null) {
                    for (InterfaceC83314Wms interfaceC83314Wms2 : list2) {
                        if (interfaceC83314Wms2 != null) {
                            interfaceC83314Wms2.onSuccess(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                        }
                    }
                }
                C83310Wmo c83310Wmo3 = (C83310Wmo) aqS161S0200000_14.l0;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("task ");
                LIZ3.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZLLL);
                LIZ3.append(" state: success, info: ");
                LIZ3.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                c83310Wmo3.getClass();
                C83310Wmo.LJII(LIZIZ3);
            }
        } else {
            List<InterfaceC83314Wms> list3 = ((C83310Wmo) aqS161S0200000_14.l0).LJ().get((InterfaceC65637PpR) ((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
            if (list3 != null) {
                for (InterfaceC83314Wms interfaceC83314Wms3 : list3) {
                    if (interfaceC83314Wms3 != null) {
                        interfaceC83314Wms3.LIZIZ(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
                    }
                }
            }
            C83310Wmo c83310Wmo4 = (C83310Wmo) aqS161S0200000_14.l0;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("task ");
            LIZ4.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LIZLLL);
            LIZ4.append(" state: running, info: ");
            LIZ4.append(((AbstractC83312Wmq) aqS161S0200000_14.l1).LJ);
            String LIZIZ4 = X1D.LIZIZ(LIZ4);
            c83310Wmo4.getClass();
            C83310Wmo.LJII(LIZIZ4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS161S0200000_14 aqS161S0200000_14) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((VJO) aqS161S0200000_14.l0);
        LIZ.append(" will be execution, transfer bucket(");
        LIZ.append(((VJO) aqS161S0200000_14.l0).LJLJJI);
        LIZ.append(") from idle to running, ");
        LIZ.append("update last execution from ");
        Integer num = (Integer) ((LinkedHashMap) ((VJR) aqS161S0200000_14.l1).LJLJI).get(Integer.valueOf(((VJO) aqS161S0200000_14.l0).LJLJJI));
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" to ");
        LIZ.append(((VJO) aqS161S0200000_14.l0).LJLJI);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$38(AqS161S0200000_14 aqS161S0200000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((VJS) aqS161S0200000_14.l0).LJLILLLLZI);
        LIZ.append(" finished, transfer bucket(");
        return C08380Uo.LIZ(LIZ, ((VJS) aqS161S0200000_14.l0).LJLILLLLZI.LJLJJI, ") from running to idle", LIZ);
    }

    public static final Object invoke$39(AqS161S0200000_14 aqS161S0200000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("all bucket is running or finished, running is ");
        LIZ.append(((VJR) aqS161S0200000_14.l0).LJLILLLLZI);
        LIZ.append(", ");
        LIZ.append("pending is ");
        LIZ.append((LinkedList) aqS161S0200000_14.l1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$4(AqS161S0200000_14 aqS161S0200000_14) {
        ((C83113Wjd) aqS161S0200000_14.l0).K(true, (ILU) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS161S0200000_14 aqS161S0200000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((VJS) aqS161S0200000_14.l0).LJLILLLLZI);
        LIZ.append(" finished, transfer bucket(");
        return C08380Uo.LIZ(LIZ, ((VJS) aqS161S0200000_14.l0).LJLILLLLZI.LJLJJI, ") from running to idle", LIZ);
    }

    public static final Object invoke$41(AqS161S0200000_14 aqS161S0200000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("all bucket is running or finished, running is ");
        LIZ.append(((VJR) aqS161S0200000_14.l0).LJLILLLLZI);
        LIZ.append(", ");
        LIZ.append("pending is ");
        LIZ.append((LinkedList) aqS161S0200000_14.l1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$42(AqS161S0200000_14 aqS161S0200000_14) {
        C81975WFf LJII = ((WI6) aqS161S0200000_14.l0).LJII();
        EnumC82528WaC speedType = (EnumC82528WaC) aqS161S0200000_14.l1;
        o.LJIIIIZZ(speedType, "speedType");
        LJII.LJLJI = WI2.LIZJ(speedType);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS161S0200000_14 aqS161S0200000_14) {
        return Integer.valueOf(((C83146WkA) aqS161S0200000_14.l1).LJIIJJI.LIZIZ((ComposerBeauty) aqS161S0200000_14.l0, false));
    }

    public static final Object invoke$44(AqS161S0200000_14 aqS161S0200000_14) {
        return Integer.valueOf(((C83146WkA) aqS161S0200000_14.l1).LJIIJJI.LIZIZ((ComposerBeauty) aqS161S0200000_14.l0, false));
    }

    public static final Object invoke$46(AqS161S0200000_14 aqS161S0200000_14) {
        try {
            ((C83146WkA) aqS161S0200000_14.l0).LJIJJ((ComposerBeauty) aqS161S0200000_14.l1);
        } catch (Exception unused) {
            InterfaceC58234MtK interfaceC58234MtK = C82516Wa0.LJIIIZ;
            if (interfaceC58234MtK != null) {
                interfaceC58234MtK.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS161S0200000_14 aqS161S0200000_14) {
        ((C83146WkA) aqS161S0200000_14.l0).LJIJJ((ComposerBeauty) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS161S0200000_14 aqS161S0200000_14) {
        VIW viw = (VIW) aqS161S0200000_14.l0;
        viw.LIZIZ.post(new ARunnableS13S0210000_14(viw, (Aweme) aqS161S0200000_14.l1, true, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS161S0200000_14 aqS161S0200000_14) {
        Iterator it = ((ArrayList) ((AbstractC83637Ws5) aqS161S0200000_14.l0).LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC83710WtG) it.next()).LIZ((C83644WsC) aqS161S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS161S0200000_14 aqS161S0200000_14) {
        int i;
        if (!((ArrayList) ((VECameraController) aqS161S0200000_14.l0).LLIIZ).contains((InterfaceC83991Wxn) aqS161S0200000_14.l1)) {
            ((ArrayList) ((VECameraController) aqS161S0200000_14.l0).LLIIZ).add((InterfaceC83991Wxn) aqS161S0200000_14.l1);
        }
        VECameraController vECameraController = (VECameraController) aqS161S0200000_14.l0;
        float f = vECameraController.LL;
        if (f > 0 && (i = vECameraController.LJLLJ) > 0 && vECameraController.LJLLILLLL) {
            ((InterfaceC83991Wxn) aqS161S0200000_14.l1).onZoomSupport(i, true, false, f, vECameraController.LLFZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(AqS161S0200000_14 aqS161S0200000_14) {
        return new C45323HqZ(((C83444Woy) aqS161S0200000_14.l0).LJI, (C82622Wbi) aqS161S0200000_14.l1);
    }

    public static final Object invoke$51(AqS161S0200000_14 aqS161S0200000_14) {
        return new C83467WpL(new C83439Wot((C82622Wbi) aqS161S0200000_14.l0)).LIZLLL(((C83444Woy) aqS161S0200000_14.l1).LIZLLL()).LIZJ((C45323HqZ) ((C83444Woy) aqS161S0200000_14.l1).LJII.getValue());
    }

    public static final Object invoke$52(AqS161S0200000_14 aqS161S0200000_14) {
        return new C45323HqZ(((C83449Wp3) aqS161S0200000_14.l0).LJI, (C82622Wbi) aqS161S0200000_14.l1);
    }

    public static final Object invoke$53(AqS161S0200000_14 aqS161S0200000_14) {
        return new C83467WpL(new C45327Hqd((C82622Wbi) aqS161S0200000_14.l0)).LIZLLL(new C83448Wp2(new C83467WpL(new C83439Wot((C82622Wbi) aqS161S0200000_14.l0)).LIZLLL(((C83449Wp3) aqS161S0200000_14.l1).LIZLLL()))).LIZJ((C45323HqZ) ((C83449Wp3) aqS161S0200000_14.l1).LJII.getValue());
    }

    public static final Object invoke$54(AqS161S0200000_14 aqS161S0200000_14) {
        ((ImageView) aqS161S0200000_14.l0).setImageBitmap(((W5B) ((W5A) aqS161S0200000_14.l1)).getUnderlyingBitmap());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS161S0200000_14 aqS161S0200000_14) {
        ((ImageView) aqS161S0200000_14.l0).setImageDrawable((Drawable) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS161S0200000_14 aqS161S0200000_14) {
        ((ImageView) aqS161S0200000_14.l0).setImageBitmap((Bitmap) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS161S0200000_14 aqS161S0200000_14) {
        boolean z;
        WJ3 wj3 = (WJ3) aqS161S0200000_14.l0;
        ShortVideoContext shortVideoContext = (ShortVideoContext) aqS161S0200000_14.l1;
        wj3.getClass();
        if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }

    public static final Object invoke$58(AqS161S0200000_14 aqS161S0200000_14) {
        boolean z;
        WJ3 wj3 = (WJ3) aqS161S0200000_14.l0;
        ShortVideoContext shortVideoContext = (ShortVideoContext) aqS161S0200000_14.l1;
        wj3.getClass();
        if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }

    public static final Object invoke$59(AqS161S0200000_14 aqS161S0200000_14) {
        return ((C83826Wv8) aqS161S0200000_14.l0).LJLLL.LIZIZ((InterfaceC83821Wv3) aqS161S0200000_14.l1);
    }

    public static final Object invoke$6(AqS161S0200000_14 aqS161S0200000_14) {
        ((ArrayList) ((VECameraController) aqS161S0200000_14.l0).LLIIZ).remove((InterfaceC83991Wxn) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(AqS161S0200000_14 aqS161S0200000_14) {
        ((C82247WPr) ((AqS180S0100000_14) aqS161S0200000_14.l0).l0).LJIJI.sw((FilterBean) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(AqS161S0200000_14 aqS161S0200000_14) {
        Context context = ((View) aqS161S0200000_14.l0).getContext();
        o.LJIIIIZZ(context, "itemView.context");
        return new C83324Wn2(context, (InterfaceC83334WnC) ((C83332WnA) aqS161S0200000_14.l1).LJLLLLLL.getValue());
    }

    public static final Object invoke$62(AqS161S0200000_14 aqS161S0200000_14) {
        return new C83333WnB((InterfaceC83334WnC) aqS161S0200000_14.l1, (C83332WnA) aqS161S0200000_14.l0);
    }

    public static final Object invoke$63(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LIZIZ((Map) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$64(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.onEventPost((VMM) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$65(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LIZLLL((C79601VLx) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$66(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJFF((Map) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$67(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJIIIIZZ((VM0) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$68(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJIIIZ((VMD) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$69(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJIIJJI((Map) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS161S0200000_14 aqS161S0200000_14) {
        return new C45233Hp7(((C83454Wp8) aqS161S0200000_14.l0).LJI, (C82622Wbi) aqS161S0200000_14.l1);
    }

    public static final Object invoke$70(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJIIL((Map) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$71(AqS161S0200000_14 aqS161S0200000_14) {
        ((VN8) aqS161S0200000_14.l0).LJLILLLLZI.LJIILIIL((LynxPerfMetric) aqS161S0200000_14.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$72(AqS161S0200000_14 aqS161S0200000_14) {
        C81975WFf LJIILJJIL = ((WID) aqS161S0200000_14.l0).LJIILJJIL();
        Boolean enable = (Boolean) aqS161S0200000_14.l1;
        LJIILJJIL.LJLILLLLZI = -1;
        LJIILJJIL.LJLJI = WI2.LIZJ(EnumC82528WaC.NORMAL);
        o.LJIIIIZZ(enable, "enable");
        LJIILJJIL.LJLJJLL = enable.booleanValue();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$73(AqS161S0200000_14 aqS161S0200000_14) {
        if (((C82068WIu) aqS161S0200000_14.l0).LJ && !((ShortVideoContext) aqS161S0200000_14.l1).LJJIJIIJI()) {
            MusicService.LJJLIIIJJI().LJIJJ();
        }
        return false;
    }

    public static final Object invoke$74(AqS161S0200000_14 aqS161S0200000_14) {
        C81975WFf LJIILJJIL = ((WID) aqS161S0200000_14.l0).LJIILJJIL();
        EnumC82528WaC speedType = (EnumC82528WaC) aqS161S0200000_14.l1;
        o.LJIIIIZZ(speedType, "speedType");
        LJIILJJIL.LJLJI = WI2.LIZJ(speedType);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$75(AqS161S0200000_14 aqS161S0200000_14) {
        T4X t4x = ((C81455Vxz) aqS161S0200000_14.l0).LJLJLJ;
        if (t4x != null) {
            if (t4x.LJLJJL) {
                t4x.LIZJ();
                T4X t4x2 = ((C81455Vxz) aqS161S0200000_14.l0).LJLJLJ;
                if (t4x2 != null) {
                    t4x2.setVisibility(8);
                    ((C81457Vy1) aqS161S0200000_14.l1).LJLIL = false;
                } else {
                    o.LJIJI("loadMoreDoubleBall");
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("loadMoreDoubleBall");
        throw null;
    }

    public static final Object invoke$76(AqS161S0200000_14 aqS161S0200000_14) {
        InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> interfaceC88471Ynr = ((VY5) aqS161S0200000_14.l0).LIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.FALSE, Integer.valueOf(((C78163Ulz) aqS161S0200000_14.l1).LIZ));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$77(AqS161S0200000_14 aqS161S0200000_14) {
        C83328Wn6 c83328Wn6 = (C83328Wn6) aqS161S0200000_14.l0;
        C29S c29s = c83328Wn6.LJLJI;
        TEZ tez = c83328Wn6.LJLJJI;
        View view = (View) aqS161S0200000_14.l1;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C83328Wn6 c83328Wn62 = (C83328Wn6) aqS161S0200000_14.l0;
        return new C74277TDd(c29s, tez, (ViewGroup) view, c83328Wn62.LJLJLLL, c83328Wn62.LJLJJLL, new C83329Wn7((C83328Wn6) aqS161S0200000_14.l0));
    }

    public static final Object invoke$78(AqS161S0200000_14 aqS161S0200000_14) {
        C16230kN c16230kN = new C16230kN((Context) aqS161S0200000_14.l0, ((C82016WGu) aqS161S0200000_14.l1).LIZLLL);
        c16230kN.LIZIZ(((C82016WGu) aqS161S0200000_14.l1).LIZIZ);
        return c16230kN;
    }

    public static final Object invoke$79(AqS161S0200000_14 aqS161S0200000_14) {
        return new C82537WaL((Context) aqS161S0200000_14.l0, ((C82016WGu) aqS161S0200000_14.l1).LJ);
    }

    public static final Object invoke$8(AqS161S0200000_14 aqS161S0200000_14) {
        return new C83467WpL(new C45266Hpe((C82622Wbi) aqS161S0200000_14.l1)).LIZLLL(new C83453Wp7(new C83467WpL(new C83437Wor(((C83454Wp8) aqS161S0200000_14.l0).LJI, (C82622Wbi) aqS161S0200000_14.l1)).LIZLLL(((C83454Wp8) aqS161S0200000_14.l0).LIZLLL()))).LIZJ((C45233Hp7) ((C83454Wp8) aqS161S0200000_14.l0).LJII.getValue());
    }

    public static final Object invoke$80(AqS161S0200000_14 aqS161S0200000_14) {
        ((C83230WlW) aqS161S0200000_14.l0).LJLJLLL.getClass();
        return ((View) aqS161S0200000_14.l1).getContext().getString(0);
    }

    public static final Object invoke$81(AqS161S0200000_14 aqS161S0200000_14) {
        ((C83230WlW) aqS161S0200000_14.l0).LJLJLLL.getClass();
        return ((View) aqS161S0200000_14.l1).getContext().getString(0);
    }

    public static final Object invoke$82(AqS161S0200000_14 aqS161S0200000_14) {
        View findViewById = ((View) aqS161S0200000_14.l1).findViewById(R.id.m0i);
        ((C83230WlW) aqS161S0200000_14.l0).LJLJLLL.getClass();
        return findViewById;
    }

    public static final Object invoke$84(AqS161S0200000_14 aqS161S0200000_14) {
        VN7 vn7 = (VN7) aqS161S0200000_14.l0;
        if (vn7.LIZIZ) {
            ((LinkedList) vn7.LIZJ).add(aqS161S0200000_14.l1);
            int size = ((LinkedList) ((VN7) aqS161S0200000_14.l0).LIZJ).size();
            VN7 vn72 = (VN7) aqS161S0200000_14.l0;
            if (size > vn72.LJ) {
                vn72.LIZIZ();
            }
        } else {
            vn7.LIZLLL.onEventFired(aqS161S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS161S0200000_14 aqS161S0200000_14) {
        InterfaceC83370Wnm interfaceC83370Wnm = ((C83374Wnq) aqS161S0200000_14.l0).LJLJJL;
        if (interfaceC83370Wnm != null) {
            interfaceC83370Wnm.yT((AbstractC83369Wnl) aqS161S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS161S0200000_14(com.ss.android.ugc.aweme.beauty.ComposerBeauty r3, X.C83146WkA r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 43: goto Lf;
                case 44: goto Lf;
                case 45: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS161S0200000_14.<init>(com.ss.android.ugc.aweme.beauty.ComposerBeauty, X.WkA, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS161S0200000_14(X.C82622Wbi r3, X.C83444Woy r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 50: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS161S0200000_14.<init>(X.Wbi, X.Woy, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS161S0200000_14(X.C82622Wbi r3, X.C83449Wp3 r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 52: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS161S0200000_14.<init>(X.Wbi, X.Wp3, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(InterfaceC148845sm interfaceC148845sm, InterfaceC122704ri interfaceC122704ri, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC148845sm;
        this.l1 = interfaceC122704ri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VJR vjr, VJO vjo, int i) {
        super(0);
        this.$t = i;
        this.l0 = vjo;
        this.l1 = vjr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VJR vjr, LinkedList linkedList, int i) {
        super(0);
        this.$t = i;
        this.l0 = vjr;
        this.l1 = linkedList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VJS vjs, VJR vjr, int i) {
        super(0);
        this.$t = i;
        this.l0 = vjs;
        this.l1 = vjr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VM4 vm4, VNS vns, int i) {
        super(0);
        this.$t = i;
        this.l0 = vm4;
        this.l1 = vns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN7 vn7, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn7;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, C79601VLx c79601VLx, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = c79601VLx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, VM0 vm0, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = vm0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, VMD vmd, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = vmd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, VMM vmm, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = vmm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, LynxPerfMetric lynxPerfMetric, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = lynxPerfMetric;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VN8 vn8, Map map, int i) {
        super(0);
        this.$t = i;
        this.l0 = vn8;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VNS vns, C79604VMa c79604VMa, int i) {
        super(0);
        this.$t = i;
        this.l0 = vns;
        this.l1 = c79604VMa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VY5 vy5, C78163Ulz c78163Ulz, int i) {
        super(0);
        this.$t = i;
        this.l0 = vy5;
        this.l1 = c78163Ulz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C80083Vbr c80083Vbr, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c80083Vbr;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C80084Vbs c80084Vbs, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c80084Vbs;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C81312Vvg c81312Vvg, EnumC81316Vvk enumC81316Vvk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c81312Vvg;
        this.l1 = enumC81316Vvk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C81455Vxz c81455Vxz, C81457Vy1 c81457Vy1, int i) {
        super(0);
        this.$t = i;
        this.l0 = c81455Vxz;
        this.l1 = c81457Vy1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C81489VyX c81489VyX, Animation animation, int i) {
        super(0);
        this.$t = i;
        this.l0 = c81489VyX;
        this.l1 = animation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WI6 wi6, EnumC82528WaC enumC82528WaC, int i) {
        super(0);
        this.$t = i;
        this.l0 = wi6;
        this.l1 = enumC82528WaC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WID wid, EnumC82528WaC enumC82528WaC, int i) {
        super(0);
        this.$t = i;
        this.l0 = wid;
        this.l1 = enumC82528WaC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WID wid, Boolean bool, int i) {
        super(0);
        this.$t = i;
        this.l0 = wid;
        this.l1 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C82068WIu c82068WIu, ShortVideoContext shortVideoContext, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82068WIu;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WJ3 wj3, ShortVideoContext shortVideoContext, int i) {
        super(0);
        this.$t = i;
        this.l0 = wj3;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WM7 wm7, InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = wm7;
        this.l1 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS161S0200000_14(C82306WRy c82306WRy, C82306WRy c82306WRy2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c82306WRy;
        this.l1 = c82306WRy2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(WYF wyf, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = wyf;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C82492WZc c82492WZc, WZ5 wz5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82492WZc;
        this.l1 = wz5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE, C82718WdG c82718WdG, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnTouchListenerC82716WdE;
        this.l1 = c82718WdG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83113Wjd c83113Wjd, ILU ilu, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83113Wjd;
        this.l1 = ilu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83207Wl9 c83207Wl9, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83207Wl9;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83230WlW c83230WlW, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83230WlW;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83310Wmo c83310Wmo, AbstractC83312Wmq abstractC83312Wmq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83310Wmo;
        this.l1 = abstractC83312Wmq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83328Wn6 c83328Wn6, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83328Wn6;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83346WnO c83346WnO, C83332WnA c83332WnA, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83332WnA;
        this.l1 = c83346WnO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83374Wnq c83374Wnq, AbstractC83369Wnl abstractC83369Wnl, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83374Wnq;
        this.l1 = abstractC83369Wnl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83454Wp8 c83454Wp8, C82622Wbi c82622Wbi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83454Wp8;
        this.l1 = c82622Wbi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(AbstractC83637Ws5 abstractC83637Ws5, C83644WsC c83644WsC, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC83637Ws5;
        this.l1 = c83644WsC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83826Wv8 c83826Wv8, InterfaceC83821Wv3 interfaceC83821Wv3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83826Wv8;
        this.l1 = interfaceC83821Wv3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(C83861Wvh c83861Wvh, C29S c29s, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83861Wvh;
        this.l1 = c29s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(Context context, C82016WGu c82016WGu, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c82016WGu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(View view, C83332WnA c83332WnA, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c83332WnA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(ImageView imageView, W5A w5a, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageView;
        this.l1 = w5a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(ImageView imageView, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageView;
        this.l1 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(ImageView imageView, Drawable drawable, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageView;
        this.l1 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(VECameraController vECameraController, InterfaceC83991Wxn interfaceC83991Wxn, int i) {
        super(0);
        this.$t = i;
        this.l0 = vECameraController;
        this.l1 = interfaceC83991Wxn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(ComposerBeauty composerBeauty, AqS180S0100000_14 aqS180S0100000_14, int i) {
        super(0);
        this.$t = i;
        this.l0 = composerBeauty;
        this.l1 = aqS180S0100000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(EmojiAnimPlayground emojiAnimPlayground, Canvas canvas, int i) {
        super(0);
        this.$t = i;
        this.l0 = emojiAnimPlayground;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(Aweme aweme, VIW viw, int i) {
        super(0);
        this.$t = i;
        this.l0 = viw;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(UniversalPopupManager universalPopupManager, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = universalPopupManager;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, T4Q t4q, int i) {
        super(0);
        this.$t = i;
        this.l0 = backgroundVideoStickerPresenter;
        this.l1 = t4q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(DiyPropVideoStickerHandler diyPropVideoStickerHandler, T4Q t4q, int i) {
        super(0);
        this.$t = i;
        this.l0 = diyPropVideoStickerHandler;
        this.l1 = t4q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(UploadPicStickerARPresenter uploadPicStickerARPresenter, T4Q t4q, int i) {
        super(0);
        this.$t = i;
        this.l0 = uploadPicStickerARPresenter;
        this.l1 = t4q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(Effect effect, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS161S0200000_14(AqS180S0100000_14 aqS180S0100000_14, FilterBean filterBean, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS180S0100000_14;
        this.l1 = filterBean;
    }
}
