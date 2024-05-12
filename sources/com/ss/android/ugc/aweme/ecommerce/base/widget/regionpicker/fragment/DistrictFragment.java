package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C018905p;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26338AVi;
import X.C27088Ak8;
import X.C27100AkK;
import X.C27354AoQ;
import X.C27356AoS;
import X.C27364Aoa;
import X.C27369Aof;
import X.C27374Aok;
import X.C27376Aom;
import X.C27377Aon;
import X.C27378Aoo;
import X.C27379Aop;
import X.C27380Aoq;
import X.C27381Aor;
import X.C27382Aos;
import X.C27392Ap2;
import X.C27393Ap3;
import X.C27395Ap5;
import X.C27417ApR;
import X.C27430Ape;
import X.C29S;
import X.C32151Nz;
import X.C32I;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C70853RrN;
import X.C70858RrS;
import X.C70907RsF;
import X.C70918RsQ;
import X.C70929Rsb;
import X.C70930Rsc;
import X.C70990Rta;
import X.C70991Rtb;
import X.C71312Rym;
import X.C76800UCe;
import X.C78565UsT;
import X.C78915Uy7;
import X.C78929UyL;
import X.C78946Uyc;
import X.C78948Uye;
import X.C78983UzD;
import X.C78996UzQ;
import X.C79045V0n;
import X.C90903hW;
import X.EnumC27399Ap9;
import X.InterfaceC27330Ao2;
import X.InterfaceC27359AoV;
import X.InterfaceC27469AqH;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.K5S;
import X.K5T;
import X.O6R;
import X.ORS;
import X.ORZ;
import X.OUP;
import X.T5T;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import Y.IDCListenerS373S0100000_4;
import Y.IDHandlerS17S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS15S0202000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS29S0100100_4;
import kotlin.jvm.internal.AqS2S2100100_4;
import kotlin.jvm.internal.AqS3S0101100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictFragment extends ECAnimDowngradeFragment implements InterfaceC27469AqH, InterfaceC27330Ao2, InterfaceC27359AoV<District> {
    public static Boolean LLFZ;
    public KeyBoardVisibilityUtil LJLIL;
    public C27354AoQ<District> LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public District LJLL;
    public List<C27356AoS<District>> LJLLI;
    public C27364Aoa LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC88472Yns<? super List<Region>, C76800UCe> LJLLLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLZ;
    public AbstractC65781Prl LJZ;
    public InterfaceC88472Yns<? super List<Region>, C76800UCe> LJZI;
    public long LJZL;
    public int LL;
    public boolean LLD;
    public C27356AoS<District> LLF;
    public boolean LLFF;
    public long LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 308));
    public final C27369Aof LJLJLJ = new C27369Aof(this);
    public final C27377Aon LJLJLLL = new C27377Aon(this);
    public long LJLLL = System.currentTimeMillis();
    public final IDHandlerS17S0100000_4 LJLLLL = new IDHandlerS17S0100000_4(this, C16880lQ.LLJJJJ(), 1);

    static {
        new C27088Ak8();
    }

    @Override // X.InterfaceC27330Ao2
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLFII;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC27359AoV
    public final void c7() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "select_region";
    }

    public final DistrictVm Al() {
        return (DistrictVm) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZIZ();
    }

    public final void vl() {
        T5T editTextView;
        T5T editTextView2;
        Object obj;
        C27354AoQ<District> c27354AoQ = this.LJLJI;
        if (c27354AoQ != null) {
            c27354AoQ.LIZLLL();
        }
        try {
            Context context = getContext();
            IBinder iBinder = null;
            if (context != null) {
                obj = C16880lQ.LLILL(context, "input_method");
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            View view = getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "DistrictFragment.closeSearchBox");
        }
        C27354AoQ<District> c27354AoQ2 = this.LJLJI;
        if (c27354AoQ2 != null) {
            c27354AoQ2.clearFocus();
        }
        K5T k5t = (K5T) _$_findCachedViewById(R.id.jdg);
        if (k5t != null && (editTextView2 = k5t.getEditTextView()) != null) {
            editTextView2.setText("");
        }
        K5T k5t2 = (K5T) _$_findCachedViewById(R.id.jdg);
        if (k5t2 != null && (editTextView = k5t2.getEditTextView()) != null) {
            editTextView.clearFocus();
        }
    }

    public final InterfaceC88472Yns<List<Region>, C76800UCe> xl() {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLLLLLL;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("onSelect");
        throw null;
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        PopupWindow popupWindow;
        if (!isAdded()) {
            return false;
        }
        if (getChildFragmentManager().LJJJLZIJ()) {
            return true;
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLIL;
        if (keyBoardVisibilityUtil != null) {
            KeyBoardVisibilityUtil.LIZIZ(keyBoardVisibilityUtil);
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil2 = this.LJLIL;
        if (keyBoardVisibilityUtil2 != null) {
            View decorView = keyBoardVisibilityUtil2.LJLIL.getDecorView();
            o.LJIIIIZZ(decorView, "window.decorView");
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int abs = Math.abs(decorView.getBottom() - rect.bottom);
            Resources resources = keyBoardVisibilityUtil2.LJLILLLLZI.getContext().getResources();
            o.LJIIIIZZ(resources, "parentView.context.resources");
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
            Resources resources2 = keyBoardVisibilityUtil2.LJLILLLLZI.getContext().getResources();
            o.LJIIIIZZ(resources2, "parentView.context.resources");
            if (abs <= resources2.getDimensionPixelSize(resources2.getIdentifier("navigation_bar_height", "dimen", "android")) + dimensionPixelSize) {
                keyBoardVisibilityUtil2.LJLJL = abs;
            } else if (abs - keyBoardVisibilityUtil2.LJLJL > 0) {
                KeyBoardVisibilityUtil keyBoardVisibilityUtil3 = this.LJLIL;
                if (keyBoardVisibilityUtil3 != null) {
                    KeyBoardVisibilityUtil.LIZIZ(keyBoardVisibilityUtil3);
                }
                return true;
            }
        }
        C27354AoQ<District> c27354AoQ = this.LJLJI;
        if (c27354AoQ != null && (popupWindow = c27354AoQ.LJLILLLLZI.LJII) != null && popupWindow.isShowing()) {
            C27354AoQ<District> c27354AoQ2 = this.LJLJI;
            if (c27354AoQ2 != null) {
                c27354AoQ2.LJLILLLLZI.LIZ();
            }
            return true;
        }
        List<Fragment> LJJJJLI = getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        int LJJI = C47261Igj.LJJI(LJJJJLI);
        if (LJJI <= 0 || ((ArrayList) Al().LL).size() != 0) {
            return false;
        }
        Al().LJLJJL = LJJI - 1;
        Al().iv0(LJJI, "return");
        getChildFragmentManager().LJJLIIIJJI();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((RecyclerView) _$_findCachedViewById(R.id.kze)).setAdapter(null);
        super.onDestroyView();
        vl();
        this.LJLLLL.removeCallbacksAndMessages(null);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Al().hv0().LIZLLL = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            DistrictVm Al = Al();
            List<Fragment> LJJJJLI = getChildFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
            Al.iv0(C47261Igj.LJJI(LJJJJLI), "close");
        }
    }

    public final void wl() {
        View locateSpinner = _$_findCachedViewById(R.id.g9j);
        o.LJIIIIZZ(locateSpinner, "locateSpinner");
        OUP.LJJLIIIJ(locateSpinner);
        View tvUseCurrentLocation = _$_findCachedViewById(R.id.lyg);
        o.LJIIIIZZ(tvUseCurrentLocation, "tvUseCurrentLocation");
        OUP.LJIJJLI(tvUseCurrentLocation);
        View iconSpinner = _$_findCachedViewById(R.id.eag);
        o.LJIIIIZZ(iconSpinner, "iconSpinner");
        OUP.LJIJJLI(iconSpinner);
        this.LJLLL = System.currentTimeMillis();
        C78996UzQ.LJIIIZ(new C27430Ape(this));
    }

    public static boolean Dl(String str) {
        if (str == null || ujb.o.LJJJJJL(str) || str.length() < 1) {
            return false;
        }
        return true;
    }

    public final void Gl(boolean z) {
        if (z) {
            View fragmentContainer = _$_findCachedViewById(R.id.dm3);
            o.LJIIIIZZ(fragmentContainer, "fragmentContainer");
            OUP.LJJLIIIJ(fragmentContainer);
            View tabs = _$_findCachedViewById(R.id.kze);
            o.LJIIIIZZ(tabs, "tabs");
            OUP.LJJLIIIJ(tabs);
            return;
        }
        View fragmentContainer2 = _$_findCachedViewById(R.id.dm3);
        o.LJIIIIZZ(fragmentContainer2, "fragmentContainer");
        OUP.LJIJJLI(fragmentContainer2);
        View tabs2 = _$_findCachedViewById(R.id.kze);
        o.LJIIIIZZ(tabs2, "tabs");
        OUP.LJIJJLI(tabs2);
    }

    @Override // X.InterfaceC27330Ao2
    public final void Rb(String str) {
        List list;
        List subList = ((ArrayList) Al().LJLILLLLZI).subList(0, getChildFragmentManager().LJJJJLI().size());
        ArrayList arrayList = new ArrayList();
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            String str2 = ((District) it.next()).geoNameId;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        OrderSKUDTO orderSKUDTO = Al().LJLJI;
        if (orderSKUDTO != null) {
            list = C47261Igj.LJJIJ(orderSKUDTO);
        } else {
            list = null;
        }
        C78565UsT.LJJIJIIJIL(this, new C27378Aoo(new RegionRequest(strArr, list, Al().LJLZ, str, null, 16, null), this, str, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS170S0100000_4(this, 329));
    }

    @Override // X.InterfaceC27359AoV
    public final void hg(int i) {
        this.LLFF = false;
        if (this.LLFFF != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LLFFF;
            View view = getView();
            if (view != null) {
                C78946Uyc.LJJIIJ(view, new C70991Rtb(), new AqS3S0101100_4(i, elapsedRealtime, this, 0));
            }
            this.LLFFF = 0L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78929UyL.LJIJI(this);
    }

    public final void Hl(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.jdk);
                if (_$_findCachedViewById != null) {
                    OUP.LJJLIIIJ(_$_findCachedViewById);
                }
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.h1l);
                if (_$_findCachedViewById2 != null) {
                    OUP.LJIJJLI(_$_findCachedViewById2);
                    return;
                }
                return;
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.jdk);
            if (_$_findCachedViewById3 != null) {
                OUP.LJIJJLI(_$_findCachedViewById3);
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.h1l);
            if (_$_findCachedViewById4 == null) {
                return;
            }
            OUP.LJJLIIIJ(_$_findCachedViewById4);
            return;
        }
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.jdk);
        if (_$_findCachedViewById5 != null) {
            OUP.LJIJJLI(_$_findCachedViewById5);
        }
        View _$_findCachedViewById6 = _$_findCachedViewById(R.id.h1l);
        if (_$_findCachedViewById6 != null) {
            OUP.LJIJJLI(_$_findCachedViewById6);
        }
        this.LLFF = false;
        if (this.LLFFF == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LLFFF;
        View view = getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70991Rtb(), new AqS29S0100100_4(elapsedRealtime, this, 5));
        }
        this.LLFFF = 0L;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        Object obj;
        int i;
        View _$_findCachedViewById;
        Integer LJI;
        Window window;
        Integer LJI2;
        LaneParams LJIILJJIL;
        LaneParams LJIILJJIL2;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        o.LJI(arguments);
        String str2 = null;
        C70853RrN.LIZIZ(this, view, null, 2);
        trackFirstScreen(view);
        List<District> list = Al().LJLILLLLZI;
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("current_selected_region_list");
        o.LJI(parcelableArrayList);
        ORS.LJJLIIIJILLIZJL(parcelableArrayList, list);
        Al().LJLIL = arguments.getInt("level_count", Integer.MAX_VALUE);
        Al().LJLJI = (OrderSKUDTO) arguments.getParcelable("order_sku");
        Al().LJZ = arguments.getString("location", Al().LJZ);
        DistrictVm Al = Al();
        Object LJIILJJIL3 = C78948Uye.LJIILJJIL(this, "location");
        if (!(LJIILJJIL3 instanceof String) || (str = (String) LJIILJJIL3) == null) {
            str = Al().LJZ;
        }
        Al.LJZ = str;
        DistrictVm Al2 = Al();
        String string = arguments.getString("district_type");
        if (string != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(string));
        } else {
            num = null;
        }
        Al2.LJLLLLLL = num;
        DistrictVm Al3 = Al();
        String string2 = arguments.getString("search_district_type");
        if (string2 == null) {
            string2 = "2";
        }
        Al3.LJLZ = Integer.valueOf(CastIntegerProtector.parseInt(string2));
        Al().LJZI = Integer.valueOf(arguments.getInt("is_with_delivery_info"));
        Al().LJZL = this.LJLJJLL;
        Al().LJLJLLL = arguments.getBoolean("needSearchBox", false);
        Al().LJLL = arguments.getBoolean("needStandaloneSearch", false);
        Al().LJLLI = arguments.getBoolean("needLocate", false);
        DistrictVm Al4 = Al();
        arguments.getString("country_geo_name_id");
        Al4.getClass();
        this.LJLJJI = arguments.getString("page_info");
        String string3 = arguments.getString("previous_page");
        if (string3 != null && string3.length() != 0) {
            Al().LJLLL = string3;
            Al().LJLLLL = string3;
        }
        DistrictVm Al5 = Al();
        String str3 = this.LJLJJI;
        String str4 = Al().LJZ;
        if (str4 == null) {
            str4 = "unKnown";
        }
        String string4 = arguments.getString("previous_page");
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
        if (LJIILIIL != null && (LJIILJJIL2 = C78948Uye.LJIILJJIL(LJIILIIL, "lib_track_builtin_lane_business")) != null) {
            obj = LJIILJJIL2.get((Object) "entrance_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        Integer num2 = Al().LJZI;
        boolean z = this.LJLJL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC71003Rtn LJIILIIL2 = C78948Uye.LJIILIIL(view);
        if (LJIILIIL2 != null && (LJIILJJIL = C78948Uye.LJIILJJIL(LJIILIIL2, "lib_track_builtin_lane_business")) != null) {
            Object obj2 = LJIILJJIL.get((Object) "biz_type");
            if (obj2 != null) {
                linkedHashMap.put("biz_type", obj2);
            }
            Object obj3 = LJIILJJIL.get((Object) "product_id");
            if (obj3 != null) {
                linkedHashMap.put("product_id", obj3);
            }
            Object obj4 = LJIILJJIL.get((Object) "ttf_page_type");
            if (obj4 != null) {
                linkedHashMap.put("ttf_page_type", obj4);
            }
        }
        C27380Aoq c27380Aoq = new C27380Aoq(str3, str4, str2, string4, num2, z, linkedHashMap);
        Al5.getClass();
        Al5.LJLJL = c27380Aoq;
        Al().LJLLJ = arguments.getBoolean("if_auto_locate", false);
        Al().hv0().LJ = Al().LJLLJ;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l9j);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL(C76800UCe.LIZ);
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 307));
        c235119Kp.LIZLLL(LIZJ);
        Context context = getContext();
        if (context != null && (LJI2 = C79045V0n.LJI(R.attr.cr, context)) != null) {
            i = LJI2.intValue();
        } else {
            i = 0;
        }
        c235119Kp.LIZJ(i);
        c235119Kp.LIZLLL = true;
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLZ;
        if (interfaceC65784Pro != null) {
            LIZJ2.LIZIZ(interfaceC65784Pro);
            abstractC234519IhArr[0] = LIZJ2;
            c235119Kp.LIZIZ(abstractC234519IhArr);
            c252709vu.setNavActions(c235119Kp);
            Al().LJLJJLL.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 7));
            DistrictVm Al6 = Al();
            C27417ApR c27417ApR = new C27417ApR(new AqS170S0100000_4(this, 332));
            Al6.getClass();
            Al6.LJLJJI = c27417ApR;
            C27417ApR gv0 = Al().gv0();
            List LJLJJLL = ORZ.LJLJJLL(Al().LJLILLLLZI, 1);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJLL, 10));
            Iterator it = LJLJJLL.iterator();
            while (it.hasNext()) {
                arrayList.add(((District) it.next()).name);
            }
            gv0.submitList(arrayList);
            Al().LJLJJL = C47261Igj.LJJI(Al().LJLILLLLZI) - 1;
            ((RecyclerView) _$_findCachedViewById(R.id.kze)).setAdapter(Al().gv0());
            boolean LIZ = C27100AkK.LIZ();
            if (LIZ) {
                _$_findCachedViewById = _$_findCachedViewById(R.id.lg2);
            } else {
                _$_findCachedViewById = _$_findCachedViewById(R.id.jdf);
            }
            ViewGroup searchContainer = (ViewGroup) _$_findCachedViewById;
            if (Al().LJLJLLL || LIZ) {
                o.LJIIIIZZ(searchContainer, "searchContainer");
                searchContainer.setVisibility(0);
                Context context2 = getContext();
                if (context2 != null) {
                    C27354AoQ<District> c27354AoQ = new C27354AoQ<>(context2);
                    C26338AVi.LJIIIZ(c27354AoQ, AnonymousClass391.LIZJ(9), AnonymousClass391.LIZJ(9), AnonymousClass391.LIZJ(9), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), 16);
                    c27354AoQ.setBackground(C04270Et.LIZIZ(c27354AoQ.getContext(), R.drawable.acj));
                    c27354AoQ.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    this.LJLJI = c27354AoQ;
                    c27354AoQ.setSearchLenLimit(1);
                    searchContainer.addView(this.LJLJI);
                    if (LIZ) {
                        C27354AoQ<District> c27354AoQ2 = this.LJLJI;
                        if (c27354AoQ2 != null) {
                            c27354AoQ2.LIZJ(this.LJLJLJ);
                        }
                    } else {
                        C27354AoQ<District> c27354AoQ3 = this.LJLJI;
                        if (c27354AoQ3 != null) {
                            c27354AoQ3.LIZJ(this);
                        }
                    }
                    Al().LJLLILLLL.observe(this, new AObserverS72S0100000_4(this, 40));
                    View view2 = getView();
                    if (view2 != null) {
                        C78946Uyc.LJJIIJ(view2, new C70907RsF(), new AqS170S0100000_4(this, 1247));
                    }
                }
            } else {
                o.LJIIIIZZ(searchContainer, "searchContainer");
                searchContainer.setVisibility(8);
            }
            if (Al().LJLLI) {
                View locateDivider = _$_findCachedViewById(R.id.g9h);
                o.LJIIIIZZ(locateDivider, "locateDivider");
                OUP.LJJLIIIJ(locateDivider);
                View locateLayout = _$_findCachedViewById(R.id.g9i);
                o.LJIIIIZZ(locateLayout, "locateLayout");
                OUP.LJJLIIIJ(locateLayout);
            } else {
                View locateDivider2 = _$_findCachedViewById(R.id.g9h);
                o.LJIIIIZZ(locateDivider2, "locateDivider");
                OUP.LJIJJLI(locateDivider2);
                View locateLayout2 = _$_findCachedViewById(R.id.g9i);
                o.LJIIIIZZ(locateLayout2, "locateLayout");
                OUP.LJIJJLI(locateLayout2);
            }
            if (Al().LJLL) {
                View titleBar = _$_findCachedViewById(R.id.l9j);
                o.LJIIIIZZ(titleBar, "titleBar");
                OUP.LJIJJLI(titleBar);
                OUP.LJIJJLI(searchContainer);
                View top_search_box_container = _$_findCachedViewById(R.id.lg2);
                o.LJIIIIZZ(top_search_box_container, "top_search_box_container");
                OUP.LJIJJLI(top_search_box_container);
                View seach_box_container = _$_findCachedViewById(R.id.jdf);
                o.LJIIIIZZ(seach_box_container, "seach_box_container");
                OUP.LJIJJLI(seach_box_container);
                View searchBar = _$_findCachedViewById(R.id.jdg);
                o.LJIIIIZZ(searchBar, "searchBar");
                OUP.LJJLIIIJ(searchBar);
                Al().LJLLILLLL.observe(this, new AObserverS72S0100000_4(this, 41));
                if (C78996UzQ.LJJIIJ()) {
                    wl();
                }
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.kze).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                C018905p c018905p = (C018905p) layoutParams;
                c018905p.topToBottom = _$_findCachedViewById(R.id.g9i).getId();
                _$_findCachedViewById(R.id.kze).setLayoutParams(c018905p);
                ((K5T) _$_findCachedViewById(R.id.jdg)).setOnClickClearListener(new ACListenerS24S0100000_4(this, 274));
                View view3 = getView();
                if (view3 != null) {
                    C78946Uyc.LJJIIJ(view3, new C70918RsQ(0), C27392Ap2.LJLIL);
                }
            } else {
                View titleBar2 = _$_findCachedViewById(R.id.l9j);
                o.LJIIIIZZ(titleBar2, "titleBar");
                OUP.LJJLIIIJ(titleBar2);
                OUP.LJJLIIIJ(searchContainer);
                View searchBar2 = _$_findCachedViewById(R.id.jdg);
                o.LJIIIIZZ(searchBar2, "searchBar");
                OUP.LJIJJLI(searchBar2);
                View locateDivider3 = _$_findCachedViewById(R.id.g9h);
                o.LJIIIIZZ(locateDivider3, "locateDivider");
                OUP.LJIJJLI(locateDivider3);
                View locateLayout3 = _$_findCachedViewById(R.id.g9i);
                o.LJIIIIZZ(locateLayout3, "locateLayout");
                OUP.LJIJJLI(locateLayout3);
            }
            getChildFragmentManager().LJ(new C27382Aos(this));
            C78565UsT.LJJIJIIJIL(this, new C27374Aok(this, null));
            _$_findCachedViewById(R.id.bcq).setClickable(true);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                Lifecycle lifecycle = getLifecycle();
                o.LJIIIIZZ(lifecycle, "lifecycle");
                this.LJLIL = new KeyBoardVisibilityUtil(lifecycle, window, view, null, new AqS186S0100000_4(this, 94));
            }
            ((C27393Ap3) _$_findCachedViewById(R.id.dm3)).setOnInterceptTouchEventListener(new C27395Ap5(this));
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 333);
            View iconLocate = _$_findCachedViewById(R.id.eaa);
            o.LJIIIIZZ(iconLocate, "iconLocate");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 49, 42), iconLocate);
            View tvLocate = _$_findCachedViewById(R.id.lwq);
            o.LJIIIIZZ(tvLocate, "tvLocate");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 50, 42), tvLocate);
            View iconSpinner = _$_findCachedViewById(R.id.eag);
            o.LJIIIIZZ(iconSpinner, "iconSpinner");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 51, 42), iconSpinner);
            View tvUseCurrentLocation = _$_findCachedViewById(R.id.lyg);
            o.LJIIIIZZ(tvUseCurrentLocation, "tvUseCurrentLocation");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 10), tvUseCurrentLocation);
            K5T k5t = (K5T) _$_findCachedViewById(R.id.jdg);
            K5S k5s = new K5S();
            k5s.LIZJ(EnumC27399Ap9.SECONDARY);
            k5s.LIZ(R.raw.icon_arrow_left_ltr);
            k5s.LIZIZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)));
            AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4(this, 1254);
            k5s.LJFF = new ACListenerS24S0100000_4(aqS170S0100000_42, 212);
            TuxIconView tuxIconView = k5s.LJII;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(aqS170S0100000_42, 213));
            }
            k5t.setStartAction(k5s);
            ((K5T) _$_findCachedViewById(R.id.jdg)).getEditTextView().addTextChangedListener(new C27381Aor(this));
            ((K5T) _$_findCachedViewById(R.id.jdg)).getEditTextView().setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 6));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.jdk);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            _$_findCachedViewById(R.id.jdk).setVerticalScrollBarEnabled(false);
            Context context3 = getContext();
            if (context3 != null && (LJI = C79045V0n.LJI(R.attr.dz, context3)) != null) {
                ((RecyclerView) _$_findCachedViewById(R.id.jdk)).LJII(new C71312Rym(0.0f, LJI.intValue(), 6, 0), -1);
            }
            C27364Aoa c27364Aoa = new C27364Aoa();
            this.LJLLILLLL = c27364Aoa;
            c27364Aoa.LJLJI = new C27379Aop(this);
            ((RecyclerView) _$_findCachedViewById(R.id.jdk)).setAdapter(this.LJLLILLLL);
            return;
        }
        o.LJIJI("onCloseClick");
        throw null;
    }

    @Override // X.InterfaceC27330Ao2
    public final void eh(View target, String str, boolean z) {
        int i;
        String str2;
        o.LJIIIZ(target, "target");
        int i2 = 0;
        if (z) {
            if (str != null) {
                i2 = str.length();
            }
            this.LL = i2;
            this.LJZL = SystemClock.elapsedRealtime();
            View view = getView();
            if (view != null) {
                C78946Uyc.LJJIIJ(view, new C70929Rsb(), new AqS170S0100000_4(this, 1255));
                return;
            }
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJZL;
        if (str != null) {
            i = str.length();
        } else {
            i = -this.LL;
        }
        if (i > 0) {
            str2 = "add";
        } else if (i < 0) {
            str2 = "del";
        } else {
            str2 = "";
        }
        View view2 = getView();
        if (view2 != null) {
            C78946Uyc.LJJIIJ(view2, new C70930Rsc(), new AqS2S2100100_4(elapsedRealtime, str2, str, this, 2));
        }
        this.LLD = false;
    }

    @Override // X.InterfaceC27359AoV
    public final void ke(C27356AoS<District> result, int i, int i2) {
        List<District> list;
        District district;
        List<District> list2;
        String str;
        List<District> list3;
        District district2;
        o.LJIIIZ(result, "result");
        this.LLD = true;
        this.LLF = result;
        View view = getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70990Rta(), new AqS15S0202000_4(i, i2, (int) this, (DistrictFragment) result, (C27356AoS<District>) 0));
        }
        List<Fragment> LJJJJLI = getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        int LJJI = C47261Igj.LJJI(LJJJJLI);
        if (LJJI >= ((ArrayList) Al().LJLILLLLZI).size()) {
            return;
        }
        if (result.LIZ.multilevelDistricts != null) {
            int i3 = LJJI + 1;
            if (((ArrayList) Al().LJLILLLLZI).size() > i3) {
                ((ArrayList) Al().LJLILLLLZI).subList(i3, ((ArrayList) Al().LJLILLLLZI).size()).clear();
            }
            Object obj = ListProtector.get(Al().LJLILLLLZI, 0);
            ((ArrayList) Al().LJLILLLLZI).clear();
            ((ArrayList) Al().LJLILLLLZI).add(obj);
            List<District> list4 = result.LIZ.multilevelDistricts;
            if (list4 != null) {
                for (District district3 : list4) {
                    ORZ.LLILLL(Al().LJLILLLLZI, 1);
                    ((ArrayList) Al().LJLILLLLZI).add(district3);
                }
            }
            List<District> LJLJJLL = ORZ.LJLJJLL(Al().LJLILLLLZI, 1);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJLL, 10));
            for (District district4 : LJLJJLL) {
                arrayList.add(new Region(district4.name, district4.geoNameId, district4.code, null, district4.longitude, district4.latitude, 8, null));
            }
            DistrictData districtData = ((District) ListProtector.get(Al().LJLILLLLZI, LJJI)).response;
            xl().invoke(arrayList);
            C27380Aoq hv0 = Al().hv0();
            if (districtData != null && (list3 = districtData.districts) != null && (district2 = (District) ORZ.LJLLLLLL(0, list3)) != null) {
                str = district2.districtKey;
            } else {
                str = null;
            }
            hv0.LIZ("save", str);
            vl();
            return;
        }
        Object obj2 = ListProtector.get(getChildFragmentManager().LJJJJLI(), LJJI);
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage");
        DistrictPage districtPage = (DistrictPage) obj2;
        DistrictData districtData2 = ((District) ListProtector.get(Al().LJLILLLLZI, LJJI)).response;
        if (districtData2 != null && (list2 = districtData2.districts) != null) {
            int i4 = 0;
            for (District district5 : list2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    if (o.LJ(district5.geoNameId, result.LIZ.geoNameId)) {
                        districtPage.vl(i4);
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        int i6 = LJJI + 1;
        if (((ArrayList) Al().LJLILLLLZI).size() <= i6) {
            ((ArrayList) Al().LJLILLLLZI).add(result.LIZ);
        } else if (!o.LJ(((District) ListProtector.get(Al().LJLILLLLZI, i6)).geoNameId, result.LIZ.geoNameId)) {
            ((ArrayList) Al().LJLILLLLZI).subList(i6, ((ArrayList) Al().LJLILLLLZI).size()).clear();
            ((ArrayList) Al().LJLILLLLZI).add(result.LIZ);
        }
        List<District> LJLJJLL2 = ORZ.LJLJJLL(Al().LJLILLLLZI, 1);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLJJLL2, 10));
        for (District district6 : LJLJJLL2) {
            arrayList2.add(new Region(district6.name, district6.geoNameId, district6.code, null, district6.longitude, district6.latitude, 8, null));
        }
        DistrictData districtData3 = ((District) ListProtector.get(Al().LJLILLLLZI, LJJI)).response;
        if (districtData3 != null && o.LJ(districtData3.hasNextLevel, Boolean.TRUE) && LJJI < Al().LJLIL) {
            C27417ApR gv0 = Al().gv0();
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Region) it.next()).name);
            }
            gv0.submitList(arrayList3);
            C27417ApR gv02 = Al().gv0();
            if (arrayList2.size() <= i6) {
                i6 = -1;
            }
            gv02.LJZ(i6);
            C78565UsT.LJJIJIIJIL(this, new C27376Aom(this, LJJI, null));
        } else {
            String str2 = null;
            xl().invoke(arrayList2);
            C27380Aoq hv02 = Al().hv0();
            if (districtData3 != null && (list = districtData3.districts) != null && (district = (District) ORZ.LJLLLLLL(0, list)) != null) {
                str2 = district.districtKey;
            }
            hv02.LIZ("save", str2);
        }
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (viewGroup != null) {
            view = OUP.LJIL(R.layout.yn, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
