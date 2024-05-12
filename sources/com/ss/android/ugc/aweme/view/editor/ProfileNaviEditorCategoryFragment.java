package com.ss.android.ugc.aweme.view.editor;

import X.C188727au;
import X.C72549Sdd;
import X.C72556Sdk;
import X.C72576Se4;
import X.C72582SeA;
import X.C72583SeB;
import X.C72587SeF;
import X.C72593SeL;
import X.C72604SeW;
import X.C72693Sfx;
import X.FMX;
import X.HW1;
import X.InterfaceC72575Se3;
import X.InterfaceC72578Se6;
import X.InterfaceC72580Se8;
import X.InterfaceC72603SeV;
import X.InterfaceC72696Sg0;
import X.KNV;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviEditorCategoryFragment extends ProfileNaviViewPagerFragment implements InterfaceC72578Se6 {
    public static final /* synthetic */ int LJLJJLL = 0;
    public InterfaceC72603SeV LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.i80);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.i80)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final int getLayout() {
        return R.layout.c6w;
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final void wl() {
        RecyclerView recyclerView;
        if (this.LJLJJI == null) {
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.i80);
        if (recyclerView2 != null) {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        vl().getClass();
        C72582SeA c72582SeA = C72593SeL.LIZIZ;
        if (c72582SeA == null || (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.i80)) == null) {
            return;
        }
        InterfaceC72603SeV interfaceC72603SeV = this.LJLJJI;
        o.LJI(interfaceC72603SeV);
        recyclerView.setAdapter(new C72576Se4(c72582SeA, interfaceC72603SeV, this));
    }

    @Override // X.InterfaceC72578Se6
    public final void LJJL(InterfaceC72575Se3 selectable) {
        String str;
        C72556Sdk c72556Sdk;
        o.LJIIIZ(selectable, "selectable");
        String key = selectable.getKey();
        InterfaceC72603SeV interfaceC72603SeV = this.LJLJJI;
        String str2 = null;
        if (interfaceC72603SeV != null) {
            str = interfaceC72603SeV.getKey();
        } else {
            str = null;
        }
        String key2 = selectable.LIZ().getKey();
        C72549Sdd LIZIZ = selectable.LIZ().LIZIZ();
        if (LIZIZ != null && (c72556Sdk = LIZIZ.LIZIZ) != null) {
            str2 = c72556Sdk.LIZ;
        }
        C72604SeW.LIZLLL(key, str, key2, str2);
        ProfileNaviEditorViewModel vl = vl();
        vl.getClass();
        if (selectable instanceof InterfaceC72696Sg0) {
            InterfaceC72696Sg0 Nv0 = ProfileNaviEditorViewModel.Nv0(selectable.LIZ());
            if (Nv0 == null || !o.LJ(Nv0.getKey(), selectable.getKey())) {
                InterfaceC72696Sg0 interfaceC72696Sg0 = (InterfaceC72696Sg0) selectable;
                InterfaceC72696Sg0 Nv02 = ProfileNaviEditorViewModel.Nv0(interfaceC72696Sg0.LIZ());
                if (Nv02 == null || !o.LJ(Nv02.getKey(), interfaceC72696Sg0.getKey())) {
                    String categoryKey = ProfileNaviEditorViewModel.Mv0(interfaceC72696Sg0.LIZ());
                    C72582SeA c72582SeA = C72593SeL.LIZIZ;
                    if (c72582SeA != null) {
                        o.LJIIIZ(categoryKey, "categoryKey");
                        c72582SeA.LIZJ.put(categoryKey, interfaceC72696Sg0);
                    }
                    if (Nv02 != null) {
                        vl.setStateImmediate(new AqS178S0100000_12(Nv02, 410));
                    }
                    HW1.LIZ(0, interfaceC72696Sg0.LIZJ(), new AqS174S0200000_12(interfaceC72696Sg0, vl, 18));
                }
                vl.setState(C72693Sfx.LJLIL);
                return;
            }
            return;
        }
        if (!(selectable instanceof C72587SeF)) {
            return;
        }
        C72582SeA c72582SeA2 = C72593SeL.LIZIZ;
        if (c72582SeA2 != null) {
            String categoryKey2 = selectable.LIZ().getKey();
            o.LJIIIZ(categoryKey2, "categoryKey");
            c72582SeA2.LIZLLL.put(categoryKey2, selectable);
        }
        vl.setState(new AqS178S0100000_12(selectable, 412));
    }

    @Override // X.InterfaceC72578Se6
    public final void LJLIL(InterfaceC72575Se3 selectable, int i) {
        o.LJIIIZ(selectable, "selectable");
        String str = null;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            InterfaceC72580Se8 category = selectable.LIZ();
            o.LJIIIZ(category, "category");
            InterfaceC72603SeV interfaceC72603SeV = this.LJLJJI;
            if (interfaceC72603SeV != null) {
                str = interfaceC72603SeV.getKey();
            }
            String key = category.getKey();
            C188727au LIZLLL = KNV.LIZLLL(key, "category");
            LIZLLL.LJIIIZ("item_tab", str);
            LIZLLL.LJIIIZ("item_subcategory", key);
            FMX.LJIIL("click_avatar_flip", LIZLLL.LIZ);
            ProfileNaviEditorViewModel vl = vl();
            vl.getClass();
            if (category.LIZLLL() == null) {
                return;
            }
            C72583SeB LIZLLL2 = category.LIZLLL();
            o.LJI(LIZLLL2);
            if (LIZLLL2.LIZIZ == 0) {
                C72583SeB LIZLLL3 = category.LIZLLL();
                o.LJI(LIZLLL3);
                LIZLLL3.LIZIZ = 1;
            } else {
                C72583SeB LIZLLL4 = category.LIZLLL();
                o.LJI(LIZLLL4);
                LIZLLL4.LIZIZ = 0;
            }
            vl.setStateImmediate(new AqS178S0100000_12(category, 402));
            return;
        }
        InterfaceC72580Se8 category2 = selectable.LIZ();
        o.LJIIIZ(category2, "category");
        InterfaceC72603SeV interfaceC72603SeV2 = this.LJLJJI;
        if (interfaceC72603SeV2 != null) {
            str = interfaceC72603SeV2.getKey();
        }
        String key2 = category2.getKey();
        C188727au LIZLLL5 = KNV.LIZLLL(key2, "category");
        LIZLLL5.LJIIIZ("item_tab", str);
        LIZLLL5.LJIIIZ("item_subcategory", key2);
        FMX.LJIIL("click_edit_avatar_detail", LIZLLL5.LIZ);
        ProfileNaviEditorViewModel vl2 = vl();
        vl2.getClass();
        vl2.setState(new AqS178S0100000_12(category2, 397));
    }

    @Override // X.InterfaceC72578Se6
    public final void Sh(InterfaceC72580Se8 category, C72556Sdk c72556Sdk) {
        String str;
        o.LJIIIZ(category, "category");
        vl().getClass();
        InterfaceC72696Sg0 Nv0 = ProfileNaviEditorViewModel.Nv0(category);
        String str2 = null;
        if (Nv0 != null) {
            str = Nv0.getKey();
        } else {
            str = null;
        }
        InterfaceC72603SeV interfaceC72603SeV = this.LJLJJI;
        if (interfaceC72603SeV != null) {
            str2 = interfaceC72603SeV.getKey();
        }
        C72604SeW.LIZLLL(str, str2, category.getKey(), c72556Sdk.LIZ);
        ProfileNaviEditorViewModel vl = vl();
        vl.getClass();
        if (c72556Sdk.LIZ == null || category.LIZIZ() == null) {
            return;
        }
        C72549Sdd LIZIZ = category.LIZIZ();
        o.LJI(LIZIZ);
        LIZIZ.LIZIZ = c72556Sdk;
        vl.setStateImmediate(new AqS178S0100000_12(c72556Sdk, 395));
    }
}
