package X;

import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AqS0S0130000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5LF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LF extends AbstractC41331jl<InterfaceC136115Vv, C132225Gw, C132075Gh> implements InterfaceC136115Vv, InterfaceC135635Tz {
    public static final C5LM LLIFFJFJJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final WMH LJLJI;
    public final C82622Wbi LJLJJI;
    public final int LJLJJL;
    public final C29901Fi<C76800UCe> LJLJJLL;
    public final LiveEvent<C76800UCe> LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final C40871j1<Boolean> LJLJLLL;
    public final C0IB<Boolean> LJLL;
    public final C29901Fi<C76800UCe> LJLLI;
    public final C29901Fi<C76800UCe> LJLLILLLL;
    public final C5H3 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public C132045Ge LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public boolean LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final InterfaceC65784Pro<C132225Gw> LLFZ;
    public final InterfaceC65784Pro<C132075Gh> LLI;

    public final void LLJ() {
        LLJJ(true);
        LLF().pj(LLIFFJFJJ());
    }

    static {
        TBT tbt = new TBT(C5LF.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, new TBT(C5LF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C5LF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new TBT(C5LF.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(C5LF.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new TBT(C5LF.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/adapters/EditorProAdapterApiComponent;", 0), new TBT(C5LF.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new TBT(C5LF.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C5LF.class, "audioCopyRightDistributeApi", "getAudioCopyRightDistributeApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AudioCopyRightDistributeApi;", 0), new TBT(C5LF.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLIFFJFJJ = new C5LM();
    }

    private final void LJLIIL() {
        C122034qd c122034qd;
        if (!this.LJLJI.isAdded(LLIILZL())) {
            InterfaceC153045zY value = Ll0().Kh().getValue();
            if (value != null) {
                c122034qd = C17N.LJJI(value);
            } else {
                c122034qd = null;
            }
            if (c122034qd != null) {
                EditorProScene LLIILZL = LLIILZL();
                InterfaceC126684y8 interfaceC126684y8 = c122034qd.LJIIJJI;
                SurfaceView value2 = Ll0().D50().getValue();
                if (value2 != null) {
                    LLIILZL.bindNLESessionHolder(new C51Z(interfaceC126684y8, value2));
                    this.LJLJI.add(this.LJLJJL, LLIILZL(), "EditorProScene");
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

    private final View LJLLILLLL() {
        return (View) this.LLFFF.getValue();
    }

    private final InterfaceC142515iZ LJLLL() {
        return (InterfaceC142515iZ) this.LJZ.LIZ(this, LLII[4]);
    }

    private final C5LG LLF() {
        return (C5LG) this.LJZI.LIZ(this, LLII[5]);
    }

    private final int LLIFFJFJJ() {
        return ((Number) this.LLFII.getValue()).intValue();
    }

    private final VideoPublishEditModel LLIIIL() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LLII[1]);
    }

    private final C5LK LLILL() {
        return (C5LK) this.LJLJLJ.LIZ(this, LLII[0]);
    }

    private final boolean LLILZLL() {
        C145885o0 c145885o0 = C145885o0.LIZ;
        VideoPublishEditModel LLIIIL = LLIIIL();
        c145885o0.getClass();
        if (!C145885o0.LIZIZ(LLIIIL)) {
            return false;
        }
        C132045Ge c132045Ge = this.LJLZ;
        if (c132045Ge != null && c132045Ge.getEffectMultiTrackMode()) {
            return false;
        }
        C132045Ge c132045Ge2 = this.LJLZ;
        if (c132045Ge2 != null && c132045Ge2.isFromText()) {
            return false;
        }
        return true;
    }

    private final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLLLL.LIZ(this, LLII[2]);
    }

    public final C5LI LJLJLJ() {
        return (C5LI) this.LLD.LIZ(this, LLII[8]);
    }

    public final InterfaceC147865rC LJLZ() {
        return (InterfaceC147865rC) this.LJLLLLLL.LIZ(this, LLII[3]);
    }

    public final InterfaceC153275zv LJZI() {
        return (InterfaceC153275zv) this.LL.LIZ(this, LLII[7]);
    }

    public final EditorProScene LLIILZL() {
        return (EditorProScene) this.LJLLJ.getValue();
    }

    public final InterfaceC143855kj LLIIZ() {
        return (InterfaceC143855kj) this.LJZL.LIZ(this, LLII[6]);
    }

    public final void LLJI() {
        this.LJLJJLL.LJII(C76800UCe.LIZ);
    }

    public final void Ru() {
        this.LJLLILLLL.LJII(C76800UCe.LIZ);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LLF.LIZ(this, LLII[9]);
    }

    @Override // X.InterfaceC136115Vv
    public boolean isShowing() {
        return this.LJLJI.isShowing(LLIILZL());
    }

    private final int LLFFF() {
        int i;
        int i2 = C135125Sa.LIZ().getInt("control_view_height", -1);
        if (i2 == -1) {
            EditorProScene.Companion.getClass();
            i2 = EditorProScene.FUNCTION_BAR_HEIGHT + C132085Gi.LIZ() + EditorProScene.CONSOLE_CONTAINER_HEIGHT;
            i = C151885xg.LJZI;
        } else {
            i = C151885xg.LJZI;
        }
        return i2 + i;
    }

    private final int LLILZIL() {
        int LIZIZ;
        View LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL == null || (LIZIZ = LJLLILLLL.getHeight()) == 0) {
            LIZIZ = C81184Vtc.LIZIZ(getActivity());
        }
        return (LIZIZ - LLIFFJFJJ()) - LLFFF();
    }

    @Override // X.InterfaceC136115Vv
    public boolean Jj0() {
        return LJJLJ().LIZJ;
    }

    public final void LLIZ() {
        LJLZ().Xp0();
    }

    @Override // X.InterfaceC136115Vv
    public void mt0() {
        boolean z;
        C133765Mu c133765Mu;
        C122034qd LJI;
        String str;
        if (LLIIIL().getEditorProModel().getFromEditorProEntranceInAlbum() && !H7R.LJJJI(LLIIIL())) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC153045zY value = Ll0().Kh().getValue();
        AVMusic aVMusic = null;
        if (!(value instanceof C133765Mu) || (c133765Mu = (C133765Mu) value) == null || (LJI = c133765Mu.LJI()) == null) {
            return;
        }
        LJI.LJIIJJI.V8().pause();
        InterfaceC145625na interfaceC145625na = new InterfaceC145625na() { // from class: X.5LH
            @Override // X.InterfaceC145625na
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC145625na
            public final boolean LJJJIL() {
                return false;
            }

            @Override // X.InterfaceC145625na
            public final boolean LJJIJ() {
                return C5LF.this.LLIILZL().getUpdateFromOuter();
            }
        };
        C5LK LLILL = LLILL();
        if (LLILL != null) {
            LLILL.IJ(interfaceC145625na);
        }
        C132045Ge c132045Ge = new C132045Ge();
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(LLIIIL());
        if (makeCopy.infoStickerModel == null) {
            makeCopy.infoStickerModel = new InfoStickerModel(makeCopy.draftDir());
        }
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJII(LJI.LJIIJ.LJ());
        nLEEditor.LIZIZ();
        nLEEditor.LIZJ();
        makeCopy.nleData = nLEEditor.LJIIIIZZ();
        c132045Ge.setEditModel(makeCopy);
        c132045Ge.setEffectMultiTrackMode(C132385Hm.LJIIIIZZ);
        Bundle t10 = LLF().t10();
        if (t10 != null) {
            str = t10.getString("editor_pro_anchor_type");
        } else {
            str = null;
        }
        c132045Ge.setEditorProAnchorType(str);
        if (z) {
            c132045Ge.setEnterFrom("enter_from_album_editor_pro_entrance");
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LLIIIL().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            aVMusic = extractAVMusic.m156clone();
        }
        C132385Hm.LIZLLL = aVMusic;
        LLJJIJIL(LLIILZL(), c132045Ge);
        LLIILZL().renderNLEData();
        LLIILZL().markUpdateFromOuter();
    }

    @Override // X.InterfaceC136115Vv
    public boolean ob0() {
        return LLIILZL().isAnimOutFinish();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        String str;
        boolean z;
        C132045Ge c132045Ge;
        Serializable serializable;
        VideoPublishEditModel videoPublishEditModel;
        super.onCreate();
        LJLLL().nl0(this);
        CreativeModel creativeModel = null;
        EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJIIIIZZ(this.LJLJI, null, null, 6).get(EditEffectVideoModel.class);
        boolean z2 = false;
        if (editEffectVideoModel.LJLJJLL == null) {
            editEffectVideoModel.LJLJJLL = new C135625Ty(getActivity(), this);
        }
        Ll0().Kj0().observe(this, new AObserverS70S0100000_2(this, 165));
        Bundle t10 = LLF().t10();
        if (t10 != null) {
            str = t10.getString("editor_pro_anchor_type");
        } else {
            str = null;
        }
        if (LLIIIL().getEditorProModel().getFromEditorProEntranceInAlbum() && !H7R.LJJJI(LLIIIL())) {
            z = true;
        } else {
            z = false;
        }
        Bundle IV = LLF().IV();
        if (IV != null && IV.containsKey("editor_pro_init_data")) {
            z2 = true;
        }
        if ((!C78685UuP.LJJJZ(str) && !z2 && !z) || this.LJLJI.isAdded(LLIILZL())) {
            return;
        }
        C5QW.LIZ = System.currentTimeMillis();
        C5QW.LJJJIL();
        if (z2) {
            Bundle IV2 = LLF().IV();
            if (IV2 != null) {
                serializable = IV2.getSerializable("editor_pro_init_data");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C132045Ge) || (c132045Ge = (C132045Ge) serializable) == null) {
                c132045Ge = new C132045Ge();
            }
            if (IV2 != null) {
                videoPublishEditModel = (VideoPublishEditModel) IV2.getParcelable("editor_pro_edit_model");
            } else {
                videoPublishEditModel = null;
            }
            c132045Ge.setEditModel(videoPublishEditModel);
            VideoPublishEditModel editModel = c132045Ge.getEditModel();
            if (editModel != null) {
                if (IV2 != null) {
                    creativeModel = (CreativeModel) IV2.getParcelable("editor_pro_creative_model");
                }
                editModel.creativeModel = creativeModel;
            }
            c132045Ge.setRestoreFromSavedInstanceState(true);
        } else {
            c132045Ge = new C132045Ge();
            VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(LLIIIL());
            if (makeCopy.infoStickerModel == null) {
                makeCopy.infoStickerModel = new InfoStickerModel(makeCopy.draftDir());
            }
            c132045Ge.setEditModel(makeCopy);
            c132045Ge.setEditorProAnchorType(str);
            if (z) {
                c132045Ge.setEnterFrom("enter_from_album_editor_pro_entrance");
            }
        }
        LLJJIJIL(LLIILZL(), c132045Ge);
        LJLIIL();
        LJJZZI(C132535Ib.LJLIL);
        Ll0().wf0().observe(this, new AObserverS66S0200000_2(this, c132045Ge, 13));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJLLL().nl0(null);
    }

    @Override // X.InterfaceC136115Vv
    public LiveEvent<C76800UCe> Ix() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C132225Gw> LJJLIIIJJI() {
        return this.LLFZ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C132075Gh> LJJLIIIJJIZ() {
        return this.LLI;
    }

    @Override // X.InterfaceC136115Vv
    public C29901Fi<C76800UCe> em0() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC136115Vv
    public LiveEvent<C76800UCe> id() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC136115Vv
    public C0IB<Boolean> r50() {
        return this.LJLL;
    }

    private final void LLJJIJI(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 38));
        C2ND.LIZ(new AqS152S0100000_2(this, 597), 250L);
    }

    public final void LLJJ(boolean z) {
        int i;
        C140335f3 LIZIZ;
        int LLFFF;
        int LLIFFJFJJ2;
        int i2;
        if (z) {
            if (this.LLFF) {
                LLFFF = (LLFFF() - C6IB.LIZLLL(getActivity())) + LLIFFJFJJ();
            } else {
                LLFFF = LLFFF();
            }
            if (this.LLFF) {
                LLIFFJFJJ2 = C6IB.LIZLLL(getActivity());
            } else {
                LLIFFJFJJ2 = LLIFFJFJJ();
            }
            Integer LJI = C79045V0n.LJI(R.attr.ca, getActivity());
            if (LJI != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            int LLILZIL = LLILZIL();
            AnonymousClass668.LIZIZ().LIZ();
            LIZIZ = C140345f4.LIZIZ(i2, LLIFFJFJJ2, LLFFF, LLILZIL, false, false, 960);
            LIZIZ.LJFF = 250L;
            LIZIZ.LJIIIZ = new SJI();
            if (LLILZLL()) {
                LLIIIL().getEditorProModel().setFromEditorPageBottom(true);
            }
        } else {
            Integer LJI2 = C79045V0n.LJI(R.attr.ca, getActivity());
            if (LJI2 != null) {
                i = LJI2.intValue();
            } else {
                i = 0;
            }
            int LLIFFJFJJ3 = LLIFFJFJJ();
            int LLFFF2 = LLFFF();
            int LLILZIL2 = LLILZIL();
            AnonymousClass668.LIZIZ().LIZ();
            LIZIZ = C140345f4.LIZIZ(i, LLIFFJFJJ3, LLFFF2, LLILZIL2, false, false, 960);
        }
        LIZIZ.LJIIIIZZ = z;
        LJLZ().Dq();
        LJLZ().Vl();
        Ll0().oF(LIZIZ);
    }

    public final void LLJJI(EditorProCancelData editorProCancelData) {
        LLF().kj0(editorProCancelData, false);
    }

    @Override // X.InterfaceC136115Vv
    public void onSaveInstanceState(Bundle outState) {
        C132045Ge c132045Ge;
        Parcelable parcelable;
        o.LJIIIZ(outState, "outState");
        if (!isShowing() || (c132045Ge = this.LJLZ) == null) {
            return;
        }
        outState.putSerializable("editor_pro_init_data", c132045Ge);
        outState.putParcelable("editor_pro_edit_model", c132045Ge.getEditModel());
        VideoPublishEditModel editModel = c132045Ge.getEditModel();
        if (editModel != null && (parcelable = editModel.creativeModel) != null) {
            outState.putParcelable("editor_pro_creative_model", parcelable);
        }
    }

    private final void LLJJIJIL(EditorProScene editorProScene, C132045Ge c132045Ge) {
        editorProScene.updateInitData(c132045Ge);
        this.LJLZ = c132045Ge;
    }

    public final void LLJJIII(EditorProSaveData editorProSaveData, boolean z) {
        LLF().kj0(editorProSaveData, z);
    }

    public C5LF(WMH parentScene, C82622Wbi diContainer, int i) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = parentScene;
        this.LJLJJI = diContainer;
        this.LJLJJL = i;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJJLL = c29901Fi;
        this.LJLJL = c29901Fi;
        this.LJLJLJ = UCI.LJII(getDiContainer(), C5LK.class, null);
        C40871j1<Boolean> c40871j1 = new C40871j1<>(Boolean.FALSE);
        this.LJLJLLL = c40871j1;
        this.LJLL = c40871j1;
        this.LJLLI = new C29901Fi<>();
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 595));
        this.LJLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), C5LG.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LLD = UCI.LJII(getDiContainer(), C5LI.class, null);
        this.LLF = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LLFFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 593));
        this.LLFII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 594));
        this.LLFZ = C5I3.LJLIL;
        this.LLI = new AqS152S0100000_2(this, 596);
    }

    @Override // X.InterfaceC136115Vv
    public void Qq0(C132045Ge data, boolean z, boolean z2) {
        o.LJIIIZ(data, "data");
        C5QW.LIZIZ = System.currentTimeMillis();
        this.LLFF = o.LJ(data.getEnterFrom(), "enter_from_now_edit");
        LLJJIJIL(LLIILZL(), data);
        LJLIIL();
        H78.LJI("EditorProComponent show EditorProScene begin");
        this.LJLJI.show(LLIILZL());
        H78.LJI("EditorProComponent show EditorProScene end");
        LLIILZL().dispatchShow();
        if (z) {
            LLJJIJI(true);
        }
        this.LJLJLLL.LJI(Boolean.TRUE);
    }

    public final void LJLJJL(boolean z, boolean z2, boolean z3, boolean z4) {
        int LLFFF;
        int LLIFFJFJJ2;
        int i = 0;
        if (z4) {
            LLJJIJI(false);
        }
        LLIIIL().creativeModel.postPageModel.isEnterFromEPDirectly = false;
        if (this.LLFF) {
            LLFFF = (LLFFF() - C6IB.LIZLLL(getActivity())) + LLIFFJFJJ();
        } else {
            LLFFF = LLFFF();
        }
        if (this.LLFF) {
            LLIFFJFJJ2 = C6IB.LIZLLL(getActivity());
        } else {
            LLIFFJFJJ2 = LLIFFJFJJ();
        }
        Integer LJI = C79045V0n.LJI(R.attr.ca, getActivity());
        if (LJI != null) {
            i = LJI.intValue();
        }
        int LLILZIL = LLILZIL();
        AnonymousClass668.LIZIZ().LIZ();
        C140335f3 LIZ = C140345f4.LIZ(i, LLIFFJFJJ2, LLFFF, LLILZIL);
        LIZ.LJI = Boolean.TRUE;
        LIZ.LJFF = 250L;
        LIZ.LJIIIZ = new SJI();
        LIZ.LJIIIIZZ = z4;
        LJLZ().AX();
        LIZ.LJII = new AqS0S0130000_2(z, this, z2, z3, 1);
        Ll0().oF(LIZ);
        this.LJLJLLL.LJI(Boolean.FALSE);
        LLF().Uo(LLIFFJFJJ());
    }

    public static /* synthetic */ void LJLJJLL(C5LF c5lf, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = true;
        }
        c5lf.LJLJJL(z, z2, z3, z4);
    }
}
