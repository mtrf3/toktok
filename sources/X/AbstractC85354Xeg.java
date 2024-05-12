package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.v2.IPoiPublishUpdateUiStatusAbility;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xeg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85354Xeg implements InterfaceC93923mO, KPL {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C85359Xel LJLJI;
    public final C214298b3 LJLJJI;
    public final C85339XeR LJLJJL;
    public final InterfaceC55235Lm3 LJLJJLL;

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public abstract void LJFF();

    public abstract boolean LJI();

    public abstract void LJII();

    public abstract boolean LJIIIZ();

    public abstract boolean LJIIJ();

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public void LIZ() {
        Integer num;
        String str;
        String str2;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//poi/search");
        String creationId = this.LJLJI.LJLILLLLZI.getMobParam().getCreationId();
        String contentType = this.LJLJI.LJLIL.getContentType();
        String shootWay = this.LJLJI.LJLILLLLZI.getMobParam().getShootWay();
        String LIZIZ = LIZIZ();
        EditPostMobParam editPostMobParam = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        Integer num2 = null;
        if (editPostMobParam != null) {
            num = editPostMobParam.getAwemeType();
        } else {
            num = null;
        }
        buildRoute.withParam("poi_mob_param", new PoiMobParam(creationId, contentType, shootWay, "click_add_location", LIZIZ, num, null, 64, null));
        EditPostMobParam editPostMobParam2 = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        if (editPostMobParam2 != null) {
            str = editPostMobParam2.getAwemeId();
        } else {
            str = null;
        }
        buildRoute.withParam("aid", str);
        buildRoute.open(10001);
        PoiSearchApi.PoiSearchResultWrapper LIZ = LIZLLL().getState().LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            str2 = poiSearchResult.getLogId();
        } else {
            str2 = null;
        }
        String LIZIZ2 = LIZIZ();
        String LIZJ = LIZJ();
        EditPostMobParam editPostMobParam3 = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        if (editPostMobParam3 != null) {
            num2 = editPostMobParam3.getAwemeType();
        }
        C225248si.LJIILIIL(num2, LIZIZ2, LIZJ, str2);
        C225248si.LJ();
    }

    public final PoiPublishExtensionVMV2 LIZLLL() {
        return (PoiPublishExtensionVMV2) this.LJLJJI.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLILLLLZI.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    @Override // X.InterfaceC93923mO
    public final Context getContext() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC93923mO
    public final LifecycleOwner getCurrentLifeCycleOwner() {
        return this.LJLILLLLZI;
    }

    public final void LJIIIIZZ(int i) {
        C225248si.LJIILLIIL(this.LJLJJL.LIZJ() ? 1 : 0, i, o.LJ(LIZLLL().getState().LJLJI, Boolean.TRUE) ? 1 : 0, this.LJLJI.LJLILLLLZI.getMobParam().getCreationId());
    }

    public static void LJIIJJI(AbstractC85354Xeg abstractC85354Xeg, EnumC85364Xeq status) {
        abstractC85354Xeg.getClass();
        o.LJIIIZ(status, "status");
        IPoiPublishUpdateUiStatusAbility iPoiPublishUpdateUiStatusAbility = (IPoiPublishUpdateUiStatusAbility) C55096Ljo.LIZ(abstractC85354Xeg.LJLJJLL, IPoiPublishUpdateUiStatusAbility.class, null);
        if (iPoiPublishUpdateUiStatusAbility != null) {
            iPoiPublishUpdateUiStatusAbility.GU(status, false, null);
        }
    }

    public AbstractC85354Xeg(Context sceneContext, LifecycleOwner lifecycleOwner, C85359Xel extensionMiscData) {
        C214298b3 c214298b3;
        o.LJIIIZ(sceneContext, "sceneContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(extensionMiscData, "extensionMiscData");
        this.LJLIL = sceneContext;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = extensionMiscData;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVMV2.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 801);
        C85372Xey c85372Xey = C85372Xey.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85463XgR.INSTANCE, new AqS165S0100000_15(this, 802), new AqS165S0100000_15(this, 803), C85443Xg7.INSTANCE, c85372Xey, new AqS165S0100000_15(this, 804), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85464XgS.INSTANCE, new AqS165S0100000_15(this, 805), new AqS165S0100000_15(this, 796), C85442Xg6.INSTANCE, c85372Xey, new AqS165S0100000_15(this, 797), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85462XgQ.INSTANCE, new AqS165S0100000_15(this, 798), new AqS165S0100000_15(this, 799), new AqS165S0100000_15(this, 800), c85372Xey, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b3;
        this.LJLJJL = C85342XeU.LIZ();
        this.LJLJJLL = C55230Lly.LIZLLL(C86793Y4n.LJIJJLI(sceneContext), null);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
