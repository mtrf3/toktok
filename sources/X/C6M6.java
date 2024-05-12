package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.AfS51S0200000_2;
import Y.AfS54S0100000_2;
import android.view.MotionEvent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback;
import com.bytedance.ies.nle.editor_jni.NLEApplyPatchShims;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaResourceManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESafetyApplyPatchToken;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestApi;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS0S0020000_2;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS1S1111000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS27S0100100_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6M6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6M6 extends AbstractC48231ut<AnonymousClass601, C6WM, C6MT, C6MV> implements InterfaceC135635Tz, AnonymousClass601 {
    public static final C6MO LLILL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLIZIL;
    public static final float LLILLJJLI;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public NLESafetyApplyPatchToken LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final C5H3 LLD;
    public NLEApplyPatchShims LLF;
    public final C5H3 LLFF;
    public InterfaceC92693kP LLFFF;
    public List<NLEModel> LLFII;
    public final NLEEditor LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public long LLII;
    public float LLIIII;
    public float LLIIIILZ;
    public boolean LLIIIJ;
    public Float LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public final C5H3 LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public Boolean LLIIZ;
    public boolean LLIL;
    public String LLILII;
    public boolean LLILIL;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.6MO] */
    static {
        TBT tbt = new TBT(C6M6.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65352Pkq.LIZ.getClass();
        LLILLIZIL = new InterfaceC74236TBo[]{tbt, new TBT(C6M6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new TBT(C6M6.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C6M6.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0), new TBT(C6M6.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C6M6.class, "newToolbarApiComponent", "getNewToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/optimize/EditToolbarApiComponent;", 0), new TBT(C6M6.class, "editRecommendEffectGuideApi", "getEditRecommendEffectGuideApi()Lcom/ss/android/ugc/gamora/editor/recommendeffect/RecommendEffectGuideApi;", 0), new TBT(C6M6.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(C6M6.class, "editCommonGuideHelper", "getEditCommonGuideHelper()Lcom/ss/android/ugc/gamora/editor/toolbar/EditCommonGuideHelper;", 0), new TBT(C6M6.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0)};
        LLILL = new Object() { // from class: X.6MO
        };
        LLILLJJLI = C32151Nz.LJIIZILJ(104);
    }

    private final String LLILZLL() {
        BDDateFormat bDDateFormat = new BDDateFormat("LLLL");
        long currentTimeMillis = System.currentTimeMillis();
        Locale countryLocale = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCountryLocale();
        o.LJIIIIZZ(countryLocale, "get().getService(IAVSett…class.java).countryLocale");
        return bDDateFormat.LIZIZ(currentTimeMillis, countryLocale);
    }

    private final InterfaceC44717Hgn LLJ() {
        return (InterfaceC44717Hgn) this.LL.LIZ(this, LLILLIZIL[9]);
    }

    private final InterfaceC146235oZ LLJJ() {
        return (InterfaceC146235oZ) this.LJLLLL.LIZ(this, LLILLIZIL[3]);
    }

    private final InterfaceC147865rC LLJJIJI() {
        return (InterfaceC147865rC) this.LJZI.LIZ(this, LLILLIZIL[7]);
    }

    private final InterfaceC152085y0 LLJJIJIL() {
        return (InterfaceC152085y0) this.LJLLI.LIZ(this, LLILLIZIL[0]);
    }

    private final C6MS LLJLIL() {
        return (C6MS) this.LJLZ.LIZ(this, LLILLIZIL[5]);
    }

    private final InterfaceC153275zv LLLFFI() {
        return (InterfaceC153275zv) this.LJLLLLLL.LIZ(this, LLILLIZIL[4]);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6MT> LJJLIIIJJI() {
        return new AqS152S0100000_2(this, 448);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6MV> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 450);
    }

    public final void LLF() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLESafetyApplyPatchToken nLESafetyApplyPatchToken = this.LJLLILLLL;
        if (nLESafetyApplyPatchToken != null) {
            NLEMediaPublicJniJNI.NLESafetyApplyPatchToken_cancel(nLESafetyApplyPatchToken.LIZ, nLESafetyApplyPatchToken);
        }
        this.LLILII = "";
        LLLJ(false, true);
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            g0.LJIIJJI(nLEEditor, true, false, 2);
        }
        LLJJI().getEffectList().clear();
        LJJZZI(C6MG.LJLIL);
    }

    public final void LLIFFJFJJ() {
        if (this.LLIILII) {
            return;
        }
        this.LLIILII = true;
        if (C140015eX.LIZ()) {
            LLLIIIL(LLLFZ().LIZJ(EnumC159096Mf.RECOMMEND_EFFECT));
        } else {
            String LIZLLL = C41930Gcw.LIZLLL();
            if (LIZLLL == null) {
                LIZLLL = "";
            }
            LLLIIIL(LIZLLL);
        }
        LJJZZI(C6MC.LJLIL);
    }

    public final RecommendEffectItem LLIIZ() {
        return new RecommendEffectItem(null, null, false, 0.0f, null, null, null, 0, true, 255, null);
    }

    public final Runnable LLIZ() {
        return (Runnable) this.LLIIJI.getValue();
    }

    public final C156906Du LLJI() {
        return (C156906Du) this.LJZL.LIZ(this, LLILLIZIL[8]);
    }

    public final VideoPublishEditModel LLJJI() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LLILLIZIL[2]);
    }

    public final C6E4 LLJJIII() {
        return (C6E4) this.LJZ.LIZ(this, LLILLIZIL[6]);
    }

    public final SafeHandler LLJJJIL() {
        return (SafeHandler) this.LLIIIZ.getValue();
    }

    public final float LLJJL() {
        return ((Number) this.LLIIJLIL.getValue()).floatValue();
    }

    public final XF5 LLJZIJLIL() {
        return (XF5) this.LLFF.getValue();
    }

    public final InterfaceC148965sy LLLFZ() {
        return (InterfaceC148965sy) this.LLD.getValue();
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLLJ.LIZ(this, LLILLIZIL[1]);
    }

    public final void LLIILZL() {
        C122034qd LJJI;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null) {
            return;
        }
        C132385Hm.LIZ(LJJI, LLJJI(), Ll0());
        LLJJI().getEffectList().addAll(Ll0().YA());
    }

    public final int LLJLLIL() {
        Integer num;
        if (!WY() || (num = LJJLJ().LIZIZ) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.AnonymousClass601
    public boolean WY() {
        Iterator<RecommendEffectItem> it = LJJLJ().LIZLLL.iterator();
        while (it.hasNext()) {
            if (!it.next().LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        MutableLiveData<Boolean> hP;
        MutableLiveData<Boolean> N4;
        LiveEvent<C76800UCe> tb;
        LiveData<C6MP> T20;
        NLEMediaResourceManager nLEMediaResourceManager;
        super.onCreate();
        XF5 LLJZIJLIL = LLJZIJLIL();
        C5N8.LIZIZ = LLJZIJLIL;
        if (C5N8.LIZ) {
            long NLEMediaResourceManager_obtain = NLEMediaPublicJniJNI.NLEMediaResourceManager_obtain();
            if (NLEMediaResourceManager_obtain == 0) {
                nLEMediaResourceManager = null;
            } else {
                nLEMediaResourceManager = new NLEMediaResourceManager(NLEMediaResourceManager_obtain, false);
            }
            NLEMediaPublicJniJNI.NLEMediaResourceManager_setDelegate(nLEMediaResourceManager.LIZ, nLEMediaResourceManager, NLEResourceManager.getCPtr(LLJZIJLIL), LLJZIJLIL);
        }
        LLJJ().Yn0(false);
        Ll0().wf0().observe(this, new AObserverS70S0100000_2(this, 98));
        LLLFFI().n2().observe(this, new AObjectS84S0100000_2(this, 142));
        LLLFFI().qa().observe(this, new AObjectS84S0100000_2(this, 143));
        C6MS LLJLIL = LLJLIL();
        if (LLJLIL != null && (T20 = LLJLIL.T20()) != null) {
            T20.observe(this, new AObjectS84S0100000_2(this, 144));
        }
        InterfaceC44717Hgn LLJ = LLJ();
        if (LLJ != null && (tb = LLJ.tb()) != null) {
            tb.LIZLLL(this, new AObjectS84S0100000_2(this, 145));
        }
        InterfaceC147865rC LLJJIJI = LLJJIJI();
        if (LLJJIJI != null && (N4 = LLJJIJI.N4()) != null) {
            N4.observe(this, new AObjectS84S0100000_2(this, 146));
        }
        InterfaceC147865rC LLJJIJI2 = LLJJIJI();
        if (LLJJIJI2 != null && (hP = LLJJIJI2.hP()) != null) {
            hP.observe(this, new AObjectS84S0100000_2(this, 147));
        }
        LLJJIJIL().LIZIZ(new C6V4(50, new C6P6() { // from class: X.6M8
            @Override // X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                C6M6 c6m6 = C6M6.this;
                if (!c6m6.LLIIL) {
                    return false;
                }
                c6m6.LLIIII = 0.0f;
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLI(C82537WaL c82537WaL) {
                C6M6 c6m6 = C6M6.this;
                if (c6m6.LLIIL && c82537WaL != null && c6m6.LJJLJ().LIZ) {
                    float f = C6M6.this.LLIIII;
                    if (f == 0.0f) {
                        return false;
                    }
                    float LJI = f - c82537WaL.LJI();
                    C6M6.this.LLIIII = c82537WaL.LJI();
                    C6M6 c6m62 = C6M6.this;
                    c6m62.LJJZZI(new AqS5S0100001_2(c6m62, LJI, 4));
                }
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final void LJLJJI(C82537WaL c82537WaL) {
                C6M6 c6m6 = C6M6.this;
                if (!c6m6.LLIIL || c82537WaL == null) {
                    return;
                }
                if (c6m6.LJJLJ().LIZ) {
                    C6M6.this.LJJZZI(C6MA.LJLIL);
                }
                C6M6.this.LLIIII = 0.0f;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onDown(MotionEvent motionEvent) {
                float f;
                C6M6 c6m6 = C6M6.this;
                if (!c6m6.LLIIL) {
                    return false;
                }
                if (motionEvent != null) {
                    f = motionEvent.getX();
                } else {
                    f = 0.0f;
                }
                c6m6.LLIIIILZ = f;
                C6M6.this.LLJJJIL().removeCallbacks(C6M6.this.LLIZ());
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C6M6 c6m6 = C6M6.this;
                if (!c6m6.LLIIL || c6m6.LJJLJ().LJI || !C6M6.this.LJJLJ().LIZ) {
                    return false;
                }
                C6M6.this.show(false);
                C77357UXp.LJJJIL(C6M6.this.LLJLLIL(), C6M6.this.LLJJI(), C6MB.TAP_SCREEN.getValue());
                return true;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                C6M6 c6m6 = C6M6.this;
                if (!c6m6.LLIIL) {
                    return this instanceof C1547765p;
                }
                if (c6m6.LJJLJ().LIZ) {
                    C6M6.this.LLIIII = f;
                }
                return this instanceof C1547765p;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i;
                if (motionEvent == null || motionEvent2 == null || !C6M6.this.LLIIL) {
                    return false;
                }
                float x = motionEvent.getX() - motionEvent2.getX();
                float y = motionEvent.getY() - motionEvent2.getY();
                if (Math.abs(x) >= Math.abs(y) && x > 0.0f) {
                    i = 1;
                } else {
                    if (Math.abs(x) < Math.abs(y) || x >= 0.0f) {
                        return false;
                    }
                    i = -1;
                }
                if (C6M6.this.LJJLJ().LIZ) {
                    C6M6.this.LJJZZI(new AqS27S0001000_2(i, 17));
                } else {
                    C6M6 c6m6 = C6M6.this;
                    c6m6.LLIFFJFJJ = true;
                    C6E4 LLJJIII = c6m6.LLJJIII();
                    if (LLJJIII != null) {
                        LLJJIII.re0();
                    }
                    C6M6 c6m62 = C6M6.this;
                    if (c6m62.LLI) {
                        c6m62.LLII = System.currentTimeMillis();
                        C2ND.LIZ(new AqS103S0101000_2(C6M6.this, i, 6), 50L);
                        C6M6.this.LLI = false;
                    } else {
                        c6m62.LJJZZI(new AqS27S0001000_2(i, 18));
                    }
                    if (!C6M6.this.WY()) {
                        C6M6.this.LLIFFJFJJ();
                    }
                    C6M6.this.show(true);
                }
                return true;
            }
        }));
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    private final void LJZI(NLESegment nLESegment) {
        String LIZJ;
        String LIZJ2;
        NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            NLELokiResourceProtocol LIZIZ = NLELokiResourceProtocol.LIZIZ(LIZLLL.LJ().LIZLLL());
            EnumC159056Mb swigToEnum = EnumC159056Mb.swigToEnum(NLEEditorJniJNI.NLELokiResourceProtocol_type_get(LIZIZ.LIZJ, LIZIZ));
            if (swigToEnum != null) {
                int i = C159046Ma.LIZ[swigToEnum.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        LIZJ2 = NLEEditorJniJNI.NLELokiResourceProtocol_resourceId_get(LIZIZ.LIZJ, LIZIZ);
                    }
                } else {
                    LIZJ2 = LIZIZ.LIZJ();
                }
                if (LIZJ2 != null) {
                    LIZLLL.LJ().LJIIJ(LIZJ2);
                }
            }
        }
        NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(nLESegment);
        if (LJIIIIZZ != null) {
            NLELokiResourceProtocol LIZIZ2 = NLELokiResourceProtocol.LIZIZ(LJIIIIZZ.LJ().LIZLLL());
            EnumC159056Mb swigToEnum2 = EnumC159056Mb.swigToEnum(NLEEditorJniJNI.NLELokiResourceProtocol_type_get(LIZIZ2.LIZJ, LIZIZ2));
            if (swigToEnum2 == null) {
                return;
            }
            int i2 = C159046Ma.LIZ[swigToEnum2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                } else {
                    LIZJ = NLEEditorJniJNI.NLELokiResourceProtocol_resourceId_get(LIZIZ2.LIZJ, LIZIZ2);
                }
            } else {
                LIZJ = LIZIZ2.LIZJ();
            }
            if (LIZJ == null) {
                return;
            }
            LJIIIIZZ.LJ().LJIIJ(LIZJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(LLJJI().creativeModel.musicBuzModel);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r21 = r0.getMusicId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r21 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r0 = LLJJI().infoStickerModel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r22 = r0.getNotEmptyInfoStickerIds();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r22 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r4 = LLJJI().getEditEffectListStr();
        r3 = LLJJI().mStickerID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = LLJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = LLJJI().multiEditVideoRecordData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r0 = r0.curMultiEditVideoRecordData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r6 = r0.segmentDataList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r14 = new java.util.ArrayList(X.C32I.LJJL(r6, 10));
        r8 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r8.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        r7 = r8.next();
        r6 = X.X1D.LIZ();
        r6.append(r7.width);
        r6.append('*');
        r6.append(r7.height);
        r14.add(X.X1D.LIZIZ(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        r0 = Ll0().WS();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
    
        r1 = r0.LJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        if ((r1 instanceof X.C133765Mu) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        r1 = (X.C133765Mu) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
    
        r0 = r1.LJFF().getMainTrack();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r1 = r0.LJIILL();
        r15 = new java.util.ArrayList(X.C32I.LJJL(r1, 10));
        r7 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
    
        if (r7.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        r5 = r7.next();
        r15.add(java.lang.Float.valueOf((float) (r5.getMeasuredEndTime() - r5.getMeasuredStartTime())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r0 = LLJJI().mShootWay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        r17 = X.H7R.LJIIIIZZ(LLJJI());
        r18 = X.H7R.LJIIIZ(LLJJI());
        r19 = java.lang.String.valueOf(X.H8F.LJIIL(LLJJI()));
        r5 = defpackage.g0.LJJIIJ(LLJJI());
        r20 = X.C78977Uz7.LJJJJJ(((java.lang.Number) r5.getFirst()).intValue(), ((java.lang.Number) r5.getSecond()).intValue());
        kotlin.jvm.internal.o.LJIIIIZZ(r4, "editEffectListStr");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a1, code lost:
    
        return new com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams(0, r29, r11, r12, null, r14, r15, r16, r17, r18, r19, r20, r21, r22, r4, r3, r2, 17, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a2, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
    
        r15 = X.C61878OQg.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r14 = X.C61878OQg.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
    
        r9 = X.C137045Zk.LIZLLL(r0).iterator();
        r8 = 0;
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
    
        if (r9.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
    
        r7 = r9.next();
        r6 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        if (r8 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        r7 = r7;
        r5 = X.X1D.LIZ();
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r8 != (r10.size() - 1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        r0 = r7.getTextStr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        r5.append(r0);
        r2 = X.X1D.LIZIZ(r5);
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r2 = X.X1D.LIZ();
        r2.append(r7.getTextStr());
        r2.append(',');
        r0 = X.X1D.LIZIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a5, code lost:
    
        X.C47261Igj.LJJJJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0041, code lost:
    
        r22 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0031, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0015, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r12 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams LLILZIL(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6M6.LLILZIL(java.lang.String):com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams");
    }

    public final int LLFFF(float f) {
        return (int) ((LLJJL() + C32151Nz.LJIIZILJ(60)) * (f / (C143205jg.LJ() / 2.0f)));
    }

    public final void LLILL(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.LLFZ.LJI(it.next());
            List<NLEModel> list2 = this.LLFII;
            NLEModel LJ = this.LLFZ.LJ();
            o.LJIIIIZZ(LJ, "toolNLEEditor.model");
            list2.add(LJ);
        }
    }

    public final void LLLI(final String str) {
        XCT xct = LLJZIJLIL().LIZ;
        if (xct != null) {
            xct.LJFF(C47261Igj.LJII(str), null, new XDR<EffectListResponse>() { // from class: X.6Mc
                @Override // X.XDR
                public final void onSuccess(EffectListResponse effectListResponse) {
                    EffectListResponse response = effectListResponse;
                    o.LJIIIZ(response, "response");
                    if (!response.getEffect_list().isEmpty()) {
                        Effect effect = (Effect) ListProtector.get(response.getEffect_list(), 0);
                        C6M6.this.LLJZIJLIL().LIZIZ.put(str, effect);
                        XCT xct2 = C6M6.this.LLJZIJLIL().LIZ;
                        if (xct2 != null) {
                            xct2.LIZLLL(effect, true, true, true, null);
                        }
                    }
                }

                @Override // X.XDR
                public final /* bridge */ /* synthetic */ void preProcess(EffectListResponse effectListResponse) {
                }

                @Override // X.XDR
                public final void onFail(EffectListResponse effectListResponse, C84418XBe exception) {
                    o.LJIIIZ(exception, "exception");
                }
            });
        }
    }

    public final void LLLIIIL(String str) {
        String str2;
        String str3;
        C77357UXp.LJJIL("edit_recommend_effect_request_net_info", C51029K0z.LJJIIZI(new OSZ("net_type", Integer.valueOf(IJV.LIZIZ()))));
        if (C78685UuP.LJJJZ(str)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        OSZ osz = new OSZ("status_code", str2);
        int i = 0;
        C77357UXp.LJJIL("edit_recommend_effect_request_tos_url", C113554cx.LJJLIIIIJ(osz));
        if (str == null || str.length() == 0) {
            i = 1;
        }
        C43882HKc.LIZLLL(i, "edit_recommend_effect_request_tos_url", null, true);
        long currentTimeMillis = System.currentTimeMillis();
        RecommendEffectRequestApi recommendEffectRequestApi = new RecommendEffectRequestApi();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        RecommendEffectRequestParams params = LLILZIL(str3);
        C6M7 c6m7 = new C6M7(this, str, currentTimeMillis);
        AqS27S0100100_2 aqS27S0100100_2 = new AqS27S0100100_2(this, currentTimeMillis, 2);
        o.LJIIIZ(params, "params");
        ((RecommendEffectRequestApi.Api) recommendEffectRequestApi.LIZ.getValue()).getRecommendEffects(params.returnSize, params.tosUrl, params.algorithmKey, params.resolutionList, params.videoLengthList, params.shootWay, params.contentSource, params.materialType, params.isMultiContent, params.mixType, params.musicId, params.stickerIdList, params.effectIdList, params.propIdList, params.textList, params.sdkVersion, params.appVersion).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS51S0200000_2(c6m7, aqS27S0100100_2, 1), new AfS54S0100000_2(recommendEffectRequestApi, aqS27S0100100_2, 21));
    }

    @Override // X.AnonymousClass601
    public void ht(boolean z) {
        this.LLIIL = z;
        if (z) {
            if (WY() && o.LJ(this.LLIIZ, Boolean.TRUE) && !LJJLJ().LJI) {
                LJJZZI(C6ME.LJLIL);
                return;
            }
            return;
        }
        if (!WY() || !o.LJ(this.LLIIZ, Boolean.TRUE) || !LJJLJ().LJI) {
            return;
        }
        LJJZZI(C6MF.LJLIL);
    }

    @Override // X.AnonymousClass601
    public void rw(String type) {
        o.LJIIIZ(type, "type");
        if (LJJLJ().LIZ) {
            LLJJJIL().removeCallbacks(LLIZ());
            show(false);
            C77357UXp.LJJJIL(LLJLLIL(), LLJJI(), type);
        }
    }

    @Override // X.AnonymousClass601
    public void show(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 28));
        if (z) {
            VideoPublishEditModel model = LLJJI();
            o.LJIIIZ(model, "model");
            C77357UXp.LJJIL("effects_scroll_wheel_icon_fade_in", C77357UXp.LJIIIIZZ(model));
            C42315Gj9.LIZIZ("tool_recommend_effect_edit_page", C52467KiV.LIZIZ(), -1L);
            return;
        }
        C42315Gj9.LIZJ("tool_recommend_effect_edit_page");
    }

    @Override // X.AnonymousClass601
    public void yC(int[] pos) {
        float LJIIZILJ;
        o.LJIIIZ(pos, "pos");
        if (!this.LLILIL && pos.length > 1) {
            this.LLILIL = true;
            if (C143205jg.LIZLLL() <= C7MY.LIZIZ(667)) {
                LJIIZILJ = C32151Nz.LJIIZILJ(16);
            } else {
                LJIIZILJ = C32151Nz.LJIIZILJ(40);
            }
            Float valueOf = Float.valueOf((pos[1] - LLILLJJLI) - LJIIZILJ);
            this.LLIIIL = valueOf;
            if (valueOf != null) {
                LJJZZI(new AqS0S0000001_2(valueOf.floatValue(), 3));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6M6(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC146235oZ.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), C6MS.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), C6E4.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), C156906Du.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC44717Hgn.class, null);
        this.LLD = C221108m2.LIZIZ(C146515p1.LJLIL);
        this.LLFF = C221108m2.LIZIZ(C6MN.LJLIL);
        this.LLFII = new ArrayList();
        this.LLFZ = new NLEEditor();
        this.LLI = true;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 449));
        this.LLIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 447));
        this.LLIIJLIL = C221108m2.LIZIZ(C146505p0.LJLIL);
        this.LLIIL = true;
        this.LLIL = true;
        this.LLILII = "";
    }

    public final void LLIIIL(int i, String str) {
        NLEModel LJJ;
        VecNLETrackSPtr tracks;
        NLEResourceNode LJ;
        String str2;
        String str3;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null && (tracks = LJJ.getTracks()) != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                EnumC123864ta LJIIZILJ = next.LJIIZILJ();
                EnumC123864ta enumC123864ta = EnumC123864ta.EFFECT;
                if (LJIIZILJ == enumC123864ta && o.LJ(next.getUUID(), ((NLEModel) ListProtector.get(this.LLFII, i - 1)).getTracks().get(0).getUUID())) {
                    next.setExtra("EffectTrackType", "NORMAL");
                    C124574uj.LJJLIIIJILLIZJL(next, "video_effect");
                    next.LJIL(enumC123864ta);
                    for (NLETrackSlot nLETrackSlot : ORZ.LLILLL(next.LJIILLIIL(), 1)) {
                        if (nLETrackSlot.getEndTime() == -2) {
                            nLETrackSlot.setEndTime(LJJ.getMainTrack().getMeasuredEndTime());
                        }
                        nLETrackSlot.setExtra("extra_video_effect_source", String.valueOf(EnumC126794yJ.EDIT_RECOMMEND.getValue()));
                        NLESegment LJI = nLETrackSlot.LJI();
                        if (LJI != null) {
                            LJZI(LJI);
                            LJI.setExtra("nleExtraEffectType", CardStruct.IStatusCode.DEFAULT);
                            int[] LIZ = C170236mB.LIZ();
                            LJI.setExtra("nleExtraEffectSelectedColor", String.valueOf(LIZ[i % LIZ.length]));
                            LJI.setExtra("nleExtraEffectKey", str);
                            LJI.setExtra("original_effect_order", String.valueOf(C122364rA.LIZ(LJJ) + 1));
                            NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(LJI);
                            if (LIZLLL != null) {
                                NLEResourceNode LJ2 = LIZLLL.LJ();
                                if (LJ2 != null) {
                                    Effect effect = (Effect) ((LinkedHashMap) LLJZIJLIL().LIZIZ).get(str);
                                    if (effect != null) {
                                        str3 = effect.getResource_id();
                                    } else {
                                        str3 = null;
                                    }
                                    LJ2.setExtra("biz_res_id", C134305Ow.LIZ(str3, C139905eM.LIZ("normal_effect")));
                                }
                                OSZ osz = (OSZ) ((LinkedHashMap) LLJZIJLIL().LIZJ).get(str);
                                if (osz != null) {
                                    boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
                                    boolean booleanValue2 = ((Boolean) osz.getSecond()).booleanValue();
                                    m mVar = new m();
                                    if (booleanValue) {
                                        mVar.LJJIIZ("info_effect_time", LLILZLL());
                                    }
                                    if (booleanValue2) {
                                        mVar.LJJIIZ("info_effect_location", ((RecommendEffectItem) ListProtector.get(LJJLJ().LIZLLL, i)).locationCity);
                                    }
                                    NLEEditorJniJNI.NLESegmentEffect_setJsonParam(LIZLLL.LIZJ, LIZLLL, mVar.toString());
                                }
                            }
                            NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(LJI);
                            if (LJIIIIZZ != null && (LJ = LJIIIIZZ.LJ()) != null) {
                                Effect effect2 = (Effect) ((LinkedHashMap) LLJZIJLIL().LIZIZ).get(str);
                                if (effect2 != null) {
                                    str2 = effect2.getResource_id();
                                } else {
                                    str2 = null;
                                }
                                LJ.setExtra("biz_res_id", C134305Ow.LIZ(str2, C139905eM.LIZ("normal_effect")));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LLLJ(boolean z, boolean z2) {
        LJJZZI(new AqS0S0020000_2(z, z2, 1));
    }

    public static /* synthetic */ void LLLILZLLLI(C6M6 c6m6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c6m6.LLLIIIL(str);
    }

    public final void LJLZ(final String str, final int i, final String str2, final boolean z) {
        InterfaceC153045zY value;
        C122034qd LJJI;
        NLEModel nLEModel;
        C122034qd LJJI2;
        NLEEditor nLEEditor;
        List LJJIII;
        if (i > this.LLFII.size() || (value = Ll0().Kh().getValue()) == null || (LJJI = C17N.LJJI(value)) == null || LJJI.LJIIJ == null) {
            return;
        }
        InterfaceC153045zY value2 = Ll0().Kh().getValue();
        NLESafetyApplyPatchToken nLESafetyApplyPatchToken = null;
        if (value2 != null) {
            nLEModel = C17N.LJJ(value2);
        } else {
            nLEModel = null;
        }
        NLEApplyPatchShims nLEApplyPatchShims = new NLEApplyPatchShims(nLEModel);
        this.LLF = nLEApplyPatchShims;
        long NLEApplyPatchShims_rebindNLEModel = NLEMediaPublicJniJNI.NLEApplyPatchShims_rebindNLEModel(nLEApplyPatchShims.LIZ, nLEApplyPatchShims, NLEModel.getCPtr(nLEModel), nLEModel);
        if (NLEApplyPatchShims_rebindNLEModel != 0) {
            new NLEModel(NLEApplyPatchShims_rebindNLEModel, true);
        }
        LJJZZI(C6MD.LJLIL);
        if (nLEModel != null && (LJJIII = C17J.LJJIII(nLEModel)) != null) {
            Iterator it = LJJIII.iterator();
            while (it.hasNext()) {
                nLEModel.removeTrack((NLETrack) it.next());
            }
        }
        InterfaceC153045zY value3 = Ll0().Kh().getValue();
        if (value3 != null && (LJJI2 = C17N.LJJI(value3)) != null && (nLEEditor = LJJI2.LJIIJ) != null) {
            g0.LJIIJJI(nLEEditor, true, false, 2);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.LLIIZ = Boolean.TRUE;
        this.LLILII = str;
        NLESafetyApplyPatchToken nLESafetyApplyPatchToken2 = this.LJLLILLLL;
        if (nLESafetyApplyPatchToken2 != null) {
            NLEMediaPublicJniJNI.NLESafetyApplyPatchToken_cancel(nLESafetyApplyPatchToken2.LIZ, nLESafetyApplyPatchToken2);
        }
        INLEApplyPatchCallback iNLEApplyPatchCallback = new INLEApplyPatchCallback() { // from class: X.6M9
            @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
            public final void onProgress(NLEModel nLEModel2, float f) {
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
            public final void onSuccess(NLEModel toApplyModel) {
                o.LJIIIZ(toApplyModel, "toApplyModel");
                C6M6 c6m6 = C6M6.this;
                c6m6.LLIIZ = Boolean.FALSE;
                C6QQ.LIZ(new AqS1S1111000_2(c6m6, i, str, z, 0));
                C77357UXp.LJJIZ(str, "", i, 0, Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                JSONObject jSONObject = new JSONObject();
                String str3 = str;
                long j = currentTimeMillis;
                jSONObject.put("effect_id", str3);
                jSONObject.put("durationMs", (int) (System.currentTimeMillis() - j));
                C43882HKc.LIZLLL(0, "edit_recommend_effect_apply_info", jSONObject, true);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
            public final void onError(NLEModel nLEModel2, String str3) {
                C122034qd LJJI3;
                NLEEditor nLEEditor2;
                String str4 = str;
                int i2 = i;
                if (str3 == null) {
                    str3 = "";
                }
                C77357UXp.LJJIZ(str4, str3, i2, 1, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("effect_id", str);
                C43882HKc.LIZLLL(1, "edit_recommend_effect_apply_info", jSONObject, true);
                C6M6 c6m6 = C6M6.this;
                if (c6m6.LLIL && o.LJ(c6m6.LLIIZ, Boolean.TRUE)) {
                    C6M6 c6m62 = C6M6.this;
                    c6m62.LLIL = false;
                    c6m62.LJLZ(str, i, str2, z);
                } else {
                    InterfaceC153045zY value4 = C6M6.this.Ll0().Kh().getValue();
                    if (value4 == null || (LJJI3 = C17N.LJJI(value4)) == null || (nLEEditor2 = LJJI3.LJIIJ) == null) {
                        return;
                    }
                    g0.LJIIJJI(nLEEditor2, true, false, 2);
                }
            }
        };
        NLEApplyPatchShims nLEApplyPatchShims2 = this.LLF;
        if (nLEApplyPatchShims2 != null) {
            NLEModel nLEModel2 = (NLEModel) ListProtector.get(this.LLFII, i - 1);
            long NLEApplyPatchShims_applyNLEModel__SWIG_0 = NLEMediaPublicJniJNI.NLEApplyPatchShims_applyNLEModel__SWIG_0(nLEApplyPatchShims2.LIZ, nLEApplyPatchShims2, NLEModel.getCPtr(nLEModel2), nLEModel2, INLEApplyPatchCallback.getCPtr(iNLEApplyPatchCallback), iNLEApplyPatchCallback);
            if (NLEApplyPatchShims_applyNLEModel__SWIG_0 != 0) {
                nLESafetyApplyPatchToken = new NLESafetyApplyPatchToken(NLEApplyPatchShims_applyNLEModel__SWIG_0);
            }
        }
        this.LJLLILLLL = nLESafetyApplyPatchToken;
        iNLEApplyPatchCallback.delete();
    }

    public static /* synthetic */ void LLLJIL(C6M6 c6m6, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c6m6.LLLJ(z, z2);
    }
}
