package X;

import Y.AObjectS86S0100000_7;
import Y.AObjectS89S0100000_14;
import Y.AObserverS64S0101000_14;
import Y.AObserverS82S0100000_14;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.google.gson.Gson;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83113Wjd extends AbstractC29891Fh<I37> implements InterfaceC135635Tz, I37, C0IA {
    public static final /* synthetic */ InterfaceC74236TBo[] LLIIIILZ;
    public static final C83136Wk0 LLIIIJ;
    public final I37 LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public boolean LJLJJL;
    public AbstractC82921WgX LJLJJLL;
    public C83117Wjh LJLJL;
    public InterfaceC83115Wjf LJLJLJ;
    public final C81017Vqv<BeautyComposerInfo> LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final C83116Wjg LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final List<InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, Boolean>> LJLLLL;
    public InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, Boolean> LJLLLLLL;
    public BeautyMetadata LJLZ;
    public final C29901Fi<HYL> LJZ;
    public boolean LJZI;
    public String LJZL;
    public int LL;
    public int LLD;
    public boolean LLF;
    public final C82622Wbi LLFF;
    public final boolean LLFFF;
    public final boolean LLFII;
    public final InterfaceC65784Pro<InterfaceC84497XEf> LLFZ;
    public final InterfaceC88472Yns<Boolean, String> LLI;
    public final InterfaceC83139Wk3 LLIFFJFJJ;
    public final C5NP LLII;
    public final InterfaceC65784Pro<C76800UCe> LLIIII;

    static {
        TBT tbt = new TBT(C83113Wjd.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt, new TBT(C83113Wjd.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C83113Wjd.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};
        LLIIIJ = new C83136Wk0();
    }

    private final void LJJLIIJ() {
        C83175Wkd.LIZ = null;
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LJLJJI.LIZ(this, LLIIIILZ[2]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJI.LIZ(this, LLIIIILZ[1]);
    }

    @Override // X.I37
    public boolean LLJILJILJ() {
        return true;
    }

    @Override // X.I37
    public void aU() {
        HE(true);
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            String panel = this.LLI.invoke(this.LJLLI.LJI.invoke());
            boolean z = this.LLFII;
            C83124Wjo c83124Wjo = new C83124Wjo(this);
            o.LJIIIZ(panel, "panel");
            c83117Wjh.LIZ = true;
            c83117Wjh.LIZJ.L7(panel, z, c83124Wjo);
            return;
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLILLLLZI.LIZ(this, LLIIIILZ[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        C83175Wkd.LIZIZ("detachBeautyManager");
        LJJLIIJ();
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.LIZJ.release();
            super.onDestroy();
        } else {
            o.LJIJI("beautyManager");
            throw null;
        }
    }

    private final void LJJLIIIJILLIZJL() {
        C83175Wkd.LIZ = new C83118Wji(this);
    }

    private final void LJJLIIIJJI() {
        String str = "";
        BeautyFilterConfig beautyFilterConfig = new BeautyFilterConfig(this.LJLLI.LJ.invoke().intValue(), "", this.LJLLI.LJI.invoke().booleanValue());
        this.LJLLI.getClass();
        beautyFilterConfig.setPrimaryBeautyPanelEnable(false);
        this.LJLLI.getClass();
        beautyFilterConfig.setBeautyMobAddConfig(false);
        this.LJLLI.getClass();
        beautyFilterConfig.setBeautyMainSwitchConfig(false);
        this.LJLLI.getClass();
        beautyFilterConfig.setBeautyOptimizeEffectChange(0);
        beautyFilterConfig.setBeautyDownloadToThread(this.LJLLI.LJIIZILJ);
        this.LJLLI.getClass();
        beautyFilterConfig.setBeautyEffectOptimize(false);
        beautyFilterConfig.setULike2ComposerTagValueConvert(true);
        beautyFilterConfig.setConvertKey(true);
        beautyFilterConfig.setItemShape(this.LJLLI.LJFF.invoke().intValue());
        beautyFilterConfig.setGetChildrenInitBeautyValueVBlock(this.LJLLI.LJIJJ);
        boolean booleanValue = this.LJLLI.LIZJ.invoke().booleanValue();
        C83138Wk2 c83138Wk2 = new C83138Wk2();
        c83138Wk2.LIZ = new C83167WkV(C78688UuS.LJJIII(this), this.LJLLI.LIZ.invoke(), this.LJLLI.LIZIZ.invoke(), this.LJLLI.LJ.invoke().intValue(), booleanValue).LIZ;
        beautyFilterConfig.setDataConfig(c83138Wk2);
        beautyFilterConfig.setUpdateComposerNodesInterceptor(this.LJLLLLLL);
        this.LJLLI.getClass();
        C83116Wjg c83116Wjg = this.LJLLI;
        String key = c83116Wjg.LJIJI;
        InterfaceC83159WkN manager = c83116Wjg.LJIILLIIL;
        if (!c83116Wjg.LIZLLL.invoke().booleanValue()) {
            manager.LJIIIZ(true);
        }
        InterfaceC65784Pro<InterfaceC84497XEf> provider = this.LLFZ;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(provider, "provider");
        C83120Wjk c83120Wjk = new C83120Wjk();
        c83120Wjk.LIZIZ = key;
        c83120Wjk.LIZJ = beautyFilterConfig;
        c83120Wjk.LIZ = manager;
        c83120Wjk.LJ = provider;
        Gson gson = (Gson) EJM.LIZ.getValue();
        o.LJIIIZ(gson, "gson");
        c83120Wjk.LIZLLL = gson;
        beautyFilterConfig.getDataConfig().getClass();
        BeautyFilterConfig beautyFilterConfig2 = c83120Wjk.LIZJ;
        if (beautyFilterConfig2 != null) {
            InterfaceC83159WkN interfaceC83159WkN = c83120Wjk.LIZ;
            if (interfaceC83159WkN == null) {
                if (!o.LJ(c83120Wjk.LIZIZ, "record")) {
                    str = c83120Wjk.LIZIZ;
                }
                interfaceC83159WkN = new C83148WkC(str);
                c83120Wjk.LIZ = interfaceC83159WkN;
            }
            Gson gson2 = c83120Wjk.LIZLLL;
            if (gson2 != null) {
                InterfaceC65784Pro<? extends InterfaceC84497XEf> interfaceC65784Pro = c83120Wjk.LJ;
                if (interfaceC65784Pro != null) {
                    C83146WkA c83146WkA = new C83146WkA(interfaceC83159WkN, beautyFilterConfig2, gson2, interfaceC65784Pro);
                    InterfaceC83166WkU filter = c83120Wjk.LJFF;
                    o.LJIIIZ(filter, "filter");
                    c83146WkA.LJIILLIIL = filter;
                    this.LJLJL = new C83117Wjh(c83120Wjk.LIZIZ, c83146WkA, interfaceC83159WkN);
                    this.LLIFFJFJJ.LIZ();
                    aU();
                    InterfaceC83727WtX effectController = getCameraApiComponent().getEffectController();
                    o.LJIIIZ(effectController, "effectController");
                    C83185Wkn c83185Wkn = new C83185Wkn(effectController);
                    WRP filterApiComponent = getFilterApiComponent();
                    C83117Wjh c83117Wjh = this.LJLJL;
                    if (c83117Wjh != null) {
                        this.LJLJJLL = new C83111Wjb(c83185Wkn, filterApiComponent, c83117Wjh, this, this.LLII, this.LJLLI.LJIILIIL, beautyFilterConfig.getBeautySwitchStatus());
                        return;
                    } else {
                        o.LJIJI("beautyManager");
                        throw null;
                    }
                }
                "effectPlatformProvider must be set".toString();
                throw new IllegalStateException("effectPlatformProvider must be set");
            }
            "gson must be set".toString();
            throw new IllegalStateException("gson must be set");
        }
        "beautyFilterConfig must be set".toString();
        throw new IllegalStateException("beautyFilterConfig must be set");
    }

    private final void LJJLJ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLIIII;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.I37
    public String AB() {
        return this.LJLLI.LJIJ;
    }

    @Override // X.I37
    public boolean Ac0() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh == null || c83117Wjh.LIZLLL().getValue() == null) {
            return false;
        }
        return true;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int B1() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.B1();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37
    public boolean Bh0() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            if (!c83117Wjh.LIZ || c83117Wjh.LIZLLL.LJIIJJI() >= 3) {
                return false;
            }
            return true;
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    @Override // X.I37
    public void Gf0() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.LIZJ.J7(new C83123Wjn(this));
        } else {
            o.LJIJI("beautyManager");
            throw null;
        }
    }

    @Override // X.I37
    public InterfaceC88471Ynr<Context, String, C76800UCe> Gk() {
        this.LJLLI.getClass();
        return null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int K6() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.K6();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37
    public void U5() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.U5();
        } else {
            o.LJIJI("beautyManager");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int X() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.X();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public boolean X4() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.X4();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public boolean a4() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.a4();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37
    public boolean b40() {
        return this.LJLLI.LJIIL;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public boolean b7() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.b7();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int d3() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.d3();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int e5() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.e5();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37
    public InterfaceC83142Wk6 f7() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            return c83117Wjh.LIZJ;
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public boolean f9() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.f9();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37
    public BeautyMetadata j7() {
        this.LJLLI.getClass();
        if (this.LJLLI.LIZJ.invoke().booleanValue() && (this.LL == 0 || (!b40() && this.LL == -1))) {
            AbstractC82921WgX abstractC82921WgX = this.LJLJJLL;
            if (abstractC82921WgX != null) {
                BeautyMetadata LIZ = abstractC82921WgX.LIZ();
                LIZ.setBeautyId("");
                LIZ.setBeautyName("");
                LIZ.setBeautyRes("");
                LIZ.setBeautyStrength("");
                LIZ.setBeautyValid("");
                this.LJLZ = LIZ;
                return LIZ;
            }
            o.LJIJI("beautyPresenter");
            throw null;
        }
        AbstractC82921WgX abstractC82921WgX2 = this.LJLJJLL;
        if (abstractC82921WgX2 != null) {
            BeautyMetadata LIZ2 = abstractC82921WgX2.LIZ();
            this.LJLZ = LIZ2;
            o.LJIIIIZZ(LIZ2, "beautyPresenter.beautyMe…lastBeautyMetadata = it }");
            return LIZ2;
        }
        o.LJIJI("beautyPresenter");
        throw null;
    }

    @Override // X.I37
    public String k9() {
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            return c83117Wjh.LIZIZ;
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void n5() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.n5();
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void qg0() {
        AbstractC82921WgX abstractC82921WgX = this.LJLJJLL;
        if (abstractC82921WgX != null) {
            if (!this.LLFFF) {
                abstractC82921WgX.getClass();
                return;
            }
            if (!abstractC82921WgX.LIZIZ.i7()) {
                return;
            }
            if (!abstractC82921WgX.LIZLLL) {
                abstractC82921WgX.LIZIZ.K(false, ILU.CUR);
                abstractC82921WgX.LJIIIIZZ = this;
                if (abstractC82921WgX.LIZIZ.i7()) {
                    abstractC82921WgX.LIZIZ.LIZLLL().safeObserve(this, new AObserverS82S0100000_14(abstractC82921WgX, 2));
                    abstractC82921WgX.LIZIZ.h7().safeObserve(this, new AObserverS64S0101000_14(0, abstractC82921WgX, 2));
                }
                abstractC82921WgX.LIZLLL = true;
                return;
            }
            abstractC82921WgX.LIZIZ.U5();
            return;
        }
        o.LJIJI("beautyPresenter");
        throw null;
    }

    @Override // X.I37
    public boolean tg0() {
        this.LJLLI.getClass();
        return false;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int v1() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.v1();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int x2() {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.x2();
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    private final void LJJLJLI() {
        C0IB<FilterBean> curSelectedFilter;
        LiveEvent<C44262HYs> filterUpdateEvent;
        WRP wrp = (WRP) getDiContainer().LJIIIIZZ(null, WRP.class);
        if (wrp != null && (filterUpdateEvent = wrp.getFilterUpdateEvent()) != null) {
            filterUpdateEvent.LIZLLL(this, new AObjectS86S0100000_7(this, 0));
        }
        WRP wrp2 = (WRP) getDiContainer().LJIIIIZZ(null, WRP.class);
        if (wrp2 != null && (curSelectedFilter = wrp2.getCurSelectedFilter()) != null) {
            curSelectedFilter.LIZIZ(this, new AObjectS89S0100000_14(this, 5));
        }
    }

    public final void LJJLIIIJLLLLLLLZ() {
        Boolean LIZ = getCameraApiComponent().bh().LIZ();
        Boolean value = this.LJLL.getValue();
        if (LIZ != null && LIZ.booleanValue() && value != null && value.booleanValue()) {
            qg0();
        }
    }

    public final void LJJLL() {
        if (Bh0()) {
            getCameraApiComponent().e8().getEffectController().ha(new C83119Wjj(this));
        }
    }

    @Override // X.I37
    public boolean Py() {
        f7().f8();
        return true;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJILLIZJL();
        LJJLJ();
        LJJLIIIJJI();
        InterfaceC83142Wk6 f7 = f7();
        this.LJLLI.getClass();
        f7.a8();
        AbstractC82921WgX abstractC82921WgX = this.LJLJJLL;
        if (abstractC82921WgX != null) {
            InterfaceC83115Wjf interfaceC83115Wjf = abstractC82921WgX.LIZ;
            o.LJIIIIZZ(interfaceC83115Wjf, "beautyPresenter.beautyModule");
            this.LJLJLJ = interfaceC83115Wjf;
            if (this.LJLJL != null) {
                C83175Wkd.LIZIZ("attachBeautyManager");
                getCameraApiComponent().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 2));
                this.LJLL.observe(this, new AObserverS82S0100000_14(this, 4));
                getCameraApiComponent().Ch0().LIZLLL(this, new AObjectS89S0100000_14(this, 3));
                if (getDiContainer().LIZIZ(I3X.class)) {
                    whenReadyOrThrowInternal(getDiContainer(), I3X.class, new AqS180S0100000_14(this, 21));
                }
                getCameraApiComponent().xf0().LIZLLL(this, new AObjectS89S0100000_14(this, 4));
                LJJLJLI();
                return;
            }
            o.LJIJI("beautyManager");
            throw null;
        }
        o.LJIJI("beautyPresenter");
        throw null;
    }

    @Override // X.I37
    public /* bridge */ /* synthetic */ LiveEvent Hg0() {
        return this.LJZ;
    }

    @Override // X.I37
    public boolean Mp0() {
        return this.LJLLL;
    }

    @Override // X.I37
    public boolean Oi0() {
        return this.LLF;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I37 getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLFF;
    }

    @Override // X.I37
    public int rv() {
        return this.LLD;
    }

    public static final /* synthetic */ C83117Wjh LJJLI(C83113Wjd c83113Wjd) {
        C83117Wjh c83117Wjh = c83113Wjd.LJLJL;
        if (c83117Wjh != null) {
            return c83117Wjh;
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    private final void LJJZZI(ILU ilu) {
        C43045Guv.LIZLLL(new AqS161S0200000_14(this, ilu, 4), 0L);
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void D4(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.D4(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void E1(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.E1(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void G3(boolean z) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.G3(z);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void HE(boolean z) {
        this.LJLLL = z;
    }

    @Override // X.I37
    public void Jm0(InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, Boolean> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLLLL.remove(interceptor);
    }

    @Override // X.I37
    public void Ku(boolean z) {
        getCameraApiComponent().zZ().mUseBeautyFace = z;
        f7().H7(z);
        this.LL = z ? 1 : 0;
        AbstractC82921WgX abstractC82921WgX = this.LJLJJLL;
        if (abstractC82921WgX != null) {
            abstractC82921WgX.LIZJ(false);
        } else {
            o.LJIJI("beautyPresenter");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void L0(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.L0(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    public final void LJJLIIIIJ(boolean z) {
        if (this.LJZI != z) {
            this.LJZI = z;
            int i = this.LL;
            if (i != -1) {
                boolean z2 = true;
                if (i != 1) {
                    z2 = false;
                }
                Ku(z2);
            }
        }
    }

    public final void LJJLIIIJJIZ(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        Float invoke;
        if (this.LJLLJ) {
            return;
        }
        if (aSSimpleFaceInfoArr == null || aSSimpleFaceInfoArr.length == 0) {
            this.LJLLILLLL = 0;
            return;
        }
        int i = this.LJLLILLLL + 1;
        this.LJLLILLLL = i;
        if (i != 6) {
            return;
        }
        for (ASSimpleFaceInfo aSSimpleFaceInfo : aSSimpleFaceInfoArr) {
            if (aSSimpleFaceInfo != null && (invoke = this.LJLLI.LJIIJJI.invoke()) != null && aSSimpleFaceInfo.boyProb <= invoke.floatValue()) {
                LJJZZI(ILU.FEMALE);
                this.LJLLJ = true;
                return;
            }
        }
        LJJZZI(ILU.MALE);
        this.LJLLJ = true;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void N2(boolean z) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.N2(z);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void R50(boolean z) {
        this.LJLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.I37
    public void Vv(InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, Boolean> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLLLL.add(interceptor);
    }

    @Override // X.I37
    public void X2(String value) {
        o.LJIIIZ(value, "value");
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.getClass();
            c83117Wjh.LIZIZ = value;
        } else {
            o.LJIJI("beautyManager");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void Y4(boolean z) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.Y4(z);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void Yt0(boolean z) {
        if (!Py() || z) {
            f7().e8();
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void Z6(boolean z) {
        if (z) {
            a(C82922WgY.LIZ(f7().z7()), 10000);
        } else {
            a(this.LJLJLLL, 10000);
        }
    }

    @Override // X.I37
    public BeautyMetadata aC(boolean z) {
        BeautyMetadata beautyMetadata = this.LJLZ;
        if (beautyMetadata != null && z) {
            return beautyMetadata;
        }
        return j7();
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void c5(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.c5(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void m7(boolean z) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.m7(z);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void o8(boolean z) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.o8(z);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void ps0(boolean z) {
        if (Py() || z) {
            f7().n7();
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void q6(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.q6(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void x0(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.x0(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void y1(int i) {
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.y1(i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void K(boolean z, ILU gender) {
        o.LJIIIZ(gender, "gender");
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.K(z, gender);
        } else {
            o.LJIJI("beautyManager");
            throw null;
        }
    }

    @Override // X.I37
    public void KT(C82942Wgs beautySequence, boolean z) {
        o.LJIIIZ(beautySequence, "beautySequence");
        C83117Wjh c83117Wjh = this.LJLJL;
        if (c83117Wjh != null) {
            c83117Wjh.getClass();
            if (z) {
                c83117Wjh.LIZJ.l7(beautySequence);
                return;
            } else {
                c83117Wjh.LIZJ.D7(beautySequence);
                return;
            }
        }
        o.LJIJI("beautyManager");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public int[] LLII(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            return interfaceC83115Wjf.LLII(nodePath, nodeKey);
        }
        o.LJIJI("beautyModule");
        throw null;
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void LLILLL(List<BeautyComposerInfo> newNodes, int i) {
        o.LJIIIZ(newNodes, "newNodes");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.LLILLL(newNodes, i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void LLLLIIL(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.LLLLIIL(nodes, i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void a(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.a(nodes, i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void i(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.i(nodes, i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37
    public void of(boolean z, boolean z2) {
        this.LJLJJL = z2;
        Ku(z);
    }

    @Override // X.I37
    public void tk0(boolean z, boolean z2) {
        int i;
        int i2;
        this.LLF = z2;
        Context context = (Context) getDiContainer().LJ(ActivityC45651qj.class, null);
        if (this.LJLLI.LJIILJJIL) {
            if (z2) {
                TMB tmb = C82890Wg2.LJFF;
                if (z) {
                    i2 = R.string.dhu;
                } else {
                    i2 = R.string.dht;
                }
                tmb.getClass();
                TMB.LIZJ(i2, 0, context).LIZ();
            } else {
                TMB tmb2 = C82890Wg2.LJFF;
                if (z) {
                    i = R.string.c59;
                } else {
                    i = R.string.c53;
                }
                tmb2.getClass();
                TMB.LIZJ(i, 0, context).LIZ();
            }
        }
        if (z) {
            Ku(true);
        } else {
            Ku(false);
        }
        this.LJZ.LJII(new HYM(z));
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void LLIIJI(List<BeautyComposerInfo> oldNodes, List<BeautyComposerInfo> newNodes, int i) {
        o.LJIIIZ(oldNodes, "oldNodes");
        o.LJIIIZ(newNodes, "newNodes");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.LLIIJI(oldNodes, newNodes, i);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    @Override // X.I37, X.InterfaceC83115Wjf
    public void LLLFF(String path, String nodeTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(nodeTag, "nodeTag");
        InterfaceC83115Wjf interfaceC83115Wjf = this.LJLJLJ;
        if (interfaceC83115Wjf != null) {
            interfaceC83115Wjf.LLLFF(path, nodeTag, f);
        } else {
            o.LJIJI("beautyModule");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83113Wjd(C82622Wbi diContainer, boolean z, boolean z2, InterfaceC65784Pro<? extends InterfaceC84497XEf> epProvider, InterfaceC88472Yns<? super Boolean, String> defaultPanel, InterfaceC83139Wk3 logicStore, C5NP logger, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super C83116Wjg, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(epProvider, "epProvider");
        o.LJIIIZ(defaultPanel, "defaultPanel");
        o.LJIIIZ(logicStore, "logicStore");
        o.LJIIIZ(logger, "logger");
        this.LLFF = diContainer;
        this.LLFFF = z;
        this.LLFII = z2;
        this.LLFZ = epProvider;
        this.LLI = defaultPanel;
        this.LLIFFJFJJ = logicStore;
        this.LLII = logger;
        this.LLIIII = interfaceC65784Pro;
        this.LJLIL = this;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), WRP.class, null);
        this.LJLJJL = true;
        this.LJLJLLL = new C81017Vqv<>();
        this.LJLL = new MutableLiveData<>();
        C83116Wjg c83116Wjg = new C83116Wjg();
        this.LJLLI = c83116Wjg;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c83116Wjg);
        }
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = new AqS180S0100000_14(this, 22);
        this.LJZ = new C29901Fi<>();
        this.LJZL = "";
        this.LL = -1;
    }

    public /* synthetic */ C83113Wjd(C82622Wbi c82622Wbi, boolean z, boolean z2, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83139Wk3 interfaceC83139Wk3, C5NP c5np, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, z, (i & 4) != 0 ? false : z2, interfaceC65784Pro, interfaceC88472Yns, (i & 32) != 0 ? new C82524Wa8() : interfaceC83139Wk3, (i & 64) != 0 ? C82523Wa7.LIZ : c5np, (i & 128) != 0 ? null : interfaceC65784Pro2, (i & 256) == 0 ? interfaceC88472Yns2 : null);
    }
}
