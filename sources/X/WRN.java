package X;

import Y.AfS63S0200000_14;
import com.ss.android.ugc.aweme.filter.FilterBean;
import defpackage.m0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS103S0300000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public class WRN extends WRM<InterfaceC45305HqH> implements InterfaceC45305HqH, C0IA {
    public static final C82291WRj LJLJJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public static int LJLJL;
    public final InterfaceC115514g7 LJLIL;
    public final C5H3 LJLILLLLZI;
    public FilterBean LJLJI;
    public InterfaceC92693kP LJLJJI;

    static {
        TBT tbt = new TBT(WRN.class, "beautyComponentApi", "getBeautyComponentApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
        LJLJJL = new C82291WRj();
    }

    private final I37 LJJLI() {
        return (I37) this.LJLIL.LIZ(this, LJLJJLL[0]);
    }

    private final WR3 LJJLIIIIJ() {
        return (WR3) this.LJLILLLLZI.getValue();
    }

    private final boolean LJJLIIIJLLLLLLLZ() {
        int LIZ = C00F.LIZ(31744, 0, "creative_tools_avoid_normal_filter_rendering", true);
        if (LIZ != 2 && (LIZ != 1 || LJLJL != 1)) {
            return false;
        }
        return true;
    }

    @Override // X.WRM, X.AbstractC29891Fh
    public void onCreate() {
        HDT hdt;
        super.onCreate();
        WR3 LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 161);
            AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 168);
            String currentPanel = C60903NvH.LJIIJJI().LJIILL().LIZ().get();
            o.LJIIIIZZ(currentPanel, "currentPanel");
            if (s.LJJJLZIJ(currentPanel, "composer", false)) {
                currentPanel = LJJLIIIIJ.LIZLLL.get(currentPanel);
            }
            if (currentPanel == null || m0.LIZLLL("Filter_Data_2_Has_Migrated_", currentPanel, LJJLIIIIJ.LJ, false)) {
                return;
            }
            C60903NvH.LJIIJJI().getRegionService();
            if (!C44296Ha0.LIZIZ().booleanValue()) {
                hdt = new C43113Gw1();
            } else {
                hdt = new HDT();
            }
            WRU wru = new WRU(hdt);
            new C139735e5(new InterfaceC139745e6() { // from class: X.5fC
                @Override // X.InterfaceC139745e6
                public final Object get() {
                    return C60903NvH.LJIIJJI().LJIILL().LIZIZ();
                }
            }, new C45449Hsb(currentPanel)).LIZ(new WR2(LJJLIIIIJ, currentPanel, wru.LIZIZ(1), wru.LIZIZ(0), aqS180S0100000_14, aqS164S0100000_14), C82297WRp.LJLIL);
        }
    }

    private final void LJJLIIIJILLIZJL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InterfaceC82236WPg interfaceC82236WPg;
        WPD value = this._currentFilterSource.getValue();
        if (value == null || (interfaceC82236WPg = value.LJLILLLLZI) == null || this.LJLJJI != null) {
            return;
        }
        this.LJLJJI = interfaceC82236WPg.LJJJLIIL().LJ(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS63S0200000_14(this, interfaceC65784Pro, 0), C73674Svm.LIZLLL);
    }

    @Override // X.WRM
    public void actualApplyFilter2Camera(WRR wrr) {
        if (getCameraApiComponent() instanceof WRQ) {
            InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
            o.LJII(cameraApiComponent, "null cannot be cast to non-null type com.bytedance.creativex.recorder.camera.api.TikTokCameraApiComponent");
            WRQ wrq = (WRQ) cameraApiComponent;
            if (wrr == null) {
                wrq.Q4(this.curSelectedFilter.LIZ());
                return;
            }
            if (C140465fG.LIZ() && !LJJLI().Ac0()) {
                return;
            }
            wrr.LJLIL.setFilterFolder(wrr.LJLJI);
            Float f = wrr.LJLJJI;
            if (f == null) {
                wrq.a1(wrr.LJLIL, null);
                return;
            } else {
                wrq.a1(wrr.LJLIL, f);
                return;
            }
        }
        super.actualApplyFilter2Camera(wrr);
    }

    @Override // X.WRM
    public FilterBean getFilterFromLogicStore(WPD source) {
        Object obj;
        o.LJIIIZ(source, "source");
        InterfaceC82284WRc interfaceC82284WRc = source.LJLJJI;
        if (interfaceC82284WRc instanceof WRF) {
            String LJFF = ((WRF) interfaceC82284WRc).LJFF(getCameraApiComponent().getCameraFacing());
            Object obj2 = null;
            if (LJFF == null) {
                return null;
            }
            List list = (List) source.LJLILLLLZI.LJJJJIZL().LIZJ().getValue();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (o.LJ(((FilterBean) obj).getResId(), LJFF)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                FilterBean filterBean = (FilterBean) obj;
                if (filterBean != null) {
                    return filterBean;
                }
            }
            List list2 = (List) source.LJLILLLLZI.LJJJJIZL().LJ().getValue();
            if (list2 == null) {
                return null;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (o.LJ(((FilterBean) next).getResId(), LJFF)) {
                    obj2 = next;
                    break;
                }
            }
            return (FilterBean) obj2;
        }
        return super.getFilterFromLogicStore(source);
    }

    @Override // X.WRM
    public void actualSaveDefaultFilte(FilterBean filterBean, InterfaceC82284WRc filterLogicStore) {
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(filterLogicStore, "filterLogicStore");
        if (filterLogicStore instanceof WRF) {
            int cameraFacing = getCameraApiComponent().getCameraFacing();
            String resId = filterBean.getResId();
            o.LJIIIIZZ(resId, "filterBean.resId");
            ((WRF) filterLogicStore).LJI(cameraFacing, resId);
            return;
        }
        super.actualSaveDefaultFilte(filterBean, filterLogicStore);
    }

    private final void LJJLIIIJJI(boolean z, boolean z2, boolean z3) {
        WPD value;
        if (!isCurrentFilterSourceDisable() && (value = this._currentFilterSource.getValue()) != null) {
            FilterBean filterFromLogicStore = getFilterFromLogicStore(value);
            if (filterFromLogicStore == null) {
                cleanFilterChosen();
            } else {
                if (TMC.LJJIII(filterFromLogicStore, value.LJLILLLLZI)) {
                    LJJLIIIJJIZ(this, z, z2, z3, filterFromLogicStore);
                    return;
                }
                this.LJLJI = filterFromLogicStore;
                value.LJLILLLLZI.LJIJJ(filterFromLogicStore);
                LJJLIIIJILLIZJL(new WRV(this, z, z2, z3));
            }
        }
    }

    @Override // X.WRM
    public void actualSetFilterScroll(WRR leftFilter, WRR rightFilter, float f) {
        float f2;
        o.LJIIIZ(leftFilter, "leftFilter");
        o.LJIIIZ(rightFilter, "rightFilter");
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        if ((cameraApiComponent instanceof WRQ) && cameraApiComponent != null) {
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
            cameraApiComponent.In(wrt, new WRT(filterBean2, f4, rightFilter.LJLILLLLZI), f);
            return;
        }
        super.actualSetFilterScroll(leftFilter, rightFilter, f);
    }

    @Override // X.WRM
    public void setChosenFilterFromStoreInternal(boolean z, boolean z2, boolean z3) {
        if (this.currentFilter == null && LJJLIIIJLLLLLLLZ()) {
            WPD value = this._currentFilterSource.getValue();
            String str = null;
            if (value != null) {
                FilterBean filterFromLogicStore = getFilterFromLogicStore(value);
                if (filterFromLogicStore != null) {
                    str = filterFromLogicStore.getEnName();
                }
                if (o.LJ("normal", str)) {
                    return;
                }
                LJJLIIIJJI(z, z2, z3);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            LJJLIIIJJI(z, z2, z3);
            return;
        }
        LJJLIIIJJI(z, z2, z3);
    }

    public static final void LJJLIIIJJIZ(WRN wrn, boolean z, boolean z2, boolean z3, FilterBean filterBean) {
        wrn.setFilterChosenInternal(filterBean, null, z, false, z2, z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WRN(C82622Wbi objectContainer, C29S activity, WRL buildIn, InterfaceC88472Yns<? super WRR, WRR> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super C82285WRd, C76800UCe> interfaceC88472Yns2) {
        super(objectContainer, activity, buildIn, interfaceC88472Yns, interfaceC65784Pro, interfaceC88472Yns2);
        o.LJIIIZ(objectContainer, "objectContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(buildIn, "buildIn");
        LJLJL++;
        this.LJLIL = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS103S0300000_14(activity, this, buildIn, 1));
    }

    public /* synthetic */ WRN(C82622Wbi c82622Wbi, C29S c29s, WRL wrl, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, c29s, wrl, (i & 8) != 0 ? null : interfaceC88472Yns, (i & 16) != 0 ? null : interfaceC65784Pro, (i & 32) == 0 ? interfaceC88472Yns2 : null);
    }
}
