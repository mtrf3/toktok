package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS63S0300000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS11S0100100_2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.services.editeffect.FetchEffectState;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.g0;
import dmt.av.video.CompileProbeViewModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS45S1200000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5eJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C139875eJ extends C143265jm<InterfaceC142545ic> implements InterfaceC142545ic {
    public static final C140145ek LLLZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLZI;
    public final VEPreviewParams LLLFZ;
    public final C5V0 LLLI;
    public final C5H3 LLLII;
    public final C5H3 LLLIIII;
    public final C5H3 LLLIIIIL;
    public final InterfaceC115514g7 LLLIIIL;
    public final InterfaceC115514g7 LLLIIL;
    public final InterfaceC115514g7 LLLIILIL;
    public final C5H3 LLLIL;
    public final C5H3 LLLILZ;
    public final InterfaceC115514g7 LLLILZJ;
    public final C5H3 LLLILZLLLI;
    public final MutableLiveData<C76800UCe> LLLIZZ;
    public final C5H3 LLLJ;
    public final InterfaceC115514g7 LLLJIL;
    public FilterBean LLLJL;
    public long LLLL;
    public long LLLLII;
    public volatile long LLLLIIIILLL;
    public volatile long LLLLIIL;
    public volatile boolean LLLLIILL;
    public long LLLLIILLL;
    public long LLLLIL;
    public long LLLLILI;
    public long LLLLJ;
    public long LLLLJI;
    public boolean LLLLL;
    public final C5H3 LLLLLIL;
    public final C5H3 LLLLLILLIL;
    public final C5H3 LLLLLJIL;
    public VEPreviewMusicParams LLLLLJLJLL;
    public final C5H3 LLLLLL;
    public final boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public final C5H3 LLLLLLL;
    public final C5H3 LLLLLLLLL;
    public String LLLLLLLLLL;
    public String LLLLLLLZIL;
    public float LLLLLLZ;
    public long LLLLLLZZ;
    public final MutableLiveData<C76800UCe> LLLLLZ;
    public final MutableLiveData<C76800UCe> LLLLLZIL;
    public final MutableLiveData<C76800UCe> LLLLLZL;
    public final MutableLiveData<C76800UCe> LLLLZ;
    public final MutableLiveData<C76800UCe> LLLLZI;
    public final MutableLiveData<Integer> LLLLZIL;
    public final LiveData<Integer> LLLLZLL;
    public final MutableLiveData<C76800UCe> LLLLZLLIL;
    public final MutableLiveData<C76800UCe> LLLLZLLLI;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.5ek] */
    static {
        TBT tbt = new TBT(C139875eJ.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C65352Pkq.LIZ.getClass();
        LLLZI = new InterfaceC74236TBo[]{tbt, new TBT(C139875eJ.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0), new TBT(C139875eJ.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new TBT(C139875eJ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new TBT(C139875eJ.class, "autoCutAsyncRenderService", "getAutoCutAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0)};
        LLLZ = new Object() { // from class: X.5ek
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.5eW] */
    private final void d0() {
        AbstractC43007GuJ LIZJ;
        QXX qxx;
        C162496Zh.LIZ = true;
        C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
        C43005GuH.LIZIZ(LLZZJLIL());
        if (C140015eX.LIZ() && (LIZJ = C43004GuG.LIZJ(LLZZJLIL())) != null && (qxx = C43004GuG.LIZIZ(LIZJ).LIZ) != null) {
            InterfaceC148965sy LJJIJIIJI = C60903NvH.LJIIJJI().LJJIJIIJI();
            if (C78541Us5.LIZJ()) {
                EnumC159096Mf enumC159096Mf = EnumC159096Mf.RECOMMEND_EFFECT;
                H1H h1h = new H1H(new OSZ(256, 256));
                C139965eS c139965eS = new C139965eS(C139955eR.LJLIL);
                final C139985eU c139985eU = C139985eU.LJLIL;
                LJJIJIIJI.LIZ(enumC159096Mf, qxx, h1h, c139965eS, new Object(c139985eU) { // from class: X.5eW
                    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZ;
                    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZIZ = null;
                    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZJ = null;
                    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZLLL = null;

                    {
                        this.LIZ = c139985eU;
                    }
                });
            }
        }
        if (!C41930Gcw.LJI()) {
            C43004GuG.LIZLLL(LLZZJLIL());
        }
    }

    private final void D() {
        if (((Boolean) C42537Gmj.LIZ.getValue()).booleanValue()) {
            VEUtils.setFrameCacheDiskDir(C62850Ola.LJ().LIZJ(EnumC43650HBe.VE_GET_IMAGES_CACHE, "", true).getAbsolutePath());
        }
    }

    private final boolean E() {
        float f = this.LLLLLLZ;
        if (f > 0.0f && f < 1.0f) {
            return true;
        }
        return false;
    }

    private final void F() {
        this.LLIZ.observe(this, new AObjectS84S0100000_2(this, 137));
    }

    private final void H() {
        this.LLILZIL.observe(this, new AObserverS70S0100000_2(this, 94));
    }

    private final Y50 LLLLLL() {
        return (Y50) this.LLLJIL.LIZ(this, LLLZI[4]);
    }

    private final CompileProbeViewModel LLLLLLIL() {
        return (CompileProbeViewModel) this.LLLIL.getValue();
    }

    private final InterfaceC142515iZ LLLLZI() {
        return (InterfaceC142515iZ) this.LLLILZJ.LIZ(this, LLLZI[3]);
    }

    private final InterfaceC140305f0 LLLLZLL() {
        return (InterfaceC140305f0) this.LLLII.getValue();
    }

    private final InterfaceC145815nt LLLZ() {
        return (InterfaceC145815nt) this.LLLILZ.getValue();
    }

    private final C142195i3 LLLZZ() {
        return (C142195i3) this.LLLLLLL.getValue();
    }

    private final C122114ql LLZ() {
        return (C122114ql) this.LLLLLL.getValue();
    }

    private final FTCEditInfoStickerViewModel LLZLL() {
        return (FTCEditInfoStickerViewModel) this.LLLIIII.getValue();
    }

    private final FTCEditStickerViewModel LLZLLIL() {
        return (FTCEditStickerViewModel) this.LLLIIIIL.getValue();
    }

    private final void Y() {
        XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZIZ.plus(new MB5())), null, null, new C140925g0(this, null), 3);
    }

    private final void e0() {
        HashMap<String, AVChallenge> stickerToChallenge;
        AVChallenge aVChallenge;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<EffectPointModel> effectList = LLZZJLIL().getEffectList();
        o.LJIIIIZZ(effectList, "mModel.effectList");
        arrayList2.addAll(effectList);
        arrayList2.addAll(C42000Ge4.LJIIIIZZ(LLZZJLIL()));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            EffectPointModel effectPointModel = (EffectPointModel) it.next();
            C137965bE g = g();
            if (g != null && (stickerToChallenge = g.LIZIZ().getStickerToChallenge()) != null && (aVChallenge = stickerToChallenge.get(effectPointModel.getChallenge())) != null) {
                if (!arrayList.contains(aVChallenge)) {
                    arrayList.add(aVChallenge);
                }
            } else {
                C137965bE g2 = g();
                if (g2 != null) {
                    String challenge = effectPointModel.getChallenge();
                    o.LJIIIIZZ(challenge, "model.challenge");
                    g2.LIZ(this, challenge);
                }
            }
        }
        C137965bE g3 = g();
        if (g3 != null) {
            g3.LIZIZ().setEditEffectStickerChallengeList(arrayList);
        }
    }

    private final C137965bE g() {
        return (C137965bE) this.LLLIILIL.LIZ(this, LLLZI[2]);
    }

    private final C139975eT m() {
        return (C139975eT) this.LLLLLLLLL.getValue();
    }

    @Override // X.InterfaceC142545ic
    public void L() {
        this.LLLLLZ.setValue(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x019d, code lost:
    
        if (r2 != null) goto L23;
     */
    @Override // X.C143265jm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LLJJIJI() {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139875eJ.LLJJIJI():int");
    }

    @Override // X.C143265jm
    public void LLLFFI() {
        InterfaceC153045zY LJJ;
        Bitmap LJJJJI;
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.step("av_video_edit", "begin prepare");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.LLLFFI();
        this.LLLLIL = SystemClock.elapsedRealtime() - elapsedRealtime;
        c44298Ha2.step("av_video_edit", "end prepare");
        if ((WS() instanceof C123954tj) && this.LLLFZ.singleImageCoverBitmapData != null) {
            C5MG WS = WS();
            if (WS != null && (LJJ = WS.LJJ()) != null) {
                SingleImageCoverBitmapData singleImageCoverBitmapData = this.LLLFZ.singleImageCoverBitmapData;
                if (singleImageCoverBitmapData == null || singleImageCoverBitmapData.getItemCoverWidth() <= 0 || (LJJJJI = C78966Uyw.LJJJJI(singleImageCoverBitmapData)) == null) {
                    return;
                }
                LJJ.LLLIIL(LJJJJI);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final VideoPublishEditModel LLZZJLIL() {
        return (VideoPublishEditModel) this.LLLLLILLIL.getValue();
    }

    public final AbstractC42651GoZ LLZZLLIL() {
        return (AbstractC42651GoZ) this.LLLIIIL.LIZ(this, LLLZI[0]);
    }

    @Override // X.InterfaceC142545ic
    public void NF() {
        this.LLLLZLLLI.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC142545ic
    public C126844yO Qt() {
        return (C126844yO) this.LLLILZLLLI.getValue();
    }

    @Override // X.InterfaceC142545ic
    public void R30() {
        this.LLLLLZIL.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC142545ic
    public void S60() {
        this.LLLLZ.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC142545ic
    public List<EffectPointModel> YA() {
        List<NLETrackSlot> LJIIJ;
        NLESegmentFilter LIZIZ;
        NLESegment LJI;
        ArrayList arrayList = new ArrayList();
        C126844yO Qt = Qt();
        if (Qt != null && (LJIIJ = Qt.LJIIJ()) != null) {
            for (NLETrackSlot nLETrackSlot : LJIIJ) {
                NLETrackSlot LJIIIIZZ = nLETrackSlot.LJIIIIZZ();
                if (LJIIIIZZ != null && (LJI = LJIIIIZZ.LJI()) != null) {
                    arrayList.add(LLLZLZ(nLETrackSlot, LJI));
                }
                NLEFilter nLEFilter = (NLEFilter) ORZ.LJLLLL(nLETrackSlot.LJ());
                if (nLEFilter != null && (LIZIZ = nLEFilter.LIZIZ()) != null) {
                    arrayList.add(LLLZLZ(nLETrackSlot, LIZIZ));
                }
                NLENode nLENode = (NLENode) ORZ.LJLLLL(nLETrackSlot.LJIIJ());
                if (nLENode != null) {
                    arrayList.add(LLLZLZ(nLETrackSlot, nLENode));
                }
            }
        }
        return arrayList;
    }

    public final C140325f2 c() {
        return (C140325f2) this.LLLLLIL.getValue();
    }

    public final InterfaceC88472Yns<Surface, C76800UCe> n() {
        return (InterfaceC88472Yns) this.LLLJ.getValue();
    }

    @Override // X.InterfaceC142545ic
    public void qs0() {
        this.LLLLZLLIL.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC142545ic
    public void tJ() {
        x70(this.LLLLLJLJLL);
    }

    public final VideoEditContainerScene u() {
        return (VideoEditContainerScene) this.LLLIIL.LIZ(this, LLLZI[1]);
    }

    public final IToolsVQEvaluationService v() {
        return (IToolsVQEvaluationService) this.LLLLLJIL.getValue();
    }

    @Override // X.InterfaceC142545ic
    public void w00() {
        this.LLLLZI.setValue(C76800UCe.LIZ);
    }

    private final String LLLLLZIL() {
        String filterFolder;
        FilterBean W40 = W40();
        if (W40 == null || (filterFolder = W40.getFilterFolder()) == null || ujb.o.LJJJJJL(filterFolder)) {
            return null;
        }
        return filterFolder;
    }

    private final InterfaceC140255ev LLLLZIL() {
        return ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).eh().LIZ();
    }

    private final InterfaceC147905rG LLLLZLLIL() {
        return ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).oi0().LIZ();
    }

    private final InterfaceC147865rC LLLZIIL() {
        return ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).JB().LIZ();
    }

    private final C5XM LLLZLL() {
        return LLLLZI().Rq0().LIZ();
    }

    private final void U() {
        C60903NvH.LJIIJJI().getPublishService().LIZIZ();
    }

    private final void V() {
        C44591Hel.LIZ().init();
    }

    private final void w() {
        Lo0().observe(this, new AObjectS84S0100000_2(this, 135));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r1 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139875eJ.z():void");
    }

    public final void B() {
        C122034qd LJJI;
        if (!LLZZJLIL().creativeModel.draftInfoModel.isDraft) {
            InterfaceC153045zY LJLIIL = LJLIIL();
            if (LJLIIL != null && (LJJI = C17N.LJJI(LJLIIL)) != null) {
                LJJI.LJIIJJI();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC142545ic
    public void Iq0() {
        String str;
        VideoPublishEditModel LLZZJLIL = LLZZJLIL();
        InterfaceC153045zY LJLIIL = LJLIIL();
        if (LJLIIL != null) {
            str = LJLIIL.LLJJL();
        } else {
            str = null;
        }
        LLZZJLIL.nleData = str;
    }

    public void J() {
        MutableLiveData<C140335f3> PM = PM();
        PM.observe(this, new AObjectS84S0100000_2(this, 138));
        PM.observe(this, new C135665Uc());
    }

    @Override // X.InterfaceC142545ic
    public boolean Jg0() {
        NLEModel LLIIIL;
        int i;
        List<NLETrackSlot> LJIIJ;
        VecNLETrackSPtr tracks;
        if (C45087Hml.LJIILJJIL() && LLZZJLIL().isCurrentAutoCutMode()) {
            InterfaceC153045zY value = Kh().getValue();
            if (value != null) {
                LLIIIL = C17N.LJJ(value);
            }
            LLIIIL = null;
        } else {
            InterfaceC153045zY value2 = Kh().getValue();
            if (value2 != null) {
                LLIIIL = value2.LLIIIL();
            }
            LLIIIL = null;
        }
        if (LLIIIL == null || (tracks = LLIIIL.getTracks()) == null || tracks.isEmpty()) {
            i = 0;
        } else {
            Iterator<NLETrack> it = tracks.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().LJII() == EnumC123864ta.EFFECT && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        C126844yO Qt = Qt();
        if (Qt != null && (LJIIJ = Qt.LJIIJ()) != null && (!LJIIJ.isEmpty())) {
            i++;
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C143265jm
    public C5MG LJJLIIIJJIZ() {
        final C5MG LIZ = C5K2.LIZ(LLZZJLIL().getVideoEditorType(), this.LJLJI.LJFF);
        LIZ.LJIL = new InterfaceC134025Nu() { // from class: X.5eh
            @Override // X.InterfaceC134025Nu
            public final void LIZ() {
                VQEvaluationConfig.ScreenShotConfig screenShotConfig;
                long currentTimeMillis = System.currentTimeMillis();
                if (e1.LIZ(31744, "io_async_editor", true, false)) {
                    final ARunnableS11S0100100_2 aRunnableS11S0100100_2 = new ARunnableS11S0100100_2(C139875eJ.this, currentTimeMillis, 2);
                    new PthreadThread(aRunnableS11S0100100_2) { // from class: X.5ei
                    }.start();
                } else {
                    C139875eJ.this.M(currentTimeMillis);
                }
                VQEvaluationConfig vQEvaluationConfig = C139875eJ.this.LLZZJLIL().creativeModel.initialModel.vqEvaluationConfig;
                if (vQEvaluationConfig != null && (screenShotConfig = vQEvaluationConfig.screenShotConfig) != null) {
                    C139875eJ c139875eJ = C139875eJ.this;
                    C5MG c5mg = LIZ;
                    IToolsVQEvaluationService v = c139875eJ.v();
                    if (v != null) {
                        String creationId = c139875eJ.LLZZJLIL().getCreationId();
                        o.LJIIIIZZ(creationId, "mModel.creationId");
                        v.LIZIZ(new AbstractC140025eY(creationId, c5mg.LJJ(), c139875eJ.getSurfaceView(), screenShotConfig) { // from class: X.5eg
                            public final InterfaceC153045zY LIZ;

                            {
                                o.LJIIIZ(surfaceView, "surfaceView");
                                this.LIZ = r3;
                            }
                        });
                    }
                }
            }
        };
        return LIZ;
    }

    public final void LLILZLL() {
        C142195i3 LLLZZ = LLLZZ();
        if (LLLZZ != null) {
            AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 439);
            if (!LLLZZ.LIZLLL.getBoolean("Edit_Filter_Data_2_Has_Migrated", false)) {
                final String currentPanel = C60903NvH.LJIIJJI().LJIILL().LIZ().get();
                o.LJIIIIZZ(currentPanel, "currentPanel");
                if (s.LJJJLZIJ(currentPanel, "composer", false)) {
                    currentPanel = LLLZZ.LIZJ.get(currentPanel);
                }
                new C139735e5(new InterfaceC139745e6() { // from class: X.5eN
                    @Override // X.InterfaceC139745e6
                    public final Object get() {
                        return C60903NvH.LJIIJJI().LJIILL().LIZIZ();
                    }
                }, new InterfaceC139745e6() { // from class: X.5eZ
                    @Override // X.InterfaceC139745e6
                    public final /* bridge */ /* synthetic */ Object get() {
                        return currentPanel;
                    }
                }).LIZ(new AqS45S1200000_2(LLLZZ, currentPanel, aqS152S0100000_2, 3), C140155el.LJLIL);
            }
        }
        Dm().observe(this, new AObjectS84S0100000_2(this, 136));
        if (C78685UuP.LJJJZ(LLZZJLIL().mSelectedFilterId) || C78685UuP.LJJJZ(LLZZJLIL().mSelectedFilterResId)) {
            Yj(H7R.LIZLLL(LLZZJLIL(), C60903NvH.LJIIJJI().LJIILL().LJI()));
        }
        LLZZJLIL().creativeModel.filterModel.isUseComposerFilterInEditPage = C140465fG.LIZ();
    }

    @Override // X.C143265jm
    public void LLJJL() {
        pJ().observe(this, new AObjectS84S0100000_2(this, 139));
        pJ().observe(this, new C135665Uc());
    }

    @Override // X.InterfaceC142545ic
    public VideoPublishEditModel LLLLIL() {
        return LLZZJLIL();
    }

    @Override // X.C143265jm
    public void LLLLJI() {
        EnumC135185Sg enumC135185Sg;
        C122034qd LJJI;
        InterfaceC126684y8 interfaceC126684y8;
        C5J1 V8;
        super.LLLLJI();
        C43045Guv.LIZLLL(new AqS152S0100000_2(this, 438), 0L);
        if (C41030G8k.LIZ()) {
            InterfaceC153045zY LJLIIL = LJLIIL();
            if (LJLIIL != null && (LJJI = C17N.LJJI(LJLIIL)) != null && (interfaceC126684y8 = LJJI.LJIIJJI) != null && (V8 = interfaceC126684y8.V8()) != null) {
                enumC135185Sg = V8.LJJIL();
            } else {
                enumC135185Sg = null;
            }
            if (enumC135185Sg != EnumC135185Sg.STARTED) {
                LLLLLJIL();
            }
        }
    }

    public final void LLLLLIL() {
        final C122034qd LJJI;
        final C5V0 c5v0;
        C5MG WS = WS();
        if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null && (c5v0 = this.LLLI) != null) {
            final VideoPublishEditModel mModel = LLZZJLIL();
            final VideoEditContainerScene u = u();
            if (u != null) {
                final ReplayLiveData<C5RT> filterEffectOpLiveData = pJ();
                final C126844yO Qt = Qt();
                final AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 425);
                o.LJIIIZ(mModel, "mModel");
                o.LJIIIZ(filterEffectOpLiveData, "filterEffectOpLiveData");
                if (c5v0.LIZ.isEditProp() && !C140395f9.LIZ) {
                    return;
                }
                LJJI.LJIIJ.addConsumer(new NLEEditorListener() { // from class: X.5V1
                    @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                    public final void onChanged() {
                        C5V0 c5v02 = C5V0.this;
                        if (c5v02.LIZLLL > 0 && c5v02.LJ) {
                            c5v02.LJ = false;
                            G8G.LIZ.LIZJ("tool_performance_record_edit_effect_reuse_apply", new AqS152S0100000_2(c5v02, 421));
                        }
                    }
                });
                c5v0.LIZ.getState().observe(u, new Observer() { // from class: X.5YP
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        EditEffectAnchorInfo editEffectAnchorInfo;
                        FetchEffectState fetchEffectState = (FetchEffectState) obj;
                        if (fetchEffectState instanceof FetchEffectState.ERROR) {
                            C5V0 c5v02 = C5V0.this;
                            String message = ((FetchEffectState.ERROR) fetchEffectState).getMessage();
                            AbstractC42651GoZ abstractC42651GoZ = u;
                            c5v02.getClass();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Error at FetchEffectState with message ");
                            LIZ.append(message);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EditingEffectException", X1D.LIZIZ(LIZ));
                            C42278GiY c42278GiY = c5v02.LIZJ;
                            if (c42278GiY != null) {
                                c42278GiY.dismiss();
                            }
                            Activity requireActivity = abstractC42651GoZ.requireActivity();
                            o.LJIIIIZZ(requireActivity, "lifecycleOwner.requireActivity()");
                            C5V0.LIZ(requireActivity);
                            return;
                        }
                        if (o.LJ(fetchEffectState, FetchEffectState.INIT.INSTANCE)) {
                            C5V0.this.getClass();
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EditingEffectException", "FetchEffectState is INIT which isn't expected");
                            return;
                        }
                        if (o.LJ(fetchEffectState, FetchEffectState.LOADING.INSTANCE)) {
                            C5V0 c5v03 = C5V0.this;
                            Activity requireActivity2 = u.requireActivity();
                            o.LJIIIIZZ(requireActivity2, "lifecycleOwner.requireActivity()");
                            if (c5v03.LIZJ == null) {
                                C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                                creativeLoadingDialogBuilder.backCanCancel(false);
                                creativeLoadingDialogBuilder.showProgress(false);
                                String string = requireActivity2.getString(R.string.flu);
                                o.LJIIIIZZ(string, "context.getString(R.stri…editing_effects_applying)");
                                creativeLoadingDialogBuilder.loadingMessage(string);
                                c5v03.LIZJ = (C42278GiY) c42279GiZ.createLoadingDialog(requireActivity2, 1117, creativeLoadingDialogBuilder);
                            }
                            C42278GiY c42278GiY2 = c5v03.LIZJ;
                            if (c42278GiY2 == null) {
                                return;
                            }
                            c42278GiY2.show();
                            return;
                        }
                        if (!(fetchEffectState instanceof FetchEffectState.SUCCESS)) {
                            return;
                        }
                        C5V0 c5v04 = C5V0.this;
                        Activity requireActivity3 = u.requireActivity();
                        o.LJIIIIZZ(requireActivity3, "lifecycleOwner.requireActivity()");
                        List<EditEffectAnchorInfo> data = ((FetchEffectState.SUCCESS) fetchEffectState).getData();
                        C126844yO c126844yO = Qt;
                        C122034qd c122034qd = LJJI;
                        VideoPublishEditModel videoPublishEditModel = mModel;
                        ReplayLiveData<C5RT> replayLiveData = filterEffectOpLiveData;
                        InterfaceC65784Pro<Boolean> interfaceC65784Pro = aqS152S0100000_2;
                        c5v04.getClass();
                        try {
                            C42278GiY c42278GiY3 = c5v04.LIZJ;
                            if (c42278GiY3 != null) {
                                c42278GiY3.dismiss();
                            }
                            ArrayList arrayList = new ArrayList();
                            for (EditEffectAnchorInfo editEffectAnchorInfo2 : data) {
                                EditEffectAnchorInfo editEffectAnchorInfo3 = editEffectAnchorInfo2;
                                if (editEffectAnchorInfo3.getEffectType() != EnumC133695Mn.EDIT_EFFECT_SERVER && editEffectAnchorInfo3.getEffectType() != EnumC133695Mn.EDIT_EFFECT_COMBINED && editEffectAnchorInfo3.getEffectType() != EnumC133695Mn.EDIT_EFFECT_CLIENT) {
                                    arrayList.add(editEffectAnchorInfo2);
                                }
                            }
                            Iterator<EditEffectAnchorInfo> it = data.iterator();
                            while (true) {
                                editEffectAnchorInfo = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                editEffectAnchorInfo = it.next();
                                EditEffectAnchorInfo editEffectAnchorInfo4 = editEffectAnchorInfo;
                                if (editEffectAnchorInfo4.getEffect() != null && (editEffectAnchorInfo4.getEffectType() == EnumC133695Mn.EDIT_EFFECT_SERVER || editEffectAnchorInfo4.getEffectType() == EnumC133695Mn.EDIT_EFFECT_COMBINED || editEffectAnchorInfo4.getEffectType() == EnumC133695Mn.EDIT_EFFECT_CLIENT)) {
                                    break;
                                }
                            }
                            EditEffectAnchorInfo editEffectAnchorInfo5 = editEffectAnchorInfo;
                            C133715Mp c133715Mp = new C133715Mp(c5v04, requireActivity3, arrayList, c122034qd, videoPublishEditModel, replayLiveData);
                            if (editEffectAnchorInfo5 != null) {
                                c5v04.LIZ.setServerRenderingCompleted(false);
                                EffectModel LIZ2 = C5SC.LIZ(0, new Effect(editEffectAnchorInfo5.getEffect()), "trick_effects");
                                LIZ2.index = -1;
                                LIZ2.selectFrom = videoPublishEditModel.mShootWay;
                                if (c126844yO != null) {
                                    c126844yO.LJIILJJIL(LIZ2, requireActivity3, c133715Mp, new AqS91S0300000_2(c5v04, interfaceC65784Pro, c133715Mp, 6));
                                }
                                if (C76800UCe.LIZ != null) {
                                    return;
                                }
                            }
                            c133715Mp.invoke("success");
                        } catch (Exception e) {
                            ALog.e("EditingEffectException", "Error during successful FetchEffectState with exception ", e);
                            C5V0.LIZ(requireActivity3);
                        }
                    }
                });
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LLLLLJIL() {
        VEEditorAutoStartStopArbiter value;
        if (u() != null) {
            C5LM c5lm = C5LF.LLIFFJFJJ;
            VideoEditContainerScene u = u();
            if (u != null) {
                VideoPublishEditModel LLZZJLIL = LLZZJLIL();
                c5lm.getClass();
                if (!C5LM.LIZ(u, LLZZJLIL) && (value = wz().getValue()) != null) {
                    value.LIZLLL();
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final InterfaceC140175en LLLLLJLJLL() {
        return ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).nk0().LIZ();
    }

    public final void Z() {
        CompileProbeResult.State state;
        CompileProbeResult.ResultStatus status;
        if (LLZZJLIL().getCompileProbeResult() != null) {
            CompileProbeResult compileProbeResult = LLZZJLIL().getCompileProbeResult();
            if (compileProbeResult != null && (status = compileProbeResult.getStatus()) != null) {
                state = status.getState();
            } else {
                state = null;
            }
            if (state != CompileProbeResult.State.CANCEL) {
                return;
            }
        }
        LLLLLLIL().gv0(LLZZJLIL()).LIZ(LLZZJLIL());
    }

    public View e() {
        return getSurfaceView();
    }

    public final void j0() {
        C122034qd LJJI;
        C122034qd LJJI2;
        C122034qd LJJI3;
        String[] audioPaths;
        C122034qd LJJI4;
        C122034qd LJJI5;
        C122034qd LJJI6;
        if (WS() instanceof C5K6) {
            return;
        }
        if ((WS() instanceof C123804tU) || (WS() instanceof C123814tV)) {
            InterfaceC153045zY LJLIIL = LJLIIL();
            if (LJLIIL != null && (LJJI = C17N.LJJI(LJLIIL)) != null) {
                C121914qR LJJIII = LJJI.LJFF().LJJIII();
                if (LJJIII != null) {
                    LJJIII.LJI = this.LLLFZ.getMusicVolume();
                    InterfaceC153045zY LJLIIL2 = LJLIIL();
                    if (LJLIIL2 != null && (LJJI2 = C17N.LJJI(LJLIIL2)) != null) {
                        LJJI2.LJFF().LJJJJJL(LJJIII);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (WS() instanceof C132555Id) {
            InterfaceC153045zY LJLIIL3 = LJLIIL();
            if (LJLIIL3 != null && (LJJI6 = C17N.LJJI(LJLIIL3)) != null) {
                LJJI6.LJFF().LIZJ(new C121744qA(this.LLLFZ.getVolume()));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            String[] audioPaths2 = this.LLLFZ.getAudioPaths();
            if (audioPaths2 != null && audioPaths2.length == 1) {
                InterfaceC153045zY LJLIIL4 = LJLIIL();
                if (LJLIIL4 != null && (LJJI5 = C17N.LJJI(LJLIIL4)) != null) {
                    LJJI5.LJFF().LIZJ(new C121744qA(this.LLLFZ.getVolume()));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (((WS() instanceof C5KW) || (WS() instanceof C55C)) && (audioPaths = this.LLLFZ.getAudioPaths()) != null && audioPaths.length > 1 && this.LLLFZ.getVolume() != WUK.LJIIZILJ) {
                InterfaceC153045zY LJLIIL5 = LJLIIL();
                if (LJLIIL5 != null && (LJJI4 = C17N.LJJI(LJLIIL5)) != null) {
                    LJJI4.LJFF().LIZJ(new C121744qA(this.LLLFZ.getVolume()));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        VEPreviewParams vEPreviewParams = this.LLLFZ;
        if ((vEPreviewParams.isFastImport || vEPreviewParams.isCutSameType) && !H7R.LJJLIIIJL(LLZZJLIL())) {
            InterfaceC153045zY LJLIIL6 = LJLIIL();
            if (LJLIIL6 != null && (LJJI3 = C17N.LJJI(LJLIIL6)) != null) {
                LJJI3.LJFF().LIZJ(new C121744qA(this.LLLFZ.getVolume()));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onCreate() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        Object obj;
        C139975eT m = m();
        CanvasVideoData canvasVideoData = LLZZJLIL().canvasVideoData;
        m.getClass();
        boolean z = false;
        if (canvasVideoData != null && C79004UzY.LJJJI(canvasVideoData)) {
            m.LIZIZ = true;
            Iy().addView(m.LIZ());
            if (canvasVideoData.getBackground().getStartColor() == canvasVideoData.getBackground().getEndColor()) {
                obj = new ColorDrawable(canvasVideoData.getBackground().getStartColor());
            } else {
                GradientDrawable LIZIZ = T28.LIZIZ(0);
                LIZIZ.setColors(new int[]{canvasVideoData.getBackground().getStartColor(), canvasVideoData.getBackground().getEndColor()});
                LIZIZ.setGradientType(0);
                LIZIZ.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                obj = LIZIZ;
            }
            N().observe(this, new AObserverS63S0300000_2(m, this, obj, 3));
        }
        D();
        super.onCreate();
        w();
        z();
        if (!e1.LIZ(31744, "studio_editor_init_filter_optimization", true, false)) {
            LLILZLL();
        }
        if (C133405Lk.LIZ) {
            e0();
        }
        J();
        H();
        F();
        VEEditorAutoStartStopArbiter LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            if ((((Number) C52768KnM.LIZ.getValue()).intValue() == 1 || !e1.LIZ(31744, "import_video_optimization", true, false)) && u() != null) {
                C5LM c5lm = C5LF.LLIFFJFJJ;
                VideoEditContainerScene u = u();
                if (u != null) {
                    VideoPublishEditModel LLZZJLIL = LLZZJLIL();
                    c5lm.getClass();
                    if (!C5LM.LIZ(u, LLZZJLIL)) {
                        z = true;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LJJLJ.LJLJLLL = z;
        }
        InterfaceC153045zY LJLIIL = LJLIIL();
        if (LJLIIL != null && (LJJI = C17N.LJJI(LJLIIL)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            nLEEditor.addConsumer(new NLEEditorListener() { // from class: X.5GT
                @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                public final void onChanged() {
                    C139875eJ c139875eJ = C139875eJ.this;
                    if (c139875eJ.LLLLLLZZ > 0) {
                        G8G.LIZ.LIZJ("tool_performance_record_edit_effect_apply", new AqS152S0100000_2(c139875eJ, 441));
                    }
                }
            });
        }
        C84363X9b.LIZ(getSurfaceView(), new AqS152S0100000_2(this, 442));
        if (C44384HbQ.LLJILLL(LLZZJLIL())) {
            UC0.LJJJZ(getSurfaceView(), C74275TDb.LIZ(12.0f));
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onDestroy() {
        InterfaceC153045zY LJLIIL;
        C122034qd LJJI;
        ((AbstractC45018Hle) LLLLLLIL().gv0(LLZZJLIL())).Y7();
        if (C19N.LJ("studio_unbind_surface_when_back_to_record", true) && (LJLIIL = LJLIIL()) != null && (LJJI = C17N.LJJI(LJLIIL)) != null) {
            LJJI.LJIIJJI.V8().LJJI();
        }
        super.onDestroy();
        IToolsVQEvaluationService v = v();
        if (v != null) {
            final String creationId = LLZZJLIL().getCreationId();
            o.LJIIIIZZ(creationId, "mModel.creationId");
            v.LIZIZ(new AbstractC140025eY(creationId) { // from class: X.5ef
            });
        }
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        for (String key : C139895eL.LIZJ.keySet()) {
            List<Long> list = C139895eL.LIZJ.get(key);
            if (list != null) {
                try {
                    double LJLIL = ORZ.LJLIL(list);
                    InterfaceC140135ej interfaceC140135ej = C139895eL.LIZ;
                    if (interfaceC140135ej != null) {
                        boolean z = !C139895eL.LIZIZ;
                        o.LJIIIIZZ(key, "key");
                        interfaceC140135ej.LIZ(LJLIL, key, z);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        C139895eL.LIZJ.clear();
        if (!C41030G8k.LIZ()) {
            C78540Us4.LIZLLL(new AqS152S0100000_2(this, 443));
        }
        IToolsVQEvaluationService v = v();
        if (v != null) {
            final String creationId = LLZZJLIL().getCreationId();
            o.LJIIIIZZ(creationId, "mModel.creationId");
            v.LIZIZ(new AbstractC140025eY(creationId) { // from class: X.5ed
            });
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onResume() {
        if (!C41030G8k.LIZ()) {
            C78540Us4.LIZLLL(new AqS152S0100000_2(this, 444));
        }
        this.LLLLJI = SystemClock.elapsedRealtime() - this.LLLLJ;
        super.onResume();
        this.LLLL = System.currentTimeMillis();
        IToolsVQEvaluationService v = v();
        if (v != null) {
            final String creationId = LLZZJLIL().getCreationId();
            o.LJIIIIZZ(creationId, "mModel.creationId");
            v.LIZIZ(new AbstractC140025eY(creationId) { // from class: X.5ee
            });
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onStart() {
        LiveEvent<C76800UCe> jq;
        InterfaceC153045zY LJLIIL;
        InterfaceC153045zY LJLIIL2;
        if (H7R.LJIIL(LLZZJLIL()) && (LJLIIL = LJLIIL()) != null) {
            VEEditor.VEState state = LJLIIL.getState();
            if (state == null) {
                state = VEEditor.VEState.ERROR;
            }
            if (state.getValue() < VEEditor.VEState.PREPARED.getValue()) {
                InterfaceC153045zY LJLIIL3 = LJLIIL();
                if (LJLIIL3 != null) {
                    LJLIIL3.initBingoAlgorithm();
                }
                if (!LLZZJLIL().editMusicSyncMode && (LJLIIL2 = LJLIIL()) != null) {
                    LJLIIL2.restoreAllVideoSound();
                }
            }
        }
        super.onStart();
        if (!this.LLLLL) {
            if (H7R.LJIIL(LLZZJLIL())) {
                LLLLLIL();
            } else {
                InterfaceC140255ev LLLLZIL = LLLLZIL();
                if (LLLLZIL != null && (jq = LLLLZIL.jq()) != null) {
                    jq.LIZLLL(this, new AObjectS84S0100000_2(this, UserLevelGeckoUpdateSetting.DEFAULT));
                }
            }
        }
        this.LLLLL = true;
        if (C41030G8k.LIZ()) {
            C78540Us4.LIZLLL(new AqS152S0100000_2(this, 422));
            VideoEditContainerScene u = u();
            if (u != null) {
                u.j1();
            }
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        if (C41030G8k.LIZ()) {
            VideoEditContainerScene u = u();
            if (u != null) {
                u.aa();
            }
            C78540Us4.LIZLLL(new AqS152S0100000_2(this, 423));
        }
    }

    @Override // X.InterfaceC142545ic
    public NLEModel r9() {
        C133765Mu c133765Mu;
        InterfaceC153045zY value = Kh().getValue();
        if (!(value instanceof C133765Mu) || (c133765Mu = (C133765Mu) value) == null) {
            return null;
        }
        return c133765Mu.LJFF();
    }

    public final void y() {
        String str;
        String str2 = LLZZJLIL().mSelectedFilterId;
        if ((str2 == null || str2.length() == 0) && ((str = LLZZJLIL().mSelectedFilterResId) == null || str.length() == 0)) {
            return;
        }
        FilterBean LIZLLL = H7R.LIZLLL(LLZZJLIL(), C60903NvH.LJIIJJI().LJIILL().LJI());
        int LIZLLL2 = TML.LIZLLL(LIZLLL, LLZZJLIL().mSelectedFilterIntensity, new InterfaceC122704ri() { // from class: X.4tz
            @Override // X.InterfaceC122704ri
            public final float LIZ(FilterBean filterBean) {
                o.LJIIIZ(filterBean, "filterBean");
                float LIZLLL3 = C44659Hfr.LIZLLL(filterBean);
                if (LIZLLL3 == 0.0f) {
                    C139875eJ c139875eJ = C139875eJ.this;
                    String filterFolder = filterBean.getFilterFolder();
                    o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
                    return c139875eJ.LJJLJLI(filterFolder);
                }
                return LIZLLL3;
            }
        });
        InterfaceC148845sm value = Nm().getValue();
        if (value != null) {
            value.LIZIZ(LIZLLL, LIZLLL2);
        }
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> BP() {
        return this.LLLLZLLLI;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> Kj0() {
        return this.LLLIZZ;
    }

    @Override // X.C143265jm
    public boolean LJJZZIII() {
        return this.LLLLLLJ;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> MM() {
        return this.LLLLLZL;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> N() {
        return this.LLLLLZ;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> OU() {
        return this.LLLLLZIL;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<Integer> Vm() {
        return this.LLLLZLL;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> cM() {
        return this.LLLLZLLIL;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> p20() {
        return this.LLLLZ;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> qv() {
        return this.LLLLZI;
    }

    public static final boolean A(C139875eJ c139875eJ) {
        if (!H7R.LJJLIIIJJIZ(c139875eJ.LLZZJLIL()) || c139875eJ.LLZZJLIL().isFromCrash() || c139875eJ.LLZZJLIL().mIsFromDraft) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R(C140415fB c140415fB) {
        float f;
        int i;
        InterfaceC153045zY value = Kh().getValue();
        if (!(value instanceof C133765Mu) || value == null) {
            return;
        }
        String LLLLLZIL = LLLLLZIL();
        FilterBean filterBean = c140415fB.LJLILLLLZI;
        if (filterBean == null) {
            return;
        }
        if (this.LJLJI.LIZ.invoke().booleanValue()) {
            C5MG WS = WS();
            if (WS != null) {
                f = TML.LIZJ(filterBean, WS.LJIIZILJ(), WS.LJIILL);
                if (f == -1.0f) {
                    f = 0.8f;
                }
            } else {
                f = 0.0f;
            }
        } else {
            f = 1.0f;
        }
        String str = this.LLLLLLLLLL;
        String str2 = this.LLLLLLLZIL;
        if (LLLLLZIL != null) {
            if (str != null) {
                if (str2 != null) {
                    if (!o.LJ(str, filterBean.getFilterFolder())) {
                        if (o.LJ(str2, filterBean.getFilterFolder())) {
                            LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{0.0f, 0.0f});
                            LLZ().LIZIZ(C47261Igj.LJJIJ(str));
                        } else {
                            LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{0.0f, 0.0f});
                            LLZ().LIZIZ(C47261Igj.LJJIJIIJI(str, str2));
                            C122114ql LLZ = LLZ();
                            String filterFolder = filterBean.getFilterFolder();
                            o.LJIIIIZZ(filterFolder, "chooseFilter.filterFolder");
                            List LJJIJ = C47261Igj.LJJIJ(new OSZ(C44659Hfr.LIZJ(filterBean), Float.valueOf(f)));
                            String resId = filterBean.getResId();
                            o.LJIIIIZZ(resId, "chooseFilter.resId");
                            LLZ.LIZ(filterFolder, resId, filterBean.getExtra(), LJJIJ);
                        }
                    } else {
                        LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{1.0f, 1.0f});
                        LLZ().LIZIZ(C47261Igj.LJJIJ(str2));
                    }
                    this.LLLLLLLLLL = null;
                    this.LLLLLLLZIL = null;
                } else {
                    if (!o.LJ(str, filterBean.getFilterFolder()) || this.LLLLLLZ != 1.0f) {
                        LLZ().LIZIZ(C47261Igj.LJJIJ(str));
                        C122114ql LLZ2 = LLZ();
                        String filterFolder2 = filterBean.getFilterFolder();
                        o.LJIIIIZZ(filterFolder2, "chooseFilter.filterFolder");
                        List LJJIJ2 = C47261Igj.LJJIJ(new OSZ(C44659Hfr.LIZJ(filterBean), Float.valueOf(f)));
                        String resId2 = filterBean.getResId();
                        o.LJIIIIZZ(resId2, "chooseFilter.resId");
                        LLZ2.LIZ(filterFolder2, resId2, filterBean.getExtra(), LJJIJ2);
                    }
                    this.LLLLLLLLLL = null;
                    this.LLLLLLLZIL = null;
                }
            } else {
                if (str2 != null) {
                    if (!o.LJ(str2, filterBean.getFilterFolder()) || this.LLLLLLZ != 0.0f) {
                        LLZ().LIZIZ(C47261Igj.LJJIJ(str2));
                        C122114ql LLZ22 = LLZ();
                        String filterFolder22 = filterBean.getFilterFolder();
                        o.LJIIIIZZ(filterFolder22, "chooseFilter.filterFolder");
                        List LJJIJ22 = C47261Igj.LJJIJ(new OSZ(C44659Hfr.LIZJ(filterBean), Float.valueOf(f)));
                        String resId22 = filterBean.getResId();
                        o.LJIIIIZZ(resId22, "chooseFilter.resId");
                        LLZ22.LIZ(filterFolder22, resId22, filterBean.getExtra(), LJJIJ22);
                    }
                } else if (o.LJ(filterBean.getFilterFolder(), LLLLLZIL)) {
                    C122114ql LLZ3 = LLZ();
                    String filterFolder3 = filterBean.getFilterFolder();
                    o.LJIIIIZZ(filterFolder3, "chooseFilter.filterFolder");
                    LLZ3.getClass();
                    C122034qd LJI = LLZ3.LIZ.LJI();
                    C121574pt LIZIZ = LJI.LJ().LIZIZ();
                    if (LIZIZ != null) {
                        LIZIZ.LIZJ(filterFolder3, "Filter_intensity", Float.valueOf(f));
                        LJI.LJ().LJJIIJZLJL(LIZIZ);
                    }
                } else {
                    C122114ql LLZ4 = LLZ();
                    List LJJIJ3 = C47261Igj.LJJIJ(LLLLLZIL);
                    List LJJIJ4 = C47261Igj.LJJIJ(C44659Hfr.LIZIZ(filterBean, f));
                    List LJJIJ5 = C47261Igj.LJJIJ(filterBean.getExtra());
                    List<OSZ> LJJIJ6 = C47261Igj.LJJIJ(new OSZ(filterBean.getFilterFolder(), filterBean.getResId()));
                    LLZ4.getClass();
                    C122034qd LJI2 = LLZ4.LIZ.LJI();
                    C121574pt LIZIZ2 = LJI2.LJ().LIZIZ();
                    if (LIZIZ2 != null) {
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        for (Object obj : LJJIJ3) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append((String) obj);
                                LIZ.append(":Filter_intensity:0");
                                ListProtector.add(arrayList, i2, X1D.LIZIZ(LIZ));
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            i = 6;
                            if (!it.hasNext()) {
                                break;
                            }
                            List LJLJJL = s.LJLJJL((String) it.next(), new String[]{":"}, 0, 6);
                            if (LJLJJL.size() >= 2) {
                                if (LIZIZ2.LIZLLL.get(ListProtector.get(LJLJJL, 0)) == null) {
                                    LIZIZ2.LIZLLL.put(ListProtector.get(LJLJJL, 0), new C121494pl());
                                }
                                C121494pl c121494pl = LIZIZ2.LIZLLL.get(ListProtector.get(LJLJJL, 0));
                                o.LJI(c121494pl);
                                c121494pl.LIZIZ.put(ListProtector.get(LJLJJL, 1), Float.valueOf(0.0f));
                                LIZIZ2.LIZ((String) ListProtector.get(LJLJJL, 0));
                            }
                        }
                        int i4 = 0;
                        for (Object obj2 : LJJIJ4) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                List LJLJJL2 = s.LJLJJL((String) obj2, new String[]{":"}, 0, i);
                                if (LJLJJL2.size() >= 2) {
                                    LIZIZ2.LIZJ((String) ListProtector.get(LJLJJL2, 0), (String) ListProtector.get(LJLJJL2, 1), Float.valueOf(CastFloatProtector.parseFloat((String) ListProtector.get(LJLJJL2, 2))));
                                    LIZIZ2.LIZIZ((String) ListProtector.get(LJLJJL2, 0), (String) ListProtector.get(LJJIJ5, i4));
                                }
                                i4 = i5;
                                i = 6;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        for (OSZ osz : LJJIJ6) {
                            LIZIZ2.LIZLLL((String) osz.getFirst(), (String) osz.getSecond());
                        }
                        LJI2.LJ().LJJIIJZLJL(LIZIZ2);
                    }
                }
                this.LLLLLLLLLL = null;
                this.LLLLLLLZIL = null;
            }
        } else {
            C122114ql LLZ5 = LLZ();
            String filterFolder4 = filterBean.getFilterFolder();
            o.LJIIIIZZ(filterFolder4, "chooseFilter.filterFolder");
            List LJJIJ7 = C47261Igj.LJJIJ(new OSZ(C44659Hfr.LIZJ(filterBean), Float.valueOf(f)));
            String resId3 = filterBean.getResId();
            o.LJIIIIZZ(resId3, "chooseFilter.resId");
            LLZ5.LIZ(filterFolder4, resId3, filterBean.getExtra(), LJJIJ7);
        }
        C5MG WS2 = WS();
        if (WS2 != null) {
            WS2.LJJIIZ = filterBean;
        }
        C5MG WS3 = WS();
        if (WS3 != null) {
            WS3.LJJIIZI = f;
        }
    }

    @Override // X.C143265jm
    public void LJJLIIIIJ(C140415fB c140415fB) {
        if (c140415fB == null) {
            return;
        }
        C139905eM c139905eM = C139905eM.LIZ;
        boolean LIZ = C140055eb.LIZ();
        c139905eM.getClass();
        C139905eM.LIZIZ = LIZ;
        FilterBean filterBean = c140415fB.LJLILLLLZI;
        if (filterBean != null && C44659Hfr.LJ(filterBean)) {
            R(c140415fB);
        } else {
            C5MG WS = WS();
            if (WS != null) {
                WS.LJIIJ(this.LJLJI.LIZ.invoke().booleanValue(), c140415fB.LJLILLLLZI);
            }
        }
        FilterBean filterBean2 = c140415fB.LJLILLLLZI;
        if (filterBean2 != null) {
            LLZZJLIL().mSelectedFilterResId = filterBean2.getResId();
            LLZZJLIL().mSelectedFilterId = String.valueOf(filterBean2.getId());
            LLZZJLIL().mSelectedFilterLabel = filterBean2.getEnName();
            return;
        }
        LLZZJLIL().mSelectedFilterResId = null;
    }

    @Override // X.C143265jm
    public InterfaceC148845sm LJJLIIIJJI(String tag) {
        o.LJIIIZ(tag, "tag");
        return WRY.LIZ(tag);
    }

    @Override // X.C143265jm
    public void LLLJL(boolean z) {
        this.LLLLLLJ = z;
    }

    public final void M(long j) {
        Bundle bundle;
        String str;
        List<String> auditFrames;
        List<String> sourceInfo;
        Object LJLLLL;
        C6FY c6fy;
        if (!LLZZJLIL().isPhotoMvMode || (c6fy = (C6FY) getDiContainer().LJIIIIZZ(null, C6FY.class)) == null || c6fy.LIZIZ == null) {
            if (this.LLLLIIIILLL > 0) {
                VideoEditContainerScene u = u();
                if (u != null) {
                    bundle = u.LLJILJILJ();
                } else {
                    bundle = new Bundle();
                }
                H5E.LIZ(bundle, LLZZJLIL(), this.LLLL, this.LLLLIIIILLL, j, new H5F(this.LLLLII, this.LLLLIILLL, this.LLLLILI, this.LLLLIL, this.LLLLJI));
            } else {
                this.LLLLIILL = true;
                this.LLLLIIL = j;
            }
        }
        C139975eT m = m();
        FrameLayout parent = Iy();
        m.getClass();
        o.LJIIIZ(parent, "parent");
        if (m.LIZIZ) {
            C6QQ.LIZ(new AqS149S0200000_2(m, parent, 34));
        }
        if (H7R.LJJJLL(LLZZJLIL())) {
            ArrayList arrayList = new ArrayList();
            CanvasVideoData canvasVideoData = LLZZJLIL().canvasVideoData;
            if (canvasVideoData != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && (LJLLLL = ORZ.LJLLLL(sourceInfo)) != null) {
                arrayList.add(LJLLLL);
            }
            CanvasVideoData canvasVideoData2 = LLZZJLIL().canvasVideoData;
            if (canvasVideoData2 != null && (auditFrames = canvasVideoData2.getAuditFrames()) != null && (!auditFrames.isEmpty())) {
                arrayList.addAll(auditFrames);
            }
            C65282hI.LJ(arrayList);
        }
        C43045Guv.LIZLLL(new AqS152S0100000_2(this, 424), 0L);
        C60903NvH.LJIIJJI().getPublishService().LJIL().LIZ();
        C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LJIILLIIL(new AqS152S0100000_2(this, 426));
        if (C6KD.LIZIZ(LLZZJLIL()) == null) {
            C60903NvH.LJIIJJI().getPublishService().LJIIJJI().LIZLLL();
        }
        Y();
        V();
        U();
        if (C6KD.LIZIZ(LLZZJLIL()) == null) {
            d0();
        }
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            InterfaceC43114Gw2 LIZJ = C60903NvH.LJIIJJI().LIZJ();
            List<Integer> LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(LLZZJLIL().videoWidth()), Integer.valueOf(LLZZJLIL().videoHeight()));
            EditVideoSegment editVideoSegment = (EditVideoSegment) ORZ.LJLLLL(LLZZJLIL().getPreviewInfo().getVideoList());
            if (editVideoSegment != null) {
                str = editVideoSegment.getVideoPath();
            } else {
                str = null;
            }
            LIZJ.LIZJ(LJJIJIIJI, str, LJ, null, null);
        }
        InterfaceC153045zY value = Kh().getValue();
        if (value != null && C6KD.LIZIZ(LLZZJLIL()) == null && !H7R.LJJJJI(LLZZJLIL())) {
            LLLZ().wj0(value);
        }
        MutableLiveData<Void> mutableLiveData = this.LLIZ;
        o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Unit>");
        mutableLiveData.postValue(null);
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public void N6(boolean z) {
        String str = this.LLLLLLLLLL;
        String str2 = this.LLLLLLLZIL;
        InterfaceC153045zY value = Kh().getValue();
        if (str != null && str2 != null && (value instanceof C133765Mu)) {
            new C122114ql((C133765Mu) value).LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{1.0f, 1.0f});
        }
        super.N6(z);
    }

    public final void P(float f) {
        LLLLZLL().ic(f, 300L);
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            LLZLL().c50(f, 300L);
            LLZLLIL().GN(f, 300L);
            return;
        }
        InterfaceC147905rG LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL != null) {
            LLLLZLLIL.c50(f, 300L);
        }
        InterfaceC147865rC LLLZIIL = LLLZIIL();
        if (LLLZIIL == null) {
            return;
        }
        LLLZIIL.GN(f, 300L);
    }

    @Override // X.InterfaceC142545ic
    public void Yj(FilterBean filter) {
        String resId;
        o.LJIIIZ(filter, "filter");
        boolean LIZ = C140465fG.LIZ();
        if (H7R.LJJLIIIJL(LLZZJLIL()) && ((resId = filter.getResId()) == null || resId.length() == 0)) {
            return;
        }
        if (!LLZZJLIL().creativeModel.filterModel.isUseComposerFilterInEditPage && LIZ) {
            InterfaceC153045zY value = Kh().getValue();
            o.LJII(value, "null cannot be cast to non-null type com.ss.android.ugc.asve.editor.ASNLEEditor");
            ((C133765Mu) value).LJI().LJI().LJJIJIL(null);
        }
        if (LLZZJLIL().creativeModel.filterModel.isUseComposerFilterInEditPage && !LIZ) {
            InterfaceC153045zY value2 = Kh().getValue();
            o.LJII(value2, "null cannot be cast to non-null type com.ss.android.ugc.asve.editor.ASNLEEditor");
            ((C133765Mu) value2).LJI().LJ().LJJIIJZLJL(null);
        }
        LLJLLIL(new C140415fB(true, filter, false, (String) null, 8));
    }

    @Override // X.InterfaceC142545ic
    public void pr0(String path) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLESegment nLESegment;
        NLEStyCanvas LJJI2;
        CanvasBackground background;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        o.LJIIIZ(path, "path");
        InterfaceC153045zY value = Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            NLEModel LJ = nLEEditor.LJ();
            NLEResourceNode nLEResourceNode = null;
            if (LJ != null && (mainTrack = LJ.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, mainTrack.LJIILL())) != null) {
                nLESegment = nLETrackSlot.LJI();
            } else {
                nLESegment = null;
            }
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
            if (LJJ != null && (LJJI2 = LJJ.LJJI()) != null) {
                long NLEStyCanvas_getImage = NLEEditorJniJNI.NLEStyCanvas_getImage(LJJI2.LIZ, LJJI2);
                if (NLEStyCanvas_getImage != 0) {
                    nLEResourceNode = new NLEResourceNode(NLEStyCanvas_getImage);
                }
                nLEResourceNode.LJIIIZ(path);
                g0.LJIIJJI(nLEEditor, false, false, 3);
                CanvasVideoData canvasVideoData = LLZZJLIL().canvasVideoData;
                if (canvasVideoData == null || (background = canvasVideoData.getBackground()) == null) {
                    return;
                }
                background.setFilePath(path);
            }
        }
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public boolean x70(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        boolean x70 = super.x70(params);
        C5XM LLLZLL = LLLZLL();
        if (LLLZLL != null) {
            LLLZLL.U70(C78685UuP.LJJJZ(params.mPath));
        }
        this.LLLLLZL.setValue(C76800UCe.LIZ);
        return x70;
    }

    private final EffectPointModel LLLZLZ(NLETrackSlot nLETrackSlot, NLENode nLENode) {
        int i;
        int i2;
        C122334r7 c122334r7 = new C122334r7();
        c122334r7.LIZIZ = nLETrackSlot.getStartTime();
        c122334r7.LIZJ = nLETrackSlot.getEndTime();
        c122334r7.LIZLLL = nLENode.getExtra("nleExtraEffectDirectory");
        c122334r7.LJFF = nLENode.getExtra("nleExtraEffectKey");
        c122334r7.LJII = nLENode.getExtra("original_effect_name");
        String extra = nLENode.getExtra("nleExtraEffectSelectedColor");
        o.LJIIIIZZ(extra, "nleNode.getExtra(EditorP…RA_EFFECT_SELECTED_COLOR)");
        Integer LJJIL = C38350F3i.LJJIL(extra);
        if (LJJIL != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        c122334r7.LJIIIIZZ = i;
        c122334r7.LJIIIZ = 1;
        c122334r7.LJIIJ = nLENode.getExtra("nleExtraEffectCategory");
        c122334r7.LJ = nLENode.getExtra("nleExtraEffectTag");
        c122334r7.LJIIJJI = 1;
        String extra2 = nLENode.getExtra("nleExtraIsEditPro");
        if (extra2 == null) {
            extra2 = "false";
        }
        c122334r7.LJIILLIIL = Boolean.parseBoolean(extra2);
        String extra3 = nLENode.getExtra("nle_extra_resource_id");
        o.LJIIIIZZ(extra3, "nleNode.getExtra(EditorP…nt.NLE_EXTRA_RESOURCE_ID)");
        c122334r7.LJIIL = extra3;
        String extra4 = nLENode.getExtra("nleExtraEffectIndex");
        o.LJIIIIZZ(extra4, "nleNode.getExtra(EditorP…t.NLE_EXTRA_EFFECT_INDEX)");
        Integer LJJIL2 = C38350F3i.LJJIL(extra4);
        if (LJJIL2 != null) {
            i2 = LJJIL2.intValue();
        } else {
            i2 = -1;
        }
        c122334r7.LJIILIIL = i2;
        String extra5 = nLENode.getExtra("nleExtraEffectSelectFrom");
        o.LJIIIIZZ(extra5, "nleNode.getExtra(EditorP…EXTRA_EFFECT_SELECT_FROM)");
        c122334r7.LJIILJJIL = extra5;
        String extra6 = nLENode.getExtra("nleExtraEffectChallenge");
        o.LJIIIIZZ(extra6, "nleNode.getExtra(EditorP…E_EXTRA_EFFECT_CHALLENGE)");
        c122334r7.LJIILL = extra6;
        return C5LQ.LIZ(c122334r7, false, (int) (c122334r7.LIZJ - c122334r7.LIZIZ));
    }

    @Override // X.InterfaceC142545ic
    public void h10(long j, long j2) {
        this.LLLLII = j;
        this.LLLLIILLL = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String h0(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139875eJ.h0(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public void tp(FilterBean filterBean, FilterBean filterBean2, float f) {
        final InterfaceC153045zY value;
        if (filterBean == null || filterBean2 == null || (value = Kh().getValue()) == null) {
            return;
        }
        if (this.LJLJI.LIZ.invoke().booleanValue()) {
            InterfaceC122704ri interfaceC122704ri = new InterfaceC122704ri() { // from class: X.4u0
                @Override // X.InterfaceC122704ri
                public final float LIZ(FilterBean filterBean3) {
                    o.LJIIIZ(filterBean3, "filterBean");
                    float LIZLLL = C44659Hfr.LIZLLL(filterBean3);
                    if (LIZLLL == 0.0f) {
                        InterfaceC153045zY interfaceC153045zY = InterfaceC153045zY.this;
                        String filterFolder = filterBean3.getFilterFolder();
                        o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
                        return interfaceC153045zY.LL(filterFolder);
                    }
                    return LIZLLL;
                }
            };
            InterfaceC148845sm value2 = Nm().getValue();
            if (value2 == null) {
                return;
            }
            T(value, filterBean, filterBean2, f, TML.LIZJ(filterBean, value2, interfaceC122704ri), TML.LIZJ(filterBean2, value2, interfaceC122704ri));
            return;
        }
        T(value, filterBean, filterBean2, f, 0.0f, 0.0f);
    }

    @Override // X.InterfaceC142545ic
    public void uJ(float f, float f2, float f3) {
        InterfaceC147865rC LLLZIIL = LLLZIIL();
        if (LLLZIIL != null) {
            LLLZIIL.dt(f, f2, f3);
            LLLZIIL.wl(f, f2, f3);
            LLLZIIL.M20(f, f2, f3);
            LLLZIIL.WM(f, f2, f3);
            LLLZIIL.XF(f, f2, f3);
            LLLZIIL.dE(f, f2, f3);
            LLLZIIL.Y00(f, f2, f3);
        }
        LLLLZLL().hM(f, f2, f3);
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            LLZLL().j30(f, f2, f3);
            LLZLLIL().wl(f, f2, f3);
            return;
        }
        InterfaceC147905rG LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL != null) {
            LLLLZLLIL.j30(f, f2, f3);
        }
        InterfaceC147865rC LLLZIIL2 = LLLZIIL();
        if (LLLZIIL2 == null) {
            return;
        }
        LLLZIIL2.wl(f, f2, f3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C139875eJ(C82622Wbi diContainer, VEPreviewParams params, C5V0 c5v0, InterfaceC88472Yns<? super C140815fp, C76800UCe> interfaceC88472Yns) {
        super(diContainer, params, interfaceC88472Yns, null, 8, 0 == true ? 1 : 0);
        boolean z;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(params, "params");
        this.LLLFZ = params;
        this.LLLI = c5v0;
        this.LLLII = C221108m2.LIZIZ(new AqS152S0100000_2(diContainer, 429));
        this.LLLIIII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 436));
        this.LLLIIIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 437));
        this.LLLIIIL = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LLLIIL = UCI.LJII(getDiContainer(), VideoEditContainerScene.class, null);
        this.LLLIILIL = UCI.LJII(getDiContainer(), C137965bE.class, null);
        this.LLLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 427));
        this.LLLILZ = C269113v.LIZ(this, InterfaceC145815nt.class);
        this.LLLILZJ = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LLLILZLLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 431));
        this.LLLIZZ = new MutableLiveData<>();
        this.LLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 432));
        this.LLLJIL = UCI.LJII(getDiContainer(), Y50.class, null);
        this.LLLLLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 428));
        this.LLLLLILLIL = C221108m2.LIZIZ(new AqS152S0100000_2(diContainer, 440));
        this.LLLLLJIL = C221108m2.LIZIZ(C139945eQ.LJLIL);
        this.LLLLLJLJLL = new VEPreviewMusicParams();
        this.LLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 435));
        if (LLZZJLIL().getVideoEditorType() == 6) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLLLIL = z;
        this.LLLLLLJ = true;
        this.LLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 433));
        this.LLLLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 430));
        this.LLLLLZ = new MutableLiveData<>();
        this.LLLLLZIL = new MutableLiveData<>();
        this.LLLLLZL = new MutableLiveData<>();
        this.LLLLZ = new MutableLiveData<>();
        this.LLLLZI = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLLLZIL = mutableLiveData;
        this.LLLLZLL = mutableLiveData;
        this.LLLLZLLIL = new MutableLiveData<>();
        this.LLLLZLLLI = new MutableLiveData<>();
    }

    public final void O(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = LJJLL().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = i2;
        layoutParams2.width = i3;
        layoutParams2.height = i4;
        LJJLL().setLayoutParams(layoutParams2);
    }

    private final void S(FilterBean filterBean, FilterBean filterBean2, float f, float f2, float f3) {
        float f4;
        if (o.LJ(filterBean.getFilterFolder(), filterBean2.getFilterFolder())) {
            return;
        }
        if (f < 0.0f) {
            f4 = Math.abs(f);
        } else {
            f4 = 1 - f;
        }
        if (Math.abs(f) <= 0.05f) {
            if (f <= 0.0f) {
                f4 = 0.0f;
            } else {
                f4 = 1.0f;
            }
        }
        if (this.LLLLLLZ == f4) {
            return;
        }
        String str = this.LLLLLLLLLL;
        String str2 = this.LLLLLLLZIL;
        if (str == null && str2 == null) {
            if (o.LJ(LLLLLZIL(), filterBean.getFilterFolder())) {
                str = LLLLLZIL();
            } else if (o.LJ(LLLLLZIL(), filterBean2.getFilterFolder())) {
                str2 = LLLLLZIL();
            }
        }
        String str3 = null;
        if (!o.LJ(str, filterBean.getFilterFolder()) && str != null) {
            if (E() && str2 != null) {
                LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{0.0f, 0.0f});
                this.LLLLLLZ = 0.0f;
            }
            LLZ().LIZIZ(C47261Igj.LJJIJ(str));
            str = null;
        }
        if (!o.LJ(str2, filterBean2.getFilterFolder()) && str2 != null) {
            if (E() && str != null) {
                LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{1.0f, 1.0f});
                this.LLLLLLZ = 1.0f;
            }
            LLZ().LIZIZ(C47261Igj.LJJIJ(str2));
            str2 = null;
        }
        if (str == null) {
            C122114ql LLZ = LLZ();
            String filterFolder = filterBean.getFilterFolder();
            o.LJIIIIZZ(filterFolder, "leftFilter.filterFolder");
            List LJJIJ = C47261Igj.LJJIJ(new OSZ("Filter_intensity", Float.valueOf(f2)));
            String resId = filterBean.getResId();
            o.LJIIIIZZ(resId, "leftFilter.resId");
            LLZ.LIZ(filterFolder, resId, null, LJJIJ);
            str = filterBean.getFilterFolder();
        }
        if (str2 == null) {
            C122114ql LLZ2 = LLZ();
            String filterFolder2 = filterBean2.getFilterFolder();
            o.LJIIIIZZ(filterFolder2, "rightFilter.filterFolder");
            List LJJIJ2 = C47261Igj.LJJIJ(new OSZ("Filter_intensity", Float.valueOf(f3)));
            String resId2 = filterBean2.getResId();
            o.LJIIIIZZ(resId2, "rightFilter.resId");
            LLZ2.LIZ(filterFolder2, resId2, null, LJJIJ2);
            str2 = filterBean2.getFilterFolder();
        }
        if (str != null && str2 != null) {
            LLZ().LIZJ(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{f4, f4});
        }
        if (f4 == 0.0f) {
            if (str != null) {
                LLZ().LIZIZ(C47261Igj.LJJIJ(str));
                str = null;
            }
            C5MG WS = WS();
            if (WS != null) {
                WS.LJJIIZ = filterBean2;
            }
        }
        if (f4 == 1.0f) {
            if (str2 != null) {
                LLZ().LIZIZ(C47261Igj.LJJIJ(str2));
            } else {
                str3 = str2;
            }
            C5MG WS2 = WS();
            if (WS2 != null) {
                WS2.LJJIIZ = filterBean;
            }
            str2 = str3;
        }
        this.LLLLLLLLLL = str;
        this.LLLLLLLZIL = str2;
        this.LLLLLLZ = f4;
    }

    public /* synthetic */ C139875eJ(C82622Wbi c82622Wbi, VEPreviewParams vEPreviewParams, C5V0 c5v0, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, vEPreviewParams, (i & 4) != 0 ? null : c5v0, (i & 8) != 0 ? null : interfaceC88472Yns);
    }

    private final void T(InterfaceC153045zY interfaceC153045zY, FilterBean filterBean, FilterBean filterBean2, float f, float f2, float f3) {
        float f4;
        C122034qd LJJI;
        C122034qd LJJI2;
        if (filterBean == null || filterBean2 == null) {
            return;
        }
        boolean LJ = C44659Hfr.LJ(filterBean);
        boolean LJ2 = C44659Hfr.LJ(filterBean2);
        C122034qd LJJI3 = C17N.LJJI(interfaceC153045zY);
        if (LJJI3 != null) {
            if (LJ && LJ2) {
                if (LJJI3.LJI().LIZIZ() != null) {
                    LJJI3.LJI().LJJIJIL(null);
                }
                S(filterBean, filterBean2, f, f2, f3);
                return;
            }
            if (LJJI3.LJ().LIZIZ() != null) {
                LJJI3.LJ().LJJIIJZLJL(null);
            }
            if (f < 0.0f) {
                f4 = Math.abs(f);
            } else {
                f4 = 1 - f;
            }
            if (f2 == 0.0f || f3 == 0.0f) {
                C121584pu c121584pu = new C121584pu(EnumC121554pr.COLOR_NO_COMPOSER);
                c121584pu.LIZIZ = f2;
                c121584pu.LJ = f3;
                c121584pu.LIZ = filterBean.getFilterFolder();
                c121584pu.LIZLLL = filterBean2.getFilterFolder();
                c121584pu.LJFF = f4;
                c121584pu.LJI = filterBean.getResId();
                InterfaceC153045zY LJLIIL = LJLIIL();
                if (LJLIIL != null && (LJJI2 = C17N.LJJI(LJLIIL)) != null) {
                    LJJI2.LJI().LJJIJIL(c121584pu);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C121584pu c121584pu2 = new C121584pu(EnumC121554pr.COLOR_NO_COMPOSER);
            c121584pu2.LIZ = filterBean.getFilterFolder();
            c121584pu2.LIZLLL = filterBean2.getFilterFolder();
            c121584pu2.LJFF = f4;
            c121584pu2.LIZJ = true;
            c121584pu2.LIZIZ = f2;
            c121584pu2.LJI = filterBean.getResId();
            c121584pu2.LJ = f3;
            InterfaceC153045zY LJLIIL2 = LJLIIL();
            if (LJLIIL2 != null && (LJJI = C17N.LJJI(LJLIIL2)) != null) {
                LJJI.LJI().LJJIJIL(c121584pu2);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
