package X;

import Y.AObjectS84S0100000_2;
import Y.AfS51S0200000_2;
import Y.AfS54S0100000_2;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C164246cW extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final C164276cZ LJZI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public static final int LL;
    public final C82622Wbi LJLIL;
    public String LJLILLLLZI;
    public long LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public final C82632Wbs LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final java.util.Set<String> LJLLLL;
    public InterfaceC150395vH LJLLLLLL;
    public final C73318Sq2 LJLZ;
    public C73411SrX LJZ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.6cZ] */
    static {
        TBT tbt = new TBT(C164246cW.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt, new TBT(C164246cW.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelApi;", 0), new TBT(C164246cW.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LJZI = new Object() { // from class: X.6cZ
        };
        LL = C164516cx.LIZ();
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

    public final InterfaceC81454Vxy LLJILJIL() {
        return (InterfaceC81454Vxy) this.LJLJJL.LIZ(this, LJZL[1]);
    }

    public final InterfaceC164126cK LLJILJILJ() {
        return (InterfaceC164126cK) this.LJLJJI.LIZ(this, LJZL[0]);
    }

    public final InterfaceC164256cX LLJJ() {
        return (InterfaceC164256cX) this.LJLLL.getValue();
    }

    public final VideoPublishEditModel LLJJI() {
        return (VideoPublishEditModel) this.LJLLI.LIZ(this, LJZL[2]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LJLZ.LJLILLLLZI) {
            this.LJLZ.dispose();
        }
        C73411SrX c73411SrX = this.LJZ;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
        LLJJ().b3();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C164246cW(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = "click_button";
        this.LJLJI = -1L;
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC164126cK.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC81454Vxy.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1067));
        this.LJLJLJ = true;
        this.LJLJLLL = -1L;
        this.LJLLI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1070));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1069));
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1068));
        this.LJLLLL = new LinkedHashSet();
        this.LJLZ = new C73318Sq2();
    }

    public boolean LLJJIJI(EffectCategoryResponse category) {
        o.LJIIIZ(category, "category");
        ArrayList arrayList = new ArrayList();
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        VideoPublishEditModel LLJJI = LLJJI();
        o.LJIIIZ(LLJJI, "<this>");
        List<String> LJIL = LJJJJI.LJIL(H7R.LJJJJL(LLJJI), H7R.LJJLIIIJJIZ(LLJJI()));
        if (LJIL != null) {
            arrayList.addAll(LJIL);
        }
        return arrayList.contains(category.getKey());
    }

    public boolean LLJJIJIIJIL(Effect effect) {
        o.LJIIIZ(effect, "effect");
        if (H7R.LJJJJI(LLJJI()) && (C77117UOj.LJIJJLI(effect) || effect.getTags().contains("commentPanel"))) {
            return true;
        }
        return false;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        GHB ghb = new GHB() { // from class: X.6cY
            @Override // X.GHB
            public final boolean onBackPressed() {
                C164116cJ.LIZ(C164246cW.this.LLJILJILJ(), false, 0L, 6);
                return true;
            }
        };
        C73318Sq2 c73318Sq2 = this.LJLZ;
        C73426Srm d3 = LLJJ().d3();
        AfS54S0100000_2 afS54S0100000_2 = new AfS54S0100000_2(this, 39);
        C73982T1u c73982T1u = C73982T1u.LJLIL;
        c73318Sq2.LIZ(d3.LJJJLIIL(afS54S0100000_2, c73982T1u));
        this.LJLZ.LIZ(LLJJ().e3().LJJJLIIL(new AfS54S0100000_2(this, 40), c73982T1u));
        this.LJLZ.LIZ(LLJJ().a3().LJJJLIIL(new AfS51S0200000_2(this, ghb, 6), c73982T1u));
        this.LJLZ.LIZ(LLJJ().g3().LJJJLIIL(new AfS54S0100000_2(this, 41), c73982T1u));
        this.LJLZ.LIZ(LLJJ().c3().LJJJLIIL(new AfS54S0100000_2(this, 42), c73982T1u));
        this.LJLZ.LIZ(LLJJ().f3().LJJJLIIL(new AfS54S0100000_2(this, 43), c73982T1u));
        BaseJediViewModel.Lv0((BaseJediViewModel) this.LJLJJLL.getValue(), this, new TBT() { // from class: X.6B0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCommentStickerState) obj).getHasCommentSticker();
            }
        }, new AqS168S0100000_2(this, 651));
        LLJILJILJ().Dt().LIZLLL(this, new AObjectS84S0100000_2(this, 288));
        LLJILJILJ().wl0().LIZLLL(this, new AObjectS84S0100000_2(this, 289));
        LLJILJILJ().GX().LIZLLL(this, new AObjectS84S0100000_2(this, BuildConfig.VERSION_CODE));
        LLJILJILJ().bB().LIZLLL(this, new AObjectS84S0100000_2(this, 291));
        LLJILJILJ().dD().LIZLLL(this, new AObjectS84S0100000_2(this, 292));
        LLJILJILJ().l70().LIZLLL(this, new AObjectS84S0100000_2(this, 293));
        LLJILJILJ().Me().LIZLLL(this, new AObjectS84S0100000_2(this, 294));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public final void LLJJIII(int i, Effect effect, String str) {
        String str2;
        String str3;
        String str4;
        String effectId = effect.getEffectId();
        EffectCategoryResponse LIZLLL = TN4.LIZIZ().LIZLLL(effectId);
        String str5 = "";
        if (LIZLLL == null || (str2 = LIZLLL.getId()) == null) {
            str2 = "";
        }
        C145995oB LJJJLIIL = H8F.LJJJLIIL(LLJJI());
        LJJJLIIL.LIZ(1002, "scene_id");
        LJJJLIIL.LJI("tab_name", null);
        LJJJLIIL.LJI("prop_id", effectId);
        LJJJLIIL.LJI("prop_index", effect.getGradeKey());
        LJJJLIIL.LJI("enter_method", "click_main_panel");
        LJJJLIIL.LJI("creation_id", LLJJI().getCreationId());
        LJJJLIIL.LJI("shoot_way", LLJJI().mShootWay);
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(LLJJI()));
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LJI("category_name", str);
        LJJJLIIL.LJI("tab_id", str2);
        String resourceId = effect.getResourceId();
        if (resourceId != null) {
            str5 = resourceId;
        }
        LJJJLIIL.LJI("resource_id", str5);
        LJJJLIIL.LIZ(0, "is_giphy");
        LJJJLIIL.LIZ(i, "impr_position");
        if (LIZLLL != null) {
            str3 = LIZLLL.getKey();
        } else {
            str3 = null;
        }
        LJJJLIIL.LIZ(C30581Hy.LJJIIJ(str3) ? 1 : 0, "prop_selected_from_trending");
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        if (C84488XDw.LIZ(application, null).LJJIJLIJ(effect)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJLIIL.LIZLLL("is_preload", str4);
        if (LLJJI().draftId != 0) {
            LJJJLIIL.LIZ(LLJJI().draftId, "draft_id");
        }
        String str6 = LLJJI().newDraftId;
        o.LJIIIIZZ(str6, "mModel.newDraftId");
        if (str6.length() > 0) {
            LJJJLIIL.LIZLLL("new_draft_id", LLJJI().newDraftId);
        }
        if (LIZLLL != null && o.LJ(LIZLLL.getKey(), ECommerceAnchorService.LJJJJI().LJIIL())) {
            LJJJLIIL.LIZLLL("ecom_sticker_id", effectId);
        }
        GXR.LIZ("prop_click", LJJJLIIL.LIZ);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccf, viewGroup, false, "inflater.inflate(R.layou…_panel, container, false)");
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
