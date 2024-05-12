package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS3S1100000_2;
import Y.ARunnableS5S0201000_2;
import Y.ARunnableS6S0101000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.64w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1545864w extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public final InterfaceC1541063a LJLILLLLZI;
    public final int LJLJI;
    public final EnumC139385dW LJLJJI;
    public final AnonymousClass642 LJLJJL;
    public final TTSVoiceModel LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public InterfaceC152085y0 LJLJLLL;
    public C1545664u LJLL;
    public AnonymousClass655 LJLLI;
    public boolean LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C82632Wbs LJLLL;
    public final C62822Ol8 LJLLLL;
    public C63E LJLLLLLL;

    static {
        TBT tbt = new TBT(C1545864w.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
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

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LJLZ[0]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLLJ.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        C63E c63e = this.LJLLLLLL;
        if (c63e != null) {
            c63e.LJIIL().gQ();
            super.onDestroyView();
        } else {
            o.LJIJI("textStickerController");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        C63E c63e = this.LJLLLLLL;
        if (c63e != null) {
            SafeHandler LJIIJJI = c63e.LJIIJJI();
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = c63e.LLIIIZ;
            if (aRunnableS5S0201000_2 != null) {
                LJIIJJI.removeCallbacks(aRunnableS5S0201000_2);
                return;
            } else {
                o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        C63E c63e = this.LJLLLLLL;
        if (c63e != null) {
            AnonymousClass655 anonymousClass655 = c63e.LJLJJLL;
            if (anonymousClass655 != null) {
                anonymousClass655.hide();
            }
            SafeHandler LJIIJJI = c63e.LJIIJJI();
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = c63e.LLIIIZ;
            if (aRunnableS5S0201000_2 != null) {
                LJIIJJI.post(aRunnableS5S0201000_2);
                if (!c63e.LLILLJJLI) {
                    InterfaceC1541063a interfaceC1541063a = c63e.LJLJLJ;
                    if (interfaceC1541063a != null && !interfaceC1541063a.LJ()) {
                        return;
                    }
                    c63e.LJIL(null);
                    return;
                }
                return;
            }
            o.LJIJI("mNonInfoStickerPlayingRefreshTask");
            throw null;
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        String LIZIZ;
        super.onActivityCreated(bundle);
        C63E c63e = this.LJLLLLLL;
        if (c63e != null) {
            c63e.LJIIZILJ();
            IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
            if (iToolsVQEvaluationService != null) {
                SceneExtensionsKt.LIZIZ(this, new ARunnableS21S0200000_2(this, iToolsVQEvaluationService, 43));
            }
            if (getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar && (!getEditModel().mIsFromDraft || (getEditModel().isFromCrash() && getEditModel().creativeModel.changeAvatarModel.firstEnterEdit))) {
                getEditModel().hasTextSticker();
                CreativeModel creativeModel = getEditModel().creativeModel;
                o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
                if (creativeModel.changeAvatarModel.isFromAiVatar) {
                    LIZIZ = C86V.LJFF(R.string.ds);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((char) 10024);
                    LIZ.append(C86V.LJFF(R.string.p7u));
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                SceneExtensionsKt.LIZIZ(this, new ARunnableS3S1100000_2(this, LIZIZ, 4));
            }
            if (getEditModel().creativeModel.onThisDayData.isFromOnThisDay() && !H7R.LJJJJL(getEditModel()) && !getEditModel().creativeModel.onThisDayData.getLoadedSticker()) {
                SceneExtensionsKt.LIZJ(this, new ARunnableS6S0101000_2(0, this, 8), 300L);
            }
            C29901Fi<C76800UCe> c29901Fi = this.LJLJLJ;
            if (c29901Fi == null) {
                return;
            }
            c29901Fi.LJII(C76800UCe.LIZ);
            return;
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        C63E c63e;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        final FrameLayout frameLayout = (FrameLayout) container;
        if (H7R.LJJLIIIJJIZ(getEditModel())) {
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            final ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
            final InterfaceC152085y0 interfaceC152085y0 = this.LJLJLLL;
            if (interfaceC152085y0 != null) {
                final InterfaceC143655kP editPreviewApi = getEditPreviewApi();
                final AnonymousClass671 anonymousClass671 = (AnonymousClass671) this.LJLIL.LJIIIIZZ(null, AnonymousClass671.class);
                final C1545664u c1545664u = this.LJLL;
                if (c1545664u != null) {
                    c1545664u.setSafeAreaHeight(getEditPreviewApi().W60());
                    final AnonymousClass655 anonymousClass655 = this.LJLLI;
                    if (anonymousClass655 != null) {
                        final LiveData<InterfaceC153045zY> Kh = getEditPreviewApi().Kh();
                        final InterfaceC1541063a interfaceC1541063a = this.LJLILLLLZI;
                        final int i = this.LJLJI;
                        final boolean z = this.LJLLILLLL;
                        final EnumC139385dW enumC139385dW = this.LJLJJI;
                        final AnonymousClass642 anonymousClass642 = this.LJLJJL;
                        final TTSVoiceModel tTSVoiceModel = this.LJLJJLL;
                        final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
                        final C82622Wbi c82622Wbi = this.LJLIL;
                        c63e = new C63E(activityC45651qj, interfaceC152085y0, editPreviewApi, frameLayout, c1545664u, anonymousClass655, Kh, interfaceC1541063a, i, anonymousClass671, z, enumC139385dW, anonymousClass642, tTSVoiceModel, interfaceC65784Pro, c82622Wbi) { // from class: X.64v
                            public final ActivityC45651qj LLILZ;
                            public final C1545664u LLILZIL;
                            public final C82622Wbi LLILZLL;

                            @Override // X.C63E
                            public final void LJIILJJIL() {
                            }

                            @Override // X.C63E
                            public final boolean LJIJJ() {
                                return false;
                            }

                            @Override // X.C63E
                            public final boolean LJJIIZI() {
                                return false;
                            }

                            @Override // X.C63E
                            public final int LJIIJ() {
                                return this.LLILZIL.LJIIJ(20);
                            }

                            /* JADX WARN: Type inference failed for: r6v0, types: [X.651] */
                            @Override // X.C63E
                            public final C67P LJIIIZ(TextStickerData textStickerData) {
                                boolean z2;
                                if (textStickerData != null && textStickerData.isCaption()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C67Q c67q = new C67Q(this.LLILZ, LJIIJJI(), textStickerData, !z2, new C68K() { // from class: X.651
                                    @Override // X.C68K
                                    public final boolean LIZ() {
                                        return LJIIL().LJIIIIZZ();
                                    }
                                }, this.LLILZLL);
                                c67q.setSafeAreaHeight(this.LLILZIL.getSafeAreaHeight());
                                return c67q;
                            }

                            @Override // X.C63E
                            public final boolean LJIILLIIL(List<TextStickerTextWrap> list) {
                                for (TextStickerTextWrap textStickerTextWrap : list) {
                                    if (textStickerTextWrap.getStrMap().isEmpty() || textStickerTextWrap.isReplaceString()) {
                                        break;
                                    }
                                    for (TextStickerString textStickerString : textStickerTextWrap.getStickerStringArray()) {
                                        if (textStickerString.getStr().length() > 0) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }

                            @Override // X.C63E, X.InterfaceC83564Wqu
                            public final void keyBoardHide(int i2) {
                                super.keyBoardHide(i2);
                                LJIIL().fu().LJII(C76800UCe.LIZ);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(activityC45651qj, interfaceC152085y0, editPreviewApi, frameLayout, c1545664u, anonymousClass655, Kh, interfaceC1541063a, i, anonymousClass671, z, enumC139385dW, anonymousClass642, tTSVoiceModel, interfaceC65784Pro, c82622Wbi, 512);
                                o.LJIIIZ(frameLayout, "previewLayout");
                                o.LJIIIZ(enumC139385dW, "textStickerGuidanceType");
                                this.LLILZ = activityC45651qj;
                                this.LLILZIL = c1545664u;
                                this.LLILZLL = c82622Wbi;
                            }
                        };
                    } else {
                        o.LJIJI("deleteComponent");
                        throw null;
                    }
                } else {
                    o.LJIJI("inputLayout");
                    throw null;
                }
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        } else {
            Activity activity2 = this.mActivity;
            o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) activity2;
            InterfaceC152085y0 interfaceC152085y02 = this.LJLJLLL;
            if (interfaceC152085y02 != null) {
                InterfaceC143655kP editPreviewApi2 = getEditPreviewApi();
                AnonymousClass671 anonymousClass6712 = (AnonymousClass671) this.LJLIL.LJIIIIZZ(null, AnonymousClass671.class);
                C1545664u c1545664u2 = this.LJLL;
                if (c1545664u2 != null) {
                    AnonymousClass655 anonymousClass6552 = this.LJLLI;
                    if (anonymousClass6552 != null) {
                        c63e = new C63E(activityC45651qj2, interfaceC152085y02, editPreviewApi2, frameLayout, c1545664u2, anonymousClass6552, getEditPreviewApi().Kh(), this.LJLILLLLZI, this.LJLJI, anonymousClass6712, this.LJLLILLLL, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLIL, 512);
                    } else {
                        o.LJIJI("deleteComponent");
                        throw null;
                    }
                } else {
                    o.LJIJI("inputLayout");
                    throw null;
                }
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        this.LJLLLLLL = c63e;
        c63e.LL = (String) this.LJLLLL.getValue();
        C63E c63e2 = this.LJLLLLLL;
        if (c63e2 != null) {
            c63e2.LJIJ();
            return new View(requireSceneContext());
        }
        o.LJIJI("textStickerController");
        throw null;
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

    public C1545864w(C82622Wbi diContainer, InterfaceC1541063a interfaceC1541063a, int i, EnumC139385dW textStickerGuidanceType, AnonymousClass642 anonymousClass642, TTSVoiceModel tTSVoiceModel, InterfaceC65784Pro interfaceC65784Pro, C29901Fi c29901Fi) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(textStickerGuidanceType, "textStickerGuidanceType");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = interfaceC1541063a;
        this.LJLJI = i;
        this.LJLJJI = textStickerGuidanceType;
        this.LJLJJL = anonymousClass642;
        this.LJLJJLL = tTSVoiceModel;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = c29901Fi;
        this.LJLLJ = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 703));
    }
}
