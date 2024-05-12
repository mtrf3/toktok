package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.AfS66S0100000_14;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRO extends WRN {
    public static final C82290WRi LJZI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public EnumC45994I3i LJLJLJ;
    public int LJLJLLL;
    public final WRL LJLL;
    public FilterBean LJLLI;
    public FilterBean LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public InterfaceC92693kP LJLLLL;
    public FilterBean LJLLLLLL;
    public final InterfaceC82236WPg LJLZ;
    public final InterfaceC115514g7 LJZ;

    static {
        TBT tbt = new TBT(WRO.class, "filterComponentAdapter", "getFilterComponentAdapter()Lcom/ss/android/ugc/aweme/filter/adapter/INowsFilterComponentAdapter;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt, new TBT(WRO.class, "beautyComponentApi", "getBeautyComponentApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new TBT(WRO.class, "recordModeStateStore", "getRecordModeStateStore()Lcom/ss/android/ugc/aweme/nows/combination/RecordModeStateStore;", 0)};
        LJZI = new C82290WRi();
    }

    private final I37 LJJLI() {
        return (I37) this.LJLLL.LIZ(this, LJZL[1]);
    }

    private final WRX LJJZZI() {
        return (WRX) this.LJLLJ.LIZ(this, LJZL[0]);
    }

    private final InterfaceC81640W2i LJJZZIII() {
        return (InterfaceC81640W2i) this.LJZ.LIZ(this, LJZL[2]);
    }

    private final void LJLIIL() {
        if (this.LJLLLL == null) {
            this.LJLLLL = this.LJLZ.LJJJLIIL().LJ(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS66S0100000_14(this, 12), C73674Svm.LIZLLL);
        }
    }

    public final void LJJLIIJ() {
        FilterBean filterBean;
        if (this.LJLJLJ == EnumC45994I3i.NOWS) {
            if (getCameraApiComponent().getCameraFacing() == 0) {
                FilterBean filterBean2 = this.LJLLILLLL;
                if (filterBean2 != null) {
                    LJLJJL(filterBean2);
                    return;
                }
                return;
            }
            if (getCameraApiComponent().getCameraFacing() != 1 || (filterBean = this.LJLLI) == null) {
                return;
            }
            LJLJJL(filterBean);
            return;
        }
        cleanFilterChosen();
    }

    private final String LJJLL() {
        int cameraFacing = getCameraApiComponent().getCameraFacing();
        if (cameraFacing != 0) {
            if (cameraFacing != 1) {
                return "";
            }
            return "1";
        }
        return "2";
    }

    @Override // X.WRN, X.WRM, X.AbstractC29891Fh
    public void onCreate() {
        C40871j1 LIZIZ;
        super.onCreate();
        InterfaceC81640W2i LJJZZIII = LJJZZIII();
        if (LJJZZIII != null && (LIZIZ = LJJZZIII.LIZIZ()) != null) {
            LIZIZ.LIZIZ(this, new AObjectS89S0100000_14(this, 21));
        }
        this.LJLL.LIZ.LJJJJIZL().LIZJ().observe(this, new AObserverS82S0100000_14(this, 14));
        getCameraApiComponent().uB().LIZLLL(this, new AObjectS89S0100000_14(this, 22));
    }

    private final boolean LJJLJ(FilterBean filterBean) {
        if (o.LJ(filterBean.getCategoryExtra().getCameraFacing(), LJJLL())) {
            String abGroup = filterBean.getCategoryExtra().getAbGroup();
            FFL.LJIIIZ().getClass();
            if (o.LJ(abGroup, String.valueOf(FFL.LJIIJ(31744, 1, "studio_ttn_filter_effect_group", true)))) {
                return true;
            }
        }
        return false;
    }

    private final void LJLJJL(FilterBean filterBean) {
        if (TMC.LJJIII(filterBean, this.LJLZ)) {
            setFilterChosenInternal(filterBean, null, false, false, true, false);
        } else {
            this.LJLLLLLL = filterBean;
            this.LJLZ.LJIJJ(filterBean);
        }
        if (this.LJLLLLLL != null) {
            LJLIIL();
        }
    }

    @Override // X.WRN, X.WRM
    public void actualApplyFilter2Camera(WRR wrr) {
        WRX LJJZZI = LJJZZI();
        if (wrr == null) {
            LJJZZI.Q4(this.curSelectedFilter.LIZ());
            return;
        }
        if (C140465fG.LIZ() && !LJJLI().Ac0()) {
            return;
        }
        wrr.LJLIL.setFilterFolder(wrr.LJLJI);
        Float f = wrr.LJLJJI;
        if (f == null) {
            LJJZZI.a1(wrr.LJLIL, null);
        } else {
            LJJZZI.a1(wrr.LJLIL, f);
        }
    }

    @Override // X.WRN, X.WRM
    public FilterBean getFilterFromLogicStore(WPD source) {
        List list;
        o.LJIIIZ(source, "source");
        InterfaceC82284WRc interfaceC82284WRc = source.LJLJJI;
        if (interfaceC82284WRc instanceof WRF) {
            String LJFF = ((WRF) interfaceC82284WRc).LJFF(getCameraApiComponent().getCameraFacing());
            Object obj = null;
            if (LJFF == null || (list = (List) source.LJLILLLLZI.LJJJJIZL().LIZJ().getValue()) == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                FilterBean filterBean = (FilterBean) next;
                if (o.LJ(filterBean.getResId(), LJFF) && LJJLJ(filterBean)) {
                    obj = next;
                    break;
                }
            }
            return (FilterBean) obj;
        }
        return super.getFilterFromLogicStore(source);
    }

    public final FilterBean LJJLJLI(List<? extends FilterBean> list, String str) {
        FilterBean filterBean;
        Iterator<? extends FilterBean> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                filterBean = it.next();
                FilterBean filterBean2 = filterBean;
                if (o.LJ(filterBean2.getCategoryExtra().getCameraFacing(), str)) {
                    String abGroup = filterBean2.getCategoryExtra().getAbGroup();
                    FFL.LJIIIZ().getClass();
                    if (o.LJ(abGroup, String.valueOf(FFL.LJIIJ(31744, 1, "studio_ttn_filter_effect_group", true)))) {
                        break;
                    }
                }
            } else {
                filterBean = null;
                break;
            }
        }
        return filterBean;
    }

    @Override // X.WRN, X.WRM
    public void actualSetFilterScroll(WRR leftFilter, WRR rightFilter, float f) {
        float f2;
        o.LJIIIZ(leftFilter, "leftFilter");
        o.LJIIIZ(rightFilter, "rightFilter");
        WRQ R4 = LJJZZI().R4();
        FilterBean filterBean = leftFilter.LJLIL;
        Float f3 = leftFilter.LJLJJI;
        float f4 = 0.0f;
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            f2 = 0.0f;
        }
        WRT wrt = new WRT(filterBean, f2, leftFilter.LJLILLLLZI);
        FilterBean filterBean2 = rightFilter.LJLIL;
        Float f5 = rightFilter.LJLJJI;
        if (f5 != null) {
            f4 = f5.floatValue();
        }
        R4.In(wrt, new WRT(filterBean2, f4, rightFilter.LJLILLLLZI), f);
    }

    @Override // X.WRN, X.WRM
    public void setChosenFilterFromStoreInternal(boolean z, boolean z2, boolean z3) {
        WPD value;
        if (!isCurrentFilterSourceDisable() && (value = this._currentFilterSource.getValue()) != null) {
            FilterBean filterFromLogicStore = getFilterFromLogicStore(value);
            if (filterFromLogicStore != null && LJJLJ(filterFromLogicStore)) {
                setFilterChosenInternal(filterFromLogicStore, null, z, false, z2, z3);
            } else {
                cleanFilterChosen();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WRO(C82622Wbi objectContainer, C29S activity, WRL buildIn, InterfaceC88472Yns<? super WRR, WRR> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super C82285WRd, C76800UCe> interfaceC88472Yns2) {
        super(objectContainer, activity, buildIn, interfaceC88472Yns, interfaceC65784Pro, interfaceC88472Yns2);
        o.LJIIIZ(objectContainer, "objectContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(buildIn, "buildIn");
        this.LJLJLJ = EnumC45994I3i.NOWS;
        this.LJLJLLL = -1;
        this.LJLL = buildIn;
        this.LJLLJ = UCI.LJI(getDiContainer(), WRX.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJLZ = buildIn.LIZ;
        this.LJZ = UCI.LJII(getDiContainer(), InterfaceC81640W2i.class, null);
    }

    public /* synthetic */ WRO(C82622Wbi c82622Wbi, C29S c29s, WRL wrl, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, c29s, wrl, (i & 8) != 0 ? null : interfaceC88472Yns, (i & 16) != 0 ? null : interfaceC65784Pro, (i & 32) == 0 ? interfaceC88472Yns2 : null);
    }
}
