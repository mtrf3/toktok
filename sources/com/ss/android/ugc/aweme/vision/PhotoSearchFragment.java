package com.ss.android.ugc.aweme.vision;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C199097rd;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C51449KHd;
import X.C51450KHe;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC72822Si2;
import X.InterfaceC81599W0t;
import X.KHC;
import X.KHH;
import X.KHV;
import X.KHY;
import X.KHZ;
import X.KLC;
import X.KLD;
import X.KLS;
import X.ORZ;
import Y.AObserverS76S0100000_8;
import Y.AUListenerS96S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.vision.behavior.PhotoSearchBottomSheetBehavior;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PhotoSearchFragment extends AmeBaseFragment implements InterfaceC72822Si2 {
    public FrameLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public FrameLayout LJLJJI;
    public FrameLayout LJLJJL;
    public FrameLayout LJLJJLL;
    public View LJLJL;
    public PhotoSearchViewModel LJLJLJ;
    public PhotoSearchBottomPanelViewModel LJLLJ;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C51449KHd.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(KHY.LJLIL);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C51450KHe.LJLIL);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 365));
    public final AObserverS76S0100000_8 LJLLL = new AObserverS76S0100000_8(this, 74);

    public final PhotoSearchBottomSheetBehavior<FrameLayout> vl() {
        return (PhotoSearchBottomSheetBehavior) this.LJLLILLLL.getValue();
    }

    public final void wl() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        KLC klc;
        if (!((Fragment) this.LJLL.getValue()).isVisible()) {
            return;
        }
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJJI((Fragment) this.LJLL.getValue());
        LIZ.LJII();
        PhotoSearchBackgroundFragment photoSearchBackgroundFragment = (PhotoSearchBackgroundFragment) this.LJLJLLL.getValue();
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 366);
        KHZ khz = photoSearchBackgroundFragment.LJLJI;
        int i4 = 0;
        if (khz != null) {
            khz.setVisibility(0);
        }
        KHZ khz2 = photoSearchBackgroundFragment.LJLJI;
        if (khz2 != null) {
            List<KLC> list = khz2.LLFZ;
            if (list == null || ListProtector.get(list, 0) == null) {
                aqS158S0100000_8.invoke();
            }
            List<KLC> list2 = khz2.LLFZ;
            if (list2 != null && (klc = (KLC) ORZ.LJLLLLLL(0, list2)) != null) {
                khz2.LIZIZ(KLD.LIZLLL(klc), khz2.LJ(klc), new AUListenerS96S0100000_8(khz2, 15), new AUListenerS96S0100000_8(khz2, 14), aqS158S0100000_8, Boolean.TRUE);
            }
        }
        KHZ khz3 = photoSearchBackgroundFragment.LJLJI;
        if (khz3 != null) {
            i = khz3.getCanvasHeight();
        } else {
            i = 0;
        }
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel = photoSearchBackgroundFragment.LJLJJL;
        if (photoSearchBottomPanelViewModel != null) {
            i2 = photoSearchBottomPanelViewModel.LJLJJI;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = null;
        if (i < i2) {
            KLS kls = photoSearchBackgroundFragment.LJLILLLLZI;
            if (kls != null) {
                kls.setCanDrag(false);
            }
            KHZ khz4 = photoSearchBackgroundFragment.LJLJI;
            if (khz4 != null) {
                khz4.setCanDrag(false);
            }
            ViewGroup viewGroup = photoSearchBackgroundFragment.LJLIL;
            if (viewGroup != null) {
                layoutParams2 = viewGroup.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.topMargin = 0;
            }
            ViewGroup viewGroup2 = photoSearchBackgroundFragment.LJLIL;
            if (viewGroup2 != null) {
                layoutParams3 = viewGroup2.getLayoutParams();
            }
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel2 = photoSearchBackgroundFragment.LJLJJL;
            if (photoSearchBottomPanelViewModel2 != null) {
                i3 = photoSearchBottomPanelViewModel2.LJLJJI;
            } else {
                i3 = 0;
            }
            KHZ khz5 = photoSearchBackgroundFragment.LJLJI;
            if (khz5 != null) {
                i4 = khz5.getCanvasHeight();
            }
            layoutParams4.topMargin = (i3 - i4) / 2;
            layoutParams4.gravity = 48;
            ViewGroup viewGroup3 = photoSearchBackgroundFragment.LJLIL;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setLayoutParams(layoutParams4);
            return;
        }
        KLS kls2 = photoSearchBackgroundFragment.LJLILLLLZI;
        if (kls2 != null) {
            kls2.setCanDrag(true);
        }
        KHZ khz6 = photoSearchBackgroundFragment.LJLJI;
        if (khz6 != null) {
            khz6.setCanDrag(true);
        }
        ViewGroup viewGroup4 = photoSearchBackgroundFragment.LJLIL;
        if (viewGroup4 != null) {
            layoutParams = viewGroup4.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = 0;
        }
        ViewGroup viewGroup5 = photoSearchBackgroundFragment.LJLIL;
        if (viewGroup5 != null) {
            layoutParams3 = viewGroup5.getLayoutParams();
        }
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams5.topMargin = 0;
        layoutParams5.gravity = 48;
        ViewGroup viewGroup6 = photoSearchBackgroundFragment.LJLIL;
        if (viewGroup6 == null) {
            return;
        }
        viewGroup6.setLayoutParams(layoutParams5);
    }

    public final void xl() {
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJ((Fragment) this.LJLL.getValue(), "PhotoSearchFragment", R.id.g8a);
        LIZ.LJII();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<InterfaceC81599W0t> mutableLiveData2;
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            PhotoSearchViewModel photoSearchViewModel = this.LJLJLJ;
            if (photoSearchViewModel != null && (mutableLiveData2 = photoSearchViewModel.LJLJI) != null) {
                mutableLiveData2.removeObservers(mo49getActivity);
            }
            PhotoSearchViewModel photoSearchViewModel2 = this.LJLJLJ;
            if (photoSearchViewModel2 != null && (mutableLiveData = photoSearchViewModel2.LJLIL) != null) {
                mutableLiveData.removeObservers(mo49getActivity);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        KHC khc;
        KHH khh;
        TypedByteArray typedByteArray;
        String str;
        PhotoSearchViewModel photoSearchViewModel;
        PhotoSearchToolsEnterParams toolsParams;
        JSONObject jSONObject;
        if (this.mStatusDestroyed) {
            return;
        }
        try {
            if (o.LJ("ttec_photo_search_retry", c199097rd.LJLIL)) {
                PhotoSearchViewModel photoSearchViewModel2 = this.LJLJLJ;
                if (photoSearchViewModel2 != null && (jSONObject = photoSearchViewModel2.LJLJL) != null) {
                    jSONObject.put("search_time", System.currentTimeMillis());
                }
                PhotoSearchViewModel photoSearchViewModel3 = this.LJLJLJ;
                if (photoSearchViewModel3 != null) {
                    photoSearchViewModel3.jv0();
                }
                PhotoSearchViewModel photoSearchViewModel4 = this.LJLJLJ;
                if (photoSearchViewModel4 == null || (khc = photoSearchViewModel4.LJLJJL) == null || (khh = khc.LJIILL) == null || (typedByteArray = khh.LIZ) == null) {
                    return;
                }
                KHH khh2 = new KHH(0);
                khh2.LIZ = typedByteArray;
                khh2.LIZIZ = null;
                khh2.LIZJ = null;
                khh2.LIZLLL = null;
                PhotoSearchEnterParams photoSearchEnterParams = photoSearchViewModel4.LJLILLLLZI;
                if (photoSearchEnterParams == null || (toolsParams = photoSearchEnterParams.getToolsParams()) == null || (str = toolsParams.getSearchSource()) == null) {
                    str = "";
                }
                KHC khc2 = new KHC(str, khh2, null, 1015805);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null && (photoSearchViewModel = this.LJLJLJ) != null) {
                    photoSearchViewModel.iv0(mo49getActivity, khc2);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:1|(1:3)|4|(1:6)|7|(1:108)|9|(1:107)|11|(1:13)|14|(1:106)(1:22)|(3:23|24|(1:26)(1:103))|(2:28|29)|30|(2:31|32)|(1:34)|35|36|37|38|(2:39|40)|41|42|43|44|(3:87|88|89)|46|(1:50)|51|(1:55)|56|(1:86)|58|(1:60)|61|(1:63)|64|(1:66)(4:68|69|70|(2:78|79)(1:80))) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:1|(1:3)|4|(1:6)|7|(1:108)|9|(1:107)|11|(1:13)|14|(1:106)(1:22)|23|24|(1:26)(1:103)|(2:28|29)|30|(2:31|32)|(1:34)|35|36|37|38|(2:39|40)|41|42|43|44|(3:87|88|89)|46|(1:50)|51|(1:55)|56|(1:86)|58|(1:60)|61|(1:63)|64|(1:66)(4:68|69|70|(2:78|79)(1:80))) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0160, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vision.PhotoSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfw, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
