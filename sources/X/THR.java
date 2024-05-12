package X;

import Y.AObjectS87S0100000_12;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THR extends AbstractC29891Fh<THV> implements THV, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C73318Sq2 LJLJL;
    public boolean LJLJLJ;

    static {
        TBT tbt = new TBT(THR.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(THR.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(THR.class, "filterPanelApi", "getFilterPanelApi()Lcom/bytedance/creativex/recorder/filter/api/FilterPanelApi;", 0, c65351Pkp), C61845OOz.LIZJ(THR.class, "filterApi", "getFilterApi()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0, c65351Pkp)};
    }

    public THV LJJLIIIJILLIZJL() {
        return this;
    }

    private final WRP LJJLIIIJJIZ() {
        return (WRP) this.LJLJJLL.LIZ(this, LJLJLLL[3]);
    }

    private final THT getFilterPanelApi() {
        return (THT) this.LJLJJL.LIZ(this, LJLJLLL[2]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJI.LIZ(this, LJLJLLL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJI.LIZ(this, LJLJLLL[0]);
    }

    private final AVETParameter LJJLIIIJJI() {
        return getShortVideoContext().LIZLLL();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        ((THU) getDiContainer().LJ(THU.class, null)).show();
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_tab_name", shortVideoContext.LJIJI());
        c145995oB.LJI("enter_method", "click");
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        FMX.LJIIL("click_prop_discover_entrance", c145995oB.LIZ);
    }

    public final void LJJLIIJ() {
        AVETParameter LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("shoot_way", LJJLIIIJJI.getShootWay());
            c145995oB.LJI("creation_id", LJJLIIIJJI.getCreationId());
            c145995oB.LJI("filter_id", "-1");
            FMX.LJIIL("filter_deleted", c145995oB.LIZ);
        }
    }

    public final void LJJLJ() {
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        LJJIIZI.LIZIZ("click_filter_box", c145995oB.LIZ);
    }

    public final void LJJZZI() {
        IDH LLLF;
        TGV Kj;
        C73426Srm LIZ;
        IDH LLLF2;
        TGV Kj2;
        MutableLiveData LIZIZ;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (LLLF2 = stickerApiComponent.LLLF()) != null && (Kj2 = LLLF2.Kj()) != null && (LIZIZ = Kj2.LIZIZ()) != null) {
            LIZIZ.observe(this, new AObserverS80S0100000_12(this, 23));
        }
        TH7 th7 = (TH7) getDiContainer().LJ(TH7.class, null);
        if (th7.get("sticker_category:search") instanceof THD) {
            TH6 th6 = th7.get("sticker_category:search");
            o.LJII(th6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerCategoryTabView");
            THD thd = (THD) th6;
            ((SearchStickerViewContainer) thd.LIZJ.getValue()).LJZI.observe(this, new AObserverS80S0100000_12(this, 24));
            C78999UzT.LJFF(((SearchStickerViewContainer) thd.LIZJ.getValue()).LIZ().LJJJJZI(new AfS64S0100000_12(this, 40)), this.LJLJL);
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (LLLF = stickerApiComponent2.LLLF()) != null && (Kj = LLLF.Kj()) != null && (LIZ = Kj.LIZ()) != null) {
            C78999UzT.LJFF(LIZ.LJJJJZI(new AfS64S0100000_12(this, 41)), this.LJLJL);
        }
    }

    public final void LJJZZIII() {
        C0IB<FilterBean> curSelectedFilter;
        FilterBean LIZ;
        InterfaceC142225i6 interfaceC142225i6;
        LiveData<WPD> currentFilterSource;
        WPD value;
        WRP LJJLIIIJJIZ = LJJLIIIJJIZ();
        Float f = null;
        if (LJJLIIIJJIZ != null && (curSelectedFilter = LJJLIIIJJIZ.getCurSelectedFilter()) != null && (LIZ = curSelectedFilter.LIZ()) != null) {
            WRP LJJLIIIJJIZ2 = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ2 != null && (currentFilterSource = LJJLIIIJJIZ2.getCurrentFilterSource()) != null && (value = currentFilterSource.getValue()) != null) {
                interfaceC142225i6 = value.LJLJI;
            } else {
                interfaceC142225i6 = null;
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("creation_id", getShortVideoContext().LJI());
            c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
            c145995oB.LIZ(getShortVideoContext().draftId, "draft_id");
            c145995oB.LIZ(LIZ.getId(), "filter_id");
            c145995oB.LJI("filter_name", LIZ.getEnName());
            if (interfaceC142225i6 != null) {
                f = Float.valueOf(interfaceC142225i6.LIZ(LIZ));
            }
            c145995oB.LIZJ(f, "value");
            java.util.Map<String, String> map = c145995oB.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
            FMX.LJIIL("adjust_filter_complete", map);
        }
    }

    public final void LJLIIL() {
        ShortVideoContext shortVideoContext = getShortVideoContext();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("scene_id", "1004");
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("shoot_tab_name", getShortVideoContext().LJIJI());
        FMX.LJIIL("click_modify_entrance", c145995oB.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        AbstractC73672Svk<THY> Be0;
        LiveData<THS> Y70;
        TEZ LLLLL;
        InterfaceC74301TEb LJIIIIZZ;
        MutableLiveData LJII;
        LiveEvent<Boolean> sF;
        super.onCreate();
        if (this.LJLILLLLZI) {
            if (getDiContainer().LIZIZ(THT.class)) {
                whenReadyOrThrowInternal(getDiContainer(), THT.class, new AqS178S0100000_12(this, 291));
            }
        } else {
            THT filterPanelApi = getFilterPanelApi();
            if (filterPanelApi != null && (Y70 = filterPanelApi.Y70()) != null) {
                Y70.observe(this, new AObserverS80S0100000_12(this, 26));
            }
            THT filterPanelApi2 = getFilterPanelApi();
            if (filterPanelApi2 != null && (Be0 = filterPanelApi2.Be0()) != null) {
                this.LJLJL.LIZ(Be0.LJJJLIIL(new AfS64S0100000_12(this, 43), C73982T1u.LJLIL));
            }
        }
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (sF = stickerApiComponent.sF()) != null) {
            sF.LIZLLL(this, new AObjectS87S0100000_12(this, 1));
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (LLLLL = stickerApiComponent2.LLLLL()) != null && (LJIIIIZZ = LLLLL.LJIIIIZZ()) != null && (LJII = LJIIIIZZ.LJII()) != null) {
            LJII.observe(this, C73097SmT.LJLIL);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ THV getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LJJLIIIIJ(AbstractC72800Shg abstractC72800Shg) {
        if (abstractC72800Shg instanceof C72801Shh) {
            LJJLJLI("click_prop_search_icon", new AqS162S0100000_12(abstractC72800Shg, 910));
            return;
        }
        if (abstractC72800Shg instanceof C72796Shc) {
            LJJLJLI("prop_search", new AqS162S0100000_12(abstractC72800Shg, 911));
            return;
        }
        if (abstractC72800Shg instanceof C72795Shb) {
            LJJLJLI("prop_show", new AqS159S0200000_12(abstractC72800Shg, this, 35));
        } else if (abstractC72800Shg instanceof C72798She) {
            LJJLJLI("clear_prop_search_text", new AqS162S0100000_12(abstractC72800Shg, 912));
        } else {
            if (!(abstractC72800Shg instanceof C72799Shf)) {
                return;
            }
            LJJLJLI("prop_search_cancel", new AqS162S0100000_12(abstractC72800Shg, 913));
        }
    }

    public final void LJJLL(EffectCategoryResponse effectCategoryResponse) {
        AVETParameter LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", LJJLIIIJJI.getCreationId());
            c145995oB.LJI("shoot_way", LJJLIIIJJI.getShootWay());
            c145995oB.LJI("tab_name", effectCategoryResponse.getName());
            c145995oB.LJI("content_source", LJJLIIIJJI.getContentSource());
            c145995oB.LJI("content_type", LJJLIIIJJI.getContentType());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("scene_id", "1002");
            c145995oB.LJI("shoot_page", "video_shoot_page");
            c145995oB.LJI("shoot_tab_name", getShortVideoContext().LJIJI());
            GXR.LIZ("click_filter_tab", c145995oB.LIZ);
        }
    }

    public THR(C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = z;
        this.LJLJI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), THT.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), WRP.class, null);
        this.LJLJL = new C73318Sq2();
        this.LJLJLJ = true;
    }

    private final void LJJLJLI(String str, InterfaceC65784Pro<? extends HashMap<String, String>> interfaceC65784Pro) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        String LIZLLL = I9T.LIZLLL(getShortVideoContext().creativeModel.musicBuzModel);
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        c145995oB.LJI("music_id", LIZLLL);
        c145995oB.LJI("shoot_tab_name", getShortVideoContext().LJIJI());
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (interfaceC65784Pro != null) {
            c145995oB.LJFF(interfaceC65784Pro.invoke());
        }
        GXR.LIZ(str, c145995oB.LIZ);
    }

    public final void LJJLI(HashMap<String, String> hashMap, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music == null || (str = (String) ORZ.LJLLLL(music)) == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (V3N.LJJII(effect)) {
            hashMap.put("music_selected_from", "prop_music_bind");
        } else {
            hashMap.put("music_selected_from", "prop_music_soft_bind");
        }
    }

    public /* synthetic */ THR(C82622Wbi c82622Wbi, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? false : z);
    }
}
