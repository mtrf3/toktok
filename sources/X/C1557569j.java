package X;

import Y.AObserverS70S0100000_2;
import Y.ARunnableS5S0201000_2;
import Y.IDDListenerS142S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerState;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editor.sticker.nature.EditSelectNatureSpeciesDialogFragment;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.69j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1557569j extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public InterfaceC152085y0 LJLILLLLZI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLL;
    public final C82632Wbs LJLLI;
    public ARunnableS5S0201000_2 LJLLILLLL;
    public ToolSafeHandler LJLLJ;
    public InterfaceC1549866k<View> LJLLL;
    public FrameLayout LJLLLL;
    public InterfaceC137115Zr LJLLLLLL;
    public TuxSheet LJLZ;
    public NatureViewModel LLF;
    public final C5H3 LJLJI = C269113v.LIZIZ(this, InterfaceC164126cK.class);
    public final C5H3 LJLJJI = C269113v.LIZ(this, C63R.class);
    public final C5H3 LJLJJLL = C269113v.LIZ(this, InterfaceC147905rG.class);
    public final C5H3 LJLJLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C1557869m.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 986));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 988));
    public final String LL = LLJILJILJ().getCreationId();
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 987));

    static {
        TBT tbt = new TBT(C1557569j.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C1557569j.class, "editMentionStickerApi", "getEditMentionStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditMentionStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1557569j.class, "editHashTagStickerApi", "getEditHashTagStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/hashtag/EditHashTagStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1557569j.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C1557569j.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp)};
    }

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

    public final EditNatureStickerViewModel LLJILJIL() {
        return (EditNatureStickerViewModel) this.LLD.getValue();
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLL.LIZ(this, LLFF[3]);
    }

    public final C1558169p LLJJ() {
        return (C1558169p) this.LJZ.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJLLL.getValue();
    }

    public final void LJJ() {
        Number number;
        NatureClassificationStruct natureClassificationStruct;
        LLJJ().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        C1558669u c1558669u = new C1558669u(0);
        List<InteractStickerStruct> LJI = C164826dS.LJI(LLJILJILJ().getMainBusinessContext(), 14, EnumC164816dR.TRACK_PAGE_EDIT);
        Number number2 = 0;
        NatureSpeciesModel natureSpeciesModel = null;
        if (LJI != null) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(LJI, 0);
            if (interactStickerStruct != null && interactStickerStruct.getType() == 23) {
                NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
                NatureClassificationStickerStruct natureClassificationStickerStruct = interactStickerStruct.getNatureClassificationStickerStruct();
                if (natureClassificationStickerStruct != null && (natureClassificationStruct = natureClassificationStickerStruct.getNatureClassificationStruct()) != null) {
                    String speciesName = natureClassificationStruct.getSpeciesName();
                    if (speciesName == null) {
                        speciesName = "";
                    }
                    natureSpeciesModel = new NatureSpeciesModel(speciesName, "", "", "", 0.0f, "");
                }
                if (LIZIZ != null) {
                    number = Float.valueOf(LIZIZ.getStartTime());
                } else {
                    number = number2;
                }
                c1558669u.LJLILLLLZI = number.intValue();
                if (LIZIZ != null) {
                    number2 = Float.valueOf(LIZIZ.getEndTime());
                }
                c1558669u.LJLJI = number2.intValue();
            }
            if (LJI == null || LJI.isEmpty() || natureSpeciesModel == null) {
                return;
            }
            LLJJ().LJJIL(natureSpeciesModel, c1558669u, false, true);
            LLJJ().LJJIFFI((InteractStickerStruct) ListProtector.get(LJI, 0));
        }
    }

    public final void LLJJI() {
        CreateAnchorInfo createAnchorInfo;
        PublishExtensionModel fromString = PublishExtensionModel.fromString(LLJILJILJ().commerceData);
        List<CreateAnchorInfo> list = fromString.createAnchorInfos;
        if (list != null) {
            Iterator<CreateAnchorInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    createAnchorInfo = it.next();
                    if (createAnchorInfo.getType() == 20) {
                        break;
                    }
                } else {
                    createAnchorInfo = null;
                    break;
                }
            }
            list.remove(createAnchorInfo);
        }
        LLJILJILJ().commerceData = PublishExtensionModel.toString(fromString);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJZI.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ToolSafeHandler toolSafeHandler = this.LJLLJ;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLILLLL;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.removeCallbacks(aRunnableS5S0201000_2);
                return;
            } else {
                o.LJIJI("nonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ToolSafeHandler toolSafeHandler = this.LJLLJ;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLILLLL;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.postDelayed(aRunnableS5S0201000_2, 200L);
                return;
            } else {
                o.LJIJI("nonInfoStickerPlayingRefreshTask");
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

    public C1557569j(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC139655dx.class, null);
        this.LJLJL = UCI.LJI(c82622Wbi, C63I.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, C63H.class, null);
        this.LJLL = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLLI = UCI.LJI(c82622Wbi, C137965bE.class, null);
    }

    public final void LLJJIII(boolean z) {
        LLJJ().LJLJI = z;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.69k] */
    public final void LLJJIJI(FragmentManager fragmentManager) {
        C138835cd c138835cd = new C138835cd(LLJILJILJ().mShootWay, this.LL, H8F.LJI(LLJILJILJ()), H8F.LJII(LLJILJILJ()));
        NatureViewModel natureViewModel = this.LLF;
        if (natureViewModel != null) {
            EditSelectNatureSpeciesDialogFragment editSelectNatureSpeciesDialogFragment = new EditSelectNatureSpeciesDialogFragment();
            EditSelectNatureSpeciesDialogFragment.LJLLLLLL = natureViewModel;
            Bundle bundle = new Bundle();
            bundle.putSerializable("mob_params", c138835cd);
            editSelectNatureSpeciesDialogFragment.setArguments(bundle);
            TuxSheet tuxSheet = new ASL().LIZ;
            tuxSheet.LJLLILLLL = editSelectNatureSpeciesDialogFragment;
            tuxSheet.LJLILLLLZI = new IDDListenerS142S0100000_2(editSelectNatureSpeciesDialogFragment, 2);
            this.LJLZ = tuxSheet;
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "EditSelectNatureSpeciesDialogFragment");
            editSelectNatureSpeciesDialogFragment.LJLLJ = new C1557969n(this);
            editSelectNatureSpeciesDialogFragment.LJLLL = new InterfaceC252739vx() { // from class: X.69k
                @Override // X.InterfaceC252739vx
                public final void LIZ() {
                    TuxSheet tuxSheet2 = C1557569j.this.LJLZ;
                    if (tuxSheet2 != null) {
                        tuxSheet2.dismiss();
                    } else {
                        o.LJIJI("tuxSheet");
                        throw null;
                    }
                }
            };
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        LiveData liveData;
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        if (activity != null && !activity.isFinishing()) {
            final String creationId = this.LL;
            o.LJIIIIZZ(creationId, "creationId");
            this.LLF = (NatureViewModel) new ViewModelProvider(this, new ViewModelProvider.Factory(creationId) { // from class: X.6c5
                public final String LIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                    return C09L.LIZIZ(this, cls, c0vk);
                }

                {
                    this.LIZ = creationId;
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> modelClass) {
                    o.LJIIIZ(modelClass, "modelClass");
                    if (modelClass.isAssignableFrom(NatureViewModel.class)) {
                        return new NatureViewModel(this.LIZ);
                    }
                    throw new IllegalArgumentException("ViewModel Not Found");
                }
            }).get(NatureViewModel.class);
        }
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 309));
        EditNatureStickerViewModel LLJILJIL = LLJILJIL();
        if (LLJILJIL != null) {
            C73297Sph.LJIIJJI(this, LLJILJIL, new TBT() { // from class: X.678
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditNatureStickerState) obj).getHideHelpBoxEvent();
                }
            }, new AqS184S0100000_2(this, 80));
        }
        EditNatureStickerViewModel LLJILJIL2 = LLJILJIL();
        if (LLJILJIL2 != null && (liveData = (LiveData) LLJILJIL2.LJLJJLL.getValue()) != null) {
            liveData.observe(this, new AObserverS70S0100000_2(this, 310));
        }
        EditNatureStickerViewModel LLJILJIL3 = LLJILJIL();
        if (LLJILJIL3 != null && (mutableLiveData = LLJILJIL3.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS70S0100000_2(this, 311));
        }
        LLJJ().LJLLILLLL = new C6BO() { // from class: X.66j
            @Override // X.C6BO
            public final void LIZ() {
            }

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
            public final void LIZIZ() {
                C1557569j.this.LLJJI();
                C1557569j c1557569j = C1557569j.this;
                ((C137965bE) c1557569j.LJLLI.LIZ(c1557569j, C1557569j.LLFF[4])).LIZJ(C1557569j.this.LLJJ().LLII);
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C1557569j c1557569j = C1557569j.this;
                Activity activity2 = c1557569j.mActivity;
                o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity2).getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
                c1557569j.LLJJIJI(supportFragmentManager);
                ((C1548866a) C1557569j.this.LJZL.getValue()).LIZJ(23);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C1557569j c1557569j;
                EditNatureStickerViewModel LLJILJIL4;
                EditNatureStickerState Hv0;
                ((InterfaceC147905rG) C1557569j.this.LJLJJLL.getValue()).LIZLLL();
                C1557569j c1557569j2 = C1557569j.this;
                ((InterfaceC139655dx) c1557569j2.LJLJJL.LIZ(c1557569j2, C1557569j.LLFF[0])).LIZLLL();
                if (!z || ((LLJILJIL4 = (c1557569j = C1557569j.this).LLJILJIL()) != null && (Hv0 = LLJILJIL4.Hv0(c1557569j)) != null && Hv0.getInTimeEditView())) {
                    C1557569j.this.getEditPreviewApi().U2(false, true, false);
                } else {
                    C1557569j.this.getEditPreviewApi().U2(true, true, true);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C1557569j c1557569j = C1557569j.this;
                    C82632Wbs c82632Wbs = c1557569j.LJLJLJ;
                    InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C1557569j.LLFF;
                    ((C63H) c82632Wbs.LIZ(c1557569j, interfaceC74236TBoArr[2])).LIZLLL();
                    C1557569j c1557569j2 = C1557569j.this;
                    ((C63I) c1557569j2.LJLJL.LIZ(c1557569j2, interfaceC74236TBoArr[1])).LIZLLL();
                    ((InterfaceC147905rG) C1557569j.this.LJLJJLL.getValue()).LIZLLL();
                    ((C63R) C1557569j.this.LJLJJI.getValue()).LIZLLL();
                    C1557569j c1557569j3 = C1557569j.this;
                    ((InterfaceC139655dx) c1557569j3.LJLJJL.LIZ(c1557569j3, interfaceC74236TBoArr[0])).LIZLLL();
                }
            }

            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                o.LJIIIZ(view, "view");
                EditNatureStickerViewModel LLJILJIL4 = C1557569j.this.LLJILJIL();
                if (LLJILJIL4 != null) {
                    LLJILJIL4.setState(new AqS7S0010000_2(59));
                }
                InterfaceC1549866k<View> interfaceC1549866k = C1557569j.this.LJLLL;
                if (interfaceC1549866k != null) {
                    interfaceC1549866k.accept(view);
                }
                ((C1548866a) C1557569j.this.LJZL.getValue()).LJFF(23);
            }
        };
        this.LJLLJ = new ToolSafeHandler(this);
        this.LJLLILLLL = new ARunnableS5S0201000_2(this, 6);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        LLJJ().getClass();
        LLJJ().LLIIII = LLJILJILJ();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            LLJJ().LJLLLLLL = value.LLILZ();
            LLJJ().LJIJ(this.mActivity, frameLayout);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJZI.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        this.LJLLLL = frameLayout;
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
