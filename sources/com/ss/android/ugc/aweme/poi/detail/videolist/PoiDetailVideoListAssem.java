package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.AbstractC72278SYg;
import X.AnonymousClass391;
import X.C0A2;
import X.C0A5;
import X.C16880lQ;
import X.C186537Tt;
import X.C189037bP;
import X.C190497dl;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C32151Nz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C72808Sho;
import X.C73305Spp;
import X.C77123UOp;
import X.C86V;
import X.C9XU;
import X.EV9;
import X.G27;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.LFH;
import X.O6R;
import X.SYL;
import X.TBR;
import X.TBT;
import Y.IDcS7S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailLoadingFooterCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailVideoListAssem extends PoiDetailBaseAssem implements G27, IPoiDetailVisibilityAbility {
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public float LJLLLL;
    public final C55749LuL LJLLLLLL;
    public ViewGroup LJLZ;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0p;
    }

    public PoiDetailVideoListAssem() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 729));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 730));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 728));
        this.LJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 731));
        this.LJLLLLLL = new C55749LuL(C47704Ins.LIZJ(this, C190497dl.class, "PoiVideoListHierarchyData"), checkSupervisorPrepared());
    }

    public final SYL N3() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    public final C73305Spp P3() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final PoiVideoListSharedViewModel Q3() {
        return (PoiVideoListSharedViewModel) this.LJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility
    public final void la() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-content>(...)");
        ((View) value).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility
    public final void y4() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-content>(...)");
        ((View) value).setVisibility(0);
    }

    public final int O3() {
        int i;
        PoiDetailConfig.PoiDetailVideoListConfig LIZ = PoiDetailConfig.LIZ(Q3().LJLJJL);
        if (LIZ == null || LIZ.poiDetailVideoTwoColumn == 0) {
            i = 3;
        } else {
            i = 2;
        }
        return LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(i, 0);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        Q3().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, IPoiDetailVisibilityAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, IPoiDetailVisibilityAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(IPoiDetailVisibilityAbility.class.getClassLoader(), new Class[]{IPoiDetailVisibilityAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, IPoiDetailVisibilityAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility");
                    }
                }
            }
        }
        SYL N3 = N3();
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        if (C186537Tt.LIZ()) {
            c57939MoZ.LIZJ = PoiDetailLoadingFooterCell.class;
        } else {
            c57939MoZ.LIZJ = LoadingFooterCell.class;
        }
        N3.setListConfig(c57939MoZ);
        final PoiVideoListSharedViewModel Q3 = Q3();
        C72808Sho<InterfaceC57784Mm4> state = N3().getState();
        o.LJIIIIZZ(state, "list.state");
        Q3.setListState(state);
        N3().LJLJLLL((AbstractC72278SYg) new TBR(Q3) { // from class: X.7bL
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        PerfMonitorServiceImpl.LIZ().LJ(N3(), "poi_detail");
        N3().setLifecycleOwner(this);
        PoiDetailConfig.PoiDetailVideoListConfig LIZ2 = PoiDetailConfig.LIZ(Q3().LJLJJL);
        if (LIZ2 == null || LIZ2.poiDetailVideoTwoColumn == 0) {
            N3().LLLF.LJZL(PoiVideoListItemCell.class);
        } else {
            N3().LLLF.LJZL(PoiVideoListItemCellFor2columns.class);
            R3(this, N3(), AnonymousClass391.LIZJ(4), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 10);
        }
        SYL N32 = N3();
        N3().getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(O3());
        gridLayoutManager.LLIILII = new IDcS7S0200000_3(this, gridLayoutManager, 5);
        N32.setLayoutManager(gridLayoutManager);
        N3().LJIIJ(new C0A5() { // from class: X.7dh
            @Override // X.C0A5
            public final void LIZ(RecyclerView rv, MotionEvent e) {
                o.LJIIIZ(rv, "rv");
                o.LJIIIZ(e, "e");
            }

            @Override // X.C0A5
            public final void LIZIZ(boolean z) {
            }

            @Override // X.C0A5
            public final boolean LIZJ(RecyclerView rv, MotionEvent event) {
                o.LJIIIZ(rv, "rv");
                o.LJIIIZ(event, "event");
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        return false;
                    }
                    PoiDetailVideoListAssem poiDetailVideoListAssem = PoiDetailVideoListAssem.this;
                    float y = event.getY();
                    PoiDetailVideoListAssem poiDetailVideoListAssem2 = PoiDetailVideoListAssem.this;
                    poiDetailVideoListAssem.LJLLLL = y - poiDetailVideoListAssem2.LJLLLL;
                    if (poiDetailVideoListAssem2.LJLLLL >= -10.0f) {
                        return false;
                    }
                    PoiListApi.PoiDetailResponse poiDetailResponse = null;
                    IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(poiDetailVideoListAssem2), IPoiDetailInfoVAbility.class, null);
                    if (iPoiDetailInfoVAbility != null) {
                        poiDetailResponse = iPoiDetailInfoVAbility.EO();
                    }
                    LinkedHashMap LIZ3 = C0JU.LIZ("enter_from", "poi_detail");
                    String str = ((C190497dl) poiDetailVideoListAssem2.LJLLLLLL.getValue()).LJLIL;
                    if (str != null) {
                        LIZ3.put("enter_method", str);
                    }
                    String str2 = poiDetailVideoListAssem2.Q3().LJLJJI;
                    if (str2 != null) {
                        LIZ3.put("poi_id", str2);
                    }
                    PoiAnchorData poiAnchorData = ((C190497dl) poiDetailVideoListAssem2.LJLLLLLL.getValue()).LJLJI;
                    if (poiAnchorData != null) {
                        String poiCityCode = poiAnchorData.getPoiCityCode();
                        if (poiCityCode != null) {
                            LIZ3.put("poi_city", poiCityCode);
                        }
                        String poiRegionCode = poiAnchorData.getPoiRegionCode();
                        if (poiRegionCode != null) {
                            LIZ3.put("poi_region_code", poiRegionCode);
                        }
                        String poiInfoSource = poiAnchorData.getPoiInfoSource();
                        if (poiInfoSource != null) {
                            LIZ3.put("poi_info_source", poiInfoSource);
                        }
                        String fromGroupId = poiAnchorData.getFromGroupId();
                        if (fromGroupId != null) {
                            LIZ3.put("group_id", fromGroupId);
                        }
                    }
                    String str3 = ((C190497dl) poiDetailVideoListAssem2.LJLLLLLL.getValue()).LJLJJI;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    LIZ3.put("group_id", str3);
                    String str5 = ((C190497dl) poiDetailVideoListAssem2.LJLLLLLL.getValue()).LJLJJL;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    LIZ3.put("author_id", str4);
                    if (poiDetailResponse != null) {
                        LIZ3.put("poi_detail_type", poiDetailResponse.LJIIJJI());
                        LIZ3.put("is_claimed", poiDetailResponse.LJIIIZ());
                        C43001GuD.LIZJ(poiDetailResponse.collectInfo, LIZ3);
                    }
                    LIZ3.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
                    FMX.LJIIL("poi_detail_slide_up", LIZ3);
                    return false;
                }
                PoiDetailVideoListAssem.this.LJLLLL = event.getY();
                return false;
            }
        });
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LIZLLL2, null);
            PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility = new PoiDetailInfoRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem$initHeaderView$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void fr(PoiListApi.PoiDetailResponse poiDetailResponse, Exception e) {
                    o.LJIIIZ(e, "e");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void RD(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
                    Long l;
                    ViewGroup viewGroup;
                    Long l2;
                    TextView textView;
                    char c;
                    String LJFF;
                    Long l3;
                    PoiDetailVideoListAssem poiDetailVideoListAssem = PoiDetailVideoListAssem.this;
                    ViewGroup viewGroup2 = poiDetailVideoListAssem.LJLZ;
                    if (viewGroup2 != null) {
                        poiDetailVideoListAssem.N3().LJLLILLLL(viewGroup2);
                    }
                    long j = 0;
                    if (poiDetailResponse == null || (l = poiDetailResponse.videoCount) == null || l.longValue() <= 0) {
                        return;
                    }
                    PoiDetailVideoListAssem poiDetailVideoListAssem2 = PoiDetailVideoListAssem.this;
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(poiDetailVideoListAssem2.N3().getContext()), R.layout.bzw, PoiDetailVideoListAssem.this.N3(), false);
                    if (LLLLIILL instanceof ViewGroup) {
                        viewGroup = (ViewGroup) LLLLIILL;
                    } else {
                        viewGroup = null;
                    }
                    poiDetailVideoListAssem2.LJLZ = viewGroup;
                    PoiDetailVideoListAssem.this.N3().LJLJL(0, PoiDetailVideoListAssem.this.LJLZ);
                    C189037bP.LIZ.getClass();
                    if (C189037bP.LIZ() && poiDetailResponse != null && (l2 = poiDetailResponse.videoCount) != null && l2.longValue() > 0) {
                        if (poiDetailResponse != null && (l3 = poiDetailResponse.videoCount) != null) {
                            j = l3.longValue();
                        }
                        ViewGroup viewGroup3 = PoiDetailVideoListAssem.this.LJLZ;
                        if (viewGroup3 != null && (textView = (TextView) viewGroup3.findViewById(R.id.mqa)) != null) {
                            PoiDetailVideoListAssem poiDetailVideoListAssem3 = PoiDetailVideoListAssem.this;
                            poiDetailVideoListAssem3.getClass();
                            PoiDetailConfig.PoiDetailVideoListConfig LIZ3 = PoiDetailConfig.LIZ(poiDetailVideoListAssem3.Q3().LJLJJL);
                            if (LIZ3 == null || LIZ3.poiDetailVideoTwoColumn == 0) {
                                c = 3;
                            } else {
                                c = 2;
                            }
                            if (c == 2) {
                                PoiDetailVideoListAssem.R3(poiDetailVideoListAssem3, textView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, 14);
                            }
                            if (PoiDetailConfig.LIZ(poiDetailVideoListAssem3.Q3().LJLJJL) == null) {
                                int i = (int) j;
                                if (i == 1) {
                                    LJFF = textView.getResources().getQuantityString(R.plurals.qo, 1, C77123UOp.LJJIIJ(j));
                                } else {
                                    LJFF = textView.getResources().getQuantityString(R.plurals.qo, i, C77123UOp.LJJIIJ(j));
                                }
                            } else {
                                LJFF = C86V.LJFF(R.string.ty8);
                            }
                            textView.setText(LJFF);
                        }
                    }
                }
            };
            C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ2, PoiDetailInfoRefreshAbility.class, null);
            if (LIZ3 == null) {
                C55096Ljo.LJIIJJI(LIZJ2, poiDetailInfoRefreshAbility, PoiDetailInfoRefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ3);
                    if (invocationHandler2 instanceof EV9) {
                        ((EV9) invocationHandler2).LIZ.add(poiDetailInfoRefreshAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused2) {
                    EV9 ev92 = new EV9();
                    ev92.LIZ.add(poiDetailInfoRefreshAbility);
                    ev92.LIZ.add(LIZ3);
                    Object newProxyInstance2 = Proxy.newProxyInstance(PoiDetailInfoRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailInfoRefreshAbility.class}, ev92);
                    if (newProxyInstance2 != null) {
                        C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, PoiDetailInfoRefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility");
                    }
                }
            }
        }
        Context context = getContext();
        if (context != null) {
            C9XU.LIZ(context.hashCode(), this);
        }
        AssemViewModel.asyncSubscribe$default(Q3(), new TBT() { // from class: X.7bM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C189027bO c189027bO = (C189027bO) obj;
                c189027bO.getClass();
                return C208708Ha.LIZLLL(c189027bO);
            }
        }, null, new AqS169S0100000_3(this, 709), new AqS153S0100000_3(this, 1507), new AqS169S0100000_3(this, 710), 2, null);
        AssemViewModel.asyncSubscribe$default(Q3(), new TBT() { // from class: X.7bN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C189027bO c189027bO = (C189027bO) obj;
                c189027bO.getClass();
                return C208708Ha.LIZJ(c189027bO);
            }
        }, null, new AqS169S0100000_3(this, 711), null, new AqS169S0100000_3(this, 708), 10, null);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        C0A2 layoutManager = N3().getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
            return;
        }
        gridLayoutManager.LLJLIL(O3());
    }

    public static void R3(PoiDetailVideoListAssem poiDetailVideoListAssem, View view, Integer num, Integer num2, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        poiDetailVideoListAssem.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (num != null) {
                marginLayoutParams.setMarginStart(num.intValue());
            }
            if (num2 != null) {
                marginLayoutParams.setMarginEnd(num2.intValue());
            }
        }
    }
}
