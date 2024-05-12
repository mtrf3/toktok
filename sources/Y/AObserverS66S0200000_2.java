package Y;

import X.AnonymousClass523;
import X.AnonymousClass525;
import X.C00F;
import X.C121594pv;
import X.C122034qd;
import X.C124574uj;
import X.C125674wV;
import X.C127604zc;
import X.C127644zg;
import X.C1282051k;
import X.C132005Ga;
import X.C132045Ge;
import X.C132885Jk;
import X.C135315St;
import X.C140415fB;
import X.C148725sa;
import X.C148915st;
import X.C150805vw;
import X.C1536161d;
import X.C165426eQ;
import X.C170666ms;
import X.C17N;
import X.C32I;
import X.C34K;
import X.C39579Fg7;
import X.C42000Ge4;
import X.C50Q;
import X.C53142KtO;
import X.C5DC;
import X.C5IZ;
import X.C5L7;
import X.C5LF;
import X.C5QE;
import X.C5T8;
import X.C5T9;
import X.C60903NvH;
import X.C60B;
import X.C60M;
import X.C62822Ol8;
import X.C62N;
import X.C62Q;
import X.C63C;
import X.C63D;
import X.C67P;
import X.C76800UCe;
import X.C79057V0z;
import X.C82238WPi;
import X.C84488XDw;
import X.EnumC123864ta;
import X.H7B;
import X.H7R;
import X.InterfaceC127634zf;
import X.InterfaceC1278950f;
import X.InterfaceC132925Jo;
import X.InterfaceC139045cy;
import X.InterfaceC142545ic;
import X.InterfaceC143655kP;
import X.InterfaceC143745kY;
import X.InterfaceC153045zY;
import X.InterfaceC153275zv;
import X.InterfaceC65784Pro;
import X.InterfaceC81454Vxy;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.WPJ;
import X.X1D;
import X.XCT;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.FetchEffectState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import dmt.av.video.StoredLiveData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObserverS66S0200000_2 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onChanged$2(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((StoredLiveData) aObserverS66S0200000_2.l0).lambda$observe$0((InterfaceC143745kY) aObserverS66S0200000_2.l1, obj);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return;
        }
        l.longValue();
        C5T8 c5t8 = ((C5T9) aObserverS66S0200000_2.l0).LJIIIZ;
        if (c5t8 != null && -1 == c5t8.LJ((int) l.longValue())) {
            ((InterfaceC88472Yns) aObserverS66S0200000_2.l1).invoke(Boolean.TRUE);
        } else {
            ((InterfaceC88472Yns) aObserverS66S0200000_2.l1).invoke(Boolean.FALSE);
        }
    }

    public static final void onChanged$1(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        String name;
        boolean z;
        long endTime;
        float canvasRatio;
        long endTime2;
        StickerNewEngineModel it = (StickerNewEngineModel) obj;
        C135315St c135315St = (C135315St) aObserverS66S0200000_2.l0;
        o.LJIIIIZZ(it, "it");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS66S0200000_2.l1;
        int i = videoPublishEditModel.mOutVideoWidth;
        int i2 = videoPublishEditModel.mOutVideoHeight;
        InterfaceC153045zY mVEEditor = c135315St.LJIIIZ;
        o.LJIIIIZZ(mVEEditor, "mVEEditor");
        C122034qd LJJI = C17N.LJJI(mVEEditor);
        if (LJJI != null) {
            ArrayList arrayList = new ArrayList();
            List<TextStickerModel> list = it.textStickerModels;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<TextStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getBaseStickerModel());
            }
            arrayList.addAll(arrayList2);
            List<AICaptionTagStickerModel> list2 = it.aiCaptionTagStickers;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<AICaptionTagStickerModel> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().getBaseStickerModel());
            }
            arrayList.addAll(arrayList3);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                BaseStickerModel baseStickerModel = (BaseStickerModel) it4.next();
                String compilePath = baseStickerModel.getCompilePath();
                if (!C39579Fg7.LIZIZ(compilePath) || (name = new File(compilePath).getName()) == null || name.length() == 0) {
                    String str = "NewEngine text compile file not exist: id=" + baseStickerModel.getId() + ", path " + baseStickerModel.getCompilePath();
                    C5L7.LIZIZ();
                    C170666ms.LIZJ(new Exception(str));
                } else {
                    C121594pv c121594pv = new C121594pv(0);
                    C62822Ol8 c62822Ol8 = C150805vw.LIZ;
                    if (((Number) c62822Ol8.getValue()).intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(compilePath, options);
                        if (i == 0 || i2 == 0) {
                            canvasRatio = LJJI.LJIIJ.LJ().getCanvasRatio() * 1 * ((options.outHeight * 1.0f) / options.outWidth);
                        } else {
                            canvasRatio = ((i * 1.0f) / i2) / ((options.outWidth * 1.0f) / options.outHeight);
                        }
                        c121594pv.LJIIL = compilePath;
                        c121594pv.LJIILIIL = 1.0f;
                        c121594pv.LJIILJJIL = canvasRatio;
                        c121594pv.LIZJ = baseStickerModel.getStartTime();
                        if (baseStickerModel.getEndTime() <= 0.0f) {
                            endTime2 = LJJI.LJIIJ.LJ().getMaxTargetEnd() / 1000;
                        } else {
                            endTime2 = baseStickerModel.getEndTime();
                        }
                        c121594pv.LIZLLL = endTime2;
                        c121594pv.LIZIZ = baseStickerModel.getZIndex();
                    } else if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                        c121594pv.LJIIL = compilePath;
                        c121594pv.LJIILIIL = baseStickerModel.getScale() * (baseStickerModel.getWidth() / baseStickerModel.getMediaWidth());
                        c121594pv.LJIILJJIL = baseStickerModel.getScale() * (baseStickerModel.getHeight() / baseStickerModel.getMediaHeight());
                        c121594pv.LIZJ = baseStickerModel.getStartTime();
                        if (baseStickerModel.getEndTime() <= 0.0f) {
                            endTime = LJJI.LJIIJ.LJ().getMaxTargetEnd() / 1000;
                        } else {
                            endTime = baseStickerModel.getEndTime();
                        }
                        c121594pv.LIZLLL = endTime;
                        c121594pv.LIZIZ = baseStickerModel.getZIndex();
                        c121594pv.LJIIIIZZ = 1.0f;
                        c121594pv.LJI = -baseStickerModel.getRotation();
                        c121594pv.LJ = (baseStickerModel.getTranslateX() / baseStickerModel.getMediaWidth()) + 0.5f;
                        c121594pv.LJFF = (baseStickerModel.getTranslateY() / baseStickerModel.getMediaHeight()) + 0.5f;
                    }
                    LJJI.LJIIIIZZ().LJJJJIZL(c121594pv);
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onChanged$10(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        InterfaceC142545ic interfaceC142545ic;
        FilterBean LIZLLL = H7R.LIZLLL(((C148915st) aObserverS66S0200000_2.l0).LLLLIL(), C60903NvH.LJIIJJI().LJIILL().LJI());
        InterfaceC143655kP LJJLIIIJLLLLLLLZ = ((C148915st) aObserverS66S0200000_2.l0).LJJLIIIJLLLLLLLZ();
        if ((LJJLIIIJLLLLLLLZ instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) LJJLIIIJLLLLLLLZ) != null) {
            interfaceC142545ic.Yj(LIZLLL);
        }
        ((LiveData) aObserverS66S0200000_2.l1).removeObservers((C148915st) aObserverS66S0200000_2.l0);
    }

    public static final void onChanged$11(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        List<C67P> LJZL;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        Boolean it = (Boolean) obj;
        if (!o.LJ(Boolean.valueOf(((C34K) aObserverS66S0200000_2.l0).element), it)) {
            C34K c34k = (C34K) aObserverS66S0200000_2.l0;
            o.LJIIIIZZ(it, "it");
            c34k.element = it.booleanValue();
            C63C c63c = (C63C) aObserverS66S0200000_2.l1;
            int videoLength = c63c.LLJLLL().getVideoLength();
            if (C42000Ge4.LJIILIIL(c63c.LLJLLL())) {
                for (TextStickerModel textStickerModel : c63c.LLJLLL().creativeModel.stickerModel.textStickerModels) {
                    float startTime = textStickerModel.getBaseStickerModel().getStartTime();
                    float f = videoLength;
                    textStickerModel.getBaseStickerModel().setStartTime(f - textStickerModel.getBaseStickerModel().getEndTime());
                    textStickerModel.getBaseStickerModel().setEndTime(f - startTime);
                    textStickerModel.getBaseStickerModel().setUiStartTime(textStickerModel.getBaseStickerModel().getStartTime());
                    textStickerModel.getBaseStickerModel().setUiEndTime(textStickerModel.getBaseStickerModel().getUiEndTime());
                    InterfaceC139045cy interfaceC139045cy = c63c.LLJILJIL;
                    if (interfaceC139045cy != null) {
                        interfaceC139045cy.vo(textStickerModel);
                    }
                }
                return;
            }
            VideoPublishEditModel LLJLLL = c63c.LLJLLL();
            if (LLJLLL != null && (infoStickerModel = LLJLLL.infoStickerModel) != null && (list = infoStickerModel.stickers) != null) {
                for (StickerItemModel stickerItemModel : list) {
                    int i = stickerItemModel.endTime;
                    if (i != 0) {
                        int i2 = stickerItemModel.startTime;
                        int i3 = videoLength - i;
                        stickerItemModel.startTime = i3;
                        int i4 = videoLength - i2;
                        stickerItemModel.endTime = i4;
                        stickerItemModel.uiStartTime = i3;
                        stickerItemModel.uiEndTime = i4;
                    }
                }
            }
            C63D c63d = c63c.LLJI;
            if (c63d != null && (LJZL = c63d.LJZL()) != null) {
                Iterator<C67P> it2 = LJZL.iterator();
                while (it2.hasNext()) {
                    TextStickerData data = it2.next().getData();
                    if (data != null && data.getEndTime() != 0) {
                        int startTime2 = data.getStartTime();
                        data.setStartTime(videoLength - data.getEndTime());
                        data.setEndTime(videoLength - startTime2);
                        data.setUiStartTime(data.getStartTime());
                        data.setUiEndTime(data.getEndTime());
                    }
                }
            }
        }
    }

    public static final void onChanged$12(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        EnumC123864ta enumC123864ta;
        NLETrack nLETrack;
        C5DC editorProGuidanceController;
        AnonymousClass525 LJI;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass523 anonymousClass523;
        AnonymousClass523 LIZ;
        NLETrackSlot nLETrackSlot;
        AnonymousClass525 LJI2;
        C125674wV c125674wV = (C125674wV) obj;
        NLETrack nLETrack2 = c125674wV.LIZ;
        EnumC123864ta enumC123864ta2 = null;
        if (nLETrack2 != null) {
            enumC123864ta = C79057V0z.LJJIJIL(nLETrack2);
        } else {
            enumC123864ta = null;
        }
        if (enumC123864ta == EnumC123864ta.AUDIO) {
            C50Q funcBarController = ((EditorProScene) aObserverS66S0200000_2.l0).getFuncBarController();
            if (funcBarController != null && (LJI2 = funcBarController.LJI()) != null) {
                LJI2.LJI((String[]) aObserverS66S0200000_2.l1);
                return;
            }
            return;
        }
        NLETrack nLETrack3 = c125674wV.LIZ;
        if (nLETrack3 != null) {
            enumC123864ta2 = C79057V0z.LJJIJIL(nLETrack3);
        }
        if (enumC123864ta2 != EnumC123864ta.VIDEO || (nLETrack = c125674wV.LIZ) == null || !nLETrack.LJIIJ()) {
            return;
        }
        C50Q funcBarController2 = ((EditorProScene) aObserverS66S0200000_2.l0).getFuncBarController();
        if (funcBarController2 != null && (LJI = funcBarController2.LJI()) != null) {
            EditorProScene editorProScene = (EditorProScene) aObserverS66S0200000_2.l0;
            NLETrackSlot nLETrackSlot2 = c125674wV.LIZIZ;
            if (nLETrackSlot2 != null && !C124574uj.LJJIJIIJI(nLETrackSlot2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LJI.LJIIIIZZ("bottom_item_edit_volume", false);
            } else {
                LJI.LJFF("bottom_item_edit_volume");
            }
            NLETrackSlot nLETrackSlot3 = c125674wV.LIZIZ;
            if (nLETrackSlot3 != null && C124574uj.LJJJJ(nLETrackSlot3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LJI.LJIIIIZZ("bottom_item_edit_speed", false);
                LJI.LJIIIIZZ("bottom_item_edit_voice_effect", false);
            } else {
                LJI.LJFF("bottom_item_edit_speed");
                NLETrackSlot nLETrackSlot4 = c125674wV.LIZIZ;
                if (nLETrackSlot4 != null && C124574uj.LJJJJJ(nLETrackSlot4)) {
                    LJI.LJIIIIZZ("bottom_item_edit_voice_effect", false);
                } else {
                    LJI.LJFF("bottom_item_edit_voice_effect");
                }
            }
            NLETrackSlot nLETrackSlot5 = c125674wV.LIZIZ;
            if (nLETrackSlot5 != null && C124574uj.LJJJLZIJ(nLETrackSlot5)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || ((nLETrackSlot = c125674wV.LIZIZ) != null && nLETrackSlot.hasExtra("library_id"))) {
                LJI.LJIIIIZZ("bottom_item_edit_start_over", false);
                C1282051k funcBarConfig = editorProScene.getFuncBarConfig();
                if (funcBarConfig != null && (anonymousClass523 = funcBarConfig.LJFF) != null && (LIZ = LJI.LIZIZ.LIZ("bottom_item_root_edit")) != null && C53142KtO.LIZ() && !LIZ.LIZ(anonymousClass523)) {
                    LJI.LIZLLL(anonymousClass523, LJI.LJIIIZ("bottom_item_root_edit", "bottom_item_edit_volume") + 1);
                }
            } else {
                if (!C53142KtO.LIZ() || ((Boolean) C53142KtO.LIZIZ.getValue()).booleanValue()) {
                    LJI.LJFF("bottom_item_edit_start_over");
                }
                if (((Boolean) C53142KtO.LIZIZ.getValue()).booleanValue() && editorProScene.isMultiRecord) {
                    LJI.LIZJ("bottom_item_root_edit", "bottom_item_edit_replace");
                }
            }
        }
        if (((EditorProScene) aObserverS66S0200000_2.l0).getEditorContext().getPlayer().H9() != 0 || !c125674wV.LIZJ || (editorProGuidanceController = ((EditorProScene) aObserverS66S0200000_2.l0).getEditorProGuidanceController()) == null) {
            return;
        }
        editorProGuidanceController.LJ(true);
    }

    public static final void onChanged$13(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((C5LF) aObserverS66S0200000_2.l0).LLJJ(false);
        ((C5LF) aObserverS66S0200000_2.l0).Qq0((C132045Ge) aObserverS66S0200000_2.l1, false, false);
        ((C5LF) aObserverS66S0200000_2.l0).LJJZZI(C5IZ.LJLIL);
    }

    public static final void onChanged$14(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        String str;
        NLETrackSlot nLETrackSlot;
        C125674wV c125674wV = (C125674wV) obj;
        NLETrack nLETrack = c125674wV.LIZ;
        NLETrack selectedTrack = ((C127604zc) aObserverS66S0200000_2.l0).LJIILL().getSelectedTrack();
        NLETrackSlot nLETrackSlot2 = c125674wV.LIZIZ;
        NLETrackSlot selectedTrackSlot = ((C127604zc) aObserverS66S0200000_2.l0).LJIILL().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            str = selectedTrackSlot.getUUID();
        } else {
            str = null;
        }
        if (c125674wV.LIZLLL || nLETrackSlot2 == null || nLETrack == null) {
            ((C127604zc) aObserverS66S0200000_2.l0).LLIIIL = false;
        } else if (C00F.LIZ(31744, 0, "studio_editor_pro_bottom_bar_ux_opt", true) == 1 && selectedTrack != null && selectedTrack.LJIIJ() != nLETrack.LJIIJ()) {
            ((C127604zc) aObserverS66S0200000_2.l0).LLIIIL = true;
        } else if (C127644zg.LIZIZ() && str != null && str.length() != 0 && !o.LJ(str, nLETrackSlot2.getUUID())) {
            ((C127604zc) aObserverS66S0200000_2.l0).LLIIIL = true;
        }
        NLETrack nLETrack2 = c125674wV.LIZ;
        if (nLETrack2 == null || (nLETrackSlot = c125674wV.LIZIZ) == null) {
            ((InterfaceC1278950f) aObserverS66S0200000_2.l1).T2();
        } else {
            ((InterfaceC1278950f) aObserverS66S0200000_2.l1).G6(nLETrack2, nLETrackSlot);
        }
        InterfaceC127634zf LJJIIZI = ((C127604zc) aObserverS66S0200000_2.l0).LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.pu(c125674wV.LIZIZ);
        }
    }

    public static final void onChanged$15(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        LiveData<Boolean> n2;
        InterfaceC153275zv interfaceC153275zv;
        LiveData<Boolean> n22;
        C60M c60m = (C60M) obj;
        boolean z = c60m.LIZ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c60m.LIZJ;
        if (z) {
            InterfaceC153275zv interfaceC153275zv2 = ((C60B) aObserverS66S0200000_2.l0).LJ;
            if (interfaceC153275zv2 == null || (n2 = interfaceC153275zv2.n2()) == null || n2.getValue() == null || ((interfaceC153275zv = ((C60B) aObserverS66S0200000_2.l0).LJ) != null && (n22 = interfaceC153275zv.n2()) != null && o.LJ(n22.getValue(), Boolean.TRUE))) {
                C148725sa.LIZIZ(((C60B) aObserverS66S0200000_2.l0).LIZ, (View) aObserverS66S0200000_2.l1, c60m.LIZIZ, interfaceC65784Pro);
            }
        }
    }

    public static final void onChanged$16(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        View view;
        C60M c60m = (C60M) obj;
        boolean z = c60m.LIZ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c60m.LIZJ;
        if (z && (view = (View) ((Map) aObserverS66S0200000_2.l0).get(17)) != null) {
            C60B c60b = (C60B) aObserverS66S0200000_2.l1;
            if (H7R.LJJLIIIJJIZ(c60b.LIZIZ)) {
                C148725sa.LIZJ(c60b.LIZ, view, interfaceC65784Pro);
            }
        }
    }

    public static final void onChanged$17(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((ToolSafeHandler) aObserverS66S0200000_2.l0).removeCallbacksAndMessages(null);
        ((ToolSafeHandler) aObserverS66S0200000_2.l0).post((Runnable) aObserverS66S0200000_2.l1);
    }

    public static final void onChanged$18(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((ToolSafeHandler) aObserverS66S0200000_2.l0).removeCallbacksAndMessages(null);
        ((ToolSafeHandler) aObserverS66S0200000_2.l0).post((Runnable) aObserverS66S0200000_2.l1);
    }

    public static final void onChanged$19(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        if (o.LJ(obj, FetchEffectState.INIT.INSTANCE)) {
            EditEffectAnchorManager editEffectAnchorManager = (EditEffectAnchorManager) aObserverS66S0200000_2.l0;
            Activity requireActivity = ((MvChoosePhotoScene) aObserverS66S0200000_2.l1).requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            XCT xct = null;
            EffectManager LJLJJLL = C84488XDw.LIZ(requireActivity, null).LJLJJLL();
            if (LJLJJLL != null) {
                xct = LJLJJLL.getEffectPlatform();
            }
            editEffectAnchorManager.downloadEffects(xct);
        }
    }

    public static final void onChanged$20(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        FilterBean filterBean;
        C140415fB c140415fB = (C140415fB) obj;
        if (c140415fB == null || (filterBean = c140415fB.LJLILLLLZI) == C82238WPi.LIZIZ.getValue()) {
            return;
        }
        WPJ wpj = (WPJ) aObserverS66S0200000_2.l0;
        boolean z = c140415fB.LJLJJL;
        wpj.LIZJ = filterBean;
        wpj.LJIIIZ.SX(true, filterBean, z, true);
        ((InterfaceC88472Yns) aObserverS66S0200000_2.l1).invoke(filterBean);
        ((WPJ) aObserverS66S0200000_2.l0).LJIIJJI.removeObserver(aObserverS66S0200000_2);
    }

    public static final void onChanged$21(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        OSZ osz = (OSZ) obj;
        FrameLayout LJJIFFI = ((C132005Ga) aObserverS66S0200000_2.l0).LJJIFFI((FrameLayout) aObserverS66S0200000_2.l1);
        if (LJJIFFI == null) {
            return;
        }
        LJJIFFI.setLayoutParams(new FrameLayout.LayoutParams((int) ((Number) osz.getFirst()).floatValue(), (int) ((Number) osz.getSecond()).floatValue(), 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$22(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        OSZ osz;
        NLENode nLENode;
        VecNLETrackSPtr tracks;
        NLEModel nLEModel = (NLEModel) obj;
        ((C5QE) aObserverS66S0200000_2.l0).getClass();
        C5QE.LLJILJIL();
        nLEModel.getCanvasRatio();
        C132885Jk c132885Jk = new C132885Jk(nLEModel.getCanvasRatio(), ((FrameLayout) aObserverS66S0200000_2.l1).getMeasuredWidth(), ((FrameLayout) aObserverS66S0200000_2.l1).getMeasuredHeight());
        ((C5QE) aObserverS66S0200000_2.l0).getClass();
        if (!o.LJ(c132885Jk, C5QE.LLJILJIL().LJLJLJ)) {
            ((C5QE) aObserverS66S0200000_2.l0).getClass();
            C5QE.LLJILJIL().gv0(((FrameLayout) aObserverS66S0200000_2.l1).getMeasuredWidth(), ((FrameLayout) aObserverS66S0200000_2.l1).getMeasuredHeight());
        }
        ((C5QE) aObserverS66S0200000_2.l0).getClass();
        MutableLiveData mutableLiveData = C5QE.LLJILJIL().LJLLLL;
        if (mutableLiveData != null && (osz = (OSZ) mutableLiveData.getValue()) != null && (nLENode = (NLENode) osz.getSecond()) != null) {
            C5QE c5qe = (C5QE) aObserverS66S0200000_2.l0;
            NLEVideoFrameModel cover = nLEModel.getCover();
            if (cover != null && cover.getEnable()) {
                tracks = nLEModel.getCover().getTracks();
            } else {
                tracks = nLEModel.getTracks();
            }
            o.LJIIIIZZ(tracks, "tracks");
            Iterator<NLETrack> it = tracks.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    NLETrack next = it.next();
                    Iterator<NLETrackSlot> it2 = next.LJIILL().iterator();
                    while (it2.hasNext()) {
                        NLETrackSlot next2 = it2.next();
                        if (next2.getUUID().equals(nLENode.getUUID())) {
                            c5qe.getClass();
                            C5QE.LLJILJIL().mv0(new OSZ<>(next, next2));
                            break loop0;
                        }
                    }
                } else {
                    c5qe.getClass();
                    C5QE.LLJILJIL().mv0(null);
                    break;
                }
            }
        }
        Iterator<InterfaceC132925Jo> it3 = ((C5QE) aObserverS66S0200000_2.l0).getUiStates().LJ.LIZIZ.values().iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(nLEModel);
        }
    }

    public static final void onChanged$3(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        List<StickerItemModel> list;
        String LIZIZ;
        String name;
        float canvasRatio;
        InfoStickerModel infoStickerModel = (InfoStickerModel) obj;
        C135315St c135315St = (C135315St) aObserverS66S0200000_2.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS66S0200000_2.l1;
        int i = videoPublishEditModel.mOutVideoWidth;
        int i2 = videoPublishEditModel.mOutVideoHeight;
        c135315St.getClass();
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return;
        }
        InterfaceC153045zY mVEEditor = c135315St.LJIIIZ;
        o.LJIIIIZZ(mVEEditor, "mVEEditor");
        C122034qd LJJI = C17N.LJJI(mVEEditor);
        if (LJJI != null) {
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel.isImageStickerLayer) {
                    if (C39579Fg7.LIZIZ(stickerItemModel.path)) {
                        LIZIZ = stickerItemModel.path;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(infoStickerModel.infoStickerDraftDir);
                        LIZ.append(File.separator);
                        String str = stickerItemModel.path;
                        if (str == null) {
                            str = "";
                        }
                        LIZ.append(new File(str).getName());
                        LIZIZ = X1D.LIZIZ(LIZ);
                    }
                    if (!C39579Fg7.LIZIZ(LIZIZ) || (name = new File(LIZIZ).getName()) == null || name.length() == 0) {
                        C5L7.LIZIZ();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("infoSticker not exist ");
                        LIZ2.append(stickerItemModel);
                        C170666ms.LIZJ(new Exception(X1D.LIZIZ(LIZ2)));
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(LIZIZ, options);
                        if (i == 0 || i2 == 0) {
                            canvasRatio = stickerItemModel.w * ((options.outHeight * 1.0f) / options.outWidth) * LJJI.LJIIJ.LJ().getCanvasRatio();
                        } else {
                            canvasRatio = ((i * 1.0f) / i2) / ((options.outWidth * 1.0f) / options.outHeight);
                        }
                        C121594pv c121594pv = new C121594pv(0);
                        c121594pv.LJIIL = LIZIZ;
                        c121594pv.LJIILIIL = stickerItemModel.w;
                        c121594pv.LJIILJJIL = canvasRatio;
                        c121594pv.LJ = stickerItemModel.currentOffsetX;
                        c121594pv.LJFF = stickerItemModel.currentOffsetY;
                        c121594pv.LJIIIIZZ = stickerItemModel.scale;
                        c121594pv.LJI = stickerItemModel.rotateAngle;
                        c121594pv.LIZJ = stickerItemModel.startTime;
                        c121594pv.LIZLLL = stickerItemModel.endTime;
                        c121594pv.LIZIZ = stickerItemModel.layerWeight;
                        LJJI.LJIIIIZZ().LJJJJIZL(c121594pv);
                    }
                }
                if (stickerItemModel.isPin()) {
                    c135315St.LJ();
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onChanged$4(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((InterfaceC81454Vxy) aObserverS66S0200000_2.l0).hidePanel();
        C165426eQ c165426eQ = (C165426eQ) aObserverS66S0200000_2.l1;
        c165426eQ.j10(c165426eQ.getShortVideoContext().commentVideoModel);
    }

    public static final void onChanged$5(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        Activity activity;
        C60M c60m = (C60M) obj;
        if (!c60m.LIZ) {
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c60m.LIZJ;
        if ((((C62N) aObserverS66S0200000_2.l0).LLJILJIL().n2().getValue() != null && !o.LJ(((C62N) aObserverS66S0200000_2.l0).LLJILJIL().n2().getValue(), Boolean.TRUE)) || (activity = ((C62N) aObserverS66S0200000_2.l0).mActivity) == null) {
            return;
        }
        C148725sa.LIZIZ(activity, (C62Q) aObserverS66S0200000_2.l1, c60m.LIZIZ, interfaceC65784Pro);
    }

    public static final void onChanged$6(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObserverS66S0200000_2.l0;
        boolean[] zArr = (boolean[]) aObserverS66S0200000_2.l1;
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) obj;
        if (interfaceC153045zY != null) {
            videoEditContainerScene.LJZL.setVideoLength(interfaceC153045zY.getDuration());
            if (zArr[0]) {
                videoEditContainerScene.LLIILZL.refresh();
            } else {
                zArr[0] = true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoPublishEditActivity, video duration ");
            LIZ.append(interfaceC153045zY.getDuration());
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (!H7R.LJIIL(videoEditContainerScene.LJZL)) {
                VideoLengthChecker.LJ().LIZJ(videoEditContainerScene, videoEditContainerScene.LJZL, videoEditContainerScene.LLII, videoEditContainerScene.LLIILII);
            }
            if (videoEditContainerScene.LJZL.isMvThemeVideoType() && interfaceC153045zY.getDuration() > 0) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(videoEditContainerScene.LJZL.getPreviewInfo().getVideoList(), 0);
                ListProtector.set(videoEditContainerScene.LJZL.getPreviewInfo().getVideoList(), 0, editVideoSegment.copy(editVideoSegment.getVideoPath(), editVideoSegment.getAudioPath(), new VideoFileInfo(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), interfaceC153045zY.getDuration(), 30, 0)));
                return;
            }
            return;
        }
        videoEditContainerScene.getClass();
    }

    public static final void onChanged$7(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        VideoLengthChecker videoLengthChecker = (VideoLengthChecker) aObserverS66S0200000_2.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS66S0200000_2.l1;
        videoLengthChecker.getClass();
        VideoLengthChecker.LJI((InterfaceC153045zY) obj, videoPublishEditModel);
    }

    public static final void onChanged$8(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        InterfaceC153045zY value;
        InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) aObserverS66S0200000_2.l0;
        if (interfaceC143655kP != null && (value = interfaceC143655kP.Kh().getValue()) != null && value.getDuration() >= 61000) {
            ((FTCEditToolbarViewModel) aObserverS66S0200000_2.l1).fg0(1, false);
            C1536161d.LIZLLL(-1, "music");
        }
    }

    public static final void onChanged$9(AObserverS66S0200000_2 aObserverS66S0200000_2, Object obj) {
        ((SafeHandler) aObserverS66S0200000_2.l0).removeCallbacksAndMessages(null);
        ((SafeHandler) aObserverS66S0200000_2.l0).post((Runnable) aObserverS66S0200000_2.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS66S0200000_2(Object obj, C5T9 c5t9, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = c5t9;
    }
}
