package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.AUListenerS69S0101000_7;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommercePhotoSearchModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search.ExtendAlbumScene;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hzg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45888Hzg extends AbstractC48231ut<InterfaceC44139HTz, ExtendAlbumScene, C45895Hzn, C45897Hzp> implements InterfaceC44139HTz, InterfaceC135635Tz {
    public static final C45900Hzs LLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC44139HTz LJLLILLLL;
    public MutableLiveData<List<MediaModel>> LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final C5H3 LJZ;
    public final ChooseMediaViewModel LJZI;
    public final InterfaceC65784Pro<C45895Hzn> LJZL;
    public final InterfaceC65784Pro<C45897Hzp> LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final C5H3 LLFF;
    public int LLFFF;
    public final Bundle LLFII;
    public boolean LLFZ;

    static {
        TBT tbt = new TBT(C45888Hzg.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, new TBT(C45888Hzg.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C45888Hzg.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C45888Hzg.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new TBT(C45888Hzg.class, "dockBarApiComponent", "getDockBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0), new TBT(C45888Hzg.class, "lighteningControlProgressApiComponent", "getLighteningControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0)};
        LLI = new C45900Hzs();
    }

    private final AbstractBinderC44127HTn LLF() {
        return (AbstractBinderC44127HTn) this.LLFF.getValue();
    }

    private final void LLIZ() {
        this.LJZI.Iv0(this, new TBT() { // from class: X.Hzf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 123));
        this.LJZI.Iv0(this, new TBT() { // from class: X.Hze
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 124));
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLZ.LIZ(this, LLIFFJFJJ[3]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLLLLL.LIZ(this, LLIFFJFJJ[2]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLLL.LIZ(this, LLIFFJFJJ[0]);
    }

    public final InterfaceC45889Hzh LJZI() {
        return (InterfaceC45889Hzh) this.LLD.LIZ(this, LLIFFJFJJ[4]);
    }

    public final InterfaceC45891Hzj LLFFF() {
        return (InterfaceC45891Hzj) this.LLF.LIZ(this, LLIFFJFJJ[5]);
    }

    public final ExtendAlbumScene LLIFFJFJJ() {
        return (ExtendAlbumScene) this.LJZ.getValue();
    }

    public final void LLIILZL() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLFII;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("search_entrance");
        } else {
            str = null;
        }
        jSONObject.put("search_entrance", str);
        Bundle bundle2 = this.LLFII;
        if (bundle2 != null) {
            str2 = bundle2.getString("source_page_name");
        }
        jSONObject.put("source_page_name", str2);
        jSONObject.put("slide_direction", "downward");
        FMX.LJIILJJIL("album_extend_slide", jSONObject);
        hide();
    }

    public final void LLILL() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLFII;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("search_entrance");
        } else {
            str = null;
        }
        jSONObject.put("search_entrance", str);
        Bundle bundle2 = this.LLFII;
        if (bundle2 != null) {
            str2 = bundle2.getString("source_page_name");
        }
        jSONObject.put("source_page_name", str2);
        jSONObject.put("slide_direction", "upward");
        FMX.LJIILJJIL("album_extend_slide", jSONObject);
        getCameraApiComponent().tn0(new HU4(this));
        LLIZ();
    }

    public final void LLILZIL() {
        if (!this.LLFZ) {
            return;
        }
        C0Y1.LIZ(new AqS157S0100000_7(this, 243));
        this.LLFZ = false;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLLL.LIZ(this, LLIFFJFJJ[1]);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        if (!this.LLFZ) {
            return;
        }
        C0Y1.LIZ(new AqS157S0100000_7(this, 242));
        this.LLFZ = false;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        if (this.LLFZ) {
            return;
        }
        C0Y1.LIZ(new AqS157S0100000_7(this, 246));
        this.LLFZ = true;
    }

    private final void LLIIIL() {
        f10().observe(this, new AObserverS75S0100000_7(this, 24));
        getPlanCUIApiComponent().pL().LIZLLL(this, new AObjectS86S0100000_7(this, 63));
        this.LJZI.Iv0(this, new TBT() { // from class: X.Hzm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 122));
    }

    public final void LJLZ() {
        getCameraApiComponent().jL().LIZJ(I0E.EXTEND_ALBUM_SCENE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_ALBUM_OPEN_EXTEND_ALBUM, EnumC158826Le.PAGE_INVISIBLE));
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLIIIL();
    }

    public final void openCameraByAlbumClosed() {
        getCameraApiComponent().jL().LIZIZ(I0E.EXTEND_ALBUM_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_BY_ALBUM_CLOSE_EXTEND_ALBUM, null));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C45895Hzn> LJJLIIIJJI() {
        return this.LJZL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C45897Hzp> LJJLIIIJJIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC44139HTz
    public MutableLiveData<List<MediaModel>> f10() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC44139HTz
    public void Hm0(MutableLiveData<List<MediaModel>> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.LJLLJ = mutableLiveData;
    }

    public final void LLIIZ(MediaModel mediaModel) {
        String str;
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            C26045AKb c26045AKb = new C26045AKb(getActivity());
            c26045AKb.LJIIIIZZ(R.string.ha1);
            c26045AKb.LJIIJ();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("return_ecommerce_photo_search_model", new ReturnEcommercePhotoSearchModel(PageType.ALBUM, C44694HgQ.LJIIL(mediaModel), C78605Ut7.LIZLLL(), C78605Ut7.LJFF("android.permission.CAMERA"), "choose_album_extend_panel"));
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLFII;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("search_entrance");
        } else {
            str = null;
        }
        jSONObject.put("search_entrance", str);
        Bundle bundle2 = this.LLFII;
        if (bundle2 != null) {
            str2 = bundle2.getString("source_page_name");
        }
        jSONObject.put("source_page_name", str2);
        jSONObject.put("album_type", "extend_panel");
        jSONObject.put("click_type", "click");
        FMX.LJIILJJIL("album_photo_click", jSONObject);
        AbstractBinderC44127HTn LLF = LLF();
        if (LLF != null) {
            LLF.LIZLLL(getActivity(), intent);
        }
        LLILZIL();
    }

    public final void LLILZLL(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            i = marginLayoutParams2.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.bottomMargin = i - this.LLFFF;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45888Hzg(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = this;
        this.LJLLJ = new MutableLiveData<>();
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 244));
        JediViewModel LIZ = C163726bg.LIZIZ(getActivity(), parentScene).LIZ(ChooseMediaViewModel.class);
        o.LJIIIIZZ(LIZ, "of(parentScene, activity…diaViewModel::class.java)");
        this.LJZI = (ChooseMediaViewModel) LIZ;
        this.LJZL = new AqS157S0100000_7(this, 240);
        this.LL = new AqS157S0100000_7(this, 245);
        this.LLD = UCI.LJI(getDiContainer(), InterfaceC45889Hzh.class, null);
        this.LLF = UCI.LJI(getDiContainer(), InterfaceC45891Hzj.class, null);
        this.LLFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 241));
        this.LLFII = C16880lQ.LJJLIIIIJ(getActivity().getIntent(), "extraParams");
    }

    public final void LLJ(View view, int i) {
        int i2 = 0;
        ValueAnimator ofInt = ObjectAnimator.ofInt(0, i);
        ofInt.setDuration(300L);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        ofInt.addUpdateListener(new AUListenerS69S0101000_7(view, i2, 0));
        ofInt.start();
    }
}
