package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS5S0201000_2;
import Y.AgS107S0200000_2;
import Y.AgS120S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.673, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass673 extends WM7 implements InterfaceC143795kd, InterfaceC1547265k, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public InterfaceC152085y0 LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82631Wbr LJLJLLL;
    public final C82632Wbs LJLL;
    public ARunnableS5S0201000_2 LJLLI;
    public ToolSafeHandler LJLLILLLL;
    public FrameLayout LJLLJ;
    public final MutableLiveData<Boolean> LJLLL;
    public InterfaceC1549866k<View> LJLLLL;
    public final C1548866a LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        TBT tbt = new TBT(AnonymousClass673.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AnonymousClass673.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "editPollStickerApi", "getEditPollStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/poll/EditPollStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "publishButtonVisibility", "getPublishButtonVisibility()Lcom/ss/android/ugc/gamora/editor/LighteningBottomPublishButtonVisibility;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass673.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    public final EditCommentStickerViewModel LLJILJILJ() {
        return (EditCommentStickerViewModel) this.LJLJJL.getValue();
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LJZI[4]);
    }

    public final C1556669a LLJJI() {
        return (C1556669a) this.LJLZ.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJZI[3]);
    }

    public final void LJJ() {
        LLJJI().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        C164846dU mainBusinessContext = LLJJ().getMainBusinessContext();
        EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_EDIT;
        List<InteractStickerStruct> LJI = C164826dS.LJI(mainBusinessContext, 2, enumC164816dR);
        if (LJI == null || LJI.isEmpty() || LLJJ().commentVideoModel == null) {
            List<InteractStickerStruct> LJI2 = C164826dS.LJI(LLJJ().getMainBusinessContext(), 5, enumC164816dR);
            if (LJI2 == null || LJI2.isEmpty() || LLJJ().commentVideoModel == null) {
                return;
            }
            LLJJI().LJJIL(LLJJ().commentVideoModel, (InteractStickerStruct) ListProtector.get(LJI2, 0));
            EditCommentStickerViewModel LLJILJILJ = LLJILJILJ();
            if (LLJILJILJ == null) {
                return;
            }
            LLJILJILJ.setState(C1550066m.LJLIL);
            return;
        }
        LLJJI().LJJIL(LLJJ().commentVideoModel, (InteractStickerStruct) ListProtector.get(LJI, 0));
        EditCommentStickerViewModel LLJILJILJ2 = LLJILJILJ();
        if (LLJILJILJ2 != null) {
            LLJILJILJ2.setState(C1550066m.LJLIL);
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJZ.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ToolSafeHandler toolSafeHandler = this.LJLLILLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLI;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.removeCallbacks(aRunnableS5S0201000_2);
                return;
            } else {
                o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ToolSafeHandler toolSafeHandler = this.LJLLILLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLI;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.postDelayed(aRunnableS5S0201000_2, 200L);
                return;
            } else {
                o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public AnonymousClass673(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLJI = UCI.LJI(c82622Wbi, InterfaceC147905rG.class, null);
        this.LJLJJI = UCI.LJI(c82622Wbi, InterfaceC139655dx.class, null);
        UCI.LJI(c82622Wbi, C63R.class, null);
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 413));
        this.LJLJJLL = UCI.LJI(c82622Wbi, InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, C137965bE.class, null);
        this.LJLJLLL = UCI.LJII(c82622Wbi, C143115jX.class, null);
        this.LJLL = UCI.LJI(c82622Wbi, InterfaceC147865rC.class, null);
        this.LJLLL = new MutableLiveData<>();
        this.LJLLLLLL = new C1548866a(LLJJ());
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 415));
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 414));
    }

    public final void LLJJIII(boolean z) {
        LLJJI().LJLJI = z;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        LiveData liveData;
        super.onActivityCreated(bundle);
        EditCommentStickerViewModel LLJILJILJ = LLJILJILJ();
        if (LLJILJILJ != null) {
            C73297Sph.LJIIJJI(this, LLJILJILJ, new TBT() { // from class: X.676
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditCommentStickerState) obj).getHideHelpBoxEvent();
                }
            }, new AqS184S0100000_2(this, 35));
        }
        EditCommentStickerViewModel LLJILJILJ2 = LLJILJILJ();
        if (LLJILJILJ2 != null && (liveData = (LiveData) LLJILJILJ2.LJLJLJ.getValue()) != null) {
            liveData.observe(this, new AObserverS70S0100000_2(this, 96));
        }
        EditCommentStickerViewModel LLJILJILJ3 = LLJILJILJ();
        if (LLJILJILJ3 != null && (mutableLiveData = LLJILJILJ3.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS70S0100000_2(this, 97));
        }
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 100));
        C82632Wbs c82632Wbs = this.LJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJZI;
        ((InterfaceC147865rC) c82632Wbs.LIZ(this, interfaceC74236TBoArr[7])).Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 213));
        this.LJLLL.observe(this, new AObserverS70S0100000_2(this, 131));
        EditCommentStickerViewModel LLJILJILJ4 = LLJILJILJ();
        if (LLJILJILJ4 != null) {
            C73297Sph.LJIIJJI(this, LLJILJILJ4, new TBT() { // from class: X.65i
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditCommentStickerState) obj).getRemoveCommentStickerEvent();
                }
            }, new AqS184S0100000_2(this, 50));
        }
        LLJJI().LJLLILLLL = new C6BO() { // from class: X.66l
            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
            }

            @Override // X.C6BO
            public final void LIZ() {
                AnonymousClass673.this.LLJJ().isCommentDeleted = Boolean.FALSE;
                EditCommentStickerViewModel LLJILJILJ5 = AnonymousClass673.this.LLJILJILJ();
                if (LLJILJILJ5 != null) {
                    LLJILJILJ5.setState(C1550066m.LJLIL);
                }
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                if (AnonymousClass673.this.LLJJI().LJIILLIIL()) {
                    if (AnonymousClass673.this.LLJJ().commentVideoModel.isCommentFromPanel()) {
                        AnonymousClass673.this.LJLLL.setValue(Boolean.TRUE);
                    }
                    AnonymousClass673 anonymousClass673 = AnonymousClass673.this;
                    ((C137965bE) anonymousClass673.LJLJLJ.LIZ(anonymousClass673, AnonymousClass673.LJZI[5])).LIZJ(AnonymousClass673.this.LLJJI().LLIFFJFJJ);
                    AnonymousClass673.this.LLJJ().isCommentDeleted = Boolean.TRUE;
                    EditCommentStickerViewModel LLJILJILJ5 = AnonymousClass673.this.LLJILJILJ();
                    if (LLJILJILJ5 != null) {
                        LLJILJILJ5.setState(C1546965h.LJLIL);
                    }
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("shoot_way", "comment_reply");
                    c145995oB.LJI("sticker_type", "comment_reply");
                    GXR.LIZ("prop_delete", c145995oB.LIZ);
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                AnonymousClass673.this.LJLLLLLL.LIZJ(4);
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                AnonymousClass673 anonymousClass673;
                EditCommentStickerViewModel LLJILJILJ5;
                EditCommentStickerState Hv0;
                AnonymousClass673 anonymousClass6732 = AnonymousClass673.this;
                C82632Wbs c82632Wbs2 = anonymousClass6732.LJLJI;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr2 = AnonymousClass673.LJZI;
                ((InterfaceC147905rG) c82632Wbs2.LIZ(anonymousClass6732, interfaceC74236TBoArr2[0])).LIZLLL();
                AnonymousClass673 anonymousClass6733 = AnonymousClass673.this;
                ((InterfaceC139655dx) anonymousClass6733.LJLJJI.LIZ(anonymousClass6733, interfaceC74236TBoArr2[1])).LIZLLL();
                if (!z || ((LLJILJILJ5 = (anonymousClass673 = AnonymousClass673.this).LLJILJILJ()) != null && (Hv0 = LLJILJILJ5.Hv0(anonymousClass673)) != null && Hv0.getInTimeEditView())) {
                    AnonymousClass673.this.getEditPreviewApi().U2(false, true, false);
                } else {
                    AnonymousClass673.this.getEditPreviewApi().U2(true, true, true);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    AnonymousClass673 anonymousClass673 = AnonymousClass673.this;
                    C82632Wbs c82632Wbs2 = anonymousClass673.LJLJI;
                    InterfaceC74236TBo<?>[] interfaceC74236TBoArr2 = AnonymousClass673.LJZI;
                    ((InterfaceC147905rG) c82632Wbs2.LIZ(anonymousClass673, interfaceC74236TBoArr2[0])).LIZLLL();
                    WM7 wm7 = AnonymousClass673.this.mParentScene;
                    o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
                    if (c63r != null) {
                        c63r.LIZLLL();
                    }
                    AnonymousClass673 anonymousClass6732 = AnonymousClass673.this;
                    ((InterfaceC139655dx) anonymousClass6732.LJLJJI.LIZ(anonymousClass6732, interfaceC74236TBoArr2[1])).LIZLLL();
                }
            }

            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                o.LJIIIZ(view, "view");
                EditCommentStickerViewModel LLJILJILJ5 = AnonymousClass673.this.LLJILJILJ();
                if (LLJILJILJ5 != null) {
                    LLJILJILJ5.setState(C1550066m.LJLIL);
                }
                EditCommentStickerViewModel LLJILJILJ6 = AnonymousClass673.this.LLJILJILJ();
                if (LLJILJILJ6 != null) {
                    LLJILJILJ6.LJIILIIL(true);
                }
                InterfaceC1549866k<View> interfaceC1549866k = AnonymousClass673.this.LJLLLL;
                if (interfaceC1549866k != null) {
                    interfaceC1549866k.accept(view);
                }
                AnonymousClass673.this.LJLLLLLL.LJFF(4);
            }
        };
        ((InterfaceC147865rC) this.LJLL.LIZ(this, interfaceC74236TBoArr[7])).N4().observe(this, new AObserverS70S0100000_2(this, 90));
        EditCommentStickerViewModel LLJILJILJ5 = LLJILJILJ();
        if (LLJILJILJ5 != null) {
            MutableLiveData<Boolean> liveData2 = ((InterfaceC147865rC) this.LJLL.LIZ(this, interfaceC74236TBoArr[7])).N4();
            o.LJIIIZ(liveData2, "liveData");
            LLJILJILJ5.LJLJJLL = liveData2;
        }
        this.LJLLILLLL = new ToolSafeHandler(this);
        this.LJLLI = new ARunnableS5S0201000_2(this, 1);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC1547265k
    public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        String LJIILL;
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        if (LLJJI().LJIILLIIL()) {
            if (interfaceC88471Ynr == null || (LJIILL = interfaceC88471Ynr.invoke("comment_sticker", EnumC43649HBd.COMMENT_STICKER)) == null) {
                LJIILL = LLJJI().LJIILL();
                o.LJIIIIZZ(LJIILL, "stickerController.stickerPath");
            }
            int LIZLLL = compileCallback.LJLLL().LIZLLL();
            int LJI = compileCallback.LJLLL().LJI();
            int i = editor.LLILZ().width;
            int i2 = editor.LLILZ().height;
            C1556669a LLJJI = LLJJI();
            C156426By c156426By = LLJJI.LJLL;
            if (c156426By instanceof C1557369h) {
                c156426By.LJIILL();
            }
            C10K LJIILL2 = LLJJI.LJI(LIZLLL, LJI, i, i2, LJIILL).LJIILL(new AgS120S0100000_2(LLJJI, 10));
            o.LJIIIIZZ(LJIILL2, "stickerController.compil…idth, disVideoInitHeight)");
            C10K<C76800UCe> LJIILLIIL = LJIILL2.LJIILLIIL(new AgS107S0200000_2(editor, compileCallback, 4), C10K.LJIIIIZZ);
            o.LJIIIIZZ(LJIILLIIL, "editor: IASVEEditor,\n   …HREAD_EXECUTOR)\n        }");
            return LJIILLIIL;
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(null);
        o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(null)\n        }");
        return LJIIIZ;
    }

    public final void LLJILJIL(CommentVideoModel commentVideoModel, boolean z, boolean z2) {
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(getApplicationContext());
        LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        LLJJI().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJJI().LJJIJ(C5YW.LIZIZ().LJJLIIIJJIZ(LLJJ(), ""));
        LLJJI().LJJIZ(commentVideoModel, z, z2);
        C1556669a LLJJI = LLJJI();
        C156426By c156426By = LLJJI.LJLL;
        if (c156426By instanceof C1557369h) {
            C1557369h c1557369h = (C1557369h) c156426By;
            CommentVideoModel commentVideoModel2 = LLJJI.LLI;
            c1557369h.setVisibility(4);
            C156086Aq c156086Aq = c1557369h.LLIIIZ;
            if (c156086Aq != null) {
                c156086Aq.LIZLLL(commentVideoModel2, new C67M(c1557369h, null));
            }
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        LLJJI().getClass();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            LLJJI().LJLLLLLL = value.LLILZ();
            LLJJI().LJIJ(this.mActivity, frameLayout);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJZ.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        this.LJLLJ = frameLayout;
        return new View(requireSceneContext());
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
