package X;

import X.WRP;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class WRM<T extends WRP> extends AbstractC29891Fh<T> implements InterfaceC135635Tz, WRP {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public static final int CHOOSE_NO_FILTER;
    public static final C82289WRh Companion;
    public final MutableLiveData<C76800UCe> _clearFilterData;
    public final C40871j1<FilterBean> _curSelectedFilter;
    public final MutableLiveData<WPD> _currentFilterSource;
    public final MutableLiveData<List<WPD>> _filterSources;
    public final C29901Fi<WRS> _filterSwitchEvent;
    public final C29901Fi<C44262HYs> _filterUpdateEvent;
    public final C29S activity;
    public final T apiComponent;
    public final WRL buildIn;
    public final InterfaceC115514g7 cameraApiComponent$delegate;
    public final MutableLiveData<C76800UCe> clearFilter;
    public final C82285WRd componentConfigure;
    public final C40871j1<FilterBean> curSelectedFilter;
    public OSZ<? extends FilterBean, WPD> currentFilter;
    public final MutableLiveData<WPD> currentFilterSource;
    public final C82622Wbi diContainer;
    public final InterfaceC88472Yns<WRR, WRR> filterApplyInterceptor;
    public final InterfaceC115514g7 filterPanelApi$delegate;
    public final InterfaceC65784Pro<Boolean> filterSetupInterceptor;
    public final MutableLiveData<List<WPD>> filterSources;
    public final C29901Fi<WRS> filterSwitchEvent;
    public final C29901Fi<C44262HYs> filterUpdateEvent;
    public final Observer<List<FilterBean>> pendingFilterResIdSetObserver;
    public final Observer<List<FilterBean>> pendingFilterSetObserver;
    public final InterfaceC115514g7 recordControlApi$delegate;

    static {
        TBT tbt = new TBT(WRM.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(WRM.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(WRM.class, "filterPanelApi", "getFilterPanelApi()Lcom/bytedance/creativex/recorder/filter/api/FilterPanelApi;", 0)};
        Companion = new C82289WRh();
        CHOOSE_NO_FILTER = -1;
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.recordControlApi$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    @Override // X.WRP
    public void cleanFilterChosen() {
        this.currentFilter = null;
        applyFilter2Camera$default(this, null, null, 2, null);
        this._curSelectedFilter.LJI(null);
        this._clearFilterData.setValue(C76800UCe.LIZ);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.cameraApiComponent$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final THT getFilterPanelApi() {
        return (THT) this.filterPanelApi$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    private final WPD buildInFilterSource() {
        String str = this.componentConfigure.LIZIZ;
        WRL wrl = this.buildIn;
        InterfaceC82236WPg interfaceC82236WPg = wrl.LIZ;
        InterfaceC148845sm interfaceC148845sm = wrl.LIZIZ;
        InterfaceC83727WtX asDefaultIntensityGetter = getCameraApiComponent().getEffectController();
        o.LJIIIZ(asDefaultIntensityGetter, "$this$asDefaultIntensityGetter");
        return new WPD(str, interfaceC82236WPg, C73312Spw.LJ(interfaceC148845sm, new C44657Hfp(asDefaultIntensityGetter)), this.buildIn.LIZJ);
    }

    private final void initData() {
        setFilterSourceInternal$default(this, this.componentConfigure.LIZIZ, false, 2, null);
    }

    public final boolean isCurrentFilterSourceDisable() {
        String str;
        WPD value = this._currentFilterSource.getValue();
        if (value != null && (str = value.LJLIL) != null) {
            return isFilterDisableInternal(str);
        }
        return false;
    }

    private final void initObserve() {
        getCameraApiComponent().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 8));
        getCameraApiComponent().Ch0().LIZLLL(this, new AObjectS89S0100000_14(this, 9));
        getCameraApiComponent().uB().LIZLLL(this, new AObjectS89S0100000_14(this, 10));
        if (!getDiContainer().LIZIZ(I3X.class)) {
            return;
        }
        whenReadyOrThrowInternal(getDiContainer(), I3X.class, new AqS180S0100000_14(this, 29));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        initData();
        initObserve();
    }

    @Override // X.WRP
    public void clearFilterChosen() {
        cleanFilterChosen();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ LiveData getClearFilter() {
        return this.clearFilter;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ C0IB getCurSelectedFilter() {
        return this.curSelectedFilter;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ LiveData getCurrentFilterSource() {
        return this.currentFilterSource;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ LiveData getFilterSources() {
        return this.filterSources;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ LiveEvent getFilterSwitchEvent() {
        return this.filterSwitchEvent;
    }

    @Override // X.WRP
    public /* bridge */ /* synthetic */ LiveEvent getFilterUpdateEvent() {
        return this.filterUpdateEvent;
    }

    private final void addFilterSourceInternal(WPD wpd) {
        List<WPD> arrayList;
        List<WPD> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<WPD> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WPD next = it.next();
                if (o.LJ(next.LJLIL, wpd.LJLIL)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        MutableLiveData<List<WPD>> mutableLiveData = this._filterSources;
        List<WPD> value2 = mutableLiveData.getValue();
        if (value2 != null) {
            arrayList = ORZ.LLJILJILJ(value2);
        } else {
            arrayList = new ArrayList<>();
        }
        arrayList.add(wpd);
        mutableLiveData.setValue(arrayList);
    }

    private final boolean isFilterDisableInternal(String str) {
        WPD wpd;
        InterfaceC82284WRc interfaceC82284WRc;
        List<WPD> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<WPD> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    wpd = it.next();
                    if (o.LJ(wpd.LJLIL, str)) {
                        break;
                    }
                } else {
                    wpd = null;
                    break;
                }
            }
            WPD wpd2 = wpd;
            if (wpd2 != null && (interfaceC82284WRc = wpd2.LJLJJI) != null) {
                return interfaceC82284WRc.LIZ();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    private final void removeFilterSourceInternal(String str) {
        ?? r3;
        List<WPD> value = this._filterSources.getValue();
        if (value != null) {
            for (WPD wpd : value) {
                if (o.LJ(wpd.LJLIL, str)) {
                    if (wpd != null) {
                        LiveData liveData = this._filterSources;
                        List list = (List) liveData.getValue();
                        if (list != null) {
                            r3 = new ArrayList();
                            for (Object obj : list) {
                                if (!o.LJ(((WPD) obj).LJLIL, str)) {
                                    r3.add(obj);
                                }
                            }
                        } else {
                            r3 = C61878OQg.INSTANCE;
                        }
                        liveData.setValue(r3);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void syncDataOnFilterChosen(OSZ<? extends FilterBean, WPD> osz) {
        if (!getRecordControlApi().Ue0().LIZ().booleanValue()) {
            getCameraApiComponent().zZ().recordContext.filterLabels.add(osz.getFirst().getEnName());
            getCameraApiComponent().zZ().recordContext.filterIds.add(osz.getFirst().getEnName());
            getCameraApiComponent().zZ().recordContext.filterValues.add(String.valueOf(TMC.LJIJJ(osz.getSecond().LJLJI, osz.getFirst())));
        }
        actualSaveDefaultFilte(osz.getFirst(), osz.getSecond().LJLJJI);
    }

    public void actualApplyFilter2Camera(WRR wrr) {
        if (wrr == null) {
            getCameraApiComponent().setFilter("");
        } else if (wrr.LJLJJI == null) {
            getCameraApiComponent().setFilter(wrr.LJLJI);
        } else {
            getCameraApiComponent().setFilter(wrr.LJLJI, wrr.LJLJJI.floatValue());
        }
    }

    @Override // X.WRP
    public void addFilterSource(WPD source) {
        o.LJIIIZ(source, "source");
        addFilterSourceInternal(source);
    }

    public FilterBean getFilterFromLogicStore(WPD source) {
        Integer valueOf;
        o.LJIIIZ(source, "source");
        InterfaceC82284WRc interfaceC82284WRc = source.LJLJJI;
        Object obj = null;
        if (interfaceC82284WRc instanceof InterfaceC82292WRk) {
            String LIZJ = ((InterfaceC82292WRk) interfaceC82284WRc).LIZJ();
            List list = (List) source.LJLILLLLZI.LJJJJIZL().LIZJ().getValue();
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((FilterBean) next).getResId(), LIZJ)) {
                    obj = next;
                    break;
                }
            }
            return (FilterBean) obj;
        }
        HCA LIZ = getCameraApiComponent().zZ().LIZ();
        if ((LIZ == null || LIZ.isEmpty()) && this.componentConfigure.LIZ) {
            valueOf = Integer.valueOf(CHOOSE_NO_FILTER);
        } else {
            valueOf = Integer.valueOf(interfaceC82284WRc.LIZIZ(getCameraApiComponent().getCameraFacing()));
        }
        List list2 = (List) source.LJLILLLLZI.LJJJJIZL().LIZJ().getValue();
        if (list2 == null) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((FilterBean) next2).getId() == valueOf.intValue()) {
                obj = next2;
                break;
            }
        }
        return (FilterBean) obj;
    }

    @Override // X.WRP
    public boolean isFilterDisable(String filterSourceName) {
        o.LJIIIZ(filterSourceName, "filterSourceName");
        return isFilterDisableInternal(filterSourceName);
    }

    @Override // X.WRP
    public void removeFilterSource(String filterSourceName) {
        o.LJIIIZ(filterSourceName, "filterSourceName");
        removeFilterSourceInternal(filterSourceName);
    }

    @Override // X.WRP
    public void setFilterFromStore(boolean z) {
        setChosenFilterFromStoreInternal$default(this, z, true, false, 4, null);
    }

    private final void applyFilter2Camera(OSZ<? extends FilterBean, WPD> osz, Float f) {
        float LIZ;
        WRR invoke;
        if (osz == null) {
            actualApplyFilter2Camera(null);
            return;
        }
        if (f != null) {
            LIZ = f.floatValue();
        } else {
            LIZ = osz.getSecond().LJLJI.LIZ(osz.getFirst());
        }
        WRR wrr = new WRR(osz.getFirst(), osz.getSecond(), C82238WPi.LIZIZ(osz.getFirst()), Float.valueOf(LIZ));
        InterfaceC88472Yns<WRR, WRR> interfaceC88472Yns = this.filterApplyInterceptor;
        if (interfaceC88472Yns != null && (invoke = interfaceC88472Yns.invoke(wrr)) != null) {
            wrr = invoke;
        }
        actualApplyFilter2Camera(wrr);
    }

    private final void dispatchSwitch(OSZ<? extends FilterBean, WPD> osz, OSZ<? extends FilterBean, WPD> osz2) {
        AqS180S0100000_14 aqS180S0100000_14;
        EnumC46484IMe enumC46484IMe;
        OSZ osz3 = null;
        if (osz != null && osz.getFirst() != null) {
            osz3 = new OSZ(osz.getFirst(), osz.getSecond());
        }
        OSZ osz4 = new OSZ(osz2.getFirst(), osz2.getSecond());
        if (osz3 == null) {
            enumC46484IMe = EnumC46484IMe.RIGHT_TO_LEFT;
        } else {
            if (o.LJ(((WPD) osz3.getSecond()).LJLIL, ((WPD) osz4.getSecond()).LJLIL)) {
                aqS180S0100000_14 = new AqS180S0100000_14((WPD) osz3.getSecond(), 27);
            } else {
                aqS180S0100000_14 = new AqS180S0100000_14(this, 28);
            }
            if (((Number) aqS180S0100000_14.invoke(osz3)).intValue() <= ((Number) aqS180S0100000_14.invoke(osz4)).intValue()) {
                enumC46484IMe = EnumC46484IMe.RIGHT_TO_LEFT;
            } else {
                enumC46484IMe = EnumC46484IMe.LEFT_TO_RIGHT;
            }
        }
        this._filterSwitchEvent.LJII(new WRS(osz3, osz4, enumC46484IMe));
    }

    private final void setFilterDisableInternal(boolean z, String str) {
        String str2;
        InterfaceC82284WRc interfaceC82284WRc;
        WPD value = this._currentFilterSource.getValue();
        WPD wpd = null;
        if (value != null) {
            str2 = value.LJLIL;
        } else {
            str2 = null;
        }
        if (o.LJ(str2, str) && z) {
            cleanFilterChosen();
        }
        List<WPD> value2 = this._filterSources.getValue();
        if (value2 != null) {
            Iterator<WPD> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WPD next = it.next();
                if (o.LJ(next.LJLIL, str)) {
                    wpd = next;
                    break;
                }
            }
            WPD wpd2 = wpd;
            if (wpd2 != null && (interfaceC82284WRc = wpd2.LJLJJI) != null) {
                interfaceC82284WRc.LIZLLL(z);
            }
        }
    }

    private final void setFilterIntensityInternal(FilterBean filterBean, float f) {
        WPD wpd;
        InterfaceC142225i6 interfaceC142225i6;
        List<WPD> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<WPD> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    wpd = it.next();
                    InterfaceC82236WPg interfaceC82236WPg = wpd.LJLILLLLZI;
                    int id = filterBean.getId();
                    String categoryKey = filterBean.getCategoryKey();
                    o.LJIIIIZZ(categoryKey, "filterBean.categoryKey");
                    if (interfaceC82236WPg.LJJJI(id, categoryKey) != null) {
                        break;
                    }
                } else {
                    wpd = null;
                    break;
                }
            }
            WPD wpd2 = wpd;
            if (wpd2 != null && (interfaceC142225i6 = wpd2.LJLJI) != null) {
                interfaceC142225i6.LIZIZ(filterBean, f);
            }
        }
        OSZ<? extends FilterBean, WPD> osz = this.currentFilter;
        if (osz != null && o.LJ(osz.getFirst(), filterBean)) {
            applyFilter2Camera(osz, Float.valueOf(f));
        }
    }

    private final void setFilterProgressInternal(FilterBean filterBean, int i) {
        WPD wpd;
        InterfaceC142225i6 interfaceC142225i6;
        List<WPD> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<WPD> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    wpd = it.next();
                    InterfaceC82236WPg interfaceC82236WPg = wpd.LJLILLLLZI;
                    int id = filterBean.getId();
                    String categoryKey = filterBean.getCategoryKey();
                    o.LJIIIIZZ(categoryKey, "filterBean.categoryKey");
                    if (interfaceC82236WPg.LJJJI(id, categoryKey) != null) {
                        break;
                    }
                } else {
                    wpd = null;
                    break;
                }
            }
            WPD wpd2 = wpd;
            if (wpd2 != null && (interfaceC142225i6 = wpd2.LJLJI) != null) {
                interfaceC142225i6.LIZIZ(filterBean, TML.LJFF(filterBean, i, interfaceC142225i6.LIZJ()));
            }
        }
        OSZ<? extends FilterBean, WPD> osz = this.currentFilter;
        if (osz != null && o.LJ(osz.getFirst(), filterBean)) {
            applyFilter2Camera$default(this, osz, null, 2, null);
        }
    }

    private final void setFilterSourceInternal(String str, boolean z) {
        String str2;
        List<WPD> value;
        boolean z2;
        InterfaceC82236WPg interfaceC82236WPg;
        WPX LJJJJIZL;
        MutableLiveData LIZJ;
        InterfaceC82236WPg interfaceC82236WPg2;
        WPX LJJJJIZL2;
        MutableLiveData LIZJ2;
        WPD value2 = this._currentFilterSource.getValue();
        WPD wpd = null;
        if (value2 != null) {
            str2 = value2.LJLIL;
        } else {
            str2 = null;
        }
        if (!o.LJ(str2, str) && (value = this._filterSources.getValue()) != null) {
            Iterator<WPD> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WPD next = it.next();
                if (o.LJ(next.LJLIL, str)) {
                    wpd = next;
                    break;
                }
            }
            WPD wpd2 = wpd;
            if (wpd2 != null) {
                this._currentFilterSource.setValue(wpd2);
                if (value2 != null && (interfaceC82236WPg2 = value2.LJLILLLLZI) != null && (LJJJJIZL2 = interfaceC82236WPg2.LJJJJIZL()) != null && (LIZJ2 = LJJJJIZL2.LIZJ()) != null) {
                    LIZJ2.removeObserver(this.pendingFilterSetObserver);
                }
                wpd2.LJLILLLLZI.LJJJJIZL().LIZJ().observe(this, this.pendingFilterSetObserver);
                if (value2 != null && (interfaceC82236WPg = value2.LJLILLLLZI) != null && (LJJJJIZL = interfaceC82236WPg.LJJJJIZL()) != null && (LIZJ = LJJJJIZL.LIZJ()) != null) {
                    LIZJ.removeObserver(this.pendingFilterResIdSetObserver);
                }
                wpd2.LJLILLLLZI.LJJJJIZL().LIZJ().observe(this, this.pendingFilterResIdSetObserver);
                if (value2 != null && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setChosenFilterFromStoreInternal$default(this, z2, false, false, 6, null);
            }
        }
    }

    public void actualSaveDefaultFilte(FilterBean filterBean, InterfaceC82284WRc filterLogicStore) {
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(filterLogicStore, "filterLogicStore");
        filterLogicStore.LJ(getCameraApiComponent().getCameraFacing(), filterBean.getId());
    }

    @Override // X.WRP
    public void setFilterDisable(boolean z, String filterSourceName) {
        o.LJIIIZ(filterSourceName, "filterSourceName");
        setFilterDisableInternal(z, filterSourceName);
    }

    @Override // X.WRP
    public void setFilterIntensity(FilterBean filterBean, float f) {
        o.LJIIIZ(filterBean, "filterBean");
        setFilterIntensityInternal(filterBean, f);
    }

    @Override // X.WRP
    public void setFilterProgress(FilterBean filterBean, int i) {
        o.LJIIIZ(filterBean, "filterBean");
        setFilterProgressInternal(filterBean, i);
    }

    @Override // X.WRP
    public void useFilterSource(String filterSourceName, boolean z) {
        o.LJIIIZ(filterSourceName, "filterSourceName");
        setFilterSourceInternal(filterSourceName, z);
    }

    private final void setFilterScrollInternal(FilterBean filterBean, FilterBean filterBean2, float f) {
        WRR invoke;
        WRR invoke2;
        WPD value = this._currentFilterSource.getValue();
        o.LJI(value);
        WPD wpd = value;
        WRR wrr = new WRR(filterBean, wpd, C82238WPi.LIZIZ(filterBean), Float.valueOf(wpd.LJLJI.LIZ(filterBean)));
        InterfaceC88472Yns<WRR, WRR> interfaceC88472Yns = this.filterApplyInterceptor;
        if (interfaceC88472Yns != null && (invoke2 = interfaceC88472Yns.invoke(wrr)) != null) {
            wrr = invoke2;
        }
        WRR wrr2 = new WRR(filterBean2, wpd, C82238WPi.LIZIZ(filterBean2), Float.valueOf(wpd.LJLJI.LIZ(filterBean2)));
        InterfaceC88472Yns<WRR, WRR> interfaceC88472Yns2 = this.filterApplyInterceptor;
        if (interfaceC88472Yns2 != null && (invoke = interfaceC88472Yns2.invoke(wrr2)) != null) {
            wrr2 = invoke;
        }
        actualSetFilterScroll(wrr, wrr2, f);
    }

    public void actualSetFilterScroll(WRR leftFilter, WRR rightFilter, float f) {
        o.LJIIIZ(leftFilter, "leftFilter");
        o.LJIIIZ(rightFilter, "rightFilter");
        getCameraApiComponent().uo(new OSZ<>(leftFilter.LJLJI, leftFilter.LJLJJI), new OSZ<>(rightFilter.LJLJI, rightFilter.LJLJJI), f);
    }

    public void setChosenFilterFromStoreInternal(boolean z, boolean z2, boolean z3) {
        WPD value;
        if (!isCurrentFilterSourceDisable() && (value = this._currentFilterSource.getValue()) != null) {
            FilterBean filterFromLogicStore = getFilterFromLogicStore(value);
            if (filterFromLogicStore != null) {
                setFilterChosenInternal(filterFromLogicStore, null, z, false, z2, z3);
            } else {
                cleanFilterChosen();
            }
        }
    }

    @Override // X.WRP
    public void setFilterScroll(FilterBean leftFilter, FilterBean rightFilter, float f) {
        o.LJIIIZ(leftFilter, "leftFilter");
        o.LJIIIZ(rightFilter, "rightFilter");
        setFilterScrollInternal(leftFilter, rightFilter, f);
    }

    public static /* synthetic */ void applyFilter2Camera$default(WRM wrm, OSZ osz, Float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = null;
            }
            wrm.applyFilter2Camera(osz, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyFilter2Camera");
    }

    public static /* synthetic */ void setFilterSourceInternal$default(WRM wrm, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            wrm.setFilterSourceInternal(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterSourceInternal");
    }

    @Override // X.WRP
    public void setFilterChosen(FilterBean filter, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(filter, "filter");
        setFilterChosenInternal$default(this, filter, str, z, z2, z3, false, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WRM(C82622Wbi diContainer, C29S activity, WRL buildIn, InterfaceC88472Yns<? super WRR, WRR> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super C82285WRd, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(buildIn, "buildIn");
        this.diContainer = diContainer;
        this.activity = activity;
        this.buildIn = buildIn;
        this.filterApplyInterceptor = interfaceC88472Yns;
        this.filterSetupInterceptor = interfaceC65784Pro;
        C82285WRd c82285WRd = new C82285WRd(0);
        this.componentConfigure = c82285WRd;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(c82285WRd);
        }
        this.cameraApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.recordControlApi$delegate = UCI.LJI(getDiContainer(), I3X.class, null);
        this.filterPanelApi$delegate = UCI.LJII(getDiContainer(), THT.class, null);
        C40871j1<FilterBean> c40871j1 = new C40871j1<>(null);
        this._curSelectedFilter = c40871j1;
        MutableLiveData<List<WPD>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(C47261Igj.LJJIJ(buildInFilterSource()));
        this._filterSources = mutableLiveData;
        MutableLiveData<WPD> mutableLiveData2 = new MutableLiveData<>();
        this._currentFilterSource = mutableLiveData2;
        C29901Fi<C44262HYs> c29901Fi = new C29901Fi<>();
        this._filterUpdateEvent = c29901Fi;
        C29901Fi<WRS> c29901Fi2 = new C29901Fi<>();
        this._filterSwitchEvent = c29901Fi2;
        MutableLiveData<C76800UCe> mutableLiveData3 = new MutableLiveData<>();
        this._clearFilterData = mutableLiveData3;
        this.pendingFilterSetObserver = new AObserverS82S0100000_14(this, 6);
        this.pendingFilterResIdSetObserver = new AObserverS82S0100000_14(this, 5);
        this.apiComponent = this;
        this.curSelectedFilter = c40871j1;
        this.currentFilterSource = mutableLiveData2;
        this.filterSources = mutableLiveData;
        this.filterSwitchEvent = c29901Fi2;
        this.filterUpdateEvent = c29901Fi;
        this.clearFilter = mutableLiveData3;
    }

    public static /* synthetic */ void setChosenFilterFromStoreInternal$default(WRM wrm, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            wrm.setChosenFilterFromStoreInternal(z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChosenFilterFromStoreInternal");
    }

    public void setFilterChosenInternal(FilterBean filter, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        o.LJIIIZ(filter, "filter");
        if (isCurrentFilterSourceDisable()) {
            if (z2) {
                WPD value = this._currentFilterSource.getValue();
                if (value != null) {
                    this.apiComponent.setFilterDisable(false, value.LJLIL);
                }
            } else {
                return;
            }
        }
        OSZ<? extends FilterBean, WPD> osz = this.currentFilter;
        if (osz != null) {
            if (o.LJ(osz.getFirst(), filter) && !z3) {
                return;
            }
            if (o.LJ(osz.getFirst(), filter) && z3) {
                z = false;
            }
        }
        WPD value2 = this._currentFilterSource.getValue();
        o.LJI(value2);
        WPD wpd = value2;
        if (!TMC.LJJIII(filter, wpd.LJLILLLLZI)) {
            return;
        }
        OSZ<? extends FilterBean, WPD> osz2 = this.currentFilter;
        filter.setSaveFilter2BeautySequence(!z4);
        if (str == null || str.length() == 0) {
            str2 = "click";
        } else {
            str2 = str;
        }
        filter.setEnterMethod(str2);
        OSZ<? extends FilterBean, WPD> osz3 = new OSZ<>(filter, wpd);
        this.currentFilter = osz3;
        applyFilter2Camera$default(this, osz3, null, 2, null);
        syncDataOnFilterChosen(osz3);
        this._curSelectedFilter.LJI(osz3.getFirst());
        this._filterUpdateEvent.LJII(new C44262HYs(osz3.getFirst(), wpd, z2, str));
        if (z) {
            dispatchSwitch(osz2, osz3);
        }
    }

    public /* synthetic */ WRM(C82622Wbi c82622Wbi, C29S c29s, WRL wrl, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, c29s, wrl, (i & 8) != 0 ? null : interfaceC88472Yns, (i & 16) != 0 ? null : interfaceC65784Pro, (i & 32) == 0 ? interfaceC88472Yns2 : null);
    }

    public static /* synthetic */ void setFilterChosenInternal$default(WRM wrm, FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z3 = false;
            }
            if ((i & 32) != 0) {
                z4 = false;
            }
            wrm.setFilterChosenInternal(filterBean, str, z, z2, z3, z4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterChosenInternal");
    }
}
