package X;

import Y.ACallableS2S1112000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.AfS59S0100000_7;
import Y.AgS0S1112000_2;
import Y.AgS21S0100100_2;
import Y.AgS24S0210000_2;
import Y.IDComparatorS30S0000000_2;
import Y.IDeS154S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationEventManager;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationListener;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS13S0202000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS22S0310000_2;
import kotlin.jvm.internal.AqS35S0210000_2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;
import v5.n;

/* renamed from: X.5qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147295qH extends C6F2 implements InterfaceC145445nI, InterfaceC137115Zr, InterfaceC135635Tz {
    public static final C127004ye LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJLL;
    public final C82622Wbi LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public InterfaceC153275zv LJLJJLL;
    public InterfaceC153185zm LJLJL;
    public InterfaceC145605nY LJLJLJ;
    public InterfaceC146665pG LJLJLLL;
    public InterfaceC145875nz LJLL;
    public InterfaceC145485nM LJLLI;
    public InterfaceC146675pH LJLLILLLL;
    public VideoPublishEditModel LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public InterfaceC145325n6 LJLLLLLL;
    public InterfaceC146235oZ LJLZ;
    public InterfaceC147145q2 LJZ;
    public InterfaceC147865rC LJZI;
    public final C82632Wbs LJZL;
    public InterfaceC140305f0 LL;
    public InterfaceC142725iu LLD;
    public InterfaceC145455nJ LLF;
    public C5XM LLFF;
    public InterfaceC143855kj LLFFF;
    public InterfaceC147645qq LLFII;
    public InterfaceC143845ki LLFZ;
    public InterfaceC146755pP LLI;
    public C6E7 LLIFFJFJJ;
    public InterfaceC147635qp LLII;
    public InterfaceC143385jy LLIIII;
    public InterfaceC149715uB LLIIIILZ;
    public InterfaceC145405nE LLIIIJ;
    public InterfaceC147345qM LLIIIL;
    public C163096af LLIIIZ;
    public C42210GhS LLIIJI;
    public InterfaceC148865so LLIIJLIL;
    public InterfaceC147455qX LLIIL;
    public InterfaceC136115Vv LLIILII;
    public C5LG LLIILZL;
    public InterfaceC162426Za LLIIZ;
    public C6FS LLIL;
    public InterfaceC150685vk LLILII;
    public final C82632Wbs LLILIL;
    public final C82632Wbs LLILL;
    public InterfaceC159276Mx LLILLIZIL;
    public InterfaceC65784Pro<C76800UCe> LLILLJJLI;
    public InterfaceC147475qZ LLILLL;
    public C6VC LLILZ;
    public C137965bE LLILZIL;
    public InterfaceC147355qN LLILZLL;
    public ProgressDialogC43239Gy3 LLIZ;
    public C42278GiY LLIZLLLIL;
    public View LLJ;
    public C146695pJ LLJI;
    public C5L0 LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C73318Sq2 LLJJIJIIJIL;
    public final C62822Ol8 LLJJIJIL;
    public final C62822Ol8 LLJJJ;
    public final C62822Ol8 LLJJJIL;
    public C5K1 LLJJJJ;
    public final C147265qE LLJJJJJIL;
    public final C147325qK LLJJJJLIIL;
    public NLEVEOperationEventManager LLJJL;
    public C5OK LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C62822Ol8 LLJLIL;

    static {
        TBT tbt = new TBT(C147295qH.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLJLL = new InterfaceC74236TBo[]{tbt, new TBT(C147295qH.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new TBT(C147295qH.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new TBT(C147295qH.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0)};
        LLJLILLLLZIIL = new C127004ye();
    }

    @Override // X.InterfaceC145445nI
    public final void LJLJLJ() {
        LLLFF(true, true);
    }

    @Override // X.C6F2
    public final void LLJJJIL() {
        this.LLJILLL = true;
    }

    @Override // X.InterfaceC145445nI
    public final void LJJJZ() {
        if (this.mActivity != null) {
            LLLF(false);
        }
    }

    @Override // X.InterfaceC137115Zr
    public final InterfaceC147355qN LJLLL() {
        InterfaceC147355qN interfaceC147355qN = this.LLILZLL;
        if (interfaceC147355qN != null) {
            return interfaceC147355qN;
        }
        o.LJIJI("mVideoSizeProvider");
        throw null;
    }

    @Override // X.C6F2
    public final void LLJILJIL() {
        InterfaceC153185zm interfaceC153185zm = this.LJLJL;
        if (interfaceC153185zm != null) {
            interfaceC153185zm.LJLIIIL();
        }
    }

    @Override // X.C6F2
    public final C82622Wbi LLJJI() {
        if (this.LLJILJIL) {
            return C44384HbQ.LJJJ(this).LJLLL;
        }
        return null;
    }

    @Override // X.C6F2
    public final void LLJJJ() {
        ExecutorC149205tM executorC149205tM = ExecutorC149205tM.LJLILLLLZI;
        ARunnableS38S0100000_2 aRunnableS38S0100000_2 = new ARunnableS38S0100000_2(this, 91);
        Handler handler = executorC149205tM.LJLIL;
        handler.sendMessageAtFrontOfQueue(Message.obtain(handler, aRunnableS38S0100000_2));
    }

    @Override // X.C6F2
    public final void LLJJJJ() {
        InterfaceC146755pP interfaceC146755pP = this.LLI;
        if (interfaceC146755pP != null) {
            interfaceC146755pP.TY();
        }
    }

    @Override // X.C6F2
    public final boolean LLJLL() {
        if (findSceneByTag("EditStickerScene") != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6F2
    public final void LLJLLIL() {
        C6EJ c6ej;
        C6EF c6ef = (C6EF) this.LLJLIL.getValue();
        c6ef.getClass();
        H7B.LIZ("audioCopyrightDetectInEdit -> back from publish page: updateDetectResultFromModel");
        HashMap<Integer, PreCheckResultModel> detectResults = c6ef.LJ().creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults != null) {
            for (Map.Entry<Integer, PreCheckResultModel> entry : detectResults.entrySet()) {
                int intValue = entry.getKey().intValue();
                PreCheckResultModel value = entry.getValue();
                Iterator<C6EJ> it = c6ef.LIZLLL().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c6ej = it.next();
                        if (c6ej.LIZ() == intValue) {
                            break;
                        }
                    } else {
                        c6ej = null;
                        break;
                    }
                }
                C6EJ c6ej2 = c6ej;
                if (c6ej2 != null && value != null && value.hasShowResult) {
                    c6ej2.LIZ = null;
                }
            }
        }
    }

    public final void LLLFZ() {
        InterfaceC153045zY value;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (!C44384HbQ.LJJIJIIJIL(videoPublishEditModel)) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    if (!C44384HbQ.LLIIIILZ(videoPublishEditModel2)) {
                        InterfaceC145485nM interfaceC145485nM = this.LJLLI;
                        if (interfaceC145485nM != null) {
                            interfaceC145485nM.show();
                            LLLILZLLLI().U2(false, false, false);
                            LLLILZLLLI().Ov(false);
                            C1536161d.LIZ("effect");
                            InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
                            if (interfaceC153275zv != null) {
                                boolean wu = interfaceC153275zv.wu();
                                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                                if (videoPublishEditModel3 != null) {
                                    H8F.LJJI(videoPublishEditModel3, wu, false);
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                            InterfaceC153275zv interfaceC153275zv2 = this.LJLJJLL;
                            if (interfaceC153275zv2 != null) {
                                interfaceC153275zv2.r3();
                            }
                            if (C148705sY.LIZ()) {
                                VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                                if (videoPublishEditModel4 != null) {
                                    if (videoPublishEditModel4.videoFps(true) < 30 && (value = LLLILZLLLI().Kh().getValue()) != null) {
                                        value.LLJJ();
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            return;
                        }
                        o.LJIJI("editEffectApi");
                        throw null;
                    }
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            C132385Hm.LJIIIIZZ = true;
            LLLFFI(this, true, 4);
            InterfaceC153275zv interfaceC153275zv3 = this.LJLJJLL;
            if (interfaceC153275zv3 != null) {
                boolean wu2 = interfaceC153275zv3.wu();
                VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                if (videoPublishEditModel5 != null) {
                    H8F.LJJI(videoPublishEditModel5, wu2, true);
                    return;
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLI() {
        InterfaceC153045zY value;
        InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
        if (interfaceC153275zv != null) {
            interfaceC153275zv.b2(4, false);
        }
        LLLILZLLLI().U2(false, false, false);
        C1536161d.LIZ("sticker");
        if (C148705sY.LIZ()) {
            VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
            if (videoPublishEditModel != null) {
                if (videoPublishEditModel.videoFps(true) < 30 && (value = LLLILZLLLI().Kh().getValue()) != null) {
                    value.LLJJ();
                    return;
                }
                return;
            }
            o.LJIJI("mModel");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x004b, code lost:
    
        if (r0.hasMusic() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.creativeModel.inlineCaptionModel == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x008a, code lost:
    
        if (r0.getRecordVolume() <= 0.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x009e, code lost:
    
        if (r0.musicVolume <= 0.0f) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLII() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147295qH.LLLII():void");
    }

    public final InterfaceC142545ic LLLILZLLLI() {
        return (InterfaceC142545ic) this.LJZL.LIZ(this, LLJLL[1]);
    }

    public final InterfaceC147905rG LLLJIL() {
        return ((InterfaceC142515iZ) this.LJLJI.LIZ(this, LLJLL[0])).oi0().LIZ();
    }

    public final AbstractC42651GoZ LLLJL() {
        return (AbstractC42651GoZ) this.LLILL.LIZ(this, LLJLL[3]);
    }

    @Override // X.C6F2
    /* renamed from: LLLL, reason: merged with bridge method [inline-methods] */
    public final C63C LLJJIII() {
        return (C63C) this.LJLJJL.getValue();
    }

    public final void LLLLJ() {
        C122034qd LLLJ;
        InterfaceC126684y8 interfaceC126684y8;
        C5J1 V8;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (C44384HbQ.LJJIIZI(videoPublishEditModel) && (LLLJ = LLLJ()) != null && (interfaceC126684y8 = LLLJ.LJIIJJI) != null && (V8 = interfaceC126684y8.V8()) != null) {
                LLLLILI(((int) V8.getDuration()) / 1000, true);
                return;
            }
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLLLIL() {
        InterfaceC145875nz interfaceC145875nz = this.LJLL;
        if (interfaceC145875nz != null) {
            interfaceC145875nz.LLD();
        }
        LLLILZLLLI().U2(false, false, false);
        C1536161d.LIZ("voice");
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            H8F.LJIJJ(videoPublishEditModel);
        } else {
            o.LJIJI("mModel");
            throw null;
        }
    }

    public final void LLLLLILLIL() {
        InterfaceC147865rC interfaceC147865rC = this.LJZI;
        if (interfaceC147865rC != null) {
            MutableLiveData<Boolean> fm0 = interfaceC147865rC.fm0();
            Boolean bool = Boolean.TRUE;
            fm0.setValue(bool);
            InterfaceC147865rC interfaceC147865rC2 = this.LJZI;
            if (interfaceC147865rC2 != null) {
                interfaceC147865rC2.N4().setValue(bool);
                InterfaceC147865rC interfaceC147865rC3 = this.LJZI;
                if (interfaceC147865rC3 != null) {
                    interfaceC147865rC3.LJLL();
                    InterfaceC143855kj interfaceC143855kj = this.LLFFF;
                    if (interfaceC143855kj != null) {
                        interfaceC143855kj.show();
                    }
                    InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
                    if (interfaceC153275zv != null) {
                        interfaceC153275zv.r3();
                    }
                    VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
                    if (videoPublishEditModel != null) {
                        if (!C44384HbQ.LLJILJIL(videoPublishEditModel)) {
                            return;
                        }
                        C63D c63d = LLJJIII().LLJI;
                        if (c63d != null) {
                            c63d.Nu0(true);
                        }
                        InterfaceC147865rC interfaceC147865rC4 = this.LJZI;
                        if (interfaceC147865rC4 != null) {
                            interfaceC147865rC4.Nn(false);
                            return;
                        } else {
                            o.LJIJI("editStickerApi");
                            throw null;
                        }
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("editStickerApi");
                throw null;
            }
            o.LJIJI("editStickerApi");
            throw null;
        }
        o.LJIJI("editStickerApi");
        throw null;
    }

    public final InterfaceC153045zY LLLIZZ() {
        return LLLILZLLLI().Kh().getValue();
    }

    public final C122034qd LLLJ() {
        InterfaceC153045zY LLLIZZ = LLLIZZ();
        if (LLLIZZ instanceof C133765Mu) {
            return ((C133765Mu) LLLIZZ).LJI();
        }
        return null;
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        this.LLJILJIL = false;
        InterfaceC143855kj interfaceC143855kj = this.LLFFF;
        if (interfaceC143855kj != null) {
            interfaceC143855kj.LE();
        }
        C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
        if (!C149125tE.LIZIZ) {
            C41930Gcw.LIZJ();
        }
        C5OL.LIZLLL(null);
        this.LLJJIJIIJIL.dispose();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C5O6.LIZ = 0;
        C5O6.LIZIZ = 0;
        C60903NvH.LJIIJJI().LJJIJIIJI().destroy();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        HTP.LJLJL.LIZ();
        NLEVEOperationEventManager nLEVEOperationEventManager = this.LLJJL;
        if (nLEVEOperationEventManager != null) {
            NLEMediaPublicJniJNI.NLEVEOperationEventManager_clearVEOperationListener(nLEVEOperationEventManager.LIZ, nLEVEOperationEventManager);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.bytedance.ies.nle.editor_jni.NLEVEOperationListener, X.5OK] */
    @Override // X.WM7
    public final void onResume() {
        C122034qd LLLJ;
        super.onResume();
        H78.LIZ("VEVideoPublishEditActivity onResume EditRootScene");
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        C6FS c6fs = this.LLIL;
        NLEVEOperationEventManager nLEVEOperationEventManager = null;
        if (c6fs != null) {
            c6fs.uR(false);
            HTP.LJLJL.LIZJ(this.mActivity, (ViewGroup) this.mView);
            VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
            if (videoPublishEditModel != null) {
                if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        if (!videoPublishEditModel2.mIsFromDraft && !videoPublishEditModel2.isFromCrash() && this.LLJJIJI && (!G9P.LIZLLL() || !G9D.LJFF())) {
                            LLLILZLLLI().U2(false, false, false);
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                InterfaceC145485nM interfaceC145485nM = this.LJLLI;
                if (interfaceC145485nM != null) {
                    interfaceC145485nM.bg0();
                    VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                    if (videoPublishEditModel3 != null) {
                        if (videoPublishEditModel3.isDraftMusicIllegal()) {
                            VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                            if (videoPublishEditModel4 != null) {
                                if (!((Keva) C43814HHm.LIZ.getValue()).getBoolean(videoPublishEditModel4.getCreationId(), true)) {
                                    InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
                                    if (interfaceC153275zv != null) {
                                        interfaceC153275zv.A7(1);
                                    }
                                    VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                                    if (videoPublishEditModel5 != null) {
                                        C45804HyK.LJJJJJ(videoPublishEditModel5, true);
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        }
                        VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                        if (videoPublishEditModel6 != null) {
                            if (C44384HbQ.LJJIIZI(videoPublishEditModel6) && (LLLJ = LLLJ()) != null) {
                                NLEModel LJ = LLLJ.LJIIJ.LJ();
                                o.LJIIIIZZ(LJ, "it.editor.model");
                                C5RQ.LIZ(LJ, C86793Y4n.LJJIJIIJIL(this));
                            }
                            if (C5K0.LIZ) {
                                long NLEVEOperationEventManager_obtain = NLEMediaPublicJniJNI.NLEVEOperationEventManager_obtain();
                                if (NLEVEOperationEventManager_obtain != 0) {
                                    nLEVEOperationEventManager = new NLEVEOperationEventManager(NLEVEOperationEventManager_obtain, false);
                                }
                                this.LLJJL = nLEVEOperationEventManager;
                                ?? r5 = new NLEVEOperationListener() { // from class: X.5OK
                                    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
                                    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                                    @Override // com.bytedance.ies.nle.editor_jni.NLEVEOperationListener
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void onVEOperationEvent(com.bytedance.ies.nle.editor_jni.NLEVEOperationResType r11, java.lang.String r12, com.bytedance.ies.nle.editor_jni.NLEResourceNode r13, int r14, com.bytedance.ies.nle.editor_jni.NLERenderAction r15) {
                                        /*
                                            r10 = this;
                                            X.5qH r0 = X.C147295qH.this
                                            X.5Vv r0 = r0.LLIILII
                                            r7 = 1
                                            r6 = 0
                                            if (r0 == 0) goto La6
                                            boolean r0 = r0.isShowing()
                                            if (r0 != r7) goto La6
                                            r2 = 1
                                        Lf:
                                            X.5qH r0 = X.C147295qH.this
                                            X.4qd r3 = r0.LLLJ()
                                            if (r3 == 0) goto L2c
                                            X.5qH r0 = X.C147295qH.this
                                            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.LJLLJ
                                            r1 = 0
                                            if (r4 == 0) goto La9
                                            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r3.LJIIJ
                                            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r0.LJ()
                                            java.lang.String r0 = "it.editor.model"
                                            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                                            if (r14 != 0) goto L2d
                                        L2c:
                                            return
                                        L2d:
                                            if (r11 != 0) goto L9d
                                            r1 = -1
                                        L30:
                                            r9 = 3
                                            r8 = 2
                                            java.lang.String r5 = ""
                                            if (r1 == r7) goto L9a
                                            if (r1 == r8) goto L97
                                            if (r1 == r9) goto L94
                                            r0 = 4
                                            if (r1 == r0) goto L91
                                            r0 = 5
                                            if (r1 == r0) goto L8e
                                            r3 = r5
                                        L41:
                                            if (r15 != 0) goto L76
                                        L43:
                                            r7 = r5
                                        L44:
                                            java.lang.String r0 = "effect"
                                            boolean r0 = ujb.s.LJJJLZIJ(r3, r0, r6)
                                            if (r0 == 0) goto L2c
                                            if (r13 == 0) goto L54
                                            java.lang.String r0 = r13.LIZLLL()
                                            if (r0 != 0) goto L74
                                        L54:
                                            X.5oB r1 = X.C135005Ro.LIZIZ(r4)
                                            java.lang.String r0 = "effect_id"
                                            r1.LJI(r0, r5)
                                            java.lang.String r0 = "media_type"
                                            r1.LJI(r0, r3)
                                            java.lang.String r0 = "action_type"
                                            r1.LJI(r0, r7)
                                            java.lang.String r0 = "is_editor_pro"
                                            r1.LIZ(r2, r0)
                                            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
                                            java.lang.String r0 = "effect_operate_fail"
                                            X.GXR.LIZ(r0, r1)
                                            goto L2c
                                        L74:
                                            r5 = r0
                                            goto L54
                                        L76:
                                            int[] r1 = X.C5OH.LIZIZ
                                            int r0 = r15.ordinal()
                                            r0 = r1[r0]
                                            if (r0 == r7) goto L8b
                                            if (r0 == r8) goto L88
                                            if (r0 == r9) goto L85
                                            goto L43
                                        L85:
                                            java.lang.String r7 = "update"
                                            goto L44
                                        L88:
                                            java.lang.String r7 = "delete"
                                            goto L44
                                        L8b:
                                            java.lang.String r7 = "insert"
                                            goto L44
                                        L8e:
                                            java.lang.String r3 = "effect_time"
                                            goto L41
                                        L91:
                                            java.lang.String r3 = "effect_composer"
                                            goto L41
                                        L94:
                                            java.lang.String r3 = "effect_normal"
                                            goto L41
                                        L97:
                                            java.lang.String r3 = "effect_amazing"
                                            goto L41
                                        L9a:
                                            java.lang.String r3 = "video"
                                            goto L41
                                        L9d:
                                            int[] r1 = X.C5OH.LIZ
                                            int r0 = r11.ordinal()
                                            r1 = r1[r0]
                                            goto L30
                                        La6:
                                            r2 = 0
                                            goto Lf
                                        La9:
                                            java.lang.String r0 = "mModel"
                                            kotlin.jvm.internal.o.LJIJI(r0)
                                            throw r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C5OK.onVEOperationEvent(com.bytedance.ies.nle.editor_jni.NLEVEOperationResType, java.lang.String, com.bytedance.ies.nle.editor_jni.NLEResourceNode, int, com.bytedance.ies.nle.editor_jni.NLERenderAction):void");
                                    }
                                };
                                this.LLJJLIIIJLLLLLLLZ = r5;
                                NLEVEOperationEventManager nLEVEOperationEventManager2 = this.LLJJL;
                                if (nLEVEOperationEventManager2 != null) {
                                    NLEMediaPublicJniJNI.NLEVEOperationEventManager_addVEOperationListener(nLEVEOperationEventManager2.LIZ, nLEVEOperationEventManager2, NLEVEOperationListener.getCPtr(r5), r5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("editEffectApi");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("editNavApi");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C147295qH(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC142515iZ.class, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 401));
        this.LJZL = UCI.LJI(diContainer, InterfaceC142545ic.class, null);
        this.LLILIL = UCI.LJI(diContainer, InterfaceC145815nt.class, null);
        this.LLILL = UCI.LJI(diContainer, AbstractC42651GoZ.class, null);
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = new C73318Sq2();
        this.LLJJIJIL = C221108m2.LIZIZ(C149035t5.LJLIL);
        C221108m2.LIZIZ(C147395qR.LJLIL);
        this.LLJJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 402));
        this.LLJJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 399));
        this.LLJJJJ = new C5K1();
        this.LLJJJJJIL = new C147265qE();
        this.LLJJJJLIIL = new C147325qK(this);
        this.LLJL = true;
        this.LLJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 397));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c0, code lost:
    
        r9 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c4, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c6, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c8, code lost:
    
        r0 = r0.getChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        if (r0 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        if (r7 >= r0.length()) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d4, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d6, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d8, code lost:
    
        r4 = r0.getChain();
        r1 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01de, code lost:
    
        if (r1 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e3, code lost:
    
        if (r4 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e5, code lost:
    
        r0 = r4.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01eb, code lost:
    
        if (r0 < r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ed, code lost:
    
        if (r4 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fc, code lost:
    
        r5 = ujb.s.LJJZ(r7, r9, r4).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0204, code lost:
    
        r1.setChain(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ea, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f2, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f7, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0207, code lost:
    
        r2.remove(r3);
        r2.remove(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020f, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0213, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e1, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0214, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0218, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b1, code lost:
    
        r9 = r3.end + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ad, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0219, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x021d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x021e, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0220, code lost:
    
        if (r0 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0222, code lost:
    
        r9 = r0.getChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0226, code lost:
    
        if (r9 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0228, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0229, code lost:
    
        r7 = LLLLLLJ(r14, r7, r10);
        r1 = ujb.s.LJJLIIIJL(r9, r7, 0, false, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0232, code lost:
    
        if (r1 < 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0234, code lost:
    
        r1 = ujb.s.LJJZ(r1, r7.length() + r1, r9).toString();
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0243, code lost:
    
        if (r0 == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0245, code lost:
    
        r0.setChain(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ab, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0248, code lost:
    
        r7 = new java.util.ArrayList();
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x024f, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0251, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0253, code lost:
    
        if (r0 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0255, code lost:
    
        r1 = LLLLLLLZIL(r6, r5, r4);
        r6 = r1.getFirst().intValue();
        r5 = r1.getSecond().intValue();
        r4 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0275, code lost:
    
        if (r4.hasNext() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0277, code lost:
    
        r2 = r4.next();
        r1 = r2.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027f, code lost:
    
        if (r1 < r6) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0283, code lost:
    
        if (r2.end <= r5) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0285, code lost:
    
        if (r1 >= r5) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x028b, code lost:
    
        r2.start = r1 - r8;
        r2.end -= r8;
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0287, code lost:
    
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0299, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x029b, code lost:
    
        if (r0 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x029d, code lost:
    
        r0.setStructList(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02a1, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0297, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02a6, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02b0, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x012a, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x012e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x011d, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x012f, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0133, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00f1, code lost:
    
        r11 = r3.end + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00ed, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0134, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0138, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0139, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x013b, code lost:
    
        if (r0 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x013d, code lost:
    
        r12 = r0.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0141, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0143, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0144, code lost:
    
        r11 = LLLLLLJ(r14, r7, r10);
        r9 = ujb.s.LJJLIIIJL(r12, r11, 0, false, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x014d, code lost:
    
        if (r9 < 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x014f, code lost:
    
        r9 = ujb.s.LJJZ(r9, r11.length() + r9, r12).toString();
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x015e, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0160, code lost:
    
        r0.setTitle(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0164, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02ba, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02bf, code lost:
    
        r2 = X.X1D.LIZ();
        r2.append("start: ");
        r2.append(r3.start);
        r2.append(" end: ");
        r2.append(r3.end);
        r2.append(" chainLength ");
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02de, code lost:
    
        if (r0 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02e0, code lost:
    
        r0 = r0.getChain();
        r1 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02e6, code lost:
    
        if (r0 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02e8, code lost:
    
        r0 = java.lang.Integer.valueOf(r0.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02f0, code lost:
    
        r2.append(r0);
        r2.append("titleLength ");
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02fa, code lost:
    
        if (r0 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02fc, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02fe, code lost:
    
        if (r0 != null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0300, code lost:
    
        r1 = java.lang.Integer.valueOf(r0.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0308, code lost:
    
        r2.append(r1);
        X.H78.LIZIZ("EditRootScene", X.X1D.LIZIZ(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0314, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0317, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x031b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0315, code lost:
    
        r0 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x031c, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0320, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00a3, code lost:
    
        if (r0.charValue() != '@') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00a5, code lost:
    
        r7 = r7.substring(1);
        kotlin.jvm.internal.o.LJIIIIZZ(r7, "this as java.lang.String).substring(startIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00af, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0321, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0325, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r0 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r4 = r0.title;
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r7 = r4.substring(r3.start, r3.end);
        kotlin.jvm.internal.o.LJIIIIZZ(r7, "this as java.lang.String…ing(startIndex, endIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r0 = X.C40689Fy1.LLFZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r4 = LLLLLLJ(r14, r7, r10);
        r8 = r4.length();
        X.C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (X.C40976G6i.LIZ() != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r12 = r2.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r11 >= r12) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r11 <= r9) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        ((com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct) com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r11)).start -= r8;
        ((com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct) com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r11)).end -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        X.C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (X.C40976G6i.LIZ() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        r9 = r3.end + 1;
        r12 = (r9 + 1) - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        if (r12 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        if (r9 <= r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        r11 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0108, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
    
        if (r12 >= r0.length()) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0110, code lost:
    
        r9 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
    
        if (r9 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
    
        r0 = r9.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0116, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        if (r0 < r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
    
        if (r0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
    
        r0 = r0.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        r0 = ujb.s.LJJZ(r12, r11, r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        r9.setTitle(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b5, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0123, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0125, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        X.C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
    
        if (X.C40976G6i.LIZ() != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        r1 = r3.end + 1;
        r7 = (r1 + 1) - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        if (r7 >= 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019e, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a2, code lost:
    
        r0 = r0.getChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a6, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ae, code lost:
    
        if (r1 <= r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        r0 = r14.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
    
        r0 = r0.getChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01be, code lost:
    
        if (r0 == null) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLLLLLLLL(X.C147295qH r14) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147295qH.LLLLLLLLL(X.5qH):void");
    }

    @Override // X.InterfaceC137115Zr
    public final void LJII(StickerItemModel stickerItemModel) {
        int i;
        int i2;
        int i3;
        if (!C39579Fg7.LIZIZ(stickerItemModel.path)) {
            if (C138845ce.LIZ() && stickerItemModel.isTextSticker()) {
                VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
                if (videoPublishEditModel != null) {
                    if (!H7R.LJJJJZ(videoPublishEditModel)) {
                        return;
                    }
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            } else {
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
        if (videoPublishEditModel2 != null) {
            if (!videoPublishEditModel2.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                    if (videoPublishEditModel4 != null) {
                        videoPublishEditModel3.infoStickerModel = new InfoStickerModel(LIZIZ.LJJLIIIJJI(videoPublishEditModel4));
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
            if (videoPublishEditModel5 != null) {
                if (videoPublishEditModel5.infoStickerModel.stickers.size() > 0) {
                    VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                    if (videoPublishEditModel6 != null) {
                        i = 1;
                        for (StickerItemModel item : videoPublishEditModel6.infoStickerModel.stickers) {
                            o.LJIIIIZZ(item, "item");
                            if (C1535160t.LIZIZ(item) && (i3 = item.layerWeight) > i) {
                                i = i3;
                            }
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                } else {
                    i = 1;
                }
                stickerItemModel.layerWeight += i;
                VideoPublishEditModel videoPublishEditModel7 = this.LJLLJ;
                if (videoPublishEditModel7 != null) {
                    List<StickerItemModel> list = videoPublishEditModel7.infoStickerModel.stickers;
                    o.LJIIIIZZ(list, "mModel.infoStickerModel.stickers");
                    Iterator<StickerItemModel> it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().viewHash == stickerItemModel.viewHash) {
                            if (i4 > -1) {
                                VideoPublishEditModel videoPublishEditModel8 = this.LJLLJ;
                                if (videoPublishEditModel8 != null) {
                                    ListProtector.remove(videoPublishEditModel8.infoStickerModel.stickers, i4);
                                    VideoPublishEditModel videoPublishEditModel9 = this.LJLLJ;
                                    if (videoPublishEditModel9 != null) {
                                        ListProtector.add(videoPublishEditModel9.infoStickerModel.stickers, i4, stickerItemModel);
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                        } else {
                            i4++;
                        }
                    }
                    VideoPublishEditModel videoPublishEditModel10 = this.LJLLJ;
                    if (videoPublishEditModel10 != null) {
                        videoPublishEditModel10.infoStickerModel.stickers.add(stickerItemModel);
                        ArrayList arrayList = new ArrayList();
                        VideoPublishEditModel videoPublishEditModel11 = this.LJLLJ;
                        if (videoPublishEditModel11 != null) {
                            if (videoPublishEditModel11.infoStickerModel.stickers.size() > 0) {
                                VideoPublishEditModel videoPublishEditModel12 = this.LJLLJ;
                                if (videoPublishEditModel12 != null) {
                                    i2 = 1;
                                    for (StickerItemModel stickerItemModel2 : videoPublishEditModel12.infoStickerModel.stickers) {
                                        int i5 = stickerItemModel2.type;
                                        if (i5 == 4) {
                                            arrayList.add(stickerItemModel2);
                                        } else if (i5 == 7) {
                                            arrayList.add(stickerItemModel2);
                                        } else if (i5 == 26) {
                                            arrayList.add(stickerItemModel2);
                                        } else if (i5 == 19) {
                                            arrayList.add(stickerItemModel2);
                                        } else if (i5 == 24) {
                                            arrayList.add(stickerItemModel2);
                                        } else {
                                            int i6 = stickerItemModel2.layerWeight;
                                            if (i6 > i2) {
                                                i2 = i6;
                                            }
                                        }
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            } else {
                                i2 = 1;
                            }
                            if (arrayList.size() > 1) {
                                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(13));
                            }
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((StickerItemModel) ListProtector.get(arrayList, i7)).layerWeight = i2 + i7 + 1;
                            }
                            return;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.C6F2
    public final void LLJJLIIIJLLLLLLLZ(InterfaceC147475qZ interfaceC147475qZ) {
        this.LLILLL = interfaceC147475qZ;
    }

    @Override // X.C6F2
    public final void LLJLILLLLZIIL(C137965bE stickerChallengeManager) {
        o.LJIIIZ(stickerChallengeManager, "stickerChallengeManager");
        this.LLILZIL = stickerChallengeManager;
    }

    public final void LLJZIJLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        HPG LJ = C78934UyQ.LJLIL.LJ();
        Activity activity = this.mActivity;
        o.LJI(activity);
        if (LJ.LIZ(activity) == 0) {
            interfaceC65784Pro.invoke();
            return;
        }
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c61098NyQ.LIZIZ(activity2, TokenCert.Companion.with("bpea-tools_request_record_audio_permission_edit_root_scene")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new IDeS154S0200000_2(this, interfaceC65784Pro, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r19 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0152, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014e, code lost:
    
        if (X.C1293155r.LIZ() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0148, code lost:
    
        if (r1 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLL(final boolean r27) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147295qH.LLL(boolean):void");
    }

    public final void LLLF(boolean z) {
        boolean z2;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isStickPointMode) {
                if (!videoPublishEditModel.mIsFromDraft) {
                    C5S1 c5s1 = new C5S1(this.mActivity);
                    c5s1.LIZJ(R.string.rp2);
                    c5s1.LJ();
                    return;
                }
                return;
            }
            InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
            boolean z3 = true;
            if (interfaceC153275zv != null) {
                interfaceC153275zv.p9(1, false);
            }
            C78934UyQ.LJLIL.getMusicService().LJIIZILJ();
            InterfaceC145325n6 interfaceC145325n6 = this.LJLLLLLL;
            if (interfaceC145325n6 != null) {
                interfaceC145325n6.show(z);
            }
            LLLILZLLLI().U2(false, false, false);
            VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
            if (videoPublishEditModel2 != null) {
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    z2 = extractAVMusic.isMvThemeMusic();
                } else {
                    z2 = false;
                }
                InterfaceC145495nN LLJJ = LLJJ();
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    if (!C44384HbQ.LJJIIZ(videoPublishEditModel3) || z2) {
                        z3 = false;
                    }
                    LLJJ.B8(z3);
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLIIII(String str) {
        if (LLJJIII().LLL().EC()) {
            InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
            if (interfaceC153275zv != null) {
                interfaceC153275zv.b2(3, false);
                return;
            }
            return;
        }
        LLJJIII().LLLL();
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            H8F.LJJIIZI(videoPublishEditModel, str, 0, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        } else {
            o.LJIJI("mModel");
            throw null;
        }
    }

    public final void LLLIIIL(int i) {
        if (C41028G8i.LIZ()) {
            C42278GiY c42278GiY = this.LLIZLLLIL;
            if (c42278GiY != null) {
                c42278GiY.dismiss();
            }
            this.LLIZLLLIL = null;
            return;
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLIZ;
        if (progressDialogC43239Gy3 == null || !progressDialogC43239Gy3.isShowing()) {
            return;
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LLIZ;
        if (progressDialogC43239Gy32 != null) {
            progressDialogC43239Gy32.dismiss();
        }
        this.LLIZ = null;
        C42303Gix.LIZ(i, GGO.DISMISS, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final Bitmap LLLLIIIILLL(Bitmap bitmap) {
        List<StickerItemModel> list;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
                return bitmap;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
            if (videoPublishEditModel2 != null) {
                List<StickerItemModel> list2 = videoPublishEditModel2.infoStickerModel.stickers;
                o.LJIIIIZZ(list2, "mModel.infoStickerModel.stickers");
                for (StickerItemModel stickerItemModel : list2) {
                    if (stickerItemModel.type != 10) {
                        String str = stickerItemModel.path;
                        o.LJIIIIZZ(str, "it.path");
                        Bitmap LJIILIIL = C38891fp.LJIILIIL(bitmap.getWidth(), bitmap.getHeight(), str);
                        bitmap = C42299Git.LIZLLL(bitmap, LJIILIIL);
                        o.LJIIIIZZ(bitmap, "mergeBitmap(mergeBitmap, stickerBitmap)");
                        C42299Git.LJ(LJIILIIL);
                    }
                }
                return bitmap;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLLLJIL(int i) {
        if (C41028G8i.LIZ()) {
            if (this.LLIZLLLIL == null) {
                C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.backCanCancel(false);
                creativeLoadingDialogBuilder.showProgress(false);
                String string = getString(R.string.pc7);
                o.LJIIIIZZ(string, "getString(R.string.processing)");
                creativeLoadingDialogBuilder.loadingMessage(string);
                this.LLIZLLLIL = (C42278GiY) c42279GiZ.createLoadingDialog(requireActivity, i, creativeLoadingDialogBuilder);
            }
            C42278GiY c42278GiY = this.LLIZLLLIL;
            if (c42278GiY != null) {
                c42278GiY.delayShow(C42279GiZ.LIZ());
                return;
            }
            return;
        }
        if (this.LLIZ == null) {
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            ProgressDialogC43239Gy3 LIZIZ = C42034Gec.LIZIZ(requireActivity2);
            LIZIZ.setMessage(getString(R.string.pc7));
            this.LLIZ = LIZIZ;
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLIZ;
        if (progressDialogC43239Gy3 != null) {
            C16880lQ.LIZ(progressDialogC43239Gy3);
        }
        C42303Gix.LIZ(i, GGO.SHOW, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final void LLLLLLZ(int i) {
        C147365qO c147365qO = (C147365qO) getScope().LIZ("needRecognize");
        if (c147365qO != null) {
            c147365qO.LJLIL = i;
            V8O scope = getScope();
            o.LJIIIIZZ(scope, "scope");
            C87277YNd.LJJII(scope, "needRecognize", c147365qO);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        V8O scope2 = getScope();
        o.LJIIIIZZ(scope2, "scope");
        C87277YNd.LJJII(scope2, "needRecognize", new C147365qO(i));
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC153275zv interfaceC153275zv;
        InterfaceC153185zm interfaceC153185zm;
        InterfaceC145605nY interfaceC145605nY;
        InterfaceC146665pG interfaceC146665pG;
        InterfaceC145875nz interfaceC145875nz;
        super.onActivityCreated(bundle);
        this.LJLLJ = (VideoPublishEditModel) this.LJLILLLLZI.LJ(VideoPublishEditModel.class, null);
        this.LLILZLL = (InterfaceC147355qN) this.LJLILLLLZI.LJ(InterfaceC147355qN.class, null);
        C142685iq c142685iq = (C142685iq) this.LJLILLLLZI.LJ(C142685iq.class, null);
        this.LJLLL = c142685iq.LJLIL;
        this.LJLLLL = c142685iq.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !C6EZ.LIZ()) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.creativeModel.privacySettingModel.isSubscribeOnly = false;
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            C44298Ha2 c44298Ha2 = G8G.LIZ;
            c44298Ha2.step("av_video_edit", "begin registerComponents");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C78685UuP.LJIIJJI(this, C89477Z9t.LJLIL);
            C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 233));
            C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 235));
            C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
            if (c82622Wbi != null) {
                if (C44384HbQ.LJJIFFI()) {
                    this.LJLLLLLL = (InterfaceC145325n6) c82622Wbi.LJIIIIZZ(null, InterfaceC145325n6.class);
                }
                this.LJLJJLL = (InterfaceC153275zv) c82622Wbi.LJ(InterfaceC153275zv.class, null);
                this.LJLJLJ = (InterfaceC145605nY) c82622Wbi.LJIIIIZZ(null, InterfaceC145605nY.class);
                this.LJLJLLL = (InterfaceC146665pG) c82622Wbi.LJIIIIZZ(null, InterfaceC146665pG.class);
                this.LJLL = (InterfaceC145875nz) c82622Wbi.LJIIIIZZ(null, InterfaceC145875nz.class);
                this.LJLLI = (InterfaceC145485nM) c82622Wbi.LJ(InterfaceC145485nM.class, null);
                this.LJLLILLLL = (InterfaceC146675pH) c82622Wbi.LJ(InterfaceC146675pH.class, null);
                this.LJLZ = (InterfaceC146235oZ) c82622Wbi.LJ(InterfaceC146235oZ.class, null);
                this.LJZ = (InterfaceC147145q2) c82622Wbi.LJ(InterfaceC147145q2.class, null);
                this.LJZI = (InterfaceC147865rC) c82622Wbi.LJ(InterfaceC147865rC.class, null);
                this.LL = (InterfaceC140305f0) c82622Wbi.LJ(InterfaceC140305f0.class, null);
                this.LLD = (InterfaceC142725iu) c82622Wbi.LJ(InterfaceC142725iu.class, null);
                this.LLF = (InterfaceC145455nJ) c82622Wbi.LJ(InterfaceC145455nJ.class, null);
                this.LLFF = (C5XM) c82622Wbi.LJ(C5XM.class, null);
                this.LLFFF = (InterfaceC143855kj) c82622Wbi.LJIIIIZZ(null, InterfaceC143855kj.class);
                this.LLFII = (InterfaceC147645qq) c82622Wbi.LJIIIIZZ(null, InterfaceC147645qq.class);
                this.LLFZ = (InterfaceC143845ki) c82622Wbi.LJIIIIZZ(null, InterfaceC143845ki.class);
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    if (H7R.LJJJ(videoPublishEditModel3)) {
                        this.LLI = (InterfaceC146755pP) c82622Wbi.LJIIIIZZ(null, InterfaceC146755pP.class);
                    }
                    this.LLIFFJFJJ = (C6E7) c82622Wbi.LJIIIIZZ(null, C6E7.class);
                    this.LLII = (InterfaceC147635qp) c82622Wbi.LJIIIIZZ(null, InterfaceC147635qp.class);
                    this.LLIIII = (InterfaceC143385jy) c82622Wbi.LJIIIIZZ(null, InterfaceC143385jy.class);
                    this.LLIIIILZ = (InterfaceC149715uB) c82622Wbi.LJIIIIZZ(null, InterfaceC149715uB.class);
                    this.LLIIIJ = (InterfaceC145405nE) c82622Wbi.LJIIIIZZ(null, InterfaceC145405nE.class);
                    this.LLIIIL = (InterfaceC147345qM) c82622Wbi.LJIIIIZZ(null, InterfaceC147345qM.class);
                    this.LLIIIZ = (C163096af) c82622Wbi.LJIIIIZZ(null, C163096af.class);
                    this.LLIIJI = (C42210GhS) c82622Wbi.LJIIIIZZ(null, C42210GhS.class);
                    this.LLIL = (C6FS) c82622Wbi.LJ(C6FS.class, null);
                    this.LLIIJLIL = (InterfaceC148865so) c82622Wbi.LJIIIIZZ(null, InterfaceC148865so.class);
                    this.LLIIL = (InterfaceC147455qX) c82622Wbi.LJIIIIZZ(null, InterfaceC147455qX.class);
                    this.LLILLIZIL = (InterfaceC159276Mx) c82622Wbi.LJIIIIZZ(null, InterfaceC159276Mx.class);
                    this.LLIILII = (InterfaceC136115Vv) c82622Wbi.LJIIIIZZ(null, InterfaceC136115Vv.class);
                    this.LLIILZL = (C5LG) c82622Wbi.LJIIIIZZ(null, C5LG.class);
                    this.LLIIZ = (InterfaceC162426Za) c82622Wbi.LJIIIIZZ(null, C149805uK.class);
                    this.LLJIJIL = (C5L0) c82622Wbi.LJIIIIZZ(null, C5L0.class);
                    this.LLILII = (InterfaceC150685vk) c82622Wbi.LJIIIIZZ(null, InterfaceC150685vk.class);
                    this.LLJILJIL = true;
                    C82622Wbi c82622Wbi2 = C44384HbQ.LJJJI(this).LJLLL;
                    if (c82622Wbi2 != null) {
                        interfaceC153275zv = (InterfaceC153275zv) c82622Wbi2.LJ(InterfaceC153275zv.class, null);
                    } else {
                        interfaceC153275zv = null;
                    }
                    this.LJLJJLL = interfaceC153275zv;
                    C82622Wbi c82622Wbi3 = C44384HbQ.LJJJI(this).LJLLL;
                    if (c82622Wbi3 != null) {
                        interfaceC153185zm = (InterfaceC153185zm) c82622Wbi3.LJ(InterfaceC153185zm.class, null);
                    } else {
                        interfaceC153185zm = null;
                    }
                    this.LJLJL = interfaceC153185zm;
                    C44384HbQ.LJJJI(this);
                    C60903NvH.LJIIJJI().LJIJJLI();
                    this.LLJJI = SystemClock.elapsedRealtime() - elapsedRealtime;
                    c44298Ha2.step("av_video_edit", "end registerComponents");
                    LLLILZLLLI().h10(this.LLJJ, this.LLJJI);
                    C82622Wbi c82622Wbi4 = C44384HbQ.LJJJI(this).LJLLL;
                    if (c82622Wbi4 != null) {
                        interfaceC145605nY = (InterfaceC145605nY) c82622Wbi4.LJIIIIZZ(null, InterfaceC145605nY.class);
                    } else {
                        interfaceC145605nY = null;
                    }
                    this.LJLJLJ = interfaceC145605nY;
                    C82622Wbi c82622Wbi5 = C44384HbQ.LJJJI(this).LJLLL;
                    if (c82622Wbi5 != null) {
                        interfaceC146665pG = (InterfaceC146665pG) c82622Wbi5.LJIIIIZZ(null, InterfaceC146665pG.class);
                    } else {
                        interfaceC146665pG = null;
                    }
                    this.LJLJLLL = interfaceC146665pG;
                    C82622Wbi c82622Wbi6 = C44384HbQ.LJJJI(this).LJLLL;
                    if (c82622Wbi6 != null) {
                        interfaceC145875nz = (InterfaceC145875nz) c82622Wbi6.LJIIIIZZ(null, InterfaceC145875nz.class);
                    } else {
                        interfaceC145875nz = null;
                    }
                    this.LJLL = interfaceC145875nz;
                    Activity activity = this.mActivity;
                    o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
                    C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
                    if (LJJLIIIJJI != null) {
                        this.LJLIL = new C145335n7(activityC45651qj, this, LJJLIIIJJI);
                        LLLILZLLLI().wf0().observe(this, new AObserverS70S0100000_2(this, 82));
                        VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                        if (videoPublishEditModel4 != null) {
                            if (H7R.LJJLIIIJJIZ(videoPublishEditModel4)) {
                                C147625qo.LIZ = SystemClock.elapsedRealtime();
                                C6VC c6vc = this.LLILZ;
                                if (c6vc != null) {
                                    c6vc.LIZIZ(new C6V4(100, new WXC() { // from class: X.5rA
                                        @Override // X.C6P6, X.C6V2
                                        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                                            C63C LLJJIII;
                                            C63D c63d;
                                            C147295qH c147295qH = C147295qH.this;
                                            VideoPublishEditModel videoPublishEditModel5 = c147295qH.LJLLJ;
                                            if (videoPublishEditModel5 != null && H7R.LJJLIIIJJIZ(videoPublishEditModel5) && (((c63d = (LLJJIII = c147295qH.LLJJIII()).LLJI) == null || !c63d.LJIIIIZZ()) && !o.LJ(LLJJIII.LLJJJIL().hP().getValue(), Boolean.TRUE) && !LLJJIII.LLJJIJIL().LLIILII() && !LLJJIII.LLJJIJIL().LJIIIIZZ() && !LLJJIII.LLJJJ().LLIILII() && !LLJJIII.LLJJJ().LJIIIIZZ())) {
                                                AnonymousClass632.LIZIZ(c147295qH.getSceneContext());
                                                C67P LLLFZ = c147295qH.LLJJIII().LLLFZ();
                                                if (LLLFZ == null) {
                                                    c147295qH.LLJJIII().LLLL();
                                                } else {
                                                    C63D c63d2 = c147295qH.LLJJIII().LLJI;
                                                    if (c63d2 != null) {
                                                        c63d2.PN(LLLFZ);
                                                    }
                                                }
                                            }
                                            return true;
                                        }
                                    }));
                                } else {
                                    o.LJIJI("gestureService");
                                    throw null;
                                }
                            }
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                if (!C44384HbQ.LJJIJLIJ(videoPublishEditModel5)) {
                                    return;
                                }
                                C6VC c6vc2 = this.LLILZ;
                                if (c6vc2 != null) {
                                    c6vc2.LIZIZ(new C6V4(10001, new WXC() { // from class: X.5qG
                                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
                                        
                                            if (r0.jw() == true) goto L8;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
                                        
                                            if (r0.Qf() == true) goto L8;
                                         */
                                        @Override // X.C6P6, X.C6V2
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final boolean onDown(android.view.MotionEvent r5) {
                                            /*
                                                r4 = this;
                                                X.5qH r3 = X.C147295qH.this
                                                X.63C r0 = r3.LLJJIII()
                                                boolean r0 = r0.LLLIIIL()
                                                r2 = 0
                                                if (r0 != 0) goto L1a
                                                X.5qH r0 = X.C147295qH.this
                                                X.5zv r0 = r0.LJLJJLL
                                                r1 = 1
                                                if (r0 == 0) goto L1e
                                                boolean r0 = r0.Qf()
                                                if (r0 != r1) goto L1e
                                            L1a:
                                                r1 = 0
                                            L1b:
                                                r3.LLJL = r1
                                                return r2
                                            L1e:
                                                X.5qH r0 = X.C147295qH.this
                                                X.5so r0 = r0.LLIIJLIL
                                                if (r0 == 0) goto L1b
                                                boolean r0 = r0.jw()
                                                if (r0 != r1) goto L1b
                                                goto L1a
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C147285qG.onDown(android.view.MotionEvent):boolean");
                                        }
                                    }));
                                    return;
                                } else {
                                    o.LJIJI("gestureService");
                                    throw null;
                                }
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                o.LJIJI("mModel");
                throw null;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        o.LJIJI("mModel");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onServerRenderingEvent(C126894yT event) {
        o.LJIIIZ(event, "event");
        LLLFZ();
        EventBus.LIZJ().LJIJ(this);
    }

    public static final void LLLLLJLJLL(C147295qH c147295qH, C76732zl c76732zl) {
        AVTextExtraStruct createQuestionStruct;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
            if (commentVideoModel != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                LIZ.append(commentVideoModel.getUserName());
                String sb = LLLLLLIL(c147295qH, c76732zl, X1D.LIZIZ(LIZ)).toString();
                o.LJIIIIZZ(sb, "createCommentOrQaTitle(\"@$userName\").toString()");
                ArrayList arrayList = new ArrayList();
                String userName = commentVideoModel.getUserName();
                if (userName == null) {
                    userName = "";
                }
                int i = 0;
                int LJJLIIIJL = s.LJJLIIIJL(sb, userName, 0, false, 6) - 1;
                int i2 = LJJLIIIJL + 1;
                String userName2 = commentVideoModel.getUserName();
                if (userName2 != null) {
                    i = userName2.length();
                }
                int i3 = i2 + i;
                boolean isComment = commentVideoModel.isComment();
                String str = CardStruct.IStatusCode.DEFAULT;
                if (isComment) {
                    String userId = commentVideoModel.getUserId();
                    if (userId != null) {
                        str = userId;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createCommentStruct(LJJLIIIJL, i3, str);
                } else {
                    String userId2 = commentVideoModel.getUserId();
                    if (userId2 != null) {
                        str = userId2;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createQuestionStruct(LJJLIIIJL, i3, str);
                }
                C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
                if (C40976G6i.LIZ()) {
                    arrayList.add(AVTextExtraStructHelper.createCommentChainBoundaryStruct(sb));
                }
                arrayList.add(createQuestionStruct);
                C60903NvH.LJIIJJI().getPublishService().LJIJI();
                arrayList.addAll(GSL.LJIIIIZZ(sb));
                C147335qL c147335qL = new C147335qL(sb, arrayList);
                C60903NvH.LJIIJJI().getPublishService().LJIJI();
                VideoPublishEditModel videoPublishEditModel2 = c147295qH.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    GSL.LJIIJ(videoPublishEditModel2, c147335qL);
                    return;
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final void LLLLLLL(C147295qH c147295qH, C76732zl c76732zl) {
        String str;
        int i;
        String str2;
        String str3;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
            int i2 = 0;
            if (structList == null || structList.isEmpty()) {
                return;
            }
            int size = structList.size();
            AVTextExtraStruct aVTextExtraStruct = null;
            AVTextExtraStruct aVTextExtraStruct2 = null;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) ListProtector.get(structList, i4);
                if (aVTextExtraStruct3.subType == 2) {
                    if (aVTextExtraStruct3.isTransient()) {
                        aVTextExtraStruct2 = aVTextExtraStruct3;
                    } else {
                        i3 = i4;
                        aVTextExtraStruct = aVTextExtraStruct3;
                    }
                }
            }
            if (aVTextExtraStruct == null) {
                return;
            }
            VideoPublishEditModel videoPublishEditModel2 = c147295qH.LJLLJ;
            if (videoPublishEditModel2 != null) {
                String str4 = videoPublishEditModel2.title;
                String str5 = "";
                if (str4 == null) {
                    str = "";
                } else {
                    str = str4.substring(aVTextExtraStruct.start, aVTextExtraStruct.end);
                    o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                String sb = LLLLLLIL(c147295qH, c76732zl, str).toString();
                o.LJIIIIZZ(sb, "createCommentOrQaTitle(structName).toString()");
                int length = sb.length();
                C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
                if (!C40976G6i.LIZ()) {
                    int size2 = structList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (i5 > i3) {
                            ((AVTextExtraStruct) ListProtector.get(structList, i5)).start -= length;
                            ((AVTextExtraStruct) ListProtector.get(structList, i5)).end -= length;
                        }
                    }
                }
                try {
                    C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
                    if (C40976G6i.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel3 = c147295qH.LJLLJ;
                        if (videoPublishEditModel3 != null) {
                            String title = videoPublishEditModel3.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            int LJJLIIIJL = s.LJJLIIIJL(title, sb, 0, false, 6);
                            if (LJJLIIIJL >= 0) {
                                String charSequence = s.LJJZ(LJJLIIIJL, sb.length() + LJJLIIIJL, title).toString();
                                VideoPublishEditModel videoPublishEditModel4 = c147295qH.LJLLJ;
                                if (videoPublishEditModel4 != null) {
                                    videoPublishEditModel4.setTitle(charSequence);
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel5 = c147295qH.LJLLJ;
                        if (videoPublishEditModel5 != null) {
                            String str6 = videoPublishEditModel5.title;
                            if (str6 != null) {
                                i = str6.length();
                            } else {
                                i = 0;
                            }
                            if (i < length) {
                                str2 = "";
                            } else {
                                VideoPublishEditModel videoPublishEditModel6 = c147295qH.LJLLJ;
                                if (videoPublishEditModel6 != null) {
                                    String str7 = videoPublishEditModel6.title;
                                    if (str7 != null) {
                                        int i6 = aVTextExtraStruct.end;
                                        str2 = s.LJJZ((i6 - length) + 1, i6 + 1, str7).toString();
                                    } else {
                                        str2 = null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                            videoPublishEditModel5.setTitle(str2);
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
                    if (C40976G6i.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel7 = c147295qH.LJLLJ;
                        if (videoPublishEditModel7 != null) {
                            String chain = videoPublishEditModel7.getChain();
                            if (chain == null) {
                                chain = "";
                            }
                            int LJJLIIIJL2 = s.LJJLIIIJL(chain, sb, 0, false, 6);
                            if (LJJLIIIJL2 >= 0) {
                                String charSequence2 = s.LJJZ(LJJLIIIJL2, sb.length() + LJJLIIIJL2, chain).toString();
                                VideoPublishEditModel videoPublishEditModel8 = c147295qH.LJLLJ;
                                if (videoPublishEditModel8 != null) {
                                    videoPublishEditModel8.setChain(charSequence2);
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            } else {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("try remove comment chain failed, oldChainText=");
                                LIZ.append(chain);
                                LIZ.append(", chainText=");
                                LIZ.append(sb);
                                LIZ.append(", structName=");
                                LIZ.append(str);
                                LIZ.append(", title=");
                                VideoPublishEditModel videoPublishEditModel9 = c147295qH.LJLLJ;
                                if (videoPublishEditModel9 != null) {
                                    LIZ.append(videoPublishEditModel9.title);
                                    LIZ.append(", markupText=");
                                    VideoPublishEditModel videoPublishEditModel10 = c147295qH.LJLLJ;
                                    if (videoPublishEditModel10 != null) {
                                        LIZ.append(videoPublishEditModel10.creativeModel.postPageModel.markupCaption);
                                        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("DeleteCommentMetadata", X1D.LIZIZ(LIZ));
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel11 = c147295qH.LJLLJ;
                        if (videoPublishEditModel11 != null) {
                            String chain2 = videoPublishEditModel11.getChain();
                            if (chain2 != null) {
                                i2 = chain2.length();
                            }
                            if (i2 < length) {
                                str3 = "";
                            } else {
                                VideoPublishEditModel videoPublishEditModel12 = c147295qH.LJLLJ;
                                if (videoPublishEditModel12 != null) {
                                    String chain3 = videoPublishEditModel12.getChain();
                                    if (chain3 != null) {
                                        int i7 = aVTextExtraStruct.end;
                                        str3 = s.LJJZ((i7 - length) + 1, i7 + 1, chain3).toString();
                                    } else {
                                        str3 = null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                            videoPublishEditModel11.setChain(str3);
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
                    if (!C40976G6i.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel13 = c147295qH.LJLLJ;
                        if (videoPublishEditModel13 != null) {
                            List<AVTextExtraStruct> structList2 = videoPublishEditModel13.getStructList();
                            if (structList2 != null) {
                                structList2.remove(aVTextExtraStruct);
                            }
                            VideoPublishEditModel videoPublishEditModel14 = c147295qH.LJLLJ;
                            if (videoPublishEditModel14 != null) {
                                List<AVTextExtraStruct> structList3 = videoPublishEditModel14.getStructList();
                                if (structList3 != null) {
                                    structList3.remove(aVTextExtraStruct2);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    VideoPublishEditModel videoPublishEditModel15 = c147295qH.LJLLJ;
                    if (videoPublishEditModel15 != null) {
                        String str8 = videoPublishEditModel15.title;
                        if (str8 != null) {
                            str5 = str8;
                        }
                        OSZ<Integer, Integer> LLLLLLLZIL = LLLLLLLZIL(aVTextExtraStruct2, str5, sb);
                        int intValue = LLLLLLLZIL.getFirst().intValue();
                        int intValue2 = LLLLLLLZIL.getSecond().intValue();
                        for (AVTextExtraStruct aVTextExtraStruct4 : structList) {
                            int i8 = aVTextExtraStruct4.start;
                            if (i8 < intValue || aVTextExtraStruct4.end > intValue2) {
                                if (i8 < intValue2) {
                                    arrayList.add(aVTextExtraStruct4);
                                } else {
                                    aVTextExtraStruct4.start = i8 - length;
                                    aVTextExtraStruct4.end -= length;
                                    arrayList.add(aVTextExtraStruct4);
                                }
                            }
                        }
                        VideoPublishEditModel videoPublishEditModel16 = c147295qH.LJLLJ;
                        if (videoPublishEditModel16 != null) {
                            videoPublishEditModel16.setStructList(arrayList);
                            return;
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    o.LJIJI("mModel");
                    throw null;
                } catch (Exception unused) {
                    return;
                }
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.C6F2
    public final void LLJILJILJ(Runnable runnable, Runnable runnable2) {
        C63D c63d = LLJJIII().LLJI;
        if (c63d != null) {
            c63d.uO();
        }
        InterfaceC143855kj interfaceC143855kj = this.LLFFF;
        if (interfaceC143855kj != null) {
            interfaceC143855kj.Ba();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditRootScene -> nextStepCustom -> captions.Size = ");
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            LIZ.append(C78841Uwv.LJIIJJI(videoPublishEditModel));
            H78.LIZ(X1D.LIZIZ(LIZ));
            InterfaceC153045zY value = LLLILZLLLI().Kh().getValue();
            if (value != null) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.getPreviewInfo().setPreviewVideoLength(value.getDuration());
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
            if (videoPublishEditModel3 != null) {
                if (videoPublishEditModel3.mIsFromDraft && videoPublishEditModel3.isDraftMusicIllegal()) {
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                    if (videoPublishEditModel4 != null) {
                        if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel4.creativeModel.musicBuzModel) != null) {
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                videoPublishEditModel5.setDraftMusicIllegal(false);
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                LLLIIIIL(this.LJLLL, this.LJLLLL, runnable, true, runnable2);
                return;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.C6F2
    public final void LLJJIJI(Runnable successCallback, boolean z) {
        o.LJIIIZ(successCallback, "successCallback");
        LLLLIILLL(false, false, successCallback, true);
    }

    @Override // X.C6F2
    public final void LLJJL(Effect effect, CustomStickerInfo info) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(info, "info");
        LLLILZLLLI().DM().setValue(C5MM.LIZLLL(0L));
        C147265qE c147265qE = this.LLJJJJJIL;
        C147485qa c147485qa = new C147485qa(effect, info);
        C29901Fi c29901Fi = c147265qE.LIZ;
        o.LJII(c29901Fi, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.gamora.editor.ImageStickerAdapterInfo>");
        c29901Fi.LJII(c147485qa);
    }

    public final void LLJLLL(boolean z, C142765iy c142765iy) {
        C142885jA LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ();
        ArrayList arrayList = new ArrayList();
        InterfaceC142725iu interfaceC142725iu = this.LLD;
        if (interfaceC142725iu != null) {
            interfaceC142725iu.Vr(LLLIZZ(), c142765iy, new AqS22S0310000_2(LIZIZ, this, arrayList, z, 1), new C5WH(LIZIZ, this, arrayList, z), new AqS168S0100000_2(this, 241));
        } else {
            o.LJIJI("extraCoverFrameApi");
            throw null;
        }
    }

    public final void LLLFF(boolean z, boolean z2) {
        InterfaceC143385jy interfaceC143385jy;
        ((InterfaceC145815nt) this.LLILIL.LIZ(this, LLJLL[2])).Ye(new AbstractC147425qU() { // from class: X.5qT
        }, LLLIZZ());
        G8G.LIZ.start(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "start_choose_music");
        ICommerceToolsMissionService LJIIJ = CommerceToolsMissionService.LJIIJ();
        Activity activity = this.mActivity;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            LJIIJ.LJIIIZ(activity, videoPublishEditModel);
            if (C149275tT.LIZ() == 1 || !z || (interfaceC143385jy = this.LLIIII) == null || !C143475k7.LIZ(interfaceC143385jy, "click_add_sound", false, new AqS152S0100000_2(this, 398), 12)) {
                if (C44384HbQ.LJJIFFI()) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        H8F.LJJIII(2, videoPublishEditModel2, "ai_panel");
                        LLLF(z2);
                        return;
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                if (this.LLJILLL) {
                    this.LLJILLL = false;
                    return;
                }
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    H8F.LJJIII(6, videoPublishEditModel3, null);
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                    if (videoPublishEditModel4 != null) {
                        if (videoPublishEditModel4.isStickPointMode) {
                            if (videoPublishEditModel4.mIsFromDraft) {
                                return;
                            }
                            C5S1 c5s1 = new C5S1(this.mActivity);
                            c5s1.LIZJ(R.string.rp2);
                            c5s1.LJ();
                            return;
                        }
                        LLJJIII().LJLJJL();
                        InterfaceC153275zv interfaceC153275zv = this.LJLJJLL;
                        if (interfaceC153275zv != null) {
                            interfaceC153275zv.r3();
                        }
                        LLLILZLLLI().DM().setValue(C5MM.LIZJ());
                        C6FS c6fs = this.LLIL;
                        if (c6fs != null) {
                            c6fs.uR(true);
                            LLJJ().r3();
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                H8F.LJIL(videoPublishEditModel5);
                                return;
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        }
                        o.LJIJI("editNavApi");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0.getCurMultiEditVideoRecordData().segmentDataList.size() == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(X.InterfaceC65784Pro r7, boolean r8) {
        /*
            r6 = this;
            X.5pP r0 = r6.LLI
            if (r0 == 0) goto L45
            r4 = 1
            r0.LY(r4, r8, r7)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LJLLJ
            r5 = 0
            java.lang.String r1 = "mModel"
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LJLLJ
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r0 = r0.segmentDataList
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LJLLJ
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r0 = r0.segmentDataList
            int r0 = r0.size()
            if (r0 != r4) goto L46
        L31:
            X.5Wd r3 = X.AbstractC46064I6a.LLIILZL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.LJLLJ
            if (r2 == 0) goto L48
            kotlin.jvm.internal.AqS45S0110000_2 r1 = new kotlin.jvm.internal.AqS45S0110000_2
            r0 = 5
            r1.<init>(r6, r4, r0)
            r3.getClass()
            java.lang.String r0 = "click_video_trim"
            X.C136195Wd.LIZIZ(r2, r0, r1)
        L45:
            return
        L46:
            r4 = 0
            goto L31
        L48:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        L4c:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        L50:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        L54:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147295qH.LLLIILIL(X.Pro, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable, X.Ynr] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    public final C10K LLLLIIL(Runnable runnable, boolean z) {
        InterfaceC147435qV interfaceC147435qV;
        C1556669a c1556669a;
        C1556769b c1556769b;
        C1558169p c1558169p;
        C1551366z c1551366z;
        C10K<C76800UCe> c10k;
        C10K<C76800UCe> LJIIIZ;
        InterfaceC139535dl interfaceC139535dl;
        OSZ osz;
        InterfaceC147435qV interfaceC147435qV2;
        InterfaceC147435qV interfaceC147435qV3;
        InterfaceC147435qV interfaceC147435qV4;
        InterfaceC147435qV interfaceC147435qV5;
        InterfaceC147435qV LIZ;
        String effectId;
        H78.LIZ("VEVideoPublishEditActivity compileStickers");
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        ?? r3 = 0;
        r3 = 0;
        if (videoPublishEditModel != null) {
            C137965bE c137965bE = this.LLILZIL;
            if (c137965bE != null) {
                videoPublishEditModel.stickerChallenge = c137965bE.LIZIZ();
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    if (videoPublishEditModel2.creativeModel.postPageModel.isEnterFromEPDirectly) {
                        InterfaceC147865rC interfaceC147865rC = this.LJZI;
                        if (interfaceC147865rC != null) {
                            interfaceC147865rC.Kg();
                        } else {
                            o.LJIJI("editStickerApi");
                            throw null;
                        }
                    }
                    InterfaceC153045zY LLLIZZ = LLLIZZ();
                    if (LLLIZZ == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("editor is null when compiling sticker,isDestroy:");
                        LIZ2.append(SceneExtensionsKt.LIZ(this));
                        LIZ2.append(".stackTrace:");
                        LIZ2.append(android.util.Log.getStackTraceString(new Throwable()));
                        H78.LIZJ(X1D.LIZIZ(LIZ2));
                        C10K LJIIIZ2 = C10K.LJIIIZ(null);
                        o.LJIIIIZZ(LJIIIZ2, "forResult(null)");
                        return LJIIIZ2;
                    }
                    InterfaceC139655dx LLL = LLJJIII().LLL();
                    List<TextStickerData> YU = LLL.YU();
                    if (!YU.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        int size = YU.size();
                        for (int i = 0; i < size; i++) {
                            TextFontStyleData LJIIIIZZ = C68M.LJIIJ().LJIIIIZZ(((TextStickerData) ListProtector.get(YU, i)).getFontType());
                            if (LJIIIIZZ != null) {
                                String str = LJIIIIZZ.title;
                                if (str == null) {
                                    str = "";
                                }
                                sb.append(str);
                                Effect effect = LJIIIIZZ.LIZJ;
                                if (effect == null) {
                                    effectId = "";
                                } else {
                                    effectId = effect.getEffectId();
                                }
                                sb2.append(effectId);
                                if (i != YU.size() - 1) {
                                    sb.append(",");
                                    sb2.append(",");
                                }
                            }
                        }
                        VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                        if (videoPublishEditModel3 != null) {
                            videoPublishEditModel3.textTypes = sb.toString();
                            VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                            if (videoPublishEditModel4 != null) {
                                videoPublishEditModel4.textEffectIds = sb2.toString();
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                        if (videoPublishEditModel5 != null) {
                            videoPublishEditModel5.textTypes = "";
                            videoPublishEditModel5.textEffectIds = "";
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    AnonymousClass673 anonymousClass673 = LLJJIII().LJZL;
                    C67C c67c = LLJJIII().LJLLJ;
                    C1557569j c1557569j = LLJJIII().LJLLL;
                    InterfaceC147435qV[] interfaceC147435qVArr = new InterfaceC147435qV[8];
                    InterfaceC147905rG LLLJIL = LLLJIL();
                    if (LLLJIL != null) {
                        interfaceC147435qV = LLLJIL.LIZ();
                    } else {
                        interfaceC147435qV = null;
                    }
                    interfaceC147435qVArr[0] = interfaceC147435qV;
                    interfaceC147435qVArr[1] = LLL.LIZ();
                    if (anonymousClass673 != null) {
                        c1556669a = anonymousClass673.LLJJI();
                    } else {
                        c1556669a = null;
                    }
                    interfaceC147435qVArr[2] = c1556669a;
                    if (c67c != null) {
                        c1556769b = c67c.LLJJI();
                    } else {
                        c1556769b = null;
                    }
                    interfaceC147435qVArr[3] = c1556769b;
                    if (c1557569j != null) {
                        c1558169p = c1557569j.LLJJ();
                    } else {
                        c1558169p = null;
                    }
                    interfaceC147435qVArr[4] = c1558169p;
                    interfaceC147435qVArr[5] = LLJJIII().LLJJJ().LIZ();
                    interfaceC147435qVArr[6] = LLJJIII().LLJJIJIL().LIZ();
                    C1550766t c1550766t = LLJJIII().LLIFFJFJJ;
                    if (c1550766t != null) {
                        c1551366z = c1550766t.LLJILJILJ();
                    } else {
                        c1551366z = null;
                    }
                    interfaceC147435qVArr[7] = c1551366z;
                    List LJJIJIL = C47261Igj.LJJIJIL(interfaceC147435qVArr);
                    AlsLogicContainer LJJJIL = C44384HbQ.LJJJIL(LLJJIII());
                    if (LJJJIL != null) {
                        C63R c63r = (C63R) LJJJIL.LJ(C63R.class);
                        if (c63r != null) {
                            interfaceC147435qV2 = c63r.LIZ();
                        } else {
                            interfaceC147435qV2 = null;
                        }
                        LJJIJIL.add(interfaceC147435qV2);
                        C63K c63k = (C63K) LJJJIL.LJ(C63K.class);
                        if (c63k != null) {
                            interfaceC147435qV3 = c63k.LIZ();
                        } else {
                            interfaceC147435qV3 = null;
                        }
                        LJJIJIL.add(interfaceC147435qV3);
                        C63Q c63q = (C63Q) LJJJIL.LJ(C63Q.class);
                        if (c63q != null) {
                            interfaceC147435qV4 = c63q.LIZ();
                        } else {
                            interfaceC147435qV4 = null;
                        }
                        LJJIJIL.add(interfaceC147435qV4);
                        C63L c63l = (C63L) LJJJIL.LJ(C63L.class);
                        if (c63l != null) {
                            interfaceC147435qV5 = c63l.LIZ();
                        } else {
                            interfaceC147435qV5 = null;
                        }
                        LJJIJIL.add(interfaceC147435qV5);
                        InterfaceC139535dl interfaceC139535dl2 = (InterfaceC139535dl) LJJJIL.LJ(InterfaceC139535dl.class);
                        if (interfaceC139535dl2 != null && (LIZ = interfaceC139535dl2.LIZ()) != null) {
                            LJJIJIL.add(LIZ);
                        }
                    }
                    InterfaceC147355qN interfaceC147355qN = this.LLILZLL;
                    if (interfaceC147355qN != null) {
                        boolean LIZ3 = C147315qJ.LIZ(LLLIZZ, interfaceC147355qN, LJJIJIL);
                        if (C143125jY.LIZ()) {
                            if (!LIZ3) {
                                InterfaceC147355qN interfaceC147355qN2 = this.LLILZLL;
                                if (interfaceC147355qN2 != null) {
                                    if (!C147315qJ.LIZIZ(LLLIZZ, interfaceC147355qN2, LLJJIII())) {
                                        LIZ3 = false;
                                    }
                                } else {
                                    o.LJIJI("mVideoSizeProvider");
                                    throw null;
                                }
                            }
                            LIZ3 = true;
                        }
                        InterfaceC147355qN interfaceC147355qN3 = this.LLILZLL;
                        if (interfaceC147355qN3 != null) {
                            interfaceC147355qN3.LIZJ(LIZ3, true);
                            long currentTimeMillis = System.currentTimeMillis();
                            AlsLogicContainer LJJJIL2 = C44384HbQ.LJJJIL(LLJJIII());
                            if (LJJJIL2 != null && (interfaceC139535dl = (InterfaceC139535dl) LJJJIL2.LJ(InterfaceC139535dl.class)) != null) {
                                InterfaceC147355qN interfaceC147355qN4 = this.LLILZLL;
                                if (interfaceC147355qN4 != null) {
                                    VESize LLILZ = LLLIZZ.LLILZ();
                                    if (interfaceC147355qN4.LIZLLL() == interfaceC147355qN4.LJFF(true) && interfaceC147355qN4.LJI() == interfaceC147355qN4.LIZ(true)) {
                                        osz = new OSZ(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
                                    } else if (LIZ3) {
                                        osz = new OSZ(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
                                    } else {
                                        int LJFF = interfaceC147355qN4.LJFF(true);
                                        float LIZ4 = interfaceC147355qN4.LIZ(true);
                                        int i2 = LLILZ.width;
                                        osz = new OSZ(Integer.valueOf(i2), Integer.valueOf((int) (((i2 * 1.0f) / LJFF) * LIZ4)));
                                    }
                                    r3 = 0;
                                    C139545dm.LIZ(interfaceC139535dl, osz, null, 2);
                                } else {
                                    o.LJIJI("mVideoSizeProvider");
                                    throw null;
                                }
                            }
                            LLJJIII().LJIJJ(true);
                            C10K<C76800UCe> LLIIJLIL = LLJJIII().LLIIJLIL(LLLIZZ, this, r3);
                            VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                            if (videoPublishEditModel6 != null) {
                                if (!C42000Ge4.LJIILIIL(videoPublishEditModel6)) {
                                    c10k = LLJJIII().LLLFFI(LLLIZZ, this, r3);
                                } else {
                                    c10k = null;
                                }
                                C163096af c163096af = this.LLIIIZ;
                                if (c163096af == null || (LJIIIZ = c163096af.Kb0(this)) == null) {
                                    LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
                                }
                                if (LLIIJLIL.LJIILIIL() && ((c10k == null || c10k.LJIILIIL()) && (LJIIIZ == null || LJIIIZ.LJIILIIL()))) {
                                    LLJJIII().LJI();
                                    LLJJIII().LJIJJ(false);
                                    runnable.run();
                                    VideoPublishEditModel videoPublishEditModel7 = this.LJLLJ;
                                    if (videoPublishEditModel7 != null) {
                                        if (videoPublishEditModel7.creativeModel.postPageModel.isEnterFromEPDirectly) {
                                            InterfaceC147865rC interfaceC147865rC2 = this.LJZI;
                                            if (interfaceC147865rC2 != null) {
                                                interfaceC147865rC2.Dq();
                                            } else {
                                                o.LJIJI("editStickerApi");
                                                throw null;
                                            }
                                        }
                                        C10K LJIIIZ3 = C10K.LJIIIZ(null);
                                        o.LJIIIIZZ(LJIIIZ3, "forResult(null)");
                                        return LJIIIZ3;
                                    }
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                                C10K<Void> LJIJJ = C10K.LJIJJ(ORY.LJJIJLIJ(new C10K[]{LLIIJLIL, c10k, LJIIIZ}));
                                AgS21S0100100_2 agS21S0100100_2 = new AgS21S0100100_2(this, currentTimeMillis, 1);
                                C10C c10c = C10K.LJIIIIZZ;
                                C10K LJ = LJIJJ.LJ(agS21S0100100_2, c10c, null);
                                if (!LJ.LJIILIIL()) {
                                    if (z) {
                                        LLLLLJIL(1107);
                                    }
                                    LJ = C10K.LJIJJ(C47261Igj.LJJIJIIJI(LJ, C10K.LJII(Math.max(0L, 50 - (System.currentTimeMillis() - currentTimeMillis)))));
                                    LJ.getClass();
                                }
                                C10K LJ2 = LJ.LJ(new AgS24S0210000_2(z, this, runnable, 1), c10c, null);
                                o.LJIIIIZZ(LJ2, "fun justCompileStickers(…EXECUTOR)\n        }\n    }");
                                return LJ2;
                            }
                            o.LJIJI("mModel");
                            throw r3;
                        }
                        o.LJIJI("mVideoSizeProvider");
                        throw null;
                    }
                    o.LJIJI("mVideoSizeProvider");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("stickerChallengeManager");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLLILI(int i, boolean z) {
        InterfaceC145485nM interfaceC145485nM = this.LJLLI;
        if (interfaceC145485nM != null) {
            interfaceC145485nM.l0(i);
            interfaceC145485nM.Q9();
            interfaceC145485nM.LLIL();
            interfaceC145485nM.LJJLIIIJ(i);
            InterfaceC153045zY LLLIZZ = LLLIZZ();
            if (LLLIZZ != null) {
                InterfaceC147865rC interfaceC147865rC = this.LJZI;
                if (interfaceC147865rC != null) {
                    interfaceC147865rC.LLLLIIIILLL(new OSZ<>(Integer.valueOf(LLLIZZ.LLIZLLLIL()), Integer.valueOf(i)));
                    if (z) {
                        InterfaceC147865rC interfaceC147865rC2 = this.LJZI;
                        if (interfaceC147865rC2 != null) {
                            interfaceC147865rC2.LLZILL(i, true);
                        } else {
                            o.LJIJI("editStickerApi");
                            throw null;
                        }
                    }
                    InterfaceC147865rC interfaceC147865rC3 = this.LJZI;
                    if (interfaceC147865rC3 != null) {
                        interfaceC147865rC3.LLZIL();
                    } else {
                        o.LJIJI("editStickerApi");
                        throw null;
                    }
                } else {
                    o.LJIJI("editStickerApi");
                    throw null;
                }
            }
            InterfaceC145605nY interfaceC145605nY = this.LJLJLJ;
            if (interfaceC145605nY != null) {
                interfaceC145605nY.UJ();
                return;
            }
            return;
        }
        o.LJIJI("editEffectApi");
        throw null;
    }

    public final void LLLLL(boolean z, boolean z2) {
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            boolean z3 = videoPublishEditModel.autoEnhanceOn;
            if (z3 && videoPublishEditModel.creativeModel.editVideoEnhanceModel.useHdrV2) {
                InterfaceC146675pH interfaceC146675pH = this.LJLLILLLL;
                if (interfaceC146675pH != null) {
                    interfaceC146675pH.a00(z3, true);
                } else {
                    o.LJIJI("editAutoEnhanceApi");
                    throw null;
                }
            }
            C5LG c5lg = this.LLIILZL;
            if (c5lg != null) {
                c5lg.ej0(this, this.LLJJJJ, z, z2);
                return;
            }
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C6VC c6vc = this.LLILZ;
        if (c6vc != null) {
            c6vc.LIZIZ(new C6V4(0, new WXC() { // from class: X.5qF
                @Override // X.C6P6, X.C6V2
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    InterfaceC153275zv interfaceC153275zv;
                    LiveData<Boolean> n2;
                    boolean z = false;
                    if (C147295qH.this.findSceneByTag("EditStickerScene") != null && !(z = C147295qH.this.LLJJIII().LLLI()) && motionEvent != null) {
                        C147295qH c147295qH = C147295qH.this;
                        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
                        if (videoPublishEditModel != null) {
                            if (C44384HbQ.LJJIJLIJ(videoPublishEditModel) && !((Boolean) c147295qH.LLJJJIL.getValue()).booleanValue() && (interfaceC153275zv = c147295qH.LJLJJLL) != null && (n2 = interfaceC153275zv.n2()) != null && o.LJ(n2.getValue(), Boolean.TRUE) && c147295qH.LLJL) {
                                RectF LJIIZILJ = C1JI.LJIIZILJ(c147295qH.LLJI);
                                float f = LJIIZILJ.top;
                                Integer valueOf = Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT);
                                LJIIZILJ.top = f + O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                                LJIIZILJ.bottom -= O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                                if (C90193gN.LIZ()) {
                                    LJIIZILJ.left += O6R.LJJIIZ(C32151Nz.LJIIZILJ(110));
                                } else {
                                    LJIIZILJ.right -= O6R.LJJIIZ(C32151Nz.LJIIZILJ(110));
                                }
                                if (LJIIZILJ.contains(motionEvent.getRawX(), motionEvent.getRawY())) {
                                    VideoPublishEditModel videoPublishEditModel2 = C147295qH.this.LJLLJ;
                                    if (videoPublishEditModel2 != null) {
                                        if (!C44384HbQ.LJLLLLLL(videoPublishEditModel2)) {
                                            C147295qH.this.LLLIIII("tap_anywhere");
                                        }
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
                    }
                    return z;
                }
            }));
            C5L7.LIZIZ();
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    public static void LLLFFI(C147295qH c147295qH, boolean z, int i) {
        InterfaceC139535dl interfaceC139535dl;
        if ((i & 2) != 0) {
            z = false;
        }
        AlsLogicContainer LJJJIL = C44384HbQ.LJJJIL(c147295qH.LLJJIII());
        if (LJJJIL != null && (interfaceC139535dl = (InterfaceC139535dl) LJJJIL.LJ(InterfaceC139535dl.class)) != null) {
            C139545dm.LIZ(interfaceC139535dl, null, null, 3);
        }
        if (((Boolean) C147505qc.LIZ.getValue()).booleanValue()) {
            ((InterfaceC145815nt) c147295qH.LLILIL.LIZ(c147295qH, LLJLL[2])).ap("Click Advance Edit Page!");
        }
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            if ((C132385Hm.LJII(videoPublishEditModel) || z) && C90193gN.LIZ() && !C145835nv.LIZ()) {
                C5RO.LIZ(c147295qH.mActivity);
                if (!z) {
                    VideoPublishEditModel videoPublishEditModel2 = c147295qH.LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        C5QW.LJIILIIL(videoPublishEditModel2, true, false, false, false, false, 60);
                        return;
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                return;
            }
            VideoPublishEditModel videoPublishEditModel3 = c147295qH.LJLLJ;
            if (videoPublishEditModel3 != null) {
                if (C44384HbQ.LJJIIZI(videoPublishEditModel3) || z) {
                    c147295qH.LLL(z);
                    return;
                }
                if (C00F.LIZ(31744, 0, "studio_editor_pro", true) != 0 && C90193gN.LIZ() && !C145835nv.LIZ()) {
                    C5RO.LIZIZ(c147295qH.mActivity);
                }
                VideoPublishEditModel videoPublishEditModel4 = c147295qH.LJLLJ;
                if (videoPublishEditModel4 != null) {
                    if (C44384HbQ.LJLJL(videoPublishEditModel4) && c147295qH.LLIIZ != null) {
                        Context requireSceneContext = c147295qH.requireSceneContext();
                        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                        InterfaceC162426Za interfaceC162426Za = c147295qH.LLIIZ;
                        if (interfaceC162426Za != null) {
                            AqS35S0210000_2 aqS35S0210000_2 = new AqS35S0210000_2(c147295qH, (C147295qH) false, (boolean) null, (InterfaceC65784Pro<C76800UCe>) 2);
                            C26227ARb LIZ = Q7L.LIZ(requireSceneContext, R.string.rhj);
                            UC0.LIZJ(LIZ, new AqS133S0200000_2(interfaceC162426Za, aqS35S0210000_2, 1));
                            LIZ.LJI().LIZLLL();
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c147295qH.LLLIILIL(null, false);
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final StringBuilder LLLLLLIL(C147295qH c147295qH, C76732zl c76732zl, String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
            if ((commentVideoModel != null && commentVideoModel.isComment()) || c76732zl.element == 2) {
                i = R.string.dlk;
            } else {
                i = R.string.ru;
            }
            String string = c147295qH.requireSceneContext().getString(i, str);
            o.LJIIIIZZ(string, "requireSceneContext().ge…itleStringID, structName)");
            sb.append(string);
            sb.append(" ");
            return sb;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final String LLLLLLJ(C147295qH c147295qH, String str, int i) {
        String string = c147295qH.requireSceneContext().getString(i, QZZ.LIZIZ('@', str));
        o.LJIIIIZZ(string, "requireSceneContext().ge…ng(resId, \"@${userName}\")");
        String concat = string.concat(" ");
        o.LJIIIIZZ(concat, "titleBuilder.append(title).append(\" \").toString()");
        return concat;
    }

    public static final OSZ<Integer, Integer> LLLLLLLZIL(AVTextExtraStruct aVTextExtraStruct, String str, String str2) {
        if (aVTextExtraStruct != null) {
            return new OSZ<>(Integer.valueOf(aVTextExtraStruct.start), Integer.valueOf(aVTextExtraStruct.end));
        }
        int LJJLIIIJL = s.LJJLIIIJL(str, str2, 0, false, 6);
        return new OSZ<>(Integer.valueOf(LJJLIIIJL), Integer.valueOf(str2.length() + LJJLIIIJL));
    }

    @Override // X.C6F2
    public final void LLJJIJIIJIL(Runnable successCallback, boolean z, boolean z2) {
        o.LJIIIZ(successCallback, "successCallback");
        if (((Number) C42887GsN.LIZ.getValue()).intValue() != 0) {
            VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
            if (videoPublishEditModel != null) {
                C162496Zh.LIZIZ(videoPublishEditModel, LLJJIII());
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
        LLJJIJIL(successCallback, null, z, z2, false);
    }

    public final void LLLLIL(Intent intent, boolean z, boolean z2) {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (C78685UuP.LJJJZ(videoPublishEditModel.creativeModel.paidContentModel.getCollectionId())) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://paidcontent/series/post");
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    buildRoute.withParam("edit_model", (Parcelable) videoPublishEditModel2);
                    VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                    if (videoPublishEditModel3 != null) {
                        buildRoute.withParam("creative_model", videoPublishEditModel3.creativeModel);
                        buildRoute.withParam("is_from_publish", false);
                        VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                        if (videoPublishEditModel4 != null) {
                            buildRoute.withParam("collection_id", videoPublishEditModel4.creativeModel.paidContentModel.getCollectionId());
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                buildRoute.withParam("collection_cover_url", videoPublishEditModel5.creativeModel.paidContentModel.getCollectionCoverUrl());
                                VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                                if (videoPublishEditModel6 != null) {
                                    buildRoute.withParam("collection_name", videoPublishEditModel6.creativeModel.paidContentModel.getCollectionName());
                                    VideoPublishEditModel videoPublishEditModel7 = this.LJLLJ;
                                    if (videoPublishEditModel7 != null) {
                                        String entryPoint = videoPublishEditModel7.creativeModel.paidContentModel.getEntryPoint();
                                        if (entryPoint == null || entryPoint.length() == 0) {
                                            str = "feed";
                                        } else {
                                            VideoPublishEditModel videoPublishEditModel8 = this.LJLLJ;
                                            if (videoPublishEditModel8 != null) {
                                                str = videoPublishEditModel8.creativeModel.paidContentModel.getEntryPoint();
                                            } else {
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                        }
                                        buildRoute.withParam("entry_point", str);
                                        VideoPublishEditModel videoPublishEditModel9 = this.LJLLJ;
                                        if (videoPublishEditModel9 != null) {
                                            buildRoute.withParam("enter_from", videoPublishEditModel9.enterFrom);
                                            buildRoute.open();
                                            return;
                                        } else {
                                            o.LJIJI("mModel");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            VideoPublishEditModel videoPublishEditModel10 = this.LJLLJ;
            if (videoPublishEditModel10 != null) {
                ShoutOutsData shoutOutsData = videoPublishEditModel10.mShoutOutsData;
                if (shoutOutsData == null) {
                    Activity requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    C41384GMa.LJII(new GL2(requireActivity, intent, z, z2));
                    return;
                }
                if (!o.LJ(ShoutOutsData.MODE_CREATE, shoutOutsData.getShoutOutsMode())) {
                    String str2 = ShoutOutsData.MODE_EDIT;
                    VideoPublishEditModel videoPublishEditModel11 = this.LJLLJ;
                    if (videoPublishEditModel11 != null) {
                        if (!o.LJ(str2, videoPublishEditModel11.mShoutOutsData.getShoutOutsMode())) {
                            String str3 = ShoutOutsData.MODE_SEND;
                            VideoPublishEditModel videoPublishEditModel12 = this.LJLLJ;
                            if (videoPublishEditModel12 != null) {
                                if (o.LJ(str3, videoPublishEditModel12.mShoutOutsData.getShoutOutsMode())) {
                                    IShoutOutsService shoutOutsService = AVExternalServiceImpl.LIZ().shoutOutsService();
                                    Activity requireActivity2 = requireActivity();
                                    o.LJII(requireActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                    ActivityC45651qj activityC45651qj = (ActivityC45651qj) requireActivity2;
                                    VideoPublishEditModel videoPublishEditModel13 = this.LJLLJ;
                                    if (videoPublishEditModel13 != null) {
                                        shoutOutsService.publishShoutOuts(activityC45651qj, videoPublishEditModel13, LLLJL().mArguments);
                                        return;
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                IShoutOutsService shoutOutsService2 = AVExternalServiceImpl.LIZ().shoutOutsService();
                Activity requireActivity3 = requireActivity();
                o.LJIIIIZZ(requireActivity3, "requireActivity()");
                shoutOutsService2.startShoutoutsPublishActivity(requireActivity3, intent);
                return;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.C6F2, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.step("av_video_edit", "begin EditRootScene:onCreateView");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ccn, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.cor);
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        this.LLILZ = C78897Uxp.LJIILIIL(context, viewGroup2);
        C5L7.LIZIZ();
        this.LLJ = viewGroup.findViewById(R.id.cq3);
        this.LLJI = (C146695pJ) viewGroup.findViewById(R.id.cpk);
        this.LLJJ = SystemClock.elapsedRealtime() - elapsedRealtime;
        c44298Ha2.step("av_video_edit", "end EditRootScene:onCreateView");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && C1B8.LIZJ() && (((IVideoTrendingTopicService) this.LLJJIJIL.getValue()).LIZJ() || ((IVideoTrendingTopicService) this.LLJJIJIL.getValue()).LIZIZ())) {
            C78999UzT.LJFF(((IVideoTrendingTopicService) this.LLJJIJIL.getValue()).getTrendingTopicSetting().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(this, 19), new InterfaceC64592gB() { // from class: X.2O9
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C36922EeM.LJFF((Throwable) obj);
                }
            }), this.LLJJIJIIJIL);
        }
        return viewGroup;
    }

    public static final void LLLLLL(QaStruct qaStruct, C147295qH c147295qH, String str, int i) {
        if (qaStruct != null) {
            ArrayList arrayList = new ArrayList();
            String userName = qaStruct.getUserName();
            if (userName == null) {
                userName = "";
            }
            int i2 = 0;
            int LJJLIIIJL = s.LJJLIIIJL(str, userName, 0, false, 6) - 1;
            int i3 = LJJLIIIJL + 1;
            String userName2 = qaStruct.getUserName();
            if (userName2 != null) {
                i2 = userName2.length();
            }
            AVTextExtraStruct createQaStickerStruct = AVTextExtraStructHelper.createQaStickerStruct(LJJLIIIJL, i3 + i2, String.valueOf(qaStruct.getUserId()), i);
            C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().getClass();
            if (C40976G6i.LIZ()) {
                arrayList.add(AVTextExtraStructHelper.createQAStickerChainBoundaryStruct(str, i));
            }
            arrayList.add(createQaStickerStruct);
            C60903NvH.LJIIJJI().getPublishService().LJIJI();
            arrayList.addAll(GSL.LJIIIIZZ(str));
            C147335qL c147335qL = new C147335qL(str, arrayList);
            C60903NvH.LJIIJJI().getPublishService().LJIJI();
            VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
            if (videoPublishEditModel != null) {
                GSL.LJIIJ(videoPublishEditModel, c147335qL);
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
    }

    public final void LLLLIILLL(boolean z, final boolean z2, Runnable runnable, boolean z3) {
        float f;
        AVChallenge aVChallenge;
        boolean z4;
        final boolean z5;
        boolean z6;
        InterfaceC147345qM interfaceC147345qM;
        int LIZ;
        String str;
        String str2;
        String str3;
        AVTextExtraStruct aVTextExtraStruct;
        String str4;
        List<AVChallenge> challenges;
        if (this.LLJILJILJ) {
            H78.LIZJ("DoubleGoPublishActivity VEVideoPublishEditActivity");
            C142955jH.LIZ("DoubleGoPublishActivity VEVideoPublishEditActivity");
            H78.LIZJ("BlockErrorGoPublish");
            return;
        }
        this.LLJILJILJ = true;
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            InterfaceC142545ic LLLILZLLLI = LLLILZLLLI();
            InterfaceC153045zY LLLIZZ = LLLIZZ();
            if (LLLIZZ != null) {
                f = LLLIZZ.LLJJJ();
            } else {
                f = -1.0f;
            }
            H8F.LJJIJIIJI(videoPublishEditModel, LLLILZLLLI, f, "go_publish");
            final Intent intent = new Intent();
            ((InterfaceC145815nt) this.LLILIL.LIZ(this, LLJLL[2])).x30(intent, LLLIZZ(), this.LLJJJJLIIL.LLZZ());
            InterfaceC147455qX interfaceC147455qX = this.LLIIL;
            if (interfaceC147455qX != null) {
                interfaceC147455qX.hu0();
            }
            Bundle bundle = LLLJL().mArguments;
            if (bundle != null) {
                bundle.putInt("fromDraft", 0);
                bundle.putBoolean("fromTTEPEffectPreview", z3);
                intent.putExtras(bundle);
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel2.setMultiEditStickIds();
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    videoPublishEditModel3.setMultiEditBeautyMetadatas();
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                    if (videoPublishEditModel4 != null) {
                        videoPublishEditModel4.setMultiEditCameraLensInfo();
                        ArrayList arrayList = new ArrayList();
                        VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                        if (videoPublishEditModel5 != null) {
                            if (videoPublishEditModel5.challenges == null) {
                                C137965bE c137965bE = this.LLILZIL;
                                if (c137965bE != null) {
                                    if (!c137965bE.LIZIZ().getRecordStickerChallengeList().isEmpty()) {
                                        C137965bE c137965bE2 = this.LLILZIL;
                                        if (c137965bE2 != null) {
                                            arrayList.addAll(c137965bE2.LIZIZ().getRecordStickerChallengeList());
                                        } else {
                                            o.LJIJI("stickerChallengeManager");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("stickerChallengeManager");
                                    throw null;
                                }
                            }
                            if (((ArrayList) C41658GWo.LIZLLL().LIZ).size() > 0) {
                                arrayList.addAll(C41658GWo.LIZLLL().LIZ);
                            }
                            VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                            if (videoPublishEditModel6 != null) {
                                AudioEffectParam audioEffectParam = videoPublishEditModel6.veAudioEffectParam;
                                if (audioEffectParam != null) {
                                    aVChallenge = audioEffectParam.getChallenge();
                                    if (aVChallenge != null) {
                                        VideoPublishEditModel videoPublishEditModel7 = this.LJLLJ;
                                        if (videoPublishEditModel7 != null) {
                                            if (C44384HbQ.LJIILIIL(videoPublishEditModel7)) {
                                                VideoPublishEditModel videoPublishEditModel8 = this.LJLLJ;
                                                if (videoPublishEditModel8 != null) {
                                                    if (videoPublishEditModel8.hasNotAudioRecord()) {
                                                        VideoPublishEditModel videoPublishEditModel9 = this.LJLLJ;
                                                        if (videoPublishEditModel9 != null) {
                                                            C149905uU.LIZLLL(videoPublishEditModel9);
                                                        } else {
                                                            o.LJIJI("mModel");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("mModel");
                                                    throw null;
                                                }
                                            }
                                            arrayList.add(aVChallenge);
                                        } else {
                                            o.LJIJI("mModel");
                                            throw null;
                                        }
                                    }
                                } else {
                                    aVChallenge = null;
                                }
                                VideoPublishEditModel videoPublishEditModel10 = this.LJLLJ;
                                if (videoPublishEditModel10 != null) {
                                    AudioEffectParam audioEffectParam2 = videoPublishEditModel10.veAudioEffectParam;
                                    if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
                                        for (AVChallenge aVChallenge2 : challenges) {
                                            VideoPublishEditModel videoPublishEditModel11 = this.LJLLJ;
                                            if (videoPublishEditModel11 != null) {
                                                if (C44384HbQ.LJIILIIL(videoPublishEditModel11)) {
                                                    VideoPublishEditModel videoPublishEditModel12 = this.LJLLJ;
                                                    if (videoPublishEditModel12 != null) {
                                                        if (videoPublishEditModel12.hasNotAudioRecord()) {
                                                            VideoPublishEditModel videoPublishEditModel13 = this.LJLLJ;
                                                            if (videoPublishEditModel13 != null) {
                                                                C149905uU.LIZLLL(videoPublishEditModel13);
                                                            } else {
                                                                o.LJIJI("mModel");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                }
                                                arrayList.add(aVChallenge2);
                                            } else {
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                        }
                                    }
                                    VideoPublishEditModel videoPublishEditModel14 = this.LJLLJ;
                                    if (videoPublishEditModel14 != null) {
                                        List<AVChallenge> list = videoPublishEditModel14.challenges;
                                        if (list != null) {
                                            arrayList.addAll(list);
                                            C137965bE c137965bE3 = this.LLILZIL;
                                            if (c137965bE3 != null) {
                                                VideoPublishEditModel videoPublishEditModel15 = this.LJLLJ;
                                                if (videoPublishEditModel15 != null) {
                                                    List<AVChallenge> list2 = videoPublishEditModel15.challenges;
                                                    ArrayList LIZIZ = s1.LIZIZ(list2, "mModel.challenges");
                                                    for (AVChallenge aVChallenge3 : list2) {
                                                        String str5 = aVChallenge3.challengeName;
                                                        if (aVChallenge == null || (str4 = aVChallenge.challengeName) == null) {
                                                            str4 = "";
                                                        }
                                                        if (!o.LJ(str5, str4)) {
                                                            LIZIZ.add(aVChallenge3);
                                                        }
                                                    }
                                                    c137965bE3.LIZLLL(LIZIZ);
                                                } else {
                                                    o.LJIJI("mModel");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("stickerChallengeManager");
                                                throw null;
                                            }
                                        }
                                        VideoPublishEditModel videoPublishEditModel16 = this.LJLLJ;
                                        if (videoPublishEditModel16 != null) {
                                            C137965bE c137965bE4 = this.LLILZIL;
                                            if (c137965bE4 != null) {
                                                videoPublishEditModel16.stickerChallenge = c137965bE4.LIZIZ();
                                                InterfaceC147865rC interfaceC147865rC = this.LJZI;
                                                if (interfaceC147865rC != null) {
                                                    QaStruct hh0 = interfaceC147865rC.hh0();
                                                    C76732zl c76732zl = new C76732zl();
                                                    VideoPublishEditModel videoPublishEditModel17 = this.LJLLJ;
                                                    if (videoPublishEditModel17 != null) {
                                                        List<AVTextExtraStruct> structList = videoPublishEditModel17.getStructList();
                                                        if (structList != null) {
                                                            Iterator<AVTextExtraStruct> it = structList.iterator();
                                                            while (it.hasNext()) {
                                                                int i = it.next().subType;
                                                                if (i == 2 || i == 3) {
                                                                    c76732zl.element = i;
                                                                }
                                                            }
                                                        }
                                                        VideoPublishEditModel videoPublishEditModel18 = this.LJLLJ;
                                                        if (videoPublishEditModel18 != null) {
                                                            if (videoPublishEditModel18.commentVideoModel != null) {
                                                                Boolean bool = videoPublishEditModel18.isCommentDeleted;
                                                                o.LJIIIIZZ(bool, "mModel.isCommentDeleted");
                                                                if (bool.booleanValue()) {
                                                                    VideoPublishEditModel videoPublishEditModel19 = this.LJLLJ;
                                                                    if (videoPublishEditModel19 != null) {
                                                                        if (videoPublishEditModel19.commentVideoModel.isCommentFromPanel()) {
                                                                            if (c76732zl.element != 0) {
                                                                                LLLLLLL(this, c76732zl);
                                                                            }
                                                                            VideoPublishEditModel videoPublishEditModel20 = this.LJLLJ;
                                                                            if (videoPublishEditModel20 != null) {
                                                                                if (!videoPublishEditModel20.commentVideoModel.isCommentFromEditPanel()) {
                                                                                    VideoPublishEditModel videoPublishEditModel21 = this.LJLLJ;
                                                                                    if (videoPublishEditModel21 != null) {
                                                                                        videoPublishEditModel21.commentVideoModel = null;
                                                                                    } else {
                                                                                        o.LJIJI("mModel");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mModel");
                                                                                throw null;
                                                                            }
                                                                        } else if (c76732zl.element == 0) {
                                                                            InterfaceC147865rC interfaceC147865rC2 = this.LJZI;
                                                                            if (interfaceC147865rC2 != null) {
                                                                                if (interfaceC147865rC2.hh0() == null) {
                                                                                    LLLLLLLLL(this);
                                                                                    LLLLLJLJLL(this, c76732zl);
                                                                                } else {
                                                                                    LLLLLLL(this, c76732zl);
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("editStickerApi");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mModel");
                                                                        throw null;
                                                                    }
                                                                } else if (c76732zl.element != 0) {
                                                                    VideoPublishEditModel videoPublishEditModel22 = this.LJLLJ;
                                                                    if (videoPublishEditModel22 != null) {
                                                                        List<AVTextExtraStruct> structList2 = videoPublishEditModel22.getStructList();
                                                                        if (structList2 != null && (aVTextExtraStruct = (AVTextExtraStruct) ORZ.LJLLLL(structList2)) != null) {
                                                                            str3 = aVTextExtraStruct.userId;
                                                                        } else {
                                                                            str3 = null;
                                                                        }
                                                                        VideoPublishEditModel videoPublishEditModel23 = this.LJLLJ;
                                                                        if (videoPublishEditModel23 != null) {
                                                                            if (!o.LJ(str3, videoPublishEditModel23.commentVideoModel.getUserId())) {
                                                                                LLLLLLL(this, c76732zl);
                                                                                InterfaceC147865rC interfaceC147865rC3 = this.LJZI;
                                                                                if (interfaceC147865rC3 != null) {
                                                                                    if (interfaceC147865rC3.hh0() == null) {
                                                                                        LLLLLLLLL(this);
                                                                                        LLLLLJLJLL(this, c76732zl);
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("editStickerApi");
                                                                                    throw null;
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
                                                                    InterfaceC147865rC interfaceC147865rC4 = this.LJZI;
                                                                    if (interfaceC147865rC4 != null) {
                                                                        if (interfaceC147865rC4.hh0() == null) {
                                                                            LLLLLJLJLL(this, c76732zl);
                                                                        } else {
                                                                            LLLLLLL(this, c76732zl);
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("editStickerApi");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else if (c76732zl.element != 0) {
                                                                Boolean bool2 = videoPublishEditModel18.isCommentDeleted;
                                                                o.LJIIIIZZ(bool2, "mModel.isCommentDeleted");
                                                                if (bool2.booleanValue()) {
                                                                    LLLLLLL(this, c76732zl);
                                                                }
                                                            }
                                                            LLLLLLLLL(this);
                                                            InterfaceC147865rC interfaceC147865rC5 = this.LJZI;
                                                            if (interfaceC147865rC5 != null) {
                                                                if (interfaceC147865rC5.hh0() != null) {
                                                                    InterfaceC147865rC interfaceC147865rC6 = this.LJZI;
                                                                    if (interfaceC147865rC6 != null) {
                                                                        QaStruct hh02 = interfaceC147865rC6.hh0();
                                                                        if (hh02 == null || hh02.getQuestionId() == 0) {
                                                                            if (hh0 == null || (str = hh0.getUserName()) == null) {
                                                                                str = "";
                                                                            }
                                                                            LLLLLL(hh0, this, LLLLLLJ(this, str, R.string.pqh), 5);
                                                                        } else {
                                                                            if (hh0 == null || (str2 = hh0.getUserName()) == null) {
                                                                                str2 = "";
                                                                            }
                                                                            LLLLLL(hh0, this, LLLLLLJ(this, str2, R.string.pqg), 7);
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("editStickerApi");
                                                                        throw null;
                                                                    }
                                                                }
                                                                C127004ye c127004ye = LLJLILLLLZIIL;
                                                                InterfaceC142545ic LLLILZLLLI2 = LLLILZLLLI();
                                                                VideoPublishEditModel videoPublishEditModel24 = this.LJLLJ;
                                                                if (videoPublishEditModel24 != null) {
                                                                    c127004ye.getClass();
                                                                    C127004ye.LIZ(LLLILZLLLI2, videoPublishEditModel24);
                                                                    VideoPublishEditModel videoPublishEditModel25 = this.LJLLJ;
                                                                    if (videoPublishEditModel25 != null) {
                                                                        if (!videoPublishEditModel25.isMvThemeVideoType()) {
                                                                            VideoPublishEditModel videoPublishEditModel26 = this.LJLLJ;
                                                                            if (videoPublishEditModel26 != null) {
                                                                                if (!C79004UzY.LJJIIZI(videoPublishEditModel26.canvasVideoData) && !C1DG.LJIIIIZZ() && C1B8.LIZJ()) {
                                                                                    if (C143245jk.LIZ() && !C165146dy.LIZ()) {
                                                                                        C5S3 N40 = LLLILZLLLI().N40();
                                                                                        N40.getClass();
                                                                                        C83964WxM c83964WxM = C83964WxM.LIZ;
                                                                                        StringBuilder LIZ2 = X1D.LIZ();
                                                                                        LIZ2.append("audio fadeout || addAudioFadeoutFiltersAndReleaseEngine in Thread: ");
                                                                                        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                                                                                        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                                                                                        LIZ2.append(LLLLIIIILLL.getName());
                                                                                        c83964WxM.LIZ(X1D.LIZIZ(LIZ2));
                                                                                        N40.LIZJ = true;
                                                                                        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = N40.LJI;
                                                                                        if (vEEditorAutoStartStopArbiter != null) {
                                                                                            vEEditorAutoStartStopArbiter.LJLJLJ = true;
                                                                                        }
                                                                                        N40.LIZ.clear();
                                                                                        ((LinkedHashMap) N40.LIZIZ).clear();
                                                                                        long j = N40.LJII;
                                                                                        InterfaceC153045zY LIZIZ2 = N40.LIZIZ();
                                                                                        if (LIZIZ2 != null) {
                                                                                            long LIZ3 = N40.LIZ(LIZIZ2) - LIZIZ2.LJZL();
                                                                                            if (LIZ3 < N40.LJII) {
                                                                                                j = LIZ3;
                                                                                            }
                                                                                        }
                                                                                        StringBuilder LIZ4 = X1D.LIZ();
                                                                                        LIZ4.append("audio fadeout || delayedReleaseTime: ");
                                                                                        LIZ4.append(j);
                                                                                        c83964WxM.LIZ(X1D.LIZIZ(LIZ4));
                                                                                        InterfaceC153045zY LIZIZ3 = N40.LIZIZ();
                                                                                        if (LIZIZ3 != null) {
                                                                                            int LJZL = LIZIZ3.LJZL();
                                                                                            if (N40.LJII + LJZL < N40.LIZ(LIZIZ3)) {
                                                                                                LIZ = N40.LJII + LJZL;
                                                                                            } else {
                                                                                                LIZ = N40.LIZ(LIZIZ3);
                                                                                            }
                                                                                            C78841Uwv.LJJIIJZLJL("", LIZIZ3, new AqS13S0202000_2(LJZL, LIZ, LIZIZ3, N40, 0));
                                                                                        }
                                                                                        ARunnableS38S0100000_2 aRunnableS38S0100000_2 = new ARunnableS38S0100000_2(N40, 5);
                                                                                        N40.LIZLLL = aRunnableS38S0100000_2;
                                                                                        C43045Guv.LIZJ(j, aRunnableS38S0100000_2);
                                                                                    }
                                                                                    if (C165146dy.LIZ() && (interfaceC147345qM = this.LLIIIL) != null) {
                                                                                        FFL.LJIIIZ().getClass();
                                                                                        interfaceC147345qM.VF(Integer.valueOf(FFL.LJIIJ(31744, 1000, "creative_tools_edit_audio_fadeout_length", true)));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mModel");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        int y3 = LLJJ().y3();
                                                                        if (y3 > -1) {
                                                                            intent.putExtra("music_rec_type", y3);
                                                                        }
                                                                        VideoPublishEditModel videoPublishEditModel27 = this.LJLLJ;
                                                                        if (videoPublishEditModel27 != null) {
                                                                            videoPublishEditModel27.creativeModel.postPageModel.musicRecType = y3;
                                                                            VideoPublishEditModel newOne = VideoPublishEditModel.makeCopy(videoPublishEditModel27);
                                                                            C43587H8t.LIZJ(H83.LIZ(newOne), new C44224HXg(newOne), EnumC43590H8w.EDIT, EnumC43590H8w.PUBLISH);
                                                                            o.LJIIIIZZ(newOne, "newOne");
                                                                            H7R.LJJLIIJ(intent, newOne);
                                                                            StringBuilder LIZ5 = X1D.LIZ();
                                                                            LIZ5.append("GoPublishActivity from new edit page  newOne = ");
                                                                            LIZ5.append(newOne);
                                                                            C170666ms.LIZIZ(X1D.LIZIZ(LIZ5));
                                                                            intent.putExtra("is_from_sys_share", z);
                                                                            intent.putExtra("challenge", arrayList);
                                                                            intent.putExtra("enter_record_from_other_platform", z2);
                                                                            Bundle bundle2 = LLLJL().mArguments;
                                                                            if (bundle2 != null) {
                                                                                z4 = false;
                                                                                z5 = bundle2.getBoolean("extra_enter_from_live", false);
                                                                            } else {
                                                                                z4 = false;
                                                                                z5 = false;
                                                                            }
                                                                            intent.putExtra("extra_enter_from_live", z5);
                                                                            Bundle bundle3 = LLLJL().mArguments;
                                                                            if (bundle3 != null) {
                                                                                z6 = bundle3.getBoolean("edit_publish_session_end_together", z4);
                                                                            } else {
                                                                                z6 = false;
                                                                            }
                                                                            intent.putExtra("edit_publish_session_end_together", z6);
                                                                            runnable.run();
                                                                            G8G.LIZ.step("av_video_publish", "begin_start_publish");
                                                                            if (C138395bv.LIZ() && LLLIZZ() != null) {
                                                                                InterfaceC153045zY LLLIZZ2 = LLLIZZ();
                                                                                if (LLLIZZ2 != null) {
                                                                                    LLLIZZ2.LLLIL(new InterfaceC133845Nc() { // from class: X.5qP
                                                                                        @Override // X.InterfaceC133845Nc
                                                                                        public final void LIZ() {
                                                                                            C147295qH.this.LLLLIL(intent, z2, z5);
                                                                                        }

                                                                                        @Override // X.InterfaceC133845Nc
                                                                                        public final void LIZIZ() {
                                                                                            C147295qH.this.LLLLIL(intent, z2, z5);
                                                                                        }
                                                                                    });
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            LLLLIL(intent, z2, z5);
                                                                            return;
                                                                        }
                                                                        o.LJIJI("mModel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mModel");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mModel");
                                                                throw null;
                                                            }
                                                            o.LJIJI("editStickerApi");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mModel");
                                                    throw null;
                                                }
                                                o.LJIJI("editStickerApi");
                                                throw null;
                                            }
                                            o.LJIJI("stickerChallengeManager");
                                            throw null;
                                        }
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.InterfaceC145445nI
    public final void LLIIIZ(int i, int i2, boolean z, String path, int i3) {
        o.LJIIIZ(path, "path");
        LLLLLJIL(1115);
        ACallableS2S1112000_2 aCallableS2S1112000_2 = new ACallableS2S1112000_2(i, i2, this, path, z, 0);
        C10C c10c = C10K.LJIIIIZZ;
        C10K.LIZIZ(aCallableS2S1112000_2, c10c, null).LJ(new AgS0S1112000_2(i3, i, this, path, z, 0), c10c, null);
    }

    @Override // X.C6F2
    public final void LLJJIJIL(Runnable successCallback, Runnable runnable, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(successCallback, "successCallback");
        C63D c63d = LLJJIII().LLJI;
        if (c63d != null) {
            c63d.uO();
        }
        InterfaceC143855kj interfaceC143855kj = this.LLFFF;
        if (interfaceC143855kj != null) {
            interfaceC143855kj.Ba();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditRootScene -> nextStepCustom -> captions.Size = ");
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            LIZ.append(C78841Uwv.LJIIJJI(videoPublishEditModel));
            H78.LIZ(X1D.LIZIZ(LIZ));
            InterfaceC153045zY value = LLLILZLLLI().Kh().getValue();
            if (value != null) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.getPreviewInfo().setPreviewVideoLength(value.getDuration());
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
            if (videoPublishEditModel3 != null) {
                if (videoPublishEditModel3.mIsFromDraft && videoPublishEditModel3.isDraftMusicIllegal()) {
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLLJ;
                    if (videoPublishEditModel4 != null) {
                        if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel4.creativeModel.musicBuzModel) != null) {
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                videoPublishEditModel5.setDraftMusicIllegal(false);
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                VideoPublishEditModel videoPublishEditModel6 = this.LJLLJ;
                if (videoPublishEditModel6 != null) {
                    C152165y8.LJII(videoPublishEditModel6, new AqS22S0310000_2(this, successCallback, runnable, z3, 0));
                    return;
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLLIIIIL(final boolean z, final boolean z2, final Runnable successCallback, boolean z3, final Runnable runnable) {
        o.LJIIIZ(successCallback, "successCallback");
        G8G.LIZ.step("av_video_publish", "begin_compile_sticker");
        final C34K c34k = new C34K();
        c34k.element = true;
        LLLLIIL(new Runnable() { // from class: X.5ie
            public final /* synthetic */ boolean LJLJJI = false;

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    if (C34K.this.element) {
                        this.LLLILZLLLI().Iq0();
                        C34K.this.element = false;
                    }
                    this.LLLLJI(runnable, successCallback, this.LJLJJI, z, z2);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, z3);
        if (c34k.element) {
            LLLILZLLLI().Iq0();
            c34k.element = false;
        }
    }

    public final void LLLLJI(Runnable runnable, Runnable runnable2, boolean z, boolean z2, boolean z3) {
        VideoEditContainerScene videoEditContainerScene;
        if (runnable != null) {
            runnable.run();
            return;
        }
        if (z) {
            VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
            if (videoPublishEditModel != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[saveDraft]: save draft creation id = ");
                LIZ.append(videoPublishEditModel.getCreationId());
                C143195jf.LIZ(X1D.LIZIZ(LIZ));
                new C43542H7a("VEVideoPublishEditActivity");
                AwemeDraft LIZLLL = C43542H7a.LIZLLL(videoPublishEditModel);
                LIZLLL.lastEditTime = System.currentTimeMillis();
                InterfaceC147495qb storyService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                String creationId = videoPublishEditModel.getCreationId();
                o.LJIIIIZZ(creationId, "model.creationId");
                storyService.getClass();
                C55723Ltv.LIZIZ.LJIILJJIL().LJIIJ(creationId, true);
                C60903NvH.LJIIJJI().LJJJI().LJFF().LIZ(new NDG(LIZLLL, new GLI("VEVideoPublishEditActivity", 3)));
                WM7 wm7 = this.mParentScene;
                if ((wm7 instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) wm7) != null) {
                    videoEditContainerScene.LLLII();
                    return;
                }
                return;
            }
            o.LJIJI("mModel");
            throw null;
        }
        G8G.LIZ.step("av_video_publish", "compile_sticker_done");
        LLLLIILLL(z2, z3, runnable2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    public final void LLLILZ(boolean z, boolean z2, Runnable successCallback, Runnable runnable, boolean z3, Runnable runnable2) {
        o.LJIIIZ(successCallback, "successCallback");
        C68322mC c68322mC = new C68322mC();
        C76732zl c76732zl = new C76732zl();
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            c76732zl.element = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
            n nVar = new n();
            VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
            if (videoPublishEditModel2 != null) {
                OSZ LJJJJZI = C44384HbQ.LJJJJZI(videoPublishEditModel2, false);
                if (LJJJJZI != null) {
                    c68322mC.element = LJJJJZI.getFirst();
                    c76732zl.element = ((Number) LJJJJZI.getSecond()).intValue();
                }
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3 != null) {
                    PublishPreviewModel publishPreviewModel = videoPublishEditModel3.creativeModel.publishPreviewModel;
                    String str = (String) c68322mC.element;
                    if (str == null) {
                        str = "";
                    }
                    publishPreviewModel.getClass();
                    publishPreviewModel.firstFramePath = str;
                    LLLIIIIL(z, z2, successCallback, z3, new RunnableC142915jD(this, c68322mC, c76732zl, runnable2, nVar, runnable, z, z2, successCallback));
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }
}
